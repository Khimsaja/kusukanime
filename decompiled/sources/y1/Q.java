package y1;

import B1.AbstractC0015b;
import java.util.Arrays;
import v.c0;

/* loaded from: classes.dex */
public final class Q {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17970c;

    /* renamed from: d, reason: collision with root package name */
    public final C2393o[] f17971d;

    /* renamed from: e, reason: collision with root package name */
    public int f17972e;

    static {
        B1.K.B(0);
        B1.K.B(1);
    }

    public Q(String str, C2393o... c2393oArr) {
        AbstractC0015b.c(c2393oArr.length > 0);
        this.f17969b = str;
        this.f17971d = c2393oArr;
        this.a = c2393oArr.length;
        int iH = D.h(c2393oArr[0].f18112n);
        this.f17970c = iH == -1 ? D.h(c2393oArr[0].f18111m) : iH;
        String str2 = c2393oArr[0].f18102d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i7 = c2393oArr[0].f18104f | 16384;
        for (int i8 = 1; i8 < c2393oArr.length; i8++) {
            String str3 = c2393oArr[i8].f18102d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a(i8, "languages", c2393oArr[0].f18102d, c2393oArr[i8].f18102d);
                return;
            } else {
                if (i7 != (c2393oArr[i8].f18104f | 16384)) {
                    a(i8, "role flags", Integer.toBinaryString(c2393oArr[0].f18104f), Integer.toBinaryString(c2393oArr[i8].f18104f));
                    return;
                }
            }
        }
    }

    public static void a(int i7, String str, String str2, String str3) {
        StringBuilder sbC = c0.c("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbC.append(str3);
        sbC.append("' (track ");
        sbC.append(i7);
        sbC.append(")");
        AbstractC0015b.n("TrackGroup", "", new IllegalStateException(sbC.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class == obj.getClass()) {
            Q q6 = (Q) obj;
            if (this.f17969b.equals(q6.f17969b) && Arrays.equals(this.f17971d, q6.f17971d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f17972e == 0) {
            this.f17972e = Arrays.hashCode(this.f17971d) + A6.b.b(this.f17969b, 527, 31);
        }
        return this.f17972e;
    }

    public final String toString() {
        return this.f17969b + ": " + Arrays.toString(this.f17971d);
    }
}
