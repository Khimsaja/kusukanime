package w;

import java.util.List;
import y.C2343x;
import y.InterfaceC2345z;

/* loaded from: classes.dex */
public final class i implements InterfaceC2345z {
    public final g a;

    /* renamed from: b, reason: collision with root package name */
    public final C2343x f16714b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16715c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f16716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2343x f16717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0.c f16720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0.h f16721i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16722j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16723k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f16724l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f16725m;

    public i(long j7, boolean z7, g gVar, C2343x c2343x, int i7, int i8, a0.c cVar, a0.h hVar, int i9, int i10, long j8, u uVar) {
        this.f16716d = z7;
        this.f16717e = c2343x;
        this.f16718f = i7;
        this.f16719g = i8;
        this.f16720h = cVar;
        this.f16721i = hVar;
        this.f16722j = i9;
        this.f16723k = i10;
        this.f16724l = j8;
        this.f16725m = uVar;
        this.a = gVar;
        this.f16714b = c2343x;
        this.f16715c = q0.c.b(z7 ? T0.a.h(j7) : Integer.MAX_VALUE, z7 ? Integer.MAX_VALUE : T0.a.g(j7), 5);
    }

    public final m a(int i7, long j7) {
        g gVar = this.a;
        Object objC = gVar.c(i7);
        Object objX = gVar.f16697b.X(i7);
        List listB = this.f16714b.b(i7, j7);
        int i8 = i7 == this.f16718f + (-1) ? 0 : this.f16719g;
        return new m(i7, listB, this.f16716d, this.f16720h, this.f16721i, this.f16717e.f17648l.getLayoutDirection(), this.f16722j, this.f16723k, i8, this.f16724l, objC, objX, this.f16725m.f16802m, j7);
    }
}
