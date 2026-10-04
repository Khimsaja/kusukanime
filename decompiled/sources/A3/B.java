package A3;

import H5.D;
import H5.u0;
import K5.N;
import K5.Y;
import android.content.Context;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class B extends O {

    /* renamed from: b, reason: collision with root package name */
    public final Y f118b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f119c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f120d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f121e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f122f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f123g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f124h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f125i;

    /* renamed from: j, reason: collision with root package name */
    public final Y f126j;

    /* renamed from: k, reason: collision with root package name */
    public final Y f127k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f128l;

    /* renamed from: m, reason: collision with root package name */
    public final Y f129m;

    /* renamed from: n, reason: collision with root package name */
    public Context f130n;

    /* renamed from: o, reason: collision with root package name */
    public u0 f131o;

    public B() {
        Y yB = N.b("");
        this.f118b = yB;
        this.f119c = yB;
        P3.y yVar = P3.y.f7779k;
        Y yB2 = N.b(yVar);
        this.f120d = yB2;
        this.f121e = yB2;
        Y yB3 = N.b(Boolean.FALSE);
        this.f122f = yB3;
        this.f123g = yB3;
        Y yB4 = N.b(yVar);
        this.f124h = yB4;
        this.f125i = yB4;
        Y yB5 = N.b(null);
        this.f126j = yB5;
        this.f127k = yB5;
        Y yB6 = N.b(yVar);
        this.f128l = yB6;
        this.f129m = yB6;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(A3.B r12, java.lang.String r13, U3.c r14) throws java.lang.Throwable {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof A3.A
            if (r0 == 0) goto L17
            r0 = r14
            A3.A r0 = (A3.A) r0
            int r1 = r0.f117n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f117n = r1
        L15:
            r4 = r0
            goto L1d
        L17:
            A3.A r0 = new A3.A
            r0.<init>(r12, r14)
            goto L15
        L1d:
            java.lang.Object r14 = r4.f115l
            T3.a r0 = T3.a.f9048k
            int r1 = r4.f117n
            O3.C r7 = O3.C.a
            K5.Y r8 = r12.f120d
            K5.Y r9 = r12.f126j
            K5.Y r10 = r12.f122f
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L42
            if (r1 != r2) goto L3a
            K5.Y r12 = r4.f114k
            P3.r.Y(r14)     // Catch: java.lang.Exception -> L37
            goto L6b
        L37:
            r0 = move-exception
            r12 = r0
            goto L75
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L42:
            P3.r.Y(r14)
            android.content.Context r12 = r12.f130n
            if (r12 != 0) goto L4a
            goto L93
        L4a:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r10.getClass()
            r10.i(r11, r14)
            r9.h(r11)
            com.kusukanime.data.ApiClient r14 = com.kusukanime.data.ApiClient.INSTANCE     // Catch: java.lang.Exception -> L37
            com.kusukanime.data.KusuApi r1 = r14.get(r12)     // Catch: java.lang.Exception -> L37
            r4.f114k = r8     // Catch: java.lang.Exception -> L37
            r4.f117n = r2     // Catch: java.lang.Exception -> L37
            r6 = 0
            r3 = 0
            r5 = 2
            r2 = r13
            java.lang.Object r14 = com.kusukanime.data.KusuApi.searchSuggest$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L37
            if (r14 != r0) goto L6a
            return r0
        L6a:
            r12 = r8
        L6b:
            com.kusukanime.data.ApiEnvelope r14 = (com.kusukanime.data.ApiEnvelope) r14     // Catch: java.lang.Exception -> L37
            java.lang.Object r13 = r14.getData()     // Catch: java.lang.Exception -> L37
            r12.h(r13)     // Catch: java.lang.Exception -> L37
            goto L8b
        L75:
            java.lang.String r12 = r12.getMessage()
            if (r12 != 0) goto L7d
            java.lang.String r12 = "gagal memuat"
        L7d:
            r9.getClass()
            r9.i(r11, r12)
            P3.y r12 = P3.y.f7779k
            r8.getClass()
            r8.i(r11, r12)
        L8b:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r10.getClass()
            r10.i(r11, r12)
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.B.e(A3.B, java.lang.String, U3.c):java.lang.Object");
    }

    public final void f(String str) {
        kotlin.jvm.internal.l.f("q", str);
        Y y7 = this.f118b;
        y7.getClass();
        y7.i(null, str);
        u0 u0Var = this.f131o;
        if (u0Var != null) {
            u0Var.e(null);
        }
        String string = AbstractC2510o.J0(str).toString();
        if (string.length() >= 2) {
            this.f131o = D.x(J.h(this), null, new z(this, string, null), 3);
            return;
        }
        P3.y yVar = P3.y.f7779k;
        Y y8 = this.f120d;
        y8.getClass();
        y8.i(null, yVar);
        Boolean bool = Boolean.FALSE;
        Y y9 = this.f122f;
        y9.getClass();
        y9.i(null, bool);
        this.f126j.h(null);
    }
}
