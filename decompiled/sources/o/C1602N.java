package o;

import b1.AbstractC0703b;
import e5.AbstractC0832b;
import f.AbstractC0841b;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602N {
    public final C1595G a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13486b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f13487c;

    public C1602N(C1595G c1595g, AbstractC0832b abstractC0832b, AbstractC0841b abstractC0841b, boolean z7, Map map) {
        this.a = c1595g;
        this.f13486b = z7;
        this.f13487c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1602N)) {
            return false;
        }
        C1602N c1602n = (C1602N) obj;
        return kotlin.jvm.internal.l.a(this.a, c1602n.a) && kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(null, null) && this.f13486b == c1602n.f13486b && kotlin.jvm.internal.l.a(this.f13487c, c1602n.f13487c);
    }

    public final int hashCode() {
        C1595G c1595g = this.a;
        return this.f13487c.hashCode() + AbstractC0703b.d((((((c1595g == null ? 0 : c1595g.hashCode()) * 961) + 0) * 31) + 0) * 31, 31, this.f13486b);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=" + ((Object) null) + ", scale=" + ((Object) null) + ", hold=" + this.f13486b + ", effectsMap=" + this.f13487c + ')';
    }

    public /* synthetic */ C1602N(C1595G c1595g, AbstractC0832b abstractC0832b, AbstractC0841b abstractC0841b, LinkedHashMap linkedHashMap, int i7) {
        this((i7 & 1) != 0 ? null : c1595g, (i7 & 4) != 0 ? null : abstractC0832b, (i7 & 8) != 0 ? null : abstractC0841b, (i7 & 16) == 0, (i7 & 32) != 0 ? P3.z.f7780k : linkedHashMap);
    }
}
