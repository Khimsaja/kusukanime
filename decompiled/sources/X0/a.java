package X0;

import O3.C;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9692l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f9693m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(s sVar, int i7) {
        super(1);
        this.f9692l = i7;
        this.f9693m = sVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f9692l) {
            case 0:
                s sVar = this.f9693m;
                sVar.show();
                return new D.r(2, sVar);
            default:
                s sVar2 = this.f9693m;
                if (sVar2.f9735o.a) {
                    sVar2.f9734n.invoke();
                }
                return C.a;
        }
    }
}
