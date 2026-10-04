package s3;

import O.Z;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final /* synthetic */ class U implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15633k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f15634l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f15635m;

    public /* synthetic */ U(int i7, Z z7) {
        this.f15633k = 2;
        this.f15635m = i7;
        this.f15634l = z7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f15633k) {
            case 0:
                ((e4.k) this.f15634l).invoke(Integer.valueOf(this.f15635m == 1 ? 0 : 1));
                break;
            case 1:
                ((e4.k) this.f15634l).invoke(Integer.valueOf(this.f15635m == -1 ? 0 : -1));
                break;
            default:
                ((Z) this.f15634l).setValue(Integer.valueOf(this.f15635m));
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ U(e4.k kVar, int i7, int i8) {
        this.f15633k = i8;
        this.f15634l = kVar;
        this.f15635m = i7;
    }
}
