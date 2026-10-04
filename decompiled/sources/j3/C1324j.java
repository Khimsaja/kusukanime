package j3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: j3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1324j extends C1319e implements SortedSet {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f12355m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324j(T t7, SortedMap sortedMap) {
        super(t7, sortedMap);
        this.f12355m = t7;
    }

    public SortedMap a() {
        return (SortedMap) this.f12344k;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C1324j(this.f12355m, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C1324j(this.f12355m, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C1324j(this.f12355m, a().tailMap(obj));
    }
}
