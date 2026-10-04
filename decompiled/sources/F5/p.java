package F5;

import java.util.Arrays;
import k4.C1396e;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final p f2543e = new p(0, 0, new Object[0], null);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2544b;

    /* renamed from: c, reason: collision with root package name */
    public final A.e f2545c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2546d;

    public p(int i7, int i8, Object[] objArr, A.e eVar) {
        this.a = i7;
        this.f2544b = i8;
        this.f2545c = eVar;
        this.f2546d = objArr;
    }

    public static p k(int i7, Object obj, Object obj2, int i8, Object obj3, Object obj4, int i9, A.e eVar) {
        if (i9 > 30) {
            return new p(0, 0, new Object[]{obj, obj2, obj3, obj4}, eVar);
        }
        int iQ = n6.m.Q(i7, i9);
        int iQ2 = n6.m.Q(i8, i9);
        if (iQ != iQ2) {
            return new p((1 << iQ) | (1 << iQ2), 0, iQ < iQ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, eVar);
        }
        return new p(0, 1 << iQ, new Object[]{k(i7, obj, obj2, i8, obj3, obj4, i9 + 5, eVar)}, eVar);
    }

    public final Object[] a(int i7, int i8, int i9, Object obj, Object obj2, int i10, A.e eVar) {
        Object obj3 = this.f2546d[i7];
        p pVarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, x(i7), i9, obj, obj2, i10 + 5, eVar);
        int iT = t(i8);
        int i11 = iT + 1;
        Object[] objArr = this.f2546d;
        Object[] objArr2 = new Object[objArr.length - 1];
        P3.m.Z(0, i7, 6, objArr, objArr2);
        P3.m.W(i7, i7 + 2, i11, objArr, objArr2);
        objArr2[iT - 1] = pVarK;
        P3.m.W(iT, i11, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f2544b == 0) {
            return this.f2546d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.f2546d.length;
        for (int i7 = iBitCount * 2; i7 < length; i7++) {
            iBitCount += s(i7).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        C1396e c1396eG = e3.c.G(e3.c.L(0, this.f2546d.length), 2);
        int i7 = c1396eG.f12672k;
        int i8 = c1396eG.f12673l;
        int i9 = c1396eG.f12674m;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return -1;
        }
        while (!kotlin.jvm.internal.l.a(obj, this.f2546d[i7])) {
            if (i7 == i8) {
                return -1;
            }
            i7 += i9;
        }
        return i7;
    }

    public final boolean d(int i7, int i8, Object obj) {
        int iQ = 1 << n6.m.Q(i7, i8);
        if (i(iQ)) {
            return kotlin.jvm.internal.l.a(obj, this.f2546d[f(iQ)]);
        }
        if (!j(iQ)) {
            return false;
        }
        p pVarS = s(t(iQ));
        return i8 == 30 ? pVarS.c(obj) != -1 : pVarS.d(i7, i8 + 5, obj);
    }

    public final boolean e(p pVar) {
        if (this == pVar) {
            return true;
        }
        if (this.f2544b != pVar.f2544b || this.a != pVar.a) {
            return false;
        }
        int length = this.f2546d.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (this.f2546d[i7] != pVar.f2546d[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i7) {
        return Integer.bitCount((i7 - 1) & this.a) * 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(F5.p r8, e4.n r9) {
        /*
            r7 = this;
            java.lang.String r0 = "that"
            kotlin.jvm.internal.l.f(r0, r8)
            if (r7 != r8) goto L9
            goto Lc7
        L9:
            int r0 = r7.a
            int r1 = r8.a
            r2 = 0
            if (r0 != r1) goto Lc9
            int r1 = r7.f2544b
            int r3 = r8.f2544b
            if (r1 == r3) goto L18
            goto Lc9
        L18:
            r3 = 2
            if (r0 != 0) goto L6d
            if (r1 != 0) goto L6d
            java.lang.Object[] r0 = r7.f2546d
            int r1 = r0.length
            java.lang.Object[] r4 = r8.f2546d
            int r4 = r4.length
            if (r1 == r4) goto L27
            goto Lc9
        L27:
            int r0 = r0.length
            k4.g r0 = e3.c.L(r2, r0)
            k4.e r0 = e3.c.G(r0, r3)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L3f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3f
            goto Lc7
        L3f:
            k4.f r0 = r0.iterator()
        L43:
            boolean r1 = r0.f12677m
            if (r1 == 0) goto Lc7
            int r1 = r0.a()
            java.lang.Object[] r3 = r8.f2546d
            r3 = r3[r1]
            java.lang.Object r1 = r8.x(r1)
            int r3 = r7.c(r3)
            r4 = -1
            if (r3 == r4) goto L69
            java.lang.Object r3 = r7.x(r3)
            java.lang.Object r1 = r9.invoke(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L6a
        L69:
            r1 = r2
        L6a:
            if (r1 != 0) goto L43
            goto Lc9
        L6d:
            int r0 = java.lang.Integer.bitCount(r0)
            int r0 = r0 * r3
            k4.g r1 = e3.c.L(r2, r0)
            k4.e r1 = e3.c.G(r1, r3)
            int r3 = r1.f12672k
            int r4 = r1.f12673l
            int r1 = r1.f12674m
            if (r1 <= 0) goto L84
            if (r3 <= r4) goto L88
        L84:
            if (r1 >= 0) goto Lb0
            if (r4 > r3) goto Lb0
        L88:
            java.lang.Object[] r5 = r7.f2546d
            r5 = r5[r3]
            java.lang.Object[] r6 = r8.f2546d
            r6 = r6[r3]
            boolean r5 = kotlin.jvm.internal.l.a(r5, r6)
            if (r5 != 0) goto L97
            goto Lc9
        L97:
            java.lang.Object r5 = r7.x(r3)
            java.lang.Object r6 = r8.x(r3)
            java.lang.Object r5 = r9.invoke(r5, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto Lac
            goto Lc9
        Lac:
            if (r3 == r4) goto Lb0
            int r3 = r3 + r1
            goto L88
        Lb0:
            java.lang.Object[] r1 = r7.f2546d
            int r1 = r1.length
        Lb3:
            if (r0 >= r1) goto Lc7
            F5.p r3 = r7.s(r0)
            F5.p r4 = r8.s(r0)
            boolean r3 = r3.g(r4, r9)
            if (r3 != 0) goto Lc4
            goto Lc9
        Lc4:
            int r0 = r0 + 1
            goto Lb3
        Lc7:
            r8 = 1
            return r8
        Lc9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.p.g(F5.p, e4.n):boolean");
    }

    public final Object h(int i7, int i8, Object obj) {
        int iQ = 1 << n6.m.Q(i7, i8);
        if (i(iQ)) {
            int iF = f(iQ);
            if (kotlin.jvm.internal.l.a(obj, this.f2546d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!j(iQ)) {
            return null;
        }
        p pVarS = s(t(iQ));
        if (i8 != 30) {
            return pVarS.h(i7, i8 + 5, obj);
        }
        int iC = pVarS.c(obj);
        if (iC != -1) {
            return pVarS.x(iC);
        }
        return null;
    }

    public final boolean i(int i7) {
        return (i7 & this.a) != 0;
    }

    public final boolean j(int i7) {
        return (i7 & this.f2544b) != 0;
    }

    public final p l(int i7, f fVar) {
        fVar.j(fVar.f2525p - 1);
        fVar.f2523n = x(i7);
        Object[] objArr = this.f2546d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f2545c != fVar.f2521l) {
            return new p(0, 0, n6.m.i(i7, objArr), fVar.f2521l);
        }
        this.f2546d = n6.m.i(i7, objArr);
        return this;
    }

    public final p m(int i7, Object obj, Object obj2, int i8, f fVar) {
        p pVarM;
        int iQ = 1 << n6.m.Q(i7, i8);
        boolean zI = i(iQ);
        A.e eVar = this.f2545c;
        if (zI) {
            int iF = f(iQ);
            if (!kotlin.jvm.internal.l.a(obj, this.f2546d[iF])) {
                fVar.j(fVar.f2525p + 1);
                A.e eVar2 = fVar.f2521l;
                if (eVar != eVar2) {
                    return new p(this.a ^ iQ, this.f2544b | iQ, a(iF, iQ, i7, obj, obj2, i8, eVar2), eVar2);
                }
                this.f2546d = a(iF, iQ, i7, obj, obj2, i8, eVar2);
                this.a ^= iQ;
                this.f2544b |= iQ;
                return this;
            }
            fVar.f2523n = x(iF);
            if (x(iF) != obj2) {
                if (eVar == fVar.f2521l) {
                    this.f2546d[iF + 1] = obj2;
                    return this;
                }
                fVar.f2524o++;
                Object[] objArr = this.f2546d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
                objArrCopyOf[iF + 1] = obj2;
                return new p(this.a, this.f2544b, objArrCopyOf, fVar.f2521l);
            }
        } else {
            if (!j(iQ)) {
                fVar.j(fVar.f2525p + 1);
                A.e eVar3 = fVar.f2521l;
                int iF2 = f(iQ);
                if (eVar != eVar3) {
                    return new p(this.a | iQ, this.f2544b, n6.m.h(this.f2546d, iF2, obj, obj2), eVar3);
                }
                this.f2546d = n6.m.h(this.f2546d, iF2, obj, obj2);
                this.a |= iQ;
                return this;
            }
            int iT = t(iQ);
            p pVarS = s(iT);
            if (i8 == 30) {
                int iC = pVarS.c(obj);
                if (iC != -1) {
                    fVar.f2523n = pVarS.x(iC);
                    if (pVarS.f2545c == fVar.f2521l) {
                        pVarS.f2546d[iC + 1] = obj2;
                        pVarM = pVarS;
                    } else {
                        fVar.f2524o++;
                        Object[] objArr2 = pVarS.f2546d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf2);
                        objArrCopyOf2[iC + 1] = obj2;
                        pVarM = new p(0, 0, objArrCopyOf2, fVar.f2521l);
                    }
                } else {
                    fVar.j(fVar.f2525p + 1);
                    pVarM = new p(0, 0, n6.m.h(pVarS.f2546d, 0, obj, obj2), fVar.f2521l);
                }
            } else {
                pVarM = pVarS.m(i7, obj, obj2, i8 + 5, fVar);
            }
            if (pVarS != pVarM) {
                return w(iT, iQ, fVar.f2521l, pVarM);
            }
        }
        return this;
    }

    public final p n(p pVar, int i7, G5.a aVar, f fVar) {
        Object[] objArr;
        p pVarK;
        kotlin.jvm.internal.l.f("otherNode", pVar);
        if (this == pVar) {
            aVar.a += b();
            return this;
        }
        int i8 = 0;
        if (i7 > 30) {
            A.e eVar = fVar.f2521l;
            Object[] objArr2 = this.f2546d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + pVar.f2546d.length);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            int length = this.f2546d.length;
            C1396e c1396eG = e3.c.G(e3.c.L(0, pVar.f2546d.length), 2);
            int i9 = c1396eG.f12672k;
            int i10 = c1396eG.f12673l;
            int i11 = c1396eG.f12674m;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (c(pVar.f2546d[i9]) != -1) {
                        aVar.a++;
                    } else {
                        Object[] objArr3 = pVar.f2546d;
                        objArrCopyOf[length] = objArr3[i9];
                        objArrCopyOf[length + 1] = objArr3[i9 + 1];
                        length += 2;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.f2546d.length) {
                if (length != pVar.f2546d.length) {
                    if (length == objArrCopyOf.length) {
                        return new p(0, 0, objArrCopyOf, eVar);
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                    kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf2);
                    return new p(0, 0, objArrCopyOf2, eVar);
                }
            }
            return this;
        }
        int i12 = this.f2544b | pVar.f2544b;
        int i13 = this.a;
        int i14 = pVar.a;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        int i17 = i15;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (kotlin.jvm.internal.l.a(this.f2546d[f(iLowestOneBit)], pVar.f2546d[pVar.f(iLowestOneBit)])) {
                i17 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        if ((i12 & i17) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        p pVar2 = (kotlin.jvm.internal.l.a(this.f2545c, fVar.f2521l) && this.a == i17 && this.f2544b == i12) ? this : new p(i17, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i17) * 2)], null);
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr4 = pVar2.f2546d;
            int length2 = (objArr4.length - 1) - i19;
            if (j(iLowestOneBit2)) {
                pVarK = s(t(iLowestOneBit2));
                if (pVar.j(iLowestOneBit2)) {
                    pVarK = pVarK.n(pVar.s(pVar.t(iLowestOneBit2)), i7 + 5, aVar, fVar);
                    objArr = objArr4;
                } else if (pVar.i(iLowestOneBit2)) {
                    int iF = pVar.f(iLowestOneBit2);
                    Object obj = pVar.f2546d[iF];
                    Object objX = pVar.x(iF);
                    int i20 = fVar.f2525p;
                    objArr = objArr4;
                    pVarK = pVarK.m(obj != null ? obj.hashCode() : i8, obj, objX, i7 + 5, fVar);
                    if (fVar.f2525p == i20) {
                        aVar.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (pVar.j(iLowestOneBit2)) {
                    p pVarS = pVar.s(pVar.t(iLowestOneBit2));
                    if (i(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.f2546d[iF2];
                        int i21 = i7 + 5;
                        if (pVarS.d(obj2 != null ? obj2.hashCode() : 0, i21, obj2)) {
                            aVar.a++;
                            pVarK = pVarS;
                        } else {
                            pVarK = pVarS.m(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i21, fVar);
                        }
                    } else {
                        pVarK = pVarS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.f2546d[iF3];
                    Object objX2 = x(iF3);
                    int iF4 = pVar.f(iLowestOneBit2);
                    Object obj4 = pVar.f2546d[iF4];
                    pVarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, pVar.x(iF4), i7 + 5, fVar.f2521l);
                }
            }
            objArr[length2] = pVarK;
            i19++;
            i18 ^= iLowestOneBit2;
            i8 = 0;
        }
        int i22 = 0;
        while (i17 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i17);
            int i23 = i22 * 2;
            if (pVar.i(iLowestOneBit3)) {
                int iF5 = pVar.f(iLowestOneBit3);
                Object[] objArr5 = pVar2.f2546d;
                objArr5[i23] = pVar.f2546d[iF5];
                objArr5[i23 + 1] = pVar.x(iF5);
                if (i(iLowestOneBit3)) {
                    aVar.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = pVar2.f2546d;
                objArr6[i23] = this.f2546d[iF6];
                objArr6[i23 + 1] = x(iF6);
            }
            i22++;
            i17 ^= iLowestOneBit3;
        }
        if (!e(pVar2)) {
            return pVar.e(pVar2) ? pVar : pVar2;
        }
        return this;
    }

    public final p o(int i7, Object obj, int i8, f fVar) {
        int iQ = 1 << n6.m.Q(i7, i8);
        if (i(iQ)) {
            int iF = f(iQ);
            if (kotlin.jvm.internal.l.a(obj, this.f2546d[iF])) {
                return q(iF, iQ, fVar);
            }
        } else if (j(iQ)) {
            int iT = t(iQ);
            p pVarS = s(iT);
            if (i8 == 30) {
                int iC = pVarS.c(obj);
                if (iC != -1) {
                    pVarS = pVarS.l(iC, fVar);
                }
            } else {
                pVarS = pVarS.o(i7, obj, i8 + 5, fVar);
            }
            return r(iT, iQ, fVar.f2521l, pVarS);
        }
        return this;
    }

    public final p p(int i7, Object obj, Object obj2, int i8, f fVar) {
        f fVar2;
        int iQ = 1 << n6.m.Q(i7, i8);
        if (i(iQ)) {
            int iF = f(iQ);
            if (kotlin.jvm.internal.l.a(obj, this.f2546d[iF]) && kotlin.jvm.internal.l.a(obj2, x(iF))) {
                return q(iF, iQ, fVar);
            }
        } else if (j(iQ)) {
            int iT = t(iQ);
            p pVarS = s(iT);
            if (i8 == 30) {
                int iC = pVarS.c(obj);
                if (iC != -1 && kotlin.jvm.internal.l.a(obj2, pVarS.x(iC))) {
                    pVarS = pVarS.l(iC, fVar);
                }
                fVar2 = fVar;
            } else {
                fVar2 = fVar;
                pVarS = pVarS.p(i7, obj, obj2, i8 + 5, fVar2);
            }
            return r(iT, iQ, fVar2.f2521l, pVarS);
        }
        return this;
    }

    public final p q(int i7, int i8, f fVar) {
        fVar.j(fVar.f2525p - 1);
        fVar.f2523n = x(i7);
        Object[] objArr = this.f2546d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f2545c != fVar.f2521l) {
            return new p(i8 ^ this.a, this.f2544b, n6.m.i(i7, objArr), fVar.f2521l);
        }
        this.f2546d = n6.m.i(i7, objArr);
        this.a ^= i8;
        return this;
    }

    public final p r(int i7, int i8, A.e eVar, p pVar) {
        if (pVar != null) {
            return w(i7, i8, eVar, pVar);
        }
        Object[] objArr = this.f2546d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f2545c != eVar) {
            return new p(this.a, i8 ^ this.f2544b, n6.m.j(i7, objArr), eVar);
        }
        this.f2546d = n6.m.j(i7, objArr);
        this.f2544b ^= i8;
        return this;
    }

    public final p s(int i7) {
        Object obj = this.f2546d[i7];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>", obj);
        return (p) obj;
    }

    public final int t(int i7) {
        return (this.f2546d.length - 1) - Integer.bitCount((i7 - 1) & this.f2544b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (r14 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (r14 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        r14.f2542m = w(r12, r4, null, (F5.p) r14.f2542m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F5.o u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.p.u(int, int, java.lang.Object, java.lang.Object):F5.o");
    }

    public final p v(int i7, int i8, Object obj) {
        p pVarV;
        int iQ = 1 << n6.m.Q(i7, i8);
        if (i(iQ)) {
            int iF = f(iQ);
            if (kotlin.jvm.internal.l.a(obj, this.f2546d[iF])) {
                Object[] objArr = this.f2546d;
                if (objArr.length != 2) {
                    return new p(this.a ^ iQ, this.f2544b, n6.m.i(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (j(iQ)) {
            int iT = t(iQ);
            p pVarS = s(iT);
            if (i8 == 30) {
                int iC = pVarS.c(obj);
                if (iC != -1) {
                    Object[] objArr2 = pVarS.f2546d;
                    pVarV = objArr2.length == 2 ? null : new p(0, 0, n6.m.i(iC, objArr2), null);
                } else {
                    pVarV = pVarS;
                }
            } else {
                pVarV = pVarS.v(i7, i8 + 5, obj);
            }
            if (pVarV == null) {
                Object[] objArr3 = this.f2546d;
                if (objArr3.length != 1) {
                    return new p(this.a, iQ ^ this.f2544b, n6.m.j(iT, objArr3), null);
                }
                return null;
            }
            if (pVarS != pVarV) {
                return w(iT, iQ, null, pVarV);
            }
        }
        return this;
    }

    public final p w(int i7, int i8, A.e eVar, p pVar) {
        Object[] objArr = pVar.f2546d;
        if (objArr.length != 2 || pVar.f2544b != 0) {
            if (eVar != null && this.f2545c == eVar) {
                this.f2546d[i7] = pVar;
                return this;
            }
            Object[] objArr2 = this.f2546d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            objArrCopyOf[i7] = pVar;
            return new p(this.a, this.f2544b, objArrCopyOf, eVar);
        }
        if (this.f2546d.length == 1) {
            pVar.a = this.f2544b;
            return pVar;
        }
        int iF = f(i8);
        Object[] objArr3 = this.f2546d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf2);
        P3.m.W(i7 + 2, i7 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        P3.m.W(iF + 2, iF, i7, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new p(this.a ^ i8, i8 ^ this.f2544b, objArrCopyOf2, eVar);
    }

    public final Object x(int i7) {
        return this.f2546d[i7 + 1];
    }
}
