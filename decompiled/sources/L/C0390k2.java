package L;

import D.C0042b;
import M.C0460s;

/* renamed from: L.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390k2 {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final C0460s f5637b;

    public C0390k2(boolean z7, T0.b bVar, EnumC0394l2 enumC0394l2, e4.k kVar) {
        this.a = z7;
        if (z7 && enumC0394l2 == EnumC0394l2.f5651m) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.f5637b = new C0460s(enumC0394l2, new C0042b(13, bVar), new B.e(11, bVar), AbstractC0386j2.f5625b, kVar);
    }

    public static Object a(C0390k2 c0390k2, EnumC0394l2 enumC0394l2, U3.j jVar) throws Throwable {
        Object objB = androidx.compose.material3.internal.a.b(c0390k2.f5637b, enumC0394l2, c0390k2.f5637b.f6341k.f(), jVar);
        return objB == T3.a.f9048k ? objB : O3.C.a;
    }

    public final Object b(U3.j jVar) throws Throwable {
        Object objA = a(this, EnumC0394l2.f5649k, jVar);
        return objA == T3.a.f9048k ? objA : O3.C.a;
    }

    public final boolean c() {
        return this.f5637b.f6337g.getValue() != EnumC0394l2.f5649k;
    }

    public final Object d(U3.j jVar) throws Throwable {
        if (this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objA = a(this, EnumC0394l2.f5651m, jVar);
        return objA == T3.a.f9048k ? objA : O3.C.a;
    }
}
