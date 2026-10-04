package O0;

import java.util.Locale;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a {
    public final Locale a;

    public a(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l.a(this.a.toLanguageTag(), ((a) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
