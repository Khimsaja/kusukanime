package e0;

import A.m;
import X4.y;
import a0.p;
import e4.k;
import f6.AbstractC0905c;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;
import y0.AbstractC2359f;
import y0.C2351F;
import y0.InterfaceC2368o;
import y0.a0;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810b extends p implements a0, InterfaceC0809a, InterfaceC2368o {

    /* renamed from: x, reason: collision with root package name */
    public final C0811c f11332x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11333y;

    /* renamed from: z, reason: collision with root package name */
    public k f11334z;

    public C0810b(C0811c c0811c, k kVar) {
        this.f11332x = c0811c;
        this.f11334z = kVar;
        c0811c.f11335k = this;
    }

    public final void G0() {
        this.f11333y = false;
        this.f11332x.f11336l = null;
        AbstractC2359f.n(this);
    }

    @Override // y0.a0
    public final void K() {
        G0();
    }

    @Override // e0.InterfaceC0809a
    public final T0.b a() {
        return AbstractC2359f.v(this).f17655B;
    }

    @Override // e0.InterfaceC0809a
    public final long d() {
        return AbstractC1420H.O(AbstractC2359f.t(this, 128).f16842m);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        boolean z7 = this.f11333y;
        C0811c c0811c = this.f11332x;
        if (!z7) {
            c0811c.f11336l = null;
            AbstractC2359f.s(this, new m(8, this, c0811c));
            if (c0811c.f11336l == null) {
                AbstractC0905c.D("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f11333y = true;
        }
        y yVar = c0811c.f11336l;
        l.c(yVar);
        ((kotlin.jvm.internal.m) yVar.f9916l).invoke(c2351f);
    }

    @Override // e0.InterfaceC0809a
    public final T0.k getLayoutDirection() {
        return AbstractC2359f.v(this).f17656C;
    }

    @Override // y0.InterfaceC2368o
    public final void n0() {
        G0();
    }

    @Override // a0.p
    public final void z0() {
    }
}
