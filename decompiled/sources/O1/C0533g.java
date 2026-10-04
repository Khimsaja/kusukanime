package O1;

import B1.AbstractC0015b;
import java.util.ArrayList;

/* renamed from: O1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533g extends i0 {

    /* renamed from: l, reason: collision with root package name */
    public final long f7440l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7441m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7442n;

    /* renamed from: o, reason: collision with root package name */
    public final y1.O f7443o;

    /* renamed from: p, reason: collision with root package name */
    public C0531e f7444p;

    /* renamed from: q, reason: collision with root package name */
    public C0532f f7445q;

    /* renamed from: r, reason: collision with root package name */
    public long f7446r;

    /* renamed from: s, reason: collision with root package name */
    public long f7447s;

    public C0533g(C0530d c0530d) {
        super(c0530d.a);
        this.f7440l = c0530d.f7422b;
        this.f7441m = c0530d.f7423c;
        this.f7442n = new ArrayList();
        this.f7443o = new y1.O();
    }

    public final void B(y1.P p7) {
        long j7;
        y1.O o7 = this.f7443o;
        p7.n(0, o7);
        long j8 = o7.f17968o;
        C0531e c0531e = this.f7444p;
        ArrayList arrayList = this.f7442n;
        long j9 = this.f7440l;
        if (c0531e == null || arrayList.isEmpty()) {
            this.f7446r = j8;
            this.f7447s = j9 != Long.MIN_VALUE ? j8 + j9 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0529c c0529c = (C0529c) arrayList.get(i7);
                long j10 = this.f7446r;
                long j11 = this.f7447s;
                c0529c.f7417o = j10;
                c0529c.f7418p = j11;
            }
            j7 = 0;
        } else {
            j7 = this.f7446r - j8;
            j9 = j9 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f7447s - j8;
        }
        try {
            C0531e c0531e2 = new C0531e(p7, j7, j9);
            this.f7444p = c0531e2;
            l(c0531e2);
        } catch (C0532f e7) {
            this.f7445q = e7;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C0529c) arrayList.get(i8)).f7419q = this.f7445q;
            }
        }
    }

    @Override // O1.AbstractC0527a
    public final InterfaceC0551z a(B b4, R1.f fVar, long j7) {
        C0529c c0529c = new C0529c(this.f7455k.a(b4, fVar, j7), this.f7441m, this.f7446r, this.f7447s);
        this.f7442n.add(c0529c);
        return c0529c;
    }

    @Override // O1.AbstractC0537k, O1.AbstractC0527a
    public final void i() throws C0532f {
        C0532f c0532f = this.f7445q;
        if (c0532f != null) {
            throw c0532f;
        }
        super.i();
    }

    @Override // O1.AbstractC0527a
    public final void m(InterfaceC0551z interfaceC0551z) {
        ArrayList arrayList = this.f7442n;
        AbstractC0015b.h(arrayList.remove(interfaceC0551z));
        this.f7455k.m(((C0529c) interfaceC0551z).f7413k);
        if (arrayList.isEmpty()) {
            C0531e c0531e = this.f7444p;
            c0531e.getClass();
            B(c0531e.f7481b);
        }
    }

    @Override // O1.AbstractC0537k, O1.AbstractC0527a
    public final void o() {
        super.o();
        this.f7445q = null;
        this.f7444p = null;
    }

    @Override // O1.i0
    public final void y(y1.P p7) {
        if (this.f7445q != null) {
            return;
        }
        B(p7);
    }
}
