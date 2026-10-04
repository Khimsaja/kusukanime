package n5;

/* renamed from: n5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1578o extends T {

    /* renamed from: b, reason: collision with root package name */
    public final T f13405b;

    /* renamed from: c, reason: collision with root package name */
    public final T f13406c;

    public C1578o(T t7, T t8) {
        this.f13405b = t7;
        this.f13406c = t8;
    }

    @Override // n5.T
    public final boolean a() {
        return this.f13405b.a() || this.f13406c.a();
    }

    @Override // n5.T
    public final boolean b() {
        return this.f13405b.b() || this.f13406c.b();
    }

    @Override // n5.T
    public final v4.h c(v4.h hVar) {
        kotlin.jvm.internal.l.f("annotations", hVar);
        return this.f13406c.c(this.f13405b.c(hVar));
    }

    @Override // n5.T
    public final Q d(AbstractC1586x abstractC1586x) {
        Q qD = this.f13405b.d(abstractC1586x);
        return qD == null ? this.f13406c.d(abstractC1586x) : qD;
    }

    @Override // n5.T
    public final AbstractC1586x f(AbstractC1586x abstractC1586x, b0 b0Var) {
        kotlin.jvm.internal.l.f("topLevelType", abstractC1586x);
        kotlin.jvm.internal.l.f("position", b0Var);
        return this.f13406c.f(this.f13405b.f(abstractC1586x, b0Var), b0Var);
    }
}
