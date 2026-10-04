package n5;

import io.ktor.http.LinkHeader;
import o5.C1706f;

/* renamed from: n5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1581s extends AbstractC1580q implements Z {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1580q f13409n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1586x f13410o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1581s(AbstractC1580q abstractC1580q, AbstractC1586x abstractC1586x) {
        super(abstractC1580q.f13407l, abstractC1580q.f13408m);
        kotlin.jvm.internal.l.f("origin", abstractC1580q);
        kotlin.jvm.internal.l.f("enhancement", abstractC1586x);
        this.f13409n = abstractC1580q;
        this.f13410o = abstractC1586x;
    }

    @Override // n5.AbstractC1580q
    public final B A0() {
        return this.f13409n.A0();
    }

    @Override // n5.AbstractC1580q
    public final String B0(Y4.h hVar, Y4.h hVar2) {
        kotlin.jvm.internal.l.f("renderer", hVar);
        Y4.l lVar = hVar2.a;
        lVar.getClass();
        return ((Boolean) lVar.f10218m.getValue(lVar, Y4.l.f10184Y[11])).booleanValue() ? hVar.U(this.f13410o) : this.f13409n.B0(hVar, hVar2);
    }

    @Override // n5.Z
    public final a0 j0() {
        return this.f13409n;
    }

    @Override // n5.Z
    public final AbstractC1586x q() {
        return this.f13410o;
    }

    @Override // n5.AbstractC1580q
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f13410o + ")] " + this.f13409n;
    }

    @Override // n5.AbstractC1586x
    /* renamed from: v0 */
    public final AbstractC1586x y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        AbstractC1580q abstractC1580q = this.f13409n;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1580q);
        AbstractC1586x abstractC1586x = this.f13410o;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
        return new C1581s(abstractC1580q, abstractC1586x);
    }

    @Override // n5.a0
    public final a0 x0(boolean z7) {
        return AbstractC1566c.H(this.f13409n.x0(z7), this.f13410o.w0().x0(z7));
    }

    @Override // n5.a0
    public final a0 y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        AbstractC1580q abstractC1580q = this.f13409n;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1580q);
        AbstractC1586x abstractC1586x = this.f13410o;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
        return new C1581s(abstractC1580q, abstractC1586x);
    }

    @Override // n5.a0
    public final a0 z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return AbstractC1566c.H(this.f13409n.z0(i7), this.f13410o);
    }
}
