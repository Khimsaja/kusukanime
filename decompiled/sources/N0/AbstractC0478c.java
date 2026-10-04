package N0;

import H0.F;
import android.view.inputmethod.CursorAnchorInfo;

/* renamed from: N0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0478c {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, F f5, g0.d dVar) {
        int iC;
        H0.n nVar;
        int iC2;
        if (!dVar.e() && (iC = f5.f3083b.c(dVar.f11659b)) <= (iC2 = (nVar = f5.f3083b).c(dVar.f11661d))) {
            while (true) {
                builder.addVisibleLineBounds(f5.f(iC), nVar.d(iC), f5.g(iC), nVar.b(iC));
                if (iC == iC2) {
                    break;
                }
                iC++;
            }
        }
        return builder;
    }
}
