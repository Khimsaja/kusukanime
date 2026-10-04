package D;

import H.InterfaceC0196m;
import L.M2;
import L.N2;
import M.AbstractC0461t;
import O.C0486d;
import O.C0510p;

/* renamed from: D.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040a extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1122l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1123m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1124n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1125o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0040a(long j7, Object obj, O3.e eVar, int i7) {
        super(2);
        this.f1122l = i7;
        this.f1123m = j7;
        this.f1124n = obj;
        this.f1125o = eVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1122l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(1);
                long j7 = this.f1123m;
                AbstractC0052g.a((InterfaceC0196m) this.f1124n, (a0.q) this.f1125o, j7, (C0510p) obj, iV);
                break;
            case 1:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    AbstractC0461t.a(this.f1123m, ((M2) c0510p.k(N2.a)).f5221m, W.f.b(1327513942, new H.M(6, (v.Z) this.f1124n, (e4.o) this.f1125o), c0510p), c0510p, 384);
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    M.W.b(this.f1123m, (H0.I) this.f1124n, (e4.n) this.f1125o, c0510p2, 0);
                }
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040a(InterfaceC0196m interfaceC0196m, a0.q qVar, long j7, int i7) {
        super(2);
        this.f1122l = 0;
        this.f1124n = interfaceC0196m;
        this.f1125o = qVar;
        this.f1123m = j7;
    }
}
