package x;

import P3.F;
import java.util.List;
import l4.AbstractC1420H;
import w0.S;
import y.InterfaceC2344y;

/* renamed from: x.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2240n implements InterfaceC2344y {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17238b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17239c;

    /* renamed from: d, reason: collision with root package name */
    public final T0.k f17240d;

    /* renamed from: e, reason: collision with root package name */
    public final List f17241e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17242f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f17243g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f17244h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17245i;

    /* renamed from: j, reason: collision with root package name */
    public final int f17246j;

    /* renamed from: k, reason: collision with root package name */
    public final int f17247k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17248l;

    /* renamed from: m, reason: collision with root package name */
    public int f17249m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public final long f17250n;

    /* renamed from: o, reason: collision with root package name */
    public long f17251o;

    /* renamed from: p, reason: collision with root package name */
    public int f17252p;

    /* renamed from: q, reason: collision with root package name */
    public int f17253q;

    public C2240n(int i7, Object obj, int i8, int i9, T0.k kVar, int i10, int i11, List list, long j7, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j8, int i12, int i13) {
        this.a = i7;
        this.f17238b = obj;
        this.f17239c = i8;
        this.f17240d = kVar;
        this.f17241e = list;
        this.f17242f = j7;
        this.f17243g = obj2;
        this.f17244h = aVar;
        this.f17245i = i12;
        this.f17246j = i13;
        int size = list.size();
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iMax = Math.max(iMax, ((S) list.get(i14)).f16841l);
        }
        this.f17247k = iMax;
        int i15 = i9 + iMax;
        this.f17248l = i15 >= 0 ? i15 : 0;
        this.f17250n = AbstractC1420H.a(this.f17239c, iMax);
        this.f17251o = 0L;
        this.f17252p = -1;
        this.f17253q = -1;
    }

    @Override // y.InterfaceC2344y
    public final int a() {
        return this.f17241e.size();
    }

    @Override // y.InterfaceC2344y
    public final int b() {
        return this.f17248l;
    }

    @Override // y.InterfaceC2344y
    public final long c(int i7) {
        return this.f17251o;
    }

    @Override // y.InterfaceC2344y
    public final int d() {
        return this.f17246j;
    }

    @Override // y.InterfaceC2344y
    public final Object e(int i7) {
        return ((S) this.f17241e.get(i7)).h();
    }

    @Override // y.InterfaceC2344y
    public final int f() {
        return this.f17245i;
    }

    public final void g(int i7, int i8, int i9) {
        h(i7, 0, i8, i9, -1, -1);
    }

    @Override // y.InterfaceC2344y
    public final Object getKey() {
        return this.f17238b;
    }

    public final void h(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f17249m = i10;
        if (this.f17240d == T0.k.f8845l) {
            i8 = (i9 - i8) - this.f17239c;
        }
        this.f17251o = F.b(i8, i7);
        this.f17252p = i11;
        this.f17253q = i12;
    }
}
