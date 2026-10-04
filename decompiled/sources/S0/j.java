package S0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f8715b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f8716c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f8717d = new j(2);
    public final int a;

    public j(int i7) {
        this.a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.a == ((j) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i7 = this.a;
        if (i7 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return A6.b.j(new StringBuilder("TextDecoration["), android.support.v4.media.session.b.n(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
