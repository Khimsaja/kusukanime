package y1;

import B1.AbstractC0015b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class W {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f18012b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18013c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f18014d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f18015e;

    static {
        B1.K.B(0);
        B1.K.B(1);
        B1.K.B(3);
        B1.K.B(4);
    }

    public W(Q q6, boolean z7, int[] iArr, boolean[] zArr) {
        int i7 = q6.a;
        this.a = i7;
        boolean z8 = false;
        AbstractC0015b.c(i7 == iArr.length && i7 == zArr.length);
        this.f18012b = q6;
        if (z7 && i7 > 1) {
            z8 = true;
        }
        this.f18013c = z8;
        this.f18014d = (int[]) iArr.clone();
        this.f18015e = (boolean[]) zArr.clone();
    }

    public final boolean a(int i7) {
        return this.f18014d[i7] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W.class == obj.getClass()) {
            W w7 = (W) obj;
            if (this.f18013c == w7.f18013c && this.f18012b.equals(w7.f18012b) && Arrays.equals(this.f18014d, w7.f18014d) && Arrays.equals(this.f18015e, w7.f18015e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18015e) + ((Arrays.hashCode(this.f18014d) + (((this.f18012b.hashCode() * 31) + (this.f18013c ? 1 : 0)) * 31)) * 31);
    }
}
