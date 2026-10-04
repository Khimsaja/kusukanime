package W0;

import O.C0486d;
import O.C0510p;
import O3.C;
import e5.AbstractC0832b;
import f6.AbstractC0905c;
import y.C2303C;
import y.InterfaceC2339t;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9560l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9561m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9562n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f9563o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f9564p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f9565q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e4.k kVar, a0.q qVar, e4.k kVar2, int i7, int i8) {
        super(2);
        this.f9563o = kVar;
        this.f9565q = qVar;
        this.f9564p = kVar2;
        this.f9561m = i7;
        this.f9562n = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9560l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f9561m | 1);
                e4.k kVar = (e4.k) this.f9563o;
                androidx.compose.ui.viewinterop.a.b(kVar, (a0.q) this.f9565q, (e4.k) this.f9564p, (C0510p) obj, iV, this.f9562n);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f9562n | 1);
                int i7 = this.f9561m;
                Object obj3 = this.f9565q;
                AbstractC0905c.c((InterfaceC2339t) this.f9563o, this.f9564p, i7, obj3, (C0510p) obj, iV2);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f9562n | 1);
                W.a aVar = (W.a) this.f9565q;
                AbstractC0832b.d(this.f9563o, this.f9561m, (C2303C) this.f9564p, aVar, (C0510p) obj, iV3);
                break;
        }
        return C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object obj, int i7, C2303C c2303c, W.a aVar, int i8) {
        super(2);
        this.f9563o = obj;
        this.f9561m = i7;
        this.f9564p = c2303c;
        this.f9565q = aVar;
        this.f9562n = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC2339t interfaceC2339t, Object obj, int i7, Object obj2, int i8) {
        super(2);
        this.f9563o = interfaceC2339t;
        this.f9564p = obj;
        this.f9561m = i7;
        this.f9565q = obj2;
        this.f9562n = i8;
    }
}
