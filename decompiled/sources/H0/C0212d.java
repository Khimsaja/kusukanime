package H0;

import p.AbstractC1755i;

/* renamed from: H0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212d {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3108c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3109d;

    public C0212d(Object obj, int i7, int i8, String str) {
        this.a = obj;
        this.f3107b = i7;
        this.f3108c = i8;
        this.f3109d = str;
        if (i7 > i8) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0212d)) {
            return false;
        }
        C0212d c0212d = (C0212d) obj;
        return kotlin.jvm.internal.l.a(this.a, c0212d.a) && this.f3107b == c0212d.f3107b && this.f3108c == c0212d.f3108c && kotlin.jvm.internal.l.a(this.f3109d, c0212d.f3109d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.f3109d.hashCode() + AbstractC1755i.a(this.f3108c, AbstractC1755i.a(this.f3107b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.f3107b);
        sb.append(", end=");
        sb.append(this.f3108c);
        sb.append(", tag=");
        return A6.b.j(sb, this.f3109d, ')');
    }

    public C0212d(int i7, int i8, Object obj) {
        this(obj, i7, i8, "");
    }
}
