package z;

import O.C0485c0;
import O.C0486d;
import O.C0487d0;
import O.C0493g0;
import O.T;
import O.Z;
import O1.C0541o;
import f.AbstractC0847h;
import o.C1622t;
import q.X;
import s.C1904b;
import s.EnumC1903a0;
import s.InterfaceC1946w0;
import y.C2301A;
import y.C2303C;
import y.C2306F;
import y.C2322c;
import y.InterfaceC2305E;

/* loaded from: classes.dex */
public abstract class C implements InterfaceC1946w0 {

    /* renamed from: A, reason: collision with root package name */
    public final Z f18398A;

    /* renamed from: B, reason: collision with root package name */
    public final Z f18399B;

    /* renamed from: C, reason: collision with root package name */
    public final C0493g0 f18400C;

    /* renamed from: D, reason: collision with root package name */
    public final C0493g0 f18401D;

    /* renamed from: E, reason: collision with root package name */
    public final C0493g0 f18402E;

    /* renamed from: F, reason: collision with root package name */
    public final C0493g0 f18403F;
    public final C0493g0 a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.l f18404b;

    /* renamed from: c, reason: collision with root package name */
    public final C0541o f18405c;

    /* renamed from: d, reason: collision with root package name */
    public int f18406d;

    /* renamed from: e, reason: collision with root package name */
    public int f18407e;

    /* renamed from: f, reason: collision with root package name */
    public long f18408f;

    /* renamed from: g, reason: collision with root package name */
    public long f18409g;

    /* renamed from: h, reason: collision with root package name */
    public float f18410h;

    /* renamed from: i, reason: collision with root package name */
    public float f18411i;

    /* renamed from: j, reason: collision with root package name */
    public final s.r f18412j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f18413k;

    /* renamed from: l, reason: collision with root package name */
    public int f18414l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC2305E f18415m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18416n;

    /* renamed from: o, reason: collision with root package name */
    public final C0493g0 f18417o;

    /* renamed from: p, reason: collision with root package name */
    public T0.b f18418p;

    /* renamed from: q, reason: collision with root package name */
    public final u.k f18419q;

    /* renamed from: r, reason: collision with root package name */
    public final C0487d0 f18420r;

    /* renamed from: s, reason: collision with root package name */
    public final C0487d0 f18421s;

    /* renamed from: t, reason: collision with root package name */
    public final C2306F f18422t;

    /* renamed from: u, reason: collision with root package name */
    public final C1904b f18423u;

    /* renamed from: v, reason: collision with root package name */
    public final C2322c f18424v;

    /* renamed from: w, reason: collision with root package name */
    public final C0493g0 f18425w;

    /* renamed from: x, reason: collision with root package name */
    public final w.p f18426x;

    /* renamed from: y, reason: collision with root package name */
    public long f18427y;

    /* renamed from: z, reason: collision with root package name */
    public final C2303C f18428z;

