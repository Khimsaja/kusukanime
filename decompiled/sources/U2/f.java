package U2;

import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class f {
    public final BitmapDrawable a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9209b;

    public f(BitmapDrawable bitmapDrawable, boolean z7) {
        this.a = bitmapDrawable;
        this.f9209b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.f9209b == fVar.f9209b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9209b) + (this.a.hashCode() * 31);
    }
}
