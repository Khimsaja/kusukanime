package n5;

import f6.AbstractC0905c;
import io.ktor.http.LinkHeader;
import o5.C1706f;

/* loaded from: classes.dex */
public final class r extends AbstractC1580q implements InterfaceC1573j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(B b4, B b7) {
        super(b4, b7);
        kotlin.jvm.internal.l.f("lowerBound", b4);
        kotlin.jvm.internal.l.f("upperBound", b7);
    }

    @Override // n5.AbstractC1580q
    public final B A0() {
        return this.f13407l;
    }

    @Override // n5.AbstractC1580q
    public final String B0(Y4.h hVar, Y4.h hVar2) {
        kotlin.jvm.internal.l.f("renderer", hVar);
        boolean zL = hVar2.a.l();
        B b4 = this.f13408m;
        B b7 = this.f13407l;
        if (!zL) {
            return hVar.C(hVar.U(b7), hVar.U(b4), AbstractC0905c.n(this));
        }
        return "(" + hVar.U(b7) + ".." + hVar.U(b4) + ')';
    }

    @Override // n5.InterfaceC1573j
    public final boolean S() {
        B b4 = this.f13407l;
        return (b4.t0().f() instanceof u4.Q) && kotlin.jvm.internal.l.a(b4.t0(), this.f13408m.t0());
    }

    @Override // n5.InterfaceC1573j
    public final a0 f(AbstractC1586x abstractC1586x) {
        a0 a0VarF;
        kotlin.jvm.internal.l.f("replacement", abstractC1586x);
        a0 a0VarW0 = abstractC1586x.w0();
        if (a0VarW0 instanceof AbstractC1580q) {
            a0VarF = a0VarW0;
        } else {
            if (!(a0VarW0 instanceof B)) {
                throw new D6.r();
            }
            B b4 = (B) a0VarW0;
            a0VarF = AbstractC1566c.f(b4, b4.x0(true));
        }
        return AbstractC1566c.i(a0VarF, a0VarW0);
    }

    @Override // n5.AbstractC1580q
    public final String toString() {
        return "(" + this.f13407l + ".." + this.f13408m + ')';
    }

    @Override // n5.AbstractC1586x
    /* renamed from: v0 */
    public final AbstractC1586x y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        B b4 = this.f13407l;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, b4);
        B b7 = this.f13408m;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, b7);
        return new r(b4, b7);
    }

    @Override // n5.a0
    public final a0 x0(boolean z7) {
        return AbstractC1566c.f(this.f13407l.x0(z7), this.f13408m.x0(z7));
    }

    @Override // n5.a0
    public final a0 y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        B b4 = this.f13407l;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, b4);
        B b7 = this.f13408m;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, b7);
        return new r(b4, b7);
    }

    @Override // n5.a0
    public final a0 z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return AbstractC1566c.f(this.f13407l.z0(i7), this.f13408m.z0(i7));
    }
}
