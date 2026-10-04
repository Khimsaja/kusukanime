package w0;

/* loaded from: classes.dex */
public final class a0 {
    public final d0 a;

    /* renamed from: b, reason: collision with root package name */
    public C2169D f16854b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f16855c = new Z(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final Z f16856d = new Z(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final Z f16857e = new Z(this, 1);

    public a0(d0 d0Var) {
        this.a = d0Var;
    }

    public final C2169D a() {
        C2169D c2169d = this.f16854b;
        if (c2169d != null) {
            return c2169d;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
