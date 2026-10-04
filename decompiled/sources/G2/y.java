package G2;

import D.C0042b;
import android.net.Uri;
import android.os.Bundle;
import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m.C1478H;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f2756r = 0;

    /* renamed from: k, reason: collision with root package name */
    public final String f2757k;

    /* renamed from: l, reason: collision with root package name */
    public B f2758l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2759m;

    /* renamed from: n, reason: collision with root package name */
    public final C1478H f2760n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f2761o;

    /* renamed from: p, reason: collision with root package name */
    public int f2762p;

    /* renamed from: q, reason: collision with root package name */
    public String f2763q;

    static {
        new LinkedHashMap();
    }

    public y(O o7) {
        kotlin.jvm.internal.l.f("navigator", o7);
        LinkedHashMap linkedHashMap = P.f2682b;
        this.f2757k = AbstractC0170g.d(o7.getClass());
        this.f2759m = new ArrayList();
        this.f2760n = new C1478H(0);
        this.f2761o = new LinkedHashMap();
    }

    public final void a(w wVar) {
        kotlin.jvm.internal.l.f("navDeepLink", wVar);
        ArrayList arrayListE = AbstractC0170g.e(this.f2761o, new C0042b(7, wVar));
        if (arrayListE.isEmpty()) {
            this.f2759m.add(wVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + wVar.a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListE).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto Lb9
        L5:
            r1 = 0
            if (r9 == 0) goto Lba
            boolean r2 = r9 instanceof G2.y
            if (r2 != 0) goto Le
            goto Lba
        Le:
            java.util.ArrayList r2 = r8.f2759m
            G2.y r9 = (G2.y) r9
            java.util.ArrayList r3 = r9.f2759m
            boolean r2 = kotlin.jvm.internal.l.a(r2, r3)
            m.H r3 = r8.f2760n
            int r4 = r3.e()
            m.H r5 = r9.f2760n
            int r6 = r5.e()
            if (r4 != r6) goto L56
            m.I r4 = new m.I
            r4.<init>(r3)
            y5.h r4 = y5.k.N(r4)
            y5.a r4 = (y5.C2418a) r4
            java.util.Iterator r4 = r4.iterator()
        L35:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r3.b(r6)
            java.lang.Object r6 = r5.b(r6)
            boolean r6 = kotlin.jvm.internal.l.a(r7, r6)
            if (r6 != 0) goto L35
            goto L56
        L54:
            r3 = r0
            goto L57
        L56:
            r3 = r1
        L57:
            java.util.LinkedHashMap r4 = r8.f2761o
            int r5 = r4.size()
            java.util.LinkedHashMap r6 = r9.f2761o
            int r7 = r6.size()
            if (r5 != r7) goto La2
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            P3.p r4 = P3.q.l0(r4)
            java.lang.Object r4 = r4.f7771b
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L77:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            boolean r7 = r6.containsKey(r7)
            if (r7 == 0) goto La2
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r7 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.l.a(r7, r5)
            if (r5 == 0) goto La2
            goto L77
        La0:
            r4 = r0
            goto La3
        La2:
            r4 = r1
        La3:
            int r5 = r8.f2762p
            int r6 = r9.f2762p
            if (r5 != r6) goto Lba
            java.lang.String r5 = r8.f2763q
            java.lang.String r9 = r9.f2763q
            boolean r9 = kotlin.jvm.internal.l.a(r5, r9)
            if (r9 == 0) goto Lba
            if (r2 == 0) goto Lba
            if (r3 == 0) goto Lba
            if (r4 == 0) goto Lba
        Lb9:
            return r0
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.y.equals(java.lang.Object):boolean");
    }

    public final Bundle h(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f2761o;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((C0169f) entry.getValue()).getClass();
            kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C0169f c0169f = (C0169f) entry2.getValue();
                c0169f.getClass();
                kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str2);
                boolean zContainsKey = bundle2.containsKey(str2);
                M m7 = c0169f.a;
                if (!zContainsKey || bundle2.get(str2) != null) {
                    try {
                        m7.a(str2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbQ = AbstractC0703b.q("Wrong argument type for '", str2, "' in argument bundle. ");
                sbQ.append(m7.b());
                sbQ.append(" expected.");
                throw new IllegalArgumentException(sbQ.toString().toString());
            }
        }
        return bundle2;
    }

    public int hashCode() {
        int i7 = this.f2762p * 31;
        String str = this.f2763q;
        int iHashCode = i7 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f2759m.iterator();
        while (it.hasNext()) {
            iHashCode = (((w) it.next()).a.hashCode() + (iHashCode * 31)) * 961;
        }
        C1478H c1478h = this.f2760n;
        kotlin.jvm.internal.l.f("<this>", c1478h);
        if (c1478h.e() > 0) {
            c1478h.f(0).getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f2761o;
        for (String str2 : linkedHashMap.keySet()) {
            int iB = A6.b.b(str2, iHashCode * 31, 31);
            Object obj = linkedHashMap.get(str2);
            iHashCode = iB + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* JADX WARN: Type inference failed for: r0v3, types: [G2.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r12v4, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.regex.Matcher] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public G2.x j(B2.l r20) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.y.j(B2.l):G2.x");
    }

    public final x m(String str) {
        kotlin.jvm.internal.l.f("route", str);
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        kotlin.jvm.internal.l.b(uri);
        Object obj = null;
        B2.l lVar = new B2.l(uri, obj, obj, 5);
        return this instanceof B ? ((B) this).q(lVar, false, false, this) : j(lVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f2762p));
        sb.append(")");
        String str = this.f2763q;
        if (str != null && !AbstractC2510o.g0(str)) {
            sb.append(" route=");
            sb.append(this.f2763q);
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
