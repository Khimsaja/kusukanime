package v;

import O.C0486d;
import O.C0510p;
import w.C2163d;
import x.C2231e;
import x.C2234h;
import x.C2235i;
import y.C2326g;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2133l extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16458l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f16459m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f16460n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2133l(int i7, int i8, Object obj) {
        super(2);
        this.f16458l = i8;
        this.f16460n = obj;
        this.f16459m = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16458l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f16459m | 1);
                AbstractC2136o.a((a0.q) this.f16460n, (C0510p) obj, iV);
                break;
            case 1:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    w.g gVar = (w.g) this.f16460n;
                    C2.H h7 = gVar.f16697b.a;
                    int i7 = this.f16459m;
                    C2326g c2326gG = h7.g(i7);
                    int i8 = i7 - c2326gG.a;
                    ((C2163d) c2326gG.f17622c).f16694c.invoke(gVar.f16698c, Integer.valueOf(i8), c0510p, 0);
                }
                break;
            case 2:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    C2.H h8 = ((C2234h) this.f16460n).f17209b.f17207b;
                    int i9 = this.f16459m;
                    C2326g c2326gG2 = h8.g(i9);
                    ((C2231e) c2326gG2.f17622c).f17203d.invoke(C2235i.a, Integer.valueOf(i9 - c2326gG2.a), c0510p2, 6);
                }
                break;
            default:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    C2.H h9 = ((z.t) this.f16460n).f18509b.a;
                    int i10 = this.f16459m;
                    C2326g c2326gG3 = h9.g(i10);
                    int i11 = i10 - c2326gG3.a;
                    z.n nVar = (z.n) c2326gG3.f17622c;
                    nVar.f18490b.invoke(z.w.a, Integer.valueOf(i11), c0510p3, 0);
                }
                break;
        }
        return O3.C.a;
    }
}
