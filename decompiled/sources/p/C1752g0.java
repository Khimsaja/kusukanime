package p;

import b1.AbstractC0703b;

/* renamed from: p.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1752g0 implements InterfaceC1715B {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14015b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14016c;

    public C1752g0(float f5, float f7, Object obj) {
        this.a = f5;
        this.f14015b = f7;
        this.f14016c = obj;
    }

    @Override // p.InterfaceC1760l
    public final D0 a(B0 b02) {
        Object obj = this.f14016c;
        return new X4.y(this.a, this.f14015b, obj == null ? null : (AbstractC1766r) b02.a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1752g0) {
            C1752g0 c1752g0 = (C1752g0) obj;
            if (c1752g0.a == this.a && c1752g0.f14015b == this.f14015b && kotlin.jvm.internal.l.a(c1752g0.f14016c, this.f14016c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f14016c;
        return Float.hashCode(this.f14015b) + AbstractC0703b.b(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ C1752g0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
