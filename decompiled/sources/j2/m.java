package j2;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12260b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f12261c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f12260b = str;
        this.f12261c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f12260b, mVar.f12260b) && Arrays.equals(this.f12261c, mVar.f12261c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12260b;
        return Arrays.hashCode(this.f12261c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // j2.i
    public final String toString() {
        return this.a + ": owner=" + this.f12260b;
    }
}
