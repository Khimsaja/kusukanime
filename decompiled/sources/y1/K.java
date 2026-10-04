package y1;

import java.util.Objects;
import v.c0;

/* loaded from: classes.dex */
public final class K {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17939b;

    /* renamed from: c, reason: collision with root package name */
    public final C2401x f17940c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17941d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17942e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17943f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17944g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17945h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17946i;

    static {
        c0.d(0, 1, 2, 3, 4);
        B1.K.B(5);
        B1.K.B(6);
    }

    public K(Object obj, int i7, C2401x c2401x, Object obj2, int i8, long j7, long j8, int i9, int i10) {
        this.a = obj;
        this.f17939b = i7;
        this.f17940c = c2401x;
        this.f17941d = obj2;
        this.f17942e = i8;
        this.f17943f = j7;
        this.f17944g = j8;
        this.f17945h = i9;
        this.f17946i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k7 = (K) obj;
            if (this.f17939b == k7.f17939b && this.f17942e == k7.f17942e && this.f17943f == k7.f17943f && this.f17944g == k7.f17944g && this.f17945h == k7.f17945h && this.f17946i == k7.f17946i && Objects.equals(this.f17940c, k7.f17940c) && Objects.equals(this.a, k7.a) && Objects.equals(this.f17941d, k7.f17941d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.f17939b), this.f17940c, this.f17941d, Integer.valueOf(this.f17942e), Long.valueOf(this.f17943f), Long.valueOf(this.f17944g), Integer.valueOf(this.f17945h), Integer.valueOf(this.f17946i));
    }
}
