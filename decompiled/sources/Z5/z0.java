package Z5;

/* loaded from: classes.dex */
public final class z0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f10376c = new z0(A0.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        int[] iArr = ((O3.w) obj).f7547k;
        kotlin.jvm.internal.l.f("$this$collectionSize", iArr);
        return iArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        y0 y0Var = (y0) obj;
        kotlin.jvm.internal.l.f("builder", y0Var);
        int iT = aVar.v(this.f10341b, i7).t();
        y0Var.b(y0Var.d() + 1);
        int[] iArr = y0Var.a;
        int i8 = y0Var.f10373b;
        y0Var.f10373b = i8 + 1;
        iArr[i8] = iT;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        int[] iArr = ((O3.w) obj).f7547k;
        kotlin.jvm.internal.l.f("$this$toBuilder", iArr);
        y0 y0Var = new y0();
        y0Var.a = iArr;
        y0Var.f10373b = iArr.length;
        y0Var.b(10);
        return y0Var;
    }

    @Override // Z5.j0
    public final Object j() {
        return new O3.w(new int[0]);
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        int[] iArr = ((O3.w) obj).f7547k;
        kotlin.jvm.internal.l.f("encoder", bVar);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.t(this.f10341b, i8).o(iArr[i8]);
        }
    }
}
