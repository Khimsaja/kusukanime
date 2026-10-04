package K2;

import android.view.View;
import java.util.List;

/* renamed from: K2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316u {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f4676b;

    /* renamed from: c, reason: collision with root package name */
    public int f4677c;

    /* renamed from: d, reason: collision with root package name */
    public int f4678d;

    /* renamed from: e, reason: collision with root package name */
    public int f4679e;

    /* renamed from: f, reason: collision with root package name */
    public int f4680f;

    /* renamed from: g, reason: collision with root package name */
    public int f4681g;

    /* renamed from: h, reason: collision with root package name */
    public int f4682h;

    /* renamed from: i, reason: collision with root package name */
    public int f4683i;

    /* renamed from: j, reason: collision with root package name */
    public int f4684j;

    /* renamed from: k, reason: collision with root package name */
    public List f4685k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4686l;

    public final void a(View view) {
        int iB;
        int size = this.f4685k.size();
        View view2 = null;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < size; i8++) {
            View view3 = ((W) this.f4685k.get(i8)).a;
            I i9 = (I) view3.getLayoutParams();
            if (view3 != view && !i9.a.g() && (iB = (i9.a.b() - this.f4678d) * this.f4679e) >= 0 && iB < i7) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i7 = iB;
                }
            }
        }
        if (view2 == null) {
            this.f4678d = -1;
        } else {
            this.f4678d = ((I) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(N n7) {
        List list = this.f4685k;
        if (list == null) {
            View view = n7.k(this.f4678d, Long.MAX_VALUE).a;
            this.f4678d += this.f4679e;
            return view;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = ((W) this.f4685k.get(i7)).a;
            I i8 = (I) view2.getLayoutParams();
            if (!i8.a.g() && this.f4678d == i8.a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
