package p2;

import B1.B;
import B1.K;
import H1.C0221b;
import V1.A;
import V1.H;
import j3.E;
import j3.G;
import j3.X;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k2.C1386a;
import s2.InterfaceC1980h;

/* loaded from: classes.dex */
public final class k implements V1.n, A {

    /* renamed from: A, reason: collision with root package name */
    public j[] f14267A;

    /* renamed from: B, reason: collision with root package name */
    public long[][] f14268B;

    /* renamed from: C, reason: collision with root package name */
    public int f14269C;

    /* renamed from: D, reason: collision with root package name */
    public long f14270D;

    /* renamed from: E, reason: collision with root package name */
    public int f14271E;

    /* renamed from: F, reason: collision with root package name */
    public C1386a f14272F;
    public final InterfaceC1980h a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14273b;

    /* renamed from: c, reason: collision with root package name */
    public final B f14274c;

    /* renamed from: d, reason: collision with root package name */
    public final B f14275d;

    /* renamed from: e, reason: collision with root package name */
    public final B f14276e;

    /* renamed from: f, reason: collision with root package name */
    public final B f14277f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f14278g;

    /* renamed from: h, reason: collision with root package name */
    public final n f14279h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f14280i;

    /* renamed from: j, reason: collision with root package name */
    public X f14281j;

    /* renamed from: k, reason: collision with root package name */
    public int f14282k;

    /* renamed from: l, reason: collision with root package name */
    public int f14283l;

    /* renamed from: m, reason: collision with root package name */
    public long f14284m;

    /* renamed from: n, reason: collision with root package name */
    public int f14285n;

    /* renamed from: o, reason: collision with root package name */
    public B f14286o;

    /* renamed from: p, reason: collision with root package name */
    public int f14287p;

    /* renamed from: q, reason: collision with root package name */
    public int f14288q;

    /* renamed from: r, reason: collision with root package name */
    public int f14289r;

    /* renamed from: s, reason: collision with root package name */
    public int f14290s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14291t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14292u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14293v;

    /* renamed from: w, reason: collision with root package name */
    public long f14294w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14295x;

    /* renamed from: y, reason: collision with root package name */
    public long f14296y;

    /* renamed from: z, reason: collision with root package name */
    public V1.p f14297z;

    public k(InterfaceC1980h interfaceC1980h, int i7) {
        this.a = interfaceC1980h;
        this.f14273b = i7;
        E e7 = G.f12277l;
        this.f14281j = X.f12304o;
        this.f14282k = (i7 & 4) != 0 ? 3 : 0;
        this.f14279h = new n();
        this.f14280i = new ArrayList();
        this.f14277f = new B(16);
        this.f14278g = new ArrayDeque();
        this.f14274c = new B(C1.r.a);
        this.f14275d = new B(6);
        this.f14276e = new B();
        this.f14287p = -1;
        this.f14297z = V1.p.f9403f;
        this.f14267A = new j[0];
    }

    @Override // V1.n
    public final boolean b(V1.o oVar) {
        X xW;
        V1.E eJ = o.j(oVar, false, (this.f14273b & 2) != 0);
        if (eJ != null) {
            xW = G.w(eJ);
        } else {
            E e7 = G.f12277l;
            xW = X.f12304o;
        }
        this.f14281j = xW;
        return eJ == null;
    }

    @Override // V1.n
    public final void d(V1.p pVar) {
        if ((this.f14273b & 16) == 0) {
            pVar = new C0221b(pVar, this.a);
        }
        this.f14297z = pVar;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        this.f14278g.clear();
        this.f14285n = 0;
        this.f14287p = -1;
        this.f14288q = 0;
        this.f14289r = 0;
        this.f14290s = 0;
        this.f14291t = false;
        if (j7 == 0) {
            if (this.f14282k != 3) {
                this.f14282k = 0;
                this.f14285n = 0;
                return;
            } else {
                n nVar = this.f14279h;
                nVar.a.clear();
                nVar.f14302b = 0;
                this.f14280i.clear();
                return;
            }
        }
        for (j jVar : this.f14267A) {
            s sVar = jVar.f14263b;
            int iD = K.d(sVar.f14339f, j8, false);
            while (true) {
                if (iD < 0) {
                    iD = -1;
                    break;
                } else if ((sVar.f14340g[iD] & 1) != 0) {
                    break;
                } else {
                    iD--;
                }
            }
            if (iD == -1) {
                iD = sVar.a(j8);
            }
            jVar.f14266e = iD;
            H h7 = jVar.f14265d;
            if (h7 != null) {
                h7.f9322b = false;
                h7.f9323c = 0;
            }
        }
    }

