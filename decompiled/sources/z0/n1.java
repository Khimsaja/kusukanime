package z0;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.kusukanime.R;
import f4.InterfaceC0881a;
import f4.InterfaceC0886f;
import java.util.Set;

/* loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18814l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o1 f18815m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W.a f18816n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(o1 o1Var, W.a aVar, int i7) {
        super(2);
        this.f18814l = i7;
        this.f18815m = o1Var;
        this.f18816n = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18814l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    AndroidCompositionLocals_androidKt.a(this.f18815m.f18818k, this.f18816n, c0510p, 0);
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    o1 o1Var = this.f18815m;
                    Object tag = o1Var.f18818k.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof InterfaceC0881a) || (tag instanceof InterfaceC0886f)) ? (Set) tag : null;
                    C2471u c2471u = o1Var.f18818k;
                    if (set == null) {
                        Object parent = c2471u.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC0881a) && !(tag2 instanceof InterfaceC0886f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0510p2.f7130c);
                        c0510p2.f7143p = true;
                        c0510p2.f7116B = true;
                        c0510p2.f7130c.h();
                        c0510p2.f7121G.h();
                        O.D0 d02 = c0510p2.f7122H;
                        O.B0 b02 = d02.a;
                        d02.f6970e = b02.f6954s;
                        d02.f6971f = b02.f6955t;
                    }
                    boolean zH = c0510p2.h(o1Var);
                    Object objH = c0510p2.H();
                    O.T t7 = C0502l.a;
                    if (zH || objH == t7) {
                        objH = new l1(o1Var, null);
                        c0510p2.b0(objH);
                    }
                    C0486d.e(c0510p2, (e4.n) objH, c2471u);
                    boolean zH2 = c0510p2.h(o1Var);
                    Object objH2 = c0510p2.H();
                    if (zH2 || objH2 == t7) {
                        objH2 = new m1(o1Var, null);
                        c0510p2.b0(objH2);
                    }
                    C0486d.e(c0510p2, (e4.n) objH2, c2471u);
                    C0486d.a(Z.b.a.a(set), W.f.b(-1193460702, new n1(o1Var, this.f18816n, 0), c0510p2), c0510p2, 56);
                }
                break;
        }
        return O3.C.a;
    }
}
