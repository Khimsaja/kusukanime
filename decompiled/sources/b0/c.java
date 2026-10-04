package b0;

import android.view.ViewStructure;

/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    public final int a(ViewStructure viewStructure, int i7) {
        return viewStructure.addChildCount(i7);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i7) {
        return viewStructure.newChild(i7);
    }

    public final void c(ViewStructure viewStructure, int i7, int i8, int i9, int i10, int i11, int i12) {
        viewStructure.setDimens(i7, i8, i9, i10, i11, i12);
    }

    public final void d(ViewStructure viewStructure, int i7, String str, String str2, String str3) {
        viewStructure.setId(i7, str, str2, str3);
    }
}
