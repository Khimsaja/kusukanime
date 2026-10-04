package k0;

import L.N0;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import f1.AbstractC0870c;
import h0.C0981d;
import h0.C0996s;
import h0.InterfaceC0995r;
import j0.AbstractC1297c;
import j0.C1295a;
import j0.C1296b;
import l0.AbstractC1407a;

/* loaded from: classes.dex */
public final class m extends View {

    /* renamed from: u, reason: collision with root package name */
    public static final N0 f12646u = new N0(3);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1407a f12647k;

    /* renamed from: l, reason: collision with root package name */
    public final C0996s f12648l;

    /* renamed from: m, reason: collision with root package name */
    public final C1296b f12649m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12650n;

    /* renamed from: o, reason: collision with root package name */
    public Outline f12651o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12652p;

    /* renamed from: q, reason: collision with root package name */
    public T0.b f12653q;

    /* renamed from: r, reason: collision with root package name */
    public T0.k f12654r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.m f12655s;

    /* renamed from: t, reason: collision with root package name */
    public C1375b f12656t;

    public m(AbstractC1407a abstractC1407a, C0996s c0996s, C1296b c1296b) {
        super(abstractC1407a.getContext());
        this.f12647k = abstractC1407a;
        this.f12648l = c0996s;
        this.f12649m = c1296b;
        setOutlineProvider(f12646u);
        this.f12652p = true;
        this.f12653q = AbstractC1297c.a;
        this.f12654r = T0.k.f8844k;
        InterfaceC1377d.a.getClass();
        this.f12655s = C1374a.f12562n;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0996s c0996s = this.f12648l;
        C0981d c0981d = c0996s.a;
        Canvas canvas2 = c0981d.a;
        c0981d.a = canvas;
        T0.b bVar = this.f12653q;
        T0.k kVar = this.f12654r;
        long jF = AbstractC0870c.F(getWidth(), getHeight());
        C1375b c1375b = this.f12656t;
        ?? r9 = this.f12655s;
        C1296b c1296b = this.f12649m;
        B2.l lVar = c1296b.f12205l;
        C1295a c1295a = ((C1296b) lVar.f418n).f12204k;
        T0.b bVar2 = c1295a.a;
        T0.k kVar2 = c1295a.f12201b;
        InterfaceC0995r interfaceC0995rT = lVar.t();
        B2.l lVar2 = c1296b.f12205l;
        long jA = lVar2.A();
        C1375b c1375b2 = (C1375b) lVar2.f417m;
        lVar2.N(bVar);
        lVar2.O(kVar);
        lVar2.M(c0981d);
        lVar2.P(jF);
        lVar2.f417m = c1375b;
        c0981d.l();
        try {
            r9.invoke(c1296b);
            c0981d.i();
            lVar2.N(bVar2);
            lVar2.O(kVar2);
            lVar2.M(interfaceC0995rT);
            lVar2.P(jA);
            lVar2.f417m = c1375b2;
            c0996s.a.a = canvas2;
            this.f12650n = false;
        } catch (Throwable th) {
            c0981d.i();
            lVar2.N(bVar2);
            lVar2.O(kVar2);
            lVar2.M(interfaceC0995rT);
            lVar2.P(jA);
            lVar2.f417m = c1375b2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f12652p;
    }

    public final C0996s getCanvasHolder() {
        return this.f12648l;
    }

    public final View getOwnerView() {
        return this.f12647k;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f12652p;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f12650n) {
            return;
        }
        this.f12650n = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z7) {
        if (this.f12652p != z7) {
            this.f12652p = z7;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z7) {
        this.f12650n = z7;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
