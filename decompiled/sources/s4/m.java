package s4;

import P3.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f15836b = new m(r.I(g.f15830c, j.f15833c, h.f15831c, i.f15832c));
    public final LinkedHashMap a;

    public m(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            W4.c cVar = ((k) obj).a;
            Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s4.l a(W4.c r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.l.f(r0, r9)
            java.lang.String r0 = "className"
            kotlin.jvm.internal.l.f(r0, r10)
            java.util.LinkedHashMap r0 = r8.a
            java.lang.Object r9 = r0.get(r9)
            java.util.List r9 = (java.util.List) r9
            r0 = 0
            if (r9 != 0) goto L16
            goto L6f
        L16:
            java.util.Iterator r9 = r9.iterator()
        L1a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r9.next()
            s4.k r1 = (s4.k) r1
            java.lang.String r2 = r1.f15834b
            r3 = 0
            boolean r2 = z5.AbstractC2517v.T(r10, r2, r3)
            if (r2 == 0) goto L1a
            java.lang.String r2 = r1.f15834b
            int r2 = r2.length()
            java.lang.String r2 = r10.substring(r2)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.l.e(r4, r2)
            int r4 = r2.length()
            if (r4 != 0) goto L46
        L44:
            r2 = r0
            goto L63
        L46:
            int r4 = r2.length()
            r5 = r3
        L4b:
            if (r3 >= r4) goto L5f
            char r6 = r2.charAt(r3)
            int r6 = r6 + (-48)
            if (r6 < 0) goto L44
            r7 = 10
            if (r6 >= r7) goto L44
            int r5 = r5 * 10
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L4b
        L5f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L63:
            if (r2 == 0) goto L1a
            int r9 = r2.intValue()
            s4.l r10 = new s4.l
            r10.<init>(r1, r9)
            return r10
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.m.a(W4.c, java.lang.String):s4.l");
    }
}
