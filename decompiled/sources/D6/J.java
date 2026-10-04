package D6;

import b1.AbstractC0703b;
import e5.AbstractC0832b;
import f6.AbstractC0893G;
import f6.C0920r;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class J extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1669d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1670e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1671f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0120n f1672g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1673h;

    public J(Method method, int i7, InterfaceC0120n interfaceC0120n, String str) {
        this.f1670e = method;
        this.f1671f = i7;
        this.f1672g = interfaceC0120n;
        this.f1673h = str;
    }

    @Override // D6.c0
    public final void a(S s7, Object obj) {
        switch (this.f1669d) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    s7.c((C0920r) this.f1673h, (AbstractC0893G) this.f1672g.a(obj));
                    return;
                } catch (IOException e7) {
                    throw c0.o(this.f1670e, this.f1671f, "Unable to convert " + obj + " to RequestBody", e7);
                }
            default:
                Map map = (Map) obj;
                Method method = this.f1670e;
                int i7 = this.f1671f;
                if (map == null) {
                    throw c0.o(method, i7, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw c0.o(method, i7, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw c0.o(method, i7, AbstractC0703b.j("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    s7.c(AbstractC0832b.A("Content-Disposition", AbstractC0703b.j("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) this.f1673h), (AbstractC0893G) this.f1672g.a(value));
                }
                return;
        }
    }

    public J(Method method, int i7, C0920r c0920r, InterfaceC0120n interfaceC0120n) {
        this.f1670e = method;
        this.f1671f = i7;
        this.f1673h = c0920r;
        this.f1672g = interfaceC0120n;
    }
}
