package g2;

import java.util.Arrays;
import java.util.Objects;
import y1.B;
import y1.C2392n;
import y1.C2393o;
import y1.D;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941a implements B {

    /* renamed from: g, reason: collision with root package name */
    public static final C2393o f11694g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2393o f11695h;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11696b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11697c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11698d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f11699e;

    /* renamed from: f, reason: collision with root package name */
    public int f11700f;

    static {
        C2392n c2392n = new C2392n();
        c2392n.f18074m = D.m("application/id3");
        f11694g = new C2393o(c2392n);
        C2392n c2392n2 = new C2392n();
        c2392n2.f18074m = D.m("application/x-scte35");
        f11695h = new C2393o(c2392n2);
    }

    public C0941a(String str, String str2, long j7, long j8, byte[] bArr) {
        this.a = str;
        this.f11696b = str2;
        this.f11697c = j7;
        this.f11698d = j8;
        this.f11699e = bArr;
    }

    @Override // y1.B
    public final C2393o a() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f11695h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f11694g;
            default:
                return null;
        }
    }

    @Override // y1.B
    public final byte[] b() {
        if (a() != null) {
            return this.f11699e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0941a.class == obj.getClass()) {
            C0941a c0941a = (C0941a) obj;
            if (this.f11697c == c0941a.f11697c && this.f11698d == c0941a.f11698d && Objects.equals(this.a, c0941a.a) && Objects.equals(this.f11696b, c0941a.f11696b) && Arrays.equals(this.f11699e, c0941a.f11699e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f11700f == 0) {
            String str = this.a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f11696b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j7 = this.f11697c;
            int i7 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f11698d;
            this.f11700f = Arrays.hashCode(this.f11699e) + ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31);
        }
        return this.f11700f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.f11698d + ", durationMs=" + this.f11697c + ", value=" + this.f11696b;
    }
}
