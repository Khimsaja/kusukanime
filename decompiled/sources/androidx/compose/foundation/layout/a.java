package androidx.compose.foundation.layout;

import T0.k;
import a0.q;
import v.Y;
import v.Z;

/* loaded from: classes.dex */
public abstract class a {
    public static Z a(float f5, int i7) {
        if ((i7 & 1) != 0) {
            f5 = 0;
        }
        float f7 = 0;
        return new Z(f5, f7, f5, f7);
    }

    public static final Z b(float f5, float f7, float f8, float f9) {
        return new Z(f5, f7, f8, f9);
    }

    public static Z c(float f5) {
        return new Z(0, 0, 0, f5);
    }

    public static q d(q qVar, float f5) {
        return qVar.k(new AspectRatioElement(f5));
    }

    public static final float e(Y y7, k kVar) {
        return kVar == k.f8844k ? y7.d(kVar) : y7.b(kVar);
    }

    public static final float f(Y y7, k kVar) {
        return kVar == k.f8844k ? y7.b(kVar) : y7.d(kVar);
    }

    public static final q g(q qVar, Y y7) {
        return qVar.k(new PaddingValuesElement(y7));
    }

    public static final q h(q qVar, float f5) {
        return qVar.k(new PaddingElement(f5, f5, f5, f5));
    }

    public static final q i(q qVar, float f5, float f7) {
        return qVar.k(new PaddingElement(f5, f7, f5, f7));
    }

    public static q j(q qVar, float f5, float f7, int i7) {
        if ((i7 & 1) != 0) {
            f5 = 0;
        }
        if ((i7 & 2) != 0) {
            f7 = 0;
        }
        return i(qVar, f5, f7);
    }

    public static final q k(q qVar, float f5, float f7, float f8, float f9) {
        return qVar.k(new PaddingElement(f5, f7, f8, f9));
    }

    public static q l(q qVar, float f5, float f7, float f8, float f9, int i7) {
        if ((i7 & 1) != 0) {
            f5 = 0;
        }
        if ((i7 & 2) != 0) {
            f7 = 0;
        }
        if ((i7 & 4) != 0) {
            f8 = 0;
        }
        if ((i7 & 8) != 0) {
            f9 = 0;
        }
        return k(qVar, f5, f7, f8, f9);
    }

    public static final q m(q qVar) {
        return qVar.k(new IntrinsicWidthElement());
    }
}
