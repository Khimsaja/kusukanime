package S5;

import java.util.concurrent.atomic.AtomicReferenceArray;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class k {
    public static final j a = new j(new byte[0], 0, 0, null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f8807b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8808c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8809d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8810e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceArray f8811f;

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceArray f8812g;

    static {
        int iIntValue;
        int i7 = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8807b = iHighestOneBit;
        int i8 = iHighestOneBit / 2;
        int i9 = i8 >= 1 ? i8 : 1;
        f8808c = i9;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", kotlin.jvm.internal.l.a(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        kotlin.jvm.internal.l.e("getProperty(...)", property);
        Integer numU = AbstractC2517v.U(property);
        if (numU != null && (iIntValue = numU.intValue()) >= 0) {
            i7 = iIntValue;
        }
        f8809d = i7;
        int i10 = i7 / i9;
        if (i10 < 8192) {
            i10 = 8192;
        }
        f8810e = i10;
        f8811f = new AtomicReferenceArray(iHighestOneBit);
        f8812g = new AtomicReferenceArray(i9);
    }

    public static final void a(j jVar) {
        kotlin.jvm.internal.l.f("segment", jVar);
        if (jVar.f8805f != null || jVar.f8806g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p pVar = jVar.f8803d;
        if (pVar != null) {
            i iVar = (i) pVar;
            if (iVar.f8800b != 0) {
                int iDecrementAndGet = i.f8799c.decrementAndGet(iVar);
                if (iDecrementAndGet >= 0) {
                    return;
                }
                if (iDecrementAndGet != -1) {
                    throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
                }
                iVar.f8800b = 0;
            }
        }
        AtomicReferenceArray atomicReferenceArray = f8811f;
        int id = (int) ((f8807b - 1) & Thread.currentThread().getId());
        jVar.f8801b = 0;
        jVar.f8804e = true;
        while (true) {
            j jVar2 = (j) atomicReferenceArray.get(id);
            j jVar3 = a;
            if (jVar2 != jVar3) {
                int i7 = jVar2 != null ? jVar2.f8802c : 0;
                if (i7 < 65536) {
                    jVar.f8805f = jVar2;
                    jVar.f8802c = i7 + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, jVar2, jVar)) {
                        if (atomicReferenceArray.get(id) != jVar2) {
                            break;
                        }
                    }
                    return;
                }
                if (f8809d <= 0) {
                    return;
                }
                jVar.f8801b = 0;
                jVar.f8804e = true;
                int id2 = (int) ((f8808c - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = f8812g;
                int i8 = 0;
                while (true) {
                    j jVar4 = (j) atomicReferenceArray2.get(id2);
                    if (jVar4 != jVar3) {
                        int i9 = (jVar4 != null ? jVar4.f8802c : 0) + 8192;
                        if (i9 <= f8810e) {
                            jVar.f8805f = jVar4;
                            jVar.f8802c = i9;
                            while (!atomicReferenceArray2.compareAndSet(id2, jVar4, jVar)) {
                                if (atomicReferenceArray2.get(id2) != jVar4) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i10 = f8808c;
                        if (i8 >= i10) {
                            return;
                        }
                        i8++;
                        id2 = (id2 + 1) & (i10 - 1);
                    }
                }
            }
        }
    }

    public static final j b() {
        j jVar;
        j jVar2;
        AtomicReferenceArray atomicReferenceArray = f8811f;
        int id = (int) ((f8807b - 1) & Thread.currentThread().getId());
        do {
            jVar = a;
            jVar2 = (j) atomicReferenceArray.getAndSet(id, jVar);
        } while (kotlin.jvm.internal.l.a(jVar2, jVar));
        if (jVar2 != null) {
            atomicReferenceArray.set(id, jVar2.f8805f);
            jVar2.f8805f = null;
            jVar2.f8802c = 0;
            return jVar2;
        }
        atomicReferenceArray.set(id, null);
        if (f8809d <= 0) {
            return new j();
        }
        AtomicReferenceArray atomicReferenceArray2 = f8812g;
        int i7 = f8808c;
        int id2 = (int) (Thread.currentThread().getId() & (i7 - 1));
        int i8 = 0;
        while (true) {
            j jVar3 = (j) atomicReferenceArray2.getAndSet(id2, jVar);
            if (!kotlin.jvm.internal.l.a(jVar3, jVar)) {
                if (jVar3 != null) {
                    atomicReferenceArray2.set(id2, jVar3.f8805f);
                    jVar3.f8805f = null;
                    jVar3.f8802c = 0;
                    return jVar3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i8 >= i7) {
                    return new j();
                }
                id2 = (id2 + 1) & (i7 - 1);
                i8++;
            }
        }
    }
}
