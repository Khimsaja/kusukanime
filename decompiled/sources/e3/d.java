package e3;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d implements i {
    public final Context a;

    public d(Context context) {
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return l.a(this.a, ((d) obj).a);
        }
        return false;
    }

    @Override // e3.i
    public final Object h(S2.j jVar) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        C0819a c0819a = new C0819a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(c0819a, c0819a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
