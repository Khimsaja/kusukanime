package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695w {
    public EnumC0689p a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0692t f10742b;

    public final void a(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
        EnumC0689p enumC0689pA = enumC0688o.a();
        EnumC0689p enumC0689p = this.a;
        kotlin.jvm.internal.l.f("state1", enumC0689p);
        if (enumC0689pA.compareTo(enumC0689p) < 0) {
            enumC0689p = enumC0689pA;
        }
        this.a = enumC0689p;
        this.f10742b.b(interfaceC0694v, enumC0688o);
        this.a = enumC0689pA;
    }
}
