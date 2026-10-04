package J0;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends z1.c {

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f4076r;

    /* renamed from: s, reason: collision with root package name */
    public final TextPaint f4077s;

    public c(CharSequence charSequence, TextPaint textPaint) {
        this.f4076r = charSequence;
        this.f4077s = textPaint;
    }

    @Override // z1.c
    public final int D(int i7) {
        CharSequence charSequence = this.f4076r;
        return this.f4077s.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 0);
    }

    @Override // z1.c
    public final int E(int i7) {
        CharSequence charSequence = this.f4076r;
        return this.f4077s.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 2);
    }
}
