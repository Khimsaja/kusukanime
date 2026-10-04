package R0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import j0.AbstractC1299e;
import j0.g;
import j0.h;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {
    public final AbstractC1299e a;

    public a(AbstractC1299e abstractC1299e) {
        this.a = abstractC1299e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = g.a;
            AbstractC1299e abstractC1299e = this.a;
            if (l.a(abstractC1299e, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC1299e instanceof h) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((h) abstractC1299e).a);
                textPaint.setStrokeMiter(((h) abstractC1299e).f12208b);
                int i7 = ((h) abstractC1299e).f12210d;
                textPaint.setStrokeJoin(i7 == 0 ? Paint.Join.MITER : i7 == 1 ? Paint.Join.ROUND : i7 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i8 = ((h) abstractC1299e).f12209c;
                textPaint.setStrokeCap(i8 == 0 ? Paint.Cap.BUTT : i8 == 1 ? Paint.Cap.ROUND : i8 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                ((h) abstractC1299e).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
