package j2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12241b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12242c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12243d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f12241b = str;
        this.f12242c = str2;
        this.f12243d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f12242c, eVar.f12242c) && Objects.equals(this.f12241b, eVar.f12241b) && Objects.equals(this.f12243d, eVar.f12243d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12241b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12242c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12243d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // j2.i
    public final String toString() {
        return this.a + ": language=" + this.f12241b + ", description=" + this.f12242c + ", text=" + this.f12243d;
    }
}
