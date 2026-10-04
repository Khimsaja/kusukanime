package f6;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921s {
    public String a;

    /* renamed from: d, reason: collision with root package name */
    public String f11599d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11601f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f11602g;

    /* renamed from: h, reason: collision with root package name */
    public String f11603h;

    /* renamed from: b, reason: collision with root package name */
    public String f11597b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f11598c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f11600e = -1;

    public C0921s() {
        ArrayList arrayList = new ArrayList();
        this.f11601f = arrayList;
        arrayList.add("");
    }

    public final C0922t a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = C0904b.e(0, 0, 7, this.f11597b);
        String strE2 = C0904b.e(0, 0, 7, this.f11598c);
        String str2 = this.f11599d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.f11601f;
        ArrayList arrayList3 = new ArrayList(P3.r.p(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0904b.e(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.f11602g;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(P3.r.p(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? C0904b.e(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = this.f11603h;
        return new C0922t(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? C0904b.e(0, 0, 7, str4) : null, toString());
    }

    public final int b() {
        int i7 = this.f11600e;
        if (i7 != -1) {
            return i7;
        }
        String str = this.a;
        kotlin.jvm.internal.l.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(f6.C0922t r19, java.lang.String r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C0921s.c(f6.t, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.a
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r6.f11597b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r6.f11598c
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r6.f11597b
            r0.append(r1)
            java.lang.String r1 = r6.f11598c
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r6.f11598c
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r6.f11599d
            if (r1 == 0) goto L63
            boolean r1 = z5.AbstractC2510o.X(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r6.f11599d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r6.f11599d
            r0.append(r1)
        L63:
            int r1 = r6.f11600e
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r6.a
            if (r1 == 0) goto L91
        L6c:
            int r1 = r6.b()
            java.lang.String r4 = r6.a
            if (r4 == 0) goto L8b
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L7f
            r3 = 80
            goto L89
        L7f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L89
            r3 = 443(0x1bb, float:6.21E-43)
        L89:
            if (r1 == r3) goto L91
        L8b:
            r0.append(r2)
            r0.append(r1)
        L91:
            java.util.ArrayList r1 = r6.f11601f
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.l.f(r2, r1)
            int r2 = r1.size()
            r3 = 0
        L9d:
            if (r3 >= r2) goto Lb0
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto L9d
        Lb0:
            java.util.ArrayList r1 = r6.f11602g
            if (r1 == 0) goto Lc1
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r6.f11602g
            kotlin.jvm.internal.l.c(r1)
            f6.C0904b.g(r1, r0)
        Lc1:
            java.lang.String r1 = r6.f11603h
            if (r1 == 0) goto Lcf
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.f11603h
            r0.append(r1)
        Lcf:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.l.e(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C0921s.toString():java.lang.String");
    }
}
