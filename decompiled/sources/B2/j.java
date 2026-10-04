package B2;

import B1.AbstractC0015b;
import B1.B;
import android.graphics.Color;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class j {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f412b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f413c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f414d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f413c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f414d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r19, B2.g r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.j.a(java.lang.String, B2.g, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(java.util.List r8, java.lang.String r9, B2.g r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            B2.c r3 = (B2.c) r3
            java.lang.String r4 = r10.a
            java.lang.String r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f376b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set r5 = r3.f377c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f378d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = B2.c.a(r1, r6, r5, r9)
            java.lang.String r6 = r3.f376b
            r7 = 2
            int r4 = B2.c.a(r5, r7, r6, r4)
            java.lang.String r5 = r3.f378d
            java.lang.String r6 = r10.f398c
            r7 = 4
            int r4 = B2.c.a(r4, r7, r5, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set r5 = r3.f377c
            java.util.Set r6 = r10.f399d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set r5 = r3.f377c
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 <= 0) goto L74
            B2.h r5 = new B2.h
            r5.<init>(r4, r3)
            r0.add(r5)
        L74:
            int r2 = r2 + 1
            goto L7
        L77:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.j.b(java.util.List, java.lang.String, B2.g):java.util.ArrayList");
    }

    public static int c(List list, String str, g gVar) {
        ArrayList arrayListB = b(list, str, gVar);
        for (int i7 = 0; i7 < arrayListB.size(); i7++) {
            int i8 = ((h) arrayListB.get(i7)).f401l.f390p;
            if (i8 != -1) {
                return i8;
            }
        }
        return -1;
    }

    public static d d(String str, Matcher matcher, B b4, ArrayList arrayList) {
        i iVar = new i();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            iVar.a = k.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            iVar.f402b = k.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, iVar);
            StringBuilder sb = new StringBuilder();
            b4.getClass();
            String strH = b4.h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = b4.h(StandardCharsets.UTF_8);
            }
            iVar.f403c = f(str, sb.toString(), arrayList);
            return new d(iVar.a().a(), iVar.a, iVar.f402b);
        } catch (IllegalArgumentException unused) {
            AbstractC0015b.v("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, B2.i r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.j.e(java.lang.String, B2.i):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0105. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.j.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, i iVar) {
        String strSubstring;
        int i7 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i7 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i7 = 0;
                    break;
                default:
                    AbstractC0015b.v("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i7 = Integer.MIN_VALUE;
                    break;
            }
            iVar.f407g = i7;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            iVar.f405e = k.a(str);
            iVar.f406f = 0;
        } else {
            iVar.f405e = Integer.parseInt(str);
            iVar.f406f = 1;
        }
    }
}
