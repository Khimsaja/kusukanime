package v;

import O.C0486d;
import O.C0493g0;
import b1.AbstractC0703b;
import d1.C0782a;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2122a implements m0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16426b;

    /* renamed from: c, reason: collision with root package name */
    public final C0493g0 f16427c;

    /* renamed from: d, reason: collision with root package name */
    public final C0493g0 f16428d;

    public C2122a(int i7, String str) {
        this.a = i7;
        this.f16426b = str;
        C0782a c0782a = C0782a.f11199e;
        O.T t7 = O.T.f7049p;
        this.f16427c = C0486d.K(c0782a, t7);
        this.f16428d = C0486d.K(Boolean.TRUE, t7);
    }

    @Override // v.m0
    public final int a(T0.b bVar, T0.k kVar) {
        return e().a;
    }

    @Override // v.m0
    public final int b(T0.b bVar, T0.k kVar) {
        return e().f11201c;
    }

    @Override // v.m0
    public final int c(T0.b bVar) {
        return e().f11200b;
    }

    @Override // v.m0
    public final int d(T0.b bVar) {
        return e().f11202d;
    }

    public final C0782a e() {
        return (C0782a) this.f16427c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2122a) {
            return this.a == ((C2122a) obj).a;
        }
        return false;
    }

    public final void f(i1.S s7, int i7) {
        int i8 = this.a;
        if (i7 == 0 || (i7 & i8) != 0) {
            this.f16427c.setValue(s7.a.f(i8));
            this.f16428d.setValue(Boolean.valueOf(s7.a.o(i8)));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16426b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().f11200b);
        sb.append(", ");
        sb.append(e().f11201c);
        sb.append(", ");
        return AbstractC0703b.l(sb, e().f11202d, ')');
    }
}
