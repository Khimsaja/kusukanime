package T;

import O.C0486d;
import O.T;
import P3.m;
import java.util.Arrays;
import k4.C1396e;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f8828e = new h(0, 0, new Object[0], null);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f8829b;

    /* renamed from: c, reason: collision with root package name */
    public final V.b f8830c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f8831d;

    public h(int i7, int i8, Object[] objArr, V.b bVar) {
        this.a = i7;
        this.f8829b = i8;
        this.f8830c = bVar;
        this.f8831d = objArr;
    }

    public static h j(int i7, Object obj, Object obj2, int i8, Object obj3, Object obj4, int i9, V.b bVar) {
        if (i9 > 30) {
            return new h(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int I = n6.d.I(i7, i9);
        int I6 = n6.d.I(i8, i9);
        if (I != I6) {
            return new h((1 << I) | (1 << I6), 0, I < I6 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new h(0, 1 << I, new Object[]{j(i7, obj, obj2, i8, obj3, obj4, i9 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i7, int i8, int i9, Object obj, Object obj2, int i10, V.b bVar) {
        Object obj3 = this.f8831d[i7];
        h hVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i7), i9, obj, obj2, i10 + 5, bVar);
        int iT = t(i8);
        int i11 = iT + 1;
        Object[] objArr = this.f8831d;
        Object[] objArr2 = new Object[objArr.length - 1];
        m.Z(0, i7, 6, objArr, objArr2);
        m.W(i7, i7 + 2, i11, objArr, objArr2);
        objArr2[iT - 1] = hVarJ;
        m.W(iT, i11, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f8829b == 0) {
            return this.f8831d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.f8831d.length;
        for (int i7 = iBitCount * 2; i7 < length; i7++) {
            iBitCount += s(i7).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        C1396e c1396eG = e3.c.G(e3.c.L(0, this.f8831d.length), 2);
        int i7 = c1396eG.f12672k;
        int i8 = c1396eG.f12673l;
        int i9 = c1396eG.f12674m;
        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
            while (!l.a(obj, this.f8831d[i7])) {
                if (i7 != i8) {
                    i7 += i9;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i7, int i8, Object obj) {
        int I = 1 << n6.d.I(i7, i8);
        if (h(I)) {
            return l.a(obj, this.f8831d[f(I)]);
        }
        if (!i(I)) {
            return false;
        }
        h hVarS = s(t(I));
        return i8 == 30 ? hVarS.c(obj) : hVarS.d(i7, i8 + 5, obj);
    }

    public final boolean e(h hVar) {
        if (this == hVar) {
            return true;
        }
        if (this.f8829b != hVar.f8829b || this.a != hVar.a) {
            return false;
        }
        int length = this.f8831d.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (this.f8831d[i7] != hVar.f8831d[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i7) {
        return Integer.bitCount((i7 - 1) & this.a) * 2;
    }

    public final Object g(int i7, int i8, Object obj) {
        int I = 1 << n6.d.I(i7, i8);
        if (h(I)) {
            int iF = f(I);
            if (l.a(obj, this.f8831d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(I)) {
            return null;
        }
        h hVarS = s(t(I));
        if (i8 != 30) {
            return hVarS.g(i7, i8 + 5, obj);
        }
        C1396e c1396eG = e3.c.G(e3.c.L(0, hVarS.f8831d.length), 2);
        int i9 = c1396eG.f12672k;
        int i10 = c1396eG.f12673l;
        int i11 = c1396eG.f12674m;
        if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
            return null;
        }
        while (!l.a(obj, hVarS.f8831d[i9])) {
            if (i9 == i10) {
                return null;
            }
            i9 += i11;
        }
        return hVarS.x(i9);
    }

    public final boolean h(int i7) {
        return (i7 & this.a) != 0;
    }

    public final boolean i(int i7) {
        return (i7 & this.f8829b) != 0;
    }

    public final h k(int i7, W.c cVar) {
        cVar.m(cVar.f9509o - 1);
        cVar.f9507m = x(i7);
        Object[] objArr = this.f8831d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f8830c != cVar.f9505k) {
            return new h(0, 0, n6.d.o(i7, objArr), cVar.f9505k);
        }
        this.f8831d = n6.d.o(i7, objArr);
        return this;
    }

    public final h l(int i7, Object obj, Object obj2, int i8, W.c cVar) {
        W.c cVar2;
        h hVarL;
        int I = 1 << n6.d.I(i7, i8);
        boolean zH = h(I);
        V.b bVar = this.f8830c;
        if (zH) {
            int iF = f(I);
            if (!l.a(obj, this.f8831d[iF])) {
                cVar.m(cVar.f9509o + 1);
                V.b bVar2 = cVar.f9505k;
                if (bVar != bVar2) {
                    return new h(this.a ^ I, this.f8829b | I, a(iF, I, i7, obj, obj2, i8, bVar2), bVar2);
                }
                this.f8831d = a(iF, I, i7, obj, obj2, i8, bVar2);
                this.a ^= I;
                this.f8829b |= I;
                return this;
            }
            cVar.f9507m = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == cVar.f9505k) {
                this.f8831d[iF + 1] = obj2;
                return this;
            }
            cVar.f9508n++;
            Object[] objArr = this.f8831d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            l.e("copyOf(this, size)", objArrCopyOf);
            objArrCopyOf[iF + 1] = obj2;
            return new h(this.a, this.f8829b, objArrCopyOf, cVar.f9505k);
        }
        if (!i(I)) {
            cVar.m(cVar.f9509o + 1);
            V.b bVar3 = cVar.f9505k;
            int iF2 = f(I);
            if (bVar != bVar3) {
                return new h(this.a | I, this.f8829b, n6.d.i(this.f8831d, iF2, obj, obj2), bVar3);
            }
            this.f8831d = n6.d.i(this.f8831d, iF2, obj, obj2);
            this.a |= I;
            return this;
        }
        int iT = t(I);
        h hVarS = s(iT);
        if (i8 == 30) {
            C1396e c1396eG = e3.c.G(e3.c.L(0, hVarS.f8831d.length), 2);
            int i9 = c1396eG.f12672k;
            int i10 = c1396eG.f12673l;
            int i11 = c1396eG.f12674m;
            if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
                cVar.m(cVar.f9509o + 1);
                hVarL = new h(0, 0, n6.d.i(hVarS.f8831d, 0, obj, obj2), cVar.f9505k);
                cVar2 = cVar;
            } else {
                while (!l.a(obj, hVarS.f8831d[i9])) {
                    if (i9 == i10) {
                        cVar.m(cVar.f9509o + 1);
                        hVarL = new h(0, 0, n6.d.i(hVarS.f8831d, 0, obj, obj2), cVar.f9505k);
                        break;
                    }
                    i9 += i11;
                }
                cVar.f9507m = hVarS.x(i9);
                if (hVarS.f8830c == cVar.f9505k) {
                    hVarS.f8831d[i9 + 1] = obj2;
                    hVarL = hVarS;
                } else {
                    cVar.f9508n++;
                    Object[] objArr2 = hVarS.f8831d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    l.e("copyOf(this, size)", objArrCopyOf2);
                    objArrCopyOf2[i9 + 1] = obj2;
                    hVarL = new h(0, 0, objArrCopyOf2, cVar.f9505k);
                }
                cVar2 = cVar;
            }
        } else {
            cVar2 = cVar;
            hVarL = hVarS.l(i7, obj, obj2, i8 + 5, cVar2);
        }
        return hVarS == hVarL ? this : r(iT, hVarL, cVar2.f9505k);
    }

    public final h m(h hVar, int i7, V.a aVar, W.c cVar) {
        int i8;
        Object[] objArr;
        int i9;
        h hVarJ;
        if (this == hVar) {
            aVar.a += b();
            return this;
        }
        int i10 = 1;
        int i11 = 0;
        if (i7 > 30) {
            V.b bVar = cVar.f9505k;
            int i12 = hVar.f8829b;
            Object[] objArr2 = this.f8831d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + hVar.f8831d.length);
            l.e("copyOf(this, newSize)", objArrCopyOf);
            int length = this.f8831d.length;
            C1396e c1396eG = e3.c.G(e3.c.L(0, hVar.f8831d.length), 2);
            int i13 = c1396eG.f12672k;
            int i14 = c1396eG.f12673l;
            int i15 = c1396eG.f12674m;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (c(hVar.f8831d[i13])) {
                        aVar.a++;
                    } else {
                        Object[] objArr3 = hVar.f8831d;
                        objArrCopyOf[length] = objArr3[i13];
                        objArrCopyOf[length + 1] = objArr3[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length != this.f8831d.length) {
                if (length == hVar.f8831d.length) {
                    return hVar;
                }
                if (length == objArrCopyOf.length) {
                    return new h(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                l.e("copyOf(this, newSize)", objArrCopyOf2);
                return new h(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i16 = this.f8829b | hVar.f8829b;
            int i17 = this.a;
            int i18 = hVar.a;
            int i19 = (i17 ^ i18) & (~i16);
            int i20 = i17 & i18;
            int i21 = i19;
            while (i20 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i20);
                if (l.a(this.f8831d[f(iLowestOneBit)], hVar.f8831d[hVar.f(iLowestOneBit)])) {
                    i21 |= iLowestOneBit;
                } else {
                    i16 |= iLowestOneBit;
                }
                i20 ^= iLowestOneBit;
            }
            if (!((i16 & i21) == 0)) {
                C0486d.U("Check failed.");
                throw null;
            }
            h hVar2 = (l.a(this.f8830c, cVar.f9505k) && this.a == i21 && this.f8829b == i16) ? this : new h(i21, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i21) * 2)], null);
            int i22 = i16;
            int i23 = 0;
            while (i22 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr4 = hVar2.f8831d;
                int length2 = (objArr4.length - i10) - i23;
                if (i(iLowestOneBit2)) {
                    hVarJ = s(t(iLowestOneBit2));
                    if (hVar.i(iLowestOneBit2)) {
                        hVarJ = hVarJ.m(hVar.s(hVar.t(iLowestOneBit2)), i7 + 5, aVar, cVar);
                        i8 = iLowestOneBit2;
                        objArr = objArr4;
                    } else if (hVar.h(iLowestOneBit2)) {
                        int iF = hVar.f(iLowestOneBit2);
                        Object obj = hVar.f8831d[iF];
                        Object objX = hVar.x(iF);
                        i9 = i10;
                        int i24 = cVar.f9509o;
                        int iHashCode = obj != null ? obj.hashCode() : i11;
                        objArr = objArr4;
                        i8 = iLowestOneBit2;
                        hVarJ = hVarJ.l(iHashCode, obj, objX, i7 + 5, cVar);
                        if (cVar.f9509o == i24) {
                            aVar.a++;
                        }
                    } else {
                        i8 = iLowestOneBit2;
                        objArr = objArr4;
                    }
                    i9 = i10;
                } else {
                    i8 = iLowestOneBit2;
                    objArr = objArr4;
                    i9 = i10;
                    if (hVar.i(i8)) {
                        h hVarS = hVar.s(hVar.t(i8));
                        if (h(i8)) {
                            int iF2 = f(i8);
                            Object obj2 = this.f8831d[iF2];
                            int i25 = i7 + 5;
                            if (hVarS.d(obj2 != null ? obj2.hashCode() : 0, i25, obj2)) {
                                aVar.a++;
                                hVarJ = hVarS;
                            } else {
                                hVarJ = hVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i25, cVar);
                            }
                        } else {
                            hVarJ = hVarS;
                        }
                    } else {
                        int iF3 = f(i8);
                        Object obj3 = this.f8831d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = hVar.f(i8);
                        Object obj4 = hVar.f8831d[iF4];
                        hVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, hVar.x(iF4), i7 + 5, cVar.f9505k);
                    }
                }
                objArr[length2] = hVarJ;
                i23++;
                i22 ^= i8;
                i10 = i9;
                i11 = 0;
            }
            int i26 = 0;
            while (i21 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i21);
                int i27 = i26 * 2;
                if (hVar.h(iLowestOneBit3)) {
                    int iF5 = hVar.f(iLowestOneBit3);
                    Object[] objArr5 = hVar2.f8831d;
                    objArr5[i27] = hVar.f8831d[iF5];
                    objArr5[i27 + 1] = hVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = hVar2.f8831d;
                    objArr6[i27] = this.f8831d[iF6];
                    objArr6[i27 + 1] = x(iF6);
                }
                i26++;
                i21 ^= iLowestOneBit3;
            }
            if (!e(hVar2)) {
                return hVar.e(hVar2) ? hVar : hVar2;
            }
        }
        return this;
    }

    public final h n(int i7, Object obj, int i8, W.c cVar) {
        h hVarN;
        int I = 1 << n6.d.I(i7, i8);
        if (h(I)) {
            int iF = f(I);
            if (l.a(obj, this.f8831d[iF])) {
                return p(iF, I, cVar);
            }
        } else if (i(I)) {
            int iT = t(I);
            h hVarS = s(iT);
            if (i8 == 30) {
                C1396e c1396eG = e3.c.G(e3.c.L(0, hVarS.f8831d.length), 2);
                int i9 = c1396eG.f12672k;
                int i10 = c1396eG.f12673l;
                int i11 = c1396eG.f12674m;
                if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
                    hVarN = hVarS;
                    break;
                }
                while (!l.a(obj, hVarS.f8831d[i9])) {
                    if (i9 == i10) {
                        hVarN = hVarS;
                        break;
                    }
                    i9 += i11;
                }
                hVarN = hVarS.k(i9, cVar);
            } else {
                hVarN = hVarS.n(i7, obj, i8 + 5, cVar);
            }
            return q(hVarS, hVarN, iT, I, cVar.f9505k);
        }
        return this;
    }

    public final h o(int i7, Object obj, Object obj2, int i8, W.c cVar) {
        h hVar;
        h hVarO;
        int I = 1 << n6.d.I(i7, i8);
        if (h(I)) {
            int iF = f(I);
            if (l.a(obj, this.f8831d[iF]) && l.a(obj2, x(iF))) {
                return p(iF, I, cVar);
            }
        } else if (i(I)) {
            int iT = t(I);
            h hVarS = s(iT);
            if (i8 == 30) {
                C1396e c1396eG = e3.c.G(e3.c.L(0, hVarS.f8831d.length), 2);
                int i9 = c1396eG.f12672k;
                int i10 = c1396eG.f12673l;
                int i11 = c1396eG.f12674m;
                if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
                    hVarO = hVarS;
                    hVar = hVarS;
                } else {
                    while (true) {
                        if (!l.a(obj, hVarS.f8831d[i9]) || !l.a(obj2, hVarS.x(i9))) {
                            if (i9 == i10) {
                                break;
                            }
                            i9 += i11;
                        } else {
                            hVarO = hVarS.k(i9, cVar);
                            break;
                        }
                    }
                    hVarO = hVarS;
                    hVar = hVarS;
                }
            } else {
                hVar = hVarS;
                hVarO = hVar.o(i7, obj, obj2, i8 + 5, cVar);
            }
            return q(hVar, hVarO, iT, I, cVar.f9505k);
        }
        return this;
    }

    public final h p(int i7, int i8, W.c cVar) {
        cVar.m(cVar.f9509o - 1);
        cVar.f9507m = x(i7);
        Object[] objArr = this.f8831d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f8830c != cVar.f9505k) {
            return new h(i8 ^ this.a, this.f8829b, n6.d.o(i7, objArr), cVar.f9505k);
        }
        this.f8831d = n6.d.o(i7, objArr);
        this.a ^= i8;
        return this;
    }

    public final h q(h hVar, h hVar2, int i7, int i8, V.b bVar) {
        V.b bVar2 = this.f8830c;
        if (hVar2 != null) {
            return (bVar2 == bVar || hVar != hVar2) ? r(i7, hVar2, bVar) : this;
        }
        Object[] objArr = this.f8831d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new h(this.a, i8 ^ this.f8829b, n6.d.p(i7, objArr), bVar);
        }
        this.f8831d = n6.d.p(i7, objArr);
        this.f8829b ^= i8;
        return this;
    }

    public final h r(int i7, h hVar, V.b bVar) {
        Object[] objArr = this.f8831d;
        if (objArr.length == 1 && hVar.f8831d.length == 2 && hVar.f8829b == 0) {
            hVar.a = this.f8829b;
            return hVar;
        }
        if (this.f8830c == bVar) {
            objArr[i7] = hVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l.e("copyOf(this, size)", objArrCopyOf);
        objArrCopyOf[i7] = hVar;
        return new h(this.a, this.f8829b, objArrCopyOf, bVar);
    }

    public final h s(int i7) {
        Object obj = this.f8831d[i7];
        l.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>", obj);
        return (h) obj;
    }

    public final int t(int i7) {
        return (this.f8831d.length - 1) - Integer.bitCount((i7 - 1) & this.f8829b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        r14.f2542m = w(r12, r4, (T.h) r14.f2542m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F5.o u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.h.u(int, int, java.lang.Object, java.lang.Object):F5.o");
    }

    public final h v(int i7, T t7, int i8) {
        h hVarV;
        int I = 1 << n6.d.I(i7, i8);
        if (h(I)) {
            int iF = f(I);
            if (l.a(t7, this.f8831d[iF])) {
                Object[] objArr = this.f8831d;
                if (objArr.length != 2) {
                    return new h(this.a ^ I, this.f8829b, n6.d.o(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(I)) {
            int iT = t(I);
            h hVarS = s(iT);
            if (i8 == 30) {
                C1396e c1396eG = e3.c.G(e3.c.L(0, hVarS.f8831d.length), 2);
                int i9 = c1396eG.f12672k;
                int i10 = c1396eG.f12673l;
                int i11 = c1396eG.f12674m;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!l.a(t7, hVarS.f8831d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    Object[] objArr2 = hVarS.f8831d;
                    hVarV = objArr2.length == 2 ? null : new h(0, 0, n6.d.o(i9, objArr2), null);
                }
                hVarV = hVarS;
                break;
            }
            hVarV = hVarS.v(i7, t7, i8 + 5);
            if (hVarV == null) {
                Object[] objArr3 = this.f8831d;
                if (objArr3.length != 1) {
                    return new h(this.a, I ^ this.f8829b, n6.d.p(iT, objArr3), null);
                }
                return null;
            }
            if (hVarS != hVarV) {
                return w(iT, I, hVarV);
            }
        }
        return this;
    }

    public final h w(int i7, int i8, h hVar) {
        Object[] objArr = hVar.f8831d;
        if (objArr.length != 2 || hVar.f8829b != 0) {
            Object[] objArr2 = this.f8831d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            l.e("copyOf(this, newSize)", objArrCopyOf);
            objArrCopyOf[i7] = hVar;
            return new h(this.a, this.f8829b, objArrCopyOf, null);
        }
        if (this.f8831d.length == 1) {
            hVar.a = this.f8829b;
            return hVar;
        }
        int iF = f(i8);
        Object[] objArr3 = this.f8831d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        l.e("copyOf(this, newSize)", objArrCopyOf2);
        m.W(i7 + 2, i7 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        m.W(iF + 2, iF, i7, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new h(this.a ^ i8, i8 ^ this.f8829b, objArrCopyOf2, null);
    }

    public final Object x(int i7) {
        return this.f8831d[i7 + 1];
    }
}
