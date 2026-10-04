package M0;

import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class E {
    public final j a;

    /* renamed from: b, reason: collision with root package name */
    public final u f6377b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6378c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6379d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6380e;

    public E(j jVar, u uVar, int i7, int i8, Object obj) {
        this.a = jVar;
        this.f6377b = uVar;
        this.f6378c = i7;
        this.f6379d = i8;
        this.f6380e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return kotlin.jvm.internal.l.a(this.a, e7.a) && kotlin.jvm.internal.l.a(this.f6377b, e7.f6377b) && this.f6378c == e7.f6378c && this.f6379d == e7.f6379d && kotlin.jvm.internal.l.a(this.f6380e, e7.f6380e);
    }

    public final int hashCode() {
        j jVar = this.a;
        int iA = AbstractC1755i.a(this.f6379d, AbstractC1755i.a(this.f6378c, (((jVar == null ? 0 : jVar.hashCode()) * 31) + this.f6377b.f6419k) * 31, 31), 31);
        Object obj = this.f6380e;
        return iA + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.f6377b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i7 = this.f6378c;
        sb.append((Object) (i7 == 0 ? "Normal" : i7 == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i8 = this.f6379d;
        if (i8 == 0) {
            str = "None";
        } else if (i8 == 1) {
            str = "All";
        } else if (i8 == 2) {
            str = "Weight";
        } else if (i8 == 3) {
            str = "Style";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        return A6.b.i(sb, this.f6380e, ')');
    }
}
