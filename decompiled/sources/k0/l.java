package k0;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class l {
    public static final l a = new l();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i7) {
        renderNode.setAmbientShadowColor(i7);
    }

    public final void d(RenderNode renderNode, int i7) {
        renderNode.setSpotShadowColor(i7);
    }
}
