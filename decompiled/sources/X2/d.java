package X2;

import android.graphics.drawable.Drawable;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class d extends e {
    public final Drawable a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9807b;

    /* renamed from: c, reason: collision with root package name */
    public final U2.e f9808c;

    public d(Drawable drawable, boolean z7, U2.e eVar) {
        this.a = drawable;
        this.f9807b = z7;
        this.f9808c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.a, dVar.a) && this.f9807b == dVar.f9807b && this.f9808c == dVar.f9808c;
    }

    public final int hashCode() {
        return this.f9808c.hashCode() + AbstractC0703b.d(this.a.hashCode() * 31, 31, this.f9807b);
    }
}
