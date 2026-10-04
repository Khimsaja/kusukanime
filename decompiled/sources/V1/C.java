package V1;

import B1.AbstractC0015b;
import O1.S;
import y1.C2392n;

/* loaded from: classes.dex */
public final class C implements n {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9313b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9314c;

    /* renamed from: d, reason: collision with root package name */
    public int f9315d;

    /* renamed from: e, reason: collision with root package name */
    public int f9316e;

    /* renamed from: f, reason: collision with root package name */
    public S f9317f;

    /* renamed from: g, reason: collision with root package name */
    public G f9318g;

    public C(String str, int i7, int i8) {
        this.a = i7;
        this.f9313b = i8;
        this.f9314c = str;
    }

    @Override // V1.n
    public final boolean b(o oVar) {
        int i7 = this.f9313b;
        int i8 = this.a;
        AbstractC0015b.h((i8 == -1 || i7 == -1) ? false : true);
        B1.B b4 = new B1.B(i7);
        ((k) oVar).h(b4.a, 0, i7, false);
        return b4.z() == i8;
    }

    @Override // V1.n
    public final void d(p pVar) {
        S s7 = (S) pVar;
        this.f9317f = s7;
        G gM = s7.m(1024, 4);
        this.f9318g = gM;
        C2392n c2392n = new C2392n();
        String str = this.f9314c;
        c2392n.f18073l = y1.D.m(str);
        c2392n.f18074m = y1.D.m(str);
        A6.b.r(c2392n, gM);
        this.f9317f.b();
        this.f9317f.k(new D());
        this.f9316e = 1;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        if (j7 == 0 || this.f9316e == 1) {
            this.f9316e = 1;
            this.f9315d = 0;
        }
    }

    @Override // V1.n
    public final int i(o oVar, r rVar) {
        int i7 = this.f9316e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        G g4 = this.f9318g;
        g4.getClass();
        int iD = g4.d(oVar, 1024, true);
        if (iD != -1) {
            this.f9315d += iD;
            return 0;
        }
        this.f9316e = 2;
        this.f9318g.b(0L, 1, this.f9315d, 0, null);
        this.f9315d = 0;
        return 0;
    }

    @Override // V1.n
    public final void a() {
    }
}
