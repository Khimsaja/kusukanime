package V1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9320c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9321d;

    public F(int i7, int i8, int i9, byte[] bArr) {
        this.a = i7;
        this.f9319b = bArr;
        this.f9320c = i8;
        this.f9321d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f5 = (F) obj;
            if (this.a == f5.a && this.f9320c == f5.f9320c && this.f9321d == f5.f9321d && Arrays.equals(this.f9319b, f5.f9319b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9319b) + (this.a * 31)) * 31) + this.f9320c) * 31) + this.f9321d;
    }
}
