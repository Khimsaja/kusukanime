package V1;

import B1.AbstractC0018e;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class w {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9419b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9420c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9421d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9422e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9423f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9424g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9425h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9426i;

    /* renamed from: j, reason: collision with root package name */
    public final float f9427j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9428k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9429l;

    /* renamed from: m, reason: collision with root package name */
    public final A2.b f9430m;

    public w(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f5, int i15, String str, A2.b bVar) {
        this.a = list;
        this.f9419b = i7;
        this.f9420c = i8;
        this.f9421d = i9;
        this.f9422e = i10;
        this.f9423f = i11;
        this.f9424g = i12;
        this.f9425h = i13;
        this.f9426i = i14;
        this.f9427j = f5;
        this.f9428k = i15;
        this.f9429l = str;
        this.f9430m = bVar;
    }

    public static w a(B1.B b4, boolean z7, A2.b bVar) throws y1.E {
        boolean z8;
        C1.m mVarH;
        int i7;
        int i8 = 4;
        try {
            if (z7) {
                b4.G(4);
            } else {
                b4.G(21);
            }
            int iT = b4.t() & 3;
            int iT2 = b4.t();
            int i9 = b4.f288b;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                z8 = true;
                if (i11 >= iT2) {
                    break;
                }
                b4.G(1);
                int iZ = b4.z();
                for (int i13 = 0; i13 < iZ; i13++) {
                    int iZ2 = b4.z();
                    i12 += iZ2 + 4;
                    b4.G(iZ2);
                }
                i11++;
            }
            b4.F(i9);
            byte[] bArr = new byte[i12];
            A2.b bVar2 = bVar;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            float f5 = 1.0f;
            String strA = null;
            int i22 = 0;
            int i23 = 0;
            while (i22 < iT2) {
                int iT3 = b4.t() & 63;
                int iZ3 = b4.z();
                int i24 = i10;
                A2.b bVarJ = bVar2;
                while (i24 < iZ3) {
                    boolean z9 = z8;
                    int iZ4 = b4.z();
                    int i25 = iT;
                    System.arraycopy(C1.r.a, i10, bArr, i23, i8);
                    int i26 = i23 + 4;
                    System.arraycopy(b4.a, b4.f288b, bArr, i26, iZ4);
                    if (iT3 == 32 && i24 == 0) {
                        bVarJ = C1.r.j(bArr, i26, i26 + iZ4);
                    } else {
                        if (iT3 == 33 && i24 == 0) {
                            C1.n nVarI = C1.r.i(bArr, i26, i26 + iZ4, bVarJ);
                            i14 = nVarI.a + 1;
                            i15 = nVarI.f593c + 8;
                            i16 = nVarI.f594d + 8;
                            int i27 = nVarI.f599i;
                            int i28 = nVarI.f600j;
                            i17 = i27;
                            int i29 = nVarI.f601k;
                            float f7 = nVarI.f597g;
                            int i30 = nVarI.f598h;
                            C1.j jVar = nVarI.f592b;
                            if (jVar != null) {
                                i7 = i30;
                                strA = AbstractC0018e.a(jVar.a, jVar.f582b, jVar.f583c, jVar.f584d, jVar.f585e, jVar.f586f);
                            } else {
                                i7 = i30;
                            }
                            i21 = i7;
                            f5 = f7;
                            i19 = i29;
                            i18 = i28;
                        } else if (iT3 == 39 && i24 == 0 && (mVarH = C1.r.h(bArr, i26, i26 + iZ4)) != null && bVarJ != null) {
                            i10 = 0;
                            i20 = mVarH.a == ((C1.h) ((j3.G) bVarJ.f110l).get(0)).f579b ? 4 : 5;
                        }
                        i10 = 0;
                    }
                    i23 = i26 + iZ4;
                    b4.G(iZ4);
                    i24++;
                    z8 = z9;
                    iT = i25;
                    i8 = 4;
                }
                i22++;
                bVar2 = bVarJ;
                i8 = 4;
            }
            return new w(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iT + 1, i14, i15, i16, i17, i18, i19, i20, f5, i21, strA, bVar2);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw y1.E.a(e7, "Error parsing".concat(z7 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
