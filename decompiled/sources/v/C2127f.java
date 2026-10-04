package v;

import b1.AbstractC0703b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2127f implements InterfaceC2126e, InterfaceC2128g {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16439b;

    /* renamed from: c, reason: collision with root package name */
    public final C2129h f16440c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16441d;

    public C2127f(float f5, boolean z7, C2129h c2129h) {
        this.a = f5;
        this.f16439b = z7;
        this.f16440c = c2129h;
        this.f16441d = f5;
    }

    @Override // v.InterfaceC2126e, v.InterfaceC2128g
    public final float a() {
        return this.f16441d;
    }

    @Override // v.InterfaceC2126e
    public final void b(T0.b bVar, int i7, int[] iArr, T0.k kVar, int[] iArr2) {
        int i8;
        int i9;
        if (iArr.length == 0) {
            return;
        }
        int iO = bVar.O(this.a);
        boolean z7 = this.f16439b && kVar == T0.k.f8845l;
        M m7 = AbstractC2130i.a;
        if (z7) {
            int length = iArr.length - 1;
            i8 = 0;
            i9 = 0;
            while (-1 < length) {
                int i10 = iArr[length];
                int iMin = Math.min(i8, i7 - i10);
                iArr2[length] = iMin;
                int iMin2 = Math.min(iO, (i7 - iMin) - i10);
                int i11 = iArr2[length] + i10 + iMin2;
                length--;
                i9 = iMin2;
                i8 = i11;
            }
        } else {
            int length2 = iArr.length;
            int i12 = 0;
            i8 = 0;
            i9 = 0;
            int i13 = 0;
            while (i12 < length2) {
                int i14 = iArr[i12];
                int iMin3 = Math.min(i8, i7 - i14);
                iArr2[i13] = iMin3;
                int iMin4 = Math.min(iO, (i7 - iMin3) - i14);
                int i15 = iArr2[i13] + i14 + iMin4;
                i12++;
                i9 = iMin4;
                i8 = i15;
                i13++;
            }
        }
        int i16 = i8 - i9;
        C2129h c2129h = this.f16440c;
        if (c2129h == null || i16 >= i7) {
            return;
        }
        int iIntValue = ((Number) c2129h.invoke(Integer.valueOf(i7 - i16), kVar)).intValue();
        int length3 = iArr2.length;
        for (int i17 = 0; i17 < length3; i17++) {
            iArr2[i17] = iArr2[i17] + iIntValue;
        }
    }

    @Override // v.InterfaceC2128g
    public final void c(T0.b bVar, int i7, int[] iArr, int[] iArr2) {
        b(bVar, i7, iArr, T0.k.f8844k, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2127f)) {
            return false;
        }
        C2127f c2127f = (C2127f) obj;
        return T0.e.a(this.a, c2127f.a) && this.f16439b == c2127f.f16439b && kotlin.jvm.internal.l.a(this.f16440c, c2127f.f16440c);
    }

    public final int hashCode() {
        int iD = AbstractC0703b.d(Float.hashCode(this.a) * 31, 31, this.f16439b);
        C2129h c2129h = this.f16440c;
        return iD + (c2129h == null ? 0 : c2129h.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16439b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) T0.e.b(this.a));
        sb.append(", ");
        sb.append(this.f16440c);
        sb.append(')');
        return sb.toString();
    }
}
