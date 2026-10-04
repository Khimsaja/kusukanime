package Z5;

/* renamed from: Z5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633f extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0633f f10323c = new C0633f(C0635g.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.l.f("<this>", zArr);
        return zArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        C0631e c0631e = (C0631e) obj;
        kotlin.jvm.internal.l.f("builder", c0631e);
        boolean zE = aVar.e(this.f10341b, i7);
        c0631e.b(c0631e.d() + 1);
        boolean[] zArr = c0631e.a;
        int i8 = c0631e.f10320b;
        c0631e.f10320b = i8 + 1;
        zArr[i8] = zE;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.l.f("<this>", zArr);
        C0631e c0631e = new C0631e();
        c0631e.a = zArr;
        c0631e.f10320b = zArr.length;
        c0631e.b(10);
        return c0631e;
    }

    @Override // Z5.j0
    public final Object j() {
        return new boolean[0];
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.l.f("encoder", bVar);
        kotlin.jvm.internal.l.f("content", zArr);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.A(this.f10341b, i8, zArr[i8]);
        }
    }
}
