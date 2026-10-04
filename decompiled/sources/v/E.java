package v;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.m implements e4.o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16365l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int[] f16366m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(int[] iArr, int i7) {
        super(3);
        this.f16365l = i7;
        this.f16366m = iArr;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16365l) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return Integer.valueOf(this.f16366m[iIntValue]);
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return Integer.valueOf(this.f16366m[iIntValue2]);
        }
    }
}
