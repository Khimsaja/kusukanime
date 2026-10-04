package o4;

import A4.AbstractC0011d;
import X4.C0617n;
import java.util.Collection;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class X extends AbstractC1654H {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f13667n = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Class f13668l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f13669m;

    public X(Class cls) {
        kotlin.jvm.internal.l.f("jClass", cls);
        this.f13668l = cls;
        this.f13669m = z1.c.B(O3.j.f7525k, new C1665T(this, 0));
    }

    @Override // kotlin.jvm.internal.InterfaceC1404d
    public final Class d() {
        return this.f13668l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            return kotlin.jvm.internal.l.a(this.f13668l, ((X) obj).f13668l);
        }
        return false;
    }

    @Override // o4.AbstractC1654H
    public final Collection h() {
        return P3.y.f7779k;
    }

    public final int hashCode() {
        return this.f13668l.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.AbstractC1654H
    public final Collection p(W4.e eVar) {
        W w7 = (W) this.f13669m.getValue();
        w7.getClass();
        InterfaceC1443v interfaceC1443v = W.f13662g[1];
        Object objInvoke = w7.f13664d.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return ((g5.o) objInvoke).f(eVar, C4.c.f960l);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [O3.i, java.lang.Object] */
    @Override // o4.AbstractC1654H
    public final u4.K q(int i7) {
        O3.r rVar = (O3.r) ((W) this.f13669m.getValue()).f13666f.getValue();
        if (rVar == null) {
            return null;
        }
        V4.f fVar = (V4.f) rVar.f7538k;
        R4.F f5 = (R4.F) rVar.f7539l;
        T4.f fVar2 = (T4.f) rVar.f7540m;
        C0617n c0617n = U4.j.f9310n;
        kotlin.jvm.internal.l.e("packageLocalVariable", c0617n);
        R4.J j7 = (R4.J) android.support.v4.media.session.b.x(f5, c0617n, i7);
        if (j7 == null) {
            return null;
        }
        R4.a0 a0Var = f5.f8159q;
        kotlin.jvm.internal.l.e("getTypeTable(...)", a0Var);
        return (u4.K) F0.f(this.f13668l, j7, fVar, new T4.i(a0Var), fVar2, C1696v.f13763m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [O3.i, java.lang.Object] */
    @Override // o4.AbstractC1654H
    public final Class s() {
        Class cls = (Class) ((W) this.f13669m.getValue()).f13665e.getValue();
        return cls == null ? this.f13668l : cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.AbstractC1654H
    public final Collection t(W4.e eVar) {
        W w7 = (W) this.f13669m.getValue();
        w7.getClass();
        InterfaceC1443v interfaceC1443v = W.f13662g[1];
        Object objInvoke = w7.f13664d.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return ((g5.o) objInvoke).a(eVar, C4.c.f960l);
    }

    public final String toString() {
        return "file class " + AbstractC0011d.a(this.f13668l).a();
    }
}
