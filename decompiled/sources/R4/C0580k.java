package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0615l;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580k extends AbstractC0615l {

    /* renamed from: Q, reason: collision with root package name */
    public static final C0580k f8527Q;

    /* renamed from: R, reason: collision with root package name */
    public static final C0570a f8528R = new C0570a(3);

    /* renamed from: A, reason: collision with root package name */
    public List f8529A;

    /* renamed from: B, reason: collision with root package name */
    public List f8530B;

    /* renamed from: C, reason: collision with root package name */
    public List f8531C;

    /* renamed from: D, reason: collision with root package name */
    public List f8532D;

    /* renamed from: E, reason: collision with root package name */
    public List f8533E;

    /* renamed from: F, reason: collision with root package name */
    public int f8534F;

    /* renamed from: G, reason: collision with root package name */
    public int f8535G;

    /* renamed from: H, reason: collision with root package name */
    public U f8536H;
    public int I;
    public List J;

    /* renamed from: K, reason: collision with root package name */
    public a0 f8537K;

    /* renamed from: L, reason: collision with root package name */
    public List f8538L;

    /* renamed from: M, reason: collision with root package name */
    public h0 f8539M;

    /* renamed from: N, reason: collision with root package name */
    public List f8540N;

    /* renamed from: O, reason: collision with root package name */
    public byte f8541O;

    /* renamed from: P, reason: collision with root package name */
    public int f8542P;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8543l;

    /* renamed from: m, reason: collision with root package name */
    public int f8544m;

    /* renamed from: n, reason: collision with root package name */
    public int f8545n;

    /* renamed from: o, reason: collision with root package name */
    public int f8546o;

    /* renamed from: p, reason: collision with root package name */
    public int f8547p;

    /* renamed from: q, reason: collision with root package name */
    public List f8548q;

    /* renamed from: r, reason: collision with root package name */
    public List f8549r;

    /* renamed from: s, reason: collision with root package name */
    public List f8550s;

    /* renamed from: t, reason: collision with root package name */
    public int f8551t;

    /* renamed from: u, reason: collision with root package name */
    public List f8552u;

    /* renamed from: v, reason: collision with root package name */
    public int f8553v;

    /* renamed from: w, reason: collision with root package name */
    public List f8554w;

    /* renamed from: x, reason: collision with root package name */
    public List f8555x;

    /* renamed from: y, reason: collision with root package name */
    public int f8556y;

    /* renamed from: z, reason: collision with root package name */
    public List f8557z;

    static {
        C0580k c0580k = new C0580k();
        f8527Q = c0580k;
        c0580k.p();
    }

    public C0580k(C0578i c0578i) {
        super(c0578i);
        this.f8551t = -1;
        this.f8553v = -1;
        this.f8556y = -1;
        this.f8534F = -1;
        this.f8541O = (byte) -1;
        this.f8542P = -1;
        this.f8543l = c0578i.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8541O;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8544m & 2) != 2) {
            this.f8541O = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f8548q.size(); i7++) {
            if (!((Z) this.f8548q.get(i7)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f8549r.size(); i8++) {
            if (!((U) this.f8549r.get(i8)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f8554w.size(); i9++) {
            if (!((U) this.f8554w.get(i9)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f8557z.size(); i10++) {
            if (!((C0583n) this.f8557z.get(i10)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f8529A.size(); i11++) {
            if (!((B) this.f8529A.get(i11)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f8530B.size(); i12++) {
            if (!((J) this.f8530B.get(i12)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f8531C.size(); i13++) {
            if (!((W) this.f8531C.get(i13)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f8532D.size(); i14++) {
            if (!((C0591w) this.f8532D.get(i14)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        if ((this.f8544m & 16) == 16 && !this.f8536H.a()) {
            this.f8541O = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.J.size(); i15++) {
            if (!((C0577h) this.J.get(i15)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        if ((this.f8544m & 64) == 64 && !this.f8537K.a()) {
            this.f8541O = (byte) 0;
            return false;
        }
        for (int i16 = 0; i16 < this.f8540N.size(); i16++) {
            if (!((C0581l) this.f8540N.get(i16)).a()) {
                this.f8541O = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f8541O = (byte) 1;
            return true;
        }
        this.f8541O = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8527Q;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8542P;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8544m & 1) == 1 ? B1.G.e(1, this.f8545n) : 0;
        int iF = 0;
        for (int i8 = 0; i8 < this.f8550s.size(); i8++) {
            iF += B1.G.f(((Integer) this.f8550s.get(i8)).intValue());
        }
        int iG = iE + iF;
        if (!this.f8550s.isEmpty()) {
            iG = iG + 1 + B1.G.f(iF);
        }
        this.f8551t = iF;
        if ((this.f8544m & 2) == 2) {
            iG += B1.G.e(3, this.f8546o);
        }
        if ((this.f8544m & 4) == 4) {
            iG += B1.G.e(4, this.f8547p);
        }
        for (int i9 = 0; i9 < this.f8548q.size(); i9++) {
            iG += B1.G.g(5, (AbstractC0605b) this.f8548q.get(i9));
        }
        for (int i10 = 0; i10 < this.f8549r.size(); i10++) {
            iG += B1.G.g(6, (AbstractC0605b) this.f8549r.get(i10));
        }
        int iF2 = 0;
        for (int i11 = 0; i11 < this.f8552u.size(); i11++) {
            iF2 += B1.G.f(((Integer) this.f8552u.get(i11)).intValue());
        }
        int iG2 = iG + iF2;
        if (!this.f8552u.isEmpty()) {
            iG2 = iG2 + 1 + B1.G.f(iF2);
        }
        this.f8553v = iF2;
        for (int i12 = 0; i12 < this.f8557z.size(); i12++) {
            iG2 += B1.G.g(8, (AbstractC0605b) this.f8557z.get(i12));
        }
        for (int i13 = 0; i13 < this.f8529A.size(); i13++) {
            iG2 += B1.G.g(9, (AbstractC0605b) this.f8529A.get(i13));
        }
        for (int i14 = 0; i14 < this.f8530B.size(); i14++) {
            iG2 += B1.G.g(10, (AbstractC0605b) this.f8530B.get(i14));
        }
        for (int i15 = 0; i15 < this.f8531C.size(); i15++) {
            iG2 += B1.G.g(11, (AbstractC0605b) this.f8531C.get(i15));
        }
        for (int i16 = 0; i16 < this.f8532D.size(); i16++) {
            iG2 += B1.G.g(13, (AbstractC0605b) this.f8532D.get(i16));
        }
        int iF3 = 0;
        for (int i17 = 0; i17 < this.f8533E.size(); i17++) {
            iF3 += B1.G.f(((Integer) this.f8533E.get(i17)).intValue());
        }
        int iG3 = iG2 + iF3;
        if (!this.f8533E.isEmpty()) {
            iG3 = iG3 + 2 + B1.G.f(iF3);
        }
        this.f8534F = iF3;
        if ((this.f8544m & 8) == 8) {
            iG3 += B1.G.e(17, this.f8535G);
        }
        if ((this.f8544m & 16) == 16) {
            iG3 += B1.G.g(18, this.f8536H);
        }
        if ((this.f8544m & 32) == 32) {
            iG3 += B1.G.e(19, this.I);
        }
        for (int i18 = 0; i18 < this.f8554w.size(); i18++) {
            iG3 += B1.G.g(20, (AbstractC0605b) this.f8554w.get(i18));
        }
        int iF4 = 0;
        for (int i19 = 0; i19 < this.f8555x.size(); i19++) {
            iF4 += B1.G.f(((Integer) this.f8555x.get(i19)).intValue());
        }
        int iG4 = iG3 + iF4;
        if (!this.f8555x.isEmpty()) {
            iG4 = iG4 + 2 + B1.G.f(iF4);
        }
        this.f8556y = iF4;
        for (int i20 = 0; i20 < this.J.size(); i20++) {
            iG4 += B1.G.g(25, (AbstractC0605b) this.J.get(i20));
        }
        if ((this.f8544m & 64) == 64) {
            iG4 += B1.G.g(30, this.f8537K);
        }
        int iF5 = 0;
        for (int i21 = 0; i21 < this.f8538L.size(); i21++) {
            iF5 += B1.G.f(((Integer) this.f8538L.get(i21)).intValue());
        }
        int size = (this.f8538L.size() * 2) + iG4 + iF5;
        if ((this.f8544m & 128) == 128) {
            size += B1.G.g(32, this.f8539M);
        }
        for (int i22 = 0; i22 < this.f8540N.size(); i22++) {
            size += B1.G.g(33, (AbstractC0605b) this.f8540N.get(i22));
        }
        int size2 = this.f8543l.size() + j() + size;
        this.f8542P = size2;
        return size2;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return C0578i.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0578i c0578iH = C0578i.h();
        c0578iH.i(this);
        return c0578iH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8544m & 1) == 1) {
            g4.B(1, this.f8545n);
        }
        if (this.f8550s.size() > 0) {
            g4.K(18);
            g4.K(this.f8551t);
        }
        for (int i7 = 0; i7 < this.f8550s.size(); i7++) {
            g4.C(((Integer) this.f8550s.get(i7)).intValue());
        }
        if ((this.f8544m & 2) == 2) {
            g4.B(3, this.f8546o);
        }
        if ((this.f8544m & 4) == 4) {
            g4.B(4, this.f8547p);
        }
        for (int i8 = 0; i8 < this.f8548q.size(); i8++) {
            g4.D(5, (AbstractC0605b) this.f8548q.get(i8));
        }
        for (int i9 = 0; i9 < this.f8549r.size(); i9++) {
            g4.D(6, (AbstractC0605b) this.f8549r.get(i9));
        }
        if (this.f8552u.size() > 0) {
            g4.K(58);
            g4.K(this.f8553v);
        }
        for (int i10 = 0; i10 < this.f8552u.size(); i10++) {
            g4.C(((Integer) this.f8552u.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.f8557z.size(); i11++) {
            g4.D(8, (AbstractC0605b) this.f8557z.get(i11));
        }
        for (int i12 = 0; i12 < this.f8529A.size(); i12++) {
            g4.D(9, (AbstractC0605b) this.f8529A.get(i12));
        }
        for (int i13 = 0; i13 < this.f8530B.size(); i13++) {
            g4.D(10, (AbstractC0605b) this.f8530B.get(i13));
        }
        for (int i14 = 0; i14 < this.f8531C.size(); i14++) {
            g4.D(11, (AbstractC0605b) this.f8531C.get(i14));
        }
        for (int i15 = 0; i15 < this.f8532D.size(); i15++) {
            g4.D(13, (AbstractC0605b) this.f8532D.get(i15));
        }
        if (this.f8533E.size() > 0) {
            g4.K(130);
            g4.K(this.f8534F);
        }
        for (int i16 = 0; i16 < this.f8533E.size(); i16++) {
            g4.C(((Integer) this.f8533E.get(i16)).intValue());
        }
        if ((this.f8544m & 8) == 8) {
            g4.B(17, this.f8535G);
        }
        if ((this.f8544m & 16) == 16) {
            g4.D(18, this.f8536H);
        }
        if ((this.f8544m & 32) == 32) {
            g4.B(19, this.I);
        }
        for (int i17 = 0; i17 < this.f8554w.size(); i17++) {
            g4.D(20, (AbstractC0605b) this.f8554w.get(i17));
        }
        if (this.f8555x.size() > 0) {
            g4.K(170);
            g4.K(this.f8556y);
        }
        for (int i18 = 0; i18 < this.f8555x.size(); i18++) {
            g4.C(((Integer) this.f8555x.get(i18)).intValue());
        }
        for (int i19 = 0; i19 < this.J.size(); i19++) {
            g4.D(25, (AbstractC0605b) this.J.get(i19));
        }
        if ((this.f8544m & 64) == 64) {
            g4.D(30, this.f8537K);
        }
        for (int i20 = 0; i20 < this.f8538L.size(); i20++) {
            g4.B(31, ((Integer) this.f8538L.get(i20)).intValue());
        }
        if ((this.f8544m & 128) == 128) {
            g4.D(32, this.f8539M);
        }
        for (int i21 = 0; i21 < this.f8540N.size(); i21++) {
            g4.D(33, (AbstractC0605b) this.f8540N.get(i21));
        }
        eVar.u1(19000, g4);
        g4.G(this.f8543l);
    }

    public final void p() {
        this.f8545n = 6;
        this.f8546o = 0;
        this.f8547p = 0;
        List list = Collections.EMPTY_LIST;
        this.f8548q = list;
        this.f8549r = list;
        this.f8550s = list;
        this.f8552u = list;
        this.f8554w = list;
        this.f8555x = list;
        this.f8557z = list;
        this.f8529A = list;
        this.f8530B = list;
        this.f8531C = list;
        this.f8532D = list;
        this.f8533E = list;
        this.f8535G = 0;
        this.f8536H = U.f8290D;
        this.I = 0;
        this.J = list;
        this.f8537K = a0.f8362q;
        this.f8538L = list;
        this.f8539M = h0.f8490o;
        this.f8540N = list;
    }

    public C0580k() {
        this.f8551t = -1;
        this.f8553v = -1;
        this.f8556y = -1;
        this.f8534F = -1;
        this.f8541O = (byte) -1;
        this.f8542P = -1;
        this.f8543l = AbstractC0608e.f9883k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0580k(X4.C0609f r22, X4.C0611h r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.C0580k.<init>(X4.f, X4.h):void");
    }
}