    public C(float f5, int i7) {
        double d4 = f5;
        if (-0.5d > d4 || d4 > 0.5d) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f5 + " is not within the range -0.5 to 0.5").toString());
        }
        g0.c cVar = new g0.c(0L);
        T t7 = T.f7049p;
        this.a = C0486d.K(cVar, t7);
        this.f18404b = new p2.l(11, this);
        this.f18405c = new C0541o(i7, f5, this);
        this.f18406d = i7;
        this.f18408f = Long.MAX_VALUE;
        this.f18412j = new s.r(new C1622t(15, this));
        this.f18413k = true;
        this.f18414l = -1;
        this.f18417o = C0486d.K(G.f18436b, T.f7046m);
        this.f18418p = G.f18437c;
        this.f18419q = new u.k();
        this.f18420r = C0486d.J(-1);
        this.f18421s = C0486d.J(i7);
        C0486d.C(t7, new C2421B(this, 0));
        C0486d.C(t7, new C2421B(this, 1));
        this.f18422t = new C2306F(null);
        this.f18423u = new C1904b(2);
        this.f18424v = new C2322c();
        this.f18425w = C0486d.K(null, t7);
        this.f18426x = new w.p(this, 2);
        this.f18427y = q0.c.b(0, 0, 15);
        this.f18428z = new C2303C();
        this.f18398A = AbstractC0847h.l();
        this.f18399B = AbstractC0847h.l();
        Boolean bool = Boolean.FALSE;
        this.f18400C = C0486d.K(bool, t7);
        this.f18401D = C0486d.K(bool, t7);
        this.f18402E = C0486d.K(bool, t7);
        this.f18403F = C0486d.K(bool, t7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r6.f18412j.e(r7, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(z.C r6, q.X r7, e4.n r8, S3.c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof z.z
            if (r0 == 0) goto L13
            r0 = r9
            z.z r0 = (z.z) r0
            int r1 = r0.f18547p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18547p = r1
            goto L18
        L13:
            z.z r0 = new z.z
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f18545n
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f18547p
            O3.C r3 = O3.C.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            z.C r6 = r0.f18542k
            P3.r.Y(r9)
            goto L7b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            e4.n r8 = r0.f18544m
            q.X r7 = r0.f18543l
            z.C r6 = r0.f18542k
            P3.r.Y(r9)
            goto L58
        L40:
            P3.r.Y(r9)
            r0.f18542k = r6
            r0.f18543l = r7
            r0.f18544m = r8
            r0.f18547p = r5
            y.c r9 = r6.f18424v
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r1) goto L54
            goto L55
        L54:
            r9 = r3
        L55:
            if (r9 != r1) goto L58
            goto L7a
        L58:
            s.r r9 = r6.f18412j
            boolean r9 = r9.b()
            if (r9 != 0) goto L69
            int r9 = r6.j()
            O.d0 r2 = r6.f18421s
            r2.g(r9)
        L69:
            r0.f18542k = r6
            r9 = 0
            r0.f18543l = r9
            r0.f18544m = r9
            r0.f18547p = r4
            s.r r9 = r6.f18412j
            java.lang.Object r7 = r9.e(r7, r8, r0)
            if (r7 != r1) goto L7b
        L7a:
            return r1
        L7b:
            O.d0 r6 = r6.f18420r
            r7 = -1
            r6.g(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C.r(z.C, q.X, e4.n, S3.c):java.lang.Object");
    }

    @Override // s.InterfaceC1946w0
    public final boolean a() {
        return ((Boolean) this.f18401D.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final boolean b() {
        return this.f18412j.b();
    }

    @Override // s.InterfaceC1946w0
    public final boolean c() {
        return ((Boolean) this.f18400C.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final float d(float f5) {
        return this.f18412j.d(f5);
    }

    @Override // s.InterfaceC1946w0
    public final Object e(X x7, e4.n nVar, S3.c cVar) {
        return r(this, x7, nVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v5, types: [p.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r17, p.C1752g0 r18, U3.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C.f(int, p.g0, U3.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void h(v vVar, boolean z7) {
        C0541o c0541o = this.f18405c;
        boolean z8 = true;
        if (z7) {
            ((C0485c0) c0541o.f7470d).g(vVar.f18528j);
        } else {
            c0541o.getClass();
            j jVar = vVar.f18527i;
            c0541o.f7471e = jVar != null ? jVar.f18477d : null;
            boolean z9 = c0541o.a;
            ?? r52 = vVar.a;
            if (z9 || !r52.isEmpty()) {
                c0541o.a = true;
                int i7 = jVar != null ? jVar.a : 0;
                float f5 = vVar.f18528j;
                ((C0487d0) c0541o.f7469c).g(i7);
                ((C2301A) c0541o.f7472f).a(i7);
                ((C0485c0) c0541o.f7470d).g(f5);
            }
            if (this.f18414l != -1 && !r52.isEmpty()) {
                if (this.f18414l != (this.f18416n ? ((j) P3.q.A0(r52)).a + 1 : ((j) P3.q.r0(r52)).a - 1)) {
                    this.f18414l = -1;
                    InterfaceC2305E interfaceC2305E = this.f18415m;
                    if (interfaceC2305E != null) {
                        interfaceC2305E.cancel();
                    }
                    this.f18415m = null;
                }
            }
        }
        this.f18417o.setValue(vVar);
        this.f18400C.setValue(Boolean.valueOf(vVar.f18530l));
        j jVar2 = vVar.f18526h;
        if ((jVar2 != null ? jVar2.a : 0) == 0 && vVar.f18529k == 0) {
            z8 = false;
        }
        this.f18401D.setValue(Boolean.valueOf(z8));
        if (jVar2 != null) {
            this.f18406d = jVar2.a;
        }
        this.f18407e = vVar.f18529k;
        Y.h hVarC = Y.s.c();
        e4.k kVarF = hVarC != null ? hVarC.f() : null;
        Y.h hVarD = Y.s.d(hVarC);
        try {
            if (Math.abs(this.f18411i) > 0.5f && this.f18413k && p(this.f18411i)) {
                q(this.f18411i, vVar);
            }
            Y.s.f(hVarC, hVarD, kVarF);
            this.f18408f = G.a(vVar, l());
            l();
            EnumC1903a0 enumC1903a0 = EnumC1903a0.f15260l;
            EnumC1903a0 enumC1903a02 = vVar.f18523e;
            long jA = vVar.a();
            int i8 = (int) (enumC1903a02 == enumC1903a0 ? jA >> 32 : jA & 4294967295L);
            vVar.f18531m.getClass();
            this.f18409g = e3.c.k(0, 0, i8);
        } catch (Throwable th) {
            Y.s.f(hVarC, hVarD, kVarF);
            throw th;
        }
    }

    public final int i(int i7) {
        if (l() > 0) {
            return e3.c.k(i7, 0, l() - 1);
        }
        return 0;
    }

    public final int j() {
        return ((C0487d0) this.f18405c.f7469c).f();
    }

    public final v k() {
        return (v) this.f18417o.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((v) this.f18417o.getValue()).f18520b;
    }

    public final int n() {
        return ((v) this.f18417o.getValue()).f18521c + m();
    }

    public final long o() {
        return ((g0.c) this.a.getValue()).a;
    }

    public final boolean p(float f5) {
        if (k().f18523e == EnumC1903a0.f15259k) {
            if (Math.signum(f5) == Math.signum(-g0.c.e(o()))) {
                return true;
            }
        } else if (Math.signum(f5) == Math.signum(-g0.c.d(o()))) {
            return true;
        }
        return ((int) g0.c.d(o())) == 0 && ((int) g0.c.e(o())) == 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void q(float f5, v vVar) {
        InterfaceC2305E interfaceC2305E;
        InterfaceC2305E interfaceC2305E2;
        InterfaceC2305E interfaceC2305E3;
        if (this.f18413k) {
            ?? r02 = vVar.a;
            if (r02.isEmpty()) {
                return;
            }
            boolean z7 = f5 > 0.0f;
            int i7 = z7 ? ((j) P3.q.A0(r02)).a + 1 : ((j) P3.q.r0(r02)).a - 1;
            if (i7 < 0 || i7 >= l()) {
                return;
            }
            if (i7 != this.f18414l) {
                if (this.f18416n != z7 && (interfaceC2305E3 = this.f18415m) != null) {
                    interfaceC2305E3.cancel();
                }
                this.f18416n = z7;
                this.f18414l = i7;
                this.f18415m = this.f18422t.a(i7, this.f18427y);
            }
            if (z7) {
                if ((((j) P3.q.A0(r02)).f18485l + (vVar.f18520b + vVar.f18521c)) - vVar.f18525g >= f5 || (interfaceC2305E2 = this.f18415m) == null) {
                    return;
                }
                interfaceC2305E2.a();
                return;
            }
            if (vVar.f18524f - ((j) P3.q.r0(r02)).f18485l >= (-f5) || (interfaceC2305E = this.f18415m) == null) {
                return;
            }
            interfaceC2305E.a();
        }
    }
}
