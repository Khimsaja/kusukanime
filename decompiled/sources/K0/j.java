package K0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4454b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4455c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4456d;

    public j(float f5, float f7, float f8, int i7) {
        this.a = i7;
        this.f4454b = f5;
        this.f4455c = f7;
        this.f4456d = f8;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f4456d, this.f4454b, this.f4455c, this.a);
    }
}
