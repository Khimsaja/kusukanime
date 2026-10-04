package y0;

import f0.InterfaceC0857j;
import f6.AbstractC0905c;

/* renamed from: y0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2360g implements InterfaceC0857j {
    public static final C2360g a = new C2360g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f17852b;

    @Override // f0.InterfaceC0857j
    public final boolean a() {
        Boolean bool = f17852b;
        if (bool != null) {
            return bool.booleanValue();
        }
        AbstractC0905c.D("canFocus is read before it is written");
        throw null;
    }

    @Override // f0.InterfaceC0857j
    public final void b(boolean z7) {
        f17852b = Boolean.valueOf(z7);
    }
}
