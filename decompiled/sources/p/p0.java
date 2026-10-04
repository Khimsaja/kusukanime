package p;

import O.C0486d;
import O.C0493g0;

/* loaded from: classes.dex */
public final class p0 {
    public final B0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C0493g0 f14090b = C0486d.K(null, O.T.f7049p);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f14091c;

    public p0(u0 u0Var, B0 b02, String str) {
        this.f14091c = u0Var;
        this.a = b02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o0 a(e4.k kVar, e4.k kVar2) {
        C0493g0 c0493g0 = this.f14090b;
        o0 o0Var = (o0) c0493g0.getValue();
        u0 u0Var = this.f14091c;
        if (o0Var == null) {
            Object objInvoke = kVar2.invoke(u0Var.a.v0());
            Object objInvoke2 = kVar2.invoke(u0Var.a.v0());
            B0 b02 = this.a;
            AbstractC1766r abstractC1766r = (AbstractC1766r) b02.a.invoke(objInvoke2);
            abstractC1766r.d();
            s0 s0Var = new s0(u0Var, objInvoke, abstractC1766r, b02);
            o0Var = new o0(this, s0Var, kVar, kVar2);
            c0493g0.setValue(o0Var);
            u0Var.f14141i.add(s0Var);
        }
        o0Var.f14086m = (kotlin.jvm.internal.m) kVar2;
        o0Var.f14085l = (kotlin.jvm.internal.m) kVar;
        o0Var.a(u0Var.f());
        return o0Var;
    }
}
