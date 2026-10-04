package k2;

import B1.AbstractC0015b;
import B1.K;
import java.util.Locale;
import java.util.Objects;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387b {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12662c;

    public C1387b(int i7, long j7, long j8) {
        AbstractC0015b.c(j7 < j8);
        this.a = j7;
        this.f12661b = j8;
        this.f12662c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1387b.class == obj.getClass()) {
            C1387b c1387b = (C1387b) obj;
            if (this.a == c1387b.a && this.f12661b == c1387b.f12661b && this.f12662c == c1387b.f12662c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.f12661b), Integer.valueOf(this.f12662c));
    }

    public final String toString() {
        int i7 = K.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.f12661b + ", speedDivisor=" + this.f12662c;
    }
}
