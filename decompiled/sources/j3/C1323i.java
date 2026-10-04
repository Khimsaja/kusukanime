package j3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: j3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1323i extends C1318d implements SortedMap {

    /* renamed from: o, reason: collision with root package name */
    public SortedSet f12353o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ T f12354p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1323i(T t7, SortedMap sortedMap) {
        super(t7, sortedMap);
        this.f12354p = t7;
    }

    public SortedSet b() {
        return new C1324j(this.f12354p, d());
    }

    @Override // j3.C1318d, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f12353o;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f12353o = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f12335m;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C1323i(this.f12354p, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C1323i(this.f12354p, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C1323i(this.f12354p, d().tailMap(obj));
    }
}
