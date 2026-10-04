package androidx.compose.material3.internal;

import M.C0446d;
import M.C0460s;
import O3.C;
import U3.j;
import a0.q;
import e4.n;
import q.X;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e4.InterfaceC0821a r4, e4.n r5, U3.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof M.C0447e
            if (r0 == 0) goto L13
            r0 = r6
            M.e r0 = (M.C0447e) r0
            int r1 = r0.f6290l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6290l = r1
            goto L18
        L13:
            M.e r0 = new M.e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6289k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f6290l
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)     // Catch: M.C0445c -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P3.r.Y(r6)
            M.h r6 = new M.h     // Catch: M.C0445c -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: M.C0445c -> L41
            r0.f6290l = r3     // Catch: M.C0445c -> L41
            java.lang.Object r4 = H5.D.j(r6, r0)     // Catch: M.C0445c -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            O3.C r4 = O3.C.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.a.a(e4.a, e4.n, U3.c):java.lang.Object");
    }

    public static final Object b(C0460s c0460s, Object obj, float f5, j jVar) throws Throwable {
        Object objA = c0460s.a(obj, X.f14513k, new C0446d(c0460s, f5, null), jVar);
        return objA == T3.a.f9048k ? objA : C.a;
    }

    public static final q c(q qVar, C0460s c0460s, n nVar) {
        return qVar.k(new DraggableAnchorsElement(c0460s, nVar));
    }
}
