package b2;

import B1.B;
import O1.S;
import V1.k;
import V1.m;
import V1.n;
import V1.o;
import V1.p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706b implements n {
    public final B a = new B(4);

    /* renamed from: b, reason: collision with root package name */
    public final B f10909b = new B(9);

    /* renamed from: c, reason: collision with root package name */
    public final B f10910c = new B(11);

    /* renamed from: d, reason: collision with root package name */
    public final B f10911d = new B();

    /* renamed from: e, reason: collision with root package name */
    public final C0707c f10912e;

    /* renamed from: f, reason: collision with root package name */
    public S f10913f;

    /* renamed from: g, reason: collision with root package name */
    public int f10914g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10915h;

    /* renamed from: i, reason: collision with root package name */
    public long f10916i;

    /* renamed from: j, reason: collision with root package name */
    public int f10917j;

    /* renamed from: k, reason: collision with root package name */
    public int f10918k;

    /* renamed from: l, reason: collision with root package name */
    public int f10919l;

    /* renamed from: m, reason: collision with root package name */
    public long f10920m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10921n;

    /* renamed from: o, reason: collision with root package name */
    public C0705a f10922o;

    /* renamed from: p, reason: collision with root package name */
    public C0708d f10923p;

    public C0706b() {
        C0707c c0707c = new C0707c(new m());
        c0707c.f10924l = -9223372036854775807L;
        c0707c.f10925m = new long[0];
        c0707c.f10926n = new long[0];
        this.f10912e = c0707c;
        this.f10914g = 1;
    }

    @Override // V1.n
    public final boolean b(o oVar) throws EOFException, InterruptedIOException {
        B b4 = this.a;
        k kVar = (k) oVar;
        kVar.h(b4.a, 0, 3, false);
        b4.F(0);
        if (b4.w() == 4607062) {
            kVar.h(b4.a, 0, 2, false);
            b4.F(0);
            if ((b4.z() & 250) == 0) {
                kVar.h(b4.a, 0, 4, false);
                b4.F(0);
                int iG = b4.g();
                kVar.f9394p = 0;
                kVar.b(iG, false);
                kVar.h(b4.a, 0, 4, false);
                b4.F(0);
                if (b4.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final B c(k kVar) {
        int i7 = this.f10919l;
        B b4 = this.f10911d;
        byte[] bArr = b4.a;
        if (i7 > bArr.length) {
            b4.D(new byte[Math.max(bArr.length * 2, i7)], 0);
        } else {
            b4.F(0);
        }
        b4.E(this.f10919l);
        kVar.a(b4.a, 0, this.f10919l, false);
        return b4;
    }

    @Override // V1.n
    public final void d(p pVar) {
        this.f10913f = (S) pVar;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        if (j7 == 0) {
            this.f10914g = 1;
            this.f10915h = false;
        } else {
            this.f10914g = 3;
        }
        this.f10917j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0299  */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r32, V1.r r33) throws y1.E {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0706b.i(V1.o, V1.r):int");
    }

    @Override // V1.n
    public final void a() {
    }
}
