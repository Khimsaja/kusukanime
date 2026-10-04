package androidx.compose.animation;

import a0.p;
import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import o.C1592D;
import o.C1593E;
import o.C1594F;
import o.C1625w;
import p.p0;
import p.u0;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Ly0/S;", "Lo/D;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class EnterExitTransitionElement extends S {
    public final u0 a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f10540b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f10541c;

    /* renamed from: d, reason: collision with root package name */
    public final C1593E f10542d;

    /* renamed from: e, reason: collision with root package name */
    public final C1594F f10543e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0821a f10544f;

    /* renamed from: g, reason: collision with root package name */
    public final C1625w f10545g;

    public EnterExitTransitionElement(u0 u0Var, p0 p0Var, p0 p0Var2, C1593E c1593e, C1594F c1594f, InterfaceC0821a interfaceC0821a, C1625w c1625w) {
        this.a = u0Var;
        this.f10540b = p0Var;
        this.f10541c = p0Var2;
        this.f10542d = c1593e;
        this.f10543e = c1594f;
        this.f10544f = interfaceC0821a;
        this.f10545g = c1625w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.a.equals(enterExitTransitionElement.a) && l.a(this.f10540b, enterExitTransitionElement.f10540b) && l.a(this.f10541c, enterExitTransitionElement.f10541c) && this.f10542d.equals(enterExitTransitionElement.f10542d) && l.a(this.f10543e, enterExitTransitionElement.f10543e) && l.a(this.f10544f, enterExitTransitionElement.f10544f) && l.a(this.f10545g, enterExitTransitionElement.f10545g);
    }

    @Override // y0.S
    public final p h() {
        return new C1592D(this.a, this.f10540b, this.f10541c, this.f10542d, this.f10543e, this.f10544f, this.f10545g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        p0 p0Var = this.f10540b;
        int iHashCode2 = (iHashCode + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        p0 p0Var2 = this.f10541c;
        return this.f10545g.hashCode() + ((this.f10544f.hashCode() + ((this.f10543e.a.hashCode() + ((this.f10542d.a.hashCode() + ((iHashCode2 + (p0Var2 != null ? p0Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C1592D c1592d = (C1592D) pVar;
        c1592d.f13477x = this.a;
        c1592d.f13478y = this.f10540b;
        c1592d.f13479z = this.f10541c;
        c1592d.f13470A = this.f10542d;
        c1592d.f13471B = this.f10543e;
        c1592d.f13472C = this.f10544f;
        c1592d.f13473D = this.f10545g;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=" + this.f10540b + ", offsetAnimation=" + this.f10541c + ", slideAnimation=null, enter=" + this.f10542d + ", exit=" + this.f10543e + ", isEnabled=" + this.f10544f + ", graphicsLayerBlock=" + this.f10545g + ')';
    }
}
