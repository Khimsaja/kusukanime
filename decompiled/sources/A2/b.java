package A2;

import A4.j;
import B1.AbstractC0015b;
import B1.B;
import B1.K;
import E4.h;
import H4.u;
import O1.g0;
import P3.F;
import P3.q;
import P3.r;
import P4.l;
import P4.m;
import P4.o;
import R4.C0580k;
import R4.C0591w;
import R4.H;
import W4.e;
import X4.y;
import android.graphics.Typeface;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import b5.C0719a;
import b5.i;
import b5.s;
import b5.x;
import e3.c;
import f1.AbstractC0870c;
import io.ktor.http.ContentDisposition;
import j3.E;
import j3.G;
import j3.X;
import j5.C1349d;
import j5.InterfaceC1350e;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.f;
import l4.InterfaceC1425d;
import l5.C1456i;
import m5.C1516e;
import m5.C1520i;
import m5.C1523l;
import n5.AbstractC1586x;
import n6.d;
import o.AbstractC1598J;
import o.AbstractC1604b;
import o.C1596H;
import o.C1597I;
import p.AbstractC1766r;
import p.F0;
import p.InterfaceC1716C;
import p.InterfaceC1767s;
import p1.p;
import q1.C1845a;
import q1.C1846b;
import s2.InterfaceC1982j;
import u4.C2085A;
import u4.C2086B;
import u4.InterfaceC2099e;
import u4.InterfaceC2118y;
import u4.M;
import u4.P;
import v1.AbstractC2148b;
import v1.C2149c;
import v2.C2150a;
import v4.InterfaceC2154b;
import w5.k;
import x1.C2251c;
import x4.C2272S;
import z4.C2489a;

