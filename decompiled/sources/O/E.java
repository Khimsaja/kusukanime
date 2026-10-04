package O;

import e4.InterfaceC0821a;
import m.C1501v;

/* loaded from: classes.dex */
public final class E extends Y.w implements R0 {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0821a f6990l;

    /* renamed from: m, reason: collision with root package name */
    public final I0 f6991m;

    /* renamed from: n, reason: collision with root package name */
    public D f6992n = new D();

    public E(I0 i02, InterfaceC0821a interfaceC0821a) {
        this.f6990l = interfaceC0821a;
        this.f6991m = i02;
    }

    @Override // Y.v
    public final Y.x a() {
        return this.f6992n;
    }

    public final D f(D d4, Y.h hVar, boolean z7, InterfaceC0821a interfaceC0821a) throws Throwable {
        D d6;
        I0 i02;
        boolean z8;
        boolean z9;
        int i7;
        boolean z10 = true;
        if (!d4.c(this, hVar)) {
            C1501v c1501v = new C1501v();
            B2.l lVar = J0.a;
            W.b bVar = (W.b) lVar.s();
            if (bVar == null) {
                bVar = new W.b();
                lVar.L(bVar);
            }
            int i8 = bVar.a;
            Q.d dVarB = C0486d.B();
            int i9 = dVarB.f7829m;
            if (i9 > 0) {
                Object[] objArr = dVarB.f7827k;
                int i10 = 0;
                do {
                    ((C0508o) objArr[i10]).b();
                    i10++;
                } while (i10 < i9);
            }
            try {
                bVar.a = i8 + 1;
                Object objE = Y.s.e(interfaceC0821a, new D.Y(this, bVar, c1501v, i8, 3));
                bVar.a = i8;
                int i11 = dVarB.f7829m;
                if (i11 > 0) {
                    Object[] objArr2 = dVarB.f7827k;
                    int i12 = 0;
                    do {
                        ((C0508o) objArr2[i12]).a();
                        i12++;
                    } while (i12 < i11);
                }
                Object obj = Y.o.f10002b;
                synchronized (obj) {
                    try {
                        Y.h hVarK = Y.o.k();
                        Object obj2 = d4.f6965f;
                        if (obj2 == D.f6961h || (i02 = this.f6991m) == null || !i02.a(objE, obj2)) {
                            D d7 = this.f6992n;
                            synchronized (obj) {
                                Y.x xVarM = Y.o.m(d7, this);
                                xVarM.a(d7);
                                xVarM.a = hVarK.d();
                                d6 = (D) xVarM;
                                d6.f6964e = c1501v;
                                d6.f6966g = d6.d(this, hVarK);
                                d6.f6965f = objE;
                            }
                            return d6;
                        }
                        d4.f6964e = c1501v;
                        d4.f6966g = d4.d(this, hVarK);
                        d6 = d4;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                W.b bVar2 = (W.b) J0.a.s();
                if (bVar2 == null || bVar2.a != 0) {
                    return d6;
                }
                Y.o.k().m();
                synchronized (obj) {
                    Y.h hVarK2 = Y.o.k();
                    d6.f6962c = hVarK2.d();
                    d6.f6963d = hVarK2.h();
                    return d6;
                }
            } catch (Throwable th2) {
                int i13 = dVarB.f7829m;
                if (i13 > 0) {
                    Object[] objArr3 = dVarB.f7827k;
                    int i14 = 0;
                    do {
                        ((C0508o) objArr3[i14]).a();
                        i14++;
                    } while (i14 < i13);
                }
                throw th2;
            }
        }
        if (z7) {
            Q.d dVarB2 = C0486d.B();
            int i15 = dVarB2.f7829m;
            if (i15 > 0) {
                Object[] objArr4 = dVarB2.f7827k;
                int i16 = 0;
                do {
                    ((C0508o) objArr4[i16]).b();
                    i16++;
                } while (i16 < i15);
            }
            try {
                C1501v c1501v2 = d4.f6964e;
                B2.l lVar2 = J0.a;
                W.b bVar3 = (W.b) lVar2.s();
                if (bVar3 == null) {
                    bVar3 = new W.b();
                    lVar2.L(bVar3);
                }
                int i17 = bVar3.a;
                Object[] objArr5 = c1501v2.f12929b;
                int[] iArr = c1501v2.f12930c;
                long[] jArr = c1501v2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j7 = jArr[i18];
                        Object[] objArr6 = objArr5;
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8;
                            int i20 = 8 - ((~(i18 - length)) >>> 31);
                            int i21 = 0;
                            while (i21 < i20) {
                                if ((j7 & 255) < 128) {
                                    int i22 = (i18 << 3) + i21;
                                    z9 = z10;
                                    try {
                                        Y.v vVar = (Y.v) objArr6[i22];
                                        i7 = i19;
                                        bVar3.a = i17 + iArr[i22];
                                        e4.k kVarF = hVar.f();
                                        if (kVarF != null) {
                                            kVarF.invoke(vVar);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        int i23 = dVarB2.f7829m;
                                        if (i23 > 0) {
                                            Object[] objArr7 = dVarB2.f7827k;
                                            int i24 = 0;
                                            do {
                                                ((C0508o) objArr7[i24]).a();
                                                i24++;
                                            } while (i24 < i23);
                                        }
                                        throw th;
                                    }
                                } else {
                                    z9 = z10;
                                    i7 = i19;
                                }
                                j7 >>= i7;
                                i21++;
                                i19 = i7;
                                z10 = z9;
                            }
                            z8 = z10;
                            if (i20 != i19) {
                                break;
                            }
                        } else {
                            z8 = z10;
                        }
                        if (i18 == length) {
                            break;
                        }
                        i18++;
                        objArr5 = objArr6;
                        z10 = z8;
                    }
                }
                bVar3.a = i17;
                int i25 = dVarB2.f7829m;
                if (i25 > 0) {
                    Object[] objArr8 = dVarB2.f7827k;
                    int i26 = 0;
                    do {
                        ((C0508o) objArr8[i26]).a();
                        i26++;
                    } while (i26 < i25);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return d4;
    }

    public final D g() {
        Y.h hVarK = Y.o.k();
        return f((D) Y.o.j(this.f6992n, hVarK), hVarK, false, this.f6990l);
    }

    @Override // O.R0
    public final Object getValue() {
        e4.k kVarF = Y.o.k().f();
        if (kVarF != null) {
            kVarF.invoke(this);
        }
        Y.h hVarK = Y.o.k();
        return f((D) Y.o.j(this.f6992n, hVarK), hVarK, true, this.f6990l).f6965f;
    }

    @Override // Y.v
    public final void j(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>", xVar);
        this.f6992n = (D) xVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        D d4 = (D) Y.o.i(this.f6992n);
        sb.append(d4.c(this, Y.o.k()) ? String.valueOf(d4.f6965f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
