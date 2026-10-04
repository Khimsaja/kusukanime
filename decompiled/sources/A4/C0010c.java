package A4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: A4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010c implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public static final C0010c f214l = new C0010c(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C0010c f215m = new C0010c(1);

    /* renamed from: n, reason: collision with root package name */
    public static final C0010c f216n = new C0010c(2);

    /* renamed from: o, reason: collision with root package name */
    public static final C0010c f217o = new C0010c(3);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f218k;

    public /* synthetic */ C0010c(int i7) {
        this.f218k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f218k) {
            case 0:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = AbstractC0011d.a;
                kotlin.jvm.internal.l.f("it", parameterizedType);
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list2 = AbstractC0011d.a;
                kotlin.jvm.internal.l.f("it", parameterizedType2);
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                kotlin.jvm.internal.l.e("getActualTypeArguments(...)", actualTypeArguments);
                return P3.m.Q(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!W4.e.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return W4.e.e(simpleName);
                }
                return null;
        }
    }
}
