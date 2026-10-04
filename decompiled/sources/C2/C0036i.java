package C2;

import B1.AbstractC0015b;
import java.util.Collections;
import java.util.List;
import y1.C2392n;

/* renamed from: C2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036i implements InterfaceC0037j {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f758b;

    /* renamed from: c, reason: collision with root package name */
    public long f759c;

    /* renamed from: d, reason: collision with root package name */
    public int f760d;

    /* renamed from: e, reason: collision with root package name */
    public int f761e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f762f;

    /* renamed from: g, reason: collision with root package name */
    public Object f763g;

    public C0036i(List list) {
        this.a = 0;
        this.f762f = list;
        this.f763g = new V1.G[list.size()];
        this.f759c = -9223372036854775807L;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        switch (this.a) {
            case 0:
                this.f758b = false;
                this.f759c = -9223372036854775807L;
                break;
            default:
                this.f758b = false;
                this.f759c = -9223372036854775807L;
                break;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void b(B1.B b4) {
        boolean z7;
        boolean z8;
        switch (this.a) {
            case 0:
                if (this.f758b) {
                    if (this.f760d == 2) {
                        if (b4.a() == 0) {
                            z8 = false;
                        } else {
                            if (b4.t() != 32) {
                                this.f758b = false;
                            }
                            this.f760d--;
                            z8 = this.f758b;
                        }
                        if (!z8) {
                        }
                    }
                    if (this.f760d == 1) {
                        if (b4.a() == 0) {
                            z7 = false;
                        } else {
                            if (b4.t() != 0) {
                                this.f758b = false;
                            }
                            this.f760d--;
                            z7 = this.f758b;
                        }
                        if (!z7) {
                        }
                    }
                    int i7 = b4.f288b;
                    int iA = b4.a();
                    for (V1.G g4 : (V1.G[]) this.f763g) {
                        b4.F(i7);
                        g4.c(b4, iA, 0);
                    }
                    this.f761e += iA;
                    break;
                }
                break;
            default:
                AbstractC0015b.i((V1.G) this.f763g);
                if (this.f758b) {
                    int iA2 = b4.a();
                    int i8 = this.f761e;
                    if (i8 < 10) {
                        int iMin = Math.min(iA2, 10 - i8);
                        byte[] bArr = b4.a;
                        int i9 = b4.f288b;
                        B1.B b7 = (B1.B) this.f762f;
                        System.arraycopy(bArr, i9, b7.a, this.f761e, iMin);
                        if (this.f761e + iMin == 10) {
                            b7.F(0);
                            if (73 != b7.t() || 68 != b7.t() || 51 != b7.t()) {
                                AbstractC0015b.v("Id3Reader", "Discarding invalid ID3 tag");
                                this.f758b = false;
                                break;
                            } else {
                                b7.G(3);
                                this.f760d = b7.s() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f760d - this.f761e);
                    ((V1.G) this.f763g).c(b4, iMin2, 0);
                    this.f761e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
        int i7;
        switch (this.a) {
            case 0:
                if (this.f758b) {
                    AbstractC0015b.h(this.f759c != -9223372036854775807L);
                    for (V1.G g4 : (V1.G[]) this.f763g) {
                        g4.b(this.f759c, 1, this.f761e, 0, null);
                    }
                    this.f758b = false;
                    break;
                }
                break;
            default:
                AbstractC0015b.i((V1.G) this.f763g);
                if (this.f758b && (i7 = this.f760d) != 0 && this.f761e == i7) {
                    AbstractC0015b.h(this.f759c != -9223372036854775807L);
                    ((V1.G) this.f763g).b(this.f759c, 1, this.f760d, 0, null);
                    this.f758b = false;
                    break;
                }
                break;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        switch (this.a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f758b = true;
                    this.f759c = j7;
                    this.f761e = 0;
                    this.f760d = 2;
                    break;
                }
                break;
            default:
                if ((i7 & 4) != 0) {
                    this.f758b = true;
                    this.f759c = j7;
                    this.f760d = 0;
                    this.f761e = 0;
                    break;
                }
                break;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        switch (this.a) {
            case 0:
                int i7 = 0;
                while (true) {
                    V1.G[] gArr = (V1.G[]) this.f763g;
                    if (i7 >= gArr.length) {
                        break;
                    } else {
                        J j7 = (J) ((List) this.f762f).get(i7);
                        k7.a();
                        k7.b();
                        V1.G gM = pVar.m(k7.f688d, 3);
                        C2392n c2392n = new C2392n();
                        k7.b();
                        c2392n.a = k7.f689e;
                        c2392n.f18073l = y1.D.m("video/mp2t");
                        c2392n.f18074m = y1.D.m("application/dvbsubs");
                        c2392n.f18077p = Collections.singletonList(j7.f685b);
                        c2392n.f18065d = j7.a;
                        A6.b.r(c2392n, gM);
                        gArr[i7] = gM;
                        i7++;
                    }
                }
            default:
                k7.a();
                k7.b();
                V1.G gM2 = pVar.m(k7.f688d, 5);
                this.f763g = gM2;
                C2392n c2392n2 = new C2392n();
                k7.b();
                c2392n2.a = k7.f689e;
                c2392n2.f18073l = y1.D.m("video/mp2t");
                c2392n2.f18074m = y1.D.m("application/id3");
                A6.b.r(c2392n2, gM2);
                break;
        }
    }

    public C0036i() {
        this.a = 1;
        this.f762f = new B1.B(10);
        this.f759c = -9223372036854775807L;
    }
}
