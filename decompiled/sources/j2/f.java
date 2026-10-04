package j2;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12244b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12245c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12246d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f12247e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12244b = str;
        this.f12245c = str2;
        this.f12246d = str3;
        this.f12247e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f12244b, fVar.f12244b) && Objects.equals(this.f12245c, fVar.f12245c) && Objects.equals(this.f12246d, fVar.f12246d) && Arrays.equals(this.f12247e, fVar.f12247e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12244b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12245c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12246d;
        return Arrays.hashCode(this.f12247e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // j2.i
    public final String toString() {
        return this.a + ": mimeType=" + this.f12244b + ", filename=" + this.f12245c + ", description=" + this.f12246d;
    }
}
