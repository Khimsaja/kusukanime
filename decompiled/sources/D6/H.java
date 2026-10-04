package D6;

import b1.AbstractC0703b;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class H extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1662d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1663e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1664f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1665g;

    public /* synthetic */ H(Method method, int i7, boolean z7, int i8) {
        this.f1662d = i8;
        this.f1663e = method;
        this.f1664f = i7;
        this.f1665g = z7;
    }

    @Override // D6.c0
    public final void a(S s7, Object obj) {
        switch (this.f1662d) {
            case 0:
                Map map = (Map) obj;
                Method method = this.f1663e;
                int i7 = this.f1664f;
                if (map == null) {
                    throw c0.o(method, i7, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw c0.o(method, i7, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw c0.o(method, i7, AbstractC0703b.j("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw c0.o(method, i7, "Field map value '" + value + "' converted to null by " + C0108b.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    s7.a(str, string, this.f1665g);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                Method method2 = this.f1663e;
                int i8 = this.f1664f;
                if (map2 == null) {
                    throw c0.o(method2, i8, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw c0.o(method2, i8, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw c0.o(method2, i8, AbstractC0703b.j("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    s7.b(str2, value2.toString(), this.f1665g);
                }
                return;
            default:
                Map map3 = (Map) obj;
                Method method3 = this.f1663e;
                int i9 = this.f1664f;
                if (map3 == null) {
                    throw c0.o(method3, i9, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw c0.o(method3, i9, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw c0.o(method3, i9, AbstractC0703b.j("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw c0.o(method3, i9, "Query map value '" + value3 + "' converted to null by " + C0108b.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    s7.d(str3, string2, this.f1665g);
                }
                return;
        }
    }
}
