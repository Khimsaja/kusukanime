package androidx.compose.foundation;

import a0.p;
import b1.AbstractC0703b;
import h0.AbstractC0993p;
import h0.C0961F;
import h0.C0998u;
import h0.InterfaceC0973S;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.C1833o;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Ly0/S;", "Lq/o;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends S {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0993p f10546b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10547c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0973S f10548d;

    public BackgroundElement(long j7, C0961F c0961f, InterfaceC0973S interfaceC0973S, int i7) {
        j7 = (i7 & 1) != 0 ? C0998u.f11834g : j7;
        c0961f = (i7 & 2) != 0 ? null : c0961f;
        this.a = j7;
        this.f10546b = c0961f;
        this.f10547c = 1.0f;
        this.f10548d = interfaceC0973S;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C0998u.c(this.a, backgroundElement.a) && l.a(this.f10546b, backgroundElement.f10546b) && this.f10547c == backgroundElement.f10547c && l.a(this.f10548d, backgroundElement.f10548d);
    }

    @Override // y0.S
    public final p h() {
        C1833o c1833o = new C1833o();
        c1833o.f14594x = this.a;
        c1833o.f14595y = this.f10546b;
        c1833o.f14596z = this.f10547c;
        c1833o.f14589A = this.f10548d;
        c1833o.f14590B = 9205357640488583168L;
        return c1833o;
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        int iHashCode = Long.hashCode(this.a) * 31;
        AbstractC0993p abstractC0993p = this.f10546b;
        return this.f10548d.hashCode() + AbstractC0703b.b(this.f10547c, (iHashCode + (abstractC0993p != null ? abstractC0993p.hashCode() : 0)) * 31, 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C1833o c1833o = (C1833o) pVar;
        c1833o.f14594x = this.a;
        c1833o.f14595y = this.f10546b;
        c1833o.f14596z = this.f10547c;
        c1833o.f14589A = this.f10548d;
    }
}
