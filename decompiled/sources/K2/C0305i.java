package K2;

import D.P0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: K2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305i extends E {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f4605s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4606g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4607h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f4608i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f4609j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f4610k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f4611l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4612m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4613n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4614o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f4615p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f4616q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f4617r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((W) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // K2.E
    public final boolean a(W w7, W w8, P0 p02, P0 p03) {
        int i7;
        int i8;
        int i9 = p02.a;
        int i10 = p02.f1093b;
        if (w8.n()) {
            int i11 = p02.a;
            i8 = p02.f1093b;
            i7 = i11;
        } else {
            i7 = p03.a;
            i8 = p03.f1093b;
        }
        if (w7 == w8) {
            return g(w7, i9, i10, i7, i8);
        }
        View view = w7.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(w7);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(w8);
        float f5 = -((int) ((i7 - i9) - translationX));
        View view2 = w8.a;
        view2.setTranslationX(f5);
        view2.setTranslationY(-((int) ((i8 - i10) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f4610k;
        C0303g c0303g = new C0303g();
        c0303g.a = w7;
        c0303g.f4596b = w8;
        c0303g.f4597c = i9;
        c0303g.f4598d = i10;
        c0303g.f4599e = i7;
        c0303g.f4600f = i8;
        arrayList.add(c0303g);
        return true;
    }

    @Override // K2.E
    public final void d(W w7) {
        View view = w7.a;
        view.animate().cancel();
        ArrayList arrayList = this.f4609j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0304h) arrayList.get(size)).a == w7) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(w7);
                arrayList.remove(size);
            }
        }
        j(this.f4610k, w7);
        if (this.f4607h.remove(w7)) {
            view.setAlpha(1.0f);
            c(w7);
        }
        if (this.f4608i.remove(w7)) {
            view.setAlpha(1.0f);
            c(w7);
        }
        ArrayList arrayList2 = this.f4613n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, w7);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f4612m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0304h) arrayList5.get(size4)).a == w7) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(w7);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f4611l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(w7)) {
                view.setAlpha(1.0f);
                c(w7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f4616q.remove(w7);
        this.f4614o.remove(w7);
        this.f4617r.remove(w7);
        this.f4615p.remove(w7);
        i();
    }

    @Override // K2.E
    public final void e() {
        ArrayList arrayList = this.f4609j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0304h c0304h = (C0304h) arrayList.get(size);
            View view = c0304h.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0304h.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f4607h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((W) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f4608i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            W w7 = (W) arrayList3.get(size3);
            w7.a.setAlpha(1.0f);
            c(w7);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f4610k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0303g c0303g = (C0303g) arrayList4.get(size4);
            W w8 = c0303g.a;
            if (w8 != null) {
                k(c0303g, w8);
            }
            W w9 = c0303g.f4596b;
            if (w9 != null) {
                k(c0303g, w9);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f4612m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0304h c0304h2 = (C0304h) arrayList6.get(size6);
                    View view2 = c0304h2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0304h2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f4611l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    W w10 = (W) arrayList8.get(size8);
                    w10.a.setAlpha(1.0f);
                    c(w10);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f4613n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0303g c0303g2 = (C0303g) arrayList10.get(size10);
                    W w11 = c0303g2.a;
                    if (w11 != null) {
                        k(c0303g2, w11);
                    }
                    W w12 = c0303g2.f4596b;
                    if (w12 != null) {
                        k(c0303g2, w12);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f4616q);
            h(this.f4615p);
            h(this.f4614o);
            h(this.f4617r);
            ArrayList arrayList11 = this.f4462b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // K2.E
    public final boolean f() {
        return (this.f4608i.isEmpty() && this.f4610k.isEmpty() && this.f4609j.isEmpty() && this.f4607h.isEmpty() && this.f4615p.isEmpty() && this.f4616q.isEmpty() && this.f4614o.isEmpty() && this.f4617r.isEmpty() && this.f4612m.isEmpty() && this.f4611l.isEmpty() && this.f4613n.isEmpty()) ? false : true;
    }

    public final boolean g(W w7, int i7, int i8, int i9, int i10) {
        View view = w7.a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) w7.a.getTranslationY());
        l(w7);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            c(w7);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        ArrayList arrayList = this.f4609j;
        C0304h c0304h = new C0304h();
        c0304h.a = w7;
        c0304h.f4601b = translationX;
        c0304h.f4602c = translationY;
        c0304h.f4603d = i9;
        c0304h.f4604e = i10;
        arrayList.add(c0304h);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f4462b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, W w7) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0303g c0303g = (C0303g) arrayList.get(size);
            if (k(c0303g, w7) && c0303g.a == null && c0303g.f4596b == null) {
                arrayList.remove(c0303g);
            }
        }
    }

    public final boolean k(C0303g c0303g, W w7) {
        if (c0303g.f4596b == w7) {
            c0303g.f4596b = null;
        } else {
            if (c0303g.a != w7) {
                return false;
            }
            c0303g.a = null;
        }
        w7.a.setAlpha(1.0f);
        View view = w7.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(w7);
        return true;
    }

    public final void l(W w7) {
        if (f4605s == null) {
            f4605s = new ValueAnimator().getInterpolator();
        }
        w7.a.animate().setInterpolator(f4605s);
        d(w7);
    }
}
