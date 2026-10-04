package O1;

import y1.C2393o;

/* loaded from: classes.dex */
public final class I implements Q1.s {
    public final Q1.s a;

    /* renamed from: b, reason: collision with root package name */
    public final y1.Q f7270b;

    public I(Q1.s sVar, y1.Q q6) {
        this.a = sVar;
        this.f7270b = q6;
    }

    @Override // Q1.s
    public final void a(boolean z7) {
        this.a.a(z7);
    }

    @Override // Q1.s
    public final C2393o b(int i7) {
        return this.f7270b.f17971d[this.a.d(i7)];
    }

    @Override // Q1.s
    public final void c() {
        this.a.c();
    }

    @Override // Q1.s
    public final int d(int i7) {
        return this.a.d(i7);
    }

    @Override // Q1.s
    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i7 = (I) obj;
        return this.a.equals(i7.a) && this.f7270b.equals(i7.f7270b);
    }

    @Override // Q1.s
    public final int f() {
        return this.a.f();
    }

    @Override // Q1.s
    public final y1.Q g() {
        return this.f7270b;
    }

    @Override // Q1.s
    public final C2393o h() {
        return this.f7270b.f17971d[this.a.f()];
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.f7270b.hashCode() + 527) * 31);
    }

    @Override // Q1.s
    public final void i(float f5) {
        this.a.i(f5);
    }

    @Override // Q1.s
    public final void j() {
        this.a.j();
    }

    @Override // Q1.s
    public final void k() {
        this.a.k();
    }

    @Override // Q1.s
    public final int l(int i7) {
        return this.a.l(i7);
    }

    @Override // Q1.s
    public final int length() {
        return this.a.length();
    }
}
