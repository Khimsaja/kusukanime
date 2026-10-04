package F2;

import K2.W;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kusukanime.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: F2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152h extends K2.A {

    /* renamed from: c, reason: collision with root package name */
    public List f2363c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0163t f2364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0163t f2366f;

    public C0152h(C0163t c0163t, int i7) {
        this.f2365e = i7;
        this.f2366f = c0163t;
        this.f2364d = c0163t;
    }

    @Override // K2.A
    public final int a() {
        if (this.f2363c.isEmpty()) {
            return 0;
        }
        return this.f2363c.size() + 1;
    }

    @Override // K2.A
    public /* bridge */ /* synthetic */ void b(W w7, int i7) {
        switch (this.f2365e) {
            case 1:
                f((C0160p) w7, i7);
                break;
            default:
                f((C0160p) w7, i7);
                break;
        }
    }

    @Override // K2.A
    public final W c(ViewGroup viewGroup) {
        return new C0160p(LayoutInflater.from(this.f2364d.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean d(Q1.j jVar) {
        for (int i7 = 0; i7 < this.f2363c.size(); i7++) {
            if (jVar.f18010s.containsKey(((C0161q) this.f2363c.get(i7)).a.f18012b)) {
                return true;
            }
        }
        return false;
    }

    public void e(List list) {
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                break;
            }
            C0161q c0161q = (C0161q) list.get(i7);
            if (c0161q.a.f18015e[c0161q.f2382b]) {
                z7 = true;
                break;
            }
            i7++;
        }
        C0163t c0163t = this.f2366f;
        ImageView imageView = c0163t.f2399G;
        if (imageView != null) {
            imageView.setImageDrawable(z7 ? c0163t.f2431l0 : c0163t.f2433m0);
            c0163t.f2399G.setContentDescription(z7 ? c0163t.f2435n0 : c0163t.f2437o0);
        }
        this.f2363c = list;
    }

    public void f(C0160p c0160p, int i7) {
        switch (this.f2365e) {
            case 1:
                g(c0160p, i7);
                if (i7 > 0) {
                    C0161q c0161q = (C0161q) this.f2363c.get(i7 - 1);
                    c0160p.f2381u.setVisibility(c0161q.a.f18015e[c0161q.f2382b] ? 0 : 4);
                    break;
                }
                break;
            default:
                g(c0160p, i7);
                break;
        }
    }

    public final void g(C0160p c0160p, int i7) {
        final y1.L l7 = this.f2364d.f2447t0;
        if (l7 == null) {
        }
        if (i7 != 0) {
            final C0161q c0161q = (C0161q) this.f2363c.get(i7 - 1);
            final y1.Q q6 = c0161q.a.f18012b;
            boolean z7 = ((H1.G) l7).b1().f18010s.get(q6) != null && c0161q.a.f18015e[c0161q.f2382b];
            c0160p.f2380t.setText(c0161q.f2383c);
            c0160p.f2381u.setVisibility(z7 ? 0 : 4);
            c0160p.a.setOnClickListener(new View.OnClickListener() { // from class: F2.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0152h c0152h = this.a;
                    c0152h.getClass();
                    Q4.c cVar = (Q4.c) l7;
                    if (cVar.y0(29)) {
                        H1.G g4 = (H1.G) cVar;
                        Q1.j jVarB1 = g4.b1();
                        jVarB1.getClass();
                        Q1.i iVar = new Q1.i(jVarB1);
                        C0161q c0161q2 = c0161q;
                        y1.S s7 = new y1.S(q6, j3.G.w(Integer.valueOf(c0161q2.f2382b)));
                        y1.Q q7 = s7.a;
                        iVar.a(q7.f17970c);
                        iVar.f17991s.put(q7, s7);
                        iVar.d(c0161q2.a.f18012b.f17970c);
                        g4.o1(new Q1.j(iVar));
                        String str = c0161q2.f2383c;
                        switch (c0152h.f2365e) {
                            case 0:
                                c0152h.f2366f.f2438p.f2377d[1] = str;
                                break;
                        }
                        c0152h.f2364d.f2448u.dismiss();
                    }
                }
            });
            return;
        }
        switch (this.f2365e) {
            case 0:
                c0160p.f2380t.setText(R.string.exo_track_selection_auto);
                y1.L l8 = this.f2366f.f2447t0;
                l8.getClass();
                c0160p.f2381u.setVisibility(d(((H1.G) l8).b1()) ? 4 : 0);
                c0160p.a.setOnClickListener(new ViewOnClickListenerC0150f(1, this));
                break;
            default:
                c0160p.f2380t.setText(R.string.exo_track_selection_none);
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i9 < this.f2363c.size()) {
                        C0161q c0161q2 = (C0161q) this.f2363c.get(i9);
                        if (c0161q2.a.f18015e[c0161q2.f2382b]) {
                            i8 = 4;
                        } else {
                            i9++;
                        }
                    }
                }
                c0160p.f2381u.setVisibility(i8);
                c0160p.a.setOnClickListener(new ViewOnClickListenerC0150f(3, this));
                break;
        }
    }

    private final void h(String str) {
    }
}
