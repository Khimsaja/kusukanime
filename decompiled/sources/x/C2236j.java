package x;

import java.util.List;
import y.C2343x;
import y.InterfaceC2345z;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2236j implements InterfaceC2345z {
    public final C2234h a;

    /* renamed from: b, reason: collision with root package name */
    public final C2343x f17211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2343x f17213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f17214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f17217h;

    public C2236j(C2234h c2234h, C2343x c2343x, int i7, v vVar, int i8, int i9, long j7) {
        this.f17213d = c2343x;
        this.f17214e = vVar;
        this.f17215f = i8;
        this.f17216g = i9;
        this.f17217h = j7;
        this.a = c2234h;
        this.f17211b = c2343x;
        this.f17212c = i7;
    }

    public final C2240n a(int i7, long j7, int i8, int i9, int i10) {
        int i11;
        C2234h c2234h = this.a;
        Object objC = c2234h.c(i7);
        Object objX = c2234h.f17209b.X(i7);
        List listB = this.f17211b.b(i7, j7);
        if (T0.a.f(j7)) {
            i11 = T0.a.j(j7);
        } else {
            if (!T0.a.e(j7)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            i11 = T0.a.i(j7);
        }
        int i12 = i11;
        T0.k layoutDirection = this.f17213d.f17648l.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.a aVar = this.f17214e.f17288k;
        return new C2240n(i7, objC, i12, i10, layoutDirection, this.f17215f, this.f17216g, listB, this.f17217h, objX, aVar, j7, i8, i9);
    }
}
