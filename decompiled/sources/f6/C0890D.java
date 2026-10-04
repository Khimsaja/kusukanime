package f6;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: f6.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890D {
    public final C0922t a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11475b;

    /* renamed from: c, reason: collision with root package name */
    public final C0920r f11476c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0893G f11477d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f11478e;

    /* renamed from: f, reason: collision with root package name */
    public C0906d f11479f;

    public C0890D(C0922t c0922t, String str, C0920r c0920r, AbstractC0893G abstractC0893G, Map map) {
        kotlin.jvm.internal.l.f("url", c0922t);
        kotlin.jvm.internal.l.f("method", str);
        this.a = c0922t;
        this.f11475b = str;
        this.f11476c = c0920r;
        this.f11477d = abstractC0893G;
        this.f11478e = map;
    }

    public final C0906d a() {
        C0906d c0906d = this.f11479f;
        if (c0906d != null) {
            return c0906d;
        }
        C0906d c0906d2 = C0906d.f11534n;
        C0906d c0906dW = AbstractC0905c.w(this.f11476c);
        this.f11479f = c0906dW;
        return c0906dW;
    }

    public final C0889C b() {
        C0889C c0889c = new C0889C();
        c0889c.f11474e = new LinkedHashMap();
        c0889c.a = this.a;
        c0889c.f11471b = this.f11475b;
        c0889c.f11473d = this.f11477d;
        Map map = this.f11478e;
        c0889c.f11474e = map.isEmpty() ? new LinkedHashMap() : P3.E.t0(map);
        c0889c.f11472c = this.f11476c.j();
        return c0889c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f11475b);
        sb.append(", url=");
        sb.append(this.a);
        C0920r c0920r = this.f11476c;
        if (c0920r.size() != 0) {
            sb.append(", headers=[");
            int i7 = 0;
            for (Object obj : c0920r) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    P3.r.X();
                    throw null;
                }
                O3.l lVar = (O3.l) obj;
                String str = (String) lVar.f7528k;
                String str2 = (String) lVar.f7529l;
                if (i7 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i7 = i8;
            }
            sb.append(']');
        }
        Map map = this.f11478e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
