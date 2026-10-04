package V1;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public interface q {
    n[] a();

    default n[] e(Uri uri, Map map) {
        return a();
    }
}
