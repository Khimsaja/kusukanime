package O4;

import n5.AbstractC1566c;
import n5.AbstractC1576m;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.I;
import n5.InterfaceC1573j;
import n5.Y;
import n5.a0;

/* loaded from: classes.dex */
public final class g extends AbstractC1576m implements InterfaceC1573j {

    /* renamed from: l, reason: collision with root package name */
    public final B f7561l;

    public g(B b4) {
        kotlin.jvm.internal.l.f("delegate", b4);
        this.f7561l = b4;
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        return z7 ? this.f7561l.x0(true) : this;
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return new g(this.f7561l.z0(i7));
    }

    @Override // n5.AbstractC1576m
    public final B C0() {
        return this.f7561l;
    }

    @Override // n5.AbstractC1576m
    public final AbstractC1576m E0(B b4) {
        return new g(b4);
    }

    @Override // n5.InterfaceC1573j
    public final boolean S() {
        return true;
    }

    @Override // n5.InterfaceC1573j
    public final a0 f(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("replacement", abstractC1586x);
        a0 a0VarW0 = abstractC1586x.w0();
        if (!Y.f(a0VarW0) && !Y.e(a0VarW0)) {
            return a0VarW0;
        }
        if (a0VarW0 instanceof B) {
            B b4 = (B) a0VarW0;
            B bX0 = b4.x0(false);
            return !Y.f(b4) ? bX0 : new g(bX0);
        }
        if (!(a0VarW0 instanceof AbstractC1580q)) {
            throw new D6.r();
        }
        AbstractC1580q abstractC1580q = (AbstractC1580q) a0VarW0;
        B b7 = abstractC1580q.f13407l;
        B bX02 = b7.x0(false);
        if (Y.f(b7)) {
            bX02 = new g(bX02);
        }
        B b8 = abstractC1580q.f13408m;
        B bX03 = b8.x0(false);
        if (Y.f(b8)) {
            bX03 = new g(bX03);
        }
        return AbstractC1566c.H(AbstractC1566c.f(bX02, bX03), AbstractC1566c.g(a0VarW0));
    }

    @Override // n5.AbstractC1576m, n5.AbstractC1586x
    public final boolean u0() {
        return false;
    }

    @Override // n5.B, n5.a0
    public final a0 z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return new g(this.f7561l.z0(i7));
    }
}
