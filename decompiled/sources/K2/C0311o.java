package K2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: K2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311o {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f4650b;

    /* renamed from: c, reason: collision with root package name */
    public int f4651c;

    /* renamed from: d, reason: collision with root package name */
    public int f4652d;

    public C0311o() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f4652d = iHighestOneBit - 1;
        this.a = new int[iHighestOneBit];
    }

    public void a(int i7) {
        int[] iArr = this.a;
        int i8 = this.f4651c;
        iArr[i8] = i7;
        int i9 = this.f4652d & (i8 + 1);
        this.f4651c = i9;
        int i10 = this.f4650b;
        if (i9 == i10) {
            int length = iArr.length;
            int i11 = length - i10;
            int i12 = length << 1;
            if (i12 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i12];
            P3.m.V(0, i10, length, iArr, iArr2);
            P3.m.V(i11, 0, this.f4650b, this.a, iArr2);
            this.a = iArr2;
            this.f4650b = 0;
            this.f4651c = length;
            this.f4652d = i12 - 1;
        }
    }

    public void b(int i7, int i8) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i9 = this.f4652d;
        int i10 = i9 * 2;
        int[] iArr = this.a;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int[] iArr3 = new int[i9 * 4];
            this.a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.a;
        iArr4[i10] = i7;
        iArr4[i10 + 1] = i8;
        this.f4652d++;
    }

    public void c(RecyclerView recyclerView, boolean z7) {
        this.f4652d = 0;
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        H h7 = recyclerView.f10869w;
        if (recyclerView.f10868v == null || h7 == null || !h7.f4477h) {
            return;
        }
        if (z7) {
            if (((ArrayList) recyclerView.f10854o.f319m).size() <= 0) {
                h7.h(recyclerView.f10868v.a(), this);
            }
        } else if (!recyclerView.H()) {
            h7.g(this.f4650b, this.f4651c, recyclerView.f10853n0, this);
        }
        int i7 = this.f4652d;
        if (i7 > h7.f4478i) {
            h7.f4478i = i7;
            h7.f4479j = z7;
            recyclerView.f10850m.m();
        }
    }
}
