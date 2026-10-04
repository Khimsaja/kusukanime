package u4;

import java.util.List;
import m5.InterfaceC1526o;

/* renamed from: u4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2098d implements Q {

    /* renamed from: k, reason: collision with root package name */
    public final Q f16307k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2103i f16308l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16309m;

    public C2098d(Q q6, InterfaceC2103i interfaceC2103i, int i7) {
        kotlin.jvm.internal.l.f("declarationDescriptor", interfaceC2103i);
        this.f16307k = q6;
        this.f16308l = interfaceC2103i;
        this.f16309m = i7;
    }

    @Override // u4.Q
    public final boolean I() {
        return true;
    }

    @Override // u4.Q
    public final boolean J() {
        return this.f16307k.J();
    }

    @Override // u4.Q
    public final n5.b0 R() {
        n5.b0 b0VarR = this.f16307k.R();
        kotlin.jvm.internal.l.e("getVariance(...)", b0VarR);
        return b0VarR;
    }

    @Override // u4.InterfaceC2102h, u4.InterfaceC2105k
    public final InterfaceC2102h a() {
        return this.f16307k.a();
    }

    @Override // u4.InterfaceC2102h
    public final n5.B g() {
        n5.B bG = this.f16307k.g();
        kotlin.jvm.internal.l.e("getDefaultType(...)", bG);
        return bG;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return this.f16307k.getAnnotations();
    }

    @Override // u4.Q
    public final int getIndex() {
        return this.f16307k.getIndex() + this.f16309m;
    }

    @Override // u4.InterfaceC2105k
    public final W4.e getName() {
        W4.e name = this.f16307k.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        return name;
    }

    @Override // u4.Q
    public final List getUpperBounds() {
        List upperBounds = this.f16307k.getUpperBounds();
        kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
        return upperBounds;
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        return this.f16308l;
    }

    @Override // u4.InterfaceC2106l
    public final M l() {
        M mL = this.f16307k.l();
        kotlin.jvm.internal.l.e("getSource(...)", mL);
        return mL;
    }

    public final String toString() {
        return this.f16307k + "[inner-copy]";
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        return this.f16307k.u(yVar, obj);
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        n5.M mV = this.f16307k.v();
        kotlin.jvm.internal.l.e("getTypeConstructor(...)", mV);
        return mV;
    }

    @Override // u4.Q
    public final InterfaceC1526o w() {
        InterfaceC1526o interfaceC1526oW = this.f16307k.w();
        kotlin.jvm.internal.l.e("getStorageManager(...)", interfaceC1526oW);
        return interfaceC1526oW;
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k a() {
        return this.f16307k.a();
    }

    @Override // u4.Q, u4.InterfaceC2102h, u4.InterfaceC2105k
    public final Q a() {
        return this.f16307k.a();
    }
}
