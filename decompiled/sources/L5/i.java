package L5;

import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import O3.C;

/* loaded from: classes.dex */
public abstract class i extends g {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0329h f6175n;

    public i(InterfaceC0329h interfaceC0329h, S3.h hVar, int i7, J5.c cVar) {
        super(hVar, i7, cVar);
        this.f6175n = interfaceC0329h;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    @Override // L5.g, K5.InterfaceC0329h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(K5.InterfaceC0330i r6, S3.c r7) {
        /*
            r5 = this;
            O3.C r0 = O3.C.a
            int r1 = r5.f6170l
            r2 = -3
            if (r1 != r2) goto L71
            S3.h r1 = r7.getContext()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            A3.a r3 = new A3.a
            r4 = 14
            r3.<init>(r4)
            S3.h r4 = r5.f6169k
            java.lang.Object r2 = r4.fold(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L27
            S3.h r2 = r1.plus(r4)
            goto L2c
        L27:
            r2 = 0
            S3.h r2 = H5.D.n(r1, r4, r2)
        L2c:
            boolean r3 = kotlin.jvm.internal.l.a(r2, r1)
            if (r3 == 0) goto L3b
            java.lang.Object r6 = r5.h(r6, r7)
            T3.a r7 = T3.a.f9048k
            if (r6 != r7) goto L7a
            return r6
        L3b:
            S3.d r3 = S3.d.f8766k
            S3.f r4 = r2.get(r3)
            S3.f r1 = r1.get(r3)
            boolean r1 = kotlin.jvm.internal.l.a(r4, r1)
            if (r1 == 0) goto L71
            S3.h r1 = r7.getContext()
            boolean r3 = r6 instanceof L5.w
            if (r3 != 0) goto L5e
            boolean r3 = r6 instanceof L5.s
            if (r3 == 0) goto L58
            goto L5e
        L58:
            K5.f r3 = new K5.f
            r3.<init>(r6, r1)
            r6 = r3
        L5e:
            L5.h r1 = new L5.h
            r3 = 0
            r1.<init>(r5, r3)
            java.lang.Object r3 = M5.a.m(r2)
            java.lang.Object r6 = L5.c.a(r2, r6, r3, r1, r7)
            T3.a r7 = T3.a.f9048k
            if (r6 != r7) goto L7a
            return r6
        L71:
            java.lang.Object r6 = super.collect(r6, r7)
            T3.a r7 = T3.a.f9048k
            if (r6 != r7) goto L7a
            return r6
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.i.collect(K5.i, S3.c):java.lang.Object");
    }

    @Override // L5.g
    public final Object d(J5.t tVar, S3.c cVar) {
        Object objH = h(new w(tVar), cVar);
        return objH == T3.a.f9048k ? objH : C.a;
    }

    public abstract Object h(InterfaceC0330i interfaceC0330i, S3.c cVar);

    @Override // L5.g
    public final String toString() {
        return this.f6175n + " -> " + super.toString();
    }
}
