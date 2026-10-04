package L0;

import A.e;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import p1.p;
import q1.C1845a;

/* loaded from: classes.dex */
public final class b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f5995b;

    /* renamed from: c, reason: collision with root package name */
    public int f5996c;

    /* renamed from: d, reason: collision with root package name */
    public int f5997d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5998e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5999f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6000g;

    public b() {
        this.a = 0;
        this.f5998e = new e(25);
        this.f5999f = new HashMap(0, 0.75f);
        this.f6000g = new LinkedHashSet();
    }

    public Object a(Object obj) {
        synchronized (((e) this.f5998e)) {
            Object obj2 = ((HashMap) this.f5999f).get(obj);
            if (obj2 == null) {
                this.f5997d++;
                return null;
            }
            ((LinkedHashSet) this.f6000g).remove(obj);
            ((LinkedHashSet) this.f6000g).add(obj);
            this.f5996c++;
            return obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Ld9
            java.lang.Object r1 = r4.f5998e
            A.e r1 = (A.e) r1
            monitor-enter(r1)
            int r2 = r4.f()     // Catch: java.lang.Throwable -> L23
            int r2 = r2 + 1
            r4.f5995b = r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r4.f5999f     // Catch: java.lang.Throwable -> L23
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r6 = r2.put(r5, r6)     // Catch: java.lang.Throwable -> L23
            if (r6 == 0) goto L26
            int r2 = r4.f()     // Catch: java.lang.Throwable -> L23
            int r2 = r2 + (-1)
            r4.f5995b = r2     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r5 = move-exception
            goto Ld7
        L26:
            java.lang.Object r2 = r4.f6000g     // Catch: java.lang.Throwable -> L23
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> L23
            boolean r2 = r2.contains(r5)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L37
            java.lang.Object r2 = r4.f6000g     // Catch: java.lang.Throwable -> L23
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> L23
            r2.remove(r5)     // Catch: java.lang.Throwable -> L23
        L37:
            java.lang.Object r2 = r4.f6000g     // Catch: java.lang.Throwable -> L23
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> L23
            r2.add(r5)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)
        L3f:
            java.lang.Object r5 = r4.f5998e
            A.e r5 = (A.e) r5
            monitor-enter(r5)
            int r1 = r4.f()     // Catch: java.lang.Throwable -> L5b
            if (r1 < 0) goto Lcd
            java.lang.Object r1 = r4.f5999f     // Catch: java.lang.Throwable -> L5b
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5e
            int r1 = r4.f()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto Lcd
            goto L5e
        L5b:
            r6 = move-exception
            goto Ld5
        L5e:
            java.lang.Object r1 = r4.f5999f     // Catch: java.lang.Throwable -> L5b
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = r4.f6000g     // Catch: java.lang.Throwable -> L5b
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r1 != r2) goto Lcd
            int r1 = r4.f()     // Catch: java.lang.Throwable -> L5b
            r2 = 16
            if (r1 <= r2) goto Lbd
            java.lang.Object r1 = r4.f5999f     // Catch: java.lang.Throwable -> L5b
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto Lbd
            java.lang.Object r1 = r4.f6000g     // Catch: java.lang.Throwable -> L5b
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = P3.q.q0(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = r4.f5999f     // Catch: java.lang.Throwable -> L5b
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto Lb5
            java.lang.Object r3 = r4.f5999f     // Catch: java.lang.Throwable -> L5b
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L5b
            java.util.Map r3 = kotlin.jvm.internal.B.c(r3)     // Catch: java.lang.Throwable -> L5b
            r3.remove(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r3 = r4.f6000g     // Catch: java.lang.Throwable -> L5b
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.internal.B.a(r3)     // Catch: java.lang.Throwable -> L5b
            r3.remove(r1)     // Catch: java.lang.Throwable -> L5b
            int r3 = r4.f()     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.internal.l.c(r1)     // Catch: java.lang.Throwable -> L5b
            int r3 = r3 + (-1)
            r4.f5995b = r3     // Catch: java.lang.Throwable -> L5b
            goto Lbf
        Lb5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "inconsistent state"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            throw r6     // Catch: java.lang.Throwable -> L5b
        Lbd:
            r1 = r0
            r2 = r1
        Lbf:
            monitor-exit(r5)
            if (r1 != 0) goto Lc5
            if (r2 != 0) goto Lc5
            return r6
        Lc5:
            kotlin.jvm.internal.l.c(r1)
            kotlin.jvm.internal.l.c(r2)
            goto L3f
        Lcd:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "map/keySet size inconsistency"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            throw r6     // Catch: java.lang.Throwable -> L5b
        Ld5:
            monitor-exit(r5)
            throw r6
        Ld7:
            monitor-exit(r1)
            throw r5
        Ld9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.b.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public Object c(Object obj) {
        Object objRemove;
        synchronized (((e) this.f5998e)) {
            objRemove = ((HashMap) this.f5999f).remove(obj);
            ((LinkedHashSet) this.f6000g).remove(obj);
            if (objRemove != null) {
                this.f5995b = f() - 1;
            }
        }
        return objRemove;
    }

    public void d() {
        this.f5995b = 1;
        this.f5999f = (p) this.f5998e;
        this.f5997d = 0;
    }

    public boolean e() {
        C1845a c1845aB = ((p) this.f5999f).f14192b.b();
        int iA = c1845aB.a(6);
        return !(iA == 0 || ((ByteBuffer) c1845aB.f7975n).get(iA + c1845aB.f7972k) == 0) || this.f5996c == 65039;
    }

    public int f() {
        int i7;
        synchronized (((e) this.f5998e)) {
            i7 = this.f5995b;
        }
        return i7;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 0:
                synchronized (((e) this.f5998e)) {
                    try {
                        int i7 = this.f5996c;
                        int i8 = this.f5997d + i7;
                        str = "LruCache[maxSize=16,hits=" + this.f5996c + ",misses=" + this.f5997d + ",hitRate=" + (i8 != 0 ? (i7 * 100) / i8 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public b(p pVar) {
        this.a = 1;
        this.f5995b = 1;
        this.f5998e = pVar;
        this.f5999f = pVar;
    }
}
