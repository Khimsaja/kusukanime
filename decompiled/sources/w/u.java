package w;

import H5.D;
import L.L1;
import O.C0486d;
import O.C0493g0;
import O.T;
import O.Z;
import f.AbstractC0847h;
import o.C1622t;
import p.AbstractC1745d;
import p.C0;
import p.C1761m;
import p.C1762n;
import s.C1904b;
import s.InterfaceC1946w0;
import y.C2303C;
import y.C2306F;
import y.C2322c;
import y.InterfaceC2305E;
import y0.C2349D;

/* loaded from: classes.dex */
public final class u implements InterfaceC1946w0 {

    /* renamed from: w, reason: collision with root package name */
    public static final L2.e f16790w = q0.c.F(o.f16776l, k.f16737o);
    public final O4.c a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16791b;

    /* renamed from: c, reason: collision with root package name */
    public l f16792c;

    /* renamed from: d, reason: collision with root package name */
    public final n f16793d;

    /* renamed from: e, reason: collision with root package name */
    public final C0493g0 f16794e;

    /* renamed from: f, reason: collision with root package name */
    public final u.k f16795f;

    /* renamed from: g, reason: collision with root package name */
    public float f16796g;

    /* renamed from: h, reason: collision with root package name */
    public final s.r f16797h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16798i;

    /* renamed from: j, reason: collision with root package name */
    public C2349D f16799j;

    /* renamed from: k, reason: collision with root package name */
    public final p f16800k;

    /* renamed from: l, reason: collision with root package name */
    public final C2322c f16801l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f16802m;

    /* renamed from: n, reason: collision with root package name */
    public final C1904b f16803n;

    /* renamed from: o, reason: collision with root package name */
    public final C2306F f16804o;

    /* renamed from: p, reason: collision with root package name */
    public final p2.l f16805p;

    /* renamed from: q, reason: collision with root package name */
    public final C2303C f16806q;

    /* renamed from: r, reason: collision with root package name */
    public final Z f16807r;

    /* renamed from: s, reason: collision with root package name */
    public final C0493g0 f16808s;

    /* renamed from: t, reason: collision with root package name */
    public final C0493g0 f16809t;

    /* renamed from: u, reason: collision with root package name */
    public final Z f16810u;

    /* renamed from: v, reason: collision with root package name */
    public C1761m f16811v;

