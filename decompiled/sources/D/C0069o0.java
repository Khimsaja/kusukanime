package D;

import B1.C0017d;
import H0.C0214f;
import java.util.List;

/* renamed from: D.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069o0 {
    public final C0214f a;

    /* renamed from: b, reason: collision with root package name */
    public final H0.I f1254b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1255c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1256d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1257e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1258f;

    /* renamed from: g, reason: collision with root package name */
    public final T0.b f1259g;

    /* renamed from: h, reason: collision with root package name */
    public final M0.i f1260h;

    /* renamed from: i, reason: collision with root package name */
    public final List f1261i;

    /* renamed from: j, reason: collision with root package name */
    public C0017d f1262j;

    /* renamed from: k, reason: collision with root package name */
    public T0.k f1263k;

    public C0069o0(C0214f c0214f, H0.I i7, boolean z7, T0.b bVar, M0.i iVar, int i8) {
        P3.y yVar = P3.y.f7779k;
        this.a = c0214f;
        this.f1254b = i7;
        this.f1255c = Integer.MAX_VALUE;
        this.f1256d = 1;
        this.f1257e = z7;
        this.f1258f = 1;
        this.f1259g = bVar;
        this.f1260h = iVar;
        this.f1261i = yVar;
    }

    public final void a(T0.k kVar) {
        C0017d c0017d = this.f1262j;
        if (c0017d == null || kVar != this.f1263k || c0017d.b()) {
            this.f1263k = kVar;
            c0017d = new C0017d(this.a, n6.d.X(this.f1254b, kVar), this.f1261i, this.f1259g, this.f1260h);
        }
        this.f1262j = c0017d;
    }
}
