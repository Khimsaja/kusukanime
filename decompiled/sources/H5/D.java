package H5;

import A3.C0006a;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: b, reason: collision with root package name */
    public static final F2.G f3797b;

    /* renamed from: c, reason: collision with root package name */
    public static final F2.G f3798c;

    /* renamed from: d, reason: collision with root package name */
    public static final F2.G f3799d;

    /* renamed from: e, reason: collision with root package name */
    public static final F2.G f3800e;

    /* renamed from: f, reason: collision with root package name */
    public static final F2.G f3801f;

    /* renamed from: g, reason: collision with root package name */
    public static final F2.G f3802g;

    /* renamed from: h, reason: collision with root package name */
    public static final F2.G f3803h;
    public static final F2.G a = new F2.G("RESUME_TOKEN", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final P f3804i = new P(false);

    /* renamed from: j, reason: collision with root package name */
    public static final P f3805j = new P(true);

    static {
        int i7 = 1;
        f3797b = new F2.G("REMOVED_TASK", i7);
        f3798c = new F2.G("CLOSED_EMPTY", i7);
        int i8 = 1;
        f3799d = new F2.G("COMPLETING_ALREADY", i8);
        f3800e = new F2.G("COMPLETING_WAITING_CHILDREN", i8);
        f3801f = new F2.G("COMPLETING_RETRY", i8);
        f3802g = new F2.G("TOO_LATE_TO_CANCEL", i8);
        f3803h = new F2.G("SEALED", i8);
    }

    public static final void A(C0270k c0270k, S3.c cVar, boolean z7) {
        Object obj = C0270k.f3853q.get(c0270k);
        Throwable thE = c0270k.e(obj);
        Object objR = thE != null ? P3.r.r(thE) : c0270k.f(obj);
        if (!z7) {
            cVar.resumeWith(objR);
            return;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", cVar);
        M5.f fVar = (M5.f) cVar;
        U3.c cVar2 = fVar.f6579o;
        S3.h context = cVar2.getContext();
        Object objN = M5.a.n(context, fVar.f6581q);
        C0 c0F = objN != M5.a.f6570d ? F(cVar2, context, objN) : null;
        try {
            cVar2.resumeWith(objR);
            if (c0F == null || c0F.d0()) {
                M5.a.g(context, objN);
            }
        } catch (Throwable th) {
            if (c0F == null || c0F.d0()) {
                M5.a.g(context, objN);
            }
            throw th;
        }
    }

    public static final Object B(S3.h hVar, e4.n nVar) throws Throwable {
        W wA;
        S3.h hVarN;
        long jE0;
        Thread threadCurrentThread = Thread.currentThread();
        S3.g gVar = S3.d.f8766k;
        S3.e eVar = (S3.e) hVar.get(gVar);
        S3.i iVar = S3.i.f8767k;
        if (eVar == null) {
            wA = w0.a();
            hVarN = n(iVar, hVar.plus(wA), true);
            O5.e eVar2 = M.a;
            if (hVarN != eVar2 && hVarN.get(gVar) == null) {
                hVarN = hVarN.plus(eVar2);
            }
        } else {
            if (eVar instanceof W) {
            }
            wA = (W) w0.a.get();
            hVarN = n(iVar, hVar, true);
            O5.e eVar3 = M.a;
            if (hVarN != eVar3 && hVarN.get(gVar) == null) {
                hVarN = hVarN.plus(eVar3);
            }
        }
        C0264f c0264f = new C0264f(hVarN, threadCurrentThread, wA);
        c0264f.b0(B.f3790k, c0264f, nVar);
        W w7 = c0264f.f3845o;
        if (w7 != null) {
            int i7 = W.f3827o;
            w7.d0(false);
        }
        while (true) {
            if (w7 != null) {
                try {
                    jE0 = w7.e0();
                } catch (Throwable th) {
                    if (w7 != null) {
                        int i8 = W.f3827o;
                        w7.a0(false);
                    }
                    throw th;
                }
            } else {
                jE0 = Long.MAX_VALUE;
            }
            if (c0264f.J()) {
                break;
            }
            LockSupport.parkNanos(c0264f, jE0);
            if (Thread.interrupted()) {
                c0264f.l(new InterruptedException());
            }
        }
        if (w7 != null) {
            int i9 = W.f3827o;
            w7.a0(false);
        }
        Object objE = E(n0.f3873k.get(c0264f));
        C0278t c0278t = objE instanceof C0278t ? (C0278t) objE : null;
        if (c0278t == null) {
            return objE;
        }
        throw c0278t.a;
    }

    public static final String D(S3.c cVar) {
        Object objR;
        if (cVar instanceof M5.f) {
            return ((M5.f) cVar).toString();
        }
        try {
            objR = cVar + '@' + p(cVar);
        } catch (Throwable th) {
            objR = P3.r.r(th);
        }
        if (O3.o.a(objR) != null) {
            objR = cVar.getClass().getName() + '@' + p(cVar);
        }
        return (String) objR;
    }

    public static final Object E(Object obj) {
        InterfaceC0255a0 interfaceC0255a0;
        C0257b0 c0257b0 = obj instanceof C0257b0 ? (C0257b0) obj : null;
        return (c0257b0 == null || (interfaceC0255a0 = c0257b0.a) == null) ? obj : interfaceC0255a0;
    }

    public static final C0 F(S3.c cVar, S3.h hVar, Object obj) {
        C0 c02 = null;
        if ((cVar instanceof U3.d) && hVar.get(D0.f3806k) != null) {
            U3.d callerFrame = (U3.d) cVar;
            while (true) {
                if ((callerFrame instanceof K) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof C0) {
                    c02 = (C0) callerFrame;
                    break;
                }
            }
            if (c02 != null) {
                c02.f0(hVar, obj);
            }
        }
        return c02;
    }

    public static final Object G(S3.h hVar, e4.n nVar, S3.c cVar) {
        Object objE;
        S3.h context = cVar.getContext();
        S3.h hVarPlus = !((Boolean) hVar.fold(Boolean.FALSE, new C0006a(14))).booleanValue() ? context.plus(hVar) : n(context, hVar, false);
        m(hVarPlus);
        if (hVarPlus == context) {
            M5.p pVar = new M5.p(cVar, hVarPlus);
            objE = n6.d.e0(pVar, true, pVar, nVar);
        } else {
            S3.d dVar = S3.d.f8766k;
            if (kotlin.jvm.internal.l.a(hVarPlus.get(dVar), context.get(dVar))) {
                C0 c02 = new C0(cVar, hVarPlus);
                S3.h hVar2 = c02.f3833m;
                Object objN = M5.a.n(hVar2, null);
                try {
                    Object objE0 = n6.d.e0(c02, true, c02, nVar);
                    M5.a.g(hVar2, objN);
                    objE = objE0;
                } catch (Throwable th) {
                    M5.a.g(hVar2, objN);
                    throw th;
                }
            } else {
                K k7 = new K(cVar, hVarPlus);
                try {
                    M5.a.h(P3.r.E(P3.r.q(k7, k7, nVar)), O3.C.a);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = K.f3812o;
                        int i7 = atomicIntegerFieldUpdater.get(k7);
                        if (i7 != 0) {
                            if (i7 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objE = E(n0.f3873k.get(k7));
                            if (objE instanceof C0278t) {
                                throw ((C0278t) objE).a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(k7, 0, 1)) {
                            objE = T3.a.f9048k;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC1420H.y(th2, k7);
                    throw null;
                }
            }
        }
        T3.a aVar = T3.a.f9048k;
        return objE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(long r6, e4.n r8, U3.c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof H5.A0
            if (r0 == 0) goto L13
            r0 = r9
            H5.A0 r0 = (H5.A0) r0
            int r1 = r0.f3789m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3789m = r1
            goto L18
        L13:
            H5.A0 r0 = new H5.A0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f3788l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f3789m
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.x r6 = r0.f3787k
            P3.r.Y(r9)     // Catch: H5.y0 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            P3.r.Y(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L7f
        L3d:
            kotlin.jvm.internal.x r9 = new kotlin.jvm.internal.x
            r9.<init>()
            r0.f3787k = r9     // Catch: H5.y0 -> L77
            r0.f3789m = r3     // Catch: H5.y0 -> L77
            H5.z0 r2 = new H5.z0     // Catch: H5.y0 -> L77
            r2.<init>(r6, r0)     // Catch: H5.y0 -> L77
            r9.f12720k = r2     // Catch: H5.y0 -> L77
            S3.c r6 = r2.f6598n     // Catch: H5.y0 -> L73
            S3.h r6 = r6.getContext()     // Catch: H5.y0 -> L73
            H5.I r6 = o(r6)     // Catch: H5.y0 -> L73
            long r4 = r2.f3894o     // Catch: H5.y0 -> L73
            S3.h r7 = r2.f3833m     // Catch: H5.y0 -> L73
            H5.N r6 = r6.v(r4, r2, r7)     // Catch: H5.y0 -> L73
            H5.O r7 = new H5.O     // Catch: H5.y0 -> L73
            r0 = 0
            r7.<init>(r0, r6)     // Catch: H5.y0 -> L73
            t(r2, r3, r7)     // Catch: H5.y0 -> L73
            r6 = 0
            java.lang.Object r6 = n6.d.e0(r2, r6, r2, r8)     // Catch: H5.y0 -> L73
            if (r6 != r1) goto L70
            return r1
        L70:
            return r6
        L71:
            r7 = r6
            goto L75
        L73:
            r6 = move-exception
            goto L71
        L75:
            r6 = r9
            goto L79
        L77:
            r7 = move-exception
            goto L75
        L79:
            H5.z0 r8 = r7.f3891k
            java.lang.Object r6 = r6.f12720k
            if (r8 != r6) goto L81
        L7f:
            r6 = 0
            return r6
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.D.H(long, e4.n, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(S3.c r7) {
        /*
            S3.h r0 = r7.getContext()
            m(r0)
            S3.c r7 = P3.r.E(r7)
            boolean r1 = r7 instanceof M5.f
            if (r1 == 0) goto L12
            M5.f r7 = (M5.f) r7
            goto L13
        L12:
            r7 = 0
        L13:
            O3.C r1 = O3.C.a
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L88
        L1a:
            H5.w r2 = r7.f6578n
            boolean r3 = M5.a.j(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.f6580p = r1
            r7.f3813m = r4
            r2.X(r0, r7)
            goto L86
        L2b:
            H5.F0 r3 = new H5.F0
            H5.e0 r5 = H5.F0.f3809l
            r3.<init>(r5)
            S3.h r0 = r0.plus(r3)
            r7.f6580p = r1
            r7.f3813m = r4
            r2.X(r0, r7)
            boolean r0 = r3.f3810k
            if (r0 == 0) goto L86
            H5.W r0 = H5.w0.a()
            P3.l r2 = r0.f3830n
            if (r2 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 == 0) goto L52
            goto L17
        L52:
            long r2 = r0.f3828l
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L5f
            r2 = r4
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L6c
            r7.f6580p = r1
            r7.f3813m = r4
            r0.b0(r7)
            T3.a r7 = T3.a.f9048k
            goto L88
        L6c:
            r0.d0(r4)
            r7.run()     // Catch: java.lang.Throwable -> L7c
        L72:
            boolean r2 = r0.f0()     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L72
        L78:
            r0.a0(r4)
            goto L17
        L7c:
            r2 = move-exception
            r7.g(r2)     // Catch: java.lang.Throwable -> L81
            goto L78
        L81:
            r7 = move-exception
            r0.a0(r4)
            throw r7
        L86:
            T3.a r7 = T3.a.f9048k
        L88:
            T3.a r0 = T3.a.f9048k
            if (r7 != r0) goto L8d
            return r7
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.D.I(S3.c):java.lang.Object");
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static C0276q b() {
        C0276q c0276q = new C0276q(true);
        c0276q.C(null);
        return c0276q;
    }

    public static final M5.c c(S3.h hVar) {
        if (hVar.get(C0263e0.f3843k) == null) {
            hVar = hVar.plus(d());
        }
        return new M5.c(hVar);
    }

    public static h0 d() {
        return new h0(null);
    }

    public static v0 e() {
        return new v0(null);
    }

    public static H f(A a7, S3.h hVar, e4.n nVar, int i7) {
        if ((i7 & 1) != 0) {
            hVar = S3.i.f8767k;
        }
        B b4 = B.f3790k;
        S3.h hVarY = y(a7, hVar);
        B b7 = B.f3790k;
        H h7 = new H(hVarY, true, true);
        h7.b0(b4, h7, nVar);
        return h7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(List list, S3.c cVar) {
        if (list.isEmpty()) {
            return P3.y.f7779k;
        }
        G[] gArr = (G[]) list.toArray(new G[0]);
        C0262e c0262e = new C0262e(gArr);
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        int length = gArr.length;
        C0258c[] c0258cArr = new C0258c[length];
        for (int i7 = 0; i7 < length; i7++) {
            InterfaceC0275p interfaceC0275p = gArr[i7];
            ((n0) interfaceC0275p).start();
            C0258c c0258c = new C0258c(c0262e, c0270k);
            c0258c.f3836p = t(interfaceC0275p, true, c0258c);
            c0258cArr[i7] = c0258c;
        }
        C0260d c0260d = new C0260d(c0258cArr);
        for (int i8 = 0; i8 < length; i8++) {
            C0258c c0258c2 = c0258cArr[i8];
            c0258c2.getClass();
            C0258c.f3834r.set(c0258c2, c0260d);
        }
        if (C0270k.f3853q.get(c0270k) instanceof s0) {
            c0270k.u(c0260d);
        } else {
            c0260d.b();
        }
        Object objQ = c0270k.q();
        T3.a aVar = T3.a.f9048k;
        return objQ;
    }

    public static final void h(A a7, CancellationException cancellationException) {
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) a7.getCoroutineContext().get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            interfaceC0265f0.e(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + a7).toString());
        }
    }

    public static final void i(InterfaceC0265f0 interfaceC0265f0, String str, Throwable th) {
        interfaceC0265f0.e(a(str, th));
    }

    public static final Object j(e4.n nVar, S3.c cVar) {
        M5.p pVar = new M5.p(cVar, cVar.getContext());
        Object objE0 = n6.d.e0(pVar, true, pVar, nVar);
        T3.a aVar = T3.a.f9048k;
        return objE0;
    }

    public static final Object k(long j7, S3.c cVar) {
        O3.C c2 = O3.C.a;
        if (j7 > 0) {
            C0270k c0270k = new C0270k(1, P3.r.E(cVar));
            c0270k.r();
            if (j7 < Long.MAX_VALUE) {
                o(c0270k.f3856o).i(j7, c0270k);
            }
            Object objQ = c0270k.q();
            if (objQ == T3.a.f9048k) {
                return objQ;
            }
        }
        return c2;
    }

    public static final Object l(long j7, S3.c cVar) {
        int i7 = A5.a.f239n;
        long jC = 0;
        boolean z7 = j7 > 0;
        if (z7) {
            jC = A5.a.c(A5.a.f(j7, A5.g.o(999999L, A5.c.f241l)));
        } else if (z7) {
            throw new D6.r();
        }
        Object objK = k(jC, cVar);
        return objK == T3.a.f9048k ? objK : O3.C.a;
    }

    public static final void m(S3.h hVar) {
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) hVar.get(C0263e0.f3843k);
        if (interfaceC0265f0 != null && !interfaceC0265f0.b()) {
            throw interfaceC0265f0.H();
        }
    }

    public static final S3.h n(S3.h hVar, S3.h hVar2, boolean z7) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.fold(bool, new C0006a(14))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.fold(bool, new C0006a(14))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.plus(hVar2);
        }
        S3.i iVar = S3.i.f8767k;
        S3.h hVar3 = (S3.h) hVar.fold(iVar, new C0006a(15));
        Object objFold = hVar2;
        if (zBooleanValue2) {
            objFold = hVar2.fold(iVar, new C0006a(16));
        }
        return hVar3.plus((S3.h) objFold);
    }

    public static final I o(S3.h hVar) {
        S3.f fVar = hVar.get(S3.d.f8766k);
        I i7 = fVar instanceof I ? (I) fVar : null;
        return i7 == null ? F.a : i7;
    }

    public static final String p(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC0265f0 q(S3.h hVar) {
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) hVar.get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            return interfaceC0265f0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final C0270k r(S3.c cVar) {
        C0270k c0270k;
        C0270k c0270k2;
        if (!(cVar instanceof M5.f)) {
            return new C0270k(1, cVar);
        }
        M5.f fVar = (M5.f) cVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.f.f6577r;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            F2.G g4 = M5.a.f6569c;
            c0270k = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, g4);
                c0270k2 = null;
                break;
            }
            if (obj instanceof C0270k) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, g4)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0270k2 = (C0270k) obj;
                break loop0;
            }
            if (obj != g4 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0270k2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0270k.f3853q;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0270k2);
            if (!(obj2 instanceof C0277s) || ((C0277s) obj2).f3881d == null) {
                C0270k.f3852p.set(c0270k2, 536870911);
                atomicReferenceFieldUpdater2.set(c0270k2, C0256b.a);
                c0270k = c0270k2;
            } else {
                c0270k2.n();
            }
            if (c0270k != null) {
                return c0270k;
            }
        }
        return new C0270k(2, cVar);
    }

    public static final void s(S3.h hVar, Throwable th) {
        if (th instanceof J) {
            th = ((J) th).f3811k;
        }
        try {
            InterfaceC0283y interfaceC0283y = (InterfaceC0283y) hVar.get(C0282x.f3887k);
            if (interfaceC0283y != null) {
                interfaceC0283y.handleException(hVar, th);
            } else {
                M5.a.d(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                q0.c.j(runtimeException, th);
                th = runtimeException;
            }
            M5.a.d(hVar, th);
        }
    }

    public static final N t(InterfaceC0265f0 interfaceC0265f0, boolean z7, i0 i0Var) {
        if (interfaceC0265f0 instanceof n0) {
            return ((n0) interfaceC0265f0).D(z7, i0Var);
        }
        return interfaceC0265f0.L(i0Var.j(), z7, new D.x0(1, i0Var, i0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1));
    }

    public static final boolean u(A a7) {
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) a7.getCoroutineContext().get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            return interfaceC0265f0.b();
        }
        return true;
    }

    public static final boolean v(S3.h hVar) {
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) hVar.get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            return interfaceC0265f0.b();
        }
        return true;
    }

    public static final u0 w(A a7, S3.h hVar, B b4, e4.n nVar) {
        S3.h hVarY = y(a7, hVar);
        b4.getClass();
        u0 o0Var = b4 == B.f3791l ? new o0(hVarY, nVar) : new u0(hVarY, true, true);
        o0Var.b0(b4, o0Var, nVar);
        return o0Var;
    }

    public static /* synthetic */ u0 x(A a7, S3.h hVar, e4.n nVar, int i7) {
        B b4 = B.f3793n;
        if ((i7 & 1) != 0) {
            hVar = S3.i.f8767k;
        }
        if ((i7 & 2) != 0) {
            b4 = B.f3790k;
        }
        return w(a7, hVar, b4, nVar);
    }

    public static final S3.h y(A a7, S3.h hVar) {
        S3.h hVarN = n(a7.getCoroutineContext(), hVar, true);
        O5.e eVar = M.a;
        return (hVarN == eVar || hVarN.get(S3.d.f8766k) != null) ? hVarN : hVarN.plus(eVar);
    }

    public static final Object z(Object obj) {
        return obj instanceof C0278t ? P3.r.r(((C0278t) obj).a) : obj;
    }
}
