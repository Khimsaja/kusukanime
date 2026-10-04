package R0;

import B.e;
import O.C0486d;
import O.C0493g0;
import O.E;
import O.T;
import P0.j;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import g0.f;
import h0.AbstractC0971P;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {
    public final AbstractC0971P a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8028b;

    /* renamed from: c, reason: collision with root package name */
    public final C0493g0 f8029c = C0486d.K(new f(9205357640488583168L), T.f7049p);

    /* renamed from: d, reason: collision with root package name */
    public final E f8030d = C0486d.D(new e(16, this));

    public b(AbstractC0971P abstractC0971P, float f5) {
        this.a = abstractC0971P;
        this.f8028b = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f8028b);
        textPaint.setShader((Shader) this.f8030d.getValue());
    }
}
