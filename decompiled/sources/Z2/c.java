package Z2;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import d3.C0801m;
import g3.AbstractC0946e;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements b {
    @Override // Z2.b
    public final String a(Object obj, C0801m c0801m) {
        Uri uri = (Uri) obj;
        if (!l.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = c0801m.a.getResources().getConfiguration();
        Bitmap.Config config = AbstractC0946e.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
