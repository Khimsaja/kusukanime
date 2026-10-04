package y1;

import B1.AbstractC0015b;
import android.net.Uri;
import java.util.Arrays;
import v.c0;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2379a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18018b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f18019c;

    /* renamed from: d, reason: collision with root package name */
    public final C2401x[] f18020d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f18021e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f18022f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f18023g;

    static {
        c0.d(0, 1, 2, 3, 4);
        c0.d(5, 6, 7, 8, 9);
        B1.K.B(10);
    }

    public C2379a(int i7, int i8, int[] iArr, C2401x[] c2401xArr, long[] jArr, String[] strArr) {
        Uri uri;
        int i9 = 0;
        AbstractC0015b.c(iArr.length == c2401xArr.length);
        this.a = i7;
        this.f18018b = i8;
        this.f18021e = iArr;
        this.f18020d = c2401xArr;
        this.f18022f = jArr;
        this.f18019c = new Uri[c2401xArr.length];
        while (true) {
            Uri[] uriArr = this.f18019c;
            if (i9 >= uriArr.length) {
                this.f18023g = strArr;
                return;
            }
            C2401x c2401x = c2401xArr[i9];
            if (c2401x == null) {
                uri = null;
            } else {
                C2398u c2398u = c2401x.f18138b;
                c2398u.getClass();
                uri = c2398u.a;
            }
            uriArr[i9] = uri;
            i9++;
        }
    }

    public final int a(int i7) {
        int i8;
        int i9 = i7 + 1;
        while (true) {
            int[] iArr = this.f18021e;
            if (i9 >= iArr.length || (i8 = iArr[i9]) == 0 || i8 == 1) {
                break;
            }
            i9++;
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2379a.class != obj.getClass()) {
            return false;
        }
        C2379a c2379a = (C2379a) obj;
        return this.a == c2379a.a && this.f18018b == c2379a.f18018b && Arrays.equals(this.f18020d, c2379a.f18020d) && Arrays.equals(this.f18021e, c2379a.f18021e) && Arrays.equals(this.f18022f, c2379a.f18022f) && Arrays.equals(this.f18023g, c2379a.f18023g);
    }

    public final int hashCode() {
        int i7 = ((this.a * 31) + this.f18018b) * 31;
        int i8 = (int) 0;
        return (((((Arrays.hashCode(this.f18022f) + ((Arrays.hashCode(this.f18021e) + ((Arrays.hashCode(this.f18020d) + ((i7 + i8) * 31)) * 31)) * 31)) * 31) + i8) * 961) + Arrays.hashCode(this.f18023g)) * 31;
    }
}
