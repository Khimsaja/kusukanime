package v3;

import H5.D;
import K5.N;
import K5.Y;
import android.content.Context;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class z extends O {

    /* renamed from: b, reason: collision with root package name */
    public final Y f16614b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f16615c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f16616d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f16617e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f16618f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f16619g;

    /* renamed from: h, reason: collision with root package name */
    public int f16620h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16621i;

    /* renamed from: j, reason: collision with root package name */
    public Context f16622j;

    /* renamed from: k, reason: collision with root package name */
    public final Y f16623k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f16624l;

    /* renamed from: m, reason: collision with root package name */
    public final Y f16625m;

    /* renamed from: n, reason: collision with root package name */
    public final Y f16626n;

    /* renamed from: o, reason: collision with root package name */
    public final Y f16627o;

    /* renamed from: p, reason: collision with root package name */
    public final Y f16628p;

    /* renamed from: q, reason: collision with root package name */
    public final Y f16629q;

    /* renamed from: r, reason: collision with root package name */
    public final Y f16630r;

    /* renamed from: s, reason: collision with root package name */
    public final Y f16631s;

    /* renamed from: t, reason: collision with root package name */
    public final Y f16632t;

    /* renamed from: u, reason: collision with root package name */
    public final Y f16633u;

    /* renamed from: v, reason: collision with root package name */
    public final Y f16634v;

    /* renamed from: w, reason: collision with root package name */
    public final Y f16635w;

    /* renamed from: x, reason: collision with root package name */
    public final Y f16636x;

    public z() {
        P3.y yVar = P3.y.f7779k;
        Y yB = N.b(yVar);
        this.f16614b = yB;
        this.f16615c = yB;
        Y yB2 = N.b(Boolean.FALSE);
        this.f16616d = yB2;
        this.f16617e = yB2;
        Y yB3 = N.b(null);
        this.f16618f = yB3;
        this.f16619g = yB3;
        this.f16620h = 1;
        Y yB4 = N.b(yVar);
        this.f16623k = yB4;
        this.f16624l = yB4;
        Y yB5 = N.b(yVar);
        this.f16625m = yB5;
        this.f16626n = yB5;
        Y yB6 = N.b(yVar);
        this.f16627o = yB6;
        this.f16628p = yB6;
        Y yB7 = N.b(yVar);
        this.f16629q = yB7;
        this.f16630r = yB7;
        Y yB8 = N.b(yVar);
        this.f16631s = yB8;
        this.f16632t = yB8;
        Y yB9 = N.b(null);
        this.f16633u = yB9;
        this.f16634v = yB9;
        Y yB10 = N.b("Selamat malam");
        this.f16635w = yB10;
        this.f16636x = yB10;
    }

    public final void e() {
        Context context = this.f16622j;
        if (context == null || ((Boolean) this.f16616d.getValue()).booleanValue() || this.f16621i) {
            return;
        }
        D.x(J.h(this), null, new s(null, context, this), 3);
    }

    public final void f() {
        D.x(J.h(this), null, new u(this, null), 3);
    }

    public final void g() {
        int i7 = Calendar.getInstance().get(11);
        String str = (4 > i7 || i7 >= 11) ? (11 > i7 || i7 >= 15) ? (15 > i7 || i7 >= 19) ? "Selamat malam" : "Selamat sore" : "Selamat siang" : "Selamat pagi";
        Y y7 = this.f16635w;
        y7.getClass();
        y7.i(null, str);
    }
}
