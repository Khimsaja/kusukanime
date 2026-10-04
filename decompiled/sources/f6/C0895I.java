package f6;

import H1.C0231l;
import io.ktor.http.ContentType;
import java.io.Closeable;

/* renamed from: f6.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895I implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final C0890D f11495k;

    /* renamed from: l, reason: collision with root package name */
    public final EnumC0888B f11496l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11497m;

    /* renamed from: n, reason: collision with root package name */
    public final int f11498n;

    /* renamed from: o, reason: collision with root package name */
    public final C0919q f11499o;

    /* renamed from: p, reason: collision with root package name */
    public final C0920r f11500p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0897K f11501q;

    /* renamed from: r, reason: collision with root package name */
    public final C0895I f11502r;

    /* renamed from: s, reason: collision with root package name */
    public final C0895I f11503s;

    /* renamed from: t, reason: collision with root package name */
    public final C0895I f11504t;

    /* renamed from: u, reason: collision with root package name */
    public final long f11505u;

    /* renamed from: v, reason: collision with root package name */
    public final long f11506v;

    /* renamed from: w, reason: collision with root package name */
    public final C0231l f11507w;

    /* renamed from: x, reason: collision with root package name */
    public C0906d f11508x;

    public C0895I(C0890D c0890d, EnumC0888B enumC0888B, String str, int i7, C0919q c0919q, C0920r c0920r, AbstractC0897K abstractC0897K, C0895I c0895i, C0895I c0895i2, C0895I c0895i3, long j7, long j8, C0231l c0231l) {
        kotlin.jvm.internal.l.f("request", c0890d);
        kotlin.jvm.internal.l.f("protocol", enumC0888B);
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        this.f11495k = c0890d;
        this.f11496l = enumC0888B;
        this.f11497m = str;
        this.f11498n = i7;
        this.f11499o = c0919q;
        this.f11500p = c0920r;
        this.f11501q = abstractC0897K;
        this.f11502r = c0895i;
        this.f11503s = c0895i2;
        this.f11504t = c0895i3;
        this.f11505u = j7;
        this.f11506v = j8;
        this.f11507w = c0231l;
    }

    public static String b(C0895I c0895i, String str) {
        c0895i.getClass();
        String strA = c0895i.f11500p.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0897K abstractC0897K = this.f11501q;
        if (abstractC0897K == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC0897K.close();
    }

    public final boolean e() {
        int i7 = this.f11498n;
        return 200 <= i7 && i7 < 300;
    }

    public final C0894H g() {
        C0894H c0894h = new C0894H();
        c0894h.a = this.f11495k;
        c0894h.f11483b = this.f11496l;
        c0894h.f11484c = this.f11498n;
        c0894h.f11485d = this.f11497m;
        c0894h.f11486e = this.f11499o;
        c0894h.f11487f = this.f11500p.j();
        c0894h.f11488g = this.f11501q;
        c0894h.f11489h = this.f11502r;
        c0894h.f11490i = this.f11503s;
        c0894h.f11491j = this.f11504t;
        c0894h.f11492k = this.f11505u;
        c0894h.f11493l = this.f11506v;
        c0894h.f11494m = this.f11507w;
        return c0894h;
    }

    public final String toString() {
        return "Response{protocol=" + this.f11496l + ", code=" + this.f11498n + ", message=" + this.f11497m + ", url=" + this.f11495k.a + '}';
    }
}
