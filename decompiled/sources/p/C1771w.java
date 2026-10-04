package p;

import o.AbstractC1598J;
import o.AbstractC1604b;
import o.C1596H;
import o.C1597I;

/* renamed from: p.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1771w implements InterfaceC1753h {
    public final A2.b a;

    /* renamed from: b, reason: collision with root package name */
    public final B0 f14151b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14152c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1766r f14153d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1766r f14154e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1766r f14155f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14156g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14157h;

    public C1771w(C1772x c1772x, B0 b02, Object obj, AbstractC1766r abstractC1766r) {
        A2.b bVar = new A2.b(13, c1772x.a);
        this.a = bVar;
        this.f14151b = b02;
        this.f14152c = obj;
        AbstractC1766r abstractC1766r2 = (AbstractC1766r) b02.a.invoke(obj);
        this.f14153d = abstractC1766r2;
        this.f14154e = AbstractC1745d.k(abstractC1766r);
        this.f14156g = b02.f13838b.invoke(bVar.u(abstractC1766r2, abstractC1766r));
        if (((AbstractC1766r) bVar.f112n) == null) {
            bVar.f112n = abstractC1766r2.c();
        }
        AbstractC1766r abstractC1766r3 = (AbstractC1766r) bVar.f112n;
        if (abstractC1766r3 == null) {
            kotlin.jvm.internal.l.l("velocityVector");
            throw null;
        }
        int iB = abstractC1766r3.b();
        long jMax = 0;
        for (int i7 = 0; i7 < iB; i7++) {
            abstractC1766r2.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((C1597I) ((X4.y) bVar.f110l).f9916l).b(abstractC1766r.a(i7)) / (AbstractC1598J.a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f14157h = jMax;
        AbstractC1766r abstractC1766rK = AbstractC1745d.k(this.a.v(jMax, this.f14153d, abstractC1766r));
        this.f14155f = abstractC1766rK;
        int iB2 = abstractC1766rK.b();
        for (int i8 = 0; i8 < iB2; i8++) {
            AbstractC1766r abstractC1766r4 = this.f14155f;
            float fA = abstractC1766r4.a(i8);
            this.a.getClass();
            this.a.getClass();
            abstractC1766r4.e(e3.c.j(fA, -0.0f, 0.0f), i8);
        }
    }

    @Override // p.InterfaceC1753h
    public final boolean a() {
        return false;
    }

    @Override // p.InterfaceC1753h
    public final Object b(long j7) {
        if (g(j7)) {
            return this.f14156g;
        }
        e4.k kVar = this.f14151b.f13838b;
        A2.b bVar = this.a;
        AbstractC1766r abstractC1766r = (AbstractC1766r) bVar.f111m;
        AbstractC1766r abstractC1766r2 = this.f14153d;
        if (abstractC1766r == null) {
            bVar.f111m = abstractC1766r2.c();
        }
        AbstractC1766r abstractC1766r3 = (AbstractC1766r) bVar.f111m;
        String str = "valueVector";
        if (abstractC1766r3 == null) {
            kotlin.jvm.internal.l.l("valueVector");
            throw null;
        }
        int iB = abstractC1766r3.b();
        int i7 = 0;
        while (i7 < iB) {
            AbstractC1766r abstractC1766r4 = (AbstractC1766r) bVar.f111m;
            if (abstractC1766r4 == null) {
                kotlin.jvm.internal.l.l(str);
                throw null;
            }
            float fA = abstractC1766r2.a(i7);
            long j8 = j7 / 1000000;
            C1596H c1596hA = ((C1597I) ((X4.y) bVar.f110l).f9916l).a(this.f14154e.a(i7));
            String str2 = str;
            long j9 = c1596hA.f13484c;
            abstractC1766r4.e((Math.signum(c1596hA.a) * c1596hA.f13483b * AbstractC1604b.a(j9 > 0 ? j8 / j9 : 1.0f).a) + fA, i7);
            i7++;
            str = str2;
        }
        String str3 = str;
        AbstractC1766r abstractC1766r5 = (AbstractC1766r) bVar.f111m;
        if (abstractC1766r5 != null) {
            return kVar.invoke(abstractC1766r5);
        }
        kotlin.jvm.internal.l.l(str3);
        throw null;
    }

    @Override // p.InterfaceC1753h
    public final long c() {
        return this.f14157h;
    }

    @Override // p.InterfaceC1753h
    public final B0 d() {
        return this.f14151b;
    }

    @Override // p.InterfaceC1753h
    public final Object e() {
        return this.f14156g;
    }

    @Override // p.InterfaceC1753h
    public final AbstractC1766r f(long j7) {
        if (g(j7)) {
            return this.f14155f;
        }
        return this.a.v(j7, this.f14153d, this.f14154e);
    }
}
