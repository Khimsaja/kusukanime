package m;

import f4.InterfaceC0881a;
import f4.InterfaceC0886f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1471A implements InterfaceC0886f, Set, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1472B f12862k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1472B f12863l;

    public C1471A(C1472B c1472b) {
        this.f12863l = c1472b;
        this.f12862k = c1472b;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12863l.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        C1472B c1472b = this.f12863l;
        int i7 = c1472b.f12866d;
        for (Object obj : collection) {
            c1472b.f12864b[c1472b.d(obj)] = obj;
        }
        return i7 != c1472b.f12866d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12863l.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12862k.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12862k.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12862k.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new U.c(this.f12863l);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12863l.j(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            java.lang.String r0 = "elements"
            r1 = r21
            kotlin.jvm.internal.l.f(r0, r1)
            r0 = r20
            m.B r2 = r0.f12863l
            int r3 = r2.f12866d
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r4 = r1.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La2
            java.lang.Object r4 = r1.next()
            if (r4 == 0) goto L27
            r2.getClass()
            int r7 = r4.hashCode()
            goto L28
        L27:
            r7 = r6
        L28:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f12865c
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L36:
            long[] r10 = r2.a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L64:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L87
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f12864b
            r12 = r12[r14]
            boolean r12 = kotlin.jvm.internal.l.a(r12, r4)
            if (r12 == 0) goto L7f
            goto L94
        L7f:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L64
        L87:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9b
            r14 = -1
        L94:
            if (r14 < 0) goto L11
            r2.k(r14)
            goto L11
        L9b:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L36
        La2:
            r21 = r5
            int r1 = r2.f12866d
            if (r3 == r1) goto La9
            return r21
        La9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1471A.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        C1472B c1472b = this.f12863l;
        long[] jArr = c1472b.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i7 = 0;
        boolean z7 = false;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i7 << 3) + i9;
                        if (!collection.contains(c1472b.f12864b[i10])) {
                            c1472b.k(i10);
                            z7 = true;
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return z7;
                }
            }
            if (i7 == length) {
                return z7;
            }
            i7++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12862k.f12866d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
