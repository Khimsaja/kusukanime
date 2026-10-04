package g3;

import D6.r;
import P3.q;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import e3.C0819a;
import f6.C0920r;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import z5.AbstractC2510o;

/* renamed from: g3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0946e {
    public static final Bitmap.Config a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0920r f11706b;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap.Config unused = Bitmap.Config.RGBA_F16;
        } else {
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        }
        a = i7 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f11706b = new C0920r((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC2510o.g0(str)) {
            return null;
        }
        String strG0 = AbstractC2510o.G0('#', str, str);
        String strG02 = AbstractC2510o.G0('?', strG0, strG0);
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC2510o.C0('.', AbstractC2510o.C0('/', strG02, strG02), ""));
    }

    public static final boolean c(Uri uri) {
        return kotlin.jvm.internal.l.a(uri.getScheme(), "file") && kotlin.jvm.internal.l.a((String) q.t0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(e3.c cVar, e3.g gVar) {
        if (cVar instanceof C0819a) {
            return ((C0819a) cVar).a;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new r();
    }
}
