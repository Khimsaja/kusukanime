package A2;

import B1.A;
import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f101b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f102c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f103d;

    /* renamed from: e, reason: collision with root package name */
    public int f104e;

    /* renamed from: f, reason: collision with root package name */
    public int f105f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f106g;
    public final int[] a = new int[4];

    /* renamed from: h, reason: collision with root package name */
    public int f107h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f108i = -1;

    public static int a(int[] iArr, int i7) {
        return (i7 < 0 || i7 >= iArr.length) ? iArr[0] : iArr[i7];
    }

    public static int c(int i7, int i8) {
        return (i7 & 16777215) | ((i8 * 17) << 24);
    }

    public final void b(A a, boolean z7, Rect rect, int[] iArr) {
        int i7;
        int i8;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i9 = !z7 ? 1 : 0;
        int i10 = i9 * iWidth;
        while (true) {
            int i11 = 0;
            do {
                int i12 = 0;
                for (int i13 = 1; i12 < i13 && i13 <= 64; i13 <<= 2) {
                    if (a.b() < 4) {
                        i7 = -1;
                        i8 = 0;
                        break;
                    }
                    i12 = (i12 << 4) | a.i(4);
                }
                i7 = i12 & 3;
                i8 = i12 < 4 ? iWidth : i12 >> 2;
                int iMin = Math.min(i8, iWidth - i11);
                if (iMin > 0) {
                    int i14 = i10 + iMin;
                    Arrays.fill(iArr, i10, i14, this.a[i7]);
                    i11 += iMin;
                    i10 = i14;
                }
            } while (i11 < iWidth);
            i9 += 2;
            if (i9 >= iHeight) {
                return;
            }
            i10 = i9 * iWidth;
            a.c();
        }
    }
}
