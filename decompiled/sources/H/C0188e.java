package H;

import O.C0486d;
import O.C0510p;

/* renamed from: H.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188e extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0196m f2963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2964m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S0.h f2965n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2966o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2967p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a0.q f2968q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2969r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188e(InterfaceC0196m interfaceC0196m, boolean z7, S0.h hVar, boolean z8, long j7, a0.q qVar, int i7) {
        super(2);
        this.f2963l = interfaceC0196m;
        this.f2964m = z7;
        this.f2965n = hVar;
        this.f2966o = z8;
        this.f2967p = j7;
        this.f2968q = qVar;
        this.f2969r = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f2969r | 1);
        S0.h hVar = this.f2965n;
        boolean z7 = this.f2966o;
        android.support.v4.media.session.b.g(this.f2963l, this.f2964m, hVar, z7, this.f2967p, this.f2968q, (C0510p) obj, iV);
        return O3.C.a;
    }
}
