package o5;

import H4.u;
import P3.y;
import a5.InterfaceC0668b;
import e4.InterfaceC0821a;
import f6.AbstractC0905c;
import java.util.Collection;
import java.util.List;
import l5.C1452e;
import n5.AbstractC1586x;
import n5.Q;
import r4.AbstractC1880i;
import u4.InterfaceC2102h;

/* renamed from: o5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1709i implements InterfaceC0668b {
    public final Q a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0821a f13805b;

    /* renamed from: c, reason: collision with root package name */
    public final C1709i f13806c;

    /* renamed from: d, reason: collision with root package name */
    public final u4.Q f13807d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13808e;

    public C1709i(Q q6, InterfaceC0821a interfaceC0821a, C1709i c1709i, u4.Q q7) {
        kotlin.jvm.internal.l.f("projection", q6);
        this.a = q6;
        this.f13805b = interfaceC0821a;
        this.f13806c = c1709i;
        this.f13807d = q7;
        this.f13808e = z1.c.B(O3.j.f7525k, new u(24, this));
    }

    @Override // a5.InterfaceC0668b
    public final Q a() {
        return this.a;
    }

    @Override // n5.M
    public final AbstractC1880i d() {
        AbstractC1586x abstractC1586xB = this.a.b();
        kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
        return AbstractC0905c.n(abstractC1586xB);
    }

    @Override // n5.M
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1709i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor", obj);
        C1709i c1709i = (C1709i) obj;
        C1709i c1709i2 = this.f13806c;
        if (c1709i2 == null) {
            c1709i2 = this;
        }
        C1709i c1709i3 = c1709i.f13806c;
        if (c1709i3 != null) {
            obj = c1709i3;
        }
        return c1709i2 == obj;
    }

    @Override // n5.M
    public final InterfaceC2102h f() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // n5.M
    public final Collection g() {
        List list = (List) this.f13808e.getValue();
        return list == null ? y.f7779k : list;
    }

    @Override // n5.M
    public final List getParameters() {
        return y.f7779k;
    }

    public final int hashCode() {
        C1709i c1709i = this.f13806c;
        return c1709i != null ? c1709i.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    public /* synthetic */ C1709i(Q q6, C1452e c1452e, u4.Q q7, int i7) {
        this(q6, (i7 & 2) != 0 ? null : c1452e, (C1709i) null, (i7 & 8) != 0 ? null : q7);
    }
}
