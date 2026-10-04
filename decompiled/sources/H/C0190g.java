package H;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;

/* renamed from: H.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190g extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2973l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2974m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2975n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2976o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2977p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190g(a0.q qVar, InterfaceC0821a interfaceC0821a, boolean z7, int i7) {
        super(2);
        this.f2976o = qVar;
        this.f2977p = interfaceC0821a;
        this.f2974m = z7;
        this.f2975n = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f2973l;
        C0510p c0510p = (C0510p) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                int iV = C0486d.V(this.f2975n | 1);
                android.support.v4.media.session.b.h((a0.q) this.f2976o, (InterfaceC0821a) this.f2977p, this.f2974m, c0510p, iV);
                break;
            default:
                int iV2 = C0486d.V(this.f2975n | 1);
                P3.r.d(this.f2974m, (S0.h) this.f2976o, (S) this.f2977p, c0510p, iV2);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190g(boolean z7, S0.h hVar, S s7, int i7) {
        super(2);
        this.f2974m = z7;
        this.f2976o = hVar;
        this.f2977p = s7;
        this.f2975n = i7;
    }
}
