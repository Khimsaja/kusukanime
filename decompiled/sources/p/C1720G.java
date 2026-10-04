package p;

import O.C0486d;
import O.C0493g0;
import O.R0;

/* renamed from: p.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1720G implements R0 {

    /* renamed from: k, reason: collision with root package name */
    public Number f13853k;

    /* renamed from: l, reason: collision with root package name */
    public Number f13854l;

    /* renamed from: m, reason: collision with root package name */
    public final B0 f13855m;

    /* renamed from: n, reason: collision with root package name */
    public final C0493g0 f13856n;

    /* renamed from: o, reason: collision with root package name */
    public n0 f13857o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13858p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13859q;

    /* renamed from: r, reason: collision with root package name */
    public long f13860r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1723J f13861s;

    public C1720G(C1723J c1723j, Number number, Number number2, B0 b02, C1719F c1719f) {
        this.f13861s = c1723j;
        this.f13853k = number;
        this.f13854l = number2;
        this.f13855m = b02;
        this.f13856n = C0486d.K(number, O.T.f7049p);
        this.f13857o = new n0(c1719f, b02, this.f13853k, this.f13854l, null);
    }

    @Override // O.R0
    public final Object getValue() {
        return this.f13856n.getValue();
    }
}
