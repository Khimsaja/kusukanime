package y1;

import java.util.Arrays;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2380b {

    /* renamed from: c, reason: collision with root package name */
    public static final C2380b f18024c = new C2380b(new C2379a[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final C2379a f18025d;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final C2379a[] f18026b;

    static {
        C2379a c2379a = new C2379a(-1, -1, new int[0], new C2401x[0], new long[0], new String[0]);
        int[] iArr = c2379a.f18021e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c2379a.f18022f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f18025d = new C2379a(0, c2379a.f18018b, iArrCopyOf, (C2401x[]) Arrays.copyOf(c2379a.f18020d, 0), jArrCopyOf, (String[]) Arrays.copyOf(c2379a.f18023g, 0));
        B1.K.B(1);
        B1.K.B(2);
        B1.K.B(3);
        B1.K.B(4);
    }

    public C2380b(C2379a[] c2379aArr) {
        this.a = c2379aArr.length;
        this.f18026b = c2379aArr;
    }

    public final C2379a a(int i7) {
        return i7 < 0 ? f18025d : this.f18026b[i7];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2380b.class != obj.getClass()) {
            return false;
        }
        C2380b c2380b = (C2380b) obj;
        return this.a == c2380b.a && Arrays.equals(this.f18026b, c2380b.f18026b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18026b) + (((((this.a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i7 = 0;
        while (true) {
            C2379a[] c2379aArr = this.f18026b;
            if (i7 >= c2379aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c2379aArr[i7].getClass();
            for (int i8 = 0; i8 < c2379aArr[i7].f18021e.length; i8++) {
                sb.append("ad(state=");
                int i9 = c2379aArr[i7].f18021e[i8];
                if (i9 == 0) {
                    sb.append('_');
                } else if (i9 == 1) {
                    sb.append('R');
                } else if (i9 == 2) {
                    sb.append('S');
                } else if (i9 == 3) {
                    sb.append('P');
                } else if (i9 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c2379aArr[i7].f18022f[i8]);
                sb.append(')');
                if (i8 < c2379aArr[i7].f18021e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i7 < c2379aArr.length - 1) {
                sb.append(", ");
            }
            i7++;
        }
    }
}
