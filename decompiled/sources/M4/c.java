package M4;

import A4.r;
import B2.l;
import e4.InterfaceC0821a;
import n5.M;
import n5.P;
import u4.InterfaceC2102h;
import u4.Q;

/* loaded from: classes.dex */
public final class c implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final l f6557k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f6558l;

    /* renamed from: m, reason: collision with root package name */
    public final a f6559m;

    /* renamed from: n, reason: collision with root package name */
    public final M f6560n;

    /* renamed from: o, reason: collision with root package name */
    public final r f6561o;

    public c(l lVar, Q q6, a aVar, M m7, r rVar) {
        this.f6557k = lVar;
        this.f6558l = q6;
        this.f6559m = aVar;
        this.f6560n = m7;
        this.f6561o = rVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        P p7 = (P) this.f6557k.f418n;
        InterfaceC2102h interfaceC2102hF = this.f6560n.f();
        return p7.k(this.f6558l, a.a(a.a(this.f6559m, null, false, null, interfaceC2102hF != null ? interfaceC2102hF.g() : null, 31), null, this.f6561o.d(), null, null, 59));
    }
}
