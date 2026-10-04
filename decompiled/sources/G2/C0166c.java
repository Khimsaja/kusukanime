package G2;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import kotlin.Metadata;

@N("activity")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LG2/c;", "LG2/O;", "LG2/a;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0166c extends O {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f2695c;

    public C0166c(Context context) {
        Object next;
        kotlin.jvm.internal.l.f("context", context);
        Iterator it = y5.k.S(C0165b.f2684m, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f2695c = (Activity) next;
    }

    @Override // G2.O
    public final y a() {
        return new C0164a(this);
    }

    @Override // G2.O
    public final y c(y yVar) {
        throw new IllegalStateException(("Destination " + ((C0164a) yVar).f2762p + " does not have an Intent set.").toString());
    }

    @Override // G2.O
    public final boolean f() {
        Activity activity = this.f2695c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
