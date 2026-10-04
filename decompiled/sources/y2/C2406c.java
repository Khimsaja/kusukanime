package y2;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2406c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18176b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18177c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18178d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18179e;

    /* renamed from: f, reason: collision with root package name */
    public final C2410g f18180f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f18181g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18182h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18183i;

    /* renamed from: j, reason: collision with root package name */
    public final C2406c f18184j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f18185k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f18186l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f18187m;

    public C2406c(String str, String str2, long j7, long j8, C2410g c2410g, String[] strArr, String str3, String str4, C2406c c2406c) {
        this.a = str;
        this.f18176b = str2;
        this.f18183i = str4;
        this.f18180f = c2410g;
        this.f18181g = strArr;
        this.f18177c = str2 != null;
        this.f18178d = j7;
        this.f18179e = j8;
        str3.getClass();
        this.f18182h = str3;
        this.f18184j = c2406c;
        this.f18185k = new HashMap();
        this.f18186l = new HashMap();
    }

    public static C2406c a(String str) {
        return new C2406c(null, str.replaceAll(ServerSentEventKt.END_OF_LINE, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", ServerSentEventKt.SPACE).replaceAll("[ \t\\x0B\f\r]+", ServerSentEventKt.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            A1.a aVar = new A1.a();
            aVar.a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((A1.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C2406c b(int i7) {
        ArrayList arrayList = this.f18187m;
        if (arrayList != null) {
            return (C2406c) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f18187m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z7) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z7 || zEquals || (zEquals2 && this.f18183i != null)) {
            long j7 = this.f18178d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j8 = this.f18179e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f18187m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f18187m.size(); i7++) {
            ((C2406c) this.f18187m.get(i7)).d(treeSet, z7 || zEquals);
        }
    }

    public final boolean f(long j7) {
        long j8 = this.f18178d;
        long j9 = this.f18179e;
        if (j8 == -9223372036854775807L && j9 == -9223372036854775807L) {
            return true;
        }
        if (j8 <= j7 && j9 == -9223372036854775807L) {
            return true;
        }
        if (j8 != -9223372036854775807L || j7 >= j9) {
            return j8 <= j7 && j7 < j9;
        }
        return true;
    }

    public final void g(long j7, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f18182h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j7) && "div".equals(this.a) && (str2 = this.f18183i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j7, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C2406c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j7, boolean z7, String str, TreeMap treeMap) {
        boolean z8;
        TreeMap treeMap2;
        long j8;
        HashMap map = this.f18185k;
        map.clear();
        HashMap map2 = this.f18186l;
        map2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f18182h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f18177c && z7) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f18176b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z7) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j7)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((A1.a) entry.getValue()).a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i7 = 0; i7 < c(); i7++) {
                C2406c c2406cB = b(i7);
                if (z7 || zEquals) {
                    z8 = true;
                    treeMap2 = treeMap;
                    j8 = j7;
                } else {
                    z8 = false;
                    j8 = j7;
                    treeMap2 = treeMap;
                }
                c2406cB.i(j8, z8, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((A1.a) entry2.getValue()).a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
