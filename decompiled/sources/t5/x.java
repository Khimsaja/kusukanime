package t5;

/* loaded from: classes.dex */
public final class x extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final x f16146d = new x("must have no value parameters", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final x f16147e = new x("must have a single value parameter", 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(String str, int i7) {
        super(str, 1);
        this.f16148c = i7;
    }

    @Override // t5.e
    public final boolean b(J4.f fVar) {
        switch (this.f16148c) {
            case 0:
                return fVar.m0().isEmpty();
            default:
                return fVar.m0().size() == 1;
        }
    }
}
