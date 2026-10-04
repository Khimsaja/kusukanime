package Z5;

/* renamed from: Z5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646o extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0646o f10348c = new C0646o(C0647p.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.l.f("<this>", cArr);
        return cArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        C0645n c0645n = (C0645n) obj;
        kotlin.jvm.internal.l.f("builder", c0645n);
        char C6 = aVar.C(this.f10341b, i7);
        c0645n.b(c0645n.d() + 1);
        char[] cArr = c0645n.a;
        int i8 = c0645n.f10345b;
        c0645n.f10345b = i8 + 1;
        cArr[i8] = C6;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.l.f("<this>", cArr);
        C0645n c0645n = new C0645n();
        c0645n.a = cArr;
        c0645n.f10345b = cArr.length;
        c0645n.b(10);
        return c0645n;
    }

    @Override // Z5.j0
    public final Object j() {
        return new char[0];
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.l.f("encoder", bVar);
        kotlin.jvm.internal.l.f("content", cArr);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.e(this.f10341b, i8, cArr[i8]);
        }
    }
}
