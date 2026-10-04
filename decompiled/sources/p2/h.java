package p2;

import B1.B;
import B1.K;
import C1.w;
import H1.C0221b;
import V1.G;
import android.util.SparseArray;
import b1.AbstractC0703b;
import j3.E;
import j3.X;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import s2.InterfaceC1980h;
import y1.C2392n;
import y1.C2393o;
import y1.D;

/* loaded from: classes.dex */
public final class h implements V1.n {
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K, reason: collision with root package name */
    public static final C2393o f14227K;

    /* renamed from: A, reason: collision with root package name */
    public int f14228A;

    /* renamed from: B, reason: collision with root package name */
    public int f14229B;

    /* renamed from: C, reason: collision with root package name */
    public int f14230C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14231D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f14232E;

    /* renamed from: F, reason: collision with root package name */
    public V1.p f14233F;

    /* renamed from: G, reason: collision with root package name */
    public G[] f14234G;

    /* renamed from: H, reason: collision with root package name */
    public G[] f14235H;
    public boolean I;
    public final InterfaceC1980h a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14236b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14237c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f14238d;

    /* renamed from: e, reason: collision with root package name */
    public final B f14239e;

    /* renamed from: f, reason: collision with root package name */
    public final B f14240f;

    /* renamed from: g, reason: collision with root package name */
    public final B f14241g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f14242h;

    /* renamed from: i, reason: collision with root package name */
    public final B f14243i;

    /* renamed from: j, reason: collision with root package name */
    public final L2.e f14244j;

    /* renamed from: k, reason: collision with root package name */
    public final B f14245k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f14246l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f14247m;

    /* renamed from: n, reason: collision with root package name */
    public final w f14248n;

    /* renamed from: o, reason: collision with root package name */
    public X f14249o;

    /* renamed from: p, reason: collision with root package name */
    public int f14250p;

    /* renamed from: q, reason: collision with root package name */
    public int f14251q;

    /* renamed from: r, reason: collision with root package name */
    public long f14252r;

    /* renamed from: s, reason: collision with root package name */
    public int f14253s;

    /* renamed from: t, reason: collision with root package name */
    public B f14254t;

    /* renamed from: u, reason: collision with root package name */
    public long f14255u;

    /* renamed from: v, reason: collision with root package name */
    public int f14256v;

    /* renamed from: w, reason: collision with root package name */
    public long f14257w;

    /* renamed from: x, reason: collision with root package name */
    public long f14258x;

    /* renamed from: y, reason: collision with root package name */
    public long f14259y;

    /* renamed from: z, reason: collision with root package name */
    public g f14260z;

    static {
        C2392n c2392n = new C2392n();
        c2392n.f18074m = D.m("application/x-emsg");
        f14227K = new C2393o(c2392n);
    }