    public u(int i7, int i8) {
        O4.c cVar = new O4.c();
        cVar.f7552b = -1;
        this.a = cVar;
        this.f16793d = new n(i7, i8, 0);
        this.f16794e = C0486d.K(x.f16812b, T.f7046m);
        this.f16795f = new u.k();
        this.f16797h = new s.r(new C1622t(10, this));
        this.f16798i = true;
        this.f16800k = new p(this, 0);
        this.f16801l = new C2322c();
        this.f16802m = new androidx.compose.foundation.lazy.layout.a();
        this.f16803n = new C1904b(2);
        this.f16804o = new C2306F(new L1(i7, 3, this));
        this.f16805p = new p2.l(6, this);
        this.f16806q = new C2303C();
        this.f16807r = AbstractC0847h.l();
        Boolean bool = Boolean.FALSE;
        T t7 = T.f7049p;
        this.f16808s = C0486d.K(bool, t7);
        this.f16809t = C0486d.K(bool, t7);
        this.f16810u = AbstractC0847h.l();
        this.f16811v = new C1761m(C0.a, Float.valueOf(0.0f), new C1762n(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // s.InterfaceC1946w0
    public final boolean a() {
        return ((Boolean) this.f16809t.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final boolean b() {
        return this.f16797h.b();
    }

    @Override // s.InterfaceC1946w0
    public final boolean c() {
        return ((Boolean) this.f16808s.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final float d(float f5) {
        return this.f16797h.d(f5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r8.e(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s.InterfaceC1946w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(q.X r6, e4.n r7, S3.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof w.q
            if (r0 == 0) goto L13
            r0 = r8
            w.q r0 = (w.q) r0
            int r1 = r0.f16783p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16783p = r1
            goto L18
        L13:
            w.q r0 = new w.q
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f16781n
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f16783p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            e4.n r7 = r0.f16780m
            q.X r6 = r0.f16779l
            w.u r2 = r0.f16778k
            P3.r.Y(r8)
            goto L51
        L3c:
            P3.r.Y(r8)
            r0.f16778k = r5
            r0.f16779l = r6
            r0.f16780m = r7
            r0.f16783p = r4
            y.c r8 = r5.f16801l
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L50
            goto L62
        L50:
            r2 = r5
        L51:
            s.r r8 = r2.f16797h
            r2 = 0
            r0.f16778k = r2
            r0.f16779l = r2
            r0.f16780m = r2
            r0.f16783p = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w.u.e(q.X, e4.n, S3.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(l lVar, boolean z7, boolean z8) {
        if (!z7 && this.f16791b) {
            this.f16792c = lVar;
            return;
        }
        if (z7) {
            this.f16791b = true;
        }
        m mVar = lVar.a;
        this.f16809t.setValue(Boolean.valueOf(((mVar != null ? mVar.a : 0) == 0 && lVar.f16739b == 0) ? false : true));
        this.f16808s.setValue(Boolean.valueOf(lVar.f16740c));
        this.f16796g -= lVar.f16741d;
        this.f16794e.setValue(lVar);
        n nVar = this.f16793d;
        if (z8) {
            int i7 = lVar.f16739b;
            if (i7 < 0.0f) {
                nVar.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i7 + ')').toString());
            }
            nVar.f16772c.g(i7);
        } else {
            nVar.getClass();
            nVar.f16774e = mVar != null ? mVar.f16762i : null;
            if (nVar.f16773d || lVar.f16750m > 0) {
                nVar.f16773d = true;
                int i8 = lVar.f16739b;
                if (i8 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i8 + ')').toString());
                }
                nVar.a(mVar != null ? mVar.a : 0, i8);
            }
            if (this.f16798i) {
                O4.c cVar = this.a;
                if (cVar.f7552b != -1) {
                    ?? r12 = lVar.f16747j;
                    if (!r12.isEmpty()) {
                        if (cVar.f7552b != (cVar.a ? ((m) P3.q.A0(r12)).a + 1 : ((m) P3.q.r0(r12)).a - 1)) {
                            cVar.f7552b = -1;
                            InterfaceC2305E interfaceC2305E = (InterfaceC2305E) cVar.f7553c;
                            if (interfaceC2305E != null) {
                                interfaceC2305E.cancel();
                            }
                            cVar.f7553c = null;
                        }
                    }
                }
            }
        }
        if (z7) {
            float fX = lVar.f16745h.x(x.a);
            float f5 = lVar.f16742e;
            if (f5 <= fX) {
                return;
            }
            Y.h hVarC = Y.s.c();
            e4.k kVarF = hVarC != null ? hVarC.f() : null;
            Y.h hVarD = Y.s.d(hVarC);
            try {
                float fFloatValue = ((Number) this.f16811v.f14048l.getValue()).floatValue();
                C1761m c1761m = this.f16811v;
                boolean z9 = c1761m.f14052p;
                M5.c cVar2 = lVar.f16744g;
                if (z9) {
                    this.f16811v = AbstractC1745d.l(c1761m, fFloatValue - f5, 0.0f, 30);
                    D.x(cVar2, null, new s(this, null), 3);
                } else {
                    this.f16811v = new C1761m(C0.a, Float.valueOf(-f5), null, 60);
                    D.x(cVar2, null, new t(this, null), 3);
                }
                Y.s.f(hVarC, hVarD, kVarF);
            } catch (Throwable th) {
                Y.s.f(hVarC, hVarD, kVarF);
                throw th;
            }
        }
    }

    public final l g() {
        return (l) this.f16794e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f5, l lVar) {
        InterfaceC2305E interfaceC2305E;
        InterfaceC2305E interfaceC2305E2;
        InterfaceC2305E interfaceC2305E3;
        if (this.f16798i) {
            O4.c cVar = this.a;
            if (lVar.f16747j.isEmpty()) {
                return;
            }
            boolean z7 = f5 < 0.0f;
            ?? r32 = lVar.f16747j;
            int i7 = z7 ? ((m) P3.q.A0(r32)).a + 1 : ((m) P3.q.r0(r32)).a - 1;
            if (i7 < 0 || i7 >= lVar.f16750m) {
                return;
            }
            if (i7 != cVar.f7552b) {
                if (cVar.a != z7 && (interfaceC2305E3 = (InterfaceC2305E) cVar.f7553c) != null) {
                    interfaceC2305E3.cancel();
                }
                cVar.a = z7;
                cVar.f7552b = i7;
                u uVar = (u) this.f16805p.f14298b;
                Y.h hVarC = Y.s.c();
                e4.k kVarF = hVarC != null ? hVarC.f() : null;
                Y.h hVarD = Y.s.d(hVarC);
                try {
                    long j7 = ((l) uVar.f16794e.getValue()).f16746i;
                    Y.s.f(hVarC, hVarD, kVarF);
                    cVar.f7553c = uVar.f16804o.a(i7, j7);
                } catch (Throwable th) {
                    Y.s.f(hVarC, hVarD, kVarF);
                    throw th;
                }
            }
            if (!z7) {
                if (lVar.f16748k - ((m) P3.q.r0(r32)).f16765l >= f5 || (interfaceC2305E = (InterfaceC2305E) cVar.f7553c) == null) {
                    return;
                }
                interfaceC2305E.a();
                return;
            }
            m mVar = (m) P3.q.A0(r32);
            if (((mVar.f16765l + mVar.f16766m) + lVar.f16753p) - lVar.f16749l >= (-f5) || (interfaceC2305E2 = (InterfaceC2305E) cVar.f7553c) == null) {
                return;
            }
            interfaceC2305E2.a();
        }
    }
}
