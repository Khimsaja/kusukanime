package Z5;

/* loaded from: classes.dex */
public final class M extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final M f10301c = new M(N.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.l.f("<this>", iArr);
        return iArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        L l7 = (L) obj;
        kotlin.jvm.internal.l.f("builder", l7);
        int iU = aVar.u(this.f10341b, i7);
        l7.b(l7.d() + 1);
        int[] iArr = l7.a;
        int i8 = l7.f10300b;
        l7.f10300b = i8 + 1;
        iArr[i8] = iU;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.l.f("<this>", iArr);
        L l7 = new L();
        l7.a = iArr;
        l7.f10300b = iArr.length;
        l7.b(10);
        return l7;
    }

    @Override // Z5.j0
    public final Object j() {
        return new int[0];
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.l.f("encoder", bVar);
        kotlin.jvm.internal.l.f("content", iArr);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.q(i8, iArr[i8], this.f10341b);
        }
    }
}
