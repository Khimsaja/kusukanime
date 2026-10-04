package q2;

import B1.AbstractC0015b;
import B1.B;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class f {
    public final g a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final B f14695b = new B(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f14696c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f14697d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14698e;

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        this.f14697d = 0;
        do {
            int i10 = this.f14697d;
            int i11 = i7 + i10;
            g gVar = this.a;
            if (i11 >= gVar.f14700c) {
                break;
            }
            int[] iArr = gVar.f14703f;
            this.f14697d = i10 + 1;
            i8 = iArr[i10 + i7];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public final boolean b(V1.k kVar) {
        int i7;
        AbstractC0015b.h(kVar != null);
        boolean z7 = this.f14698e;
        B b4 = this.f14695b;
        if (z7) {
            this.f14698e = false;
            b4.C(0);
        }
        while (!this.f14698e) {
            int i8 = this.f14696c;
            g gVar = this.a;
            if (i8 < 0) {
                if (gVar.b(kVar, -1L) && gVar.a(kVar, true)) {
                    int iA = gVar.f14701d;
                    if ((gVar.a & 1) == 1 && b4.f289c == 0) {
                        iA += a(0);
                        i7 = this.f14697d;
                    } else {
                        i7 = 0;
                    }
                    try {
                        kVar.f(iA);
                        this.f14696c = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f14696c);
            int i9 = this.f14696c + this.f14697d;
            if (iA2 > 0) {
                b4.b(b4.f289c + iA2);
                kVar.a(b4.a, b4.f289c, iA2, false);
                b4.E(b4.f289c + iA2);
                this.f14698e = gVar.f14703f[i9 + (-1)] != 255;
            }
            if (i9 == gVar.f14700c) {
                i9 = -1;
            }
            this.f14696c = i9;
        }
        return true;
    }
}
