package J5;

import O3.C;
import kotlin.jvm.internal.y;
import v.c0;

/* loaded from: classes.dex */
public final class r extends e {

    /* renamed from: u, reason: collision with root package name */
    public final c f4345u;

    public r(int i7, c cVar) {
        super(i7);
        this.f4345u = cVar;
        if (cVar != c.f4299k) {
            if (i7 < 1) {
                throw new IllegalArgumentException(c0.a(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + y.a.b(e.class).n() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            J5.c r1 = J5.c.f4301m
            O3.C r8 = O3.C.a
            J5.c r2 = r15.f4345u
            if (r2 != r1) goto L17
            java.lang.Object r1 = super.mo2trySendJP2dKIU(r16)
            boolean r2 = r1 instanceof J5.l
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof J5.k
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            F2.G r6 = J5.g.f4319d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = J5.e.f4310p
            java.lang.Object r1 = r1.get(r15)
            J5.n r1 = (J5.n) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = J5.e.f4306l
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.q(r2, r7)
            int r9 = J5.g.f4317b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f6600c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            J5.n r2 = J5.e.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.n()
            J5.k r2 = new J5.k
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = J5.e.d(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.b()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = J5.e.f4307m
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.b()
        L7e:
            java.lang.Throwable r1 = r15.n()
            J5.k r2 = new J5.k
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.i()
            java.lang.Throwable r1 = r15.n()
            J5.k r2 = new J5.k
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof H5.E0
            if (r3 == 0) goto La6
            H5.E0 r6 = (H5.E0) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f6600c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.i(r3)
        Lb6:
            return r8
        Lb7:
            r1.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.r.B(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // J5.e
    public final boolean r() {
        return this.f4345u == c.f4300l;
    }

    @Override // J5.e, J5.v
    public final Object send(Object obj, S3.c cVar) throws Throwable {
        if (B(obj, true) instanceof k) {
            throw n();
        }
        return C.a;
    }

    @Override // J5.e, J5.v
    /* renamed from: trySend-JP2dKIU */
    public final Object mo2trySendJP2dKIU(Object obj) {
        return B(obj, false);
    }
}
