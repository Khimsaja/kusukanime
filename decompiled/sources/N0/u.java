package N0;

import B1.G;
import H0.C0214f;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class u implements i {
    public final C0214f a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6894b;

    public u(String str, int i7) {
        this.a = new C0214f(str, null, 6);
        this.f6894b = i7;
    }

    @Override // N0.i
    public final void a(D2.e eVar) {
        int i7 = eVar.f1417n;
        boolean z7 = i7 != -1;
        C0214f c0214f = this.a;
        if (z7) {
            eVar.e(c0214f.a, i7, eVar.f1418o);
            String str = c0214f.a;
            if (str.length() > 0) {
                eVar.h(i7, str.length() + i7);
            }
        } else {
            int i8 = eVar.f1415l;
            eVar.e(c0214f.a, i8, eVar.f1416m);
            String str2 = c0214f.a;
            if (str2.length() > 0) {
                eVar.h(i8, str2.length() + i8);
            }
        }
        int i9 = eVar.f1415l;
        int i10 = eVar.f1416m;
        int i11 = i9 == i10 ? i10 : -1;
        int i12 = this.f6894b;
        int iK = e3.c.k(i12 > 0 ? (i11 + i12) - 1 : (i11 + i12) - c0214f.a.length(), 0, ((G) eVar.f1419p).n());
        eVar.i(iK, iK);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.l.a(this.a.a, uVar.a.a) && this.f6894b == uVar.f6894b;
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + this.f6894b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.a);
        sb.append("', newCursorPosition=");
        return AbstractC0703b.l(sb, this.f6894b, ')');
    }
}
