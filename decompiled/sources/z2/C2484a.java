package z2;

import A1.b;
import B1.AbstractC0015b;
import B1.B;
import B1.InterfaceC0021h;
import B1.K;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b1.AbstractC0703b;
import j3.E;
import j3.G;
import j3.X;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import s2.C1973a;
import s2.C1981i;
import s2.InterfaceC1982j;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2484a implements InterfaceC1982j {

    /* renamed from: k, reason: collision with root package name */
    public final B f19007k = new B();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19008l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19009m;

    /* renamed from: n, reason: collision with root package name */
    public final int f19010n;

    /* renamed from: o, reason: collision with root package name */
    public final String f19011o;

    /* renamed from: p, reason: collision with root package name */
    public final float f19012p;

    /* renamed from: q, reason: collision with root package name */
    public final int f19013q;

    public C2484a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f19009m = 0;
            this.f19010n = -1;
            this.f19011o = "sans-serif";
            this.f19008l = false;
            this.f19012p = 0.85f;
            this.f19013q = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f19009m = bArr[24];
        this.f19010n = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f19011o = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f19013q = i7;
        boolean z7 = (bArr[0] & 32) != 0;
        this.f19008l = z7;
        if (z7) {
            this.f19012p = K.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f19012p = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            int i12 = i11 | 33;
            boolean z7 = (i7 & 1) != 0;
            boolean z8 = (i7 & 2) != 0;
            if (z7) {
                if (z8) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                }
            } else if (z8) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
            }
            boolean z9 = (i7 & 4) != 0;
            if (z9) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            }
            if (z9 || z7 || z8) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s2.InterfaceC1982j
    public final void p(byte[] bArr, int i7, int i8, C1981i c1981i, InterfaceC0021h interfaceC0021h) {
        String strR;
        int i9;
        int i10;
        int i11;
        int i12 = 1;
        B b4 = this.f19007k;
        b4.D(bArr, i7 + i8);
        b4.F(i7);
        int i13 = 2;
        int i14 = 0;
        AbstractC0015b.c(b4.a() >= 2);
        int iZ = b4.z();
        if (iZ == 0) {
            strR = "";
        } else {
            int i15 = b4.f288b;
            Charset charsetB = b4.B();
            int i16 = iZ - (b4.f288b - i15);
            if (charsetB == null) {
                charsetB = StandardCharsets.UTF_8;
            }
            strR = b4.r(i16, charsetB);
        }
        if (strR.isEmpty()) {
            E e7 = G.f12277l;
            interfaceC0021h.c(new C1973a(-9223372036854775807L, -9223372036854775807L, X.f12304o));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strR);
        b(spannableStringBuilder, this.f19009m, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f19010n, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f19011o;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fG = this.f19012p;
        while (b4.a() >= 8) {
            int i17 = b4.f288b;
            int iG = b4.g();
            int iG2 = b4.g();
            if (iG2 == 1937013100) {
                AbstractC0015b.c(b4.a() >= i13 ? i12 : i14);
                int iZ2 = b4.z();
                int i18 = i14;
                while (i18 < iZ2) {
                    AbstractC0015b.c(b4.a() >= 12 ? i12 : i14);
                    int iZ3 = b4.z();
                    int iZ4 = b4.z();
                    b4.G(i13);
                    int i19 = i18;
                    int iT = b4.t();
                    b4.G(i12);
                    int iG3 = b4.g();
                    int i20 = i12;
                    if (iZ4 > spannableStringBuilder.length()) {
                        StringBuilder sbP = AbstractC0703b.p(iZ4, "Truncating styl end (", ") to cueText.length() (");
                        sbP.append(spannableStringBuilder.length());
                        sbP.append(").");
                        AbstractC0015b.v("Tx3gParser", sbP.toString());
                        iZ4 = spannableStringBuilder.length();
                    }
                    if (iZ3 >= iZ4) {
                        AbstractC0015b.v("Tx3gParser", "Ignoring styl with start (" + iZ3 + ") >= end (" + iZ4 + ").");
                        i11 = i19;
                    } else {
                        i11 = i19;
                        int i21 = iZ4;
                        b(spannableStringBuilder, iT, this.f19009m, iZ3, i21, 0);
                        a(spannableStringBuilder, iG3, this.f19010n, iZ3, i21, 0);
                    }
                    i18 = i11 + 1;
                    i12 = i20;
                    i13 = 2;
                    i14 = 0;
                }
                i9 = i12;
                i10 = i13;
            } else {
                i9 = i12;
                if (iG2 == 1952608120 && this.f19008l) {
                    i10 = 2;
                    AbstractC0015b.c(b4.a() >= 2 ? i9 : 0);
                    fG = K.g(b4.z() / this.f19013q, 0.0f, 0.95f);
                } else {
                    i10 = 2;
                }
            }
            b4.F(i17 + iG);
            i13 = i10;
            i14 = 0;
            i12 = i9;
        }
        interfaceC0021h.c(new C1973a(-9223372036854775807L, -9223372036854775807L, G.w(new b(spannableStringBuilder, null, null, null, fG, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f))));
    }
}
