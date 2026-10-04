package v;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2125d implements InterfaceC2126e, InterfaceC2128g {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16436b;

    public C2125d(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.f16436b = 0;
                break;
            case 2:
                this.f16436b = 0;
                break;
            case 3:
                this.f16436b = 0;
                break;
            default:
                this.f16436b = 0;
                break;
        }
    }

    @Override // v.InterfaceC2126e, v.InterfaceC2128g
    public final float a() {
        switch (this.a) {
        }
        return this.f16436b;
    }

    @Override // v.InterfaceC2126e
    public final void b(T0.b bVar, int i7, int[] iArr, T0.k kVar, int[] iArr2) {
        switch (this.a) {
            case 0:
                if (kVar != T0.k.f8844k) {
                    AbstractC2130i.a(i7, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2130i.a(i7, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (kVar != T0.k.f8844k) {
                    AbstractC2130i.d(i7, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2130i.d(i7, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (kVar != T0.k.f8844k) {
                    AbstractC2130i.e(i7, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2130i.e(i7, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != T0.k.f8844k) {
                    AbstractC2130i.f(i7, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2130i.f(i7, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // v.InterfaceC2128g
    public final void c(T0.b bVar, int i7, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                AbstractC2130i.a(i7, iArr, iArr2, false);
                break;
            case 1:
                AbstractC2130i.d(i7, iArr, iArr2, false);
                break;
            case 2:
                AbstractC2130i.e(i7, iArr, iArr2, false);
                break;
            default:
                AbstractC2130i.f(i7, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
