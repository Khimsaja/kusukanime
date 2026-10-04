package j3;

import java.util.Comparator;

/* renamed from: j3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336w extends AbstractC1338y {
    public static AbstractC1338y f(int i7) {
        return i7 < 0 ? AbstractC1338y.f12395b : i7 > 0 ? AbstractC1338y.f12396c : AbstractC1338y.a;
    }

    @Override // j3.AbstractC1338y
    public final AbstractC1338y a(int i7, int i8) {
        return f(Integer.compare(i7, i8));
    }

    @Override // j3.AbstractC1338y
    public final AbstractC1338y b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // j3.AbstractC1338y
    public final AbstractC1338y c(boolean z7, boolean z8) {
        return f(Boolean.compare(z7, z8));
    }

    @Override // j3.AbstractC1338y
    public final AbstractC1338y d(boolean z7, boolean z8) {
        return f(Boolean.compare(z8, z7));
    }

    @Override // j3.AbstractC1338y
    public final int e() {
        return 0;
    }
}
