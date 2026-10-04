package d;

import H.N;
import c.C0740b;
import c.q;
import e4.n;

/* renamed from: d.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778l extends q {

    /* renamed from: d, reason: collision with root package name */
    public M5.c f11188d;

    /* renamed from: e, reason: collision with root package name */
    public n f11189e;

    /* renamed from: f, reason: collision with root package name */
    public N f11190f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11191g;

    @Override // c.q
    public final void a() {
        N n7 = this.f11190f;
        if (n7 != null) {
            n7.e();
        }
        N n8 = this.f11190f;
        if (n8 != null) {
            n8.f2900b = false;
        }
        this.f11191g = false;
    }

    @Override // c.q
    public final void b() {
        N n7 = this.f11190f;
        if (n7 != null && !n7.f2900b) {
            n7.e();
            this.f11190f = null;
        }
        if (this.f11190f == null) {
            this.f11190f = new N(this.f11188d, false, this.f11189e, this);
        }
        N n8 = this.f11190f;
        if (n8 != null) {
            ((J5.e) n8.f2901c).close(null);
        }
        N n9 = this.f11190f;
        if (n9 != null) {
            n9.f2900b = false;
        }
        this.f11191g = false;
    }

    @Override // c.q
    public final void c(C0740b c0740b) {
        super.c(c0740b);
        N n7 = this.f11190f;
        if (n7 != null) {
            ((J5.e) n7.f2901c).mo2trySendJP2dKIU(c0740b);
        }
    }

    @Override // c.q
    public final void d(C0740b c0740b) {
        super.d(c0740b);
        N n7 = this.f11190f;
        if (n7 != null) {
            n7.e();
        }
        if (this.a) {
            this.f11190f = new N(this.f11188d, true, this.f11189e, this);
        }
        this.f11191g = true;
    }
}
