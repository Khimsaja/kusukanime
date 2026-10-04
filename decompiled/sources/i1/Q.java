package i1;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class Q {
    public static int a(int i7) {
        int iStatusBars;
        int i8 = 0;
        for (int i9 = 1; i9 <= 256; i9 <<= 1) {
            if ((i7 & i9) != 0) {
                if (i9 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i9 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i9 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i9 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i9 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i9 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i9 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i9 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i8 |= iStatusBars;
            }
        }
        return i8;
    }
}
