package G2;

import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class I {
    public final G a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2670b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2671c;

    /* renamed from: d, reason: collision with root package name */
    public int f2672d;

    /* renamed from: e, reason: collision with root package name */
    public String f2673e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2674f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2675g;

    public I() {
        G g4 = new G();
        g4.a = -1;
        g4.f2661e = -1;
        g4.f2662f = -1;
        this.a = g4;
        this.f2672d = -1;
    }

    public final void a(String str, e4.k kVar) {
        kotlin.jvm.internal.l.f("popUpToBuilder", kVar);
        if (AbstractC2510o.g0(str)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f2673e = str;
        this.f2672d = -1;
        this.f2674f = false;
        Q q6 = new Q();
        kVar.invoke(q6);
        this.f2674f = q6.a;
        this.f2675g = q6.f2683b;
    }
}
