package v;

import m.C1487h;

/* loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16369l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I f16370m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ L f16371n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(I i7, L l7, int i8) {
        super(1);
        this.f16369l = i8;
        this.f16370m = i7;
        this.f16371n = l7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        int iH0;
        int iF0;
        int iH02;
        int iF02;
        switch (this.f16369l) {
            case 0:
                w0.S s7 = (w0.S) obj;
                if (s7 != null) {
                    this.f16371n.getClass();
                    iH0 = s7.h0();
                    iF0 = s7.f0();
                } else {
                    iH0 = 0;
                    iF0 = 0;
                }
                C1487h c1487h = new C1487h(C1487h.a(iH0, iF0));
                I i7 = this.f16370m;
                i7.f16375e = c1487h;
                i7.f16372b = s7;
                break;
            default:
                w0.S s8 = (w0.S) obj;
                if (s8 != null) {
                    this.f16371n.getClass();
                    iH02 = s8.h0();
                    iF02 = s8.f0();
                } else {
                    iH02 = 0;
                    iF02 = 0;
                }
                C1487h c1487h2 = new C1487h(C1487h.a(iH02, iF02));
                I i8 = this.f16370m;
                i8.f16376f = c1487h2;
                i8.f16374d = s8;
                break;
        }
        return O3.C.a;
    }
}
