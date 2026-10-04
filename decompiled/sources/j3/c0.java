package j3;

import io.ktor.http.ContentDisposition;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c0 implements Map, Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final c0 f12326q = new c0(0, null, new Object[0]);

    /* renamed from: k, reason: collision with root package name */
    public transient Z f12327k;

    /* renamed from: l, reason: collision with root package name */
    public transient a0 f12328l;

    /* renamed from: m, reason: collision with root package name */
    public transient b0 f12329m;

    /* renamed from: n, reason: collision with root package name */
    public final transient Object f12330n;

    /* renamed from: o, reason: collision with root package name */
    public final transient Object[] f12331o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int f12332p;

    public c0(int i7, Object obj, Object[] objArr) {
        this.f12330n = obj;
        this.f12331o = objArr;
        this.f12332p = i7;
    }

    public static c0 a(HashMap map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z7 = setEntrySet instanceof Collection;
        C2.H h7 = new C2.H(z7 ? setEntrySet.size() : 4);
        if (z7) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) h7.f667m;
            if (size > objArr.length) {
                h7.f667m = Arrays.copyOf(objArr, AbstractC1314A.e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            h7.m(entry.getKey(), entry.getValue());
        }
        return h7.c();
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final J entrySet() {
        Z z7 = this.f12327k;
        if (z7 != null) {
            return z7;
        }
        Z z8 = new Z(this, this.f12331o, this.f12332p);
        this.f12327k = z8;
        return z8;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        b0 b0Var = this.f12329m;
        if (b0Var == null) {
            b0Var = new b0(this.f12331o, 1, this.f12332p);
            this.f12329m = b0Var;
        }
        return b0Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC1331q.d(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.f12331o
            int r3 = r8.f12332p
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.f12330n
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = j3.AbstractC1331q.n(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = j3.AbstractC1331q.n(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = j3.AbstractC1331q.n(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.c0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1331q.h(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        a0 a0Var = this.f12328l;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this, new b0(this.f12331o, 0, this.f12332p));
        this.f12328l = a0Var2;
        return a0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12332p;
    }

    public final String toString() {
        int i7 = this.f12332p;
        AbstractC1331q.b(i7, ContentDisposition.Parameters.Size);
        StringBuilder sb = new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
        sb.append('{');
        l0 it = ((Z) entrySet()).iterator();
        boolean z7 = true;
        while (true) {
            E e7 = (E) it;
            if (!e7.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) e7.next();
            if (!z7) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z7 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        b0 b0Var = this.f12329m;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this.f12331o, 1, this.f12332p);
        this.f12329m = b0Var2;
        return b0Var2;
    }
}
