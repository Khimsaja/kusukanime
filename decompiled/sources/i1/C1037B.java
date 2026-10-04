package i1;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import d1.C0782a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import v.n0;

/* renamed from: i1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1037B extends WindowInsetsAnimation$Callback {
    public final v.P a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f11936b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11937c;

    public C1037B(v.P p7) {
        super(p7.f16402l);
        this.f11937c = new HashMap();
        this.a = p7;
    }

    public final C1040E a(WindowInsetsAnimation windowInsetsAnimation) {
        C1040E c1040e = (C1040E) this.f11937c.get(windowInsetsAnimation);
        if (c1040e == null) {
            c1040e = new C1040E(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c1040e.a = new C1038C(windowInsetsAnimation);
            }
            this.f11937c.put(windowInsetsAnimation, c1040e);
        }
        return c1040e;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.f11937c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        v.P p7 = this.a;
        a(windowInsetsAnimation);
        p7.f16404n = true;
        p7.f16405o = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f11936b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f11936b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationL = B1.u.l(list.get(size));
            C1040E c1040eA = a(windowInsetsAnimationL);
            c1040eA.a.c(windowInsetsAnimationL.getFraction());
            this.f11936b.add(c1040eA);
        }
        v.P p7 = this.a;
        S sB = S.b(null, windowInsets);
        n0 n0Var = p7.f16403m;
        n0.a(n0Var, sB);
        if (n0Var.f16488s) {
            sB = S.f11964b;
        }
        return sB.a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        v.P p7 = this.a;
        a(windowInsetsAnimation);
        C0782a c0782aC = C0782a.c(bounds.getLowerBound());
        C0782a c0782aC2 = C0782a.c(bounds.getUpperBound());
        p7.f16404n = false;
        B1.u.B();
        return B1.u.j(c0782aC.d(), c0782aC2.d());
    }
}
