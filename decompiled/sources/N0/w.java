package N0;

import H0.C0214f;
import H0.H;
import b1.AbstractC0703b;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class w {
    public final C0214f a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6896b;

    /* renamed from: c, reason: collision with root package name */
    public final H f6897c;

    static {
        L2.e eVar = X.n.a;
    }

    public w(C0214f c0214f, long j7, H h7) {
        this.a = c0214f;
        this.f6896b = AbstractC1420H.o(c0214f.a.length(), j7);
        this.f6897c = h7 != null ? new H(AbstractC1420H.o(c0214f.a.length(), h7.a)) : null;
    }

    public static w a(w wVar, C0214f c0214f, long j7, int i7) {
        if ((i7 & 1) != 0) {
            c0214f = wVar.a;
        }
        if ((i7 & 2) != 0) {
            j7 = wVar.f6896b;
        }
        H h7 = (i7 & 4) != 0 ? wVar.f6897c : null;
        wVar.getClass();
        return new w(c0214f, j7, h7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return H.a(this.f6896b, wVar.f6896b) && kotlin.jvm.internal.l.a(this.f6897c, wVar.f6897c) && kotlin.jvm.internal.l.a(this.a, wVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i7 = H.f3092c;
        int iC = AbstractC0703b.c(iHashCode, 31, this.f6896b);
        H h7 = this.f6897c;
        return iC + (h7 != null ? Long.hashCode(h7.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) H.g(this.f6896b)) + ", composition=" + this.f6897c + ')';
    }

    public w(String str, long j7, int i7) {
        this(new C0214f((i7 & 1) != 0 ? "" : str, null, 6), (i7 & 2) != 0 ? H.f3091b : j7, (H) null);
    }
}
