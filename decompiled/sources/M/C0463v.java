package M;

import L.C0;
import L.C0391l;
import java.util.List;
import p.AbstractC1755i;

/* renamed from: M.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463v implements X0.y {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.b f6349b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6350c;

    /* renamed from: d, reason: collision with root package name */
    public final C0391l f6351d;

    /* renamed from: e, reason: collision with root package name */
    public final C0443a f6352e;

    /* renamed from: f, reason: collision with root package name */
    public final C0443a f6353f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f6354g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f6355h;

    /* renamed from: i, reason: collision with root package name */
    public final C0444b f6356i;

    /* renamed from: j, reason: collision with root package name */
    public final C0444b f6357j;

    /* renamed from: k, reason: collision with root package name */
    public final C0444b f6358k;

    /* renamed from: l, reason: collision with root package name */
    public final Z f6359l;

    /* renamed from: m, reason: collision with root package name */
    public final Z f6360m;

    public C0463v(long j7, T0.b bVar, C0391l c0391l) {
        int iO = bVar.O(C0.a);
        this.a = j7;
        this.f6349b = bVar;
        this.f6350c = iO;
        this.f6351d = c0391l;
        int iO2 = bVar.O(Float.intBitsToFloat((int) (j7 >> 32)));
        a0.g gVar = a0.b.f10393w;
        this.f6352e = new C0443a(gVar, gVar, iO2);
        a0.g gVar2 = a0.b.f10395y;
        this.f6353f = new C0443a(gVar2, gVar2, iO2);
        this.f6354g = new Y(a0.a.f10378c);
        this.f6355h = new Y(a0.a.f10379d);
        int iO3 = bVar.O(Float.intBitsToFloat((int) (j7 & 4294967295L)));
        a0.h hVar = a0.b.f10390t;
        a0.h hVar2 = a0.b.f10392v;
        this.f6356i = new C0444b(hVar, hVar2, iO3);
        this.f6357j = new C0444b(hVar2, hVar, iO3);
        this.f6358k = new C0444b(a0.b.f10391u, hVar, iO3);
        this.f6359l = new Z(hVar, iO);
        this.f6360m = new Z(hVar2, iO);
    }

    @Override // X0.y
    public final long a(T0.i iVar, long j7, T0.k kVar, long j8) {
        long j9;
        char c2;
        int iA;
        int i7;
        int i8;
        char c4 = 3;
        int i9 = iVar.f8842c;
        int i10 = iVar.a;
        int iA2 = iVar.a() / 2;
        int i11 = iVar.f8841b;
        int i12 = (int) (j7 >> 32);
        List listI = P3.r.I(this.f6352e, this.f6353f, ((int) (P3.F.b(((i9 - i10) / 2) + i10, iA2 + i11) >> 32)) < i12 / 2 ? this.f6354g : this.f6355h);
        int size = listI.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                j9 = j7;
                c2 = c4;
                iA = 0;
                break;
            }
            E e7 = (E) listI.get(i13);
            int i14 = (int) (j8 >> 32);
            int i15 = size;
            c2 = c4;
            int i16 = i13;
            j9 = j7;
            iA = e7.a(iVar, j9, i14, kVar);
            if (i16 == P3.r.y(listI) || (iA >= 0 && i14 + iA <= i12)) {
                break;
            }
            i13 = i16 + 1;
            size = i15;
            c4 = c2;
        }
        int i17 = (int) (j9 & 4294967295L);
        Z z7 = ((int) (P3.F.b(((iVar.f8842c - i10) / 2) + i10, (iVar.a() / 2) + i11) & 4294967295L)) < i17 / 2 ? this.f6359l : this.f6360m;
        C0444b c0444b = this.f6356i;
        C0444b c0444b2 = this.f6357j;
        C0444b c0444b3 = this.f6358k;
        F[] fArr = new F[4];
        fArr[0] = c0444b;
        fArr[1] = c0444b2;
        fArr[2] = c0444b3;
        fArr[c2] = z7;
        List listI2 = P3.r.I(fArr);
        int size2 = listI2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int i19 = (int) (j8 & 4294967295L);
            int iA3 = ((F) listI2.get(i18)).a(iVar, j9, i19);
            if (i18 == P3.r.y(listI2) || (iA3 >= (i8 = this.f6350c) && i19 + iA3 <= i17 - i8)) {
                i7 = iA3;
                break;
            }
        }
        i7 = 0;
        long jB = P3.F.b(iA, i7);
        int i20 = (int) (jB >> 32);
        int i21 = (int) (jB & 4294967295L);
        this.f6351d.invoke(iVar, new T0.i(i20, i21, ((int) (j8 >> 32)) + i20, ((int) (j8 & 4294967295L)) + i21));
        return jB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0463v)) {
            return false;
        }
        C0463v c0463v = (C0463v) obj;
        return this.a == c0463v.a && kotlin.jvm.internal.l.a(this.f6349b, c0463v.f6349b) && this.f6350c == c0463v.f6350c && kotlin.jvm.internal.l.a(this.f6351d, c0463v.f6351d);
    }

    public final int hashCode() {
        return this.f6351d.hashCode() + AbstractC1755i.a(this.f6350c, (this.f6349b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) T0.f.a(this.a)) + ", density=" + this.f6349b + ", verticalMargin=" + this.f6350c + ", onPositionCalculated=" + this.f6351d + ')';
    }
}
