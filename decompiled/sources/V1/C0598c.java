package V1;

import B1.AbstractC0018e;
import java.util.ArrayList;

/* renamed from: V1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598c {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9354b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9355c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9356d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9357e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9358f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9359g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9360h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9361i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9362j;

    /* renamed from: k, reason: collision with root package name */
    public final float f9363k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9364l;

    public C0598c(ArrayList arrayList, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f5, String str) {
        this.a = arrayList;
        this.f9354b = i7;
        this.f9355c = i8;
        this.f9356d = i9;
        this.f9357e = i10;
        this.f9358f = i11;
        this.f9359g = i12;
        this.f9360h = i13;
        this.f9361i = i14;
        this.f9362j = i15;
        this.f9363k = f5;
        this.f9364l = str;
    }

    public static C0598c a(B1.B b4) {
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f5;
        int i13;
        int i14;
        try {
            b4.G(4);
            int iT = (b4.t() & 3) + 1;
            if (iT == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT2 = b4.t() & 31;
            for (int i15 = 0; i15 < iT2; i15++) {
                int iZ = b4.z();
                int i16 = b4.f288b;
                b4.G(iZ);
                byte[] bArr = b4.a;
                byte[] bArr2 = AbstractC0018e.a;
                byte[] bArr3 = new byte[iZ + 4];
                System.arraycopy(AbstractC0018e.a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i16, bArr3, 4, iZ);
                arrayList.add(bArr3);
            }
            int iT3 = b4.t();
            for (int i17 = 0; i17 < iT3; i17++) {
                int iZ2 = b4.z();
                int i18 = b4.f288b;
                b4.G(iZ2);
                byte[] bArr4 = b4.a;
                byte[] bArr5 = AbstractC0018e.a;
                byte[] bArr6 = new byte[iZ2 + 4];
                System.arraycopy(AbstractC0018e.a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i18, bArr6, 4, iZ2);
                arrayList.add(bArr6);
            }
            if (iT2 > 0) {
                C1.q qVarK = C1.r.k((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i19 = qVarK.f608e;
                int i20 = qVarK.f609f;
                int i21 = qVarK.f611h + 8;
                int i22 = qVarK.f612i + 8;
                int i23 = qVarK.f619p;
                int i24 = qVarK.f620q;
                int i25 = qVarK.f621r;
                int i26 = qVarK.f622s;
                float f7 = qVarK.f610g;
                int i27 = qVarK.a;
                int i28 = qVarK.f605b;
                int i29 = qVarK.f606c;
                byte[] bArr7 = AbstractC0018e.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i27), Integer.valueOf(i28), Integer.valueOf(i29));
                i10 = i24;
                i11 = i25;
                i12 = i26;
                f5 = f7;
                i8 = i20;
                i9 = i21;
                i13 = i22;
                i14 = i23;
                i7 = i19;
            } else {
                str = null;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = 16;
                f5 = 1.0f;
                i13 = -1;
                i14 = -1;
            }
            return new C0598c(arrayList, iT, i7, i8, i9, i13, i14, i10, i11, i12, f5, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw y1.E.a(e7, "Error parsing AVC config");
        }
    }
}
