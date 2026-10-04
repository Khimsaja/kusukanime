package Y;

import O.C0486d;
import java.util.ArrayList;
import java.util.HashMap;
import m.AbstractC1476F;
import m.C1472B;

/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9964n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final e4.k f9965e;

    /* renamed from: f, reason: collision with root package name */
    public final e4.k f9966f;

    /* renamed from: g, reason: collision with root package name */
    public int f9967g;

    /* renamed from: h, reason: collision with root package name */
    public C1472B f9968h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f9969i;

    /* renamed from: j, reason: collision with root package name */
    public m f9970j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f9971k;

    /* renamed from: l, reason: collision with root package name */
    public int f9972l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9973m;

    public d(int i7, m mVar, e4.k kVar, e4.k kVar2) {
        super(i7, mVar);
        this.f9965e = kVar;
        this.f9966f = kVar2;
        this.f9970j = m.f9994o;
        this.f9971k = f9964n;
        this.f9972l = 1;
    }

    public void A(C1472B c1472b) {
        this.f9968h = c1472b;
    }

    public d B(e4.k kVar, e4.k kVar2) throws Throwable {
        if (this.f9981c) {
            C0486d.T("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f9973m && this.f9982d < 0) {
            C0486d.U("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = o.f10002b;
        synchronized (obj) {
            try {
                int i7 = o.f10004d;
                o.f10004d = i7 + 1;
                o.f10003c = o.f10003c.o(i7);
                m mVarE = e();
                r(mVarE.o(i7));
                try {
                    e eVar = new e(i7, o.e(mVarE, d() + 1, i7), o.l(kVar, f(), true), o.b(kVar2, i()), this);
                    if (this.f9973m || this.f9981c) {
                        return eVar;
                    }
                    int iD = d();
                    synchronized (obj) {
                        int i8 = o.f10004d;
                        o.f10004d = i8 + 1;
                        q(i8);
                        o.f10003c = o.f10003c.o(d());
                    }
                    r(o.e(e(), iD + 1, d()));
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // Y.h
    public final void b() {
        o.f10003c = o.f10003c.h(d()).a(this.f9970j);
    }

    @Override // Y.h
    public void c() {
        if (this.f9981c) {
            return;
        }
        this.f9981c = true;
        synchronized (o.f10002b) {
            int i7 = this.f9982d;
            if (i7 >= 0) {
                o.u(i7);
                this.f9982d = -1;
            }
        }
        l();
    }

    @Override // Y.h
    public boolean g() {
        return false;
    }

    @Override // Y.h
    public int h() {
        return this.f9967g;
    }

    @Override // Y.h
    public e4.k i() {
        return this.f9966f;
    }

    @Override // Y.h
    public void k() {
        this.f9972l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    @Override // Y.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r15 = this;
            int r0 = r15.f9972l
            r1 = 0
            if (r0 <= 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = r1
        L8:
            r3 = 0
            if (r2 == 0) goto L8c
            int r0 = r0 + (-1)
            r15.f9972l = r0
            if (r0 != 0) goto L8b
            boolean r0 = r15.f9973m
            if (r0 != 0) goto L8b
            m.B r0 = r15.w()
            if (r0 == 0) goto L88
            boolean r2 = r15.f9973m
            if (r2 != 0) goto L82
            r15.A(r3)
            int r2 = r15.d()
            java.lang.Object[] r3 = r0.f12864b
            long[] r0 = r0.a
            int r4 = r0.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L88
            r5 = r1
        L30:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L7d
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L4a:
            if (r10 >= r8) goto L7b
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L77
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            Y.v r11 = (Y.v) r11
            Y.x r11 = r11.a()
        L60:
            if (r11 == 0) goto L77
            int r12 = r11.a
            if (r12 == r2) goto L72
            Y.m r13 = r15.f9970j
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r12 = P3.q.m0(r13, r12)
            if (r12 == 0) goto L74
        L72:
            r11.a = r1
        L74:
            Y.x r11 = r11.f10036b
            goto L60
        L77:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L4a
        L7b:
            if (r8 != r9) goto L88
        L7d:
            if (r5 == r4) goto L88
            int r5 = r5 + 1
            goto L30
        L82:
            java.lang.String r0 = "Unsupported operation on a snapshot that has been applied"
            O.C0486d.U(r0)
            throw r3
        L88:
            r15.a()
        L8b:
            return
        L8c:
            java.lang.String r0 = "no pending nested snapshots"
            O.C0486d.T(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.d.l():void");
    }

    @Override // Y.h
    public void m() {
        if (this.f9973m || this.f9981c) {
            return;
        }
        u();
    }

    @Override // Y.h
    public void n(v vVar) {
        C1472B c1472bW = w();
        if (c1472bW == null) {
            int i7 = AbstractC1476F.a;
            c1472bW = new C1472B();
            A(c1472bW);
        }
        c1472bW.a(vVar);
    }

    @Override // Y.h
    public final void o() {
        int length = this.f9971k.length;
        for (int i7 = 0; i7 < length; i7++) {
            o.u(this.f9971k[i7]);
        }
        int i8 = this.f9982d;
        if (i8 >= 0) {
            o.u(i8);
            this.f9982d = -1;
        }
    }

    @Override // Y.h
    public void s(int i7) {
        this.f9967g = i7;
    }

    @Override // Y.h
    public h t(e4.k kVar) {
        f fVar;
        if (this.f9981c) {
            C0486d.T("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f9973m && this.f9982d < 0) {
            C0486d.U("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int iD = d();
        z(d());
        Object obj = o.f10002b;
        synchronized (obj) {
            int i7 = o.f10004d;
            o.f10004d = i7 + 1;
            o.f10003c = o.f10003c.o(i7);
            fVar = new f(i7, o.e(e(), iD + 1, i7), o.l(kVar, f(), true), this);
        }
        if (this.f9973m || this.f9981c) {
            return fVar;
        }
        int iD2 = d();
        synchronized (obj) {
            int i8 = o.f10004d;
            o.f10004d = i8 + 1;
            q(i8);
            o.f10003c = o.f10003c.o(d());
        }
        r(o.e(e(), iD2 + 1, d()));
        return fVar;
    }

    public final void u() {
        z(d());
        if (this.f9973m || this.f9981c) {
            return;
        }
        int iD = d();
        synchronized (o.f10002b) {
            int i7 = o.f10004d;
            o.f10004d = i7 + 1;
            q(i7);
            o.f10003c = o.f10003c.o(d());
        }
        r(o.e(e(), iD + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y.s v() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.d.v():Y.s");
    }

    public C1472B w() {
        return this.f9968h;
    }

    @Override // Y.h
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public e4.k f() {
        return this.f9965e;
    }

    public final s y(int i7, HashMap map, m mVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListG0;
        ArrayList arrayList3;
        m mVar2;
        Object[] objArr;
        long[] jArr;
        m mVar3;
        Object[] objArr2;
        long[] jArr2;
        int i8;
        int i9;
        x xVarS;
        x xVarH;
        m mVarM = e().o(d()).m(this.f9970j);
        C1472B c1472bW = w();
        kotlin.jvm.internal.l.c(c1472bW);
        Object[] objArr3 = c1472bW.f12864b;
        long[] jArr3 = c1472bW.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            arrayList3 = null;
            arrayListG0 = null;
            while (true) {
                long j7 = jArr3[i10];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j7 & 255) < 128) {
                            v vVar = (v) objArr3[(i10 << 3) + i13];
                            i9 = i11;
                            x xVarA = vVar.a();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i8 = i13;
                            x xVarS2 = o.s(xVarA, i7, mVar);
                            if (xVarS2 == null || (xVarS = o.s(xVarA, d(), mVarM)) == null) {
                                mVar3 = mVarM;
                            } else {
                                mVar3 = mVarM;
                                if (xVarS.a != 1 && !xVarS2.equals(xVarS)) {
                                    x xVarS3 = o.s(xVarA, d(), e());
                                    if (xVarS3 == null) {
                                        o.r();
                                        throw null;
                                    }
                                    if (map == null || (xVarH = (x) map.get(xVarS2)) == null) {
                                        xVarH = vVar.h(xVarS, xVarS2, xVarS3);
                                    }
                                    if (xVarH == null) {
                                        return new i();
                                    }
                                    if (!xVarH.equals(xVarS3)) {
                                        if (xVarH.equals(xVarS2)) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(new O3.l(vVar, xVarS2.b()));
                                            if (arrayListG0 == null) {
                                                arrayListG0 = new ArrayList();
                                            }
                                            arrayListG0.add(vVar);
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(!xVarH.equals(xVarS) ? new O3.l(vVar, xVarH) : new O3.l(vVar, xVarS.b()));
                                        }
                                    }
                                }
                            }
                        } else {
                            mVar3 = mVarM;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i8 = i13;
                            i9 = i11;
                        }
                        j7 >>= i9;
                        i13 = i8 + 1;
                        i11 = i9;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        mVarM = mVar3;
                    }
                    mVar2 = mVarM;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    mVar2 = mVarM;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i10 == length) {
                    arrayList2 = arrayList3;
                    arrayList = arrayListG0;
                    break;
                }
                i10++;
                objArr3 = objArr;
                jArr3 = jArr;
                mVarM = mVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList2;
        arrayListG0 = arrayList;
        if (arrayList3 != null) {
            u();
            int size = arrayList3.size();
            for (int i14 = 0; i14 < size; i14++) {
                O3.l lVar = (O3.l) arrayList3.get(i14);
                v vVar2 = (v) lVar.f7528k;
                x xVar = (x) lVar.f7529l;
                xVar.a = d();
                synchronized (o.f10002b) {
                    xVar.f10036b = vVar2.a();
                    vVar2.j(xVar);
                }
            }
        }
        if (arrayListG0 != null) {
            int size2 = arrayListG0.size();
            for (int i15 = 0; i15 < size2; i15++) {
                c1472bW.j((v) arrayListG0.get(i15));
            }
            ArrayList arrayList4 = this.f9969i;
            if (arrayList4 != null) {
                arrayListG0 = P3.q.G0(arrayList4, arrayListG0);
            }
            this.f9969i = arrayListG0;
        }
        return j.f9983b;
    }

    public final void z(int i7) {
        synchronized (o.f10002b) {
            this.f9970j = this.f9970j.o(i7);
        }
    }
}
