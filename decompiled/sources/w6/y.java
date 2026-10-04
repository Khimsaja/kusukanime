package w6;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import p.I0;

/* loaded from: classes.dex */
public final class y implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public static final String f17190l;

    /* renamed from: k, reason: collision with root package name */
    public final l f17191k;

    static {
        String str = File.separator;
        kotlin.jvm.internal.l.e("separator", str);
        f17190l = str;
    }

    public y(l lVar) {
        kotlin.jvm.internal.l.f("bytes", lVar);
        this.f17191k = lVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = x6.c.a(this);
        l lVar = this.f17191k;
        if (iA == -1) {
            iA = 0;
        } else if (iA < lVar.d() && lVar.i(iA) == 92) {
            iA++;
        }
        int iD = lVar.d();
        int i7 = iA;
        while (iA < iD) {
            if (lVar.i(iA) == 47 || lVar.i(iA) == 92) {
                arrayList.add(lVar.n(i7, iA));
                i7 = iA + 1;
            }
            iA++;
        }
        if (i7 < lVar.d()) {
            arrayList.add(lVar.n(i7, lVar.d()));
        }
        return arrayList;
    }

    public final y b() {
        l lVar = x6.c.f17525d;
        l lVar2 = this.f17191k;
        if (kotlin.jvm.internal.l.a(lVar2, lVar)) {
            return null;
        }
        l lVar3 = x6.c.a;
        if (kotlin.jvm.internal.l.a(lVar2, lVar3)) {
            return null;
        }
        l lVar4 = x6.c.f17523b;
        if (kotlin.jvm.internal.l.a(lVar2, lVar4)) {
            return null;
        }
        l lVar5 = x6.c.f17526e;
        lVar2.getClass();
        kotlin.jvm.internal.l.f("suffix", lVar5);
        int iD = lVar2.d();
        byte[] bArr = lVar5.f17158k;
        if (lVar2.m(iD - bArr.length, lVar5, bArr.length) && (lVar2.d() == 2 || lVar2.m(lVar2.d() - 3, lVar3, 1) || lVar2.m(lVar2.d() - 3, lVar4, 1))) {
            return null;
        }
        int iK = l.k(lVar2, lVar3);
        if (iK == -1) {
            iK = l.k(lVar2, lVar4);
        }
        if (iK == 2 && g() != null) {
            if (lVar2.d() == 3) {
                return null;
            }
            return new y(l.o(lVar2, 0, 3, 1));
        }
        if (iK == 1) {
            kotlin.jvm.internal.l.f("prefix", lVar4);
            if (lVar2.m(0, lVar4, lVar4.d())) {
                return null;
            }
        }
        if (iK != -1 || g() == null) {
            return iK == -1 ? new y(lVar) : iK == 0 ? new y(l.o(lVar2, 0, 1, 1)) : new y(l.o(lVar2, 0, iK, 1));
        }
        if (lVar2.d() == 2) {
            return null;
        }
        return new y(l.o(lVar2, 0, 2, 1));
    }

    public final y c(y yVar) {
        kotlin.jvm.internal.l.f("other", yVar);
        int iA = x6.c.a(this);
        l lVar = this.f17191k;
        y yVar2 = iA == -1 ? null : new y(lVar.n(0, iA));
        int iA2 = x6.c.a(yVar);
        l lVar2 = yVar.f17191k;
        if (!kotlin.jvm.internal.l.a(yVar2, iA2 != -1 ? new y(lVar2.n(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + yVar).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = yVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i7 = 0;
        while (i7 < iMin && kotlin.jvm.internal.l.a(arrayListA.get(i7), arrayListA2.get(i7))) {
            i7++;
        }
        if (i7 == iMin && lVar.d() == lVar2.d()) {
            return I0.t(".");
        }
        if (arrayListA2.subList(i7, arrayListA2.size()).indexOf(x6.c.f17526e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + yVar).toString());
        }
        if (kotlin.jvm.internal.l.a(lVar2, x6.c.f17525d)) {
            return this;
        }
        C2224i c2224i = new C2224i();
        l lVarC = x6.c.c(yVar);
        if (lVarC == null && (lVarC = x6.c.c(this)) == null) {
            lVarC = x6.c.f(f17190l);
        }
        int size = arrayListA2.size();
        for (int i8 = i7; i8 < size; i8++) {
            c2224i.e0(x6.c.f17526e);
            c2224i.e0(lVarC);
        }
        int size2 = arrayListA.size();
        while (i7 < size2) {
            c2224i.e0((l) arrayListA.get(i7));
            c2224i.e0(lVarC);
            i7++;
        }
        return x6.c.d(c2224i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        kotlin.jvm.internal.l.f("other", yVar);
        return this.f17191k.compareTo(yVar.f17191k);
    }

    public final y d(String str) {
        kotlin.jvm.internal.l.f("child", str);
        C2224i c2224i = new C2224i();
        c2224i.k0(str);
        return x6.c.b(this, x6.c.d(c2224i, false), false);
    }

    public final File e() {
        return new File(this.f17191k.r());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.l.a(((y) obj).f17191k, this.f17191k);
    }

    public final Path f() {
        Path path = Paths.get(this.f17191k.r(), new String[0]);
        kotlin.jvm.internal.l.e("get(...)", path);
        return path;
    }

    public final Character g() {
        l lVar = x6.c.a;
        l lVar2 = this.f17191k;
        if (l.g(lVar2, lVar) != -1 || lVar2.d() < 2 || lVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) lVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f17191k.hashCode();
    }

    public final String toString() {
        return this.f17191k.r();
    }
}
