package D6;

import B1.C0017d;
import java.lang.reflect.InvocationHandler;

/* loaded from: classes.dex */
public final class W implements InvocationHandler {
    public final Object[] a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0017d f1734b;

    public W(C0017d c0017d) {
        this.f1734b = c0017d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r0 = D6.AbstractC0126u.b(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r9.f318l).put(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
    
        r0 = (D6.AbstractC0126u) r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Ld
            java.lang.Object r7 = r8.invoke(r6, r9)
            return r7
        Ld:
            if (r9 == 0) goto L11
        Lf:
            r3 = r9
            goto L14
        L11:
            java.lang.Object[] r9 = r6.a
            goto Lf
        L14:
            D6.b r9 = D6.O.f1682b
            boolean r0 = r9.f(r8)
            if (r0 == 0) goto L21
            java.lang.Object r7 = r9.e(r7, r8, r3)
            return r7
        L21:
            B1.d r9 = r6.f1734b
        L23:
            java.lang.Object r0 = r9.f318l
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r8)
            boolean r1 = r0 instanceof D6.AbstractC0126u
            if (r1 == 0) goto L33
            D6.u r0 = (D6.AbstractC0126u) r0
        L31:
            r8 = r0
            goto L78
        L33:
            if (r0 != 0) goto L60
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            monitor-enter(r1)
            java.lang.Object r0 = r9.f318l     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r0.putIfAbsent(r8, r1)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L5f
            D6.u r0 = D6.AbstractC0126u.b(r9, r8)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r9 = r9.f318l     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9     // Catch: java.lang.Throwable -> L52
            r9.put(r8, r0)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            goto L31
        L52:
            r0 = move-exception
            r7 = r0
            goto L62
        L55:
            r0 = move-exception
            r7 = r0
            java.lang.Object r9 = r9.f318l     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9     // Catch: java.lang.Throwable -> L52
            r9.remove(r8)     // Catch: java.lang.Throwable -> L52
            throw r7     // Catch: java.lang.Throwable -> L52
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
        L60:
            r1 = r0
            goto L64
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            throw r7
        L64:
            monitor-enter(r1)
            java.lang.Object r0 = r9.f318l     // Catch: java.lang.Throwable -> L71
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L74
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
            goto L23
        L71:
            r0 = move-exception
            r7 = r0
            goto L89
        L74:
            D6.u r0 = (D6.AbstractC0126u) r0     // Catch: java.lang.Throwable -> L71
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
            goto L31
        L78:
            D6.D r0 = new D6.D
            f6.e r4 = r8.f1763b
            D6.n r5 = r8.f1764c
            D6.U r1 = r8.a
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = r8.a(r0, r3)
            return r7
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.W.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
