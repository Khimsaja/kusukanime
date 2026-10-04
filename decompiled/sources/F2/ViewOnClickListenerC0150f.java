package F2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kusukanime.R;

/* renamed from: F2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0150f implements View.OnClickListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2361b;

    public /* synthetic */ ViewOnClickListenerC0150f(int i7, Object obj) {
        this.a = i7;
        this.f2361b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        K2.A adapter;
        int iD;
        switch (this.a) {
            case 0:
                ((C0163t) this.f2361b).k(!r5.v0);
                break;
            case 1:
                C0163t c0163t = ((C0152h) this.f2361b).f2366f;
                y1.L l7 = c0163t.f2447t0;
                if (l7 != null && ((Q4.c) l7).y0(29)) {
                    Q1.j jVarB1 = ((H1.G) c0163t.f2447t0).b1();
                    y1.L l8 = c0163t.f2447t0;
                    jVarB1.getClass();
                    Q1.i iVar = new Q1.i(jVarB1);
                    iVar.a(1);
                    iVar.d(1);
                    ((H1.G) l8).o1(new Q1.j(iVar));
                    c0163t.f2438p.f2377d[1] = c0163t.getResources().getString(R.string.exo_track_selection_auto);
                    c0163t.f2448u.dismiss();
                    break;
                }
                break;
            case 2:
                C0158n c0158n = (C0158n) this.f2361b;
                int i7 = -1;
                if (c0158n.f4536r != null && (recyclerView = c0158n.f4535q) != null && (adapter = recyclerView.getAdapter()) != null && (iD = c0158n.f4535q.D(c0158n)) != -1 && c0158n.f4536r == adapter) {
                    i7 = iD;
                }
                C0163t c0163t2 = c0158n.f2375w;
                View view2 = c0163t2.J;
                if (i7 != 0) {
                    if (i7 != 1) {
                        c0163t2.f2448u.dismiss();
                        break;
                    } else {
                        view2.getClass();
                        c0163t2.d(c0163t2.f2444s, view2);
                        break;
                    }
                } else {
                    view2.getClass();
                    c0163t2.d(c0163t2.f2440q, view2);
                    break;
                }
            case 3:
                C0163t c0163t3 = ((C0152h) this.f2361b).f2366f;
                y1.L l9 = c0163t3.f2447t0;
                if (l9 != null && ((Q4.c) l9).y0(29)) {
                    Q1.j jVarB12 = ((H1.G) c0163t3.f2447t0).b1();
                    y1.L l10 = c0163t3.f2447t0;
                    jVarB12.getClass();
                    Q1.i iVar2 = new Q1.i(jVarB12);
                    iVar2.a(3);
                    iVar2.f17990r = -3;
                    iVar2.c(new String[0]);
                    iVar2.f17989q = false;
                    ((H1.G) l10).o1(new Q1.j(iVar2));
                    c0163t3.f2448u.dismiss();
                    break;
                }
                break;
            default:
                y yVar = (y) this.f2361b;
                yVar.g();
                if (view.getId() != R.id.exo_overflow_show) {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        yVar.f2484r.start();
                        break;
                    }
                } else {
                    yVar.f2483q.start();
                    break;
                }
                break;
        }
    }
}
