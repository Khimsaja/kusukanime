package v3;

import O.C0486d;
import O.C0510p;
import O3.C;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16531k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f16532l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f16533m;

    public /* synthetic */ c(List list, e4.k kVar, int i7, int i8) {
        this.f16531k = i8;
        this.f16532l = list;
        this.f16533m = kVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f16531k;
        C0510p c0510p = (C0510p) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                AbstractC2152b.b(this.f16532l, this.f16533m, c0510p, C0486d.V(1));
                break;
            case 1:
                AbstractC2152b.c(this.f16532l, this.f16533m, c0510p, C0486d.V(1));
                break;
            case 2:
                AbstractC2152b.a(this.f16532l, this.f16533m, c0510p, C0486d.V(1));
                break;
            case 3:
                AbstractC2152b.d(this.f16532l, this.f16533m, c0510p, C0486d.V(1));
                break;
            default:
                AbstractC2152b.h(this.f16532l, this.f16533m, c0510p, C0486d.V(1));
                break;
        }
        return C.a;
    }
}
