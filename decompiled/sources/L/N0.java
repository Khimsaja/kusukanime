package L;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes.dex */
public final class N0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ N0(int i7) {
        this.a = i7;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 3:
                if ((view instanceof k0.m) && (outline2 = ((k0.m) view).f12651o) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", view);
                Outline outlineB = ((z0.U0) view).f18691o.b();
                kotlin.jvm.internal.l.c(outlineB);
                outline.set(outlineB);
                break;
        }
    }
}
