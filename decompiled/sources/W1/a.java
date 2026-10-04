package W1;

import B1.K;
import B1.r;
import O1.S;
import V1.A;
import V1.G;
import V1.k;
import V1.m;
import V1.n;
import V1.o;
import V1.p;
import V1.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o2.C1633a;
import y1.E;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f9585q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f9586r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f9587s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f9588t;

    /* renamed from: b, reason: collision with root package name */
    public final m f9589b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9590c;

    /* renamed from: d, reason: collision with root package name */
    public long f9591d;

    /* renamed from: e, reason: collision with root package name */
    public int f9592e;

    /* renamed from: f, reason: collision with root package name */
    public int f9593f;

    /* renamed from: h, reason: collision with root package name */
    public int f9595h;

    /* renamed from: i, reason: collision with root package name */
    public long f9596i;

    /* renamed from: j, reason: collision with root package name */
    public S f9597j;

    /* renamed from: k, reason: collision with root package name */
    public G f9598k;

    /* renamed from: l, reason: collision with root package name */
    public G f9599l;

    /* renamed from: m, reason: collision with root package name */
    public A f9600m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9601n;

    /* renamed from: o, reason: collision with root package name */
    public long f9602o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9603p;
    public final byte[] a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f9594g = -1;

    static {
        int i7 = K.a;
        Charset charset = StandardCharsets.UTF_8;
        f9587s = "#!AMR\n".getBytes(charset);
        f9588t = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        m mVar = new m();
        this.f9589b = mVar;
        this.f9599l = mVar;
    }

    @Override // V1.n
    public final boolean b(o oVar) {
        return g((k) oVar);
    }

    public final int c(k kVar) throws E {
        boolean z7;
        kVar.f9394p = 0;
        byte[] bArr = this.a;
        kVar.h(bArr, 0, 1, false);
        byte b4 = bArr[0];
        if ((b4 & 131) > 0) {
            throw E.a(null, "Invalid padding bits for frame header " + ((int) b4));
        }
        int i7 = (b4 >> 3) & 15;
        if (i7 >= 0 && i7 <= 15 && (((z7 = this.f9590c) && (i7 < 10 || i7 > 13)) || (!z7 && (i7 < 12 || i7 > 14)))) {
            return z7 ? f9586r[i7] : f9585q[i7];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f9590c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i7);
        throw E.a(null, sb.toString());
    }

    @Override // V1.n
    public final void d(p pVar) {
        S s7 = (S) pVar;
        this.f9597j = s7;
        G gM = s7.m(0, 1);
        this.f9598k = gM;
        this.f9599l = gM;
        s7.b();
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        this.f9591d = 0L;
        this.f9592e = 0;
        this.f9593f = 0;
        this.f9602o = j8;
        A a = this.f9600m;
        if (!(a instanceof x)) {
            if (j7 == 0 || !(a instanceof C1633a)) {
                this.f9596i = 0L;
                return;
            } else {
                this.f9596i = (Math.max(0L, j7 - ((C1633a) a).f13556b) * 8000000) / r7.f13559e;
                return;
            }
        }
        x xVar = (x) a;
        r rVar = xVar.f9431b;
        long jE = rVar.a == 0 ? -9223372036854775807L : rVar.e(K.b(xVar.a, j7));
        this.f9596i = jE;
        if (Math.abs(this.f9602o - jE) < 20000) {
            return;
        }
        this.f9601n = true;
        this.f9599l = this.f9589b;
    }

    public final boolean g(k kVar) {
        kVar.f9394p = 0;
        byte[] bArr = f9587s;
        byte[] bArr2 = new byte[bArr.length];
        kVar.h(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f9590c = false;
            kVar.f(bArr.length);
            return true;
        }
        kVar.f9394p = 0;
        byte[] bArr3 = f9588t;
        byte[] bArr4 = new byte[bArr3.length];
        kVar.h(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f9590c = true;
        kVar.f(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r25, V1.r r26) throws y1.E {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.a.i(V1.o, V1.r):int");
    }

    @Override // V1.n
    public final void a() {
    }
}
