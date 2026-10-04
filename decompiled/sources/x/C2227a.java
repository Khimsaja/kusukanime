package x;

import v.c0;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2227a {
    public final int a;

    public C2227a(int i7) {
        this.a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(c0.a(i7, "Provided count ", " should be larger than zero").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2227a) {
            return this.a == ((C2227a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
