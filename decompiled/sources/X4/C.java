package X4;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class C extends AbstractMap {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f9838p = 0;

    /* renamed from: k, reason: collision with root package name */
    public final int f9839k;

    /* renamed from: l, reason: collision with root package name */
    public List f9840l = Collections.EMPTY_LIST;

    /* renamed from: m, reason: collision with root package name */
    public Map f9841m = Collections.EMPTY_MAP;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9842n;

    /* renamed from: o, reason: collision with root package name */
    public volatile I f9843o;

    public C(int i7) {
        this.f9839k = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f9840l
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f9840l
            java.lang.Object r2 = r2.get(r1)
            X4.G r2 = (X4.G) r2
            java.lang.Comparable r2 = r2.f9845k
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f9840l
            java.lang.Object r3 = r3.get(r2)
            X4.G r3 = (X4.G) r3
            java.lang.Comparable r3 = r3.f9845k
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.C.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f9842n) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f9841m.isEmpty() ? F.f9844b : this.f9841m.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f9840l.isEmpty()) {
            this.f9840l.clear();
        }
        if (this.f9841m.isEmpty()) {
            return;
        }
        this.f9841m.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f9841m.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f9841m.isEmpty() && !(this.f9841m instanceof TreeMap)) {
            this.f9841m = new TreeMap();
        }
        return (SortedMap) this.f9841m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((G) this.f9840l.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f9840l.isEmpty();
        int i7 = this.f9839k;
        if (zIsEmpty && !(this.f9840l instanceof ArrayList)) {
            this.f9840l = new ArrayList(i7);
        }
        int i8 = -(iA + 1);
        if (i8 >= i7) {
            return d().put(comparable, obj);
        }
        if (this.f9840l.size() == i7) {
            G g4 = (G) this.f9840l.remove(i7 - 1);
            d().put(g4.f9845k, g4.f9846l);
        }
        this.f9840l.add(i8, new G(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9843o == null) {
            this.f9843o = new I(this, 0);
        }
        return this.f9843o;
    }

    public final Object f(int i7) {
        b();
        Object obj = ((G) this.f9840l.remove(i7)).f9846l;
        if (!this.f9841m.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f9840l;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new G(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((G) this.f9840l.get(iA)).f9846l : this.f9841m.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f9841m.isEmpty()) {
            return null;
        }
        return this.f9841m.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9841m.size() + this.f9840l.size();
    }
}
