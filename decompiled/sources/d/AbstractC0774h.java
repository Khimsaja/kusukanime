package d;

import O.C0510p;
import O.C0525y;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.y;
import com.kusukanime.R;
import f6.AbstractC0905c;

/* renamed from: d.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0774h {
    public static final C0525y a = new C0525y(C0769c.f11175o);

    public static y a(C0510p c0510p) {
        y yVar = (y) c0510p.k(a);
        Object obj = null;
        if (yVar == null) {
            c0510p.R(544166745);
            View view = (View) c0510p.k(AndroidCompositionLocals_androidKt.f10673f);
            kotlin.jvm.internal.l.f("<this>", view);
            while (true) {
                if (view == null) {
                    yVar = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                y yVar2 = tag instanceof y ? (y) tag : null;
                if (yVar2 != null) {
                    yVar = yVar2;
                    break;
                }
                Object objQ = AbstractC0905c.q(view);
                view = objQ instanceof View ? (View) objQ : null;
            }
            c0510p.p(false);
        } else {
            c0510p.R(544164296);
            c0510p.p(false);
        }
        if (yVar != null) {
            c0510p.R(544164377);
            c0510p.p(false);
            return yVar;
        }
        c0510p.R(544168748);
        Context baseContext = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof y) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        y yVar3 = (y) obj;
        c0510p.p(false);
        return yVar3;
    }
}
