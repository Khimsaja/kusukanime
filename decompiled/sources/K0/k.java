package K0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4457b;

    public k(boolean z7, boolean z8) {
        this.a = z7;
        this.f4457b = z8;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.f4457b);
    }
}
