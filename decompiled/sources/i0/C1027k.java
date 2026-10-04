package i0;

import h0.AbstractC0968M;

/* renamed from: i0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027k extends AbstractC1019c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1027k(int i7, int i8, long j7, String str) {
        super(str, j7, i7);
        this.f11898d = i8;
    }

    @Override // i0.AbstractC1019c
    public final float a(int i7) {
        switch (this.f11898d) {
            case 0:
                return i7 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // i0.AbstractC1019c
    public final float b(int i7) {
        switch (this.f11898d) {
            case 0:
                return i7 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // i0.AbstractC1019c
    public final long d(float f5, float f7, float f8) {
        switch (this.f11898d) {
            case 0:
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                if (f5 > 100.0f) {
                    f5 = 100.0f;
                }
                if (f7 < -128.0f) {
                    f7 = -128.0f;
                }
                if (f7 > 128.0f) {
                    f7 = 128.0f;
                }
                float f9 = (f5 + 16.0f) / 116.0f;
                float f10 = (f7 * 0.002f) + f9;
                float f11 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
                float f12 = f9 > 0.20689656f ? f9 * f9 * f9 : (f9 - 0.13793103f) * 0.12841855f;
                float f13 = f11 * AbstractC1026j.f11897e[0];
                return (Float.floatToRawIntBits(f12 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
            default:
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                if (f5 > 2.0f) {
                    f5 = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                return (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f7 <= 2.0f ? f7 : 2.0f) & 4294967295L);
        }
    }

    @Override // i0.AbstractC1019c
    public final float e(float f5, float f7, float f8) {
        switch (this.f11898d) {
            case 0:
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                if (f5 > 100.0f) {
                    f5 = 100.0f;
                }
                if (f8 < -128.0f) {
                    f8 = -128.0f;
                }
                if (f8 > 128.0f) {
                    f8 = 128.0f;
                }
                float f9 = ((f5 + 16.0f) / 116.0f) - (f8 * 0.005f);
                return (f9 > 0.20689656f ? f9 * f9 * f9 : 0.12841855f * (f9 - 0.13793103f)) * AbstractC1026j.f11897e[2];
            default:
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                if (f8 > 2.0f) {
                    return 2.0f;
                }
                return f8;
        }
    }

    @Override // i0.AbstractC1019c
    public final long f(float f5, float f7, float f8, float f9, AbstractC1019c abstractC1019c) {
        switch (this.f11898d) {
            case 0:
                float[] fArr = AbstractC1026j.f11897e;
                float f10 = f5 / fArr[0];
                float f11 = f7 / fArr[1];
                float f12 = f8 / fArr[2];
                float fCbrt = f10 > 0.008856452f ? (float) Math.cbrt(f10) : (f10 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
                float f13 = (116.0f * fCbrt2) - 16.0f;
                float f14 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 100.0f) {
                    f13 = 100.0f;
                }
                if (f14 < -128.0f) {
                    f14 = -128.0f;
                }
                if (f14 > 128.0f) {
                    f14 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return AbstractC0968M.b(f13, f14, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f9, abstractC1019c);
            default:
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                if (f5 > 2.0f) {
                    f5 = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                return AbstractC0968M.b(f5, f7, f8 <= 2.0f ? f8 : 2.0f, f9, abstractC1019c);
        }
    }
}
