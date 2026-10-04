package w3;

import H5.D;
import K5.N;
import K5.Y;
import android.content.Context;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import com.kusukanime.data.CrashLog;
import com.kusukanime.data.UserRepo;

/* loaded from: classes.dex */
public final class y extends O {

    /* renamed from: b, reason: collision with root package name */
    public final Y f17074b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f17075c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f17076d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f17077e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f17078f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f17079g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f17080h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f17081i;

    /* renamed from: j, reason: collision with root package name */
    public final Y f17082j;

    /* renamed from: k, reason: collision with root package name */
    public final Y f17083k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f17084l;

    /* renamed from: m, reason: collision with root package name */
    public final Y f17085m;

    /* renamed from: n, reason: collision with root package name */
    public final Y f17086n;

    /* renamed from: o, reason: collision with root package name */
    public final Y f17087o;

    /* renamed from: p, reason: collision with root package name */
    public final Y f17088p;

    /* renamed from: q, reason: collision with root package name */
    public final Y f17089q;

    /* renamed from: r, reason: collision with root package name */
    public final UserRepo f17090r;

    /* renamed from: s, reason: collision with root package name */
    public Context f17091s;

    public y() {
        Y yB = N.b(null);
        this.f17074b = yB;
        this.f17075c = yB;
        Boolean bool = Boolean.FALSE;
        Y yB2 = N.b(bool);
        this.f17076d = yB2;
        this.f17077e = yB2;
        Y yB3 = N.b(P3.y.f7779k);
        this.f17078f = yB3;
        this.f17079g = yB3;
        Y yB4 = N.b(Boolean.TRUE);
        this.f17080h = yB4;
        this.f17081i = yB4;
        Y yB5 = N.b(null);
        this.f17082j = yB5;
        this.f17083k = yB5;
        Y yB6 = N.b(bool);
        this.f17084l = yB6;
        this.f17085m = yB6;
        Y yB7 = N.b(null);
        this.f17086n = yB7;
        this.f17087o = yB7;
        Y yB8 = N.b(0);
        this.f17088p = yB8;
        this.f17089q = yB8;
        this.f17090r = new UserRepo();
    }

    public final void e() {
        D.x(J.h(this), null, new w(this, null), 3);
        Context context = this.f17091s;
        if (context == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(CrashLog.INSTANCE.list(context).size());
        Y y7 = this.f17088p;
        y7.getClass();
        y7.i(null, numValueOf);
    }
}
