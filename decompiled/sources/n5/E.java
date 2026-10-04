package n5;

import io.ktor.http.LinkHeader;
import o5.C1706f;

/* loaded from: classes.dex */
public final class E extends AbstractC1576m implements Z {

    /* renamed from: l, reason: collision with root package name */
    public final B f13356l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC1586x f13357m;

    public E(B b4, AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("delegate", b4);
        kotlin.jvm.internal.l.f("enhancement", abstractC1586x);
        this.f13356l = b4;
        this.f13357m = abstractC1586x;
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        a0 a0VarH = AbstractC1566c.H(this.f13356l.x0(z7), this.f13357m.w0().x0(z7));
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType", a0VarH);
        return (B) a0VarH;
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        a0 a0VarH = AbstractC1566c.H(this.f13356l.z0(i7), this.f13357m);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType", a0VarH);
        return (B) a0VarH;
    }

    @Override // n5.AbstractC1576m
    public final B C0() {
        return this.f13356l;
    }

    @Override // n5.AbstractC1576m
    public final AbstractC1576m E0(B b4) {
        return new E(b4, this.f13357m);
    }

    @Override // n5.AbstractC1576m, n5.a0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final E y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        B b4 = this.f13356l;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, b4);
        AbstractC1586x abstractC1586x = this.f13357m;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
        return new E(b4, abstractC1586x);
    }

    @Override // n5.Z
    public final a0 j0() {
        return this.f13356l;
    }

    @Override // n5.Z
    public final AbstractC1586x q() {
        return this.f13357m;
    }

    @Override // n5.B
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f13357m + ")] " + this.f13356l;
    }
}
