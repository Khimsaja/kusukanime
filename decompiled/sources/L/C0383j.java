package L;

import O.C0486d;
import O.C0510p;
import h0.InterfaceC0973S;
import p.C1727N;

/* renamed from: L.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383j extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5615l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.n f5616m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1727N f5617n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ O.Z f5618o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q.o0 f5619p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5620q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5621r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f5622s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f5623t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ W.a f5624u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383j(a0.n nVar, C1727N c1727n, O.Z z7, q.o0 o0Var, InterfaceC0973S interfaceC0973S, long j7, float f5, float f7, W.a aVar) {
        super(2);
        this.f5616m = nVar;
        this.f5617n = c1727n;
        this.f5618o = z7;
        this.f5619p = o0Var;
        this.f5620q = interfaceC0973S;
        this.f5621r = j7;
        this.f5622s = f5;
        this.f5623t = f7;
        this.f5624u = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5615l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    C0.a(this.f5616m, this.f5617n, this.f5618o, this.f5619p, this.f5620q, this.f5621r, this.f5622s, this.f5623t, this.f5624u, c0510p, 384);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iV = C0486d.V(385);
                W.a aVar = this.f5624u;
                C1727N c1727n = this.f5617n;
                float f5 = this.f5622s;
                float f7 = this.f5623t;
                C0.a(this.f5616m, c1727n, this.f5618o, this.f5619p, this.f5620q, this.f5621r, f5, f7, aVar, (C0510p) obj, iV);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383j(a0.n nVar, C1727N c1727n, O.Z z7, q.o0 o0Var, InterfaceC0973S interfaceC0973S, long j7, float f5, float f7, W.a aVar, int i7) {
        super(2);
        this.f5616m = nVar;
        this.f5617n = c1727n;
        this.f5618o = z7;
        this.f5619p = o0Var;
        this.f5620q = interfaceC0973S;
        this.f5621r = j7;
        this.f5622s = f5;
        this.f5623t = f7;
        this.f5624u = aVar;
    }
}
