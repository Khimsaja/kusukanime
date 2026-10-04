package Z5;

/* loaded from: classes.dex */
public final class F0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final F0 f10289c = new F0(G0.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        short[] sArr = ((O3.B) obj).f7510k;
        kotlin.jvm.internal.l.f("$this$collectionSize", sArr);
        return sArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        E0 e02 = (E0) obj;
        kotlin.jvm.internal.l.f("builder", e02);
        short sZ = aVar.v(this.f10341b, i7).z();
        e02.b(e02.d() + 1);
        short[] sArr = e02.a;
        int i8 = e02.f10288b;
        e02.f10288b = i8 + 1;
        sArr[i8] = sZ;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        short[] sArr = ((O3.B) obj).f7510k;
        kotlin.jvm.internal.l.f("$this$toBuilder", sArr);
        E0 e02 = new E0();
        e02.a = sArr;
        e02.f10288b = sArr.length;
        e02.b(10);
        return e02;
    }

    @Override // Z5.j0
    public final Object j() {
        return new O3.B(new short[0]);
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        short[] sArr = ((O3.B) obj).f7510k;
        kotlin.jvm.internal.l.f("encoder", bVar);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.t(this.f10341b, i8).h(sArr[i8]);
        }
    }
}
