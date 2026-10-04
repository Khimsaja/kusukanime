package G3;

import D4.S;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f2862d;
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f2863b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2864c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f2862d = arrayList;
        arrayList.add(C.a);
        arrayList.add(h.f2804c);
        arrayList.add(C0182b.f2787e);
        arrayList.add(C0182b.f2786d);
        arrayList.add(y.a);
        arrayList.add(g.f2801d);
    }

    public x(S s7) {
        ArrayList arrayList = s7.f1530k;
        int size = arrayList.size();
        ArrayList arrayList2 = f2862d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [G3.j] */
    public final j a(Type type, Set set, String str) {
        v vVar;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeA = H3.e.a(type);
        if (typeA instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) typeA;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    throw new IllegalArgumentException();
                }
                typeA = upperBounds[0];
            }
        }
        Object objAsList = set.isEmpty() ? typeA : Arrays.asList(typeA, set);
        synchronized (this.f2864c) {
            try {
                j jVar = (j) this.f2864c.get(objAsList);
                if (jVar != null) {
                    return jVar;
                }
                w wVar = (w) this.f2863b.get();
                if (wVar == null) {
                    wVar = new w(this);
                    this.f2863b.set(wVar);
                }
                ArrayList arrayList = wVar.a;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    ArrayDeque arrayDeque = wVar.f2859b;
                    if (i7 >= size) {
                        v vVar2 = new v(typeA, str, objAsList);
                        arrayList.add(vVar2);
                        arrayDeque.add(vVar2);
                        vVar = null;
                        break;
                    }
                    vVar = (v) arrayList.get(i7);
                    if (vVar.f2857c.equals(objAsList)) {
                        arrayDeque.add(vVar);
                        ?? r13 = vVar.f2858d;
                        if (r13 != 0) {
                            vVar = r13;
                        }
                    } else {
                        i7++;
                    }
                }
                try {
                    if (vVar != null) {
                        return vVar;
                    }
                    try {
                        int size2 = this.a.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            j jVarA = ((C0181a) this.a.get(i8)).a(typeA, set, this);
                            if (jVarA != null) {
                                ((v) wVar.f2859b.getLast()).f2858d = jVarA;
                                wVar.b(true);
                                return jVarA;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + H3.e.i(typeA, set));
                    } catch (IllegalArgumentException e7) {
                        throw wVar.a(e7);
                    }
                } finally {
                    wVar.b(false);
                }
            } finally {
            }
        }
    }
}
