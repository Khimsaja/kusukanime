package b3;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.l;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711c {
    public final Bitmap a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10938b;

    public C0711c(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.f10938b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0711c)) {
            return false;
        }
        C0711c c0711c = (C0711c) obj;
        return l.a(this.a, c0711c.a) && l.a(this.f10938b, c0711c.f10938b);
    }

    public final int hashCode() {
        return this.f10938b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.f10938b + ')';
    }
}
