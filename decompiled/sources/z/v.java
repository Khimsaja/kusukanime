package z;

import java.util.List;
import java.util.Map;
import l4.AbstractC1420H;
import s.EnumC1903a0;
import w0.InterfaceC2174I;

/* loaded from: classes.dex */
public final class v implements InterfaceC2174I {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18521c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18522d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1903a0 f18523e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18524f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18525g;

    /* renamed from: h, reason: collision with root package name */
    public final j f18526h;

    /* renamed from: i, reason: collision with root package name */
    public final j f18527i;

    /* renamed from: j, reason: collision with root package name */
    public float f18528j;

    /* renamed from: k, reason: collision with root package name */
    public int f18529k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18530l;

    /* renamed from: m, reason: collision with root package name */
    public final t.l f18531m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18532n;

    /* renamed from: o, reason: collision with root package name */
    public final List f18533o;

    /* renamed from: p, reason: collision with root package name */
    public final List f18534p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2174I f18535q;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v(int i7, int i8, int i9, int i10, int i11, t.l lVar, InterfaceC2174I interfaceC2174I, M5.c cVar) {
        P3.y yVar = P3.y.f7779k;
        this(yVar, i7, i8, i9, i10, i11, null, null, 0.0f, 0, false, lVar, interfaceC2174I, false, yVar, yVar, cVar);
    }

    public final long a() {
        InterfaceC2174I interfaceC2174I = this.f18535q;
        return AbstractC1420H.a(interfaceC2174I.l(), interfaceC2174I.e());
    }

    @Override // w0.InterfaceC2174I
    public final int e() {
        return this.f18535q.e();
    }

    @Override // w0.InterfaceC2174I
    public final int l() {
        return this.f18535q.l();
    }

    @Override // w0.InterfaceC2174I
    public final Map m() {
        return this.f18535q.m();
    }

    @Override // w0.InterfaceC2174I
    public final void n() {
        this.f18535q.n();
    }

    @Override // w0.InterfaceC2174I
    public final e4.k o() {
        return this.f18535q.o();
    }

    public v(List list, int i7, int i8, int i9, int i10, int i11, j jVar, j jVar2, float f5, int i12, boolean z7, t.l lVar, InterfaceC2174I interfaceC2174I, boolean z8, List list2, List list3, M5.c cVar) {
        EnumC1903a0 enumC1903a0 = EnumC1903a0.f15260l;
        this.a = list;
        this.f18520b = i7;
        this.f18521c = i8;
        this.f18522d = i9;
        this.f18523e = enumC1903a0;
        this.f18524f = i10;
        this.f18525g = i11;
        this.f18526h = jVar;
        this.f18527i = jVar2;
        this.f18528j = f5;
        this.f18529k = i12;
        this.f18530l = z7;
        this.f18531m = lVar;
        this.f18532n = z8;
        this.f18533o = list2;
        this.f18534p = list3;
        this.f18535q = interfaceC2174I;
    }
}
