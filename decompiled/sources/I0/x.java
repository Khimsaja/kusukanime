package I0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* loaded from: classes.dex */
public final class x extends Canvas {
    public Canvas a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        f fVar = f.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            return fVar.a(canvas, path);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        f fVar = f.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            return fVar.e(canvas, rectF);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.a(canvas);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i7, int i8, int i9, int i10) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawARGB(i7, i8, i9, i10);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f5, float f7, boolean z7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawArc(rectF, f5, f7, z7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i7, int i8, float[] fArr, int i9, int[] iArr, int i10, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i7, i8, fArr, i9, iArr, i10, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f5, float f7, float f8, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawCircle(f5, f7, f8, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawColor(i7);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f5, float f7, RectF rectF2, float f8, float f9, Paint paint) {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.e(canvas, rectF, f5, f7, rectF2, f8, f9, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i7, float[] fArr, int i8, int i9, Font font, Paint paint) {
        i iVar = i.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            iVar.a(canvas, iArr, i7, fArr, i8, i9, font, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f5, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawLine(f5, f7, f8, f9, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i7, int i8, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawLines(fArr, i7, i8, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        i iVar = i.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            iVar.b(canvas, ninePatch, rect, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPoint(f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i7, int i8, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i7, i8, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i7, int i8, float[] fArr, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i7, i8, fArr, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i7, int i8, int i9) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRGB(i7, i8, i9);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.g(canvas, renderNode);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i7, int i8, float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawText(cArr, i7, i8, f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i7, int i8, Path path, float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i7, i8, path, f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i7, int i8, int i9, int i10, float f5, float f7, boolean z7, Paint paint) {
        e eVar = e.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            eVar.b(canvas, cArr, i7, i8, i9, i10, f5, f7, z7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i7, float[] fArr, int i8, float[] fArr2, int i9, int[] iArr, int i10, short[] sArr, int i11, int i12, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i7, fArr, i8, fArr2, i9, iArr, i10, sArr, i11, i12, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.i(canvas);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.a;
        if (canvas == null) {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.restore();
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.restoreToCount(i7);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f5) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.rotate(f5);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.save();
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i7);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i7, int i8) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i7, i8);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f5, float f7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.scale(f5, f7);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.setDensity(i7);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f5, float f7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.skew(f5, f7);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f5, float f7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.translate(f5, f7);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        f fVar = f.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            return fVar.d(canvas, rect);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f5, float f7, float f8, float f9, float f10, float f11, boolean z7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawArc(f5, f7, f8, f9, f10, f11, z7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j7) {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.c(canvas, j7);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f5, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawOval(f5, f7, f8, f9, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        i iVar = i.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            iVar.c(canvas, ninePatch, rectF, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f5, float f7, float f8, float f9, float f10, float f11, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRoundRect(f5, f7, f8, f9, f10, f11, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawText(str, f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        h hVar = h.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            return hVar.c(canvas, rectF);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i7);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f5, float f7, float f8, float f9) {
        f fVar = f.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            return fVar.b(canvas, f5, f7, f8, f9);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7, PorterDuff.Mode mode) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawColor(i7, mode);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f5, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRect(f5, f7, f8, f9, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i7, int i8, float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawText(str, i7, i8, f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f5, float f7, float f8, float f9, Paint paint, int i7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayer(f5, f7, f8, f9, paint, i7);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f5, float f7, float f8, float f9, int i7, int i8) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f5, f7, f8, f9, i7, i8);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i7, int i8, int i9, int i10) {
        f fVar = f.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            return fVar.c(canvas, i7, i8, i9, i10);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i7, int i8, float f5, float f7, int i9, int i10, boolean z7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i7, i8, f5, f7, i9, i10, z7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7, BlendMode blendMode) {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.b(canvas, i7, blendMode);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i7, int i8, float f5, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawText(charSequence, i7, i8, f5, f7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        h hVar = h.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            return hVar.b(canvas, path);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f5, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayer(f5, f7, f8, f9, paint);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f5, float f7, float f8, float f9, int i7) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f5, f7, f8, f9, i7);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f5, float f7, float f8, float f9, Region.Op op) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(f5, f7, f8, f9, op);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i7, int i8, int i9, int i10, int i11, int i12, boolean z7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i7, i8, i9, i10, i11, i12, z7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j7, BlendMode blendMode) {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.d(canvas, j7, blendMode);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i7, int i8, int i9, int i10, float f5, float f7, boolean z7, Paint paint) {
        e eVar = e.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            eVar.a(canvas, charSequence, i7, i8, i9, i10, f5, f7, z7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f5, float f7, float f8, float f9, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.quickReject(f5, f7, f8, f9, edgeType);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f5, float f7, float f8, float f9) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(f5, f7, f8, f9);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f5, float f7, float f8, float f9) {
        h hVar = h.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            return hVar.a(canvas, f5, f7, f8, f9);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i7, int i8, int i9, int i10) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(i7, i8, i9, i10);
        }
        kotlin.jvm.internal.l.l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i7, int i8, int i9, int i10, float f5, float f7, boolean z7, Paint paint) {
        g gVar = g.a;
        Canvas canvas = this.a;
        if (canvas != null) {
            gVar.h(canvas, measuredText, i7, i8, i9, i10, f5, f7, z7, paint);
        } else {
            kotlin.jvm.internal.l.l("nativeCanvas");
            throw null;
        }
    }
}
