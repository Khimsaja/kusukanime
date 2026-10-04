package j2;

import java.util.Arrays;
import java.util.Objects;
import y1.C2403z;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1313a extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12225b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12226c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12227d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f12228e;

    public C1313a(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f12225b = str;
        this.f12226c = str2;
        this.f12227d = i7;
        this.f12228e = bArr;
    }

    @Override // y1.B
    public final void c(C2403z c2403z) {
        c2403z.a(this.f12228e, this.f12227d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1313a.class == obj.getClass()) {
            C1313a c1313a = (C1313a) obj;
            if (this.f12227d == c1313a.f12227d && Objects.equals(this.f12225b, c1313a.f12225b) && Objects.equals(this.f12226c, c1313a.f12226c) && Arrays.equals(this.f12228e, c1313a.f12228e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (527 + this.f12227d) * 31;
        String str = this.f12225b;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12226c;
        return Arrays.hashCode(this.f12228e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // j2.i
    public final String toString() {
        return this.a + ": mimeType=" + this.f12225b + ", description=" + this.f12226c;
    }
}
