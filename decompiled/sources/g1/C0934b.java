package g1;

import java.util.List;
import java.util.Objects;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934b {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f11672b;

    /* renamed from: c, reason: collision with root package name */
    public List f11673c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0934b)) {
            return false;
        }
        C0934b c0934b = (C0934b) obj;
        return Objects.equals(this.a, c0934b.a) && Objects.equals(this.f11672b, c0934b.f11672b) && Objects.equals(this.f11673c, c0934b.f11673c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f11672b, this.f11673c);
    }
}
