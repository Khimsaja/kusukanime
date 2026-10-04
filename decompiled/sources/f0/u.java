package f0;

import java.util.Arrays;
import java.util.Comparator;
import y0.AbstractC2359f;
import y0.C2349D;

/* loaded from: classes.dex */
public final class u implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public static final u f11429k = new u();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0866s c0866s = (C0866s) obj;
        C0866s c0866s2 = (C0866s) obj2;
        int i7 = 0;
        if (AbstractC0851d.t(c0866s) && AbstractC0851d.t(c0866s2)) {
            C2349D c2349dV = AbstractC2359f.v(c0866s);
            C2349D c2349dV2 = AbstractC2359f.v(c0866s2);
            if (!kotlin.jvm.internal.l.a(c2349dV, c2349dV2)) {
                Object[] objArrCopyOf = new C2349D[16];
                int i8 = 0;
                while (c2349dV != null) {
                    int i9 = i8 + 1;
                    if (objArrCopyOf.length < i9) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i9, objArrCopyOf.length * 2));
                        kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
                    }
                    if (i8 != 0) {
                        P3.m.W(0 + 1, 0, i8, objArrCopyOf, objArrCopyOf);
                    }
                    objArrCopyOf[0] = c2349dV;
                    i8++;
                    c2349dV = c2349dV.s();
                }
                Object[] objArrCopyOf2 = new C2349D[16];
                int i10 = 0;
                while (c2349dV2 != null) {
                    int i11 = i10 + 1;
                    if (objArrCopyOf2.length < i11) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, Math.max(i11, objArrCopyOf2.length * 2));
                        kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf2);
                    }
                    if (i10 != 0) {
                        P3.m.W(0 + 1, 0, i10, objArrCopyOf2, objArrCopyOf2);
                    }
                    objArrCopyOf2[0] = c2349dV2;
                    i10++;
                    c2349dV2 = c2349dV2.s();
                }
                int iMin = Math.min(i8 - 1, i10 - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.l.a(objArrCopyOf[i7], objArrCopyOf2[i7])) {
                        if (i7 != iMin) {
                            i7++;
                        }
                    }
                    return kotlin.jvm.internal.l.g(((C2349D) objArrCopyOf[i7]).t(), ((C2349D) objArrCopyOf2[i7]).t());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC0851d.t(c0866s)) {
                return -1;
            }
            if (AbstractC0851d.t(c0866s2)) {
                return 1;
            }
        }
        return 0;
    }
}
