package C1;

import f6.AbstractC0905c;
import y1.B;

/* loaded from: classes.dex */
public final class g implements B {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f577b;

    /* renamed from: c, reason: collision with root package name */
    public final long f578c;

    public g(long j7, long j8, long j9) {
        this.a = j7;
        this.f577b = j8;
        this.f578c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.f577b == gVar.f577b && this.f578c == gVar.f578c;
    }

    public final int hashCode() {
        return AbstractC0905c.u(this.f578c) + ((AbstractC0905c.u(this.f577b) + ((AbstractC0905c.u(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.f577b + ", timescale=" + this.f578c;
    }
}
