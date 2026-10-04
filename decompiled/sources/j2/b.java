package j2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12229b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f12229b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && Arrays.equals(this.f12229b, bVar.f12229b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12229b) + A6.b.b(this.a, 527, 31);
    }
}
