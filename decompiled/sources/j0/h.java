package j0;

import b1.AbstractC0703b;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class h extends AbstractC1299e {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12208b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12210d;

    public h(float f5, float f7, int i7, int i8, int i9) {
        f7 = (i9 & 2) != 0 ? 4.0f : f7;
        i7 = (i9 & 4) != 0 ? 0 : i7;
        i8 = (i9 & 8) != 0 ? 0 : i8;
        this.a = f5;
        this.f12208b = f7;
        this.f12209c = i7;
        this.f12210d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.f12208b == hVar.f12208b) {
            if (this.f12209c == hVar.f12209c) {
                if (this.f12210d == hVar.f12210d) {
                    hVar.getClass();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1755i.a(this.f12210d, AbstractC1755i.a(this.f12209c, AbstractC0703b.b(this.f12208b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.f12208b);
        sb.append(", cap=");
        String str = "Unknown";
        int i7 = this.f12209c;
        sb.append((Object) (i7 == 0 ? "Butt" : i7 == 1 ? "Round" : i7 == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i8 = this.f12210d;
        if (i8 == 0) {
            str = "Miter";
        } else if (i8 == 1) {
            str = "Round";
        } else if (i8 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
