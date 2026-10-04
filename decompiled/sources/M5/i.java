package M5;

import H5.D;
import L.C0425v1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class i {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6589k = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6590l = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6591m = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean a(i iVar, int i7) {
        while (true) {
            i iVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6590l;
            if (iVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    iVarD = (i) obj;
                    if (!iVarD.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarD);
                }
            }
            if (iVarD instanceof h) {
                return (((h) iVarD).f6588n & i7) == 0 && iVarD.a(iVar, i7);
            }
            atomicReferenceFieldUpdater.set(iVar, iVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6589k;
            atomicReferenceFieldUpdater2.set(iVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(iVarD, this, iVar)) {
                if (atomicReferenceFieldUpdater2.get(iVarD) != this) {
                    break;
                }
            }
            iVar.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((M5.n) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M5.i d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = M5.i.f6590l
            java.lang.Object r1 = r0.get(r9)
            M5.i r1 = (M5.i) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = M5.i.f6589k
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof M5.n
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            M5.n r6 = (M5.n) r6
            M5.i r6 = r6.a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            M5.i r3 = (M5.i) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.l.d(r4, r6)
            r4 = r6
            M5.i r4 = (M5.i) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.i.d():M5.i");
    }

    public final void f(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6590l;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f6589k.get(this) != iVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                    break;
                }
            }
            if (h()) {
                iVar.d();
                return;
            }
            return;
        }
    }

    public final i g() {
        i iVar;
        Object obj = f6589k.get(this);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null && (iVar = nVar.a) != null) {
            return iVar;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
        return (i) obj;
    }

    public boolean h() {
        return f6589k.get(this) instanceof n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i7 = 2;
        sb.append(new C0425v1(1, i7, D.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(D.p(this));
        return sb.toString();
    }
}
