package T;

import F5.q;

/* loaded from: classes.dex */
public final class i extends q {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8832o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i7) {
        super(1);
        this.f8832o = i7;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8832o) {
            case 0:
                int i7 = this.f2550n;
                this.f2550n = i7 + 2;
                Object[] objArr = this.f2548l;
                return new F5.a(1, objArr[i7], objArr[i7 + 1]);
            case 1:
                int i8 = this.f2550n;
                this.f2550n = i8 + 2;
                return this.f2548l[i8];
            default:
                int i9 = this.f2550n;
                this.f2550n = i9 + 2;
                return this.f2548l[i9 + 1];
        }
    }
}
