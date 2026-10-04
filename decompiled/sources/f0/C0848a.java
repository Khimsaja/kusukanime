package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848a extends a0.p implements InterfaceC0850c {

    /* renamed from: x, reason: collision with root package name */
    public e4.k f11388x;

    /* renamed from: y, reason: collision with root package name */
    public EnumC0865r f11389y;

    @Override // f0.InterfaceC0850c
    public final void B(EnumC0865r enumC0865r) {
        if (kotlin.jvm.internal.l.a(this.f11389y, enumC0865r)) {
            return;
        }
        this.f11389y = enumC0865r;
        this.f11388x.invoke(enumC0865r);
    }
}
