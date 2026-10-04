package y1;

import com.kusukanime.BuildConfig;
import io.ktor.client.utils.CIOKt;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.collections.ConcurrentMapKt;
import java.util.Arrays;
import java.util.Objects;
import v.c0;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: B, reason: collision with root package name */
    public static final A f17903B;

    /* renamed from: A, reason: collision with root package name */
    public final j3.G f17904A;
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f17905b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f17906c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f17907d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f17908e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f17909f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17910g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17911h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f17912i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f17913j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f17914k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f17915l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f17916m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f17917n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f17918o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f17919p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f17920q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f17921r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f17922s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f17923t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f17924u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f17925v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f17926w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f17927x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f17928y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f17929z;

    static {
        C2403z c2403z = new C2403z();
        j3.E e7 = j3.G.f12277l;
        c2403z.f18168z = j3.X.f12304o;
        f17903B = new A(c2403z);
        c0.d(0, 1, 2, 3, 4);
        c0.d(5, 6, 8, 9, 10);
        c0.d(11, 12, 13, 14, 15);
        c0.d(16, 17, 18, 19, 20);
        c0.d(21, 22, 23, 24, 25);
        c0.d(26, 27, 28, 29, 30);
        c0.d(31, 32, 33, 34, CIOKt.DEFAULT_HTTP_POOL_SIZE);
    }

    public A(C2403z c2403z) {
        Boolean boolValueOf = c2403z.f18153k;
        Integer numValueOf = c2403z.f18152j;
        Integer numValueOf2 = c2403z.f18167y;
        int i7 = 1;
        int i8 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case GzipHeaderFlags.EXTRA /* 4 */:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case BuildConfig.VERSION_CODE /* 30 */:
                        default:
                            i7 = 0;
                            break;
                        case 21:
                            i7 = 2;
                            break;
                        case 22:
                            i7 = 3;
                            break;
                        case 23:
                            i7 = 4;
                            break;
                        case 24:
                            i7 = 5;
                            break;
                        case 25:
                            i7 = 6;
                            break;
                    }
                    i8 = i7;
                }
                numValueOf = Integer.valueOf(i8);
            }
        } else if (numValueOf != null) {
            boolean z7 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z7);
            if (z7 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i8 = 21;
                        break;
                    case 3:
                        i8 = 22;
                        break;
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        i8 = 23;
                        break;
                    case 5:
                        i8 = 24;
                        break;
                    case 6:
                        i8 = 25;
                        break;
                    default:
                        i8 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i8);
            }
        }
        this.a = c2403z.a;
        this.f17905b = c2403z.f18144b;
        this.f17906c = c2403z.f18145c;
        this.f17907d = c2403z.f18146d;
        this.f17908e = c2403z.f18147e;
        this.f17909f = c2403z.f18148f;
        this.f17910g = c2403z.f18149g;
        this.f17911h = c2403z.f18150h;
        this.f17912i = c2403z.f18151i;
        this.f17913j = numValueOf;
        this.f17914k = boolValueOf;
        Integer num = c2403z.f18154l;
        this.f17915l = num;
        this.f17916m = num;
        this.f17917n = c2403z.f18155m;
        this.f17918o = c2403z.f18156n;
        this.f17919p = c2403z.f18157o;
        this.f17920q = c2403z.f18158p;
        this.f17921r = c2403z.f18159q;
        this.f17922s = c2403z.f18160r;
        this.f17923t = c2403z.f18161s;
        this.f17924u = c2403z.f18162t;
        this.f17925v = c2403z.f18163u;
        this.f17926w = c2403z.f18164v;
        this.f17927x = c2403z.f18165w;
        this.f17928y = c2403z.f18166x;
        this.f17929z = numValueOf2;
        this.f17904A = c2403z.f18168z;
    }

    public final C2403z a() {
        C2403z c2403z = new C2403z();
        c2403z.a = this.a;
        c2403z.f18144b = this.f17905b;
        c2403z.f18145c = this.f17906c;
        c2403z.f18146d = this.f17907d;
        c2403z.f18147e = this.f17908e;
        c2403z.f18148f = this.f17909f;
        c2403z.f18149g = this.f17910g;
        c2403z.f18150h = this.f17911h;
        c2403z.f18151i = this.f17912i;
        c2403z.f18152j = this.f17913j;
        c2403z.f18153k = this.f17914k;
        c2403z.f18154l = this.f17916m;
        c2403z.f18155m = this.f17917n;
        c2403z.f18156n = this.f17918o;
        c2403z.f18157o = this.f17919p;
        c2403z.f18158p = this.f17920q;
        c2403z.f18159q = this.f17921r;
        c2403z.f18160r = this.f17922s;
        c2403z.f18161s = this.f17923t;
        c2403z.f18162t = this.f17924u;
        c2403z.f18163u = this.f17925v;
        c2403z.f18164v = this.f17926w;
        c2403z.f18165w = this.f17927x;
        c2403z.f18166x = this.f17928y;
        c2403z.f18167y = this.f17929z;
        c2403z.f18168z = this.f17904A;
        return c2403z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a = (A) obj;
        return Objects.equals(this.a, a.a) && Objects.equals(this.f17905b, a.f17905b) && Objects.equals(this.f17906c, a.f17906c) && Objects.equals(this.f17907d, a.f17907d) && Objects.equals(this.f17908e, a.f17908e) && Arrays.equals(this.f17909f, a.f17909f) && Objects.equals(this.f17910g, a.f17910g) && Objects.equals(this.f17911h, a.f17911h) && Objects.equals(this.f17912i, a.f17912i) && Objects.equals(this.f17913j, a.f17913j) && Objects.equals(this.f17914k, a.f17914k) && Objects.equals(this.f17916m, a.f17916m) && Objects.equals(this.f17917n, a.f17917n) && Objects.equals(this.f17918o, a.f17918o) && Objects.equals(this.f17919p, a.f17919p) && Objects.equals(this.f17920q, a.f17920q) && Objects.equals(this.f17921r, a.f17921r) && Objects.equals(this.f17922s, a.f17922s) && Objects.equals(this.f17923t, a.f17923t) && Objects.equals(this.f17924u, a.f17924u) && Objects.equals(this.f17925v, a.f17925v) && Objects.equals(this.f17926w, a.f17926w) && Objects.equals(this.f17927x, a.f17927x) && Objects.equals(this.f17928y, a.f17928y) && Objects.equals(this.f17929z, a.f17929z) && Objects.equals(this.f17904A, a.f17904A);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f17905b, this.f17906c, this.f17907d, null, null, this.f17908e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f17909f)), this.f17910g, null, this.f17911h, this.f17912i, this.f17913j, this.f17914k, null, this.f17916m, this.f17917n, this.f17918o, this.f17919p, this.f17920q, this.f17921r, this.f17922s, this.f17923t, this.f17924u, this.f17925v, this.f17926w, this.f17927x, null, this.f17928y, this.f17929z, true, this.f17904A);
    }
}
