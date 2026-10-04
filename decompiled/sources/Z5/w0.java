package Z5;

/* loaded from: classes.dex */
public final class w0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f10364c = new w0(x0.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        byte[] bArr = ((O3.u) obj).f7545k;
        kotlin.jvm.internal.l.f("$this$collectionSize", bArr);
        return bArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        v0 v0Var = (v0) obj;
        kotlin.jvm.internal.l.f("builder", v0Var);
        byte bW = aVar.v(this.f10341b, i7).w();
        v0Var.b(v0Var.d() + 1);
        byte[] bArr = v0Var.a;
        int i8 = v0Var.f10362b;
        v0Var.f10362b = i8 + 1;
        bArr[i8] = bW;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        byte[] bArr = ((O3.u) obj).f7545k;
        kotlin.jvm.internal.l.f("$this$toBuilder", bArr);
        v0 v0Var = new v0();
        v0Var.a = bArr;
        v0Var.f10362b = bArr.length;
        v0Var.b(10);
        return v0Var;
    }

    @Override // Z5.j0
    public final Object j() {
        return new O3.u(new byte[0]);
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        byte[] bArr = ((O3.u) obj).f7545k;
        kotlin.jvm.internal.l.f("encoder", bVar);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.t(this.f10341b, i8).k(bArr[i8]);
        }
    }
}
