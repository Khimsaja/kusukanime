package H;

import p.AbstractC1755i;

/* renamed from: H.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197n {
    public final S0.h a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2989b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2990c;

    public C0197n(S0.h hVar, int i7, long j7) {
        this.a = hVar;
        this.f2989b = i7;
        this.f2990c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0197n)) {
            return false;
        }
        C0197n c0197n = (C0197n) obj;
        return this.a == c0197n.a && this.f2989b == c0197n.f2989b && this.f2990c == c0197n.f2990c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2990c) + AbstractC1755i.a(this.f2989b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.f2989b + ", selectableId=" + this.f2990c + ')';
    }
}
