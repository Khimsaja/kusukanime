package O1;

import B1.AbstractC0015b;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements E1.h {

    /* renamed from: k, reason: collision with root package name */
    public final E1.h f7482k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7483l;

    /* renamed from: m, reason: collision with root package name */
    public final O f7484m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f7485n;

    /* renamed from: o, reason: collision with root package name */
    public int f7486o;

    public r(E1.h hVar, int i7, O o7) {
        AbstractC0015b.c(i7 > 0);
        this.f7482k = hVar;
        this.f7483l = i7;
        this.f7484m = o7;
        this.f7485n = new byte[1];
        this.f7486o = i7;
    }

    @Override // E1.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // E1.h
    public final Map d() {
        return this.f7482k.d();
    }

    @Override // E1.h
    public final long g(E1.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // E1.h
    public final Uri getUri() {
        return this.f7482k.getUri();
    }

    @Override // E1.h
    public final void j(E1.D d4) {
        d4.getClass();
        this.f7482k.j(d4);
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) {
        int i9 = this.f7486o;
        E1.h hVar = this.f7482k;
        if (i9 == 0) {
            byte[] bArr2 = this.f7485n;
            if (hVar.o(bArr2, 0, 1) != -1) {
                int i10 = (bArr2[0] & 255) << 4;
                if (i10 != 0) {
                    byte[] bArr3 = new byte[i10];
                    int i11 = i10;
                    int i12 = 0;
                    while (i11 > 0) {
                        int iO = hVar.o(bArr3, i12, i11);
                        if (iO != -1) {
                            i12 += iO;
                            i11 -= iO;
                        }
                    }
                    while (i10 > 0 && bArr3[i10 - 1] == 0) {
                        i10--;
                    }
                    if (i10 > 0) {
                        B1.B b4 = new B1.B(bArr3, i10);
                        O o7 = this.f7484m;
                        long jMax = !o7.f7304l ? o7.f7301i : Math.max(o7.f7305m.w(true), o7.f7301i);
                        int iA = b4.a();
                        V1.G g4 = o7.f7303k;
                        g4.getClass();
                        g4.c(b4, iA, 0);
                        g4.b(jMax, 1, iA, 0, null);
                        o7.f7304l = true;
                    }
                }
                this.f7486o = this.f7483l;
            }
            return -1;
        }
        int iO2 = hVar.o(bArr, i7, Math.min(this.f7486o, i8));
        if (iO2 != -1) {
            this.f7486o -= iO2;
        }
        return iO2;
    }
}
