package Z5;

/* loaded from: classes.dex */
public final class C0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f10284c = new C0(D0.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        long[] jArr = ((O3.y) obj).f7549k;
        kotlin.jvm.internal.l.f("$this$collectionSize", jArr);
        return jArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        B0 b02 = (B0) obj;
        kotlin.jvm.internal.l.f("builder", b02);
        long jD = aVar.v(this.f10341b, i7).d();
        b02.b(b02.d() + 1);
        long[] jArr = b02.a;
        int i8 = b02.f10282b;
        b02.f10282b = i8 + 1;
        jArr[i8] = jD;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        long[] jArr = ((O3.y) obj).f7549k;
        kotlin.jvm.internal.l.f("$this$toBuilder", jArr);
        B0 b02 = new B0();
        b02.a = jArr;
        b02.f10282b = jArr.length;
        b02.b(10);
        return b02;
    }

    @Override // Z5.j0
    public final Object j() {
        return new O3.y(new long[0]);
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        long[] jArr = ((O3.y) obj).f7549k;
        kotlin.jvm.internal.l.f("encoder", bVar);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.t(this.f10341b, i8).v(jArr[i8]);
        }
    }
}
