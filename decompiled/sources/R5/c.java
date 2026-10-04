package R5;

import F2.G;
import H5.D;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c extends h implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8664h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = R5.c.f8664h;
        r3 = r0.f8663l;
        r2.set(r3, null);
        r2 = new I5.d(2, r3, r0);
        r0 = r0.f8662k;
        r0.z(r1, r0.f3813m, new A3.g(3, r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(S3.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.d()
            O3.C r1 = O3.C.a
            if (r0 == 0) goto L9
            goto L51
        L9:
            S3.c r7 = P3.r.E(r7)
            H5.k r7 = H5.D.r(r7)
            R5.b r0 = new R5.b     // Catch: java.lang.Throwable -> L52
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L52
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = R5.h.f8671g     // Catch: java.lang.Throwable -> L52
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L52
            int r3 = r6.a     // Catch: java.lang.Throwable -> L52
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = R5.c.f8664h     // Catch: java.lang.Throwable -> L52
            R5.c r3 = r0.f8663l     // Catch: java.lang.Throwable -> L52
            r4 = 0
            r2.set(r3, r4)     // Catch: java.lang.Throwable -> L52
            I5.d r2 = new I5.d     // Catch: java.lang.Throwable -> L52
            r4 = 2
            r2.<init>(r4, r3, r0)     // Catch: java.lang.Throwable -> L52
            H5.k r0 = r0.f8662k     // Catch: java.lang.Throwable -> L52
            int r3 = r0.f3813m     // Catch: java.lang.Throwable -> L52
            A3.g r4 = new A3.g     // Catch: java.lang.Throwable -> L52
            r5 = 3
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L52
            r0.z(r1, r3, r4)     // Catch: java.lang.Throwable -> L52
            goto L44
        L3e:
            boolean r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L16
        L44:
            java.lang.Object r7 = r7.q()
            T3.a r0 = T3.a.f9048k
            if (r7 != r0) goto L4d
            goto L4e
        L4d:
            r7 = r1
        L4e:
            if (r7 != r0) goto L51
            return r7
        L51:
            return r1
        L52:
            r0 = move-exception
            r7.y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.c.c(S3.c):java.lang.Object");
    }

    public final boolean d() {
        int i7;
        char c2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f8671g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = this.a;
            if (i8 > i9) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > i9) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i9));
            } else {
                if (i8 <= 0) {
                    c2 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    f8664h.set(this, null);
                    c2 = 0;
                    break;
                }
            }
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f8671g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8664h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            G g4 = d.a;
            if (obj2 != g4) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, g4)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(D.p(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f8671g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f8664h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
