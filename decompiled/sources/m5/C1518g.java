package m5;

import e4.InterfaceC0821a;

/* renamed from: m5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518g {
    public final W4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0821a f12979b;

    public C1518g(W4.c cVar, InterfaceC0821a interfaceC0821a) {
        this.a = cVar;
        this.f12979b = interfaceC0821a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1518g.class == obj.getClass() && this.a.equals(((C1518g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
