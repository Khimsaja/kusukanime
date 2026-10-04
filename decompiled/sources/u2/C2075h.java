package u2;

import B1.A;
import B1.AbstractC0015b;
import B1.B;
import B1.InterfaceC0021h;
import B1.K;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import j3.E;
import j3.G;
import j3.X;
import java.util.ArrayList;
import java.util.List;
import m6.x;
import s2.C1973a;
import s2.C1981i;
import s2.InterfaceC1982j;

/* renamed from: u2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2075h implements InterfaceC1982j {

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f16246r = {0, 7, 8, 15};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f16247s = {0, 119, -120, -1};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f16248t = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: k, reason: collision with root package name */
    public final Paint f16249k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f16250l;

    /* renamed from: m, reason: collision with root package name */
    public final Canvas f16251m;

    /* renamed from: n, reason: collision with root package name */
    public final C2069b f16252n;

    /* renamed from: o, reason: collision with root package name */
    public final C2068a f16253o;

    /* renamed from: p, reason: collision with root package name */
    public final C2074g f16254p;

    /* renamed from: q, reason: collision with root package name */
    public Bitmap f16255q;

    public C2075h(List list) {
        B b4 = new B((byte[]) list.get(0));
        int iZ = b4.z();
        int iZ2 = b4.z();
        Paint paint = new Paint();
        this.f16249k = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f16250l = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f16251m = new Canvas();
        this.f16252n = new C2069b(719, 575, 0, 719, 0, 575);
        this.f16253o = new C2068a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f16254p = new C2074g(iZ, iZ2);
    }

    public static byte[] a(int i7, int i8, A a) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) a.i(i8);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = d(255, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i7] = d(255, (i7 & 1) != 0 ? 127 : 0, (i7 & 2) != 0 ? 127 : 0, (i7 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = d(63, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = d(127, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 43 : 0) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 43 : 0) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fe A[LOOP:3: B:86:0x0166->B:116:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C2075h.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static C2068a f(A a, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 8;
        int i14 = a.i(8);
        a.t(8);
        int i15 = 2;
        int i16 = i7 - 2;
        int i17 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i16 > 0) {
            int i18 = a.i(i13);
            int i19 = a.i(i13);
            int[] iArr2 = (i19 & 128) != 0 ? iArr : (i19 & 64) != 0 ? iArrB : iArrC;
            if ((i19 & 1) != 0) {
                i11 = a.i(i13);
                i12 = a.i(i13);
                i8 = a.i(i13);
                i10 = a.i(i13);
                i9 = i16 - 6;
            } else {
                int i20 = a.i(6) << i15;
                int i21 = a.i(4) << 4;
                i8 = a.i(4) << 4;
                i9 = i16 - 4;
                i10 = a.i(i15) << 6;
                i11 = i20;
                i12 = i21;
            }
            if (i11 == 0) {
                i12 = i17;
                i8 = i12;
                i10 = 255;
            }
            double d4 = i11;
            double d6 = i12 - 128;
            double d7 = i8 - 128;
            iArr2[i18] = d((byte) (255 - (i10 & 255)), K.h((int) ((1.402d * d6) + d4), 0, 255), K.h((int) ((d4 - (0.34414d * d7)) - (d6 * 0.71414d)), 0, 255), K.h((int) ((d7 * 1.772d) + d4), 0, 255));
            i16 = i9;
            i17 = 0;
            i14 = i14;
            iArrC = iArrC;
            i13 = 8;
            i15 = 2;
        }
        return new C2068a(i14, iArr, iArrB, iArrC);
    }

    public static C2070c g(A a) {
        byte[] bArr;
        int i7 = a.i(16);
        a.t(4);
        int i8 = a.i(2);
        boolean zH = a.h();
        a.t(1);
        byte[] bArr2 = K.f302c;
        if (i8 != 1) {
            if (i8 == 0) {
                int i9 = a.i(16);
                int i10 = a.i(16);
                if (i9 > 0) {
                    bArr2 = new byte[i9];
                    a.l(bArr2, i9);
                }
                if (i10 > 0) {
                    bArr = new byte[i10];
                    a.l(bArr, i10);
                }
            }
            return new C2070c(i7, zH, bArr2, bArr);
        }
        a.t(a.i(8) * 16);
        bArr = bArr2;
        return new C2070c(i7, zH, bArr2, bArr);
    }

    @Override // s2.InterfaceC1982j
    public final void p(byte[] bArr, int i7, int i8, C1981i c1981i, InterfaceC0021h interfaceC0021h) {
        C2074g c2074g;
        C1973a c1973a;
        int i9;
        char c2;
        char c4;
        char c6;
        int i10;
        int i11;
        C2074g c2074g2;
        Canvas canvas;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C2072e c2072e;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 8;
        boolean z7 = true;
        A a = new A(bArr, i7 + i8);
        a.q(i7);
        while (true) {
            int iB = a.b();
            c2074g = this.f16254p;
            if (iB >= 48 && a.i(i21) == 15) {
                int i22 = a.i(i21);
                int i23 = a.i(16);
                int i24 = a.i(16);
                int iF = a.f() + i24;
                if (i24 * 8 > a.b()) {
                    AbstractC0015b.v("DvbParser", "Data field length exceeds limit");
                    a.t(a.b());
                } else {
                    switch (i22) {
                        case 16:
                            if (i23 == c2074g.a) {
                                x xVar = c2074g.f16245i;
                                a.i(i21);
                                int i25 = a.i(4);
                                int i26 = a.i(2);
                                a.t(2);
                                int i27 = i24 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i27 > 0) {
                                    int i28 = a.i(i21);
                                    a.t(i21);
                                    i27 -= 6;
                                    sparseArray.put(i28, new C2071d(a.i(16), a.i(16)));
                                    i21 = 8;
                                }
                                x xVar2 = new x(i25, i26, sparseArray);
                                if (i26 == 0) {
                                    if (xVar != null && xVar.f13109k != i25) {
                                        c2074g.f16245i = xVar2;
                                        break;
                                    }
                                } else {
                                    c2074g.f16245i = xVar2;
                                    c2074g.f16239c.clear();
                                    c2074g.f16240d.clear();
                                    c2074g.f16241e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            x xVar3 = c2074g.f16245i;
                            if (i23 == c2074g.a && xVar3 != null) {
                                int i29 = a.i(i21);
                                a.t(4);
                                boolean zH = a.h();
                                a.t(3);
                                int i30 = a.i(16);
                                int i31 = a.i(16);
                                a.i(3);
                                int i32 = a.i(3);
                                a.t(2);
                                int i33 = a.i(i21);
                                int i34 = a.i(i21);
                                int i35 = a.i(4);
                                int i36 = a.i(2);
                                a.t(2);
                                int i37 = i24 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i37 > 0) {
                                    int i38 = a.i(16);
                                    int i39 = a.i(2);
                                    a.i(2);
                                    int i40 = a.i(12);
                                    a.t(4);
                                    int i41 = a.i(12);
                                    int i42 = i37 - 6;
                                    if (i39 == 1 || i39 == 2) {
                                        a.i(i21);
                                        a.i(i21);
                                        i37 -= 8;
                                    } else {
                                        i37 = i42;
                                    }
                                    sparseArray2.put(i38, new C2073f(i40, i41));
                                }
                                C2072e c2072e2 = new C2072e(i29, zH, i30, i31, i32, i33, i34, i35, i36, sparseArray2);
                                SparseArray sparseArray3 = c2074g.f16239c;
                                if (xVar3.f13110l == 0 && (c2072e = (C2072e) sparseArray3.get(i29)) != null) {
                                    int i43 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c2072e.f16236j;
                                        if (i43 < sparseArray4.size()) {
                                            c2072e2.f16236j.put(sparseArray4.keyAt(i43), (C2073f) sparseArray4.valueAt(i43));
                                            i43++;
                                        }
                                    }
                                }
                                sparseArray3.put(c2072e2.a, c2072e2);
                                break;
                            }
                            break;
                        case 18:
                            if (i23 != c2074g.a) {
                                if (i23 == c2074g.f16238b) {
                                    C2068a c2068aF = f(a, i24);
                                    c2074g.f16242f.put(c2068aF.a, c2068aF);
                                    break;
                                }
                            } else {
                                C2068a c2068aF2 = f(a, i24);
                                c2074g.f16240d.put(c2068aF2.a, c2068aF2);
                                break;
                            }
                            break;
                        case 19:
                            if (i23 != c2074g.a) {
                                if (i23 == c2074g.f16238b) {
                                    C2070c c2070cG = g(a);
                                    c2074g.f16243g.put(c2070cG.a, c2070cG);
                                    break;
                                }
                            } else {
                                C2070c c2070cG2 = g(a);
                                c2074g.f16241e.put(c2070cG2.a, c2070cG2);
                                break;
                            }
                            break;
                        case 20:
                            if (i23 == c2074g.a) {
                                a.t(4);
                                boolean zH2 = a.h();
                                a.t(3);
                                int i44 = a.i(16);
                                int i45 = a.i(16);
                                if (zH2) {
                                    int i46 = a.i(16);
                                    int i47 = a.i(16);
                                    int i48 = a.i(16);
                                    i17 = i47;
                                    i18 = a.i(16);
                                    i20 = i48;
                                    i19 = i46;
                                } else {
                                    i17 = i44;
                                    i18 = i45;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                c2074g.f16244h = new C2069b(i44, i45, i19, i17, i20, i18);
                                break;
                            }
                            break;
                    }
                    a.u(iF - a.f());
                }
                i21 = 8;
            }
        }
        x xVar4 = c2074g.f16245i;
        if (xVar4 == null) {
            E e7 = G.f12277l;
            c1973a = new C1973a(-9223372036854775807L, -9223372036854775807L, X.f12304o);
        } else {
            C2069b c2069b = c2074g.f16244h;
            if (c2069b == null) {
                c2069b = this.f16252n;
            }
            Bitmap bitmap = this.f16255q;
            Canvas canvas2 = this.f16251m;
            if (bitmap == null || c2069b.a + 1 != bitmap.getWidth() || c2069b.f16219b + 1 != this.f16255q.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c2069b.a + 1, c2069b.f16219b + 1, Bitmap.Config.ARGB_8888);
                this.f16255q = bitmapCreateBitmap;
                canvas2.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i49 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) xVar4.f13111m;
                if (i49 < sparseArray5.size()) {
                    canvas2.save();
                    C2071d c2071d = (C2071d) sparseArray5.valueAt(i49);
                    C2072e c2072e3 = (C2072e) c2074g.f16239c.get(sparseArray5.keyAt(i49));
                    int i50 = c2071d.a + c2069b.f16220c;
                    int i51 = c2071d.f16227b + c2069b.f16222e;
                    int iMin = Math.min(c2072e3.f16229c + i50, c2069b.f16221d);
                    int i52 = c2072e3.f16230d;
                    int i53 = i51 + i52;
                    boolean z8 = z7;
                    canvas2.clipRect(i50, i51, iMin, Math.min(i53, c2069b.f16223f));
                    SparseArray sparseArray6 = c2074g.f16240d;
                    int i54 = c2072e3.f16232f;
                    C2068a c2068a = (C2068a) sparseArray6.get(i54);
                    if (c2068a == null && (c2068a = (C2068a) c2074g.f16242f.get(i54)) == null) {
                        c2068a = this.f16253o;
                    }
                    int i55 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c2072e3.f16236j;
                        if (i55 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i55);
                            C2073f c2073f = (C2073f) sparseArray7.valueAt(i55);
                            x xVar5 = xVar4;
                            C2070c c2070c = (C2070c) c2074g.f16241e.get(iKeyAt);
                            if (c2070c == null) {
                                c2070c = (C2070c) c2074g.f16243g.get(iKeyAt);
                            }
                            if (c2070c != null) {
                                Paint paint = c2070c.f16224b ? null : this.f16249k;
                                i11 = i49;
                                int i56 = c2073f.a + i50;
                                int i57 = c2073f.f16237b + i51;
                                int i58 = i50;
                                int i59 = c2072e3.f16231e;
                                canvas = canvas2;
                                i14 = i55;
                                i12 = i51;
                                int[] iArr = i59 == 3 ? c2068a.f16218d : i59 == 2 ? c2068a.f16217c : c2068a.f16216b;
                                i13 = i58;
                                c2074g2 = c2074g;
                                i16 = i53;
                                Paint paint2 = paint;
                                i15 = i52;
                                e(c2070c.f16225c, iArr, i59, i56, i57, paint2, canvas);
                                e(c2070c.f16226d, iArr, i59, i56, i57 + 1, paint2, canvas);
                            } else {
                                i11 = i49;
                                c2074g2 = c2074g;
                                canvas = canvas2;
                                i12 = i51;
                                i13 = i50;
                                i14 = i55;
                                i15 = i52;
                                i16 = i53;
                            }
                            i55 = i14 + 1;
                            i50 = i13;
                            i51 = i12;
                            i52 = i15;
                            i53 = i16;
                            canvas2 = canvas;
                            xVar4 = xVar5;
                            i49 = i11;
                            c2074g = c2074g2;
                        } else {
                            x xVar6 = xVar4;
                            int i60 = i49;
                            C2074g c2074g3 = c2074g;
                            Canvas canvas3 = canvas2;
                            int i61 = i51;
                            int i62 = i50;
                            int i63 = i52;
                            int i64 = i53;
                            boolean z9 = c2072e3.f16228b;
                            int i65 = c2072e3.f16229c;
                            if (z9) {
                                int i66 = c2072e3.f16231e;
                                if (i66 == 3) {
                                    i10 = c2068a.f16218d[c2072e3.f16233g];
                                    c6 = 2;
                                } else {
                                    c6 = 2;
                                    i10 = i66 == 2 ? c2068a.f16217c[c2072e3.f16234h] : c2068a.f16216b[c2072e3.f16235i];
                                }
                                Paint paint3 = this.f16250l;
                                paint3.setColor(i10);
                                c2 = 3;
                                c4 = c6;
                                i9 = i65;
                                canvas2 = canvas3;
                                canvas2.drawRect(i62, i61, i62 + i65, i64, paint3);
                            } else {
                                i9 = i65;
                                canvas2 = canvas3;
                                c2 = 3;
                                c4 = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f16255q, i62, i61, i9, i63);
                            float f5 = c2069b.a;
                            float f7 = i62 / f5;
                            float f8 = i61;
                            float f9 = c2069b.f16219b;
                            arrayList.add(new A1.b(null, null, null, bitmapCreateBitmap2, f8 / f9, 0, 0, f7, 0, Integer.MIN_VALUE, -3.4028235E38f, i9 / f5, i63 / f9, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas2.restore();
                            i49 = i60 + 1;
                            z7 = z8;
                            xVar4 = xVar6;
                            c2074g = c2074g3;
                        }
                    }
                } else {
                    c1973a = new C1973a(-9223372036854775807L, -9223372036854775807L, arrayList);
                }
            }
        }
        interfaceC0021h.c(c1973a);
    }

    @Override // s2.InterfaceC1982j
    public final void reset() {
        C2074g c2074g = this.f16254p;
        c2074g.f16239c.clear();
        c2074g.f16240d.clear();
        c2074g.f16241e.clear();
        c2074g.f16242f.clear();
        c2074g.f16243g.clear();
        c2074g.f16244h = null;
        c2074g.f16245i = null;
    }
}
