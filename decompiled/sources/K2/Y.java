package K2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import i1.C1049b;
import j1.C1303d;

/* loaded from: classes.dex */
public final class Y extends C1049b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f4539d;

    /* renamed from: e, reason: collision with root package name */
    public final X f4540e;

    public Y(RecyclerView recyclerView) {
        this.f4539d = recyclerView;
        X x7 = this.f4540e;
        if (x7 != null) {
            this.f4540e = x7;
        } else {
            this.f4540e = new X(this);
        }
    }

    @Override // i1.C1049b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f4539d.H()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O(accessibilityEvent);
        }
    }

    @Override // i1.C1049b
    public final void d(View view, C1303d c1303d) {
        this.a.onInitializeAccessibilityNodeInfo(view, c1303d.a);
        RecyclerView recyclerView = this.f4539d;
        if (recyclerView.H() || recyclerView.getLayoutManager() == null) {
            return;
        }
        H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f4471b;
        layoutManager.P(recyclerView2.f10850m, recyclerView2.f10853n0, c1303d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[PHI: r7
      0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // i1.C1049b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r6 = super.g(r6, r7, r8)
            r8 = 1
            if (r6 == 0) goto L8
            return r8
        L8:
            androidx.recyclerview.widget.RecyclerView r6 = r5.f4539d
            boolean r0 = r6.H()
            r1 = 0
            if (r0 != 0) goto Lae
            K2.H r0 = r6.getLayoutManager()
            if (r0 == 0) goto Lae
            K2.H r6 = r6.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r6.f4471b
            K2.N r0 = r0.f10850m
            int r0 = r6.f4483n
            int r2 = r6.f4482m
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r4 = r6.f4471b
            android.graphics.Matrix r4 = r4.getMatrix()
            boolean r4 = r4.isIdentity()
            if (r4 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r4 = r6.f4471b
            boolean r4 = r4.getGlobalVisibleRect(r3)
            if (r4 == 0) goto L44
            int r0 = r3.height()
            int r2 = r3.width()
        L44:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r7 == r3) goto L7b
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r7 == r3) goto L4f
            r7 = r1
            r0 = r7
            goto La3
        L4f:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f4471b
            r3 = -1
            boolean r7 = r7.canScrollVertically(r3)
            if (r7 == 0) goto L64
            int r7 = r6.B()
            int r0 = r0 - r7
            int r7 = r6.y()
            int r0 = r0 - r7
            int r7 = -r0
            goto L65
        L64:
            r7 = r1
        L65:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f4471b
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L79
            int r0 = r6.z()
            int r2 = r2 - r0
            int r0 = r6.A()
            int r2 = r2 - r0
            int r0 = -r2
            goto La3
        L79:
            r0 = r1
            goto La3
        L7b:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f4471b
            boolean r7 = r7.canScrollVertically(r8)
            if (r7 == 0) goto L8f
            int r7 = r6.B()
            int r0 = r0 - r7
            int r7 = r6.y()
            int r0 = r0 - r7
            r7 = r0
            goto L90
        L8f:
            r7 = r1
        L90:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f4471b
            boolean r0 = r0.canScrollHorizontally(r8)
            if (r0 == 0) goto L79
            int r0 = r6.z()
            int r2 = r2 - r0
            int r0 = r6.A()
            int r0 = r2 - r0
        La3:
            if (r7 != 0) goto La8
            if (r0 != 0) goto La8
            goto Lae
        La8:
            androidx.recyclerview.widget.RecyclerView r6 = r6.f4471b
            r6.X(r0, r7, r8)
            return r8
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.Y.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
