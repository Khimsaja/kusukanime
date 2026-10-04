package u4;

import h5.InterfaceC1015d;
import n5.AbstractC1586x;

/* loaded from: classes.dex */
public final class N implements InterfaceC1015d, M {

    /* renamed from: l, reason: collision with root package name */
    public static final N f16296l = new N(0);

    /* renamed from: m, reason: collision with root package name */
    public static final N f16297m = new N(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16298k;

    public /* synthetic */ N(int i7) {
        this.f16298k = i7;
    }

    @Override // h5.InterfaceC1015d
    public AbstractC1586x getType() {
        switch (this.f16298k) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f16298k) {
            case 7:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
