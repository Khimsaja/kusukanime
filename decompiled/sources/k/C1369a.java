package k;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369a implements Iterable {

    /* renamed from: k, reason: collision with root package name */
    public C1371c f12546k;

    /* renamed from: l, reason: collision with root package name */
    public C1371c f12547l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f12548m = new WeakHashMap();

    /* renamed from: n, reason: collision with root package name */
    public int f12549n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f12550o = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((k.C1370b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof k.C1369a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k.a r7 = (k.C1369a) r7
            int r1 = r6.f12549n
            int r3 = r7.f12549n
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            k.b r3 = (k.C1370b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            k.b r4 = (k.C1370b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            k.b r7 = (k.C1370b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1369a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C1370b c1370b = (C1370b) it;
            if (!c1370b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c1370b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1370b c1370b = new C1370b(this.f12546k, this.f12547l, 0);
        this.f12548m.put(c1370b, Boolean.FALSE);
        return c1370b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1370b c1370b = (C1370b) it;
            if (!c1370b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1370b.next()).toString());
            if (c1370b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
