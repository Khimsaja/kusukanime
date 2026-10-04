package N0;

import F.E;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class n extends m {
    @Override // N0.m, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.commitContent(inputContentInfo, i7, bundle);
        }
        return false;
    }
}
