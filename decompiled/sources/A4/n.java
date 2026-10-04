package A4;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public static final n f231k = new n(1, v.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // e4.k
    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        kotlin.jvm.internal.l.f("p0", field);
        return new v(field);
    }
}
