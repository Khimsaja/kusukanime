package P;

import O.C0486d;
import O.C0517t;
import O.D0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D extends n6.m {

    /* renamed from: j, reason: collision with root package name */
    public int f7644j;

    /* renamed from: l, reason: collision with root package name */
    public int f7646l;

    /* renamed from: n, reason: collision with root package name */
    public int f7648n;

    /* renamed from: o, reason: collision with root package name */
    public int f7649o;

    /* renamed from: p, reason: collision with root package name */
    public int f7650p;

    /* renamed from: i, reason: collision with root package name */
    public C[] f7643i = new C[16];

    /* renamed from: k, reason: collision with root package name */
    public int[] f7645k = new int[16];

    /* renamed from: m, reason: collision with root package name */
    public Object[] f7647m = new Object[16];

    public static final int Z(D d4, int i7) {
        d4.getClass();
        if (i7 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i7);
    }

    public final void a0() {
        this.f7644j = 0;
        this.f7646l = 0;
        P3.m.c0(this.f7647m, 0, this.f7648n);
        this.f7648n = 0;
    }

    public final void b0(B2.l lVar, D0 d02, C0517t c0517t) {
        D d4;
        int i7;
        if (d0()) {
            B1.s sVar = new B1.s(this);
            do {
                d4 = (D) sVar.f361e;
                C c2 = d4.f7643i[sVar.f358b];
                kotlin.jvm.internal.l.c(c2);
                c2.a(sVar, lVar, d02, c0517t);
                int i8 = sVar.f358b;
                if (i8 >= d4.f7644j) {
                    break;
                }
                C c4 = d4.f7643i[i8];
                kotlin.jvm.internal.l.c(c4);
                sVar.f359c += c4.a;
                sVar.f360d += c4.f7642b;
                i7 = sVar.f358b + 1;
                sVar.f358b = i7;
            } while (i7 < d4.f7644j);
        }
        a0();
    }

    public final boolean c0() {
        return this.f7644j == 0;
    }

    public final boolean d0() {
        return this.f7644j != 0;
    }

    public final C e0() {
        C c2 = this.f7643i[this.f7644j - 1];
        kotlin.jvm.internal.l.c(c2);
        return c2;
    }

    public final void f0(C c2) {
        int i7 = c2.a;
        int i8 = c2.f7642b;
        if (i7 == 0 && i8 == 0) {
            g0(c2);
            return;
        }
        C0486d.T("Cannot push " + c2 + " without arguments because it expects " + i7 + " ints and " + i8 + " objects.");
        throw null;
    }

    public final void g0(C c2) {
        this.f7649o = 0;
        this.f7650p = 0;
        int i7 = this.f7644j;
        C[] cArr = this.f7643i;
        if (i7 == cArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(cArr, i7 + (i7 > 1024 ? 1024 : i7));
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f7643i = (C[]) objArrCopyOf;
        }
        int i8 = this.f7646l + c2.a;
        int[] iArr = this.f7645k;
        int length = iArr.length;
        if (i8 > length) {
            int i9 = length + (length > 1024 ? 1024 : length);
            if (i9 >= i8) {
                i8 = i9;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.f7645k = iArrCopyOf;
        }
        int i10 = this.f7648n;
        int i11 = c2.f7642b;
        int i12 = i10 + i11;
        Object[] objArr = this.f7647m;
        int length2 = objArr.length;
        if (i12 > length2) {
            int i13 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i13 >= i12) {
                i12 = i13;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i12);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf2);
            this.f7647m = objArrCopyOf2;
        }
        C[] cArr2 = this.f7643i;
        int i14 = this.f7644j;
        this.f7644j = i14 + 1;
        cArr2[i14] = c2;
        this.f7646l += c2.a;
        this.f7648n += i11;
    }
}
