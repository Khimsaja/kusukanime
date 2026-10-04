package A4;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final class v extends x {
    public final Field a;

    public v(Field field) {
        kotlin.jvm.internal.l.f("member", field);
        this.a = field;
    }

    @Override // A4.x
    public final Member b() {
        return this.a;
    }
}
