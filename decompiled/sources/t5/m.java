package t5;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final m f16115d = new m("must be a member function", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final m f16116e = new m("must be a member or an extension function", 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i7) {
        super(str, 0);
        this.f16117c = i7;
    }

    @Override // t5.e
    public final boolean b(J4.f fVar) {
        switch (this.f16117c) {
            case 0:
                return fVar.f17497t != null;
            default:
                return (fVar.f17497t == null && fVar.f17496s == null) ? false : true;
        }
    }
}
