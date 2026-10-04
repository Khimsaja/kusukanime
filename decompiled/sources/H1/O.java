package H1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class O {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3341b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3342c;

    public O(N n7) {
        this.a = n7.a;
        this.f3341b = n7.f3339b;
        this.f3342c = n7.f3340c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return this.a == o7.a && this.f3341b == o7.f3341b && this.f3342c == o7.f3342c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.f3341b), Long.valueOf(this.f3342c));
    }
}
