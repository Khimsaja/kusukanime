package z0;

import android.view.View;
import android.view.ViewStructure;

/* loaded from: classes.dex */
public final class G {
    public static final G a = new G();

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
