package w6;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class E {
    public static final D a = new D(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f17122b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f17123c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f17122b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i7 = 0; i7 < iHighestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f17123c = atomicReferenceArr;
    }

    public static final void a(D d4) {
        kotlin.jvm.internal.l.f("segment", d4);
        if (d4.f17120f != null || d4.f17121g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (d4.f17118d) {
            return;
        }
        AtomicReference atomicReference = f17123c[(int) (Thread.currentThread().getId() & (f17122b - 1))];
        D d6 = a;
        D d7 = (D) atomicReference.getAndSet(d6);
        if (d7 == d6) {
            return;
        }
        int i7 = d7 != null ? d7.f17117c : 0;
        if (i7 >= 65536) {
            atomicReference.set(d7);
            return;
        }
        d4.f17120f = d7;
        d4.f17116b = 0;
        d4.f17117c = i7 + 8192;
        atomicReference.set(d4);
    }

    public static final D b() {
        AtomicReference atomicReference = f17123c[(int) (Thread.currentThread().getId() & (f17122b - 1))];
        D d4 = a;
        D d6 = (D) atomicReference.getAndSet(d4);
        if (d6 == d4) {
            return new D();
        }
        if (d6 == null) {
            atomicReference.set(null);
            return new D();
        }
        atomicReference.set(d6.f17120f);
        d6.f17120f = null;
        d6.f17117c = 0;
        return d6;
    }
}
