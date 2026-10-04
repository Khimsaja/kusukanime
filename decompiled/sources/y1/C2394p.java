package y1;

import java.util.Objects;

/* renamed from: y1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2394p {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18125b;

    static {
        B1.K.B(0);
        B1.K.B(1);
    }

    public C2394p(String str, String str2) {
        this.a = B1.K.G(str);
        this.f18125b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2394p.class == obj.getClass()) {
            C2394p c2394p = (C2394p) obj;
            if (Objects.equals(this.a, c2394p.a) && Objects.equals(this.f18125b, c2394p.f18125b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18125b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
