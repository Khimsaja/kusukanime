package Z5;

/* renamed from: Z5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639i extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0639i f10338c = new C0639i(C0641j.a);

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.l.f("<this>", bArr);
        return bArr.length;
    }

    @Override // Z5.r, Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        C0637h c0637h = (C0637h) obj;
        kotlin.jvm.internal.l.f("builder", c0637h);
        byte bX = aVar.x(this.f10341b, i7);
        c0637h.b(c0637h.d() + 1);
        byte[] bArr = c0637h.a;
        int i8 = c0637h.f10337b;
        c0637h.f10337b = i8 + 1;
        bArr[i8] = bX;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.l.f("<this>", bArr);
        C0637h c0637h = new C0637h();
        c0637h.a = bArr;
        c0637h.f10337b = bArr.length;
        c0637h.b(10);
        return c0637h;
    }

    @Override // Z5.j0
    public final Object j() {
        return new byte[0];
    }

    @Override // Z5.j0
    public final void k(Y5.b bVar, Object obj, int i7) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.l.f("encoder", bVar);
        kotlin.jvm.internal.l.f("content", bArr);
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.d(this.f10341b, i8, bArr[i8]);
        }
    }
}
