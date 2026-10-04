package j2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12252b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12253c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12254d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f12252b = str;
        this.f12253c = str2;
        this.f12254d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f12253c, kVar.f12253c) && Objects.equals(this.f12252b, kVar.f12252b) && Objects.equals(this.f12254d, kVar.f12254d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12252b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12253c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12254d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // j2.i
    public final String toString() {
        return this.a + ": domain=" + this.f12252b + ", description=" + this.f12253c;
    }
}
