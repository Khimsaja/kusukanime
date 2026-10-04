package C0;

import android.os.Bundle;
import android.view.ViewStructure;

/* loaded from: classes.dex */
public abstract class j {
    public static Bundle a(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    public static void b(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void c(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void d(ViewStructure viewStructure, int i7, int i8, int i9, int i10, int i11, int i12) {
        viewStructure.setDimens(i7, i8, i9, i10, i11, i12);
    }

    public static void e(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void f(ViewStructure viewStructure, float f5, int i7, int i8, int i9) {
        viewStructure.setTextStyle(f5, i7, i8, i9);
    }
}
