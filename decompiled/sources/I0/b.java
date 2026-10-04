package I0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    /* JADX WARN: Type inference failed for: r0v2, types: [I0.a] */
    public final int[] a(y yVar, RectF rectF, int i7, final e4.n nVar) {
        SegmentFinder segmentFinderH;
        if (i7 == 1) {
            segmentFinderH = J0.b.a.a(new F.w(21, yVar.f3924e.getText(), yVar.j()));
        } else {
            F.s.n();
            segmentFinderH = F.s.h(F.s.g(yVar.f3924e.getText(), yVar.a));
        }
        return yVar.f3924e.getRangeForRect(rectF, segmentFinderH, new Layout.TextInclusionStrategy() { // from class: I0.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) nVar.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
