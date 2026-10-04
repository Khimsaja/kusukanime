package h0;

import H1.e0;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import f6.AbstractC0915m;
import g0.AbstractC0932a;
import i0.AbstractC1018b;
import i0.AbstractC1019c;
import i0.C1020d;
import i0.C1028l;
import i0.C1029m;
import i0.C1033q;
import j0.InterfaceC1298d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0968M {
    public static final R1.i a = new R1.i(20);

    /* renamed from: b, reason: collision with root package name */
    public static Method f11782b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f11783c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f11784d;

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[PHI: r0
      0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A(float r3, float[] r4, int r5) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L11
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
        Ld:
            r3 = r0
            goto L1f
        Lf:
            r3 = r2
            goto L1f
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto Lf
            goto Ld
        L1f:
            r4[r5] = r3
            boolean r3 = java.lang.Float.isNaN(r3)
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC0968M.A(float, float[], int):int");
    }

    public static final C0981d a(C0985h c0985h) {
        Canvas canvas = AbstractC0982e.a;
        C0981d c0981d = new C0981d();
        c0981d.a = new Canvas(c0985h.a);
        return c0981d;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r20, float r21, float r22, float r23, i0.AbstractC1019c r24) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC0968M.b(float, float, float, float, i0.c):long");
    }

    public static final long c(int i7) {
        long j7 = i7 << 32;
        int i8 = C0998u.f11835h;
        return j7;
    }

    public static final long d(long j7) {
        long j8 = j7 << 32;
        int i7 = C0998u.f11835h;
        return j8;
    }

    public static long e(int i7, int i8, int i9) {
        return c(((i7 & 255) << 16) | (-16777216) | ((i8 & 255) << 8) | (i9 & 255));
    }

    public static C0985h f(int i7, int i8, int i9) {
        Bitmap bitmapCreateBitmap;
        C1033q c1033q = C1020d.f11869c;
        Bitmap.Config configX = x(i9);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = AbstractC0989l.b(i7, i8, i9, true, c1033q);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i7, i8, configX);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C0985h(bitmapCreateBitmap);
    }

    public static final e0 g() {
        return new e0(new Paint(7));
    }

    public static final C0987j h() {
        return new C0987j(new Path());
    }

    public static final long i(float f5, float f7) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        int i7 = C0976V.f11816c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long j(float r18, float r19, float r20, float r21, i0.AbstractC1019c r22) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC0968M.j(float, float, float, float, i0.c):long");
    }

    public static final float k(int i7, int i8, float[] fArr, float[] fArr2) {
        int i9 = i7 * 4;
        return (fArr[i9 + 3] * fArr2[12 + i8]) + (fArr[i9 + 2] * fArr2[8 + i8]) + (fArr[i9 + 1] * fArr2[4 + i8]) + (fArr[i9] * fArr2[i8]);
    }

    public static final long l(long j7, long j8) {
        float f5;
        float f7;
        long jA = C0998u.a(j7, C0998u.f(j8));
        float fD = C0998u.d(j8);
        float fD2 = C0998u.d(jA);
        float f8 = 1.0f - fD2;
        float f9 = (fD * f8) + fD2;
        float fH = C0998u.h(jA);
        float fH2 = C0998u.h(j8);
        float f10 = 0.0f;
        if (f9 == 0.0f) {
            f5 = 0.0f;
        } else {
            f5 = (((fH2 * fD) * f8) + (fH * fD2)) / f9;
        }
        float fG = C0998u.g(jA);
        float fG2 = C0998u.g(j8);
        if (f9 == 0.0f) {
            f7 = 0.0f;
        } else {
            f7 = (((fG2 * fD) * f8) + (fG * fD2)) / f9;
        }
        float fE = C0998u.e(jA);
        float fE2 = C0998u.e(j8);
        if (f9 != 0.0f) {
            f10 = (((fE2 * fD) * f8) + (fE * fD2)) / f9;
        }
        return j(f5, f7, f10, f9, C0998u.f(j8));
    }

    public static void m(InterfaceC1298d interfaceC1298d, AbstractC0966K abstractC0966K, long j7) {
        j0.g gVar = j0.g.a;
        if (abstractC0966K instanceof C0964I) {
            g0.d dVar = ((C0964I) abstractC0966K).a;
            interfaceC1298d.g0(j7, AbstractC0832b.e(dVar.a, dVar.f11659b), AbstractC0870c.F(dVar.c(), dVar.b()), 1.0f, 3);
        } else {
            if (!(abstractC0966K instanceof C0965J)) {
                if (!(abstractC0966K instanceof C0963H)) {
                    throw new D6.r();
                }
                interfaceC1298d.J(((C0963H) abstractC0966K).a, j7, gVar);
                return;
            }
            C0965J c0965j = (C0965J) abstractC0966K;
            C0987j c0987j = c0965j.f11781b;
            if (c0987j != null) {
                interfaceC1298d.J(c0987j, j7, gVar);
                return;
            }
            g0.e eVar = c0965j.a;
            float fB = AbstractC0932a.b(eVar.f11668h);
            interfaceC1298d.t(j7, AbstractC0832b.e(eVar.a, eVar.f11662b), AbstractC0870c.F(eVar.b(), eVar.a()), AbstractC0915m.a(fB, fB));
        }
    }

    public static void n(Canvas canvas, boolean z7) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            C0997t.a.a(canvas, z7);
            return;
        }
        if (!f11784d) {
            try {
                if (i7 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f11782b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f11783c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f11782b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f11783c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f11782b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f11783c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f11784d = true;
        }
        if (z7) {
            try {
                Method method4 = f11782b;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z7 || (method = f11783c) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static final long o(float f5, long j7, long j8) {
        C1028l c1028l = C1020d.f11886t;
        long jA = C0998u.a(j7, c1028l);
        long jA2 = C0998u.a(j8, c1028l);
        float fD = C0998u.d(jA);
        float fH = C0998u.h(jA);
        float fG = C0998u.g(jA);
        float fE = C0998u.e(jA);
        float fD2 = C0998u.d(jA2);
        float fH2 = C0998u.h(jA2);
        float fG2 = C0998u.g(jA2);
        float fE2 = C0998u.e(jA2);
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        return C0998u.a(j(P3.F.G(fH, fH2, f5), P3.F.G(fG, fG2, f5), P3.F.G(fE, fE2, f5), P3.F.G(fD, fD2, f5), c1028l), C0998u.f(j8));
    }

    public static final float p(long j7) {
        AbstractC1019c abstractC1019cF = C0998u.f(j7);
        if (!AbstractC1018b.a(abstractC1019cF.f11866b, AbstractC1018b.a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC1018b.b(abstractC1019cF.f11866b)));
        }
        double dH = C0998u.h(j7);
        C1029m c1029m = ((C1033q) abstractC1019cF).f11924p;
        double d4 = c1029m.d(dH);
        float fD = (float) ((c1029m.d(C0998u.e(j7)) * 0.0722d) + (c1029m.d(C0998u.g(j7)) * 0.7152d) + (d4 * 0.2126d));
        if (fD < 0.0f) {
            fD = 0.0f;
        }
        if (fD > 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    public static final void q(Matrix matrix, float[] fArr) {
        float f5 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        fArr[0] = f5;
        fArr[1] = f10;
        fArr[2] = f15;
        fArr[3] = f7;
        fArr[4] = f11;
        fArr[5] = f16;
        fArr[6] = f9;
        fArr[7] = f13;
        fArr[8] = f17;
        matrix.setValues(fArr);
        fArr[0] = f5;
        fArr[1] = f7;
        fArr[2] = f8;
        fArr[3] = f9;
        fArr[4] = f10;
        fArr[5] = f11;
        fArr[6] = f12;
        fArr[7] = f13;
        fArr[8] = f14;
    }

    public static final void r(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f5 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        fArr[0] = f5;
        fArr[1] = f9;
        fArr[2] = 0.0f;
        fArr[3] = f12;
        fArr[4] = f7;
        fArr[5] = f10;
        fArr[6] = 0.0f;
        fArr[7] = f13;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f8;
        fArr[13] = f11;
        fArr[14] = 0.0f;
        fArr[15] = f14;
    }

    public static final BlendMode s(int i7) {
        return i7 == 0 ? BlendMode.CLEAR : i7 == 1 ? BlendMode.SRC : i7 == 2 ? BlendMode.DST : i7 == 3 ? BlendMode.SRC_OVER : i7 == 4 ? BlendMode.DST_OVER : i7 == 5 ? BlendMode.SRC_IN : i7 == 6 ? BlendMode.DST_IN : i7 == 7 ? BlendMode.SRC_OUT : i7 == 8 ? BlendMode.DST_OUT : i7 == 9 ? BlendMode.SRC_ATOP : i7 == 10 ? BlendMode.DST_ATOP : i7 == 11 ? BlendMode.XOR : i7 == 12 ? BlendMode.PLUS : i7 == 13 ? BlendMode.MODULATE : i7 == 14 ? BlendMode.SCREEN : i7 == 15 ? BlendMode.OVERLAY : i7 == 16 ? BlendMode.DARKEN : i7 == 17 ? BlendMode.LIGHTEN : i7 == 18 ? BlendMode.COLOR_DODGE : i7 == 19 ? BlendMode.COLOR_BURN : i7 == 20 ? BlendMode.HARD_LIGHT : i7 == 21 ? BlendMode.SOFT_LIGHT : i7 == 22 ? BlendMode.DIFFERENCE : i7 == 23 ? BlendMode.EXCLUSION : i7 == 24 ? BlendMode.MULTIPLY : i7 == 25 ? BlendMode.HUE : i7 == 26 ? BlendMode.SATURATION : i7 == 27 ? BlendMode.COLOR : i7 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect t(T0.i iVar) {
        return new Rect(iVar.a, iVar.f8841b, iVar.f8842c, iVar.f8843d);
    }

    public static final Rect u(g0.d dVar) {
        return new Rect((int) dVar.a, (int) dVar.f11659b, (int) dVar.f11660c, (int) dVar.f11661d);
    }

    public static final RectF v(g0.d dVar) {
        return new RectF(dVar.a, dVar.f11659b, dVar.f11660c, dVar.f11661d);
    }

    public static final int w(long j7) {
        float[] fArr = C1020d.a;
        return (int) (C0998u.a(j7, C1020d.f11869c) >>> 32);
    }

    public static final Bitmap.Config x(int i7) {
        if (i7 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i7 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i7 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i8 = Build.VERSION.SDK_INT;
        return (i8 < 26 || i7 != 3) ? (i8 < 26 || i7 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final g0.d y(RectF rectF) {
        return new g0.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode z(int i7) {
        return i7 == 0 ? PorterDuff.Mode.CLEAR : i7 == 1 ? PorterDuff.Mode.SRC : i7 == 2 ? PorterDuff.Mode.DST : i7 == 3 ? PorterDuff.Mode.SRC_OVER : i7 == 4 ? PorterDuff.Mode.DST_OVER : i7 == 5 ? PorterDuff.Mode.SRC_IN : i7 == 6 ? PorterDuff.Mode.DST_IN : i7 == 7 ? PorterDuff.Mode.SRC_OUT : i7 == 8 ? PorterDuff.Mode.DST_OUT : i7 == 9 ? PorterDuff.Mode.SRC_ATOP : i7 == 10 ? PorterDuff.Mode.DST_ATOP : i7 == 11 ? PorterDuff.Mode.XOR : i7 == 12 ? PorterDuff.Mode.ADD : i7 == 14 ? PorterDuff.Mode.SCREEN : i7 == 15 ? PorterDuff.Mode.OVERLAY : i7 == 16 ? PorterDuff.Mode.DARKEN : i7 == 17 ? PorterDuff.Mode.LIGHTEN : i7 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
