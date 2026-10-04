package N0;

import B1.G;
import H0.C0214f;
import b1.AbstractC0703b;

/* renamed from: N0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476a implements i {
    public final C0214f a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6852b;

    public C0476a(C0214f c0214f, int i7) {
        this.a = c0214f;
        this.f6852b = i7;
    }

    @Override // N0.i
    public final void a(D2.e eVar) {
        int i7 = eVar.f1417n;
        boolean z7 = i7 != -1;
        C0214f c0214f = this.a;
        if (z7) {
            eVar.e(c0214f.a, i7, eVar.f1418o);
        } else {
            eVar.e(c0214f.a, eVar.f1415l, eVar.f1416m);
        }
        int i8 = eVar.f1415l;
        int i9 = eVar.f1416m;
        int i10 = i8 == i9 ? i9 : -1;
        int i11 = this.f6852b;
        int iK = e3.c.k(i11 > 0 ? (i10 + i11) - 1 : (i10 + i11) - c0214f.a.length(), 0, ((G) eVar.f1419p).n());
        eVar.i(iK, iK);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0476a)) {
            return false;
        }
        C0476a c0476a = (C0476a) obj;
        return kotlin.jvm.internal.l.a(this.a.a, c0476a.a.a) && this.f6852b == c0476a.f6852b;
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + this.f6852b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.a);
        sb.append("', newCursorPosition=");
        return AbstractC0703b.l(sb, this.f6852b, ')');
    }

    public C0476a(String str, int i7) {
        this(new C0214f(str, null, 6), i7);
    }
}
