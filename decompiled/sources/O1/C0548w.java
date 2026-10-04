package O1;

import B1.AbstractC0015b;
import y1.C2401x;

/* renamed from: O1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548w extends i0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7498l;

    /* renamed from: m, reason: collision with root package name */
    public final y1.O f7499m;

    /* renamed from: n, reason: collision with root package name */
    public final y1.N f7500n;

    /* renamed from: o, reason: collision with root package name */
    public C0546u f7501o;

    /* renamed from: p, reason: collision with root package name */
    public C0545t f7502p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7503q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7504r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7505s;

    public C0548w(AbstractC0527a abstractC0527a, boolean z7) {
        super(abstractC0527a);
        this.f7498l = z7 && abstractC0527a.h();
        this.f7499m = new y1.O();
        this.f7500n = new y1.N();
        y1.P pF = abstractC0527a.f();
        if (pF == null) {
            this.f7501o = new C0546u(new C0547v(abstractC0527a.g()), y1.O.f17953p, C0546u.f7494e);
        } else {
            this.f7501o = new C0546u(pF, null, null);
            this.f7505s = true;
        }
    }

    @Override // O1.i0
    public final void A() {
        if (this.f7498l) {
            return;
        }
        this.f7503q = true;
        z();
    }

    @Override // O1.AbstractC0527a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final C0545t a(B b4, R1.f fVar, long j7) {
        C0545t c0545t = new C0545t(b4, fVar, j7);
        AbstractC0015b.h(c0545t.f7490n == null);
        c0545t.f7490n = this.f7455k;
        if (!this.f7504r) {
            this.f7502p = c0545t;
            if (!this.f7503q) {
                this.f7503q = true;
                z();
            }
            return c0545t;
        }
        Object obj = this.f7501o.f7496d;
        Object obj2 = b4.a;
        if (obj != null && obj2.equals(C0546u.f7494e)) {
            obj2 = this.f7501o.f7496d;
        }
        c0545t.h(b4.a(obj2));
        return c0545t;
    }

    public final boolean C(long j7) {
        C0545t c0545t = this.f7502p;
        int iB = this.f7501o.b(c0545t.f7487k.a);
        if (iB == -1) {
            return false;
        }
        C0546u c0546u = this.f7501o;
        y1.N n7 = this.f7500n;
        c0546u.f(iB, n7, false);
        long j8 = n7.f17949d;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        c0545t.f7493q = j7;
        return true;
    }

    @Override // O1.AbstractC0527a
    public final void m(InterfaceC0551z interfaceC0551z) {
        C0545t c0545t = (C0545t) interfaceC0551z;
        if (c0545t.f7491o != null) {
            AbstractC0527a abstractC0527a = c0545t.f7490n;
            abstractC0527a.getClass();
            abstractC0527a.m(c0545t.f7491o);
        }
        if (interfaceC0551z == this.f7502p) {
            this.f7502p = null;
        }
    }

    @Override // O1.AbstractC0537k, O1.AbstractC0527a
    public final void o() {
        this.f7504r = false;
        this.f7503q = false;
        super.o();
    }

    @Override // O1.i0, O1.AbstractC0527a
    public final void r(C2401x c2401x) {
        if (this.f7505s) {
            C0546u c0546u = this.f7501o;
            this.f7501o = new C0546u(new H1.i0(this.f7501o.f7481b, c2401x), c0546u.f7495c, c0546u.f7496d);
        } else {
            this.f7501o = new C0546u(new C0547v(c2401x), y1.O.f17953p, C0546u.f7494e);
        }
        this.f7455k.r(c2401x);
    }

    @Override // O1.i0
    public final B x(B b4) {
        Object obj = b4.a;
        Object obj2 = this.f7501o.f7496d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0546u.f7494e;
        }
        return b4.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // O1.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(y1.P r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.C0548w.y(y1.P):void");
    }

    @Override // O1.AbstractC0537k, O1.AbstractC0527a
    public final void i() {
    }
}
