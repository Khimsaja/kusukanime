package z0;

import O.C0522v0;
import android.view.View;
import androidx.lifecycle.InterfaceC0694v;

/* loaded from: classes.dex */
public final class g1 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18756k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f18757l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18758m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0522v0 f18759n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0694v f18760o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h1 f18761p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f18762q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(kotlin.jvm.internal.x xVar, C0522v0 c0522v0, InterfaceC0694v interfaceC0694v, h1 h1Var, View view, S3.c cVar) {
        super(2, cVar);
        this.f18758m = xVar;
        this.f18759n = c0522v0;
        this.f18760o = interfaceC0694v;
        this.f18761p = h1Var;
        this.f18762q = view;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        g1 g1Var = new g1(this.f18758m, this.f18759n, this.f18760o, this.f18761p, this.f18762q, cVar);
        g1Var.f18757l = obj;
        return g1Var;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r11.f18756k
            androidx.lifecycle.v r2 = r11.f18760o
            O3.C r3 = O3.C.a
            r4 = 0
            z0.h1 r5 = r11.f18761p
            r6 = 1
            if (r1 == 0) goto L24
            if (r1 != r6) goto L1c
            java.lang.Object r0 = r11.f18757l
            H5.f0 r0 = (H5.InterfaceC0265f0) r0
            P3.r.Y(r12)     // Catch: java.lang.Throwable -> L19
            goto L89
        L19:
            r12 = move-exception
            goto L9c
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            P3.r.Y(r12)
            java.lang.Object r12 = r11.f18757l
            H5.A r12 = (H5.A) r12
            kotlin.jvm.internal.x r1 = r11.f18758m     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.f12720k     // Catch: java.lang.Throwable -> L5b
            z0.y0 r1 = (z0.C2480y0) r1     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5e
            android.view.View r7 = r11.f18762q     // Catch: java.lang.Throwable -> L5b
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.Throwable -> L5b
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L5b
            K5.W r7 = z0.k1.a(r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r8 = r7.getValue()     // Catch: java.lang.Throwable -> L5b
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L5b
            float r8 = r8.floatValue()     // Catch: java.lang.Throwable -> L5b
            O.c0 r9 = r1.f18943k     // Catch: java.lang.Throwable -> L5b
            r9.g(r8)     // Catch: java.lang.Throwable -> L5b
            z0.f1 r8 = new z0.f1     // Catch: java.lang.Throwable -> L5b
            r8.<init>(r7, r1, r4)     // Catch: java.lang.Throwable -> L5b
            r1 = 3
            H5.u0 r12 = H5.D.x(r12, r4, r8, r1)     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r12 = move-exception
            r0 = r4
            goto L9c
        L5e:
            r12 = r4
        L5f:
            O.v0 r1 = r11.f18759n     // Catch: java.lang.Throwable -> L9a
            r11.f18757l = r12     // Catch: java.lang.Throwable -> L9a
            r11.f18756k = r6     // Catch: java.lang.Throwable -> L9a
            O.u0 r6 = new O.u0     // Catch: java.lang.Throwable -> L9a
            r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L9a
            S3.h r7 = r11.getContext()     // Catch: java.lang.Throwable -> L9a
            O.U r7 = O.C0486d.F(r7)     // Catch: java.lang.Throwable -> L9a
            O.s0 r8 = new O.s0     // Catch: java.lang.Throwable -> L9a
            r8.<init>(r1, r6, r7, r4)     // Catch: java.lang.Throwable -> L9a
            O.g r1 = r1.a     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r1 = H5.D.G(r1, r8, r11)     // Catch: java.lang.Throwable -> L9a
            if (r1 != r0) goto L80
            goto L81
        L80:
            r1 = r3
        L81:
            if (r1 != r0) goto L84
            goto L85
        L84:
            r1 = r3
        L85:
            if (r1 != r0) goto L88
            return r0
        L88:
            r0 = r12
        L89:
            if (r0 == 0) goto L8e
            r0.e(r4)
        L8e:
            androidx.lifecycle.q r12 = r2.f()
            r12.c(r5)
            return r3
        L96:
            r10 = r0
            r0 = r12
            r12 = r10
            goto L9c
        L9a:
            r0 = move-exception
            goto L96
        L9c:
            if (r0 == 0) goto La1
            r0.e(r4)
        La1:
            androidx.lifecycle.q r0 = r2.f()
            r0.c(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
