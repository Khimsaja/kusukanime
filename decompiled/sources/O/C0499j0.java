package O;

import java.util.ArrayList;
import m.C1496q;

/* renamed from: O.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499j0 {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7088b;

    /* renamed from: c, reason: collision with root package name */
    public int f7089c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7090d;

    /* renamed from: e, reason: collision with root package name */
    public final C1496q f7091e;

    /* renamed from: f, reason: collision with root package name */
    public final O3.q f7092f;

    public C0499j0(int i7, ArrayList arrayList) {
        this.a = arrayList;
        this.f7088b = i7;
        if (!(i7 >= 0)) {
            C0486d.T("Invalid start index");
            throw null;
        }
        this.f7090d = new ArrayList();
        C1496q c1496q = new C1496q();
        int size = arrayList.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            P p7 = (P) this.a.get(i9);
            int i10 = p7.f7029c;
            int i11 = p7.f7030d;
            c1496q.h(i10, new J(i9, i8, i11));
            i8 += i11;
        }
        this.f7091e = c1496q;
        this.f7092f = z1.c.C(new B.e(14, this));
    }

    public final boolean a(int i7, int i8) {
        int i9;
        C1496q c1496q = this.f7091e;
        J j7 = (J) c1496q.e(i7);
        if (j7 == null) {
            return false;
        }
        int i10 = j7.f6999b;
        int i11 = i8 - j7.f7000c;
        j7.f7000c = i8;
        if (i11 == 0) {
            return true;
        }
        Object[] objArr = c1496q.f12907c;
        long[] jArr = c1496q.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j8 = jArr[i12];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j8) < 128) {
                        J j9 = (J) objArr[(i12 << 3) + i14];
                        if (j9.f6999b >= i10 && !j9.equals(j7) && (i9 = j9.f6999b + i11) >= 0) {
                            j9.f6999b = i9;
                        }
                    }
                    j8 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }
}
