package w0;

/* renamed from: w0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2193k implements InterfaceC2172G {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16868k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2172G f16869l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16870m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16871n;

    public /* synthetic */ C2193k(InterfaceC2172G interfaceC2172G, int i7, int i8, int i9) {
        this.f16868k = i9;
        this.f16869l = interfaceC2172G;
        this.f16870m = i7;
        this.f16871n = i8;
    }

    @Override // w0.InterfaceC2172G
    public final int W(int i7) {
        switch (this.f16868k) {
        }
        return this.f16869l.W(i7);
    }

    @Override // w0.InterfaceC2172G
    public final int Y(int i7) {
        switch (this.f16868k) {
        }
        return this.f16869l.Y(i7);
    }

    @Override // w0.InterfaceC2172G
    public final S b(long j7) {
        switch (this.f16868k) {
            case 0:
                int i7 = this.f16871n;
                int i8 = this.f16870m;
                InterfaceC2172G interfaceC2172G = this.f16869l;
                if (i7 == 1) {
                    return new C2195m(i8 == 2 ? interfaceC2172G.Y(T0.a.g(j7)) : interfaceC2172G.W(T0.a.g(j7)), T0.a.c(j7) ? T0.a.g(j7) : 32767, 0);
                }
                return new C2195m(T0.a.d(j7) ? T0.a.h(j7) : 32767, i8 == 2 ? interfaceC2172G.c(T0.a.h(j7)) : interfaceC2172G.b0(T0.a.h(j7)), 0);
            case 1:
                int i9 = this.f16871n;
                int i10 = this.f16870m;
                InterfaceC2172G interfaceC2172G2 = this.f16869l;
                if (i9 == 1) {
                    return new C2195m(i10 == 2 ? interfaceC2172G2.Y(T0.a.g(j7)) : interfaceC2172G2.W(T0.a.g(j7)), T0.a.c(j7) ? T0.a.g(j7) : 32767, 1);
                }
                return new C2195m(T0.a.d(j7) ? T0.a.h(j7) : 32767, i10 == 2 ? interfaceC2172G2.c(T0.a.h(j7)) : interfaceC2172G2.b0(T0.a.h(j7)), 1);
            default:
                int i11 = this.f16871n;
                int i12 = this.f16870m;
                InterfaceC2172G interfaceC2172G3 = this.f16869l;
                if (i11 == 1) {
                    return new C2195m(i12 == 2 ? interfaceC2172G3.Y(T0.a.g(j7)) : interfaceC2172G3.W(T0.a.g(j7)), T0.a.c(j7) ? T0.a.g(j7) : 32767, 2);
                }
                return new C2195m(T0.a.d(j7) ? T0.a.h(j7) : 32767, i12 == 2 ? interfaceC2172G3.c(T0.a.h(j7)) : interfaceC2172G3.b0(T0.a.h(j7)), 2);
        }
    }

    @Override // w0.InterfaceC2172G
    public final int b0(int i7) {
        switch (this.f16868k) {
        }
        return this.f16869l.b0(i7);
    }

    @Override // w0.InterfaceC2172G
    public final int c(int i7) {
        switch (this.f16868k) {
        }
        return this.f16869l.c(i7);
    }

    @Override // w0.InterfaceC2172G
    public final Object h() {
        switch (this.f16868k) {
        }
        return this.f16869l.h();
    }
}
