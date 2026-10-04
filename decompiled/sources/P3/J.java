package P3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public abstract class J extends AbstractC1420H {
    public static LinkedHashSet S(Set set, Object obj) {
        kotlin.jvm.internal.l.f("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(F.I(set.size()));
        boolean z7 = false;
        for (Object obj2 : set) {
            boolean z8 = true;
            if (!z7 && kotlin.jvm.internal.l.a(obj2, obj)) {
                z7 = true;
                z8 = false;
            }
            if (z8) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet T(Set set, Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", set);
        kotlin.jvm.internal.l.f("elements", iterable);
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(F.I(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        v.e0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet U(Set set, Object obj) {
        kotlin.jvm.internal.l.f("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(F.I(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
