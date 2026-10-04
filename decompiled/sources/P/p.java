package P;

import O.C0484c;
import O.C0486d;
import O.C0517t;
import O.D0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final p f7681c = new p(1, 0, 2);

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) throws Throwable {
        C0484c c0484c;
        int iC;
        int iD = sVar.d(0);
        Throwable th = null;
        if (!(d02.f6979n == 0)) {
            C0486d.w("Cannot move a group while inserting");
            throw null;
        }
        if (!(iD >= 0)) {
            C0486d.w("Parameter offset is out of bounds");
            throw null;
        }
        if (iD == 0) {
            return;
        }
        int i7 = d02.f6985t;
        int i8 = d02.f6987v;
        int i9 = d02.f6986u;
        int i10 = i7;
        while (iD > 0) {
            i10 += d02.f6967b[(d02.p(i10) * 5) + 3];
            if (i10 > i9) {
                C0486d.w("Parameter offset is out of bounds");
                throw null;
            }
            iD--;
        }
        int i11 = d02.f6967b[(d02.p(i10) * 5) + 3];
        int iF = d02.f(d02.f6967b, d02.p(d02.f6985t));
        int iF2 = d02.f(d02.f6967b, d02.p(i10));
        int i12 = i10 + i11;
        int iF3 = d02.f(d02.f6967b, d02.p(i12));
        int i13 = iF3 - iF2;
        d02.s(i13, Math.max(d02.f6985t - 1, 0));
        d02.r(i11);
        int[] iArr = d02.f6967b;
        int iP = d02.p(i12) * 5;
        P3.m.V(d02.p(i7) * 5, iP, (i11 * 5) + iP, iArr, iArr);
        if (i13 > 0) {
            Object[] objArr = d02.f6968c;
            P3.m.W(iF, d02.g(iF2 + i13), d02.g(iF3 + i13), objArr, objArr);
        }
        int i14 = iF2 + i13;
        int i15 = i14 - iF;
        int i16 = d02.f6976k;
        int i17 = d02.f6977l;
        int length = d02.f6968c.length;
        int i18 = d02.f6978m;
        int i19 = i7 + i11;
        int i20 = i7;
        while (i20 < i19) {
            Throwable th2 = th;
            int iP2 = d02.p(i20);
            int i21 = i19;
            int i22 = i20;
            iArr[(iP2 * 5) + 4] = D0.h(D0.h(d02.f(iArr, iP2) - i15, i18 < iP2 ? 0 : i16, i17, length), d02.f6976k, d02.f6977l, d02.f6968c.length);
            i20 = i22 + 1;
            th = th2;
            i19 = i21;
            i15 = i15;
        }
        Throwable th3 = th;
        int i23 = i12 + i11;
        int iN = d02.n();
        int iN2 = C0486d.n(d02.f6969d, i12, iN);
        ArrayList arrayList = new ArrayList();
        if (iN2 >= 0) {
            while (iN2 < d02.f6969d.size() && (iC = d02.c((c0484c = (C0484c) d02.f6969d.get(iN2)))) >= i12 && iC < i23) {
                arrayList.add(c0484c);
                d02.f6969d.remove(iN2);
            }
        }
        int i24 = i7 - i12;
        int size = arrayList.size();
        for (int i25 = 0; i25 < size; i25++) {
            C0484c c0484c2 = (C0484c) arrayList.get(i25);
            int iC2 = d02.c(c0484c2) + i24;
            if (iC2 >= d02.f6972g) {
                c0484c2.a = -(iN - iC2);
            } else {
                c0484c2.a = iC2;
            }
            d02.f6969d.add(C0486d.n(d02.f6969d, iC2, iN), c0484c2);
        }
        if (d02.B(i12, i11)) {
            C0486d.w("Unexpectedly removed anchors");
            throw th3;
        }
        d02.l(i8, d02.f6986u, i7);
        if (i13 > 0) {
            d02.C(i14, i13, i12 - 1);
        }
    }

    @Override // P.C
    public final String b(int i7) {
        return i7 == 0 ? "offset" : super.b(i7);
    }
}
