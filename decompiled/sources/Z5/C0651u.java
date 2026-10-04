package Z5;

/* renamed from: Z5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651u extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0651u f10357c = new C0651u(C0652v.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.l.f("<this>", dArr);
        return dArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        C0650t c0650t = (C0650t) obj;
        kotlin.jvm.internal.l.f("builder", c0650t);
        double dY = aVar.y(this.f10341b, i7);
        c0650t.b(c0650t.d() + 1);
        double[] dArr = c0650t.a;
        int i8 = c0650t.f10355b;
        c0650t.f10355b = i8 + 1;
        dArr[i8] = dY;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.l.f("<this>", dArr);
        C0650t c0650t = new C0650t();
        c0650t.a = dArr;
        c0650t.f10355b = dArr.length;
        c0650t.b(10);
        return c0650t;
    }

    @Override // Z5.j0
    public final Object j() {
        return new double[0];
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.l.f("encoder", bVar);
        kotlin.jvm.internal.l.f("content", dArr);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.n(this.f10341b, i8, dArr[i8]);
        }
    }
}
