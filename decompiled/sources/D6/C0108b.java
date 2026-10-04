package D6;

import f6.AbstractC0893G;
import f6.AbstractC0897K;
import f6.C0896J;
import io.ktor.util.GzipHeaderFlags;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import w6.C2224i;

/* renamed from: D6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0108b implements InterfaceC0120n {

    /* renamed from: l, reason: collision with root package name */
    public static final C0108b f1739l = new C0108b(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C0108b f1740m = new C0108b(1);

    /* renamed from: n, reason: collision with root package name */
    public static final C0108b f1741n = new C0108b(2);

    /* renamed from: o, reason: collision with root package name */
    public static final C0108b f1742o = new C0108b(3);

    /* renamed from: p, reason: collision with root package name */
    public static final C0108b f1743p = new C0108b(4);

    /* renamed from: q, reason: collision with root package name */
    public static final C0108b f1744q = new C0108b(5);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1745k;

    public /* synthetic */ C0108b(int i7) {
        this.f1745k = i7;
    }

    /* JADX WARN: Finally extract failed */
    @Override // D6.InterfaceC0120n
    public Object a(Object obj) {
        switch (this.f1745k) {
            case 0:
                return obj.toString();
            case 1:
                AbstractC0897K abstractC0897K = (AbstractC0897K) obj;
                try {
                    C2224i c2224i = new C2224i();
                    abstractC0897K.g().y(c2224i);
                    C0896J c0896j = new C0896J(abstractC0897K.e(), abstractC0897K.b(), c2224i, 0);
                    abstractC0897K.close();
                    return c0896j;
                } catch (Throwable th) {
                    abstractC0897K.close();
                    throw th;
                }
            case 2:
                return (AbstractC0893G) obj;
            case 3:
                return (AbstractC0897K) obj;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((AbstractC0897K) obj).close();
                return O3.C.a;
            default:
                ((AbstractC0897K) obj).close();
                return null;
        }
    }

    public List b(ExecutorC0107a executorC0107a) {
        return Collections.singletonList(new C0123q(executorC0107a));
    }

    public List c() {
        return Collections.EMPTY_LIST;
    }

    public String d(Method method, int i7) {
        return "parameter #" + (i7 + 1);
    }

    public Object e(Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean f(Method method) {
        return false;
    }
}
