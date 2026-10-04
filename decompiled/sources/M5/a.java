package M5;

import A3.C0006a;
import F2.G;
import H5.AbstractC0281w;
import H5.InterfaceC0283y;
import H5.J;
import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v.c0;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class a {
    public static final G a = new G("CLOSED", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final G f6568b = new G("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final G f6569c = new G("REUSABLE_CLAIMED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final G f6570d = new G("NO_THREAD_ELEMENTS", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final C0006a f6571e = new C0006a(18);

    /* renamed from: f, reason: collision with root package name */
    public static final C0006a f6572f = new C0006a(19);

    /* renamed from: g, reason: collision with root package name */
    public static final C0006a f6573g = new C0006a(20);

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(q qVar, long j7, e4.n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (qVar.f6600c >= j7 && !qVar.d()) {
                return qVar;
            }
            Object obj = b.a.get(qVar);
            G g4 = a;
            if (obj == g4) {
                return g4;
            }
            q qVar2 = (q) ((b) obj);
            if (qVar2 == null) {
                qVar2 = (q) nVar.invoke(Long.valueOf(qVar.f6600c + 1), qVar);
                do {
                    atomicReferenceFieldUpdater = b.a;
                    if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                        if (qVar.d()) {
                            qVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(qVar) == null);
            }
            qVar = qVar2;
        }
    }

    public static final q c(Object obj) {
        if (obj != a) {
            return (q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(S3.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0283y) it.next()).handleException(hVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    q0.c.j(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            q0.c.j(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(S3.h hVar, Object obj) {
        if (obj == f6570d) {
            return;
        }
        if (!(obj instanceof u)) {
            Object objFold = hVar.fold(null, f6572f);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", objFold);
            c0.e(objFold);
            throw null;
        }
        u uVar = (u) obj;
        Q5.a[] aVarArr = uVar.f6602b;
        int length = aVarArr.length - 1;
        if (length < 0) {
            return;
        }
        Q5.a aVar = aVarArr[length];
        kotlin.jvm.internal.l.c(null);
        Object obj2 = uVar.a[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(S3.c r9, java.lang.Object r10) throws H5.J {
        /*
            boolean r0 = r9 instanceof M5.f
            if (r0 == 0) goto Lae
            M5.f r9 = (M5.f) r9
            java.lang.Throwable r0 = O3.o.a(r10)
            if (r0 != 0) goto Le
            r1 = r10
            goto L14
        Le:
            H5.t r1 = new H5.t
            r2 = 0
            r1.<init>(r0, r2)
        L14:
            H5.w r0 = r9.f6578n
            U3.c r2 = r9.f6579o
            S3.h r3 = r2.getContext()
            boolean r3 = j(r0, r3)
            r4 = 1
            if (r3 == 0) goto L2f
            r9.f6580p = r1
            r9.f3813m = r4
            S3.h r10 = r2.getContext()
            i(r0, r10, r9)
            return
        L2f:
            H5.W r0 = H5.w0.a()
            long r5 = r0.f3828l
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            r9.f6580p = r1
            r9.f3813m = r4
            r0.b0(r9)
            goto La8
        L46:
            r0.d0(r4)
            S3.h r1 = r2.getContext()     // Catch: java.lang.Throwable -> L69
            H5.e0 r3 = H5.C0263e0.f3843k     // Catch: java.lang.Throwable -> L69
            S3.f r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L69
            H5.f0 r1 = (H5.InterfaceC0265f0) r1     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L6b
            boolean r3 = r1.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r1.H()     // Catch: java.lang.Throwable -> L69
            O3.n r10 = P3.r.r(r10)     // Catch: java.lang.Throwable -> L69
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r1 = r9.f6581q     // Catch: java.lang.Throwable -> L69
            S3.h r3 = r2.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = n(r3, r1)     // Catch: java.lang.Throwable -> L69
            F2.G r5 = M5.a.f6570d     // Catch: java.lang.Throwable -> L69
            if (r1 == r5) goto L7e
            H5.C0 r5 = H5.D.F(r2, r3, r1)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r2.resumeWith(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.d0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            g(r3, r1)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.f0()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.a0(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r2 = r5.d0()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto La3
        La0:
            g(r3, r1)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.g(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.a0(r4)
            throw r9
        Lae:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.a.h(S3.c, java.lang.Object):void");
    }

    public static final void i(AbstractC0281w abstractC0281w, S3.h hVar, Runnable runnable) throws J {
        try {
            abstractC0281w.W(hVar, runnable);
        } catch (Throwable th) {
            throw new J(th, abstractC0281w, hVar);
        }
    }

    public static final boolean j(AbstractC0281w abstractC0281w, S3.h hVar) throws J {
        try {
            return abstractC0281w.Y(hVar);
        } catch (Throwable th) {
            throw new J(th, abstractC0281w, hVar);
        }
    }

    public static final long k(String str, long j7, long j8, long j9) {
        String property;
        int i7 = s.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j7;
        }
        Long lV = AbstractC2517v.V(property);
        if (lV == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lV.longValue();
        if (j8 <= jLongValue && jLongValue <= j9) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int l(String str, int i7, int i8) {
        return (int) k(str, i7, 1, (i8 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object m(S3.h hVar) {
        Object objFold = hVar.fold(0, f6571e);
        kotlin.jvm.internal.l.c(objFold);
        return objFold;
    }

    public static final Object n(S3.h hVar, Object obj) {
        if (obj == null) {
            obj = m(hVar);
        }
        if (obj == 0) {
            return f6570d;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new u(((Number) obj).intValue(), hVar), f6573g);
        }
        c0.e(obj);
        throw null;
    }
}
