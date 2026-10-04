package C2;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class r implements InterfaceC0037j {
    public final B2.l a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f841b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f842c;

    /* renamed from: g, reason: collision with root package name */
    public long f846g;

    /* renamed from: i, reason: collision with root package name */
    public String f848i;

    /* renamed from: j, reason: collision with root package name */
    public V1.G f849j;

    /* renamed from: k, reason: collision with root package name */
    public q f850k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f851l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f853n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f847h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final y f843d = new y(7);

    /* renamed from: e, reason: collision with root package name */
    public final y f844e = new y(8);

    /* renamed from: f, reason: collision with root package name */
    public final y f845f = new y(6);

    /* renamed from: m, reason: collision with root package name */
    public long f852m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final B1.B f854o = new B1.B();

    public r(B2.l lVar, boolean z7, boolean z8) {
        this.a = lVar;
        this.f841b = z7;
        this.f842c = z8;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        this.f846g = 0L;
        this.f853n = false;
        this.f852m = -9223372036854775807L;
        C1.r.b(this.f847h);
        this.f843d.g();
        this.f844e.g();
        this.f845f.g();
        ((C1.w) this.a.f418n).b(0);
        q qVar = this.f850k;
        if (qVar != null) {
            qVar.f832k = false;
            qVar.f836o = false;
            p pVar = qVar.f835n;
            pVar.f808b = false;
            pVar.a = false;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void b(B1.B b4) {
        int i7;
        AbstractC0015b.i(this.f849j);
        int i8 = B1.K.a;
        int i9 = b4.f288b;
        int i10 = b4.f289c;
        byte[] bArr = b4.a;
        this.f846g += b4.a();
        this.f849j.c(b4, b4.a(), 0);
        while (true) {
            int iC = C1.r.c(bArr, i9, i10, this.f847h);
            if (iC == i10) {
                g(bArr, i9, i10);
                return;
            }
            int i11 = bArr[iC + 3] & 31;
            if (iC <= 0 || bArr[iC - 1] != 0) {
                i7 = 3;
            } else {
                iC--;
                i7 = 4;
            }
            int i12 = iC;
            int i13 = i12 - i9;
            if (i13 > 0) {
                g(bArr, i9, i12);
            }
            int i14 = i10 - i12;
            long j7 = this.f846g - i14;
            f(i14, i13 < 0 ? -i13 : 0, j7, this.f852m);
            h(i11, j7, this.f852m);
            i9 = i12 + i7;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
        AbstractC0015b.i(this.f849j);
        int i7 = B1.K.a;
        if (z7) {
            ((C1.w) this.a.f418n).b(0);
            f(0, 0, this.f846g, this.f852m);
            h(9, this.f846g, this.f852m);
            f(0, 0, this.f846g, this.f852m);
        }
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f852m = j7;
        this.f853n = ((i7 & 2) != 0) | this.f853n;
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.f848i = k7.f689e;
        k7.b();
        V1.G gM = pVar.m(k7.f688d, 2);
        this.f849j = gM;
        this.f850k = new q(gM, this.f841b, this.f842c);
        this.a.o(pVar, k7);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r23, int r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.r.f(int, int, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.r.g(byte[], int, int):void");
    }

    public final void h(int i7, long j7, long j8) {
        if (!this.f851l || this.f850k.f824c) {
            this.f843d.h(i7);
            this.f844e.h(i7);
        }
        this.f845f.h(i7);
        q qVar = this.f850k;
        boolean z7 = this.f853n;
        qVar.f830i = i7;
        qVar.f833l = j8;
        qVar.f831j = j7;
        qVar.f840s = z7;
        if (!qVar.f823b || i7 != 1) {
            if (!qVar.f824c) {
                return;
            }
            if (i7 != 5 && i7 != 1 && i7 != 2) {
                return;
            }
        }
        p pVar = qVar.f834m;
        qVar.f834m = qVar.f835n;
        qVar.f835n = pVar;
        pVar.f808b = false;
        pVar.a = false;
        qVar.f829h = 0;
        qVar.f832k = true;
    }
}
