package j5;

import R4.c0;
import X4.AbstractC0615l;
import e4.InterfaceC0821a;

/* renamed from: j5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1364s implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12464k;

    /* renamed from: l, reason: collision with root package name */
    public final C1365t f12465l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC1368w f12466m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0615l f12467n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12468o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12469p;

    /* renamed from: q, reason: collision with root package name */
    public final c0 f12470q;

    public /* synthetic */ C1364s(C1365t c1365t, AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7, int i8, c0 c0Var, int i9) {
        this.f12464k = i9;
        this.f12465l = c1365t;
        this.f12466m = abstractC1368w;
        this.f12467n = abstractC0615l;
        this.f12468o = i7;
        this.f12469p = i8;
        this.f12470q = c0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f12464k) {
            case 0:
                return P3.q.S0(this.f12465l.a.a.f12417e.d0(this.f12466m, this.f12467n, this.f12468o, this.f12469p, this.f12470q));
            default:
                return P3.q.S0(this.f12465l.a.a.f12417e.Y(this.f12466m, this.f12467n, this.f12468o, this.f12469p, this.f12470q));
        }
    }
}
