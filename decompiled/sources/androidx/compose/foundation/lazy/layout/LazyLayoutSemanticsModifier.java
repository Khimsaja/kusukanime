package androidx.compose.foundation.lazy.layout;

import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.InterfaceC1440s;
import s.EnumC1903a0;
import y.C2312L;
import y.InterfaceC2308H;
import y0.AbstractC2359f;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Ly0/S;", "Ly/L;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends S {
    public final InterfaceC1440s a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2308H f10596b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1903a0 f10597c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10598d;

    public LazyLayoutSemanticsModifier(InterfaceC1440s interfaceC1440s, InterfaceC2308H interfaceC2308H, EnumC1903a0 enumC1903a0, boolean z7) {
        this.a = interfaceC1440s;
        this.f10596b = interfaceC2308H;
        this.f10597c = enumC1903a0;
        this.f10598d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.a == lazyLayoutSemanticsModifier.a && l.a(this.f10596b, lazyLayoutSemanticsModifier.f10596b) && this.f10597c == lazyLayoutSemanticsModifier.f10597c && this.f10598d == lazyLayoutSemanticsModifier.f10598d;
    }

    @Override // y0.S
    public final p h() {
        EnumC1903a0 enumC1903a0 = this.f10597c;
        return new C2312L(this.a, this.f10596b, enumC1903a0, this.f10598d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0703b.d((this.f10597c.hashCode() + ((this.f10596b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.f10598d);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C2312L c2312l = (C2312L) pVar;
        c2312l.f17590x = this.a;
        c2312l.f17591y = this.f10596b;
        EnumC1903a0 enumC1903a0 = c2312l.f17592z;
        EnumC1903a0 enumC1903a02 = this.f10597c;
        if (enumC1903a0 != enumC1903a02) {
            c2312l.f17592z = enumC1903a02;
            AbstractC2359f.p(c2312l);
        }
        boolean z7 = c2312l.f17586A;
        boolean z8 = this.f10598d;
        if (z7 == z8) {
            return;
        }
        c2312l.f17586A = z8;
        c2312l.G0();
        AbstractC2359f.p(c2312l);
    }
}
