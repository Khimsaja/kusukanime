package androidx.compose.foundation.gestures;

import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.e0;
import s.C1912f;
import s.C1924l;
import s.C1944v0;
import s.D0;
import s.EnumC1903a0;
import s.InterfaceC1910e;
import s.InterfaceC1946w0;
import s.X;
import u.k;
import y0.AbstractC2359f;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Ly0/S;", "Ls/v0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableElement extends S {
    public final InterfaceC1946w0 a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1903a0 f10569b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f10570c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10571d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10572e;

    /* renamed from: f, reason: collision with root package name */
    public final X f10573f;

    /* renamed from: g, reason: collision with root package name */
    public final k f10574g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1910e f10575h;

    public ScrollableElement(e0 e0Var, InterfaceC1910e interfaceC1910e, X x7, EnumC1903a0 enumC1903a0, InterfaceC1946w0 interfaceC1946w0, k kVar, boolean z7, boolean z8) {
        this.a = interfaceC1946w0;
        this.f10569b = enumC1903a0;
        this.f10570c = e0Var;
        this.f10571d = z7;
        this.f10572e = z8;
        this.f10573f = x7;
        this.f10574g = kVar;
        this.f10575h = interfaceC1910e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return l.a(this.a, scrollableElement.a) && this.f10569b == scrollableElement.f10569b && l.a(this.f10570c, scrollableElement.f10570c) && this.f10571d == scrollableElement.f10571d && this.f10572e == scrollableElement.f10572e && l.a(this.f10573f, scrollableElement.f10573f) && l.a(this.f10574g, scrollableElement.f10574g) && l.a(this.f10575h, scrollableElement.f10575h);
    }

    @Override // y0.S
    public final p h() {
        k kVar = this.f10574g;
        return new C1944v0(this.f10570c, this.f10575h, this.f10573f, this.f10569b, this.a, kVar, this.f10571d, this.f10572e);
    }

    public final int hashCode() {
        int iHashCode = (this.f10569b.hashCode() + (this.a.hashCode() * 31)) * 31;
        e0 e0Var = this.f10570c;
        int iD = AbstractC0703b.d(AbstractC0703b.d((iHashCode + (e0Var != null ? e0Var.hashCode() : 0)) * 31, 31, this.f10571d), 31, this.f10572e);
        X x7 = this.f10573f;
        int iHashCode2 = (iD + (x7 != null ? x7.hashCode() : 0)) * 31;
        k kVar = this.f10574g;
        int iHashCode3 = (iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        InterfaceC1910e interfaceC1910e = this.f10575h;
        return iHashCode3 + (interfaceC1910e != null ? interfaceC1910e.hashCode() : 0);
    }

    @Override // y0.S
    public final void m(p pVar) {
        boolean z7;
        C1944v0 c1944v0 = (C1944v0) pVar;
        boolean z8 = c1944v0.f15193B;
        boolean z9 = this.f10571d;
        boolean z10 = true;
        boolean z11 = false;
        if (z8 != z9) {
            c1944v0.f15392N.f15349l = z9;
            c1944v0.f15389K.f15304x = z9;
            z7 = true;
        } else {
            z7 = false;
        }
        X x7 = this.f10573f;
        X x8 = x7 == null ? c1944v0.f15390L : x7;
        D0 d02 = c1944v0.f15391M;
        InterfaceC1946w0 interfaceC1946w0 = d02.a;
        InterfaceC1946w0 interfaceC1946w02 = this.a;
        if (!l.a(interfaceC1946w0, interfaceC1946w02)) {
            d02.a = interfaceC1946w02;
            z11 = true;
        }
        e0 e0Var = this.f10570c;
        d02.f15098b = e0Var;
        EnumC1903a0 enumC1903a0 = d02.f15100d;
        EnumC1903a0 enumC1903a02 = this.f10569b;
        if (enumC1903a0 != enumC1903a02) {
            d02.f15100d = enumC1903a02;
            z11 = true;
        }
        boolean z12 = d02.f15101e;
        boolean z13 = this.f10572e;
        if (z12 != z13) {
            d02.f15101e = z13;
        } else {
            z10 = z11;
        }
        d02.f15099c = x8;
        d02.f15102f = c1944v0.J;
        C1924l c1924l = c1944v0.f15393O;
        c1924l.f15335x = enumC1903a02;
        c1924l.f15337z = z13;
        c1924l.f15328A = this.f10575h;
        c1944v0.f15388H = e0Var;
        c1944v0.I = x7;
        boolean z14 = z10;
        C1912f c1912f = C1912f.f15300o;
        EnumC1903a0 enumC1903a03 = d02.f15100d;
        EnumC1903a0 enumC1903a04 = EnumC1903a0.f15259k;
        if (enumC1903a03 != enumC1903a04) {
            enumC1903a04 = EnumC1903a0.f15260l;
        }
        c1944v0.R0(c1912f, z9, this.f10574g, enumC1903a04, z14);
        if (z7) {
            c1944v0.f15395Q = null;
            c1944v0.f15396R = null;
            AbstractC2359f.p(c1944v0);
        }
    }
}
