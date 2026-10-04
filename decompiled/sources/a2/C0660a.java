package a2;

import B1.B;
import V1.AbstractC0597b;
import V1.C0602g;
import V1.InterfaceC0603h;
import V1.k;
import V1.r;
import V1.t;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660a implements InterfaceC0603h {

    /* renamed from: k, reason: collision with root package name */
    public final t f10422k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10423l;

    /* renamed from: m, reason: collision with root package name */
    public final r f10424m = new r();

    public C0660a(t tVar, int i7) {
        this.f10422k = tVar;
        this.f10423l = i7;
    }

    public final long a(k kVar) throws EOFException, InterruptedIOException {
        long j7;
        r rVar;
        t tVar;
        long j8;
        boolean zB;
        int iM;
        while (true) {
            long jI = kVar.i();
            j7 = kVar.f9391m;
            long j9 = j7 - 6;
            rVar = this.f10424m;
            tVar = this.f10422k;
            if (jI >= j9) {
                j8 = 6;
                break;
            }
            long jI2 = kVar.i();
            byte[] bArr = new byte[2];
            kVar.h(bArr, 0, 2, false);
            int i7 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i8 = this.f10423l;
            if (i7 != i8) {
                kVar.f9394p = 0;
                kVar.b((int) (jI2 - kVar.f9392n), false);
                j8 = 6;
                zB = false;
            } else {
                j8 = 6;
                B b4 = new B(16);
                System.arraycopy(bArr, 0, b4.a, 0, 2);
                byte[] bArr2 = b4.a;
                int i9 = 0;
                for (int i10 = 2; i9 < 14 && (iM = kVar.m(bArr2, i10 + i9, 14 - i9)) != -1; i10 = 2) {
                    i9 += iM;
                }
                b4.E(i9);
                kVar.f9394p = 0;
                kVar.b((int) (jI2 - kVar.f9392n), false);
                zB = AbstractC0597b.b(b4, tVar, i8, rVar);
            }
            if (zB) {
                break;
            }
            kVar.b(1, false);
        }
        if (kVar.i() < j7 - j8) {
            return rVar.a;
        }
        kVar.b((int) (j7 - kVar.i()), false);
        return tVar.f9414j;
    }

    @Override // V1.InterfaceC0603h
    public final C0602g i(k kVar, long j7) throws EOFException, InterruptedIOException {
        long j8 = kVar.f9392n;
        long jA = a(kVar);
        long jI = kVar.i();
        kVar.b(Math.max(6, this.f10422k.f9407c), false);
        long jA2 = a(kVar);
        return (jA > j7 || jA2 <= j7) ? jA2 <= j7 ? new C0602g(-2, jA2, kVar.i()) : new C0602g(-1, jA, j8) : new C0602g(0, -9223372036854775807L, jI);
    }
}
