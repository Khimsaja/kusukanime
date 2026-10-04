package v;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2124c implements InterfaceC2128g {
    public final /* synthetic */ int a = 1;

    @Override // v.InterfaceC2128g
    public final void c(T0.b bVar, int i7, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                AbstractC2130i.c(i7, iArr, iArr2, false);
                break;
            default:
                AbstractC2130i.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
