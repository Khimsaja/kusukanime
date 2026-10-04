package M0;

import b1.AbstractC0703b;

/* renamed from: M0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469b implements y {

    /* renamed from: k, reason: collision with root package name */
    public final int f6385k;

    public C0469b(int i7) {
        this.f6385k = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0469b) && this.f6385k == ((C0469b) obj).f6385k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6385k);
    }

    public final String toString() {
        return AbstractC0703b.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f6385k, ')');
    }
}
