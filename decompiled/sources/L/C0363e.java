package L;

import O.C0510p;

/* renamed from: L.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363e extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W.a f5510m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W.a f5511n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0363e(W.a aVar, W.a aVar2, int i7) {
        super(2);
        this.f5509l = i7;
        this.f5510m = aVar;
        this.f5511n = aVar2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        O3.C c2 = O3.C.a;
        int i7 = 0;
        W.a aVar = this.f5510m;
        W.a aVar2 = this.f5511n;
        switch (this.f5509l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0510p.y()) {
                    c0510p.R(1497073862);
                    if (aVar != null) {
                        aVar.invoke(c0510p, 0);
                    }
                    c0510p.p(false);
                    aVar2.invoke(c0510p, 0);
                    break;
                } else {
                    c0510p.M();
                    break;
                }
            default:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0510p2.y()) {
                    float f5 = AbstractC0379i.a;
                    AbstractC0379i.b(W.f.b(1887135077, new C0363e(aVar, aVar2, i7), c0510p2), c0510p2, 438);
                    break;
                } else {
                    c0510p2.M();
                    break;
                }
                break;
        }
        return c2;
    }
}
