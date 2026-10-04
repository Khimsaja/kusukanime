package j1;

import X4.y;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1304e extends AccessibilityNodeProvider {
    public final y a;

    public C1304e(y yVar) {
        this.a = yVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        C1303d c1303dS = this.a.s(i7);
        if (c1303dS == null) {
            return null;
        }
        return c1303dS.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        C1303d c1303dV = this.a.v();
        if (c1303dV == null) {
            return null;
        }
        return c1303dV.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i8, Bundle bundle) {
        return this.a.C(i7, i8, bundle);
    }
}
