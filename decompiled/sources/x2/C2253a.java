package x2;

import B1.AbstractC0015b;
import B1.B;
import B1.InterfaceC0021h;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import j3.G;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s2.C1973a;
import s2.C1981i;
import s2.InterfaceC1982j;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2253a implements InterfaceC1982j {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f17306n = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f17307o = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: k, reason: collision with root package name */
    public final StringBuilder f17308k = new StringBuilder();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f17309l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final B f17310m = new B();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A1.b a(android.text.Spanned r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2253a.a(android.text.Spanned, java.lang.String):A1.b");
    }

    public static long b(Matcher matcher, int i7) {
        String strGroup = matcher.group(i7 + 1);
        long j7 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i7 + 2);
        strGroup2.getClass();
        long j8 = (Long.parseLong(strGroup2) * 60000) + j7;
        String strGroup3 = matcher.group(i7 + 3);
        strGroup3.getClass();
        long j9 = (Long.parseLong(strGroup3) * 1000) + j8;
        String strGroup4 = matcher.group(i7 + 4);
        if (strGroup4 != null) {
            j9 += Long.parseLong(strGroup4);
        }
        return j9 * 1000;
    }

    @Override // s2.InterfaceC1982j
    public final void p(byte[] bArr, int i7, int i8, C1981i c1981i, InterfaceC0021h interfaceC0021h) throws NumberFormatException {
        String strH;
        String str;
        C2253a c2253a = this;
        B b4 = c2253a.f17310m;
        b4.D(bArr, i7 + i8);
        b4.F(i7);
        Charset charsetB = b4.B();
        if (charsetB == null) {
            charsetB = StandardCharsets.UTF_8;
        }
        long j7 = c1981i.a;
        long j8 = -9223372036854775807L;
        ArrayList arrayList = (j7 == -9223372036854775807L || !c1981i.f15521b) ? null : new ArrayList();
        while (true) {
            String strH2 = b4.h(charsetB);
            if (strH2 == null) {
                break;
            }
            if (strH2.length() != 0) {
                try {
                    Integer.parseInt(strH2);
                    strH = b4.h(charsetB);
                } catch (NumberFormatException unused) {
                    AbstractC0015b.v("SubripParser", "Skipping invalid index: ".concat(strH2));
                }
                if (strH == null) {
                    AbstractC0015b.v("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f17306n.matcher(strH);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = c2253a.f17308k;
                    long j9 = j8;
                    sb.setLength(0);
                    ArrayList arrayList2 = c2253a.f17309l;
                    arrayList2.clear();
                    String strH3 = b4.h(charsetB);
                    while (!TextUtils.isEmpty(strH3)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strH3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = f17307o.matcher(strTrim);
                        int i9 = 0;
                        while (matcher2.find()) {
                            Matcher matcher3 = matcher2;
                            String strGroup = matcher3.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher3.start() - i9;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i9 += length;
                            matcher2 = matcher3;
                            j7 = j7;
                        }
                        sb.append(sb2.toString());
                        strH3 = b4.h(charsetB);
                        j7 = j7;
                    }
                    long j10 = j7;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i10);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (j10 == j9 || jB >= j10) {
                        interfaceC0021h.c(new C1973a(jB, jB2 - jB, G.w(a(spannedFromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new C1973a(jB, jB2 - jB, G.w(a(spannedFromHtml, str))));
                    }
                    c2253a = this;
                    j8 = j9;
                    j7 = j10;
                } else {
                    AbstractC0015b.v("SubripParser", "Skipping invalid timing: ".concat(strH));
                    c2253a = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC0021h.c((C1973a) it.next());
            }
        }
    }
}
