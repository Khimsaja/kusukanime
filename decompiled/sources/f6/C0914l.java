package f6;

import b1.AbstractC0703b;
import f1.AbstractC0871d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: f6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914l {

    /* renamed from: e, reason: collision with root package name */
    public static final C0914l f11572e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0914l f11573f;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11574b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f11575c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f11576d;

    static {
        C0912j c0912j = C0912j.f11566r;
        C0912j c0912j2 = C0912j.f11567s;
        C0912j c0912j3 = C0912j.f11568t;
        C0912j c0912j4 = C0912j.f11560l;
        C0912j c0912j5 = C0912j.f11562n;
        C0912j c0912j6 = C0912j.f11561m;
        C0912j c0912j7 = C0912j.f11563o;
        C0912j c0912j8 = C0912j.f11565q;
        C0912j c0912j9 = C0912j.f11564p;
        C0912j[] c0912jArr = {c0912j, c0912j2, c0912j3, c0912j4, c0912j5, c0912j6, c0912j7, c0912j8, c0912j9};
        C0912j[] c0912jArr2 = {c0912j, c0912j2, c0912j3, c0912j4, c0912j5, c0912j6, c0912j7, c0912j8, c0912j9, C0912j.f11558j, C0912j.f11559k, C0912j.f11556h, C0912j.f11557i, C0912j.f11554f, C0912j.f11555g, C0912j.f11553e};
        C0913k c0913k = new C0913k();
        c0913k.b((C0912j[]) Arrays.copyOf(c0912jArr, 9));
        EnumC0899M enumC0899M = EnumC0899M.TLS_1_3;
        EnumC0899M enumC0899M2 = EnumC0899M.TLS_1_2;
        c0913k.d(enumC0899M, enumC0899M2);
        if (!c0913k.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0913k.f11571d = true;
        c0913k.a();
        C0913k c0913k2 = new C0913k();
        c0913k2.b((C0912j[]) Arrays.copyOf(c0912jArr2, 16));
        c0913k2.d(enumC0899M, enumC0899M2);
        if (!c0913k2.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0913k2.f11571d = true;
        f11572e = c0913k2.a();
        C0913k c0913k3 = new C0913k();
        c0913k3.b((C0912j[]) Arrays.copyOf(c0912jArr2, 16));
        c0913k3.d(enumC0899M, enumC0899M2, EnumC0899M.TLS_1_1, EnumC0899M.TLS_1_0);
        if (!c0913k3.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0913k3.f11571d = true;
        c0913k3.a();
        f11573f = new C0914l(false, false, null, null);
    }

    public C0914l(boolean z7, boolean z8, String[] strArr, String[] strArr2) {
        this.a = z7;
        this.f11574b = z8;
        this.f11575c = strArr;
        this.f11576d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f11575c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0912j.f11550b.c(str));
        }
        return P3.q.S0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f11576d;
        if (strArr != null && !g6.b.j(strArr, sSLSocket.getEnabledProtocols(), R3.a.f8097l)) {
            return false;
        }
        String[] strArr2 = this.f11575c;
        return strArr2 == null || g6.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), C0912j.f11551c);
    }

    public final List c() {
        String[] strArr = this.f11576d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0871d.U(str));
        }
        return P3.q.S0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0914l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0914l c0914l = (C0914l) obj;
        boolean z7 = c0914l.a;
        boolean z8 = this.a;
        if (z8 != z7) {
            return false;
        }
        if (z8) {
            return Arrays.equals(this.f11575c, c0914l.f11575c) && Arrays.equals(this.f11576d, c0914l.f11576d) && this.f11574b == c0914l.f11574b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.f11575c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f11576d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f11574b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC0703b.n(sb, this.f11574b, ')');
    }
}
