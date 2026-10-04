package D6;

import com.kusukanime.data.KusuApi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: D6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127v {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1765b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1766c;

    public C0127v(Object obj, Method method, ArrayList arrayList) {
        this.a = obj;
        this.f1765b = method;
        this.f1766c = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", KusuApi.class.getName(), this.f1765b.getName(), this.f1766c);
    }
}
