package v;

import w0.InterfaceC2174I;

/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q.d f16368m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i7, Q.d dVar) {
        super(1);
        this.f16367l = i7;
        this.f16368m = dVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f16367l) {
            case 0:
                Q.d dVar = this.f16368m;
                int i7 = dVar.f7829m;
                if (i7 > 0) {
                    Object[] objArr = dVar.f7827k;
                    int i8 = 0;
                    do {
                        ((InterfaceC2174I) objArr[i8]).n();
                        i8++;
                    } while (i8 < i7);
                }
                return O3.C.a;
            default:
                this.f16368m.b((a0.o) obj);
                return Boolean.TRUE;
        }
    }
}
