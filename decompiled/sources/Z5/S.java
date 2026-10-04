package Z5;

/* loaded from: classes.dex */
public final class S extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final S f10305c = new S(T.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.l.f("<this>", jArr);
        return jArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        Q q6 = (Q) obj;
        kotlin.jvm.internal.l.f("builder", q6);
        long jN = aVar.n(this.f10341b, i7);
        q6.b(q6.d() + 1);
        long[] jArr = q6.a;
        int i8 = q6.f10304b;
        q6.f10304b = i8 + 1;
        jArr[i8] = jN;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.l.f("<this>", jArr);
        Q q6 = new Q();
        q6.a = jArr;
        q6.f10304b = jArr.length;
        q6.b(10);
        return q6;
    }

    @Override // Z5.j0
    public final Object j() {
        return new long[0];
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.l.f("encoder", bVar);
        kotlin.jvm.internal.l.f("content", jArr);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.x(this.f10341b, i8, jArr[i8]);
        }
    }
}
