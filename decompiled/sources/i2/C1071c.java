package i2;

import java.util.Arrays;
import y1.B;
import y1.C2403z;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071c implements B {
    public final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12003b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12004c;

    public C1071c(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.f12003b = str;
        this.f12004c = str2;
    }

    @Override // y1.B
    public final void c(C2403z c2403z) {
        String str = this.f12003b;
        if (str != null) {
            c2403z.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1071c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((C1071c) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f12003b + "\", url=\"" + this.f12004c + "\", rawMetadata.length=\"" + this.a.length + "\"";
    }
}
