package L;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import o.C1593E;
import o.C1594F;

/* loaded from: classes.dex */
public final class B0 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4927l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W.a f4928m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f4929n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4930o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f4931p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4932q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4933r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4934s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, boolean z7, InterfaceC0821a interfaceC0821a, int i7) {
        super(2);
        this.f4928m = aVar;
        this.f4932q = aVar2;
        this.f4933r = aVar3;
        this.f4934s = aVar4;
        this.f4929n = z7;
        this.f4930o = interfaceC0821a;
        this.f4931p = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4927l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f4931p | 1);
                W.a aVar = this.f4928m;
                boolean z7 = this.f4929n;
                C0436z0 c0436z0 = (C0436z0) this.f4933r;
                C0.b(aVar, (InterfaceC0821a) this.f4930o, (a0.n) this.f4932q, z7, c0436z0, (v.Z) this.f4934s, (C0510p) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC0422u1.c(this.f4928m, (W.a) this.f4932q, (W.a) this.f4933r, (W.a) this.f4934s, this.f4929n, (InterfaceC0821a) this.f4930o, (C0510p) obj, C0486d.V(this.f4931p | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(200065);
                W.a aVar2 = this.f4928m;
                C1593E c1593e = (C1593E) this.f4932q;
                C1594F c1594f = (C1594F) this.f4933r;
                androidx.compose.animation.a.b(this.f4929n, (a0.q) this.f4930o, c1593e, c1594f, (String) this.f4934s, aVar2, (C0510p) obj, iV2, this.f4931p);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f4931p | 1);
                W.a aVar3 = this.f4928m;
                A3.t tVar = (A3.t) this.f4934s;
                a0.n nVar = (a0.n) this.f4932q;
                AbstractC0832b.b((r.l) this.f4933r, (InterfaceC0821a) this.f4930o, tVar, nVar, this.f4929n, aVar3, (C0510p) obj, iV3);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(W.a aVar, InterfaceC0821a interfaceC0821a, a0.n nVar, boolean z7, C0436z0 c0436z0, v.Z z8, int i7) {
        super(2);
        this.f4928m = aVar;
        this.f4930o = interfaceC0821a;
        this.f4932q = nVar;
        this.f4929n = z7;
        this.f4933r = c0436z0;
        this.f4934s = z8;
        this.f4931p = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(r.l lVar, InterfaceC0821a interfaceC0821a, A3.t tVar, a0.n nVar, boolean z7, W.a aVar, int i7) {
        super(2);
        this.f4933r = lVar;
        this.f4930o = interfaceC0821a;
        this.f4934s = tVar;
        this.f4932q = nVar;
        this.f4929n = z7;
        this.f4928m = aVar;
        this.f4931p = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(boolean z7, a0.q qVar, C1593E c1593e, C1594F c1594f, String str, W.a aVar, int i7, int i8) {
        super(2);
        this.f4929n = z7;
        this.f4930o = qVar;
        this.f4932q = c1593e;
        this.f4933r = c1594f;
        this.f4934s = str;
        this.f4928m = aVar;
        this.f4931p = i8;
    }
}
