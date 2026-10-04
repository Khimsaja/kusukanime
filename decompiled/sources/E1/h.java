package E1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import y1.InterfaceC2385g;

/* loaded from: classes.dex */
public interface h extends InterfaceC2385g {
    void close();

    default Map d() {
        return Collections.EMPTY_MAP;
    }

    long g(k kVar);

    Uri getUri();

    void j(D d4);
}
