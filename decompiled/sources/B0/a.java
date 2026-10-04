package B0;

import D.F;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import g0.d;
import kotlin.jvm.internal.l;
import r0.C1861b;

/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        b bVar = this.a;
        bVar.getClass();
        l.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            F f5 = (F) bVar.f277m;
            if (f5 != null) {
                f5.invoke();
            }
        } else if (itemId == 1) {
            F f7 = (F) bVar.f278n;
            if (f7 != null) {
                f7.invoke();
            }
        } else if (itemId == 2) {
            F f8 = (F) bVar.f279o;
            if (f8 != null) {
                f8.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            F f9 = (F) bVar.f280p;
            if (f9 != null) {
                f9.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        b bVar = this.a;
        bVar.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((F) bVar.f277m) != null) {
            b.d(1, menu);
        }
        if (((F) bVar.f278n) != null) {
            b.d(2, menu);
        }
        if (((F) bVar.f279o) != null) {
            b.d(3, menu);
        }
        if (((F) bVar.f280p) != null) {
            b.d(4, menu);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((C1861b) this.a.f275k).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        d dVar = (d) this.a.f276l;
        if (rect != null) {
            rect.set((int) dVar.a, (int) dVar.f11659b, (int) dVar.f11660c, (int) dVar.f11661d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        b bVar = this.a;
        bVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        b.e(menu, 1, (F) bVar.f277m);
        b.e(menu, 2, (F) bVar.f278n);
        b.e(menu, 3, (F) bVar.f279o);
        b.e(menu, 4, (F) bVar.f280p);
        return true;
    }
}
