package M;

import b1.AbstractC0703b;

/* renamed from: M.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443a implements E {
    public final a0.g a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.g f6279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6280c;

    public C0443a(a0.g gVar, a0.g gVar2, int i7) {
        this.a = gVar;
        this.f6279b = gVar2;
        this.f6280c = i7;
    }

    @Override // M.E
    public final int a(T0.i iVar, long j7, int i7, T0.k kVar) {
        int i8 = iVar.f8842c;
        int i9 = iVar.a;
        int iA = this.f6279b.a(0, i8 - i9, kVar);
        int i10 = -this.a.a(0, i7, kVar);
        T0.k kVar2 = T0.k.f8844k;
        int i11 = this.f6280c;
        if (kVar != kVar2) {
            i11 = -i11;
        }
        return i9 + iA + i10 + i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0443a)) {
            return false;
        }
        C0443a c0443a = (C0443a) obj;
        return this.a.equals(c0443a.a) && this.f6279b.equals(c0443a.f6279b) && this.f6280c == c0443a.f6280c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6280c) + AbstractC0703b.b(this.f6279b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.f6279b);
        sb.append(", offset=");
        return AbstractC0703b.l(sb, this.f6280c, ')');
    }
}
