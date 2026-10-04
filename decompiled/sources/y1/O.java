package y1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import v.c0;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: p, reason: collision with root package name */
    public static final Object f17953p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final C2401x f17954q;

    /* renamed from: b, reason: collision with root package name */
    public Object f17955b;

    /* renamed from: d, reason: collision with root package name */
    public long f17957d;

    /* renamed from: e, reason: collision with root package name */
    public long f17958e;

    /* renamed from: f, reason: collision with root package name */
    public long f17959f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17960g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17961h;

    /* renamed from: i, reason: collision with root package name */
    public C2397t f17962i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17963j;

    /* renamed from: k, reason: collision with root package name */
    public long f17964k;

    /* renamed from: l, reason: collision with root package name */
    public long f17965l;

    /* renamed from: m, reason: collision with root package name */
    public int f17966m;

    /* renamed from: n, reason: collision with root package name */
    public int f17967n;

    /* renamed from: o, reason: collision with root package name */
    public long f17968o;
    public Object a = f17953p;

    /* renamed from: c, reason: collision with root package name */
    public C2401x f17956c = f17954q;

    static {
        V1.r rVar = new V1.r();
        j3.E e7 = j3.G.f12277l;
        j3.X x7 = j3.X.f12304o;
        List list = Collections.EMPTY_LIST;
        j3.X x8 = j3.X.f12304o;
        C2396s c2396s = new C2396s();
        C2399v c2399v = C2399v.a;
        Uri uri = Uri.EMPTY;
        f17954q = new C2401x("androidx.media3.common.Timeline", new r(rVar), uri != null ? new C2398u(uri, null, null, list, x8, -9223372036854775807L) : null, new C2397t(c2396s), A.f17903B, c2399v);
        c0.d(1, 2, 3, 4, 5);
        c0.d(6, 7, 8, 9, 10);
        B1.K.B(11);
        B1.K.B(12);
        B1.K.B(13);
    }

    public final boolean a() {
        return this.f17962i != null;
    }

    public final void b(C2401x c2401x, boolean z7, boolean z8, C2397t c2397t, long j7, long j8) {
        this.a = f17953p;
        this.f17956c = c2401x != null ? c2401x : f17954q;
        if (c2401x != null) {
            C2398u c2398u = c2401x.f18138b;
        }
        this.f17955b = null;
        this.f17957d = -9223372036854775807L;
        this.f17958e = -9223372036854775807L;
        this.f17959f = -9223372036854775807L;
        this.f17960g = z7;
        this.f17961h = z8;
        this.f17962i = c2397t;
        this.f17964k = j7;
        this.f17965l = j8;
        this.f17966m = 0;
        this.f17967n = 0;
        this.f17968o = 0L;
        this.f17963j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !O.class.equals(obj.getClass())) {
            return false;
        }
        O o7 = (O) obj;
        return Objects.equals(this.a, o7.a) && Objects.equals(this.f17956c, o7.f17956c) && Objects.equals(this.f17962i, o7.f17962i) && this.f17957d == o7.f17957d && this.f17958e == o7.f17958e && this.f17959f == o7.f17959f && this.f17960g == o7.f17960g && this.f17961h == o7.f17961h && this.f17963j == o7.f17963j && this.f17964k == o7.f17964k && this.f17965l == o7.f17965l && this.f17966m == o7.f17966m && this.f17967n == o7.f17967n && this.f17968o == o7.f17968o;
    }

    public final int hashCode() {
        int iHashCode = (this.f17956c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 961;
        C2397t c2397t = this.f17962i;
        int iHashCode2 = c2397t == null ? 0 : c2397t.hashCode();
        long j7 = this.f17957d;
        int i7 = (((iHashCode + iHashCode2) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f17958e;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f17959f;
        int i9 = (((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f17960g ? 1 : 0)) * 31) + (this.f17961h ? 1 : 0)) * 31) + (this.f17963j ? 1 : 0)) * 31;
        long j10 = this.f17964k;
        int i10 = (i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f17965l;
        int i11 = (((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f17966m) * 31) + this.f17967n) * 31;
        long j12 = this.f17968o;
        return i11 + ((int) (j12 ^ (j12 >>> 32)));
    }
}
