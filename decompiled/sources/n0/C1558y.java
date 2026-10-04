package n0;

import O.C0486d;
import O.C0493g0;
import O.T;
import h0.C0990m;
import j0.InterfaceC1298d;

/* renamed from: n0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558y extends AbstractC1556w {

    /* renamed from: b, reason: collision with root package name */
    public final C1535b f13212b;

    /* renamed from: c, reason: collision with root package name */
    public String f13213c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13214d;

    /* renamed from: e, reason: collision with root package name */
    public final C1534a f13215e;

    /* renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.m f13216f;

    /* renamed from: g, reason: collision with root package name */
    public final C0493g0 f13217g;

    /* renamed from: h, reason: collision with root package name */
    public C0990m f13218h;

    /* renamed from: i, reason: collision with root package name */
    public final C0493g0 f13219i;

    /* renamed from: j, reason: collision with root package name */
    public long f13220j;

    /* renamed from: k, reason: collision with root package name */
    public float f13221k;

    /* renamed from: l, reason: collision with root package name */
    public float f13222l;

    /* renamed from: m, reason: collision with root package name */
    public final C1557x f13223m;

    public C1558y(C1535b c1535b) {
        this.f13212b = c1535b;
        c1535b.f13136i = new C1557x(this, 0);
        this.f13213c = "";
        this.f13214d = true;
        this.f13215e = new C1534a();
        this.f13216f = C1539f.f13165n;
        T t7 = T.f7049p;
        this.f13217g = C0486d.K(null, t7);
        this.f13219i = C0486d.K(new g0.f(0L), t7);
        this.f13220j = 9205357640488583168L;
        this.f13221k = 1.0f;
        this.f13222l = 1.0f;
        this.f13223m = new C1557x(this, 1);
    }

    @Override // n0.AbstractC1556w
    public final void a(InterfaceC1298d interfaceC1298d) {
        e(interfaceC1298d, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(j0.InterfaceC1298d r36, float r37, h0.C0990m r38) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C1558y.e(j0.d, float, h0.m):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f13213c);
        sb.append("\n\tviewportWidth: ");
        C0493g0 c0493g0 = this.f13219i;
        sb.append(g0.f.d(((g0.f) c0493g0.getValue()).a));
        sb.append("\n\tviewportHeight: ");
        sb.append(g0.f.b(((g0.f) c0493g0.getValue()).a));
        sb.append("\n");
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
