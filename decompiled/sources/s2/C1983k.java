package s2;

import B1.AbstractC0015b;
import B1.B;
import B1.K;
import V1.F;
import V1.G;
import java.io.EOFException;
import y1.C2392n;
import y1.C2393o;
import y1.D;
import y1.InterfaceC2385g;

/* renamed from: s2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1983k implements G {
    public final G a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1980h f15522b;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1982j f15527g;

    /* renamed from: h, reason: collision with root package name */
    public C2393o f15528h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15529i;

    /* renamed from: d, reason: collision with root package name */
    public int f15524d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f15525e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f15526f = K.f302c;

    /* renamed from: c, reason: collision with root package name */
    public final B f15523c = new B();

    public C1983k(G g4, InterfaceC1980h interfaceC1980h) {
        this.a = g4;
        this.f15522b = interfaceC1980h;
    }

    @Override // V1.G
    public final void a(C2393o c2393o) {
        c2393o.f18112n.getClass();
        String str = c2393o.f18112n;
        AbstractC0015b.c(D.h(str) == 3);
        boolean zEquals = c2393o.equals(this.f15528h);
        InterfaceC1980h interfaceC1980h = this.f15522b;
        if (!zEquals) {
            this.f15528h = c2393o;
            this.f15527g = interfaceC1980h.c(c2393o) ? interfaceC1980h.k(c2393o) : null;
        }
        InterfaceC1982j interfaceC1982j = this.f15527g;
        G g4 = this.a;
        if (interfaceC1982j == null) {
            g4.a(c2393o);
            return;
        }
        C2392n c2392nA = c2393o.a();
        c2392nA.f18074m = D.m("application/x-media3-cues");
        c2392nA.f18071j = str;
        c2392nA.f18079r = Long.MAX_VALUE;
        c2392nA.I = interfaceC1980h.h(c2393o);
        A6.b.r(c2392nA, g4);
    }

    @Override // V1.G
    public final void b(long j7, int i7, int i8, int i9, F f5) {
        if (this.f15527g == null) {
            this.a.b(j7, i7, i8, i9, f5);
            return;
        }
        AbstractC0015b.b("DRM on subtitles is not supported", f5 == null);
        int i10 = (this.f15525e - i9) - i8;
        try {
            this.f15527g.p(this.f15526f, i10, i8, C1981i.f15520c, new I1.d(this, j7, i7));
        } catch (RuntimeException e7) {
            if (!this.f15529i) {
                throw e7;
            }
            AbstractC0015b.w("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e7);
        }
        int i11 = i10 + i8;
        this.f15524d = i11;
        if (i11 == this.f15525e) {
            this.f15524d = 0;
            this.f15525e = 0;
        }
    }

    @Override // V1.G
    public final void c(B b4, int i7, int i8) {
        if (this.f15527g == null) {
            this.a.c(b4, i7, i8);
            return;
        }
        e(i7);
        b4.e(this.f15526f, this.f15525e, i7);
        this.f15525e += i7;
    }

    @Override // V1.G
    public final int d(InterfaceC2385g interfaceC2385g, int i7, boolean z7) throws EOFException {
        if (this.f15527g == null) {
            return this.a.d(interfaceC2385g, i7, z7);
        }
        e(i7);
        int iO = interfaceC2385g.o(this.f15526f, this.f15525e, i7);
        if (iO != -1) {
            this.f15525e += iO;
            return iO;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(int i7) {
        int length = this.f15526f.length;
        int i8 = this.f15525e;
        if (length - i8 >= i7) {
            return;
        }
        int i9 = i8 - this.f15524d;
        int iMax = Math.max(i9 * 2, i7 + i9);
        byte[] bArr = this.f15526f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f15524d, bArr2, 0, i9);
        this.f15524d = 0;
        this.f15525e = i9;
        this.f15526f = bArr2;
    }
}
