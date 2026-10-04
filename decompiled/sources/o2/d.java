package o2;

import B1.B;
import O1.S;
import V1.AbstractC0597b;
import V1.G;
import V1.k;
import V1.m;
import V1.n;
import V1.o;
import V1.p;
import V1.v;
import V1.y;
import java.io.EOFException;
import java.io.InterruptedIOException;
import y1.C;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: e, reason: collision with root package name */
    public final m f13572e;

    /* renamed from: f, reason: collision with root package name */
    public S f13573f;

    /* renamed from: g, reason: collision with root package name */
    public G f13574g;

    /* renamed from: h, reason: collision with root package name */
    public G f13575h;

    /* renamed from: i, reason: collision with root package name */
    public int f13576i;

    /* renamed from: j, reason: collision with root package name */
    public C f13577j;

    /* renamed from: l, reason: collision with root package name */
    public long f13579l;

    /* renamed from: m, reason: collision with root package name */
    public long f13580m;

    /* renamed from: n, reason: collision with root package name */
    public long f13581n;

    /* renamed from: o, reason: collision with root package name */
    public int f13582o;

    /* renamed from: p, reason: collision with root package name */
    public f f13583p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13584q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13585r;

    /* renamed from: s, reason: collision with root package name */
    public long f13586s;
    public final B a = new B(10);

    /* renamed from: b, reason: collision with root package name */
    public final y f13569b = new y();

    /* renamed from: c, reason: collision with root package name */
    public final v f13570c = new v();

    /* renamed from: k, reason: collision with root package name */
    public long f13578k = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final B2.a f13571d = new B2.a(1);

    public d() {
        m mVar = new m();
        this.f13572e = mVar;
        this.f13575h = mVar;
        this.f13581n = -1L;
    }

    @Override // V1.n
    public final boolean b(o oVar) {
        return h((k) oVar, true);
    }

    public final void c() {
        f fVar = this.f13583p;
        if ((fVar instanceof C1633a) && ((C1633a) fVar).g()) {
            long j7 = this.f13581n;
            if (j7 == -1 || j7 == this.f13583p.c()) {
                return;
            }
            C1633a c1633a = (C1633a) this.f13583p;
            long j8 = this.f13581n;
            int i7 = c1633a.f13564j;
            this.f13583p = new C1633a(j8, c1633a.f13562h, c1633a.f13563i, i7, c1633a.f13565k);
            S s7 = this.f13573f;
            s7.getClass();
            s7.k(this.f13583p);
            this.f13574g.getClass();
            this.f13583p.l();
        }
    }

    @Override // V1.n
    public final void d(p pVar) {
        S s7 = (S) pVar;
        this.f13573f = s7;
        G gM = s7.m(0, 1);
        this.f13574g = gM;
        this.f13575h = gM;
        this.f13573f.b();
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        this.f13576i = 0;
        this.f13578k = -9223372036854775807L;
        this.f13579l = 0L;
        this.f13582o = 0;
        this.f13586s = j8;
        f fVar = this.f13583p;
        if (fVar instanceof b) {
            ((b) fVar).getClass();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(V1.k r9) {
        /*
            r8 = this;
            o2.f r0 = r8.f13583p
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.c()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.i()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            B1.B r0 = r8.a     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.h(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.d.g(V1.k):boolean");
    }

    public final boolean h(k kVar, boolean z7) throws EOFException, InterruptedIOException {
        int i7;
        int i8;
        int iH;
        int i9 = z7 ? 32768 : 131072;
        kVar.f9394p = 0;
        if (kVar.f9392n == 0) {
            C cA = this.f13571d.a(kVar, null);
            this.f13577j = cA;
            if (cA != null) {
                this.f13570c.b(cA);
            }
            i7 = (int) kVar.i();
            if (!z7) {
                kVar.f(i7);
            }
            i8 = 0;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i10 = i8;
        int i11 = i10;
        while (true) {
            if (!g(kVar)) {
                B b4 = this.a;
                b4.F(0);
                int iG = b4.g();
                if ((i8 == 0 || ((-128000) & iG) == (i8 & (-128000))) && (iH = AbstractC0597b.h(iG)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f13569b.a(iG);
                        i8 = iG;
                    }
                    kVar.b(iH - 4, false);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == i9) {
                        if (z7) {
                            return false;
                        }
                        c();
                        throw new EOFException();
                    }
                    if (z7) {
                        kVar.f9394p = 0;
                        kVar.b(i7 + i12, false);
                    } else {
                        kVar.f(1);
                    }
                    i10 = 0;
                    i11 = i12;
                    i8 = 0;
                }
            } else if (i10 <= 0) {
                c();
                throw new EOFException();
            }
        }
        if (z7) {
            kVar.f(i7 + i11);
        } else {
            kVar.f9394p = 0;
        }
        this.f13576i = i8;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0349 A[LOOP:2: B:162:0x0347->B:163:0x0349, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r54, V1.r r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.d.i(V1.o, V1.r):int");
    }

    @Override // V1.n
    public final void a() {
    }
}
