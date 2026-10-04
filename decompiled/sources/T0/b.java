package T0;

import P3.r;
import f1.AbstractC0870c;

/* loaded from: classes.dex */
public interface b {
    default int H(long j7) {
        return Math.round(d0(j7));
    }

    default float I(long j7) {
        float fC;
        float fN;
        if (!n.a(m.b(j7), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = U0.b.a;
        if (n() >= 1.03f) {
            U0.a aVarA = U0.b.a(n());
            fC = m.c(j7);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fN = n();
        } else {
            fC = m.c(j7);
            fN = n();
        }
        return fN * fC;
    }

    default int O(float f5) {
        float fX = x(f5);
        if (Float.isInfinite(fX)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fX);
    }

    float a();

    default long a0(long j7) {
        if (j7 != 9205357640488583168L) {
            return AbstractC0870c.F(x(Float.intBitsToFloat((int) (j7 >> 32))), x(Float.intBitsToFloat((int) (j7 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float d0(long j7) {
        if (n.a(m.b(j7), 4294967296L)) {
            return x(I(j7));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default long k0(float f5) {
        return v(r0(f5));
    }

    float n();

    default float q0(int i7) {
        return i7 / a();
    }

    default float r0(float f5) {
        return f5 / a();
    }

    default long v(float f5) {
        float[] fArr = U0.b.a;
        if (!(n() >= 1.03f)) {
            return n6.d.T(f5 / n(), 4294967296L);
        }
        U0.a aVarA = U0.b.a(n());
        return n6.d.T(aVarA != null ? aVarA.a(f5) : f5 / n(), 4294967296L);
    }

    default long w(long j7) {
        if (j7 != 9205357640488583168L) {
            return r.b(r0(g0.f.d(j7)), r0(g0.f.b(j7)));
        }
        return 9205357640488583168L;
    }

    default float x(float f5) {
        return a() * f5;
    }
}
