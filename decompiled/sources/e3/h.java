package e3;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f11355c;
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11356b;

    static {
        C0820b c0820b = C0820b.a;
        f11355c = new h(c0820b, c0820b);
    }

    public h(c cVar, c cVar2) {
        this.a = cVar;
        this.f11356b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.a, hVar.a) && l.a(this.f11356b, hVar.f11356b);
    }

    public final int hashCode() {
        return this.f11356b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.f11356b + ')';
    }
}
