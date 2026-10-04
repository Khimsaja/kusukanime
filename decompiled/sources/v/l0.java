package v;

import O.C0486d;
import O.C0493g0;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class l0 implements m0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C0493g0 f16461b;

    public l0(T t7, String str) {
        this.a = str;
        this.f16461b = C0486d.K(t7, O.T.f7049p);
    }

    @Override // v.m0
    public final int a(T0.b bVar, T0.k kVar) {
        return e().a;
    }

    @Override // v.m0
    public final int b(T0.b bVar, T0.k kVar) {
        return e().f16411c;
    }

    @Override // v.m0
    public final int c(T0.b bVar) {
        return e().f16410b;
    }

    @Override // v.m0
    public final int d(T0.b bVar) {
        return e().f16412d;
    }

    public final T e() {
        return (T) this.f16461b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            return kotlin.jvm.internal.l.a(e(), ((l0) obj).e());
        }
        return false;
    }

    public final void f(T t7) {
        this.f16461b.setValue(t7);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().f16410b);
        sb.append(", right=");
        sb.append(e().f16411c);
        sb.append(", bottom=");
        return AbstractC0703b.l(sb, e().f16412d, ')');
    }
}
