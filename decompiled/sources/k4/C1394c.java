package k4;

import kotlin.jvm.internal.l;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394c extends AbstractC1392a {
    static {
        new C1394c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1394c)) {
            return false;
        }
        if (isEmpty() && ((C1394c) obj).isEmpty()) {
            return true;
        }
        C1394c c1394c = (C1394c) obj;
        return this.f12664k == c1394c.f12664k && this.f12665l == c1394c.f12665l;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f12664k * 31) + this.f12665l;
    }

    public final boolean isEmpty() {
        return l.g(this.f12664k, this.f12665l) > 0;
    }

    public final String toString() {
        return this.f12664k + ".." + this.f12665l;
    }
}
