package A1;

import B1.K;
import android.os.Bundle;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class d {
    public static final String a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f88b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f89c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f90d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f91e;

    static {
        int i7 = K.a;
        a = Integer.toString(0, 36);
        f88b = Integer.toString(1, 36);
        f89c = Integer.toString(2, 36);
        f90d = Integer.toString(3, 36);
        f91e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(f88b, spanned.getSpanEnd(obj));
        bundle2.putInt(f89c, spanned.getSpanFlags(obj));
        bundle2.putInt(f90d, i7);
        if (bundle != null) {
            bundle2.putBundle(f91e, bundle);
        }
        return bundle2;
    }
}
