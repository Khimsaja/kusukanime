package D2;

import B1.K;
import O1.S;
import V1.G;
import V1.k;
import java.math.RoundingMode;
import y1.C2392n;
import y1.C2393o;
import y1.D;
import y1.E;

/* loaded from: classes.dex */
public final class c implements b {
    public final S a;

    /* renamed from: b, reason: collision with root package name */
    public final G f1401b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1402c;

    /* renamed from: d, reason: collision with root package name */
    public final C2393o f1403d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1404e;

    /* renamed from: f, reason: collision with root package name */
    public long f1405f;

    /* renamed from: g, reason: collision with root package name */
    public int f1406g;

    /* renamed from: h, reason: collision with root package name */
    public long f1407h;

    public c(S s7, G g4, e eVar, String str, int i7) throws E {
        this.a = s7;
        this.f1401b = g4;
        this.f1402c = eVar;
        int i8 = eVar.f1418o;
        int i9 = eVar.f1415l;
        int i10 = (i8 * i9) / 8;
        int i11 = eVar.f1417n;
        if (i11 != i10) {
            throw E.a(null, "Expected block size: " + i10 + "; got: " + i11);
        }
        int i12 = eVar.f1416m;
        int i13 = i12 * i10;
        int i14 = i13 * 8;
        int iMax = Math.max(i10, i13 / 10);
        this.f1404e = iMax;
        C2392n c2392n = new C2392n();
        c2392n.f18073l = D.m("audio/wav");
        c2392n.f18074m = D.m(str);
        c2392n.f18069h = i14;
        c2392n.f18070i = i14;
        c2392n.f18075n = iMax;
        c2392n.f18055C = i9;
        c2392n.f18056D = i12;
        c2392n.f18057E = i7;
        this.f1403d = new C2393o(c2392n);
    }

    @Override // D2.b
    public final void a(int i7, long j7) {
        this.a.k(new f(this.f1402c, 1, i7, j7));
        this.f1401b.a(this.f1403d);
    }

    @Override // D2.b
    public final boolean b(k kVar, long j7) {
        int i7;
        int i8;
        long j8 = j7;
        while (j8 > 0 && (i7 = this.f1406g) < (i8 = this.f1404e)) {
            int iD = this.f1401b.d(kVar, (int) Math.min(i8 - i7, j8), true);
            if (iD == -1) {
                j8 = 0;
            } else {
                this.f1406g += iD;
                j8 -= iD;
            }
        }
        e eVar = this.f1402c;
        int i9 = this.f1406g;
        int i10 = eVar.f1417n;
        int i11 = i9 / i10;
        if (i11 > 0) {
            long j9 = this.f1405f;
            long j10 = this.f1407h;
            long j11 = eVar.f1416m;
            int i12 = K.a;
            long jL = j9 + K.L(j10, 1000000L, j11, RoundingMode.DOWN);
            int i13 = i11 * i10;
            int i14 = this.f1406g - i13;
            this.f1401b.b(jL, 1, i13, i14, null);
            this.f1407h += i11;
            this.f1406g = i14;
        }
        return j8 <= 0;
    }

    @Override // D2.b
    public final void c(long j7) {
        this.f1405f = j7;
        this.f1406g = 0;
        this.f1407h = 0L;
    }
}
