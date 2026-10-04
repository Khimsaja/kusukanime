package x6;

import P3.q;
import P3.r;
import b1.AbstractC0703b;
import java.io.EOFException;
import java.util.ArrayList;
import p.I0;
import w6.C2224i;
import w6.l;
import w6.y;

/* loaded from: classes.dex */
public abstract class c {
    public static final l a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f17523b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f17524c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f17525d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f17526e;

    static {
        l lVar = l.f17157n;
        a = I0.s("/");
        f17523b = I0.s("\\");
        f17524c = I0.s("/\\");
        f17525d = I0.s(".");
        f17526e = I0.s("..");
    }

    public static final int a(y yVar) {
        if (yVar.f17191k.d() != 0) {
            l lVar = yVar.f17191k;
            if (lVar.i(0) != 47) {
                if (lVar.i(0) == 92) {
                    if (lVar.d() > 2 && lVar.i(1) == 92) {
                        l lVar2 = f17523b;
                        kotlin.jvm.internal.l.f("other", lVar2);
                        int iF = lVar.f(lVar2.f17158k, 2);
                        return iF == -1 ? lVar.d() : iF;
                    }
                } else if (lVar.d() > 2 && lVar.i(1) == 58 && lVar.i(2) == 92) {
                    char cI = (char) lVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final y b(y yVar, y yVar2, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", yVar);
        kotlin.jvm.internal.l.f("child", yVar2);
        if (a(yVar2) != -1 || yVar2.g() != null) {
            return yVar2;
        }
        l lVarC = c(yVar);
        if (lVarC == null && (lVarC = c(yVar2)) == null) {
            lVarC = f(y.f17190l);
        }
        C2224i c2224i = new C2224i();
        c2224i.e0(yVar.f17191k);
        if (c2224i.f17156l > 0) {
            c2224i.e0(lVarC);
        }
        c2224i.e0(yVar2.f17191k);
        return d(c2224i, z7);
    }

    public static final l c(y yVar) {
        l lVar = yVar.f17191k;
        l lVar2 = a;
        if (l.g(lVar, lVar2) != -1) {
            return lVar2;
        }
        l lVar3 = f17523b;
        if (l.g(yVar.f17191k, lVar3) != -1) {
            return lVar3;
        }
        return null;
    }

    public static final y d(C2224i c2224i, boolean z7) throws EOFException {
        long j7;
        l lVar;
        l lVar2;
        char cV;
        l lVar3;
        l lVarT;
        C2224i c2224i2 = new C2224i();
        l lVarE = null;
        int i7 = 0;
        while (true) {
            j7 = 0;
            if (!c2224i.p(0L, a)) {
                lVar = f17523b;
                if (!c2224i.p(0L, lVar)) {
                    break;
                }
            }
            byte b4 = c2224i.readByte();
            if (lVarE == null) {
                lVarE = e(b4);
            }
            i7++;
        }
        boolean z8 = i7 >= 2 && kotlin.jvm.internal.l.a(lVarE, lVar);
        l lVar4 = f17524c;
        if (z8) {
            kotlin.jvm.internal.l.c(lVarE);
            c2224i2.e0(lVarE);
            c2224i2.e0(lVarE);
        } else if (i7 > 0) {
            kotlin.jvm.internal.l.c(lVarE);
            c2224i2.e0(lVarE);
        } else {
            long jV = c2224i.V(lVar4);
            if (lVarE == null) {
                lVarE = jV == -1 ? f(y.f17190l) : e(c2224i.v(jV));
            }
            if (kotlin.jvm.internal.l.a(lVarE, lVar)) {
                lVar2 = lVarE;
                if (c2224i.f17156l >= 2 && c2224i.v(1L) == 58 && (('a' <= (cV = (char) c2224i.v(0L)) && cV < '{') || ('A' <= cV && cV < '['))) {
                    if (jV == 2) {
                        c2224i2.f(c2224i, 3L);
                    } else {
                        c2224i2.f(c2224i, 2L);
                    }
                }
            } else {
                lVar2 = lVarE;
            }
            lVarE = lVar2;
        }
        boolean z9 = c2224i2.f17156l > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean z10 = c2224i.z();
            lVar3 = f17525d;
            if (z10) {
                break;
            }
            long j8 = j7;
            long jV2 = c2224i.V(lVar4);
            if (jV2 == -1) {
                lVarT = c2224i.T(c2224i.f17156l);
            } else {
                lVarT = c2224i.T(jV2);
                c2224i.readByte();
            }
            l lVar5 = f17526e;
            if (kotlin.jvm.internal.l.a(lVarT, lVar5)) {
                if (!z9 || !arrayList.isEmpty()) {
                    if (!z7 || (!z9 && (arrayList.isEmpty() || kotlin.jvm.internal.l.a(q.A0(arrayList), lVar5)))) {
                        arrayList.add(lVarT);
                    } else if ((!z8 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(r.y(arrayList));
                    }
                }
            } else if (!kotlin.jvm.internal.l.a(lVarT, lVar3) && !kotlin.jvm.internal.l.a(lVarT, l.f17157n)) {
                arrayList.add(lVarT);
            }
            j7 = j8;
        }
        long j9 = j7;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                c2224i2.e0(lVarE);
            }
            c2224i2.e0((l) arrayList.get(i8));
        }
        if (c2224i2.f17156l == j9) {
            c2224i2.e0(lVar3);
        }
        return new y(c2224i2.T(c2224i2.f17156l));
    }

    public static final l e(byte b4) {
        if (b4 == 47) {
            return a;
        }
        if (b4 == 92) {
            return f17523b;
        }
        throw new IllegalArgumentException(AbstractC0703b.g(b4, "not a directory separator: "));
    }

    public static final l f(String str) {
        if (kotlin.jvm.internal.l.a(str, "/")) {
            return a;
        }
        if (kotlin.jvm.internal.l.a(str, "\\")) {
            return f17523b;
        }
        throw new IllegalArgumentException(AbstractC0703b.i("not a directory separator: ", str));
    }
}
