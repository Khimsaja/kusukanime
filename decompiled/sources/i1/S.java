package i1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: b, reason: collision with root package name */
    public static final S f11964b;
    public final P a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f11964b = O.f11962q;
        } else {
            f11964b = P.f11963b;
        }
    }

    public S(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.a = new O(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.a = new M(this, windowInsets);
        } else if (i7 >= 28) {
            this.a = new C1047L(this, windowInsets);
        } else {
            this.a = new C1046K(this, windowInsets);
        }
    }

    public static S b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        S s7 = new S(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = AbstractC1067u.a;
            S sA = AbstractC1062o.a(view);
            P p7 = s7.a;
            p7.q(sA);
            p7.d(view.getRootView());
        }
        return s7;
    }

    public final WindowInsets a() {
        P p7 = this.a;
        if (p7 instanceof AbstractC1045J) {
            return ((AbstractC1045J) p7).f11953c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return Objects.equals(this.a, ((S) obj).a);
    }

    public final int hashCode() {
        P p7 = this.a;
        if (p7 == null) {
            return 0;
        }
        return p7.hashCode();
    }

    public S() {
        this.a = new P(this);
    }
}
