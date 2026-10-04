package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0615l;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class J extends AbstractC0615l {

    /* renamed from: M, reason: collision with root package name */
    public static final J f8199M;

    /* renamed from: N, reason: collision with root package name */
    public static final C0570a f8200N = new C0570a(13);

    /* renamed from: A, reason: collision with root package name */
    public int f8201A;

    /* renamed from: B, reason: collision with root package name */
    public int f8202B;

    /* renamed from: C, reason: collision with root package name */
    public List f8203C;

    /* renamed from: D, reason: collision with root package name */
    public List f8204D;

    /* renamed from: E, reason: collision with root package name */
    public List f8205E;

    /* renamed from: F, reason: collision with root package name */
    public List f8206F;

    /* renamed from: G, reason: collision with root package name */
    public List f8207G;

    /* renamed from: H, reason: collision with root package name */
    public List f8208H;
    public List I;
    public List J;

    /* renamed from: K, reason: collision with root package name */
    public byte f8209K;

    /* renamed from: L, reason: collision with root package name */
    public int f8210L;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8211l;

    /* renamed from: m, reason: collision with root package name */
    public int f8212m;

    /* renamed from: n, reason: collision with root package name */
    public int f8213n;

    /* renamed from: o, reason: collision with root package name */
    public int f8214o;

    /* renamed from: p, reason: collision with root package name */
    public int f8215p;

    /* renamed from: q, reason: collision with root package name */
    public U f8216q;

    /* renamed from: r, reason: collision with root package name */
    public int f8217r;

    /* renamed from: s, reason: collision with root package name */
    public List f8218s;

    /* renamed from: t, reason: collision with root package name */
    public U f8219t;

    /* renamed from: u, reason: collision with root package name */
    public int f8220u;

    /* renamed from: v, reason: collision with root package name */
    public List f8221v;

    /* renamed from: w, reason: collision with root package name */
    public List f8222w;

    /* renamed from: x, reason: collision with root package name */
    public int f8223x;

    /* renamed from: y, reason: collision with root package name */
    public List f8224y;

    /* renamed from: z, reason: collision with root package name */
    public c0 f8225z;

    static {
        J j7 = new J();
        f8199M = j7;
        j7.p();
    }

    public J(I i7) {
        super(i7);
        this.f8223x = -1;
        this.f8209K = (byte) -1;
        this.f8210L = -1;
        this.f8211l = i7.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8209K;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i7 = this.f8212m;
        if ((i7 & 4) != 4) {
            this.f8209K = (byte) 0;
            return false;
        }
        if ((i7 & 8) == 8 && !this.f8216q.a()) {
            this.f8209K = (byte) 0;
            return false;
        }
        for (int i8 = 0; i8 < this.f8218s.size(); i8++) {
            if (!((Z) this.f8218s.get(i8)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        if ((this.f8212m & 32) == 32 && !this.f8219t.a()) {
            this.f8209K = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f8221v.size(); i9++) {
            if (!((U) this.f8221v.get(i9)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f8224y.size(); i10++) {
            if (!((c0) this.f8224y.get(i10)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        if ((this.f8212m & 128) == 128 && !this.f8225z.a()) {
            this.f8209K = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f8204D.size(); i11++) {
            if (!((C0581l) this.f8204D.get(i11)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f8205E.size(); i12++) {
            if (!((C0577h) this.f8205E.get(i12)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f8206F.size(); i13++) {
            if (!((C0577h) this.f8206F.get(i13)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f8207G.size(); i14++) {
            if (!((C0577h) this.f8207G.get(i14)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f8208H.size(); i15++) {
            if (!((C0577h) this.f8208H.get(i15)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.I.size(); i16++) {
            if (!((C0577h) this.I.get(i16)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.J.size(); i17++) {
            if (!((C0577h) this.J.get(i17)).a()) {
                this.f8209K = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f8209K = (byte) 1;
            return true;
        }
        this.f8209K = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8199M;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8210L;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8212m & 2) == 2 ? B1.G.e(1, this.f8214o) : 0;
        if ((this.f8212m & 4) == 4) {
            iE += B1.G.e(2, this.f8215p);
        }
        if ((this.f8212m & 8) == 8) {
            iE += B1.G.g(3, this.f8216q);
        }
        for (int i8 = 0; i8 < this.f8218s.size(); i8++) {
            iE += B1.G.g(4, (AbstractC0605b) this.f8218s.get(i8));
        }
        if ((this.f8212m & 32) == 32) {
            iE += B1.G.g(5, this.f8219t);
        }
        if ((this.f8212m & 128) == 128) {
            iE += B1.G.g(6, this.f8225z);
        }
        if ((this.f8212m & 256) == 256) {
            iE += B1.G.e(7, this.f8201A);
        }
        if ((this.f8212m & 512) == 512) {
            iE += B1.G.e(8, this.f8202B);
        }
        if ((this.f8212m & 16) == 16) {
            iE += B1.G.e(9, this.f8217r);
        }
        if ((this.f8212m & 64) == 64) {
            iE += B1.G.e(10, this.f8220u);
        }
        if ((this.f8212m & 1) == 1) {
            iE += B1.G.e(11, this.f8213n);
        }
        for (int i9 = 0; i9 < this.f8221v.size(); i9++) {
            iE += B1.G.g(12, (AbstractC0605b) this.f8221v.get(i9));
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f8222w.size(); i10++) {
            iF += B1.G.f(((Integer) this.f8222w.get(i10)).intValue());
        }
        int iG = iE + iF;
        if (!this.f8222w.isEmpty()) {
            iG = iG + 1 + B1.G.f(iF);
        }
        this.f8223x = iF;
        for (int i11 = 0; i11 < this.f8205E.size(); i11++) {
            iG += B1.G.g(14, (AbstractC0605b) this.f8205E.get(i11));
        }
        for (int i12 = 0; i12 < this.f8206F.size(); i12++) {
            iG += B1.G.g(15, (AbstractC0605b) this.f8206F.get(i12));
        }
        for (int i13 = 0; i13 < this.f8207G.size(); i13++) {
            iG += B1.G.g(16, (AbstractC0605b) this.f8207G.get(i13));
        }
        for (int i14 = 0; i14 < this.f8224y.size(); i14++) {
            iG += B1.G.g(17, (AbstractC0605b) this.f8224y.get(i14));
        }
        int iF2 = 0;
        for (int i15 = 0; i15 < this.f8203C.size(); i15++) {
            iF2 += B1.G.f(((Integer) this.f8203C.get(i15)).intValue());
        }
        int size = (this.f8203C.size() * 2) + iG + iF2;
        for (int i16 = 0; i16 < this.f8204D.size(); i16++) {
            size += B1.G.g(32, (AbstractC0605b) this.f8204D.get(i16));
        }
        for (int i17 = 0; i17 < this.f8208H.size(); i17++) {
            size += B1.G.g(33, (AbstractC0605b) this.f8208H.get(i17));
        }
        for (int i18 = 0; i18 < this.I.size(); i18++) {
            size += B1.G.g(34, (AbstractC0605b) this.I.get(i18));
        }
        for (int i19 = 0; i19 < this.J.size(); i19++) {
            size += B1.G.g(35, (AbstractC0605b) this.J.get(i19));
        }
        int size2 = this.f8211l.size() + j() + size;
        this.f8210L = size2;
        return size2;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return I.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        I iH = I.h();
        iH.i(this);
        return iH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8212m & 2) == 2) {
            g4.B(1, this.f8214o);
        }
        if ((this.f8212m & 4) == 4) {
            g4.B(2, this.f8215p);
        }
        if ((this.f8212m & 8) == 8) {
            g4.D(3, this.f8216q);
        }
        for (int i7 = 0; i7 < this.f8218s.size(); i7++) {
            g4.D(4, (AbstractC0605b) this.f8218s.get(i7));
        }
        if ((this.f8212m & 32) == 32) {
            g4.D(5, this.f8219t);
        }
        if ((this.f8212m & 128) == 128) {
            g4.D(6, this.f8225z);
        }
        if ((this.f8212m & 256) == 256) {
            g4.B(7, this.f8201A);
        }
        if ((this.f8212m & 512) == 512) {
            g4.B(8, this.f8202B);
        }
        if ((this.f8212m & 16) == 16) {
            g4.B(9, this.f8217r);
        }
        if ((this.f8212m & 64) == 64) {
            g4.B(10, this.f8220u);
        }
        if ((this.f8212m & 1) == 1) {
            g4.B(11, this.f8213n);
        }
        for (int i8 = 0; i8 < this.f8221v.size(); i8++) {
            g4.D(12, (AbstractC0605b) this.f8221v.get(i8));
        }
        if (this.f8222w.size() > 0) {
            g4.K(106);
            g4.K(this.f8223x);
        }
        for (int i9 = 0; i9 < this.f8222w.size(); i9++) {
            g4.C(((Integer) this.f8222w.get(i9)).intValue());
        }
        for (int i10 = 0; i10 < this.f8205E.size(); i10++) {
            g4.D(14, (AbstractC0605b) this.f8205E.get(i10));
        }
        for (int i11 = 0; i11 < this.f8206F.size(); i11++) {
            g4.D(15, (AbstractC0605b) this.f8206F.get(i11));
        }
        for (int i12 = 0; i12 < this.f8207G.size(); i12++) {
            g4.D(16, (AbstractC0605b) this.f8207G.get(i12));
        }
        for (int i13 = 0; i13 < this.f8224y.size(); i13++) {
            g4.D(17, (AbstractC0605b) this.f8224y.get(i13));
        }
        for (int i14 = 0; i14 < this.f8203C.size(); i14++) {
            g4.B(31, ((Integer) this.f8203C.get(i14)).intValue());
        }
        for (int i15 = 0; i15 < this.f8204D.size(); i15++) {
            g4.D(32, (AbstractC0605b) this.f8204D.get(i15));
        }
        for (int i16 = 0; i16 < this.f8208H.size(); i16++) {
            g4.D(33, (AbstractC0605b) this.f8208H.get(i16));
        }
        for (int i17 = 0; i17 < this.I.size(); i17++) {
            g4.D(34, (AbstractC0605b) this.I.get(i17));
        }
        for (int i18 = 0; i18 < this.J.size(); i18++) {
            g4.D(35, (AbstractC0605b) this.J.get(i18));
        }
        eVar.u1(19000, g4);
        g4.G(this.f8211l);
    }

    public final void p() {
        this.f8213n = 518;
        this.f8214o = 2054;
        this.f8215p = 0;
        U u5 = U.f8290D;
        this.f8216q = u5;
        this.f8217r = 0;
        List list = Collections.EMPTY_LIST;
        this.f8218s = list;
        this.f8219t = u5;
        this.f8220u = 0;
        this.f8221v = list;
        this.f8222w = list;
        this.f8224y = list;
        this.f8225z = c0.f8395x;
        this.f8201A = 0;
        this.f8202B = 0;
        this.f8203C = list;
        this.f8204D = list;
        this.f8205E = list;
        this.f8206F = list;
        this.f8207G = list;
        this.f8208H = list;
        this.I = list;
        this.J = list;
    }

    public J() {
        this.f8223x = -1;
        this.f8209K = (byte) -1;
        this.f8210L = -1;
        this.f8211l = AbstractC0608e.f9883k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0413  */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J(X4.C0609f r23, X4.C0611h r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.J.<init>(X4.f, X4.h):void");
    }
}
