package T2;

import H5.D;
import H5.M;
import H5.v0;
import K5.N;
import K5.Y;
import O.C0485c0;
import O.C0486d;
import O.C0493g0;
import O.T;
import O.w0;
import P3.F;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d3.C0791c;
import d3.C0796h;
import d3.C0797i;
import g3.AbstractC0945d;
import h0.C0985h;
import h0.C0990m;
import h3.C1006b;
import j0.C1296b;
import l4.AbstractC1420H;
import m0.AbstractC1507b;
import m0.C1506a;
import w0.C2191i;
import w0.InterfaceC2192j;
import y0.C2351F;

/* loaded from: classes.dex */
public final class o extends AbstractC1507b implements w0 {

    /* renamed from: A, reason: collision with root package name */
    public final C0493g0 f9012A;

    /* renamed from: B, reason: collision with root package name */
    public final C0493g0 f9013B;

    /* renamed from: o, reason: collision with root package name */
    public M5.c f9014o;

    /* renamed from: p, reason: collision with root package name */
    public final Y f9015p = N.b(new g0.f(0));

    /* renamed from: q, reason: collision with root package name */
    public final C0493g0 f9016q;

    /* renamed from: r, reason: collision with root package name */
    public final C0485c0 f9017r;

    /* renamed from: s, reason: collision with root package name */
    public final C0493g0 f9018s;

    /* renamed from: t, reason: collision with root package name */
    public g f9019t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC1507b f9020u;

    /* renamed from: v, reason: collision with root package name */
    public e4.k f9021v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC2192j f9022w;

    /* renamed from: x, reason: collision with root package name */
    public int f9023x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9024y;

    /* renamed from: z, reason: collision with root package name */
    public final C0493g0 f9025z;

    public o(C0797i c0797i, S2.f fVar) {
        T t7 = T.f7049p;
        this.f9016q = C0486d.K(null, t7);
        this.f9017r = C0486d.I(1.0f);
        this.f9018s = C0486d.K(null, t7);
        c cVar = c.a;
        this.f9019t = cVar;
        this.f9021v = a.f8995n;
        this.f9022w = C2191i.f16865b;
        this.f9023x = 1;
        this.f9025z = C0486d.K(cVar, t7);
        this.f9012A = C0486d.K(c0797i, t7);
        this.f9013B = C0486d.K(fVar, t7);
    }

    @Override // O.w0
    public final void a() {
        if (this.f9014o != null) {
            return;
        }
        v0 v0VarE = D.e();
        O5.e eVar = M.a;
        M5.c cVarC = D.c(F.M(v0VarE, M5.m.a.f4075o));
        this.f9014o = cVarC;
        Object obj = this.f9020u;
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        if (w0Var != null) {
            w0Var.a();
        }
        if (!this.f9024y) {
            D.x(cVarC, null, new j(this, null), 3);
            return;
        }
        C0796h c0796hA = C0797i.a((C0797i) this.f9012A.getValue());
        c0796hA.f11261b = ((S2.m) ((S2.f) this.f9013B.getValue())).f8757b;
        c0796hA.f11275p = null;
        Drawable drawable = c0796hA.a().f11300z.f11250j;
        C0791c c0791c = AbstractC0945d.a;
        k(new e(drawable != null ? j(drawable) : null));
    }

