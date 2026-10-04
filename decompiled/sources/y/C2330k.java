package y;

import s.C1904b;
import s.EnumC1903a0;
import w0.AbstractC2188f;
import x0.C2248h;
import x0.InterfaceC2246f;

/* renamed from: y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2330k implements InterfaceC2246f {

    /* renamed from: e, reason: collision with root package name */
    public static final C2328i f17626e = new C2328i();
    public final InterfaceC2331l a;

    /* renamed from: b, reason: collision with root package name */
    public final C1904b f17627b;

    /* renamed from: c, reason: collision with root package name */
    public final T0.k f17628c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC1903a0 f17629d;

    public C2330k(InterfaceC2331l interfaceC2331l, C1904b c1904b, T0.k kVar, EnumC1903a0 enumC1903a0) {
        this.a = interfaceC2331l;
        this.f17627b = c1904b;
        this.f17628c = kVar;
        this.f17629d = enumC1903a0;
    }

    @Override // x0.InterfaceC2246f
    public final C2248h getKey() {
        return AbstractC2188f.a;
    }

    public final boolean h(C2327h c2327h, int i7) {
        EnumC1903a0 enumC1903a0 = this.f17629d;
        if (i7 == 5 || i7 == 6) {
            if (enumC1903a0 == EnumC1903a0.f15260l) {
                return false;
            }
        } else if (i7 == 3 || i7 == 4) {
            if (enumC1903a0 == EnumC1903a0.f15259k) {
                return false;
            }
        } else if (i7 != 1 && i7 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (m(i7)) {
            if (c2327h.f17623b >= this.a.b() - 1) {
                return false;
            }
        } else if (c2327h.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean m(int i7) {
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            if (i7 != 5) {
                if (i7 != 6) {
                    T0.k kVar = this.f17628c;
                    if (i7 == 3) {
                        int iOrdinal = kVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new D6.r();
                            }
                        }
                    } else {
                        if (i7 != 4) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int iOrdinal2 = kVar.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                throw new D6.r();
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // x0.InterfaceC2246f
    public final Object getValue() {
        return this;
    }
}
