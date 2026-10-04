package z;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18502l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2425d f18503m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M5.c f18504n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(C2425d c2425d, M5.c cVar, int i7) {
        super(0);
        this.f18502l = i7;
        this.f18503m = c2425d;
        this.f18504n = cVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        switch (this.f18502l) {
            case 0:
                C2425d c2425d = this.f18503m;
                M5.c cVar = this.f18504n;
                if (c2425d.a()) {
                    H5.D.x(cVar, null, new q(c2425d, null), 3);
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            case 1:
                C2425d c2425d2 = this.f18503m;
                M5.c cVar2 = this.f18504n;
                if (c2425d2.c()) {
                    H5.D.x(cVar2, null, new r(c2425d2, null), 3);
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case 2:
                C2425d c2425d3 = this.f18503m;
                M5.c cVar3 = this.f18504n;
                if (c2425d3.a()) {
                    H5.D.x(cVar3, null, new q(c2425d3, null), 3);
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                C2425d c2425d4 = this.f18503m;
                M5.c cVar4 = this.f18504n;
                if (c2425d4.c()) {
                    H5.D.x(cVar4, null, new r(c2425d4, null), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
