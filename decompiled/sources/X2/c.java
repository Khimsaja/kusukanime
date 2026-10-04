package X2;

import U2.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import d3.C0801m;
import f.AbstractC0841b;
import g3.AbstractC0946e;
import java.nio.ByteBuffer;
import w6.C2224i;

/* loaded from: classes.dex */
public final class c implements g {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final C0801m f9805b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9806c;

    public /* synthetic */ c(Object obj, C0801m c0801m, int i7) {
        this.a = i7;
        this.f9806c = obj;
        this.f9805b = c0801m;
    }

    @Override // X2.g
    public final Object a(S3.c cVar) {
        C0801m c0801m = this.f9805b;
        Object obj = this.f9806c;
        switch (this.a) {
            case 0:
                return new d(new BitmapDrawable(c0801m.a.getResources(), (Bitmap) obj), false, U2.e.f9205l);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C2224i c2224i = new C2224i();
                    c2224i.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = c0801m.a;
                    return new m(new o(c2224i, null), null, U2.e.f9205l);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config config = AbstractC0946e.a;
                boolean z7 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof P2.a);
                if (z7) {
                    bitmapDrawable = new BitmapDrawable(c0801m.a.getResources(), AbstractC0841b.h(bitmapDrawable, c0801m.f11301b, c0801m.f11303d, c0801m.f11304e, c0801m.f11305f));
                }
                return new d(bitmapDrawable, z7, U2.e.f9205l);
        }
    }
}
