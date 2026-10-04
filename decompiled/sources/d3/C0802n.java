package d3;

import P3.z;
import f4.InterfaceC0881a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: d3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802n implements Iterable, InterfaceC0881a {

    /* renamed from: l, reason: collision with root package name */
    public static final C0802n f11315l = new C0802n(z.f7780k);

    /* renamed from: k, reason: collision with root package name */
    public final Map f11316k;

    public C0802n(Map map) {
        this.f11316k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0802n) {
            return kotlin.jvm.internal.l.a(this.f11316k, ((C0802n) obj).f11316k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11316k.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f11316k;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new O3.l(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f11316k + ')';
    }
}
