package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0615l;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class B extends AbstractC0615l {
    public static final B I;
    public static final C0570a J = new C0570a(10);

    /* renamed from: A, reason: collision with root package name */
    public a0 f8119A;

    /* renamed from: B, reason: collision with root package name */
    public List f8120B;

    /* renamed from: C, reason: collision with root package name */
    public C0585p f8121C;

    /* renamed from: D, reason: collision with root package name */
    public List f8122D;

    /* renamed from: E, reason: collision with root package name */
    public List f8123E;

    /* renamed from: F, reason: collision with root package name */
    public List f8124F;

    /* renamed from: G, reason: collision with root package name */
    public byte f8125G;

    /* renamed from: H, reason: collision with root package name */
    public int f8126H;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8127l;

    /* renamed from: m, reason: collision with root package name */
    public int f8128m;

    /* renamed from: n, reason: collision with root package name */
    public int f8129n;

    /* renamed from: o, reason: collision with root package name */
    public int f8130o;

    /* renamed from: p, reason: collision with root package name */
    public int f8131p;

    /* renamed from: q, reason: collision with root package name */
    public U f8132q;

    /* renamed from: r, reason: collision with root package name */
    public int f8133r;

    /* renamed from: s, reason: collision with root package name */
    public List f8134s;

    /* renamed from: t, reason: collision with root package name */
    public U f8135t;

    /* renamed from: u, reason: collision with root package name */
    public int f8136u;

    /* renamed from: v, reason: collision with root package name */
    public List f8137v;

    /* renamed from: w, reason: collision with root package name */
    public List f8138w;

    /* renamed from: x, reason: collision with root package name */
    public int f8139x;

    /* renamed from: y, reason: collision with root package name */
    public List f8140y;

    /* renamed from: z, reason: collision with root package name */
    public List f8141z;

    static {
        B b4 = new B();
        I = b4;
        b4.p();
    }

    public B(A a) {
        super(a);
        this.f8139x = -1;
        this.f8125G = (byte) -1;
        this.f8126H = -1;
        this.f8127l = a.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8125G;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i7 = this.f8128m;
        if ((i7 & 4) != 4) {
            this.f8125G = (byte) 0;
            return false;
        }
        if ((i7 & 8) == 8 && !this.f8132q.a()) {
            this.f8125G = (byte) 0;
            return false;
        }
        for (int i8 = 0; i8 < this.f8134s.size(); i8++) {
            if (!((Z) this.f8134s.get(i8)).a()) {
                this.f8125G = (byte) 0;
                return false;
            }
        }
        if ((this.f8128m & 32) == 32 && !this.f8135t.a()) {
            this.f8125G = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f8137v.size(); i9++) {
            if (!((U) this.f8137v.get(i9)).a()) {
                this.f8125G = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f8140y.size(); i10++) {
            if (!((c0) this.f8140y.get(i10)).a()) {
                this.f8125G = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f8141z.size(); i11++) {
            if (!((c0) this.f8141z.get(i11)).a()) {
                this.f8125G = (byte) 0;
                return false;
            }
        }
        if ((this.f8128m & 128) == 128 && !this.f8119A.a()) {
            this.f8125G = (byte) 0;
            return false;
        }
        if ((this.f8128m & 256) == 256 && !this.f8121C.a()) {
            this.f8125G = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f8122D.size(); i12++) {
            if (!((C0581l) this.f8122D.get(i12)).a()) {
                this.f8125G = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f8123E.size(); i13++) {
            if (!((C0577h) this.f8123E.get(i13)).a()) {
                this.f8125G = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f8124F.size(); i14++) {
            if (!((C0577h) this.f8124F.get(i14)).a()) {
                this.f8125G = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f8125G = (byte) 1;
            return true;
        }
        this.f8125G = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return I;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8126H;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8128m & 2) == 2 ? B1.G.e(1, this.f8130o) : 0;
        if ((this.f8128m & 4) == 4) {
            iE += B1.G.e(2, this.f8131p);
        }
        if ((this.f8128m & 8) == 8) {
            iE += B1.G.g(3, this.f8132q);
        }
        for (int i8 = 0; i8 < this.f8134s.size(); i8++) {
            iE += B1.G.g(4, (AbstractC0605b) this.f8134s.get(i8));
        }
        if ((this.f8128m & 32) == 32) {
            iE += B1.G.g(5, this.f8135t);
        }
        for (int i9 = 0; i9 < this.f8141z.size(); i9++) {
            iE += B1.G.g(6, (AbstractC0605b) this.f8141z.get(i9));
        }
        if ((this.f8128m & 16) == 16) {
            iE += B1.G.e(7, this.f8133r);
        }
        if ((this.f8128m & 64) == 64) {
            iE += B1.G.e(8, this.f8136u);
        }
        if ((this.f8128m & 1) == 1) {
            iE += B1.G.e(9, this.f8129n);
        }
        for (int i10 = 0; i10 < this.f8137v.size(); i10++) {
            iE += B1.G.g(10, (AbstractC0605b) this.f8137v.get(i10));
        }
        int iF = 0;
        for (int i11 = 0; i11 < this.f8138w.size(); i11++) {
            iF += B1.G.f(((Integer) this.f8138w.get(i11)).intValue());
        }
        int iG = iE + iF;
        if (!this.f8138w.isEmpty()) {
            iG = iG + 1 + B1.G.f(iF);
        }
        this.f8139x = iF;
        for (int i12 = 0; i12 < this.f8123E.size(); i12++) {
            iG += B1.G.g(12, (AbstractC0605b) this.f8123E.get(i12));
        }
        for (int i13 = 0; i13 < this.f8140y.size(); i13++) {
            iG += B1.G.g(13, (AbstractC0605b) this.f8140y.get(i13));
        }
        if ((this.f8128m & 128) == 128) {
            iG += B1.G.g(30, this.f8119A);
        }
        int iF2 = 0;
        for (int i14 = 0; i14 < this.f8120B.size(); i14++) {
            iF2 += B1.G.f(((Integer) this.f8120B.get(i14)).intValue());
        }
        int size = (this.f8120B.size() * 2) + iG + iF2;
        if ((this.f8128m & 256) == 256) {
            size += B1.G.g(32, this.f8121C);
        }
        for (int i15 = 0; i15 < this.f8122D.size(); i15++) {
            size += B1.G.g(33, (AbstractC0605b) this.f8122D.get(i15));
        }
        for (int i16 = 0; i16 < this.f8124F.size(); i16++) {
            size += B1.G.g(34, (AbstractC0605b) this.f8124F.get(i16));
        }
        int size2 = this.f8127l.size() + j() + size;
        this.f8126H = size2;
        return size2;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return A.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        A aH = A.h();
        aH.i(this);
        return aH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8128m & 2) == 2) {
            g4.B(1, this.f8130o);
        }
        if ((this.f8128m & 4) == 4) {
            g4.B(2, this.f8131p);
        }
        if ((this.f8128m & 8) == 8) {
            g4.D(3, this.f8132q);
        }
        for (int i7 = 0; i7 < this.f8134s.size(); i7++) {
            g4.D(4, (AbstractC0605b) this.f8134s.get(i7));
        }
        if ((this.f8128m & 32) == 32) {
            g4.D(5, this.f8135t);
        }
        for (int i8 = 0; i8 < this.f8141z.size(); i8++) {
            g4.D(6, (AbstractC0605b) this.f8141z.get(i8));
        }
        if ((this.f8128m & 16) == 16) {
            g4.B(7, this.f8133r);
        }
        if ((this.f8128m & 64) == 64) {
            g4.B(8, this.f8136u);
        }
        if ((this.f8128m & 1) == 1) {
            g4.B(9, this.f8129n);
        }
        for (int i9 = 0; i9 < this.f8137v.size(); i9++) {
            g4.D(10, (AbstractC0605b) this.f8137v.get(i9));
        }
        if (this.f8138w.size() > 0) {
            g4.K(90);
            g4.K(this.f8139x);
        }
        for (int i10 = 0; i10 < this.f8138w.size(); i10++) {
            g4.C(((Integer) this.f8138w.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.f8123E.size(); i11++) {
            g4.D(12, (AbstractC0605b) this.f8123E.get(i11));
        }
        for (int i12 = 0; i12 < this.f8140y.size(); i12++) {
            g4.D(13, (AbstractC0605b) this.f8140y.get(i12));
        }
        if ((this.f8128m & 128) == 128) {
            g4.D(30, this.f8119A);
        }
        for (int i13 = 0; i13 < this.f8120B.size(); i13++) {
            g4.B(31, ((Integer) this.f8120B.get(i13)).intValue());
        }
        if ((this.f8128m & 256) == 256) {
            g4.D(32, this.f8121C);
        }
        for (int i14 = 0; i14 < this.f8122D.size(); i14++) {
            g4.D(33, (AbstractC0605b) this.f8122D.get(i14));
        }
        for (int i15 = 0; i15 < this.f8124F.size(); i15++) {
            g4.D(34, (AbstractC0605b) this.f8124F.get(i15));
        }
        eVar.u1(19000, g4);
        g4.G(this.f8127l);
    }

    public final void p() {
        this.f8129n = 6;
        this.f8130o = 6;
        this.f8131p = 0;
        U u5 = U.f8290D;
        this.f8132q = u5;
        this.f8133r = 0;
        List list = Collections.EMPTY_LIST;
        this.f8134s = list;
        this.f8135t = u5;
        this.f8136u = 0;
        this.f8137v = list;
        this.f8138w = list;
        this.f8140y = list;
        this.f8141z = list;
        this.f8119A = a0.f8362q;
        this.f8120B = list;
        this.f8121C = C0585p.f8586o;
        this.f8122D = list;
        this.f8123E = list;
        this.f8124F = list;
    }

    public B() {
        this.f8139x = -1;
        this.f8125G = (byte) -1;
        this.f8126H = -1;
        this.f8127l = AbstractC0608e.f9883k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0385  */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B(X4.C0609f r22, X4.C0611h r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.B.<init>(X4.f, X4.h):void");
    }
}
