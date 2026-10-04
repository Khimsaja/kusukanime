package p;

import O.R0;

/* loaded from: classes.dex */
public final class o0 implements R0 {

    /* renamed from: k, reason: collision with root package name */
    public final s0 f14084k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.m f14085l;

    /* renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.m f14086m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p0 f14087n;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(p0 p0Var, s0 s0Var, e4.k kVar, e4.k kVar2) {
        this.f14087n = p0Var;
        this.f14084k = s0Var;
        this.f14085l = (kotlin.jvm.internal.m) kVar;
        this.f14086m = (kotlin.jvm.internal.m) kVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v4, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [e4.k, kotlin.jvm.internal.m] */
    public final void a(q0 q0Var) {
        Object objInvoke = this.f14086m.invoke(q0Var.c());
        boolean zG = this.f14087n.f14091c.g();
        s0 s0Var = this.f14084k;
        if (zG) {
            s0Var.g(this.f14086m.invoke(q0Var.a()), objInvoke, (InterfaceC1715B) this.f14085l.invoke(q0Var));
        } else {
            s0Var.h(objInvoke, (InterfaceC1715B) this.f14085l.invoke(q0Var));
        }
    }

    @Override // O.R0
    public final Object getValue() {
        a(this.f14087n.f14091c.f());
        return this.f14084k.f14105t.getValue();
    }
}
