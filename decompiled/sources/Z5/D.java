package Z5;

/* loaded from: classes.dex */
public final class D extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final D f10285c = new D(E.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.l.f("<this>", fArr);
        return fArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        C c2 = (C) obj;
        kotlin.jvm.internal.l.f("builder", c2);
        float fO = aVar.o(this.f10341b, i7);
        c2.b(c2.d() + 1);
        float[] fArr = c2.a;
        int i8 = c2.f10283b;
        c2.f10283b = i8 + 1;
        fArr[i8] = fO;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.l.f("<this>", fArr);
        C c2 = new C();
        c2.a = fArr;
        c2.f10283b = fArr.length;
        c2.b(10);
        return c2;
    }

    @Override // Z5.j0
    public final Object j() {
        return new float[0];
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.l.f("encoder", bVar);
        kotlin.jvm.internal.l.f("content", fArr);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.u(this.f10341b, i8, fArr[i8]);
        }
    }
}
