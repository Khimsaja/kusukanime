package Y;

/* loaded from: classes.dex */
public abstract class h {
    public m a;

    /* renamed from: b, reason: collision with root package name */
    public int f9980b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9981c;

    /* renamed from: d, reason: collision with root package name */
    public int f9982d;

    public h(int i7, m mVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = mVar;
        this.f9980b = i7;
        if (i7 != 0) {
            m mVarE = e();
            B2.l lVar = o.a;
            int[] iArr = mVarE.f9998n;
            if (iArr != null) {
                i7 = iArr[0];
            } else {
                long j7 = mVarE.f9996l;
                int i8 = mVarE.f9997m;
                if (j7 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j7);
                } else {
                    long j8 = mVarE.f9995k;
                    if (j8 != 0) {
                        i8 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
                    }
                }
                i7 = iNumberOfTrailingZeros + i8;
            }
            synchronized (o.f10002b) {
                iA = o.f10005e.a(i7);
            }
        } else {
            iA = -1;
        }
        this.f9982d = iA;
    }

    public static void p(h hVar) {
        o.a.L(hVar);
    }

    public final void a() {
        synchronized (o.f10002b) {
            b();
            o();
        }
    }

    public void b() {
        o.f10003c = o.f10003c.h(d());
    }

    public abstract void c();

    public int d() {
        return this.f9980b;
    }

    public m e() {
        return this.a;
    }

    public abstract e4.k f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract e4.k i();

    public final h j() {
        B2.l lVar = o.a;
        h hVar = (h) lVar.s();
        lVar.L(this);
        return hVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(v vVar);

    public void o() {
        int i7 = this.f9982d;
        if (i7 >= 0) {
            o.u(i7);
            this.f9982d = -1;
        }
    }

    public void q(int i7) {
        this.f9980b = i7;
    }

    public void r(m mVar) {
        this.a = mVar;
    }

    public void s(int i7) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract h t(e4.k kVar);
}
