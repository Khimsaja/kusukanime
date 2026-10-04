package N0;

import b1.AbstractC0703b;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final l f6879g = new l(false, 0, true, 1, 1, O0.b.f7249m);
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6880b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6881c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6882d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6883e;

    /* renamed from: f, reason: collision with root package name */
    public final O0.b f6884f;

    public l(boolean z7, int i7, boolean z8, int i8, int i9, O0.b bVar) {
        this.a = z7;
        this.f6880b = i7;
        this.f6881c = z8;
        this.f6882d = i8;
        this.f6883e = i9;
        this.f6884f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.f6880b == lVar.f6880b && this.f6881c == lVar.f6881c && this.f6882d == lVar.f6882d && this.f6883e == lVar.f6883e && kotlin.jvm.internal.l.a(this.f6884f, lVar.f6884f);
    }

    public final int hashCode() {
        return this.f6884f.f7250k.hashCode() + AbstractC1755i.a(this.f6883e, AbstractC1755i.a(this.f6882d, AbstractC0703b.d(AbstractC1755i.a(this.f6880b, Boolean.hashCode(this.a) * 31, 31), 31, this.f6881c), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        int i7 = this.f6880b;
        sb.append((Object) (i7 == -1 ? "Unspecified" : i7 == 0 ? "None" : i7 == 1 ? "Characters" : i7 == 2 ? "Words" : i7 == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f6881c);
        sb.append(", keyboardType=");
        sb.append((Object) android.support.v4.media.session.b.K(this.f6882d));
        sb.append(", imeAction=");
        sb.append((Object) k.a(this.f6883e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f6884f);
        sb.append(')');
        return sb.toString();
    }
}
