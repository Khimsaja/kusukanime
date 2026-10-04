package I3;

import P3.AbstractC0567h;
import P3.r;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.l;
import l4.InterfaceC1436o;
import o4.C1669a0;

/* loaded from: classes.dex */
public final class b extends AbstractC0567h {

    /* renamed from: k, reason: collision with root package name */
    public final List f4044k;

    /* renamed from: l, reason: collision with root package name */
    public final Object[] f4045l;

    public b(List list, Object[] objArr) {
        l.f("parameterKeys", list);
        this.f4044k = list;
        this.f4045l = objArr;
    }

    @Override // P3.AbstractC0567h
    public final Set a() {
        List list = this.f4044k;
        ArrayList arrayList = new ArrayList(r.p(list, 10));
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                r.X();
                throw null;
            }
            arrayList.add(new AbstractMap.SimpleEntry((InterfaceC1436o) obj, this.f4045l[i7]));
            i7 = i8;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : arrayList) {
            if (((AbstractMap.SimpleEntry) obj2).getValue() != c.a) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof InterfaceC1436o)) {
            return false;
        }
        InterfaceC1436o interfaceC1436o = (InterfaceC1436o) obj;
        l.f("key", interfaceC1436o);
        return this.f4045l[((C1669a0) interfaceC1436o).f13675l] != c.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof InterfaceC1436o)) {
            return null;
        }
        InterfaceC1436o interfaceC1436o = (InterfaceC1436o) obj;
        l.f("key", interfaceC1436o);
        Object obj2 = this.f4045l[((C1669a0) interfaceC1436o).f13675l];
        if (obj2 != c.a) {
            return obj2;
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC1436o) ? obj2 : super.getOrDefault((InterfaceC1436o) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l.f("key", (InterfaceC1436o) obj);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof InterfaceC1436o) {
            return super.remove((InterfaceC1436o) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof InterfaceC1436o) {
            return super.remove((InterfaceC1436o) obj, obj2);
        }
        return false;
    }
}
