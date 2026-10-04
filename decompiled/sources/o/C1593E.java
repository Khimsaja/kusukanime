package o;

import e5.AbstractC0832b;
import f.AbstractC0841b;
import java.util.LinkedHashMap;

/* renamed from: o.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1593E {

    /* renamed from: b, reason: collision with root package name */
    public static final C1593E f13480b = new C1593E(new C1602N((C1595G) null, (AbstractC0832b) null, (AbstractC0841b) null, (LinkedHashMap) null, 63));
    public final C1602N a;

    public C1593E(C1602N c1602n) {
        this.a = c1602n;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1593E) && kotlin.jvm.internal.l.a(((C1593E) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(f13480b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C1595G c1595g = this.a.a;
        sb.append(c1595g != null ? c1595g.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
