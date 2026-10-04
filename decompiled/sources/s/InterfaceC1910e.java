package s;

import p.InterfaceC1760l;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1910e {
    public static final C1908d a = C1908d.a;

    default float a(float f5, float f7, float f8) {
        a.getClass();
        float f9 = f7 + f5;
        if ((f5 >= 0.0f && f9 <= f8) || (f5 < 0.0f && f9 > f8)) {
            return 0.0f;
        }
        float f10 = f9 - f8;
        return Math.abs(f5) < Math.abs(f10) ? f5 : f10;
    }

    default InterfaceC1760l b() {
        a.getClass();
        return C1908d.f15280b;
    }
}
