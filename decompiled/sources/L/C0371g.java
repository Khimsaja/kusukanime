package L;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;
import h0.InterfaceC0973S;

/* renamed from: L.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371g extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f5554A;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5555l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5556m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W.a f5557n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a0.n f5558o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W.a f5559p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e4.n f5560q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W.a f5561r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5562s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f5563t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f5564u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f5565v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f5566w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f5567x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ X0.q f5568y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f5569z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0371g(InterfaceC0821a interfaceC0821a, W.a aVar, a0.n nVar, W.a aVar2, e4.n nVar2, W.a aVar3, InterfaceC0973S interfaceC0973S, long j7, long j8, long j9, long j10, float f5, X0.q qVar, int i7, int i8, int i9) {
        super(2);
        this.f5555l = i9;
        this.f5556m = interfaceC0821a;
        this.f5557n = aVar;
        this.f5558o = nVar;
        this.f5559p = aVar2;
        this.f5560q = nVar2;
        this.f5561r = aVar3;
        this.f5562s = interfaceC0973S;
        this.f5563t = j7;
        this.f5564u = j8;
        this.f5565v = j9;
        this.f5566w = j10;
        this.f5567x = f5;
        this.f5568y = qVar;
        this.f5569z = i7;
        this.f5554A = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        switch (this.f5555l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f5569z | 1);
                int iV2 = C0486d.V(this.f5554A);
                AbstractC0379i.c(this.f5556m, this.f5557n, this.f5558o, this.f5559p, this.f5560q, this.f5561r, this.f5562s, this.f5563t, this.f5564u, this.f5565v, this.f5566w, this.f5567x, this.f5568y, c0510p, iV, iV2);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f5569z | 1);
                E0.a(this.f5556m, this.f5557n, this.f5558o, this.f5559p, this.f5560q, this.f5561r, this.f5562s, this.f5563t, this.f5564u, this.f5565v, this.f5566w, this.f5567x, this.f5568y, c0510p, iV3, this.f5554A);
                break;
        }
        return O3.C.a;
    }
}
