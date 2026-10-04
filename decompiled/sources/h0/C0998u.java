package h0;

import i0.AbstractC1019c;
import i0.AbstractC1024h;
import i0.AbstractC1026j;
import i0.C1020d;
import i0.C1023g;
import m.C1496q;

/* renamed from: h0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998u {

    /* renamed from: b, reason: collision with root package name */
    public static final long f11829b = AbstractC0968M.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f11830c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f11831d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f11832e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f11833f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f11834g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11835h = 0;
    public final long a;

    static {
        AbstractC0968M.d(4282664004L);
        AbstractC0968M.d(4287137928L);
        AbstractC0968M.d(4291611852L);
        f11830c = AbstractC0968M.d(4294967295L);
        f11831d = AbstractC0968M.d(4294901760L);
        AbstractC0968M.d(4278255360L);
        f11832e = AbstractC0968M.d(4278190335L);
        AbstractC0968M.d(4294967040L);
        AbstractC0968M.d(4278255615L);
        AbstractC0968M.d(4294902015L);
        f11833f = AbstractC0968M.c(0);
        f11834g = AbstractC0968M.b(0.0f, 0.0f, 0.0f, 0.0f, C1020d.f11885s);
    }

    public /* synthetic */ C0998u(long j7) {
        this.a = j7;
    }

    public static final long a(long j7, AbstractC1019c abstractC1019c) {
        C1023g c1023gE;
        AbstractC1019c abstractC1019cF = f(j7);
        int i7 = abstractC1019cF.f11867c;
        int i8 = abstractC1019c.f11867c;
        if ((i7 | i8) < 0) {
            c1023gE = AbstractC1026j.e(abstractC1019cF, abstractC1019c);
        } else {
            C1496q c1496q = AbstractC1024h.a;
            int i9 = i7 | (i8 << 6);
            Object objE = c1496q.e(i9);
            if (objE == null) {
                objE = AbstractC1026j.e(abstractC1019cF, abstractC1019c);
                c1496q.h(i9, objE);
            }
            c1023gE = (C1023g) objE;
        }
        return c1023gE.a(j7);
    }

    public static long b(float f5, long j7) {
        return AbstractC0968M.b(h(j7), g(j7), e(j7), f5, f(j7));
    }

    public static final boolean c(long j7, long j8) {
        return j7 == j8;
    }

    public static final float d(long j7) {
        float fM;
        float f5;
        if ((63 & j7) == 0) {
            fM = (float) android.support.v4.media.session.b.M((j7 >>> 56) & 255);
            f5 = 255.0f;
        } else {
            fM = (float) android.support.v4.media.session.b.M((j7 >>> 6) & 1023);
            f5 = 1023.0f;
        }
        return fM / f5;
    }

    public static final float e(long j7) {
        int i7;
        int i8;
        int i9;
        if ((63 & j7) == 0) {
            return ((float) android.support.v4.media.session.b.M((j7 >>> 32) & 255)) / 255.0f;
        }
        short s7 = (short) ((j7 >>> 16) & 65535);
        int i10 = Short.MIN_VALUE & s7;
        int i11 = ((65535 & s7) >>> 10) & 31;
        int i12 = s7 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC0957B.a;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static final AbstractC1019c f(long j7) {
        float[] fArr = C1020d.a;
        return C1020d.f11887u[(int) (j7 & 63)];
    }

    public static final float g(long j7) {
        int i7;
        int i8;
        int i9;
        if ((63 & j7) == 0) {
            return ((float) android.support.v4.media.session.b.M((j7 >>> 40) & 255)) / 255.0f;
        }
        short s7 = (short) ((j7 >>> 32) & 65535);
        int i10 = Short.MIN_VALUE & s7;
        int i11 = ((65535 & s7) >>> 10) & 31;
        int i12 = s7 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC0957B.a;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static final float h(long j7) {
        int i7;
        int i8;
        int i9;
        if ((63 & j7) == 0) {
            return ((float) android.support.v4.media.session.b.M((j7 >>> 48) & 255)) / 255.0f;
        }
        short s7 = (short) ((j7 >>> 48) & 65535);
        int i10 = Short.MIN_VALUE & s7;
        int i11 = ((65535 & s7) >>> 10) & 31;
        int i12 = s7 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC0957B.a;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static String i(long j7) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j7));
        sb.append(", ");
        sb.append(g(j7));
        sb.append(", ");
        sb.append(e(j7));
        sb.append(", ");
        sb.append(d(j7));
        sb.append(", ");
        return A6.b.j(sb, f(j7).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0998u) {
            return this.a == ((C0998u) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
