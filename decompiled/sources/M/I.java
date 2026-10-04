package M;

import L.AbstractC0412r0;
import O.C0486d;
import O.C0510p;

/* loaded from: classes.dex */
public final class I extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f6214m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6215n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.n f6216o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6217p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(long j7, Object obj, e4.n nVar, int i7, int i8) {
        super(2);
        this.f6213l = i8;
        this.f6214m = j7;
        this.f6215n = obj;
        this.f6216o = nVar;
        this.f6217p = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6213l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f6217p | 1);
                H0.I i7 = (H0.I) this.f6215n;
                e4.n nVar = this.f6216o;
                AbstractC0461t.a(this.f6214m, i7, nVar, (C0510p) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f6217p | 1);
                H0.I i8 = (H0.I) this.f6215n;
                e4.n nVar2 = this.f6216o;
                W.b(this.f6214m, i8, nVar2, (C0510p) obj, iV2);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f6217p | 1);
                N.u uVar = (N.u) this.f6215n;
                e4.n nVar3 = this.f6216o;
                AbstractC0412r0.c(this.f6214m, uVar, nVar3, (C0510p) obj, iV3);
                break;
        }
        return O3.C.a;
    }
}
