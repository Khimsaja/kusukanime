package x6;

import O3.l;
import P3.E;
import P3.F;
import P3.q;
import b1.AbstractC0703b;
import e4.n;
import f6.AbstractC0915m;
import io.ktor.util.date.GMTDateParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import p.I0;
import w6.C;
import w6.C2224i;
import w6.y;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f17522b = new byte[0];

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = y.f17190l;
        y yVarT = I0.t("/");
        l[] lVarArr = {new l(yVarT, new g(yVarT, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.I(1));
        E.p0(linkedHashMap, lVarArr);
        for (g gVar : q.O0(arrayList, new G3.q(5))) {
            if (((g) linkedHashMap.put(gVar.a, gVar)) == null) {
                while (true) {
                    y yVar = gVar.a;
                    y yVarB = yVar.b();
                    if (yVarB != null) {
                        g gVar2 = (g) linkedHashMap.get(yVarB);
                        if (gVar2 != null) {
                            gVar2.f17550q.add(yVar);
                            break;
                        }
                        g gVar3 = new g(yVarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(yVarB, gVar3);
                        gVar3.f17550q.add(yVar);
                        gVar = gVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(w6.C r18, w6.l r19, int r20, long r21) {
        /*
            r0 = r18
            r2 = r19
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.l.f(r1, r0)
            java.lang.String r1 = "bytes"
            kotlin.jvm.internal.l.f(r1, r2)
            byte[] r1 = r2.f17158k
            int r1 = r1.length
            long r3 = (long) r1
            r1 = 0
            long r5 = (long) r1
            r1 = r20
            long r7 = (long) r1
            w6.AbstractC2217b.e(r3, r5, r7)
            r8 = r7
            boolean r3 = r0.f17115m
            if (r3 != 0) goto L82
            r3 = 0
        L21:
            w6.i r1 = r0.f17114l
            r7 = r20
            r5 = r21
            long r10 = x6.a.a(r1, r2, r3, r5, r7)
            r5 = -1
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 == 0) goto L32
            return r10
        L32:
            long r10 = r1.f17156l
            long r12 = r10 - r8
            r14 = 1
            long r12 = r12 + r14
            int r7 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r7 < 0) goto L40
        L3d:
            r16 = r5
            goto L81
        L40:
            int r7 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r7 >= 0) goto L47
            r16 = r5
            goto L68
        L47:
            long r10 = r10 - r21
            long r10 = r10 + r14
            long r10 = java.lang.Math.max(r14, r10)
            int r7 = (int) r10
            long r10 = r1.f17156l
            long r10 = r10 - r3
            long r10 = r10 + r14
            long r10 = java.lang.Math.min(r8, r10)
            int r10 = (int) r10
            int r10 = r10 + (-1)
            if (r7 > r10) goto L3d
        L5c:
            long r14 = r1.f17156l
            r16 = r5
            long r5 = (long) r10
            long r14 = r14 - r5
            boolean r5 = r1.J(r14, r2, r10)
            if (r5 == 0) goto L7a
        L68:
            w6.H r5 = r0.f17113k
            r6 = 8192(0x2000, double:4.0474E-320)
            long r5 = r5.F(r1, r6)
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r1 != 0) goto L75
            goto L81
        L75:
            long r3 = java.lang.Math.max(r3, r12)
            goto L21
        L7a:
            if (r10 == r7) goto L81
            int r10 = r10 + (-1)
            r5 = r16
            goto L5c
        L81:
            return r16
        L82:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.c(w6.C, w6.l, int, long):long");
    }

    public static final String d(int i7) {
        AbstractC0915m.k(16);
        String string = Integer.toString(i7, 16);
        kotlin.jvm.internal.l.e("toString(...)", string);
        return "0x".concat(string);
    }

    public static final g e(final C c2) throws IOException {
        int iG = c2.g();
        if (iG != 33639248) {
            throw new IOException("bad zip: expected " + d(33639248) + " but was " + d(iG));
        }
        c2.n(4L);
        short sJ = c2.j();
        int i7 = sJ & 65535;
        if ((sJ & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + d(i7));
        }
        int iJ = c2.j() & 65535;
        int iJ2 = c2.j() & 65535;
        int iJ3 = c2.j() & 65535;
        long jG = c2.g() & 4294967295L;
        final w wVar = new w();
        wVar.f12719k = c2.g() & 4294967295L;
        final w wVar2 = new w();
        wVar2.f12719k = c2.g() & 4294967295L;
        int iJ4 = c2.j() & 65535;
        int iJ5 = c2.j() & 65535;
        int iJ6 = 65535 & c2.j();
        c2.n(8L);
        final w wVar3 = new w();
        wVar3.f12719k = c2.g() & 4294967295L;
        String strM = c2.m(iJ4);
        if (AbstractC2510o.X(strM, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j7 = wVar2.f12719k == 4294967295L ? 8 : 0L;
        if (wVar.f12719k == 4294967295L) {
            j7 += 8;
        }
        if (wVar3.f12719k == 4294967295L) {
            j7 += 8;
        }
        final x xVar = new x();
        final x xVar2 = new x();
        final x xVar3 = new x();
        final t tVar = new t();
        f(c2, iJ5, new n() { // from class: x6.i
            @Override // e4.n
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                C c4 = c2;
                if (iIntValue == 1) {
                    t tVar2 = tVar;
                    if (tVar2.f12716k) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    tVar2.f12716k = true;
                    if (jLongValue < j7) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    w wVar4 = wVar2;
                    long jI = wVar4.f12719k;
                    if (jI == 4294967295L) {
                        jI = c4.i();
                    }
                    wVar4.f12719k = jI;
                    w wVar5 = wVar;
                    wVar5.f12719k = wVar5.f12719k == 4294967295L ? c4.i() : 0L;
                    w wVar6 = wVar3;
                    wVar6.f12719k = wVar6.f12719k == 4294967295L ? c4.i() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    c4.n(4L);
                    b.f(c4, (int) (jLongValue - 4), new h(xVar, c4, xVar2, xVar3));
                }
                return O3.C.a;
            }
        });
        if (j7 > 0 && !tVar.f12716k) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strM2 = c2.m(iJ6);
        String str = y.f17190l;
        return new g(I0.t("/").d(strM), AbstractC2517v.L(strM, "/", false), strM2, jG, wVar.f12719k, wVar2.f12719k, iJ, wVar3.f12719k, iJ3, iJ2, (Long) xVar.f12720k, (Long) xVar2.f12720k, (Long) xVar3.f12720k, 57344);
    }

    public static final void f(C c2, int i7, n nVar) throws IOException {
        long j7 = i7;
        while (j7 != 0) {
            if (j7 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iJ = c2.j() & 65535;
            long j8 = c2.j() & 65535;
            long j9 = j7 - 4;
            if (j9 < j8) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c2.Q(j8);
            C2224i c2224i = c2.f17114l;
            long j10 = c2224i.f17156l;
            nVar.invoke(Integer.valueOf(iJ), Long.valueOf(j8));
            long j11 = (c2224i.f17156l + j8) - j10;
            if (j11 < 0) {
                throw new IOException(AbstractC0703b.g(iJ, "unsupported zip: too many bytes processed for "));
            }
            if (j11 > 0) {
                c2224i.n(j11);
            }
            j7 = j9 - j8;
        }
    }

    public static final g g(C c2, g gVar) throws IOException {
        int iG = c2.g();
        if (iG != 67324752) {
            throw new IOException("bad zip: expected " + d(67324752) + " but was " + d(iG));
        }
        c2.n(2L);
        short sJ = c2.j();
        int i7 = sJ & 65535;
        if ((sJ & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + d(i7));
        }
        c2.n(18L);
        int iJ = c2.j() & 65535;
        c2.n(c2.j() & 65535);
        if (gVar == null) {
            c2.n(iJ);
            return null;
        }
        x xVar = new x();
        x xVar2 = new x();
        x xVar3 = new x();
        f(c2, iJ, new h(c2, xVar, xVar2, xVar3));
        return new g(gVar.a, gVar.f17535b, gVar.f17536c, gVar.f17537d, gVar.f17538e, gVar.f17539f, gVar.f17540g, gVar.f17541h, gVar.f17542i, gVar.f17543j, gVar.f17544k, gVar.f17545l, gVar.f17546m, (Integer) xVar.f12720k, (Integer) xVar2.f12720k, (Integer) xVar3.f12720k);
    }

    public static final int h(w6.F f5, int i7) {
        int i8;
        kotlin.jvm.internal.l.f("<this>", f5);
        int i9 = i7 + 1;
        int length = f5.f17124o.length;
        int[] iArr = f5.f17125p;
        kotlin.jvm.internal.l.f("<this>", iArr);
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 >= i9) {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i8 - 1;
                } else {
                    i11 = i8 + 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        return i8 >= 0 ? i8 : ~i8;
    }
}
