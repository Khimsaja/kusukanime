package androidx.compose.foundation;

import F0.f;
import a0.p;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.C1839v;
import u.k;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Ly0/S;", "Lq/v;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends S {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public final q.S f10551b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10552c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10553d;

    /* renamed from: e, reason: collision with root package name */
    public final f f10554e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0821a f10555f;

    public ClickableElement(k kVar, q.S s7, boolean z7, String str, f fVar, InterfaceC0821a interfaceC0821a) {
        this.a = kVar;
        this.f10551b = s7;
        this.f10552c = z7;
        this.f10553d = str;
        this.f10554e = fVar;
        this.f10555f = interfaceC0821a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return l.a(this.a, clickableElement.a) && l.a(this.f10551b, clickableElement.f10551b) && this.f10552c == clickableElement.f10552c && l.a(this.f10553d, clickableElement.f10553d) && l.a(this.f10554e, clickableElement.f10554e) && this.f10555f == clickableElement.f10555f;
    }

    @Override // y0.S
    public final p h() {
        return new C1839v(this.a, this.f10551b, this.f10552c, this.f10553d, this.f10554e, this.f10555f);
    }

    public final int hashCode() {
        k kVar = this.a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        q.S s7 = this.f10551b;
        int iD = AbstractC0703b.d((iHashCode + (s7 != null ? s7.hashCode() : 0)) * 31, 31, this.f10552c);
        String str = this.f10553d;
        int iHashCode2 = (iD + (str != null ? str.hashCode() : 0)) * 31;
        f fVar = this.f10554e;
        return this.f10555f.hashCode() + ((iHashCode2 + (fVar != null ? Integer.hashCode(fVar.a) : 0)) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C1839v) pVar).M0(this.a, this.f10551b, this.f10552c, this.f10553d, this.f10554e, this.f10555f);
    }
}
