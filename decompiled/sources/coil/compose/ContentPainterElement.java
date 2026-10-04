package coil.compose;

import T2.o;
import T2.u;
import a0.d;
import a0.p;
import b1.AbstractC0703b;
import g0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import w0.InterfaceC2192j;
import y0.AbstractC2359f;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/compose/ContentPainterElement;", "Ly0/S;", "LT2/u;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ContentPainterElement extends S {
    public final o a;

    /* renamed from: b, reason: collision with root package name */
    public final d f11164b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2192j f11165c;

    public ContentPainterElement(o oVar, d dVar, InterfaceC2192j interfaceC2192j) {
        this.a = oVar;
        this.f11164b = dVar;
        this.f11165c = interfaceC2192j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return this.a.equals(contentPainterElement.a) && l.a(this.f11164b, contentPainterElement.f11164b) && l.a(this.f11165c, contentPainterElement.f11165c) && Float.compare(1.0f, 1.0f) == 0;
    }

    @Override // y0.S
    public final p h() {
        u uVar = new u();
        uVar.f9033x = this.a;
        uVar.f9034y = this.f11164b;
        uVar.f9035z = this.f11165c;
        uVar.f9032A = 1.0f;
        return uVar;
    }

    public final int hashCode() {
        return AbstractC0703b.b(1.0f, (this.f11165c.hashCode() + ((this.f11164b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        u uVar = (u) pVar;
        long jH = uVar.f9033x.h();
        o oVar = this.a;
        boolean zA = f.a(jH, oVar.h());
        uVar.f9033x = oVar;
        uVar.f9034y = this.f11164b;
        uVar.f9035z = this.f11165c;
        uVar.f9032A = 1.0f;
        if (!zA) {
            AbstractC2359f.o(uVar);
        }
        AbstractC2359f.n(uVar);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.a + ", alignment=" + this.f11164b + ", contentScale=" + this.f11165c + ", alpha=1.0, colorFilter=null)";
    }
}
