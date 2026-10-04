package H0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: H0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0215g {
    public static final C0214f a = new C0214f("", null, 6);

    public static final ArrayList a(int i7, int i8, List list) {
        if (i7 > i8) {
            throw new IllegalArgumentException(("start (" + i7 + ") should be less than or equal to end (" + i8 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            C0212d c0212d = (C0212d) obj;
            if (c(i7, i8, c0212d.f3107b, c0212d.f3108c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C0212d c0212d2 = (C0212d) arrayList.get(i10);
            arrayList2.add(new C0212d(c0212d2.a, Math.max(i7, c0212d2.f3107b) - i7, Math.min(i8, c0212d2.f3108c) - i7, c0212d2.f3109d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List b(C0214f c0214f, int i7, int i8) {
        List list;
        if (i7 == i8 || (list = c0214f.f3110b) == null) {
            return null;
        }
        if (i7 == 0 && i8 >= c0214f.a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            C0212d c0212d = (C0212d) obj;
            if (c(i7, i8, c0212d.f3107b, c0212d.f3108c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C0212d c0212d2 = (C0212d) arrayList.get(i10);
            arrayList2.add(new C0212d(e3.c.k(c0212d2.f3107b, i7, i8) - i7, e3.c.k(c0212d2.f3108c, i7, i8) - i7, c0212d2.a));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(int r4, int r5, int r6, int r7) {
        /*
            int r0 = java.lang.Math.max(r4, r6)
            int r1 = java.lang.Math.min(r5, r7)
            r2 = 1
            if (r0 < r1) goto L33
            r0 = 0
            if (r4 > r6) goto L1f
            if (r7 > r5) goto L1f
            if (r5 != r7) goto L33
            if (r6 != r7) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r0
        L17:
            if (r4 != r5) goto L1b
            r3 = r2
            goto L1c
        L1b:
            r3 = r0
        L1c:
            if (r1 != r3) goto L1f
            goto L33
        L1f:
            if (r6 > r4) goto L32
            if (r5 > r7) goto L32
            if (r7 != r5) goto L33
            if (r4 != r5) goto L29
            r4 = r2
            goto L2a
        L29:
            r4 = r0
        L2a:
            if (r6 != r7) goto L2e
            r5 = r2
            goto L2f
        L2e:
            r5 = r0
        L2f:
            if (r4 != r5) goto L32
            goto L33
        L32:
            return r0
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.AbstractC0215g.c(int, int, int, int):boolean");
    }
}
