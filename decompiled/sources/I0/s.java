package I0;

import android.text.StaticLayout;

/* loaded from: classes.dex */
public abstract class s {
    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i7, int i8) {
        builder.setLineBreakConfig(F.j.b().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
    }
}
