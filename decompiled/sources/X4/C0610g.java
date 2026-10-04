package X4;

import io.ktor.network.sockets.DatagramKt;

/* renamed from: X4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610g {
    public final AbstractC0605b a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9892b;

    public C0610g(int i7, AbstractC0605b abstractC0605b) {
        this.a = abstractC0605b;
        this.f9892b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0610g)) {
            return false;
        }
        C0610g c0610g = (C0610g) obj;
        return this.a == c0610g.a && this.f9892b == c0610g.f9892b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * DatagramKt.MAX_DATAGRAM_SIZE) + this.f9892b;
    }
}
