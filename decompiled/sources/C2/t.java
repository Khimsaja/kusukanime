package C2;

import B1.AbstractC0015b;
import B1.AbstractC0018e;
import java.util.Collections;
import y1.C2384f;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final class t implements InterfaceC0037j {
    public final B2.l a;

    /* renamed from: b, reason: collision with root package name */
    public String f867b;

    /* renamed from: c, reason: collision with root package name */
    public V1.G f868c;

    /* renamed from: d, reason: collision with root package name */
    public s f869d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f870e;

    /* renamed from: l, reason: collision with root package name */
    public long f877l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f871f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final y f872g = new y(32);

    /* renamed from: h, reason: collision with root package name */
    public final y f873h = new y(33);

    /* renamed from: i, reason: collision with root package name */
    public final y f874i = new y(34);

    /* renamed from: j, reason: collision with root package name */
    public final y f875j = new y(39);

    /* renamed from: k, reason: collision with root package name */
    public final y f876k = new y(40);

    /* renamed from: m, reason: collision with root package name */
    public long f878m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final B1.B f879n = new B1.B();

    public t(B2.l lVar) {
        this.a = lVar;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        this.f877l = 0L;
        this.f878m = -9223372036854775807L;
        C1.r.b(this.f871f);
        this.f872g.g();
        this.f873h.g();
        this.f874i.g();
        this.f875j.g();
        this.f876k.g();
        ((C1.w) this.a.f418n).b(0);
        s sVar = this.f869d;
        if (sVar != null) {
            sVar.f859f = false;
            sVar.f860g = false;
            sVar.f861h = false;
            sVar.f862i = false;
            sVar.f863j = false;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void b(B1.B b4) {
        int i7;
        AbstractC0015b.i(this.f868c);
        int i8 = B1.K.a;
        while (b4.a() > 0) {
            int i9 = b4.f288b;
            int i10 = b4.f289c;
            byte[] bArr = b4.a;
            this.f877l += b4.a();
            this.f868c.c(b4, b4.a(), 0);
            while (i9 < i10) {
                int iC = C1.r.c(bArr, i9, i10, this.f871f);
                if (iC == i10) {
                    g(bArr, i9, i10);
                    return;
                }
                int i11 = (bArr[iC + 3] & 126) >> 1;
                if (iC <= 0 || bArr[iC - 1] != 0) {
                    i7 = 3;
                } else {
                    iC--;
                    i7 = 4;
                }
                int i12 = iC;
                int i13 = i12 - i9;
                if (i13 > 0) {
                    g(bArr, i9, i12);
                }
                int i14 = i10 - i12;
                long j7 = this.f877l - i14;
                f(i14, i13 < 0 ? -i13 : 0, j7, this.f878m);
                h(i14, i11, j7, this.f878m);
                i9 = i12 + i7;
            }
        }
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
        AbstractC0015b.i(this.f868c);
        int i7 = B1.K.a;
        if (z7) {
            ((C1.w) this.a.f418n).b(0);
            f(0, 0, this.f877l, this.f878m);
            h(0, 48, this.f877l, this.f878m);
        }
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f878m = j7;
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.f867b = k7.f689e;
        k7.b();
        V1.G gM = pVar.m(k7.f688d, 2);
        this.f868c = gM;
        this.f869d = new s(gM);
        this.a.o(pVar, k7);
    }

    public final void f(int i7, int i8, long j7, long j8) {
        s sVar = this.f869d;
        boolean z7 = this.f870e;
        if (sVar.f863j && sVar.f860g) {
            sVar.f866m = sVar.f856c;
            sVar.f863j = false;
        } else if (sVar.f861h || sVar.f860g) {
            if (z7 && sVar.f862i) {
                sVar.a(i7 + ((int) (j7 - sVar.f855b)));
            }
            sVar.f864k = sVar.f855b;
            sVar.f865l = sVar.f858e;
            sVar.f866m = sVar.f856c;
            sVar.f862i = true;
        }
        boolean z8 = this.f870e;
        C1.w wVar = (C1.w) this.a.f418n;
        if (!z8) {
            y yVar = this.f872g;
            yVar.e(i8);
            y yVar2 = this.f873h;
            yVar2.e(i8);
            y yVar3 = this.f874i;
            yVar3.e(i8);
            if (yVar.f938d && yVar2.f938d && yVar3.f938d) {
                String str = this.f867b;
                int i9 = yVar.f939e;
                byte[] bArr = new byte[yVar2.f939e + i9 + yVar3.f939e];
                System.arraycopy((byte[]) yVar.f940f, 0, bArr, 0, i9);
                System.arraycopy((byte[]) yVar2.f940f, 0, bArr, yVar.f939e, yVar2.f939e);
                System.arraycopy((byte[]) yVar3.f940f, 0, bArr, yVar.f939e + yVar2.f939e, yVar3.f939e);
                C1.n nVarI = C1.r.i((byte[]) yVar2.f940f, 3, yVar2.f939e, null);
                C1.j jVar = nVarI.f592b;
                String strA = jVar != null ? AbstractC0018e.a(jVar.a, jVar.f582b, jVar.f583c, jVar.f584d, jVar.f585e, jVar.f586f) : null;
                C2392n c2392n = new C2392n();
                c2392n.a = str;
                c2392n.f18073l = y1.D.m("video/mp2t");
                c2392n.f18074m = y1.D.m("video/hevc");
                c2392n.f18071j = strA;
                c2392n.f18081t = nVarI.f595e;
                c2392n.f18082u = nVarI.f596f;
                c2392n.f18053A = new C2384f(nVarI.f599i, nVarI.f600j, nVarI.f601k, nVarI.f593c + 8, nVarI.f594d + 8, null);
                c2392n.f18085x = nVarI.f597g;
                c2392n.f18076o = nVarI.f598h;
                c2392n.f18054B = nVarI.a + 1;
                c2392n.f18077p = Collections.singletonList(bArr);
                C2393o c2393o = new C2393o(c2392n);
                this.f868c.a(c2393o);
                int i10 = c2393o.f18114p;
                if (i10 == -1) {
                    throw new IllegalStateException();
                }
                wVar.getClass();
                AbstractC0015b.h(i10 >= 0);
                wVar.a = i10;
                wVar.b(i10);
                this.f870e = true;
            }
        }
        y yVar4 = this.f875j;
        boolean zE = yVar4.e(i8);
        B1.B b4 = this.f879n;
        if (zE) {
            b4.D((byte[]) yVar4.f940f, C1.r.n((byte[]) yVar4.f940f, yVar4.f939e));
            b4.G(5);
            wVar.a(j8, b4);
        }
        y yVar5 = this.f876k;
        if (yVar5.e(i8)) {
            b4.D((byte[]) yVar5.f940f, C1.r.n((byte[]) yVar5.f940f, yVar5.f939e));
            b4.G(5);
            wVar.a(j8, b4);
        }
    }

    public final void g(byte[] bArr, int i7, int i8) {
        s sVar = this.f869d;
        if (sVar.f859f) {
            int i9 = sVar.f857d;
            int i10 = (i7 + 2) - i9;
            if (i10 < i8) {
                sVar.f860g = (bArr[i10] & 128) != 0;
                sVar.f859f = false;
            } else {
                sVar.f857d = (i8 - i7) + i9;
            }
        }
        if (!this.f870e) {
            this.f872g.a(bArr, i7, i8);
            this.f873h.a(bArr, i7, i8);
            this.f874i.a(bArr, i7, i8);
        }
        this.f875j.a(bArr, i7, i8);
        this.f876k.a(bArr, i7, i8);
    }

    public final void h(int i7, int i8, long j7, long j8) {
        s sVar = this.f869d;
        boolean z7 = this.f870e;
        sVar.f860g = false;
        sVar.f861h = false;
        sVar.f858e = j8;
        sVar.f857d = 0;
        sVar.f855b = j7;
        if (i8 >= 32 && i8 != 40) {
            if (sVar.f862i && !sVar.f863j) {
                if (z7) {
                    sVar.a(i7);
                }
                sVar.f862i = false;
            }
            if ((32 <= i8 && i8 <= 35) || i8 == 39) {
                sVar.f861h = !sVar.f863j;
                sVar.f863j = true;
            }
        }
        boolean z8 = i8 >= 16 && i8 <= 21;
        sVar.f856c = z8;
        sVar.f859f = z8 || i8 <= 9;
        if (!this.f870e) {
            this.f872g.h(i8);
            this.f873h.h(i8);
            this.f874i.h(i8);
        }
        this.f875j.h(i8);
        this.f876k.h(i8);
    }
}
