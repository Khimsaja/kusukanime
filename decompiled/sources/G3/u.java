package G3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public final class u extends AbstractMap implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final q f2847s = new q(0);

    /* renamed from: q, reason: collision with root package name */
    public s f2854q;

    /* renamed from: r, reason: collision with root package name */
    public s f2855r;

    /* renamed from: n, reason: collision with root package name */
    public int f2851n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f2852o = 0;

    /* renamed from: k, reason: collision with root package name */
    public final Comparator f2848k = f2847s;

    /* renamed from: m, reason: collision with root package name */
    public final t f2850m = new t();

    /* renamed from: l, reason: collision with root package name */
    public t[] f2849l = new t[16];

    /* renamed from: p, reason: collision with root package name */
    public int f2853p = 12;

    public final t a(Object obj, boolean z7) {
        int iCompareTo;
        t tVar;
        boolean z8;
        t tVar2;
        t tVar3;
        t tVar4;
        t tVar5;
        t tVar6;
        t[] tVarArr = this.f2849l;
        int iHashCode = obj.hashCode();
        int i7 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i8 = ((i7 >>> 7) ^ i7) ^ (i7 >>> 4);
        boolean z9 = true;
        int length = i8 & (tVarArr.length - 1);
        t tVar7 = tVarArr[length];
        q qVar = f2847s;
        t tVar8 = null;
        Comparator comparator = this.f2848k;
        if (tVar7 != null) {
            Comparable comparable = comparator == qVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = tVar7.f2843p;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return tVar7;
                }
                t tVar9 = iCompareTo < 0 ? tVar7.f2839l : tVar7.f2840m;
                if (tVar9 == null) {
                    break;
                }
                tVar7 = tVar9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z7) {
            return null;
        }
        t tVar10 = this.f2850m;
        if (tVar7 != null) {
            t tVar11 = tVar7;
            tVar = new t(tVar11, obj, i8, tVar10, tVar10.f2842o);
            if (iCompareTo < 0) {
                tVar11.f2839l = tVar;
            } else {
                tVar11.f2840m = tVar;
            }
            b(tVar11, true);
        } else {
            if (comparator == qVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            tVar = new t(tVar7, obj, i8, tVar10, tVar10.f2842o);
            tVarArr[length] = tVar;
        }
        int i9 = this.f2851n;
        this.f2851n = i9 + 1;
        if (i9 > this.f2853p) {
            t[] tVarArr2 = this.f2849l;
            int length2 = tVarArr2.length;
            int i10 = length2 * 2;
            t[] tVarArr3 = new t[i10];
            B1.s sVar = new B1.s(1);
            B1.s sVar2 = new B1.s(1);
            int i11 = 0;
            while (i11 < length2) {
                t tVar12 = tVarArr2[i11];
                if (tVar12 == null) {
                    z8 = z9;
                    tVar3 = tVar8;
                } else {
                    t tVar13 = tVar8;
                    for (t tVar14 = tVar12; tVar14 != null; tVar14 = tVar14.f2839l) {
                        tVar14.f2838k = tVar13;
                        tVar13 = tVar14;
                    }
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (tVar13 != null) {
                            z8 = z9;
                            t tVar15 = tVar13.f2838k;
                            tVar13.f2838k = tVar8;
                            t tVar16 = tVar13.f2840m;
                            while (true) {
                                t tVar17 = tVar16;
                                tVar2 = tVar15;
                                tVar15 = tVar17;
                                if (tVar15 == null) {
                                    break;
                                }
                                tVar15.f2838k = tVar2;
                                tVar16 = tVar15.f2839l;
                            }
                        } else {
                            t tVar18 = tVar13;
                            tVar13 = tVar8;
                            tVar2 = tVar18;
                            z8 = z9;
                        }
                        if (tVar13 == null) {
                            break;
                        }
                        if ((tVar13.f2844q & length2) == 0) {
                            i12++;
                        } else {
                            i13++;
                        }
                        tVar13 = tVar2;
                        z9 = z8;
                        tVar8 = null;
                    }
                    sVar.f358b = ((Integer.highestOneBit(i12) * 2) - 1) - i12;
                    sVar.f360d = 0;
                    sVar.f359c = 0;
                    tVar3 = null;
                    sVar.f361e = null;
                    sVar2.f358b = ((Integer.highestOneBit(i13) * 2) - 1) - i13;
                    sVar2.f360d = 0;
                    sVar2.f359c = 0;
                    sVar2.f361e = null;
                    t tVar19 = null;
                    while (tVar12 != null) {
                        tVar12.f2838k = tVar19;
                        t tVar20 = tVar12;
                        tVar12 = tVar12.f2839l;
                        tVar19 = tVar20;
                    }
                    while (true) {
                        if (tVar19 != null) {
                            t tVar21 = tVar19.f2838k;
                            tVar19.f2838k = null;
                            t tVar22 = tVar19.f2840m;
                            while (true) {
                                t tVar23 = tVar22;
                                tVar4 = tVar21;
                                tVar21 = tVar23;
                                if (tVar21 == null) {
                                    break;
                                }
                                tVar21.f2838k = tVar4;
                                tVar22 = tVar21.f2839l;
                            }
                        } else {
                            tVar4 = tVar19;
                            tVar19 = null;
                        }
                        if (tVar19 == null) {
                            break;
                        }
                        if ((tVar19.f2844q & length2) == 0) {
                            sVar.a(tVar19);
                        } else {
                            sVar2.a(tVar19);
                        }
                        tVar19 = tVar4;
                    }
                    if (i12 > 0) {
                        tVar5 = (t) sVar.f361e;
                        if (tVar5.f2838k != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        tVar5 = null;
                    }
                    tVarArr3[i11] = tVar5;
                    int i14 = i11 + length2;
                    if (i13 > 0) {
                        tVar6 = (t) sVar2.f361e;
                        if (tVar6.f2838k != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        tVar6 = null;
                    }
                    tVarArr3[i14] = tVar6;
                }
                i11++;
                tVar8 = tVar3;
                z9 = z8;
            }
            this.f2849l = tVarArr3;
            this.f2853p = (i10 / 4) + (i10 / 2);
        }
        this.f2852o++;
        return tVar;
    }

    public final void b(t tVar, boolean z7) {
        while (tVar != null) {
            t tVar2 = tVar.f2839l;
            t tVar3 = tVar.f2840m;
            int i7 = tVar2 != null ? tVar2.f2846s : 0;
            int i8 = tVar3 != null ? tVar3.f2846s : 0;
            int i9 = i7 - i8;
            if (i9 == -2) {
                t tVar4 = tVar3.f2839l;
                t tVar5 = tVar3.f2840m;
                int i10 = (tVar4 != null ? tVar4.f2846s : 0) - (tVar5 != null ? tVar5.f2846s : 0);
                if (i10 != -1 && (i10 != 0 || z7)) {
                    f(tVar3);
                }
                e(tVar);
                if (z7) {
                    return;
                }
            } else if (i9 == 2) {
                t tVar6 = tVar2.f2839l;
                t tVar7 = tVar2.f2840m;
                int i11 = (tVar6 != null ? tVar6.f2846s : 0) - (tVar7 != null ? tVar7.f2846s : 0);
                if (i11 != 1 && (i11 != 0 || z7)) {
                    e(tVar2);
                }
                f(tVar);
                if (z7) {
                    return;
                }
            } else if (i9 == 0) {
                tVar.f2846s = i7 + 1;
                if (z7) {
                    return;
                }
            } else {
                tVar.f2846s = Math.max(i7, i8) + 1;
                if (!z7) {
                    return;
                }
            }
            tVar = tVar.f2838k;
        }
    }

    public final void c(t tVar, boolean z7) {
        t tVar2;
        t tVar3;
        int i7;
        if (z7) {
            t tVar4 = tVar.f2842o;
            tVar4.f2841n = tVar.f2841n;
            tVar.f2841n.f2842o = tVar4;
            tVar.f2842o = null;
            tVar.f2841n = null;
        }
        t tVar5 = tVar.f2839l;
        t tVar6 = tVar.f2840m;
        t tVar7 = tVar.f2838k;
        int i8 = 0;
        if (tVar5 == null || tVar6 == null) {
            if (tVar5 != null) {
                d(tVar, tVar5);
                tVar.f2839l = null;
            } else if (tVar6 != null) {
                d(tVar, tVar6);
                tVar.f2840m = null;
            } else {
                d(tVar, null);
            }
            b(tVar7, false);
            this.f2851n--;
            this.f2852o++;
            return;
        }
        if (tVar5.f2846s > tVar6.f2846s) {
            t tVar8 = tVar5.f2840m;
            while (true) {
                t tVar9 = tVar8;
                tVar3 = tVar5;
                tVar5 = tVar9;
                if (tVar5 == null) {
                    break;
                } else {
                    tVar8 = tVar5.f2840m;
                }
            }
        } else {
            t tVar10 = tVar6.f2839l;
            while (true) {
                tVar2 = tVar6;
                tVar6 = tVar10;
                if (tVar6 == null) {
                    break;
                } else {
                    tVar10 = tVar6.f2839l;
                }
            }
            tVar3 = tVar2;
        }
        c(tVar3, false);
        t tVar11 = tVar.f2839l;
        if (tVar11 != null) {
            i7 = tVar11.f2846s;
            tVar3.f2839l = tVar11;
            tVar11.f2838k = tVar3;
            tVar.f2839l = null;
        } else {
            i7 = 0;
        }
        t tVar12 = tVar.f2840m;
        if (tVar12 != null) {
            i8 = tVar12.f2846s;
            tVar3.f2840m = tVar12;
            tVar12.f2838k = tVar3;
            tVar.f2840m = null;
        }
        tVar3.f2846s = Math.max(i7, i8) + 1;
        d(tVar, tVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f2849l, (Object) null);
        this.f2851n = 0;
        this.f2852o++;
        t tVar = this.f2850m;
        t tVar2 = tVar.f2841n;
        while (tVar2 != tVar) {
            t tVar3 = tVar2.f2841n;
            tVar2.f2842o = null;
            tVar2.f2841n = null;
            tVar2 = tVar3;
        }
        tVar.f2842o = tVar;
        tVar.f2841n = tVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        t tVarA = null;
        if (obj != null) {
            try {
                tVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return tVarA != null;
    }

    public final void d(t tVar, t tVar2) {
        t tVar3 = tVar.f2838k;
        tVar.f2838k = null;
        if (tVar2 != null) {
            tVar2.f2838k = tVar3;
        }
        if (tVar3 == null) {
            this.f2849l[tVar.f2844q & (r0.length - 1)] = tVar2;
        } else if (tVar3.f2839l == tVar) {
            tVar3.f2839l = tVar2;
        } else {
            tVar3.f2840m = tVar2;
        }
    }

    public final void e(t tVar) {
        t tVar2 = tVar.f2839l;
        t tVar3 = tVar.f2840m;
        t tVar4 = tVar3.f2839l;
        t tVar5 = tVar3.f2840m;
        tVar.f2840m = tVar4;
        if (tVar4 != null) {
            tVar4.f2838k = tVar;
        }
        d(tVar, tVar3);
        tVar3.f2839l = tVar;
        tVar.f2838k = tVar3;
        int iMax = Math.max(tVar2 != null ? tVar2.f2846s : 0, tVar4 != null ? tVar4.f2846s : 0) + 1;
        tVar.f2846s = iMax;
        tVar3.f2846s = Math.max(iMax, tVar5 != null ? tVar5.f2846s : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        s sVar = this.f2854q;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 0);
        this.f2854q = sVar2;
        return sVar2;
    }

    public final void f(t tVar) {
        t tVar2 = tVar.f2839l;
        t tVar3 = tVar.f2840m;
        t tVar4 = tVar2.f2839l;
        t tVar5 = tVar2.f2840m;
        tVar.f2839l = tVar5;
        if (tVar5 != null) {
            tVar5.f2838k = tVar;
        }
        d(tVar, tVar2);
        tVar2.f2840m = tVar;
        tVar.f2838k = tVar2;
        int iMax = Math.max(tVar3 != null ? tVar3.f2846s : 0, tVar5 != null ? tVar5.f2846s : 0) + 1;
        tVar.f2846s = iMax;
        tVar2.f2846s = Math.max(iMax, tVar4 != null ? tVar4.f2846s : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        t tVarA;
        if (obj != null) {
            try {
                tVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            tVarA = null;
        }
        if (tVarA != null) {
            return tVarA.f2845r;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        s sVar = this.f2855r;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 1);
        this.f2855r = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        t tVarA = a(obj, true);
        Object obj3 = tVarA.f2845r;
        tVarA.f2845r = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        t tVarA;
        if (obj != null) {
            try {
                tVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            tVarA = null;
        }
        if (tVarA != null) {
            c(tVarA, true);
        }
        if (tVarA != null) {
            return tVarA.f2845r;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2851n;
    }
}
