package S5;

/* loaded from: classes.dex */
public final class j {
    public final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f8801b;

    /* renamed from: c, reason: collision with root package name */
    public int f8802c;

    /* renamed from: d, reason: collision with root package name */
    public p f8803d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8804e;

    /* renamed from: f, reason: collision with root package name */
    public j f8805f;

    /* renamed from: g, reason: collision with root package name */
    public j f8806g;

    public j() {
        this.a = new byte[8192];
        this.f8804e = true;
        this.f8803d = null;
    }

    public final int a() {
        return this.a.length - this.f8802c;
    }

    public final int b() {
        return this.f8802c - this.f8801b;
    }

    public final byte c(int i7) {
        return this.a[this.f8801b + i7];
    }

    public final j d() {
        j jVar = this.f8805f;
        j jVar2 = this.f8806g;
        if (jVar2 != null) {
            kotlin.jvm.internal.l.c(jVar2);
            jVar2.f8805f = this.f8805f;
        }
        j jVar3 = this.f8805f;
        if (jVar3 != null) {
            kotlin.jvm.internal.l.c(jVar3);
            jVar3.f8806g = this.f8806g;
        }
        this.f8805f = null;
        this.f8806g = null;
        return jVar;
    }

    public final void e(j jVar) {
        kotlin.jvm.internal.l.f("segment", jVar);
        jVar.f8806g = this;
        jVar.f8805f = this.f8805f;
        j jVar2 = this.f8805f;
        if (jVar2 != null) {
            jVar2.f8806g = jVar;
        }
        this.f8805f = jVar;
    }

    public final j f() {
        p iVar = this.f8803d;
        if (iVar == null) {
            j jVar = k.a;
            iVar = new i();
            this.f8803d = iVar;
        }
        int i7 = this.f8801b;
        int i8 = this.f8802c;
        i.f8799c.incrementAndGet((i) iVar);
        return new j(this.a, i7, i8, iVar);
    }

    public final void g(j jVar, int i7) {
        kotlin.jvm.internal.l.f("sink", jVar);
        if (!jVar.f8804e) {
            throw new IllegalStateException("only owner can write");
        }
        if (jVar.f8802c + i7 > 8192) {
            p pVar = jVar.f8803d;
            if (pVar != null && ((i) pVar).f8800b > 0) {
                throw new IllegalArgumentException();
            }
            int i8 = jVar.f8802c;
            int i9 = jVar.f8801b;
            if ((i8 + i7) - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = jVar.a;
            P3.m.U(0, i9, i8, bArr, bArr);
            jVar.f8802c -= jVar.f8801b;
            jVar.f8801b = 0;
        }
        int i10 = jVar.f8802c;
        int i11 = this.f8801b;
        P3.m.U(i10, i11, i11 + i7, this.a, jVar.a);
        jVar.f8802c += i7;
        this.f8801b += i7;
    }

    public j(byte[] bArr, int i7, int i8, p pVar) {
        this.a = bArr;
        this.f8801b = i7;
        this.f8802c = i8;
        this.f8803d = pVar;
        this.f8804e = false;
    }
}
