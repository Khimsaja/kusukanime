package X2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d3.C0801m;
import g3.AbstractC0946e;
import io.ktor.util.GzipHeaderFlags;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements f {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    @Override // X2.f
    public final g a(Object obj, C0801m c0801m) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (AbstractC0946e.c(uri)) {
                    return new b(uri, c0801m, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, c0801m, 0);
            case 2:
                return new c((ByteBuffer) obj, c0801m, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (kotlin.jvm.internal.l.a(uri2.getScheme(), "content")) {
                    return new b(uri2, c0801m, 1);
                }
                return null;
            case GzipHeaderFlags.EXTRA /* 4 */:
                return new c((Drawable) obj, c0801m, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (kotlin.jvm.internal.l.a(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, c0801m, 2);
                }
                return null;
        }
    }
}
