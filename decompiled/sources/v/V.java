package v;

/* loaded from: classes.dex */
public final class V extends a0.p implements y0.h0 {

    /* renamed from: x, reason: collision with root package name */
    public float f16415x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16416y;

    @Override // y0.h0
    public final Object m0(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var == null) {
            d0Var = new d0();
        }
        d0Var.a = this.f16415x;
        d0Var.f16437b = this.f16416y;
        return d0Var;
    }
}
