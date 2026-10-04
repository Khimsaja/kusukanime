package o4;

import A4.AbstractC0011d;
import f1.AbstractC0870c;
import java.lang.reflect.Field;

/* renamed from: o4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1687m extends AbstractC0870c {
    public final Field a;

    public C1687m(Field field) {
        kotlin.jvm.internal.l.f("field", field);
        this.a = field;
    }

    @Override // f1.AbstractC0870c
    public final String G() {
        StringBuilder sb = new StringBuilder();
        Field field = this.a;
        String name = field.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        sb.append(H4.w.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        kotlin.jvm.internal.l.e("getType(...)", type);
        sb.append(AbstractC0011d.b(type));
        return sb.toString();
    }
}
