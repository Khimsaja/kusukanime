package l5;

import P3.y;
import java.util.List;

/* renamed from: l5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1470w {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12844b;

    public C1470w(boolean z7) {
        y yVar = y.f7779k;
        this.a = z7;
        this.f12844b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1470w)) {
            return false;
        }
        C1470w c1470w = (C1470w) obj;
        return this.a == c1470w.a && kotlin.jvm.internal.l.a(this.f12844b, c1470w.f12844b);
    }

    public final int hashCode() {
        return this.f12844b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.a + ", poisoningFeatures=" + this.f12844b + ')';
    }
}
