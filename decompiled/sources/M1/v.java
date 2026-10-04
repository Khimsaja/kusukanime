package M1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class v {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6539b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6540c;

    public v(String str, boolean z7, boolean z8) {
        this.a = str;
        this.f6539b = z7;
        this.f6540c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == v.class) {
            v vVar = (v) obj;
            if (TextUtils.equals(this.a, vVar.a) && this.f6539b == vVar.f6539b && this.f6540c == vVar.f6540c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((A6.b.b(this.a, 31, 31) + (this.f6539b ? 1231 : 1237)) * 31) + (this.f6540c ? 1231 : 1237);
    }
}
