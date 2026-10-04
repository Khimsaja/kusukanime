package I1;

import O1.B;
import java.util.Objects;
import y1.P;

/* loaded from: classes.dex */
public final class a {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final P f3937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3938c;

    /* renamed from: d, reason: collision with root package name */
    public final B f3939d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3940e;

    /* renamed from: f, reason: collision with root package name */
    public final P f3941f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3942g;

    /* renamed from: h, reason: collision with root package name */
    public final B f3943h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3944i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3945j;

    public a(long j7, P p7, int i7, B b4, long j8, P p8, int i8, B b7, long j9, long j10) {
        this.a = j7;
        this.f3937b = p7;
        this.f3938c = i7;
        this.f3939d = b4;
        this.f3940e = j8;
        this.f3941f = p8;
        this.f3942g = i8;
        this.f3943h = b7;
        this.f3944i = j9;
        this.f3945j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.f3938c == aVar.f3938c && this.f3940e == aVar.f3940e && this.f3942g == aVar.f3942g && this.f3944i == aVar.f3944i && this.f3945j == aVar.f3945j && Objects.equals(this.f3937b, aVar.f3937b) && Objects.equals(this.f3939d, aVar.f3939d) && Objects.equals(this.f3941f, aVar.f3941f) && Objects.equals(this.f3943h, aVar.f3943h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.f3937b, Integer.valueOf(this.f3938c), this.f3939d, Long.valueOf(this.f3940e), this.f3941f, Integer.valueOf(this.f3942g), this.f3943h, Long.valueOf(this.f3944i), Long.valueOf(this.f3945j));
    }
}
