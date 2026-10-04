package J1;

import B1.K;
import j3.I;
import j3.J;
import j3.l0;
import java.util.Objects;
import java.util.Set;

/* renamed from: J1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0285a f4180d;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4181b;

    /* renamed from: c, reason: collision with root package name */
    public final J f4182c;

    static {
        C0285a c0285a;
        if (K.a >= 33) {
            I i7 = new I(4);
            for (int i8 = 1; i8 <= 10; i8++) {
                i7.a(Integer.valueOf(K.p(i8)));
            }
            c0285a = new C0285a(i7.f(), 2);
        } else {
            c0285a = new C0285a(2, 10);
        }
        f4180d = c0285a;
    }

    public C0285a(Set set, int i7) {
        this.a = i7;
        J jS = J.s(set);
        this.f4182c = jS;
        l0 it = jS.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f4181b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0285a)) {
            return false;
        }
        C0285a c0285a = (C0285a) obj;
        return this.a == c0285a.a && this.f4181b == c0285a.f4181b && Objects.equals(this.f4182c, c0285a.f4182c);
    }

    public final int hashCode() {
        int i7 = ((this.a * 31) + this.f4181b) * 31;
        J j7 = this.f4182c;
        return i7 + (j7 == null ? 0 : j7.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.f4181b + ", channelMasks=" + this.f4182c + "]";
    }

    public C0285a(int i7, int i8) {
        this.a = i7;
        this.f4181b = i8;
        this.f4182c = null;
    }
}
