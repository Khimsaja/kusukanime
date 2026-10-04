package D5;

import P3.AbstractC0564e;
import P3.r;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC0564e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1633k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final int f1634l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1635m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0564e f1636n;

    public a(E5.c cVar, int i7, int i8) {
        this.f1636n = cVar;
        this.f1634l = i7;
        r.m(i7, i8, cVar.a());
        this.f1635m = i8 - i7;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        switch (this.f1633k) {
        }
        return this.f1635m;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f1633k) {
            case 0:
                r.i(i7, this.f1635m);
                return ((E5.c) this.f1636n).get(this.f1634l + i7);
            default:
                r.j(i7, this.f1635m);
                return ((S.b) this.f1636n).get(this.f1634l + i7);
        }
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final List subList(int i7, int i8) {
        switch (this.f1633k) {
            case 0:
                r.m(i7, i8, this.f1635m);
                int i9 = this.f1634l;
                return new a((E5.c) this.f1636n, i7 + i9, i9 + i8);
            default:
                r.n(i7, i8, this.f1635m);
                int i10 = this.f1634l;
                return new a((S.b) this.f1636n, i7 + i10, i10 + i8);
        }
    }

    public a(S.b bVar, int i7, int i8) {
        this.f1636n = bVar;
        this.f1634l = i7;
        r.n(i7, i8, bVar.a());
        this.f1635m = i8 - i7;
    }
}
