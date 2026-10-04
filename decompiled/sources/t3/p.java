package t3;

import H5.D;
import K5.N;
import K5.Y;
import P3.y;
import android.content.Context;
import androidx.lifecycle.J;
import androidx.lifecycle.O;

/* loaded from: classes.dex */
public final class p extends O {

    /* renamed from: b, reason: collision with root package name */
    public final Y f16022b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f16023c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f16024d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f16025e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f16026f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f16027g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f16028h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f16029i;

    /* renamed from: j, reason: collision with root package name */
    public Context f16030j;

    /* renamed from: k, reason: collision with root package name */
    public int f16031k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16032l;

    /* renamed from: m, reason: collision with root package name */
    public String f16033m;

    public p() {
        y yVar = y.f7779k;
        Y yB = N.b(yVar);
        this.f16022b = yB;
        this.f16023c = yB;
        Y yB2 = N.b(yVar);
        this.f16024d = yB2;
        this.f16025e = yB2;
        Y yB3 = N.b(Boolean.TRUE);
        this.f16026f = yB3;
        this.f16027g = yB3;
        Y yB4 = N.b(Boolean.FALSE);
        this.f16028h = yB4;
        this.f16029i = yB4;
        this.f16031k = 1;
    }

    public final void e() {
        String str;
        Context context = this.f16030j;
        if (context == null || (str = this.f16033m) == null || ((Boolean) this.f16028h.getValue()).booleanValue() || this.f16032l) {
            return;
        }
        D.x(J.h(this), null, new o(this, context, str, null), 3);
    }

    public final void f(String str) {
        kotlin.jvm.internal.l.f("slug", str);
        this.f16033m = str;
        this.f16031k = 1;
        this.f16032l = false;
        y yVar = y.f7779k;
        Y y7 = this.f16024d;
        y7.getClass();
        y7.i(null, yVar);
        e();
    }
}
