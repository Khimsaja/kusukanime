package f0;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856i extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11404l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11405m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0856i(int i7, int i8) {
        super(1);
        this.f11404l = i8;
        this.f11405m = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f11404l) {
            case 0:
                Boolean boolB = AbstractC0851d.B((C0866s) obj, this.f11405m);
                return Boolean.valueOf(boolB != null ? boolB.booleanValue() : false);
            default:
                Boolean boolB2 = AbstractC0851d.B((C0866s) obj, this.f11405m);
                return Boolean.valueOf(boolB2 != null ? boolB2.booleanValue() : false);
        }
    }
}