    @Override // O.w0
    public final void b() {
        M5.c cVar = this.f9014o;
        if (cVar != null) {
            D.h(cVar, null);
        }
        this.f9014o = null;
        Object obj = this.f9020u;
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // m0.AbstractC1507b
    public final void c(float f5) {
        this.f9017r.g(f5);
    }

    @Override // m0.AbstractC1507b
    public final void d(C0990m c0990m) {
        this.f9018s.setValue(c0990m);
    }

    @Override // O.w0
    public final void e() {
        M5.c cVar = this.f9014o;
        if (cVar != null) {
            D.h(cVar, null);
        }
        this.f9014o = null;
        Object obj = this.f9020u;
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        if (w0Var != null) {
            w0Var.e();
        }
    }

    @Override // m0.AbstractC1507b
    public final long h() {
        AbstractC1507b abstractC1507b = (AbstractC1507b) this.f9016q.getValue();
        if (abstractC1507b != null) {
            return abstractC1507b.h();
        }
        return 9205357640488583168L;
    }

    @Override // m0.AbstractC1507b
    public final void i(C2351F c2351f) {
        C1296b c1296b = c2351f.f17696k;
        g0.f fVar = new g0.f(c1296b.d());
        Y y7 = this.f9015p;
        y7.getClass();
        y7.i(null, fVar);
        AbstractC1507b abstractC1507b = (AbstractC1507b) this.f9016q.getValue();
        if (abstractC1507b != null) {
            abstractC1507b.g(c2351f, c1296b.d(), this.f9017r.f(), (C0990m) this.f9018s.getValue());
        }
    }

    public final AbstractC1507b j(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new C1006b(drawable.mutate());
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        C0985h c0985h = new C0985h(bitmap);
        int i7 = this.f9023x;
        C1506a c1506a = new C1506a(c0985h, AbstractC1420H.a(bitmap.getWidth(), bitmap.getHeight()));
        c1506a.f12959q = i7;
        return c1506a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(T2.g r13) {
        /*
            r12 = this;
            T2.g r0 = r12.f9019t
            e4.k r1 = r12.f9021v
            java.lang.Object r13 = r1.invoke(r13)
            T2.g r13 = (T2.g) r13
            r12.f9019t = r13
            O.g0 r1 = r12.f9025z
            r1.setValue(r13)
            boolean r1 = r13 instanceof T2.f
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r13
            T2.f r1 = (T2.f) r1
            d3.o r1 = r1.f8998b
            goto L25
        L1c:
            boolean r1 = r13 instanceof T2.d
            if (r1 == 0) goto L60
            r1 = r13
            T2.d r1 = (T2.d) r1
            d3.e r1 = r1.f8997b
        L25:
            d3.i r3 = r1.b()
            f3.e r3 = r3.f11281g
            T2.p r4 = T2.q.a
            f3.f r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof f3.C0876b
            if (r4 == 0) goto L60
            m0.b r4 = r0.a()
            boolean r5 = r0 instanceof T2.e
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            m0.b r8 = r13.a()
            w0.j r9 = r12.f9022w
            f3.b r3 = (f3.C0876b) r3
            boolean r4 = r1 instanceof d3.C0803o
            if (r4 == 0) goto L56
            d3.o r1 = (d3.C0803o) r1
            boolean r1 = r1.f11322g
            if (r1 != 0) goto L53
            goto L56
        L53:
            r1 = 0
        L54:
            r11 = r1
            goto L58
        L56:
            r1 = 1
            goto L54
        L58:
            T2.v r6 = new T2.v
            int r10 = r3.f11434c
            r6.<init>(r7, r8, r9, r10, r11)
            goto L61
        L60:
            r6 = r2
        L61:
            if (r6 == 0) goto L64
            goto L68
        L64:
            m0.b r6 = r13.a()
        L68:
            r12.f9020u = r6
            O.g0 r1 = r12.f9016q
            r1.setValue(r6)
            M5.c r1 = r12.f9014o
            if (r1 == 0) goto L9e
            m0.b r1 = r0.a()
            m0.b r3 = r13.a()
            if (r1 == r3) goto L9e
            m0.b r0 = r0.a()
            boolean r1 = r0 instanceof O.w0
            if (r1 == 0) goto L88
            O.w0 r0 = (O.w0) r0
            goto L89
        L88:
            r0 = r2
        L89:
            if (r0 == 0) goto L8e
            r0.e()
        L8e:
            m0.b r13 = r13.a()
            boolean r0 = r13 instanceof O.w0
            if (r0 == 0) goto L99
            r2 = r13
            O.w0 r2 = (O.w0) r2
        L99:
            if (r2 == 0) goto L9e
            r2.a()
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.o.k(T2.g):void");
    }
}
