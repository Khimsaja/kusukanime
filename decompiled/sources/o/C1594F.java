package o;

import e5.AbstractC0832b;
import f.AbstractC0841b;
import java.util.LinkedHashMap;

/* renamed from: o.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1594F {

    /* renamed from: b, reason: collision with root package name */
    public static final C1594F f13481b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1594F f13482c;
    public final C1602N a;

    static {
        AbstractC0841b abstractC0841b = null;
        LinkedHashMap linkedHashMap = null;
        C1595G c1595g = null;
        AbstractC0832b abstractC0832b = null;
        f13481b = new C1594F(new C1602N(c1595g, abstractC0832b, abstractC0841b, linkedHashMap, 63));
        f13482c = new C1594F(new C1602N(c1595g, abstractC0832b, abstractC0841b, linkedHashMap, 47));
    }

    public C1594F(C1602N c1602n) {
        this.a = c1602n;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1594F) && kotlin.jvm.internal.l.a(((C1594F) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(f13481b)) {
            return "ExitTransition.None";
        }
        if (equals(f13482c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        C1602N c1602n = this.a;
        C1595G c1595g = c1602n.a;
        sb.append(c1595g != null ? c1595g.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(c1602n.f13486b);
        return sb.toString();
    }
}
