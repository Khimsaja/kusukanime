package i1;

import android.view.View;
import android.view.WindowInsets;
import d1.C0782a;

/* loaded from: classes.dex */
public final class O extends M {

    /* renamed from: q, reason: collision with root package name */
    public static final S f11962q = S.b(null, WindowInsets.CONSUMED);

    public O(S s7, WindowInsets windowInsets) {
        super(s7, windowInsets);
    }

    @Override // i1.AbstractC1045J, i1.P
    public C0782a f(int i7) {
        return C0782a.c(this.f11953c.getInsets(Q.a(i7)));
    }

    @Override // i1.AbstractC1045J, i1.P
    public C0782a g(int i7) {
        return C0782a.c(this.f11953c.getInsetsIgnoringVisibility(Q.a(i7)));
    }

    @Override // i1.AbstractC1045J, i1.P
    public boolean o(int i7) {
        return this.f11953c.isVisible(Q.a(i7));
    }

    @Override // i1.AbstractC1045J, i1.P
    public final void d(View view) {
    }
}
