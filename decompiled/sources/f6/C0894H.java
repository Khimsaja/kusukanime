package f6;

import D4.S;
import H1.C0231l;

/* renamed from: f6.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894H {
    public C0890D a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC0888B f11483b;

    /* renamed from: d, reason: collision with root package name */
    public String f11485d;

    /* renamed from: e, reason: collision with root package name */
    public C0919q f11486e;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0897K f11488g;

    /* renamed from: h, reason: collision with root package name */
    public C0895I f11489h;

    /* renamed from: i, reason: collision with root package name */
    public C0895I f11490i;

    /* renamed from: j, reason: collision with root package name */
    public C0895I f11491j;

    /* renamed from: k, reason: collision with root package name */
    public long f11492k;

    /* renamed from: l, reason: collision with root package name */
    public long f11493l;

    /* renamed from: m, reason: collision with root package name */
    public C0231l f11494m;

    /* renamed from: c, reason: collision with root package name */
    public int f11484c = -1;

    /* renamed from: f, reason: collision with root package name */
    public S f11487f = new S(5, false);

    public static void b(C0895I c0895i, String str) {
        if (c0895i != null) {
            if (c0895i.f11501q != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c0895i.f11502r != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c0895i.f11503s != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c0895i.f11504t != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final C0895I a() {
        int i7 = this.f11484c;
        if (i7 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f11484c).toString());
        }
        C0890D c0890d = this.a;
        if (c0890d == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC0888B enumC0888B = this.f11483b;
        if (enumC0888B == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f11485d;
        if (str != null) {
            return new C0895I(c0890d, enumC0888B, str, i7, this.f11486e, this.f11487f.l(), this.f11488g, this.f11489h, this.f11490i, this.f11491j, this.f11492k, this.f11493l, this.f11494m);
        }
        throw new IllegalStateException("message == null");
    }
}
