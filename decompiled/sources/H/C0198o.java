package H;

import b1.AbstractC0703b;

/* renamed from: H.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198o {
    public final C0197n a;

    /* renamed from: b, reason: collision with root package name */
    public final C0197n f2991b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2992c;

    public C0198o(C0197n c0197n, C0197n c0197n2, boolean z7) {
        this.a = c0197n;
        this.f2991b = c0197n2;
        this.f2992c = z7;
    }

    public static C0198o a(C0198o c0198o, C0197n c0197n, C0197n c0197n2, boolean z7, int i7) {
        if ((i7 & 1) != 0) {
            c0197n = c0198o.a;
        }
        if ((i7 & 2) != 0) {
            c0197n2 = c0198o.f2991b;
        }
        c0198o.getClass();
        return new C0198o(c0197n, c0197n2, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0198o)) {
            return false;
        }
        C0198o c0198o = (C0198o) obj;
        return kotlin.jvm.internal.l.a(this.a, c0198o.a) && kotlin.jvm.internal.l.a(this.f2991b, c0198o.f2991b) && this.f2992c == c0198o.f2992c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2992c) + ((this.f2991b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.f2991b);
        sb.append(", handlesCrossed=");
        return AbstractC0703b.n(sb, this.f2992c, ')');
    }
}
