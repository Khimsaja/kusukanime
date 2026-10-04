package F0;

import b1.AbstractC0703b;
import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import z0.O;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2096k = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    public boolean f2097l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2098m;

    public final boolean a(t tVar) {
        return this.f2096k.containsKey(tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.a(this.f2096k, iVar.f2096k) && this.f2097l == iVar.f2097l && this.f2098m == iVar.f2098m;
    }

    public final Object h(t tVar) {
        Object obj = this.f2096k.get(tVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + tVar + " - consider getOrElse or getOrNull");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2098m) + AbstractC0703b.d(this.f2096k.hashCode() * 31, 31, this.f2097l);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2096k.entrySet().iterator();
    }

    public final void j(t tVar, Object obj) {
        boolean z7 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f2096k;
        if (!z7 || !linkedHashMap.containsKey(tVar)) {
            linkedHashMap.put(tVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(tVar);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", obj2);
        a aVar = (a) obj2;
        a aVar2 = (a) obj;
        String str = aVar2.a;
        if (str == null) {
            str = aVar.a;
        }
        O3.e eVar = aVar2.f2062b;
        if (eVar == null) {
            eVar = aVar.f2062b;
        }
        linkedHashMap.put(tVar, new a(str, eVar));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f2097l) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f2098m) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f2096k.entrySet()) {
            t tVar = (t) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(tVar.a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return O.B(this) + "{ " + ((Object) sb) + " }";
    }
}
