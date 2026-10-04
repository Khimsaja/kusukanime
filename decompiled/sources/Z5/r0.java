package Z5;

/* loaded from: classes.dex */
public final class r0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f10351c = new r0(s0.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.l.f("<this>", sArr);
        return sArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        q0 q0Var = (q0) obj;
        kotlin.jvm.internal.l.f("builder", q0Var);
        short sJ = aVar.j(this.f10341b, i7);
        q0Var.b(q0Var.d() + 1);
        short[] sArr = q0Var.a;
        int i8 = q0Var.f10350b;
        q0Var.f10350b = i8 + 1;
        sArr[i8] = sJ;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.l.f("<this>", sArr);
        q0 q0Var = new q0();
        q0Var.a = sArr;
        q0Var.f10350b = sArr.length;
        q0Var.b(10);
        return q0Var;
    }

    @Override // Z5.j0
    public final Object j() {
        return new short[0];
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.l.f("encoder", bVar);
        kotlin.jvm.internal.l.f("content", sArr);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.D(this.f10341b, i8, sArr[i8]);
        }
    }
}
