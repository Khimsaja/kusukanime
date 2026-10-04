package p2;

import B1.B;
import B1.K;
import V1.G;
import y1.C2392n;
import y1.C2393o;
import y1.D;

/* loaded from: classes.dex */
public final class g {
    public final G a;

    /* renamed from: d, reason: collision with root package name */
    public s f14217d;

    /* renamed from: e, reason: collision with root package name */
    public d f14218e;

    /* renamed from: f, reason: collision with root package name */
    public int f14219f;

    /* renamed from: g, reason: collision with root package name */
    public int f14220g;

    /* renamed from: h, reason: collision with root package name */
    public int f14221h;

    /* renamed from: i, reason: collision with root package name */
    public int f14222i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14223j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14226m;

    /* renamed from: b, reason: collision with root package name */
    public final r f14215b = new r();

    /* renamed from: c, reason: collision with root package name */
    public final B f14216c = new B();

    /* renamed from: k, reason: collision with root package name */
    public final B f14224k = new B(1);

    /* renamed from: l, reason: collision with root package name */
    public final B f14225l = new B();

    public g(G g4, s sVar, d dVar, String str) {
        this.a = g4;
        this.f14217d = sVar;
        this.f14218e = dVar;
        this.f14223j = str;
        e(sVar, dVar);
    }

    public final int a() {
        int i7 = !this.f14226m ? this.f14217d.f14340g[this.f14219f] : this.f14215b.f14327j[this.f14219f] ? 1 : 0;
        return b() != null ? i7 | 1073741824 : i7;
    }

    public final q b() {
        if (!this.f14226m) {
            return null;
        }
        r rVar = this.f14215b;
        d dVar = rVar.a;
        int i7 = K.a;
        int i8 = dVar.a;
        q qVar = rVar.f14330m;
        if (qVar == null) {
            qVar = this.f14217d.a.f14314l[i8];
        }
        if (qVar == null || !qVar.a) {
            return null;
        }
        return qVar;
    }

    public final boolean c() {
        this.f14219f++;
        if (!this.f14226m) {
            return false;
        }
        int i7 = this.f14220g + 1;
        this.f14220g = i7;
        int[] iArr = this.f14215b.f14324g;
        int i8 = this.f14221h;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.f14221h = i8 + 1;
        this.f14220g = 0;
        return false;
    }

    public final int d(int i7, int i8) {
        B b4;
        q qVarB = b();
        if (qVarB == null) {
            return 0;
        }
        r rVar = this.f14215b;
        int length = qVarB.f14317d;
        if (length != 0) {
            b4 = rVar.f14331n;
        } else {
            int i9 = K.a;
            byte[] bArr = qVarB.f14318e;
            int length2 = bArr.length;
            B b7 = this.f14225l;
            b7.D(bArr, length2);
            length = bArr.length;
            b4 = b7;
        }
        boolean z7 = rVar.f14328k && rVar.f14329l[this.f14219f];
        boolean z8 = z7 || i8 != 0;
        B b8 = this.f14224k;
        b8.a[0] = (byte) ((z8 ? 128 : 0) | length);
        b8.F(0);
        G g4 = this.a;
        g4.c(b8, 1, 1);
        g4.c(b4, length, 1);
        if (!z8) {
            return length + 1;
        }
        B b9 = this.f14216c;
        if (!z7) {
            b9.C(8);
            byte[] bArr2 = b9.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i8 & 255);
            bArr2[4] = (byte) ((i7 >> 24) & 255);
            bArr2[5] = (byte) ((i7 >> 16) & 255);
            bArr2[6] = (byte) ((i7 >> 8) & 255);
            bArr2[7] = (byte) (i7 & 255);
            g4.c(b9, 8, 1);
            return length + 9;
        }
        B b10 = rVar.f14331n;
        int iZ = b10.z();
        b10.G(-2);
        int i10 = (iZ * 6) + 2;
        if (i8 != 0) {
            b9.C(i10);
            byte[] bArr3 = b9.a;
            b10.e(bArr3, 0, i10);
            int i11 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i8;
            bArr3[2] = (byte) ((i11 >> 8) & 255);
            bArr3[3] = (byte) (i11 & 255);
        } else {
            b9 = b10;
        }
        g4.c(b9, i10, 1);
        return length + 1 + i10;
    }

    public final void e(s sVar, d dVar) {
        this.f14217d = sVar;
        this.f14218e = dVar;
        C2392n c2392nA = sVar.a.f14309g.a();
        c2392nA.f18073l = D.m(this.f14223j);
        this.a.a(new C2393o(c2392nA));
        f();
    }

    public final void f() {
        r rVar = this.f14215b;
        rVar.f14321d = 0;
        rVar.f14333p = 0L;
        rVar.f14334q = false;
        rVar.f14328k = false;
        rVar.f14332o = false;
        rVar.f14330m = null;
        this.f14219f = 0;
        this.f14221h = 0;
        this.f14220g = 0;
        this.f14222i = 0;
        this.f14226m = false;
    }
}
