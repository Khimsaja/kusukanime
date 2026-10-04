package j2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12264b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12265c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f12264b = str2;
        this.f12265c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && Objects.equals(this.f12264b, oVar.f12264b) && Objects.equals(this.f12265c, oVar.f12265c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = A6.b.b(this.a, 527, 31);
        String str = this.f12264b;
        int iHashCode = (iB + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12265c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // j2.i
    public final String toString() {
        return this.a + ": url=" + this.f12265c;
    }
}
