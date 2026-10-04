package L;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import p.C1743c;
import r.C1859a;

/* renamed from: L.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375h extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O3.e f5583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5584o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5585p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5586q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0375h(W.a aVar, Object obj, Object obj2, Object obj3, int i7) {
        super(2);
        this.f5581l = 2;
        this.f5583n = aVar;
        this.f5582m = obj;
        this.f5585p = obj2;
        this.f5586q = obj3;
        this.f5584o = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5581l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f5584o | 1);
                W.a aVar = (W.a) this.f5583n;
                AbstractC0379i.d((InterfaceC0821a) this.f5582m, (a0.n) this.f5585p, (X0.q) this.f5586q, aVar, (C0510p) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f5584o | 1);
                W.a aVar2 = (W.a) this.f5583n;
                E0.g((InterfaceC0821a) this.f5582m, (C0385j1) this.f5585p, (C1743c) this.f5586q, aVar2, (C0510p) obj, iV2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f5584o) | 1;
                Object obj3 = this.f5585p;
                Object obj4 = this.f5586q;
                ((W.a) this.f5583n).c(this.f5582m, obj3, obj4, (C0510p) obj, iV3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iV4 = C0486d.V(this.f5584o | 1);
                A3.t tVar = (A3.t) this.f5583n;
                AbstractC0832b.a((r.l) this.f5585p, (InterfaceC0821a) this.f5582m, (a0.q) this.f5586q, tVar, (C0510p) obj, iV4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV5 = C0486d.V(this.f5584o | 1);
                A3.t tVar2 = (A3.t) this.f5583n;
                r.n.d((r.f) this.f5585p, (InterfaceC0821a) this.f5582m, (C1859a) this.f5586q, tVar2, (C0510p) obj, iV5);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0375h(InterfaceC0821a interfaceC0821a, Object obj, Object obj2, W.a aVar, int i7, int i8) {
        super(2);
        this.f5581l = i8;
        this.f5582m = interfaceC0821a;
        this.f5585p = obj;
        this.f5586q = obj2;
        this.f5583n = aVar;
        this.f5584o = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0375h(r.f fVar, InterfaceC0821a interfaceC0821a, C1859a c1859a, A3.t tVar, int i7) {
        super(2);
        this.f5581l = 4;
        this.f5585p = fVar;
        this.f5582m = interfaceC0821a;
        this.f5586q = c1859a;
        this.f5583n = tVar;
        this.f5584o = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0375h(r.l lVar, InterfaceC0821a interfaceC0821a, a0.q qVar, A3.t tVar, int i7) {
        super(2);
        this.f5581l = 3;
        this.f5585p = lVar;
        this.f5582m = interfaceC0821a;
        this.f5586q = qVar;
        this.f5583n = tVar;
        this.f5584o = i7;
    }
}