    @Override // V1.n
    public final List f() {
        return this.f14281j;
    }

    @Override // V1.A
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x020c, code lost:
    
        r3 = new B1.B(8);
        r44.readFully(r3.a, r6, 8);
        r11.f14303c = r3.i() + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0227, code lost:
    
        if (r3.g() == 1397048916) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0229, code lost:
    
        r45.a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022f, code lost:
    
        r45.a = r44.p() - (r11.f14303c - 12);
        r11.f14302b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0240, code lost:
    
        r3 = r44.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0246, code lost:
    
        if (r3 == (-1)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024a, code lost:
    
        if (r3 >= 8) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024d, code lost:
    
        r3 = r3 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r11 != r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0250, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0252, code lost:
    
        r45.a = r3;
        r0 = 1;
        r11.f14302b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025d, code lost:
    
        if (r45.a != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x025f, code lost:
    
        r43.f14282k = 0;
        r43.f14285n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0264, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026d, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026e, code lost:
    
        r31 = r8;
        r4 = r44.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r3 = r43.f14280i;
        r11 = r43.f14279h;
        r12 = r11.f14302b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0277, code lost:
    
        if (r43.f14287p != (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0279, code lost:
    
        r8 = -1;
        r9 = -1;
        r10 = true;
        r11 = true;
        r12 = 0;
        r13 = Long.MAX_VALUE;
        r16 = Long.MAX_VALUE;
        r32 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0292, code lost:
    
        r6 = r43.f14267A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0295, code lost:
    
        if (r12 >= r6.length) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0297, code lost:
    
        r6 = r6[r12];
        r7 = r6.f14266e;
        r6 = r6.f14263b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029f, code lost:
    
        if (r7 != r6.f14335b) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a4, code lost:
    
        r37 = r6.f14336c[r7];
        r3 = r43.f14268B;
        r6 = B1.K.a;
        r6 = r3[r12][r7];
        r37 = r37 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b6, code lost:
    
        if (r37 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r12 == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ba, code lost:
    
        if (r37 < 262144) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bd, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bf, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c0, code lost:
    
        if (r3 != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c2, code lost:
    
        if (r11 != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c4, code lost:
    
        if (r3 != r11) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c8, code lost:
    
        if (r37 >= r32) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ca, code lost:
    
        r11 = r3;
        r16 = r6;
        r9 = r12;
        r32 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r12 == 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d2, code lost:
    
        if (r6 >= r13) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d4, code lost:
    
        r10 = r3;
        r13 = r6;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d8, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02dd, code lost:
    
        if (r13 == Long.MAX_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02df, code lost:
    
        if (r10 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e7, code lost:
    
        if (r16 >= (r13 + 10485760)) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e9, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r15 = r11.a;
        r5 = 2817;
        r25 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ea, code lost:
    
        r43.f14287p = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ed, code lost:
    
        if (r8 != (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02f3, code lost:
    
        r3 = r43.f14267A[r43.f14287p];
        r6 = r3.f14264c;
        r14 = r3.f14266e;
        r7 = r3.f14263b;
        r9 = r7.f14336c[r14] + r43.f14296y;
        r8 = r7.f14337d;
        r11 = r8[r14];
        r4 = (r9 - r4) + r43.f14288q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0314, code lost:
    
        if (r4 < 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0318, code lost:
    
        if (r4 < 262144) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x031e, code lost:
    
        r2 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0323, code lost:
    
        if (r2.f14310h != 1) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r12 == r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0325, code lost:
    
        r4 = r4 + 8;
        r11 = r11 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0329, code lost:
    
        r44.f((int) r4);
        r4 = r2.f14309g;
        r5 = java.util.Objects.equals(r4.f18112n, "video/avc");
        r9 = r4.f18112n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0339, code lost:
    
        if (r5 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033d, code lost:
    
        if ((r15 & 32) == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0340, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0348, code lost:
    
        if (java.util.Objects.equals(r9, "video/hevc") == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r12 != r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034c, code lost:
    
        if ((r15 & 128) == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x034e, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0350, code lost:
    
        r43.f14291t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0352, code lost:
    
        r2 = r2.f14313k;
        r5 = r3.f14265d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0356, code lost:
    
        if (r2 == 0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0358, code lost:
    
        r9 = r43.f14275d;
        r12 = r9.a;
        r12[0] = 0;
        r12[r10] = 0;
        r12[2] = 0;
        r10 = 4 - r2;
        r11 = r11 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036b, code lost:
    
        if (r43.f14289r >= r11) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x036d, code lost:
    
        r13 = r43.f14290s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x036f, code lost:
    
        if (r13 != 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r16 = r44.p();
        r11 = (int) ((r44.c() - r44.p()) - r11.f14303c);
        r12 = new B1.B(r11);
        r44.readFully(r12.a, r6, r11);
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0373, code lost:
    
        if (r43.f14291t != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0375, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0381, code lost:
    
        if ((C1.r.e(r4) + r2) > (r8[r14] - r43.f14288q)) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0383, code lost:
    
        r2 = C1.r.e(r4);
        r13 = r16 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038a, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x038c, code lost:
    
        r13 = r16;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x038f, code lost:
    
        r44.readFully(r12, r10, r13);
        r43.f14288q += r13;
        r9.F(0);
        r15 = r9.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x039f, code lost:
    
        if (r15 < 0) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a1, code lost:
    
        r43.f14290s = r15 - r2;
        r15 = r43.f14274c;
        r15.F(0);
        r17 = r8;
        r8 = r31;
        r6.c(r15, r8, 0);
        r43.f14289r += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b5, code lost:
    
        if (r2 <= 0) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03b7, code lost:
    
        r6.c(r9, r2, 0);
        r43.f14289r += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c3, code lost:
    
        if (C1.r.d(r12, r2, r4) == false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03c5, code lost:
    
        r43.f14291t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03c8, code lost:
    
        r2 = r16;
        r8 = r17;
        r31 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03d6, code lost:
    
        throw y1.E.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03d7, code lost:
    
        r16 = r2;
        r17 = r8;
        r8 = r6.d(r44, r13, false);
        r43.f14288q += r8;
        r43.f14289r += r8;
        r43.f14290s -= r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03f0, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r0 >= r15.size()) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03f8, code lost:
    
        if ("audio/ac4".equals(r9) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03fc, code lost:
    
        if (r43.f14289r != 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03fe, code lost:
    
        V1.AbstractC0597b.g(r11, r14);
        r9 = 7;
        r6.c(r14, 7, 0);
        r43.f14289r += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x040e, code lost:
    
        r9 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x040f, code lost:
    
        r11 = r11 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0411, code lost:
    
        if (r5 == null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0413, code lost:
    
        r5.c(r44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0416, code lost:
    
        r2 = r43.f14289r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0418, code lost:
    
        if (r2 >= r11) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r9 = (p2.m) r15.get(r0);
        r12.F((int) (r9.a - r16));
        r12.G(r8);
        r6 = r12.i();
        r7 = java.nio.charset.StandardCharsets.UTF_8;
        r11 = r12.r(r6, r7);
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x041a, code lost:
    
        r2 = r6.d(r44, r11 - r2, false);
        r43.f14288q += r2;
        r43.f14289r += r2;
        r43.f14290s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0431, code lost:
    
        r8 = r7.f14339f[r14];
        r0 = r7.f14340g[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x043b, code lost:
    
        if (r43.f14291t != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x043d, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0440, code lost:
    
        if (r5 == null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0442, code lost:
    
        r5.b(r6, r8, r0, r10, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0454, code lost:
    
        if ((r14 + 1) != r7.f14335b) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0456, code lost:
    
        r5.a(r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x045b, code lost:
    
        r6.b(r8, r0, r10, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0464, code lost:
    
        r3.f14266e++;
        r43.f14287p = -1;
        r43.f14288q = 0;
        r43.f14289r = 0;
        r43.f14290s = 0;
        r43.f14291t = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        switch(r11.hashCode()) {
            case -1711564334: goto L39;
            case -1332107749: goto L35;
            case -1251387154: goto L31;
            case -830665521: goto L27;
            case 1760745220: goto L23;
            default: goto L22;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0476, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0477, code lost:
    
        r45.a = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0479, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x047a, code lost:
    
        r5 = r43.f14284m - r43.f14285n;
        r7 = r44.p() + r5;
        r3 = r43.f14286o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0488, code lost:
    
        if (r3 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x048a, code lost:
    
        r44.readFully(r3.a, r43.f14285n, (int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0497, code lost:
    
        if (r43.f14283l != 1718909296) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0499, code lost:
    
        r43.f14292u = true;
        r3.F(8);
        r5 = r3.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04ab, code lost:
    
        if (r5 == 1751476579) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04ad, code lost:
    
        if (r5 == 1903435808) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04af, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04b1, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04b3, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04b4, code lost:
    
        if (r5 == 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04b7, code lost:
    
        r3.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04bf, code lost:
    
        if (r3.a() <= 0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04c1, code lost:
    
        r5 = r3.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04c5, code lost:
    
        if (r5 == 1751476579) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04c7, code lost:
    
        if (r5 == 1903435808) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04c9, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04cb, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04cd, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04ce, code lost:
    
        if (r5 == 0) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04d1, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04d2, code lost:
    
        r43.f14271E = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04d9, code lost:
    
        if (r12.isEmpty() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r11.equals("Super_SlowMotion_BGM") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04db, code lost:
    
        ((C1.c) r12.peek()).f571n.add(new C1.d(r43.f14283l, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04f0, code lost:
    
        if (r43.f14292u != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04f7, code lost:
    
        if (r43.f14283l != 1835295092) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04f9, code lost:
    
        r43.f14271E = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04fe, code lost:
    
        if (r5 >= 262144) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0500, code lost:
    
        r44.f((int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0504, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0506, code lost:
    
        r45.a = r44.p() + r5;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x050e, code lost:
    
        m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0513, code lost:
    
        if (r43.f14293v == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0515, code lost:
    
        r43.f14295x = true;
        r45.a = r43.f14294w;
        r43.f14293v = false;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0520, code lost:
    
        if (r3 == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0525, code lost:
    
        if (r43.f14282k == 2) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0527, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0529, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        r8 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (r11.equals("Super_SlowMotion_Deflickering_On") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r11.equals("Super_SlowMotion_Data") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r11.equals("Super_SlowMotion_Edit_Data") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0738, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r11.equals("SlowMotion_Data") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        switch(r8) {
            case 0: goto L50;
            case 1: goto L49;
            case 2: goto L48;
            case 3: goto L47;
            case 4: goto L46;
            default: goto L407;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        throw y1.E.a(null, "Invalid SEF name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        r8 = 2817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        r8 = 2820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r8 = 2816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
    
        r8 = 2819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        r8 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        r9 = r9.f14299b - (r6 + 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
    
        if (r8 == 2192) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
    
        if (r8 == 2816) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
    
        if (r8 == 2817) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
    
        if (r8 == 2819) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
    
        if (r8 != 2820) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f0, code lost:
    
        r6 = new java.util.ArrayList();
        r7 = p2.n.f14301e.o(r12.r(r9, r7));
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r8 >= r7.size()) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r9 = p2.n.f14300d.o((java.lang.CharSequence) r7.get(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
    
        if (r9.size() != r4) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0119, code lost:
    
        r6.add(new k2.C1387b(1 << (java.lang.Integer.parseInt((java.lang.String) r9.get(2)) - 1), java.lang.Long.parseLong((java.lang.String) r9.get(0)), java.lang.Long.parseLong((java.lang.String) r9.get(1))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
    
        throw y1.E.a(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
    
        throw y1.E.a(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
    
        r3.add(new k2.C1388c(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0162, code lost:
    
        r0 = r0 + 1;
        r8 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0169, code lost:
    
        r45.a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r11 == 1) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0175, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0176, code lost:
    
        r6 = r44.c();
        r3 = r11.f14303c - 20;
        r8 = new B1.B(r3);
        r44.readFully(r8.a, 0, r3);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
    
        if (r0 >= (r3 / 12)) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018e, code lost:
    
        r8.G(2);
        r12 = r8.a;
        r9 = r8.f288b;
        r4 = r9 + 1;
        r8.f288b = r4;
        r14 = r12[r9] & 255;
        r8.f288b = r9 + 2;
        r4 = (short) (((r12[r4] & 255) << 8) | r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ae, code lost:
    
        if (r4 == 2192) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b0, code lost:
    
        if (r4 == 2816) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b2, code lost:
    
        if (r4 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b4, code lost:
    
        r9 = 2819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b8, code lost:
    
        if (r4 == 2819) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        if (r4 == 2820) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bc, code lost:
    
        r8.G(r25);
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        r9 = 2819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ca, code lost:
    
        r16 = r6;
        r15.add(new p2.m((r16 - r11.f14303c) - r8.i(), r8.i()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
    
        r0 = r0 + 1;
        r6 = r16;
        r5 = 2817;
        r25 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f3, code lost:
    
        if (r15.isEmpty() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f5, code lost:
    
        r45.a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fc, code lost:
    
        r11.f14302b = 3;
        r45.a = ((p2.m) r15.get(0)).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r11 == r9) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0739 A[LOOP:1: B:4:0x000a->B:386:0x0739, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0738 A[SYNTHETIC] */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r44, V1.r r45) throws y1.E {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.k.i(V1.o, V1.r):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0 A[EDGE_INSN: B:75:0x00e0->B:67:0x00e0 BREAK  A[LOOP:1: B:32:0x0077->B:66:0x00db], SYNTHETIC] */
    @Override // V1.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V1.z j(long r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.k.j(long):V1.z");
    }

    @Override // V1.A
    public final long l() {
        return this.f14270D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0226, code lost:
    
        r9.F(r8);
        r8 = r8 + r13;
        r9.G(8);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0234, code lost:
    
        r12 = r9.f288b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0236, code lost:
    
        if (r12 >= r8) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0238, code lost:
    
        r12 = r9.g() + r12;
        r5 = r9.g();
        r31 = r6;
        r6 = (r5 >> 24) & 255;
        r32 = r7;
        r33 = r8;
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0256, code lost:
    
        if (r6 == 169) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025a, code lost:
    
        if (r6 != 253) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0265, code lost:
    
        if (r5 != 1735291493) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0267, code lost:
    
        r5 = j2.j.a(p2.o.g(r9) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0271, code lost:
    
        if (r5 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0273, code lost:
    
        r6 = new j2.n("TCON", null, j3.G.w(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x027e, code lost:
    
        B1.AbstractC0015b.v("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0284, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0285, code lost:
    
        r9.F(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0291, code lost:
    
        if (r5 != 1684632427) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0293, code lost:
    
        r6 = p2.o.f(r5, r9, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a0, code lost:
    
        if (r5 != 1953655662) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a2, code lost:
    
        r6 = p2.o.f(r5, r9, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ac, code lost:
    
        if (r5 != 1953329263) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ae, code lost:
    
        r3 = p2.o.h(r5, "TBPM", r9, r31, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b7, code lost:
    
        r9.F(r12);
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02bf, code lost:
    
        if (r5 != 1668311404) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c1, code lost:
    
        r3 = p2.o.h(r5, "TCMP", r9, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02cc, code lost:
    
        if (r5 != 1668249202) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ce, code lost:
    
        r6 = p2.o.e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d6, code lost:
    
        if (r5 != 1631670868) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d8, code lost:
    
        r6 = p2.o.i(r5, r9, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e2, code lost:
    
        if (r5 != 1936682605) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e4, code lost:
    
        r6 = p2.o.i(r5, r9, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ee, code lost:
    
        if (r5 != 1936679276) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f0, code lost:
    
        r6 = p2.o.i(r5, r9, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02fa, code lost:
    
        if (r5 != 1936679282) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02fc, code lost:
    
        r6 = p2.o.i(r5, r9, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0306, code lost:
    
        if (r5 != 1936679265) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0308, code lost:
    
        r6 = p2.o.i(r5, r9, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0313, code lost:
    
        if (r5 != 1936679791) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0315, code lost:
    
        r6 = p2.o.i(r5, r9, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0320, code lost:
    
        if (r5 != 1920233063) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0322, code lost:
    
        r6 = p2.o.h(r5, "ITUNESADVISORY", r9, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032e, code lost:
    
        if (r5 != 1885823344) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0330, code lost:
    
        r3 = p2.o.h(r5, "ITUNESGAPLESS", r9, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033d, code lost:
    
        if (r5 != 1936683886) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033f, code lost:
    
        r6 = p2.o.i(r5, r9, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x034a, code lost:
    
        if (r5 != 1953919848) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x034c, code lost:
    
        r6 = p2.o.i(r5, r9, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0357, code lost:
    
        if (r5 != 757935405) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0359, code lost:
    
        r3 = null;
        r5 = null;
        r6 = -1;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x035d, code lost:
    
        r13 = r9.f288b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x035f, code lost:
    
        if (r13 >= r12) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0361, code lost:
    
        r21 = r9.g();
        r7 = r9.g();
        r36 = r8;
        r9.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0372, code lost:
    
        if (r7 != 1835360622) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0374, code lost:
    
        r3 = r9.p(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0381, code lost:
    
        if (r7 != 1851878757) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0383, code lost:
    
        r5 = r9.p(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x038d, code lost:
    
        if (r7 != 1684108385) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x038f, code lost:
    
        r6 = r13;
        r36 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0392, code lost:
    
        r9.G(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0397, code lost:
    
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039b, code lost:
    
        r36 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a0, code lost:
    
        if (r3 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a2, code lost:
    
        if (r5 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a5, code lost:
    
        if (r6 != (-1)) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a8, code lost:
    
        r9.F(r6);
        r9.G(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03bb, code lost:
    
        r6 = new j2.k(r3, r5, r9.p(r36 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03be, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03bf, code lost:
    
        r9.F(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03cb, code lost:
    
        r6 = 16777215 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03d2, code lost:
    
        if (r6 != 6516084) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03d4, code lost:
    
        r6 = p2.o.d(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03d8, code lost:
    
        r9.F(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03e0, code lost:
    
        if (r6 == 7233901) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03e5, code lost:
    
        if (r6 != 7631467) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03ec, code lost:
    
        if (r6 == 6516589) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03f1, code lost:
    
        if (r6 != 7828084) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03f8, code lost:
    
        if (r6 != 6578553) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03fa, code lost:
    
        r6 = p2.o.i(r5, r9, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0404, code lost:
    
        if (r6 != 4280916) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0406, code lost:
    
        r6 = p2.o.i(r5, r9, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0410, code lost:
    
        if (r6 != 7630703) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0412, code lost:
    
        r6 = p2.o.i(r5, r9, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x041c, code lost:
    
        if (r6 != 6384738) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x041e, code lost:
    
        r6 = p2.o.i(r5, r9, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0428, code lost:
    
        if (r6 != 7108978) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x042a, code lost:
    
        r6 = p2.o.i(r5, r9, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0434, code lost:
    
        if (r6 != 6776174) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0436, code lost:
    
        r6 = p2.o.i(r5, r9, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x043e, code lost:
    
        if (r6 != 6779504) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0440, code lost:
    
        r6 = p2.o.i(r5, r9, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0447, code lost:
    
        B1.AbstractC0015b.l("MetadataUtil", "Skipped unknown metadata entry: " + C1.e.b(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x045a, code lost:
    
        r9.F(r12);
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x045f, code lost:
    
        r6 = p2.o.i(r5, r9, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0467, code lost:
    
        r6 = p2.o.i(r5, r9, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x046f, code lost:
    
        if (r6 == null) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0471, code lost:
    
        r4.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0474, code lost:
    
        r7 = r32;
        r8 = r33;
        r3 = r34;
        r6 = true;
        r23 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0482, code lost:
    
        r9.F(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0485, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0486, code lost:
    
        r34 = r3;
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0491, code lost:
    
        if (r4.isEmpty() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0493, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0495, code lost:
    
        r3 = new y1.C(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x088b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r38) {
        /*
            Method dump skipped, instructions count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.k.m(long):void");
    }

    @Override // V1.n
    public final void a() {
    }
}
