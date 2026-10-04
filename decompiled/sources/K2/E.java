package K2;

import D.P0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {
    public C0321z a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4462b;

    /* renamed from: c, reason: collision with root package name */
    public long f4463c;

    /* renamed from: d, reason: collision with root package name */
    public long f4464d;

    /* renamed from: e, reason: collision with root package name */
    public long f4465e;

    /* renamed from: f, reason: collision with root package name */
    public long f4466f;

    public static void b(W w7) {
        RecyclerView recyclerView;
        int i7 = w7.f4527i;
        if (w7.e() || (i7 & 4) != 0 || (recyclerView = w7.f4535q) == null) {
            return;
        }
        recyclerView.D(w7);
    }

    public abstract boolean a(W w7, W w8, P0 p02, P0 p03);

    public final void c(W w7) {
        C0321z c0321z = this.a;
        if (c0321z != null) {
            boolean z7 = true;
            w7.m(true);
            if (w7.f4525g != null && w7.f4526h == null) {
                w7.f4525g = null;
            }
            w7.f4526h = null;
            if ((w7.f4527i & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0321z.a;
            recyclerView.Y();
            B2.l lVar = recyclerView.f10856p;
            C0321z c0321z2 = (C0321z) lVar.f416l;
            RecyclerView recyclerView2 = c0321z2.a;
            View view = w7.a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                lVar.S(view);
            } else {
                C0298b c0298b = (C0298b) lVar.f417m;
                if (c0298b.u(iIndexOfChild)) {
                    c0298b.x(iIndexOfChild);
                    lVar.S(view);
                    c0321z2.h(iIndexOfChild);
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                W wF = RecyclerView.F(view);
                N n7 = recyclerView.f10850m;
                n7.l(wF);
                n7.i(wF);
            }
            recyclerView.Z(!z7);
            if (z7 || !w7.i()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(W w7);

    public abstract void e();

    public abstract boolean f();
}
