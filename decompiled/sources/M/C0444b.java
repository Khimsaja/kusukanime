package M;

import b1.AbstractC0703b;

/* renamed from: M.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444b implements F {
    public final a0.h a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.h f6281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6282c;

    public C0444b(a0.h hVar, a0.h hVar2, int i7) {
        this.a = hVar;
        this.f6281b = hVar2;
        this.f6282c = i7;
    }

    @Override // M.F
    public final int a(T0.i iVar, long j7, int i7) {
        int iA = this.f6281b.a(0, iVar.a());
        return iVar.f8841b + iA + (-this.a.a(0, i7)) + this.f6282c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0444b)) {
            return false;
        }
        C0444b c0444b = (C0444b) obj;
        return this.a.equals(c0444b.a) && this.f6281b.equals(c0444b.f6281b) && this.f6282c == c0444b.f6282c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6282c) + AbstractC0703b.b(this.f6281b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.f6281b);
        sb.append(", offset=");
        return AbstractC0703b.l(sb, this.f6282c, ')');
    }
}
