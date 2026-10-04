package D;

import p.AbstractC1755i;

/* renamed from: D.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0051f0 f1141b = new C0051f0(0, 127);
    public final int a;

    public C0051f0(int i7, int i8) {
        this.a = (i8 & 8) != 0 ? -1 : i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0051f0)) {
            return false;
        }
        C0051f0 c0051f0 = (C0051f0) obj;
        c0051f0.getClass();
        return this.a == c0051f0.a;
    }

    public final int hashCode() {
        return AbstractC1755i.a(this.a, AbstractC1755i.a(0, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) android.support.v4.media.session.b.K(0)) + ", imeAction=" + ((Object) N0.k.a(this.a)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