    public h(InterfaceC1980h interfaceC1980h, int i7) {
        E e7 = j3.G.f12277l;
        X x7 = X.f12304o;
        this.a = interfaceC1980h;
        this.f14236b = i7;
        this.f14237c = Collections.unmodifiableList(x7);
        this.f14244j = new L2.e(23);
        this.f14245k = new B(16);
        this.f14239e = new B(C1.r.a);
        this.f14240f = new B(6);
        this.f14241g = new B();
        byte[] bArr = new byte[16];
        this.f14242h = bArr;
        this.f14243i = new B(bArr);
        this.f14246l = new ArrayDeque();
        this.f14247m = new ArrayDeque();
        this.f14238d = new SparseArray();
        this.f14249o = x7;
        this.f14258x = -9223372036854775807L;
        this.f14257w = -9223372036854775807L;
        this.f14259y = -9223372036854775807L;
        this.f14233F = V1.p.f9403f;
        this.f14234G = new G[0];
        this.f14235H = new G[0];
        this.f14248n = new w(new e(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y1.C2389k c(java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.c(java.util.ArrayList):y1.k");
    }

    public static void g(B b4, int i7, r rVar) throws y1.E {
        b4.F(i7 + 8);
        int iG = b4.g();
        byte[] bArr = c.a;
        if ((iG & 1) != 0) {
            throw y1.E.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z7 = (iG & 2) != 0;
        int iX = b4.x();
        if (iX == 0) {
            Arrays.fill(rVar.f14329l, 0, rVar.f14322e, false);
            return;
        }
        if (iX != rVar.f14322e) {
            StringBuilder sbP = AbstractC0703b.p(iX, "Senc sample count ", " is different from fragment sample count");
            sbP.append(rVar.f14322e);
            throw y1.E.a(null, sbP.toString());
        }
        Arrays.fill(rVar.f14329l, 0, iX, z7);
        int iA = b4.a();
        B b7 = rVar.f14331n;
        b7.C(iA);
        rVar.f14328k = true;
        rVar.f14332o = true;
        b4.e(b7.a, 0, b7.f289c);
        b7.F(0);
        rVar.f14332o = false;
    }

    @Override // V1.n
    public final boolean b(V1.o oVar) {
        X xW;
        V1.E eJ = o.j(oVar, true, false);
        if (eJ != null) {
            xW = j3.G.w(eJ);
        } else {
            E e7 = j3.G.f12277l;
            xW = X.f12304o;
        }
        this.f14249o = xW;
        return eJ == null;
    }

    @Override // V1.n
    public final void d(V1.p pVar) {
        int i7;
        int i8 = this.f14236b;
        if ((i8 & 32) == 0) {
            pVar = new C0221b(pVar, this.a);
        }
        this.f14233F = pVar;
        int i9 = 0;
        this.f14250p = 0;
        this.f14253s = 0;
        G[] gArr = new G[2];
        this.f14234G = gArr;
        int i10 = 100;
        if ((i8 & 4) != 0) {
            gArr[0] = pVar.m(100, 5);
            i7 = 1;
            i10 = 101;
        } else {
            i7 = 0;
        }
        G[] gArr2 = (G[]) K.H(i7, this.f14234G);
        this.f14234G = gArr2;
        for (G g4 : gArr2) {
            g4.a(f14227K);
        }
        List list = this.f14237c;
        this.f14235H = new G[list.size()];
        while (i9 < this.f14235H.length) {
            G gM = this.f14233F.m(i10, 3);
            gM.a((C2393o) list.get(i9));
            this.f14235H[i9] = gM;
            i9++;
            i10++;
        }
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        SparseArray sparseArray = this.f14238d;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((g) sparseArray.valueAt(i7)).f();
        }
        this.f14247m.clear();
        this.f14256v = 0;
        ((PriorityQueue) this.f14248n.f632e).clear();
        this.f14257w = j8;
        this.f14246l.clear();
        this.f14250p = 0;
        this.f14253s = 0;
    }

    @Override // V1.n
    public final List f() {
        return this.f14249o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:337:0x07d5, code lost:
    
        r57.f14250p = 0;
        r57.f14253s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x07da, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r58) throws y1.E {
        /*
            Method dump skipped, instructions count: 2011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.h(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dd, code lost:
    
        if (r34.f14229B >= r34.f14228A) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01df, code lost:
    
        r5 = r34.f14230C;
        r6 = r2.f14309g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e3, code lost:
    
        if (r5 != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e5, code lost:
    
        r5 = r34.f14235H.length;
        r17 = r3;
        r3 = r2.f14313k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
    
        if (r5 > 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
    
        if (r34.f14231D != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f3, code lost:
    
        r21 = r2;
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f8, code lost:
    
        r5 = C1.r.e(r6);
        r21 = r2;
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020a, code lost:
    
        if ((r3 + r5) > (r34.f14228A - r34.f14229B)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020d, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020e, code lost:
    
        r31 = r14;
        ((V1.k) r35).a(r12, r13, r18 + r5, false);
        r15.F(0);
        r2 = r15.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0220, code lost:
    
        if (r2 < 0) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0222, code lost:
    
        r34.f14230C = r2 - r5;
        r2 = r34.f14239e;
        r2.F(0);
        r4.c(r2, 4, 0);
        r34.f14229B += 4;
        r34.f14228A += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023b, code lost:
    
        if (r34.f14235H.length <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023d, code lost:
    
        if (r5 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023f, code lost:
    
        r2 = r12[4];
        r3 = java.util.Objects.equals(r6.f18112n, "video/avc");
        r14 = r6.f18109k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0249, code lost:
    
        if (r3 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024f, code lost:
    
        if (y1.D.b(r14, "video/avc") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0252, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0256, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025b, code lost:
    
        if ((r2 & 31) == 6) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0263, code lost:
    
        if (java.util.Objects.equals(r6.f18112n, r7) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0269, code lost:
    
        if (y1.D.b(r14, r7) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0273, code lost:
    
        if (((r18 & 126) >> 1) != 39) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0275, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0278, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0279, code lost:
    
        r34.f14232E = r3;
        r4.c(r15, r5, 0);
        r34.f14229B += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0284, code lost:
    
        if (r5 <= 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0288, code lost:
    
        if (r34.f14231D != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x028e, code lost:
    
        if (C1.r.d(r12, r5, r6) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0290, code lost:
    
        r34.f14231D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0293, code lost:
    
        r3 = r17;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0297, code lost:
    
        r14 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a3, code lost:
    
        throw y1.E.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02a4, code lost:
    
        r21 = r2;
        r17 = r3;
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ad, code lost:
    
        if (r34.f14232E == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02af, code lost:
    
        r3 = r34.f14241g;
        r3.C(r5);
        r23 = r7;
        ((V1.k) r35).a(r3.a, 0, r34.f14230C, false);
        r4.c(r3, r34.f14230C, 0);
        r2 = r34.f14230C;
        r5 = C1.r.n(r3.a, r3.f289c);
        r3.F(0);
        r3.E(r5);
        r5 = r6.f18114p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d9, code lost:
    
        if (r5 != (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02dd, code lost:
    
        if (r9.a == 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02df, code lost:
    
        r9.a = 0;
        r9.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02e7, code lost:
    
        if (r9.a == r5) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02e9, code lost:
    
        if (r5 < 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02eb, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ed, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ee, code lost:
    
        B1.AbstractC0015b.h(r6);
        r9.a = r5;
        r9.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f6, code lost:
    
        r9.a(r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0302, code lost:
    
        if ((r17.a() & 4) == 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0304, code lost:
    
        r9.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0308, code lost:
    
        r23 = r7;
        r2 = r4.d(r35, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x030f, code lost:
    
        r34.f14229B += r2;
        r34.f14230C -= r2;
        r3 = r17;
        r2 = r21;
        r7 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0321, code lost:
    
        r17 = r3;
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0326, code lost:
    
        r17 = r3;
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x032a, code lost:
    
        r2 = r34.f14229B;
        r3 = r34.f14228A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x032e, code lost:
    
        if (r2 >= r3) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0330, code lost:
    
        r34.f14229B += r4.d(r35, r3 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033c, code lost:
    
        r0 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0342, code lost:
    
        if (r34.f14231D != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0344, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0347, code lost:
    
        r26 = r0;
        r0 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x034d, code lost:
    
        if (r0 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x034f, code lost:
    
        r29 = r0.f14316c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0354, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0356, code lost:
    
        r4.b(r10, r26, r34.f14228A, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0367, code lost:
    
        if (r31.isEmpty() != false) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0369, code lost:
    
        r0 = (p2.f) r31.removeFirst();
        r34.f14256v -= r0.f14214c;
        r2 = r0.f14213b;
        r3 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x037a, code lost:
    
        if (r2 == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x037c, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x037e, code lost:
    
        r6 = r3;
        r2 = r34.f14234G;
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0383, code lost:
    
        if (r4 >= r3) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0385, code lost:
    
        r2[r4].b(r6, 1, r0.f14214c, r34.f14256v, null);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0399, code lost:
    
        if (r17.c() != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x039b, code lost:
    
        r34.f14260z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x039e, code lost:
    
        r34.f14250p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a3, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        r2 = r34.f14250p;
        r4 = r3.a;
        r7 = "video/hevc";
        r10 = r3.f14215b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
    
        if (r2 != 3) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r3.f14226m != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r2 = r3.f14217d.f14337d[r3.f14219f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        r2 = r10.f14325h[r3.f14219f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
    
        r34.f14228A = r2;
        r2 = r3.f14217d.a.f14309g;
        r11 = java.util.Objects.equals(r2.f18112n, "video/avc");
        r13 = r34.f14236b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r11 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
    
        if ((r13 & 64) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0109, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        if (java.util.Objects.equals(r2.f18112n, "video/hevc") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        if ((r13 & 128) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
    
        r34.f14231D = r2 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0120, code lost:
    
        if (r3.f14219f >= r3.f14222i) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0122, code lost:
    
        ((V1.k) r35).f(r34.f14228A);
        r0 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        r2 = r10.f14331n;
        r0 = r0.f14317d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        if (r0 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0136, code lost:
    
        r2.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        r0 = r3.f14219f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013d, code lost:
    
        if (r10.f14328k == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0143, code lost:
    
        if (r10.f14329l[r0] == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0145, code lost:
    
        r2.G(r2.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
    
        if (r3.c() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0153, code lost:
    
        r34.f14260z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0155, code lost:
    
        r34.f14250p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0161, code lost:
    
        if (r3.f14217d.a.f14310h != r22) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0163, code lost:
    
        r34.f14228A -= 8;
        ((V1.k) r35).f(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017f, code lost:
    
        if ("audio/ac4".equals(r3.f14217d.a.f14309g.f18112n) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0181, code lost:
    
        r34.f14229B = r3.d(r34.f14228A, 7);
        r2 = r34.f14228A;
        r13 = r34.f14243i;
        V1.AbstractC0597b.g(r2, r13);
        r4.c(r13, 7, 0);
        r34.f14229B += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019a, code lost:
    
        r34.f14229B = r3.d(r34.f14228A, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a2, code lost:
    
        r34.f14228A += r34.f14229B;
        r34.f14250p = 4;
        r34.f14230C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
    
        r2 = r3.f14217d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b2, code lost:
    
        if (r3.f14226m != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b4, code lost:
    
        r15 = r2.f14339f[r3.f14219f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ba, code lost:
    
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bc, code lost:
    
        r15 = r10.f14326i[r3.f14219f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c3, code lost:
    
        r2 = r2.a;
        r13 = r2.f14313k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c7, code lost:
    
        if (r13 == 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c9, code lost:
    
        r15 = r34.f14240f;
        r12 = r15.a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r18] = 0;
        r13 = 4 - r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r35, V1.r r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.i(V1.o, V1.r):int");
    }

    @Override // V1.n
    public final void a() {
    }
}
