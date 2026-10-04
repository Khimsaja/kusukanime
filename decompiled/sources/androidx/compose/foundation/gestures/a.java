package androidx.compose.foundation.gestures;

import a0.q;
import q.e0;
import s.C1915g0;
import s.C1917h0;
import s.C1919i0;
import s.EnumC1903a0;
import s.InterfaceC1910e;
import s.InterfaceC1946w0;
import s.X;
import u.k;

/* loaded from: classes.dex */
public abstract class a {
    public static final C1917h0 a = new C1917h0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1915g0 f10576b = new C1915g0();

    /* renamed from: c, reason: collision with root package name */
    public static final C1919i0 f10577c = new C1919i0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(s.D0 r10, long r11, U3.c r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof s.C1921j0
            if (r0 == 0) goto L13
            r0 = r13
            s.j0 r0 = (s.C1921j0) r0
            int r1 = r0.f15317n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15317n = r1
            goto L18
        L13:
            s.j0 r0 = new s.j0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f15316m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15317n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.u r10 = r0.f15315l
            s.D0 r11 = r0.f15314k
            P3.r.Y(r13)
            r8 = r10
            r10 = r11
            goto L55
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            P3.r.Y(r13)
            kotlin.jvm.internal.u r8 = new kotlin.jvm.internal.u
            r8.<init>()
            q.X r13 = q.X.f14513k
            s.k0 r4 = new s.k0
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.f15314k = r5
            r0.f15315l = r8
            r0.f15317n = r3
            java.lang.Object r10 = r5.e(r13, r4, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r10 = r5
        L55:
            float r11 = r8.f12717k
            long r10 = r10.g(r11)
            g0.c r12 = new g0.c
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(s.D0, long, U3.c):java.lang.Object");
    }

    public static final q b(q qVar, InterfaceC1946w0 interfaceC1946w0, EnumC1903a0 enumC1903a0, e0 e0Var, boolean z7, boolean z8, X x7, k kVar, InterfaceC1910e interfaceC1910e) {
        return qVar.k(new ScrollableElement(e0Var, interfaceC1910e, x7, enumC1903a0, interfaceC1946w0, kVar, z7, z8));
    }
}
