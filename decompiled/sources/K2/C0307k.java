package K2;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: K2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307k extends K {
    public final /* synthetic */ C0310n a;

    public C0307k(C0310n c0310n) {
        this.a = c0310n;
    }

    @Override // K2.K
    public final void a(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0310n c0310n = this.a;
        int iComputeVerticalScrollRange = c0310n.f4642s.computeVerticalScrollRange();
        int i7 = c0310n.f4641r;
        int i8 = iComputeVerticalScrollRange - i7;
        int i9 = c0310n.a;
        c0310n.f4643t = i8 > 0 && i7 >= i9;
        int iComputeHorizontalScrollRange = c0310n.f4642s.computeHorizontalScrollRange();
        int i10 = c0310n.f4640q;
        boolean z7 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= i9;
        c0310n.f4644u = z7;
        boolean z8 = c0310n.f4643t;
        if (!z8 && !z7) {
            if (c0310n.f4645v != 0) {
                c0310n.d(0);
                return;
            }
            return;
        }
        if (z8) {
            float f5 = i7;
            c0310n.f4635l = (int) ((((f5 / 2.0f) + iComputeVerticalScrollOffset) * f5) / iComputeVerticalScrollRange);
            c0310n.f4634k = Math.min(i7, (i7 * i7) / iComputeVerticalScrollRange);
        }
        if (c0310n.f4644u) {
            float f7 = iComputeHorizontalScrollOffset;
            float f8 = i10;
            c0310n.f4638o = (int) ((((f8 / 2.0f) + f7) * f8) / iComputeHorizontalScrollRange);
            c0310n.f4637n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
        }
        int i11 = c0310n.f4645v;
        if (i11 == 0 || i11 == 1) {
            c0310n.d(1);
        }
    }
}
