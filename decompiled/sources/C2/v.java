package C2;

import B1.AbstractC0015b;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final class v implements InterfaceC0037j {
    public final B1.B a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.y f901b;

    /* renamed from: c, reason: collision with root package name */
    public final String f902c;

    /* renamed from: d, reason: collision with root package name */
    public final int f903d;

    /* renamed from: e, reason: collision with root package name */
    public final String f904e;

    /* renamed from: f, reason: collision with root package name */
    public V1.G f905f;

    /* renamed from: g, reason: collision with root package name */
    public String f906g;

    /* renamed from: h, reason: collision with root package name */
    public int f907h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f908i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f909j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f910k;

    /* renamed from: l, reason: collision with root package name */
    public long f911l;

    /* renamed from: m, reason: collision with root package name */
    public int f912m;

    /* renamed from: n, reason: collision with root package name */
    public long f913n;

    public v(String str, int i7, String str2) {
        B1.B b4 = new B1.B(4);
        this.a = b4;
        b4.a[0] = -1;
        this.f901b = new V1.y();
        this.f913n = -9223372036854775807L;
        this.f902c = str;
        this.f903d = i7;
        this.f904e = str2;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        this.f907h = 0;
        this.f908i = 0;
        this.f910k = false;
        this.f913n = -9223372036854775807L;
    }

    @Override // C2.InterfaceC0037j
    public final void b(B1.B b4) {
        AbstractC0015b.i(this.f905f);
        while (b4.a() > 0) {
            int i7 = this.f907h;
            B1.B b7 = this.a;
            if (i7 == 0) {
                byte[] bArr = b4.a;
                int i8 = b4.f288b;
                int i9 = b4.f289c;
                while (true) {
                    if (i8 >= i9) {
                        b4.F(i9);
                        break;
                    }
                    byte b8 = bArr[i8];
                    boolean z7 = (b8 & 255) == 255;
                    boolean z8 = this.f910k && (b8 & 224) == 224;
                    this.f910k = z7;
                    if (z8) {
                        b4.F(i8 + 1);
                        this.f910k = false;
                        b7.a[1] = bArr[i8];
                        this.f908i = 2;
                        this.f907h = 1;
                        break;
                    }
                    i8++;
                }
            } else if (i7 == 1) {
                int iMin = Math.min(b4.a(), 4 - this.f908i);
                b4.e(b7.a, this.f908i, iMin);
                int i10 = this.f908i + iMin;
                this.f908i = i10;
                if (i10 >= 4) {
                    b7.F(0);
                    int iG = b7.g();
                    V1.y yVar = this.f901b;
                    if (yVar.a(iG)) {
                        this.f912m = yVar.f9433b;
                        if (!this.f909j) {
                            this.f911l = (yVar.f9437f * 1000000) / yVar.f9434c;
                            C2392n c2392n = new C2392n();
                            c2392n.a = this.f906g;
                            c2392n.f18073l = y1.D.m(this.f904e);
                            c2392n.f18074m = y1.D.m((String) yVar.f9438g);
                            c2392n.f18075n = 4096;
                            c2392n.f18055C = yVar.f9435d;
                            c2392n.f18056D = yVar.f9434c;
                            c2392n.f18065d = this.f902c;
                            c2392n.f18067f = this.f903d;
                            this.f905f.a(new C2393o(c2392n));
                            this.f909j = true;
                        }
                        b7.F(0);
                        this.f905f.c(b7, 4, 0);
                        this.f907h = 2;
                    } else {
                        this.f908i = 0;
                        this.f907h = 1;
                    }
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(b4.a(), this.f912m - this.f908i);
                this.f905f.c(b4, iMin2, 0);
                int i11 = this.f908i + iMin2;
                this.f908i = i11;
                if (i11 >= this.f912m) {
                    AbstractC0015b.h(this.f913n != -9223372036854775807L);
                    this.f905f.b(this.f913n, 1, this.f912m, 0, null);
                    this.f913n += this.f911l;
                    this.f908i = 0;
                    this.f907h = 0;
                }
            }
        }
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f913n = j7;
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.f906g = k7.f689e;
        k7.b();
        this.f905f = pVar.m(k7.f688d, 1);
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
    }
}