/* loaded from: classes.dex */
public final class b implements InterfaceC1982j, l, m, InterfaceC1350e, F0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f109k;

    /* renamed from: l, reason: collision with root package name */
    public Object f110l;

    /* renamed from: m, reason: collision with root package name */
    public Object f111m;

    /* renamed from: n, reason: collision with root package name */
    public Object f112n;

    /* renamed from: o, reason: collision with root package name */
    public Object f113o;

    public /* synthetic */ b(int i7, Object obj) {
        this.f109k = i7;
        this.f110l = obj;
    }

    @Override // P4.m
    public void S(W4.b bVar, e eVar) {
        ((ArrayList) this.f110l).add(new i(bVar, eVar));
    }

    @Override // p.D0
    public long b(AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        f it = c.L(0, abstractC1766r.b()).iterator();
        long jMax = 0;
        while (it.f12677m) {
            int iA = it.a();
            jMax = Math.max(jMax, ((InterfaceC1767s) this.f110l).get(iA).d(abstractC1766r.a(iA), abstractC1766r2.a(iA), abstractC1766r3.a(iA)));
        }
        return jMax;
    }

    public synchronized ExecutorService c() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f110l) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = g6.b.f11776f + " Dispatcher";
                kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
                this.f110l = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new g6.a(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f110l;
            kotlin.jvm.internal.l.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    @Override // p.D0
    public AbstractC1766r d(AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        if (((AbstractC1766r) this.f113o) == null) {
            this.f113o = abstractC1766r3.c();
        }
        AbstractC1766r abstractC1766r4 = (AbstractC1766r) this.f113o;
        if (abstractC1766r4 == null) {
            kotlin.jvm.internal.l.l("endVelocityVector");
            throw null;
        }
        int iB = abstractC1766r4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            AbstractC1766r abstractC1766r5 = (AbstractC1766r) this.f113o;
            if (abstractC1766r5 == null) {
                kotlin.jvm.internal.l.l("endVelocityVector");
                throw null;
            }
            abstractC1766r5.e(((InterfaceC1767s) this.f110l).get(i7).e(abstractC1766r.a(i7), abstractC1766r2.a(i7), abstractC1766r3.a(i7)), i7);
        }
        AbstractC1766r abstractC1766r6 = (AbstractC1766r) this.f113o;
        if (abstractC1766r6 != null) {
            return abstractC1766r6;
        }
        kotlin.jvm.internal.l.l("endVelocityVector");
        throw null;
    }

    @Override // p.D0
    public AbstractC1766r e(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        if (((AbstractC1766r) this.f112n) == null) {
            this.f112n = abstractC1766r3.c();
        }
        AbstractC1766r abstractC1766r4 = (AbstractC1766r) this.f112n;
        if (abstractC1766r4 == null) {
            kotlin.jvm.internal.l.l("velocityVector");
            throw null;
        }
        int iB = abstractC1766r4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            AbstractC1766r abstractC1766r5 = (AbstractC1766r) this.f112n;
            if (abstractC1766r5 == null) {
                kotlin.jvm.internal.l.l("velocityVector");
                throw null;
            }
            abstractC1766r5.e(((InterfaceC1767s) this.f110l).get(i7).c(j7, abstractC1766r.a(i7), abstractC1766r2.a(i7), abstractC1766r3.a(i7)), i7);
        }
        AbstractC1766r abstractC1766r6 = (AbstractC1766r) this.f112n;
        if (abstractC1766r6 != null) {
            return abstractC1766r6;
        }
        kotlin.jvm.internal.l.l("velocityVector");
        throw null;
    }

    @Override // P4.l, P4.m
    public void f() {
        switch (this.f109k) {
            case 5:
                ArrayList arrayList = (ArrayList) this.f111m;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((L2.e) this.f112n).f6046m).put((o) this.f110l, arrayList);
                    break;
                }
                break;
            case 6:
                ((h) this.f111m).f();
                ((ArrayList) ((b) this.f112n).f110l).add(new C0719a((InterfaceC2154b) q.K0((ArrayList) this.f113o)));
                break;
            default:
                ArrayList arrayList2 = (ArrayList) this.f110l;
                h hVar = (h) this.f113o;
                hVar.getClass();
                kotlin.jvm.internal.l.f("elements", arrayList2);
                e eVar = (e) this.f112n;
                if (eVar != null) {
                    C2272S c2272sY = d.y(eVar, (InterfaceC2099e) hVar.f1944o);
                    if (c2272sY == null) {
                        if (((B0.b) hVar.f1943n).o((W4.b) hVar.f1945p) && kotlin.jvm.internal.l.a(eVar.b(), "value")) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (next instanceof C0719a) {
                                    arrayList3.add(next);
                                }
                            }
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                hVar.f1940k.add((InterfaceC2154b) ((C0719a) it2.next()).a);
                            }
                            break;
                        }
                    } else {
                        HashMap map = (HashMap) hVar.f1942m;
                        List listD = k.d(arrayList2);
                        AbstractC1586x type = c2272sY.getType();
                        kotlin.jvm.internal.l.e("getType(...)", type);
                        map.put(eVar, new x(listD, type));
                        break;
                    }
                }
                break;
        }
    }

    @Override // P4.l
    public void g(e eVar, b5.f fVar) {
        ((h) this.f110l).g(eVar, fVar);
    }

    @Override // p.D0
    public AbstractC1766r i(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        if (((AbstractC1766r) this.f111m) == null) {
            this.f111m = abstractC1766r.c();
        }
        AbstractC1766r abstractC1766r4 = (AbstractC1766r) this.f111m;
        if (abstractC1766r4 == null) {
            kotlin.jvm.internal.l.l("valueVector");
            throw null;
        }
        int iB = abstractC1766r4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            AbstractC1766r abstractC1766r5 = (AbstractC1766r) this.f111m;
            if (abstractC1766r5 == null) {
                kotlin.jvm.internal.l.l("valueVector");
                throw null;
            }
            abstractC1766r5.e(((InterfaceC1767s) this.f110l).get(i7).b(j7, abstractC1766r.a(i7), abstractC1766r2.a(i7), abstractC1766r3.a(i7)), i7);
        }
        AbstractC1766r abstractC1766r6 = (AbstractC1766r) this.f111m;
        if (abstractC1766r6 != null) {
            return abstractC1766r6;
        }
        kotlin.jvm.internal.l.l("valueVector");
        throw null;
    }

    @Override // P4.l
    public void j(e eVar, W4.b bVar, e eVar2) {
        ((h) this.f110l).j(eVar, bVar, eVar2);
    }

    @Override // P4.m
    public void j0(Object obj) {
        ((ArrayList) this.f110l).add(B0.b.c((B0.b) this.f111m, (e) this.f112n, obj));
    }

    @Override // P4.l
    public void k(e eVar, Object obj) {
        ((h) this.f110l).k(eVar, obj);
    }

    @Override // P4.l
    public m l(e eVar) {
        return ((h) this.f110l).l(eVar);
    }

    @Override // P4.l
    public l n(W4.b bVar, e eVar) {
        return ((h) this.f110l).n(bVar, eVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    @Override // s2.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(byte[] r42, int r43, int r44, s2.C1981i r45, B1.InterfaceC0021h r46) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b.p(byte[], int, int, s2.i, B1.h):void");
    }

    @Override // P4.m
    public void q(b5.f fVar) {
        ((ArrayList) this.f110l).add(new s(new b5.q(fVar)));
    }

    @Override // P4.m
    public l q0(W4.b bVar) {
        ArrayList arrayList = new ArrayList();
        return new b(((B0.b) this.f111m).r(bVar, M.f16295i, arrayList), this, arrayList);
    }

    public void r(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        y();
    }

    public void s(j6.f fVar) {
        fVar.f12505l.decrementAndGet();
        r((ArrayDeque) this.f112n, fVar);
    }

    @Override // j5.InterfaceC1350e
    public C1349d s0(W4.b bVar) {
        kotlin.jvm.internal.l.f("classId", bVar);
        C0580k c0580k = (C0580k) ((LinkedHashMap) this.f113o).get(bVar);
        if (c0580k == null) {
            return null;
        }
        ((j) this.f112n).invoke(bVar);
        return new C1349d((T4.h) this.f110l, c0580k, (S4.a) this.f111m, M.f16295i);
    }

    public InterfaceC2099e t(W4.b bVar, List list) {
        kotlin.jvm.internal.l.f("classId", bVar);
        return (InterfaceC2099e) ((C1516e) this.f113o).invoke(new C2086B(bVar, list));
    }

    public AbstractC1766r u(AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2) {
        if (((AbstractC1766r) this.f113o) == null) {
            this.f113o = abstractC1766r.c();
        }
        AbstractC1766r abstractC1766r3 = (AbstractC1766r) this.f113o;
        if (abstractC1766r3 == null) {
            kotlin.jvm.internal.l.l("targetVector");
            throw null;
        }
        int i7 = 0;
        for (int iB = abstractC1766r3.b(); i7 < iB; iB = iB) {
            AbstractC1766r abstractC1766r4 = (AbstractC1766r) this.f113o;
            if (abstractC1766r4 == null) {
                kotlin.jvm.internal.l.l("targetVector");
                throw null;
            }
            float fA = abstractC1766r.a(i7);
            float fA2 = abstractC1766r2.a(i7);
            C1597I c1597i = (C1597I) ((y) this.f110l).f9916l;
            double dB = c1597i.b(fA2);
            double d4 = AbstractC1598J.a;
            float f5 = c1597i.a * c1597i.f13485b;
            abstractC1766r4.e((Math.signum(fA2) * ((float) (Math.exp((d4 / (d4 - 1.0d)) * dB) * f5))) + fA, i7);
            i7++;
        }
        AbstractC1766r abstractC1766r5 = (AbstractC1766r) this.f113o;
        if (abstractC1766r5 != null) {
            return abstractC1766r5;
        }
        kotlin.jvm.internal.l.l("targetVector");
        throw null;
    }

    public AbstractC1766r v(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2) {
        if (((AbstractC1766r) this.f112n) == null) {
            this.f112n = abstractC1766r.c();
        }
        AbstractC1766r abstractC1766r3 = (AbstractC1766r) this.f112n;
        if (abstractC1766r3 == null) {
            kotlin.jvm.internal.l.l("velocityVector");
            throw null;
        }
        int iB = abstractC1766r3.b();
        for (int i7 = 0; i7 < iB; i7++) {
            AbstractC1766r abstractC1766r4 = (AbstractC1766r) this.f112n;
            if (abstractC1766r4 == null) {
                kotlin.jvm.internal.l.l("velocityVector");
                throw null;
            }
            abstractC1766r.getClass();
            long j8 = j7 / 1000000;
            C1596H c1596hA = ((C1597I) ((y) this.f110l).f9916l).a(abstractC1766r2.a(i7));
            long j9 = c1596hA.f13484c;
            abstractC1766r4.e((((Math.signum(c1596hA.a) * AbstractC1604b.a(j9 > 0 ? j8 / j9 : 1.0f).f13488b) * c1596hA.f13483b) / j9) * 1000.0f, i7);
        }
        AbstractC1766r abstractC1766r5 = (AbstractC1766r) this.f112n;
        if (abstractC1766r5 != null) {
            return abstractC1766r5;
        }
        kotlin.jvm.internal.l.l("velocityVector");
        throw null;
    }

    public O w(String str, InterfaceC1425d interfaceC1425d) {
        O o7;
        O oA;
        kotlin.jvm.internal.l.f("modelClass", interfaceC1425d);
        kotlin.jvm.internal.l.f("key", str);
        synchronized (((C2251c) this.f113o)) {
            try {
                V v5 = (V) this.f110l;
                v5.getClass();
                o7 = (O) v5.a.get(str);
                if (interfaceC1425d.m(o7)) {
                    Object obj = (Q) this.f111m;
                    if (obj instanceof T) {
                        kotlin.jvm.internal.l.c(o7);
                        ((T) obj).d(o7);
                    }
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel", o7);
                } else {
                    C2149c c2149c = new C2149c((AbstractC2148b) this.f112n);
                    c2149c.a.put(U.f10726b, str);
                    Q q6 = (Q) this.f111m;
                    try {
                        try {
                            oA = q6.c(interfaceC1425d, c2149c);
                        } catch (AbstractMethodError unused) {
                            oA = q6.b(n6.m.F(interfaceC1425d), c2149c);
                        }
                    } catch (AbstractMethodError unused2) {
                        oA = q6.a(n6.m.F(interfaceC1425d));
                    }
                    o7 = oA;
                    V v7 = (V) this.f110l;
                    v7.getClass();
                    kotlin.jvm.internal.l.f("viewModel", o7);
                    O o8 = (O) v7.a.put(str, o7);
                    if (o8 != null) {
                        o8.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o7;
    }

    public boolean x(P p7) {
        kotlin.jvm.internal.l.f("descriptor", p7);
        if (kotlin.jvm.internal.l.a((P) this.f111m, p7)) {
            return true;
        }
        b bVar = (b) this.f110l;
        return bVar != null ? bVar.x(p7) : false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y() {
        /*
            r8 = this;
            byte[] r0 = g6.b.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.f111m     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.l.e(r2, r1)     // Catch: java.lang.Throwable -> L49
        L15:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L49
            j6.f r2 = (j6.f) r2     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r8.f112n     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L49
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L49
            r4 = 64
            if (r3 >= r4) goto L4b
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f12505l     // Catch: java.lang.Throwable -> L49
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L49
            r4 = 5
            if (r3 >= r4) goto L15
            r1.remove()     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f12505l     // Catch: java.lang.Throwable -> L49
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L49
            r0.add(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r8.f112n     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L49
            r3.add(r2)     // Catch: java.lang.Throwable -> L49
            goto L15
        L49:
            r0 = move-exception
            goto La8
        L4b:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r8.f112n     // Catch: java.lang.Throwable -> La5
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> La5
            r1.size()     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = r8.f113o     // Catch: java.lang.Throwable -> La5
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> La5
            r1.size()     // Catch: java.lang.Throwable -> La5
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L61:
            if (r2 >= r1) goto La4
            java.lang.Object r3 = r0.get(r2)
            j6.f r3 = (j6.f) r3
            java.util.concurrent.ExecutorService r4 = r8.c()
            r3.getClass()
            j6.i r5 = r3.f12506m
            f6.A r6 = r5.f12509k
            A2.b r6 = r6.f11447k
            byte[] r6 = g6.b.a
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L7e java.lang.Throwable -> L9b
            r4.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L7e java.lang.Throwable -> L9b
            goto L98
        L7e:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L9b
            r6.initCause(r4)     // Catch: java.lang.Throwable -> L9b
            r5.i(r6)     // Catch: java.lang.Throwable -> L9b
            f6.g r4 = r3.f12504k     // Catch: java.lang.Throwable -> L9b
            r4.onFailure(r5, r6)     // Catch: java.lang.Throwable -> L9b
            f6.A r4 = r5.f12509k
            A2.b r4 = r4.f11447k
            r4.s(r3)
        L98:
            int r2 = r2 + 1
            goto L61
        L9b:
            r0 = move-exception
            f6.A r1 = r5.f12509k
            A2.b r1 = r1.f11447k
            r1.s(r3)
            throw r0
        La4:
            return
        La5:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> L49
        La8:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b.y():void");
    }

    public h z(int i7, W4.b bVar, C2489a c2489a) {
        o oVar = new o(((o) this.f110l).a + '@' + i7);
        L2.e eVar = (L2.e) this.f113o;
        List arrayList = (List) ((HashMap) eVar.f6046m).get(oVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) eVar.f6046m).put(oVar, arrayList);
        }
        return ((B0.b) eVar.f6045l).s(bVar, c2489a, arrayList);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f109k = i7;
        this.f110l = obj;
        this.f111m = obj2;
        this.f112n = obj3;
        this.f113o = obj4;
    }

    public b(C1523l c1523l, InterfaceC2118y interfaceC2118y) {
        this.f109k = 15;
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        this.f110l = c1523l;
        this.f111m = interfaceC2118y;
        this.f112n = c1523l.b(new C2085A(this, 0));
        this.f113o = c1523l.b(new C2085A(this, 1));
    }

    public b(H h7, T4.h hVar, S4.a aVar, j jVar) {
        this.f109k = 9;
        this.f110l = hVar;
        this.f111m = aVar;
        this.f112n = jVar;
        List list = h7.f8175q;
        kotlin.jvm.internal.l.e("getClass_List(...)", list);
        int I = F.I(r.p(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(I < 16 ? 16 : I);
        for (Object obj : list) {
            linkedHashMap.put(AbstractC0870c.R((T4.h) this.f110l, ((C0580k) obj).f8546o), obj);
        }
        this.f113o = linkedHashMap;
    }

    public b(V v5, Q q6, AbstractC2148b abstractC2148b) {
        this.f109k = 16;
        kotlin.jvm.internal.l.f("store", v5);
        kotlin.jvm.internal.l.f("defaultExtras", abstractC2148b);
        this.f110l = v5;
        this.f111m = q6;
        this.f112n = abstractC2148b;
        this.f113o = new C2251c();
    }

    public b(int i7) {
        this.f109k = i7;
        switch (i7) {
            case 17:
                this.f110l = new B();
                this.f111m = new B();
                this.f112n = new C2150a();
                break;
            default:
                this.f111m = new ArrayDeque();
                this.f112n = new ArrayDeque();
                this.f113o = new ArrayDeque();
                break;
        }
    }

    public b(List list) throws NumberFormatException {
        int i7;
        this.f109k = 0;
        this.f110l = new B();
        this.f111m = new B();
        a aVar = new a();
        this.f112n = aVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i8 = K.a;
        for (String str : strTrim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] strArrSplit = str.substring(9).split(",", -1);
                aVar.f103d = new int[strArrSplit.length];
                for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                    int[] iArr = aVar.f103d;
                    try {
                        i7 = Integer.parseInt(strArrSplit[i9].trim(), 16);
                    } catch (RuntimeException unused) {
                        i7 = 0;
                    }
                    iArr[i9] = i7;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrSplit2 = str.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        aVar.f104e = Integer.parseInt(strArrSplit2[0]);
                        aVar.f105f = Integer.parseInt(strArrSplit2[1]);
                        aVar.f101b = true;
                    } catch (RuntimeException e7) {
                        AbstractC0015b.w("VobsubParser", "Parsing IDX failed", e7);
                    }
                }
            }
        }
    }

    public b(Typeface typeface, C1846b c1846b) {
        int i7;
        int i8;
        int i9;
        int i10;
        this.f109k = 14;
        this.f113o = typeface;
        this.f110l = c1846b;
        this.f112n = new p(1024);
        int iA = c1846b.a(6);
        if (iA != 0) {
            int i11 = iA + c1846b.f7972k;
            i7 = ((ByteBuffer) c1846b.f7975n).getInt(((ByteBuffer) c1846b.f7975n).getInt(i11) + i11);
        } else {
            i7 = 0;
        }
        this.f111m = new char[i7 * 2];
        int iA2 = c1846b.a(6);
        if (iA2 != 0) {
            int i12 = iA2 + c1846b.f7972k;
            i8 = ((ByteBuffer) c1846b.f7975n).getInt(((ByteBuffer) c1846b.f7975n).getInt(i12) + i12);
        } else {
            i8 = 0;
        }
        for (int i13 = 0; i13 < i8; i13++) {
            p1.q qVar = new p1.q(this, i13);
            C1845a c1845aB = qVar.b();
            int iA3 = c1845aB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) c1845aB.f7975n).getInt(iA3 + c1845aB.f7972k) : 0, (char[]) this.f111m, i13 * 2);
            C1845a c1845aB2 = qVar.b();
            int iA4 = c1845aB2.a(16);
            if (iA4 != 0) {
                int i14 = iA4 + c1845aB2.f7972k;
                i9 = ((ByteBuffer) c1845aB2.f7975n).getInt(((ByteBuffer) c1845aB2.f7975n).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                C1845a c1845aB3 = qVar.b();
                int iA5 = c1845aB3.a(16);
                if (iA5 != 0) {
                    int i15 = iA5 + c1845aB3.f7972k;
                    i10 = ((ByteBuffer) c1845aB3.f7975n).getInt(((ByteBuffer) c1845aB3.f7975n).getInt(i15) + i15);
                } else {
                    i10 = 0;
                }
                ((p) this.f112n).a(qVar, 0, i10 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public b(L2.e eVar, o oVar) {
        this.f109k = 5;
        this.f113o = eVar;
        this.f109k = 5;
        this.f112n = eVar;
        this.f110l = oVar;
        this.f111m = new ArrayList();
    }

    public b(K4.a aVar, K4.e eVar, O3.i iVar) {
        this.f109k = 3;
        kotlin.jvm.internal.l.f("typeParameterResolver", eVar);
        this.f110l = aVar;
        this.f111m = eVar;
        this.f112n = iVar;
        this.f113o = new B2.l(this, eVar);
    }

    public b(B0.b bVar, e eVar, h hVar) {
        this.f109k = 7;
        this.f111m = bVar;
        this.f112n = eVar;
        this.f113o = hVar;
        this.f110l = new ArrayList();
    }

    public b(h hVar, b bVar, ArrayList arrayList) {
        this.f109k = 6;
        this.f111m = hVar;
        this.f112n = bVar;
        this.f113o = arrayList;
        this.f110l = hVar;
    }

    public b(X x7, C1.k kVar, C1.k kVar2, C1.k kVar3) {
        Object objS;
        this.f109k = 2;
        if (x7 != null) {
            objS = G.s(x7);
        } else {
            E e7 = G.f12277l;
            objS = X.f12304o;
        }
        this.f110l = objS;
        this.f111m = kVar;
        this.f112n = kVar2;
        this.f113o = kVar3;
    }

    public b(C1456i c1456i) {
        this.f109k = 10;
        this.f113o = c1456i;
        List list = c1456i.f12785o.f8532D;
        kotlin.jvm.internal.l.e("getEnumEntryList(...)", list);
        int I = F.I(r.p(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(I < 16 ? 16 : I);
        for (Object obj : list) {
            linkedHashMap.put(AbstractC0870c.U(c1456i.f12792v.f12439b, ((C0591w) obj).f8632n), obj);
        }
        this.f110l = linkedHashMap;
        C1456i c1456i2 = (C1456i) this.f113o;
        this.f111m = c1456i2.f12792v.a.a.c(new L4.l(7, this, c1456i2));
        C1523l c1523l = ((C1456i) this.f113o).f12792v.a.a;
        u uVar = new u(11, this);
        c1523l.getClass();
        this.f112n = new C1520i(c1523l, uVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC1716C interfaceC1716C) {
        this(12, new y(26, interfaceC1716C));
        this.f109k = 12;
    }

    public b(g0 g0Var, boolean[] zArr) {
        this.f109k = 4;
        this.f110l = g0Var;
        this.f111m = zArr;
        int i7 = g0Var.a;
        this.f112n = new boolean[i7];
        this.f113o = new boolean[i7];
    }
}
