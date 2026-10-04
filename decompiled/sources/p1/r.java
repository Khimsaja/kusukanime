package p1;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import q1.C1845a;

/* loaded from: classes.dex */
public final class r extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f14196b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f14199e;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f14197c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f14198d = 1.0f;

    public r(q qVar) {
        e3.c.g("rasterizer cannot be null", qVar);
        this.f14196b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19, java.lang.CharSequence r20, int r21, int r22, float r23, int r24, int r25, int r26, android.graphics.Paint r27) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r27
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L4a
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r5 = r21
            r6 = r22
            java.lang.Object[] r1 = r1.getSpans(r5, r6, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L42
            int r3 = r1.length
            r5 = 1
            r6 = 0
            if (r3 != r5) goto L26
            r3 = r1[r6]
            if (r3 != r0) goto L26
            goto L42
        L26:
            android.text.TextPaint r3 = r0.f14199e
            if (r3 != 0) goto L31
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.f14199e = r3
        L31:
            r4 = r3
            r4.set(r2)
        L35:
            int r3 = r1.length
            if (r6 >= r3) goto L40
            r3 = r1[r6]
            r3.updateDrawState(r4)
            int r6 = r6 + 1
            goto L35
        L40:
            r10 = r4
            goto L52
        L42:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L40
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L40
        L4a:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L40
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L40
        L52:
            if (r10 == 0) goto L82
            int r1 = r10.bgColor
            if (r1 == 0) goto L82
            short r1 = r0.f14197c
            float r1 = (float) r1
            float r8 = r23 + r1
            r1 = r24
            float r7 = (float) r1
            r1 = r26
            float r9 = (float) r1
            int r1 = r10.getColor()
            android.graphics.Paint$Style r3 = r10.getStyle()
            int r4 = r10.bgColor
            r10.setColor(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r10.setStyle(r4)
            r5 = r19
            r6 = r23
            r5.drawRect(r6, r7, r8, r9, r10)
            r10.setStyle(r3)
            r10.setColor(r1)
        L82:
            p1.g r1 = p1.g.a()
            r1.getClass()
            r1 = r25
            float r1 = (float) r1
            if (r10 == 0) goto L8f
            goto L90
        L8f:
            r10 = r2
        L90:
            p1.q r2 = r0.f14196b
            A2.b r3 = r2.f14194b
            java.lang.Object r4 = r3.f113o
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            android.graphics.Typeface r5 = r10.getTypeface()
            r10.setTypeface(r4)
            int r2 = r2.a
            int r13 = r2 * 2
            r14 = 2
            java.lang.Object r2 = r3.f111m
            r12 = r2
            char[] r12 = (char[]) r12
            r11 = r19
            r15 = r23
            r16 = r1
            r17 = r10
            r11.drawText(r12, r13, r14, r15, r16, r17)
            r10.setTypeface(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.r.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        q qVar = this.f14196b;
        this.f14198d = fAbs / (qVar.b().a(14) != 0 ? ((ByteBuffer) r8.f7975n).getShort(r1 + r8.f7972k) : (short) 0);
        C1845a c1845aB = qVar.b();
        int iA = c1845aB.a(14);
        if (iA != 0) {
            ((ByteBuffer) c1845aB.f7975n).getShort(iA + c1845aB.f7972k);
        }
        short s7 = (short) ((qVar.b().a(12) != 0 ? ((ByteBuffer) r5.f7975n).getShort(r7 + r5.f7972k) : (short) 0) * this.f14198d);
        this.f14197c = s7;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s7;
    }
}
