package n5;

import io.ktor.http.LinkHeader;
import o5.C1706f;

/* renamed from: n5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564a extends AbstractC1576m {

    /* renamed from: l, reason: collision with root package name */
    public final B f13388l;

    /* renamed from: m, reason: collision with root package name */
    public final B f13389m;

    public C1564a(B b4, B b7) {
        kotlin.jvm.internal.l.f("delegate", b4);
        kotlin.jvm.internal.l.f("abbreviation", b7);
        this.f13388l = b4;
        this.f13389m = b7;
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return new C1564a(this.f13388l.z0(i7), this.f13389m);
    }

    @Override // n5.AbstractC1576m
    public final B C0() {
        return this.f13388l;
    }

    @Override // n5.AbstractC1576m
    public final AbstractC1576m E0(B b4) {
        return new C1564a(b4, this.f13389m);
    }

    @Override // n5.B, n5.a0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final C1564a x0(boolean z7) {
        return new C1564a(this.f13388l.x0(z7), this.f13389m.x0(z7));
    }

    @Override // n5.AbstractC1576m, n5.a0
    /* renamed from: G0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1564a y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        B b4 = this.f13388l;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, b4);
        B b7 = this.f13389m;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, b7);
        return new C1564a(b4, b7);
    }
}
