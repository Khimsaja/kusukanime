package w2;

import B1.AbstractC0015b;
import B1.B;
import B1.InterfaceC0021h;
import B1.K;
import K2.e0;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import io.ktor.util.GzipHeaderFlags;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s2.C1973a;
import s2.C1981i;
import s2.InterfaceC1982j;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2209a implements InterfaceC1982j {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f16899q = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: k, reason: collision with root package name */
    public final boolean f16900k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f16901l;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f16903n;

    /* renamed from: o, reason: collision with root package name */
    public float f16904o = -3.4028235E38f;

    /* renamed from: p, reason: collision with root package name */
    public float f16905p = -3.4028235E38f;

    /* renamed from: m, reason: collision with root package name */
    public final B f16902m = new B();

    public C2209a(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f16900k = false;
            this.f16901l = null;
            return;
        }
        this.f16900k = true;
        String strM = K.m((byte[]) list.get(0));
        AbstractC0015b.c(strM.startsWith("Format:"));
        e0 e0VarB = e0.b(strM);
        e0VarB.getClass();
        this.f16901l = e0VarB;
        b(new B((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j7, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j7) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j7) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, Long.valueOf(j7));
        arrayList2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i7 - 1)));
        return i7;
    }

    public static long c(String str) {
        Matcher matcher = f16899q.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i7 = K.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(B1.B r38, java.nio.charset.Charset r39) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C2209a.b(B1.B, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // s2.InterfaceC1982j
    public final void p(byte[] bArr, int i7, int i8, C1981i c1981i, InterfaceC0021h interfaceC0021h) throws NumberFormatException {
        Charset charset;
        e0 e0Var;
        B b4;
        int i9;
        float f5;
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i11;
        PointF pointF;
        int i12;
        int i13;
        float f7;
        float f8;
        float f9;
        float f10;
        int i14;
        float f11;
        int i15;
        int i16;
        Integer num;
        int iA;
        int i17;
        C2209a c2209a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        B b7 = c2209a.f16902m;
        b7.D(bArr, i7 + i8);
        b7.F(i7);
        Charset charsetB = b7.B();
        if (charsetB == null) {
            charsetB = StandardCharsets.UTF_8;
        }
        boolean z7 = c2209a.f16900k;
        if (!z7) {
            c2209a.b(b7, charsetB);
        }
        e0 e0VarB = z7 ? c2209a.f16901l : null;
        while (true) {
            String strH = b7.h(charsetB);
            if (strH == null) {
                long j7 = c1981i.a;
                ArrayList arrayList3 = (j7 == -9223372036854775807L || !c1981i.f15521b) ? null : new ArrayList();
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    List list = (List) arrayList.get(i18);
                    if (!list.isEmpty() || i18 == 0) {
                        if (i18 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i18)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i18 + 1)).longValue() - ((Long) arrayList2.get(i18)).longValue();
                        if (j7 == -9223372036854775807L || jLongValue >= j7) {
                            interfaceC0021h.c(new C1973a(jLongValue, jLongValue2, list));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C1973a(jLongValue, jLongValue2, list));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC0021h.c((C1973a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                e0VarB = e0.b(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (e0VarB == null) {
                    AbstractC0015b.v("SsaParser", "Skipping dialogue line before complete format: ".concat(strH));
                } else {
                    AbstractC0015b.c(strH.startsWith("Dialogue:"));
                    String strSubstring = strH.substring(9);
                    int i19 = e0VarB.f4588e;
                    String[] strArrSplit = strSubstring.split(",", i19);
                    if (strArrSplit.length != i19) {
                        AbstractC0015b.v("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                    } else {
                        long jC = c(strArrSplit[e0VarB.a]);
                        if (jC == -9223372036854775807L) {
                            AbstractC0015b.v("SsaParser", "Skipping invalid timing: ".concat(strH));
                        } else {
                            long jC2 = c(strArrSplit[e0VarB.f4585b]);
                            if (jC2 == -9223372036854775807L || jC2 <= jC) {
                                charset = charsetB;
                                e0Var = e0VarB;
                                b4 = b7;
                                AbstractC0015b.v("SsaParser", "Skipping invalid timing: ".concat(strH));
                            } else {
                                LinkedHashMap linkedHashMap = c2209a.f16903n;
                                d dVar = (linkedHashMap == null || (i17 = e0VarB.f4586c) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i17].trim());
                                String str = strArrSplit[e0VarB.f4587d];
                                Matcher matcher = c.a.matcher(str);
                                int i20 = -1;
                                PointF pointF2 = null;
                                while (matcher.find()) {
                                    Charset charset2 = charsetB;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = c.a(strGroup);
                                        if (pointFA != null) {
                                            pointF2 = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = c.f16918d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = d.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i20 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    charsetB = charset2;
                                }
                                charset = charsetB;
                                String strReplace = c.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f12 = c2209a.f16904o;
                                float f13 = c2209a.f16905p;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (dVar != null) {
                                    Integer num2 = dVar.f16920c;
                                    if (num2 != null) {
                                        e0Var = e0VarB;
                                        b4 = b7;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        e0Var = e0VarB;
                                        b4 = b7;
                                    }
                                    if (dVar.f16927j == 3 && (num = dVar.f16921d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f14 = dVar.f16922e;
                                    if (f14 == -3.4028235E38f || f13 == -3.4028235E38f) {
                                        f10 = -3.4028235E38f;
                                        i14 = Integer.MIN_VALUE;
                                    } else {
                                        f10 = f14 / f13;
                                        i14 = 1;
                                    }
                                    boolean z8 = dVar.f16924g;
                                    boolean z9 = dVar.f16923f;
                                    if (z9 && z8) {
                                        f11 = f10;
                                        i15 = i14;
                                        i9 = 0;
                                        i16 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f11 = f10;
                                        i15 = i14;
                                        i9 = 0;
                                        i16 = 33;
                                        if (z9) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z8) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (dVar.f16925h) {
                                        spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i16);
                                    }
                                    if (dVar.f16926i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i16);
                                    }
                                    i10 = i15;
                                    f5 = f11;
                                } else {
                                    e0Var = e0VarB;
                                    b4 = b7;
                                    i9 = 0;
                                    f5 = -3.4028235E38f;
                                    i10 = Integer.MIN_VALUE;
                                }
                                int i21 = -1;
                                if (i20 != -1) {
                                    i21 = i20;
                                } else if (dVar != null) {
                                    i21 = dVar.f16919b;
                                }
                                switch (i21) {
                                    case 0:
                                    default:
                                        A6.b.n(i21, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        alignment2 = null;
                                        break;
                                    case 1:
                                    case GzipHeaderFlags.EXTRA /* 4 */:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        alignment2 = alignment;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        alignment2 = alignment;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        alignment2 = alignment;
                                        break;
                                }
                                int i22 = Integer.MIN_VALUE;
                                switch (i21) {
                                    case 0:
                                    default:
                                        A6.b.n(i21, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        i11 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case GzipHeaderFlags.EXTRA /* 4 */:
                                    case 7:
                                        i11 = i9;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i11 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i11 = 2;
                                        break;
                                }
                                switch (i21) {
                                    case -1:
                                        pointF = pointF2;
                                        break;
                                    case 0:
                                    default:
                                        A6.b.n(i21, "Unknown alignment: ", "SsaParser");
                                        pointF = pointF2;
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        pointF = pointF2;
                                        i22 = 2;
                                        break;
                                    case GzipHeaderFlags.EXTRA /* 4 */:
                                    case 5:
                                    case 6:
                                        pointF = pointF2;
                                        i22 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i22 = i9;
                                        pointF = pointF2;
                                        break;
                                }
                                if (pointF == null || f13 == -3.4028235E38f || f12 == -3.4028235E38f) {
                                    if (i11 != 0) {
                                        i12 = 1;
                                        if (i11 != 1) {
                                            i13 = 2;
                                            f7 = i11 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i13 = 2;
                                            f7 = 0.5f;
                                        }
                                    } else {
                                        i12 = 1;
                                        i13 = 2;
                                        f7 = 0.05f;
                                    }
                                    f8 = i22 != 0 ? i22 != i12 ? i22 != i13 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f9 = f7;
                                } else {
                                    float f15 = pointF.x / f12;
                                    f8 = pointF.y / f13;
                                    f9 = f15;
                                }
                                A1.b bVar = new A1.b(spannableString, alignment2, null, null, f8, i9, i22, f9, i11, i10, f5, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iA2 = a(jC2, arrayList2, arrayList);
                                for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                    ((List) arrayList.get(iA3)).add(bVar);
                                }
                            }
                            c2209a = this;
                            charsetB = charset;
                            e0VarB = e0Var;
                            b7 = b4;
                        }
                    }
                }
                charset = charsetB;
                e0Var = e0VarB;
                b4 = b7;
                c2209a = this;
                charsetB = charset;
                e0VarB = e0Var;
                b7 = b4;
            } else {
                charset = charsetB;
                e0Var = e0VarB;
                b4 = b7;
                c2209a = this;
                charsetB = charset;
                e0VarB = e0Var;
                b7 = b4;
            }
        }
    }
}
