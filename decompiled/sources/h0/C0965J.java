package h0;

import f.AbstractC0847h;

/* renamed from: h0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965J extends AbstractC0966K {
    public final g0.e a;

    /* renamed from: b, reason: collision with root package name */
    public final C0987j f11781b;

    public C0965J(g0.e eVar) {
        C0987j c0987jH;
        this.a = eVar;
        if (AbstractC0847h.r(eVar)) {
            c0987jH = null;
        } else {
            c0987jH = AbstractC0968M.h();
            InterfaceC0967L.a(c0987jH, eVar);
        }
        this.f11781b = c0987jH;
    }

    @Override // h0.AbstractC0966K
    public final g0.d a() {
        g0.e eVar = this.a;
        return new g0.d(eVar.a, eVar.f11662b, eVar.f11663c, eVar.f11664d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0965J) {
            return kotlin.jvm.internal.l.a(this.a, ((C0965J) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
