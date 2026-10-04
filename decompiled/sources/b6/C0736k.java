package b6;

/* renamed from: b6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736k extends E3.b {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11027d;

    public C0736k(o oVar, boolean z7) {
        super(oVar);
        this.f11027d = z7;
    }

    @Override // E3.b
    public final void k(String str) {
        kotlin.jvm.internal.l.f("value", str);
        if (this.f11027d) {
            super.k(str);
        } else {
            i(str);
        }
    }
}
