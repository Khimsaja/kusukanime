package k2;

import f6.AbstractC0905c;
import y1.B;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1386a implements B {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12657b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12658c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12659d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12660e;

    public C1386a(long j7, long j8, long j9, long j10, long j11) {
        this.a = j7;
        this.f12657b = j8;
        this.f12658c = j9;
        this.f12659d = j10;
        this.f12660e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1386a.class == obj.getClass()) {
            C1386a c1386a = (C1386a) obj;
            if (this.a == c1386a.a && this.f12657b == c1386a.f12657b && this.f12658c == c1386a.f12658c && this.f12659d == c1386a.f12659d && this.f12660e == c1386a.f12660e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0905c.u(this.f12660e) + ((AbstractC0905c.u(this.f12659d) + ((AbstractC0905c.u(this.f12658c) + ((AbstractC0905c.u(this.f12657b) + ((AbstractC0905c.u(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.f12657b + ", photoPresentationTimestampUs=" + this.f12658c + ", videoStartPosition=" + this.f12659d + ", videoSize=" + this.f12660e;
    }
}
