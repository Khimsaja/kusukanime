package v;

/* loaded from: classes.dex */
public final class W implements m0 {
    public final m0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16417b;

    public W(m0 m0Var, int i7) {
        this.a = m0Var;
        this.f16417b = i7;
    }

    @Override // v.m0
    public final int a(T0.b bVar, T0.k kVar) {
        if (((kVar == T0.k.f8844k ? 8 : 2) & this.f16417b) != 0) {
            return this.a.a(bVar, kVar);
        }
        return 0;
    }

    @Override // v.m0
    public final int b(T0.b bVar, T0.k kVar) {
        if (((kVar == T0.k.f8844k ? 4 : 1) & this.f16417b) != 0) {
            return this.a.b(bVar, kVar);
        }
        return 0;
    }

    @Override // v.m0
    public final int c(T0.b bVar) {
        if ((this.f16417b & 16) != 0) {
            return this.a.c(bVar);
        }
        return 0;
    }

    @Override // v.m0
    public final int d(T0.b bVar) {
        if ((this.f16417b & 32) != 0) {
            return this.a.d(bVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w7 = (W) obj;
        if (kotlin.jvm.internal.l.a(this.a, w7.a)) {
            if (this.f16417b == w7.f16417b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16417b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i7 = this.f16417b;
        int i8 = AbstractC2123b.f16431c;
        if ((i7 & i8) == i8) {
            AbstractC2123b.j("Start", sb3);
        }
        int i9 = AbstractC2123b.f16433e;
        if ((i7 & i9) == i9) {
            AbstractC2123b.j("Left", sb3);
        }
        if ((i7 & 16) == 16) {
            AbstractC2123b.j("Top", sb3);
        }
        int i10 = AbstractC2123b.f16432d;
        if ((i7 & i10) == i10) {
            AbstractC2123b.j("End", sb3);
        }
        int i11 = AbstractC2123b.f16434f;
        if ((i7 & i11) == i11) {
            AbstractC2123b.j("Right", sb3);
        }
        if ((i7 & 32) == 32) {
            AbstractC2123b.j("Bottom", sb3);
        }
        String string = sb3.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
