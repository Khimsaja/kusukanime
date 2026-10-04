package D;

import G2.C0174k;
import G2.C0177n;
import O.R0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC0690q;
import androidx.media3.exoplayer.ExoPlayer;
import i1.AbstractC1061n;
import i1.AbstractC1067u;
import io.ktor.util.GzipHeaderFlags;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import p.C1720G;
import p.C1723J;
import y.C2315O;

/* loaded from: classes.dex */
public final class z0 implements O.G {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1387c;

    public /* synthetic */ z0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.f1386b = obj;
        this.f1387c = obj2;
    }

    @Override // O.G
    public final void dispose() {
        Object obj = this.f1387c;
        Object obj2 = this.f1386b;
        switch (this.a) {
            case 0:
                O.Z z7 = (O.Z) obj2;
                u.m mVar = (u.m) z7.getValue();
                if (mVar != null) {
                    u.l lVar = new u.l(mVar);
                    u.k kVar = (u.k) obj;
                    if (kVar != null) {
                        kVar.c(lVar);
                    }
                    z7.setValue(null);
                    break;
                }
                break;
            case 1:
                ((C0174k) obj2).f2709r.c((H2.n) obj);
                break;
            case 2:
                Iterator it = ((List) ((R0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((H2.i) obj).b().b((C0174k) it.next());
                }
                break;
            case 3:
                ((C1723J) obj2).a.m((C1720G) obj);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((p.u0) obj2).f14142j.remove((p.u0) obj);
                break;
            case 5:
                p.u0 u0Var = (p.u0) obj2;
                u0Var.getClass();
                p.o0 o0Var = (p.o0) ((p.p0) obj).f14090b.getValue();
                if (o0Var != null) {
                    u0Var.f14141i.remove(o0Var.f14084k);
                    break;
                }
                break;
            case 6:
                ((p.u0) obj2).f14141i.remove((p.s0) obj);
                break;
            case 7:
                Activity activity = (Activity) obj2;
                if (activity != null) {
                    Integer num = (Integer) obj;
                    activity.setRequestedOrientation(num != null ? num.intValue() : -1);
                    break;
                }
                break;
            case 8:
                v.n0 n0Var = (v.n0) obj2;
                int i7 = n0Var.f16489t - 1;
                n0Var.f16489t = i7;
                if (i7 == 0) {
                    Field field = AbstractC1067u.a;
                    View view = (View) obj;
                    AbstractC1061n.b(view, null);
                    AbstractC1067u.c(view, null);
                    view.removeOnAttachStateChangeListener(n0Var.f16490u);
                    break;
                }
                break;
            case 9:
                ((AbstractC0690q) obj2).c((C0177n) obj);
                break;
            case 10:
                ((AbstractC0690q) obj2).c((C0177n) obj);
                break;
            case 11:
                try {
                    ((Context) obj2).unregisterReceiver((x3.d) obj);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                ((C2315O) obj2).f17597c.add(obj);
                break;
            case 13:
                ((H1.G) ((ExoPlayer) obj2)).i1((y3.q) obj);
                break;
            case 14:
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                long jX0 = ((H1.G) exoPlayer).X0();
                if (jX0 > 0) {
                    ((e4.n) obj).invoke(Long.valueOf(((H1.G) exoPlayer).S0()), Long.valueOf(jX0));
                    break;
                }
                break;
            case 15:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((z0.Q) obj);
                break;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((z0.S) obj);
                break;
        }
    }
}
