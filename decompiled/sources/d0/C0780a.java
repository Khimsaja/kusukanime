package d0;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import e4.k;
import h0.AbstractC0982e;
import h0.C0981d;
import h0.InterfaceC0995r;
import j0.C1295a;
import j0.C1296b;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780a extends View.DragShadowBuilder {
    public final T0.c a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11194b;

    /* renamed from: c, reason: collision with root package name */
    public final k f11195c;

    public C0780a(T0.c cVar, long j7, k kVar) {
        this.a = cVar;
        this.f11194b = j7;
        this.f11195c = kVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C1296b c1296b = new C1296b();
        T0.k kVar = T0.k.f8844k;
        Canvas canvas2 = AbstractC0982e.a;
        C0981d c0981d = new C0981d();
        c0981d.a = canvas;
        C1295a c1295a = c1296b.f12204k;
        T0.b bVar = c1295a.a;
        T0.k kVar2 = c1295a.f12201b;
        InterfaceC0995r interfaceC0995r = c1295a.f12202c;
        long j7 = c1295a.f12203d;
        c1295a.a = this.a;
        c1295a.f12201b = kVar;
        c1295a.f12202c = c0981d;
        c1295a.f12203d = this.f11194b;
        c0981d.l();
        this.f11195c.invoke(c1296b);
        c0981d.i();
        c1295a.a = bVar;
        c1295a.f12201b = kVar2;
        c1295a.f12202c = interfaceC0995r;
        c1295a.f12203d = j7;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j7 = this.f11194b;
        float fD = g0.f.d(j7);
        T0.c cVar = this.a;
        point.set(cVar.O(fD / cVar.a()), cVar.O(g0.f.b(j7) / cVar.a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
