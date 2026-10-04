package V1;

import B1.K;
import java.util.Collections;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final class t {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9406b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9407c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9408d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9409e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9410f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9411g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9412h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9413i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9414j;

    /* renamed from: k, reason: collision with root package name */
    public final L2.e f9415k;

    /* renamed from: l, reason: collision with root package name */
    public final y1.C f9416l;

    public t(byte[] bArr, int i7) {
        B1.A a = new B1.A(bArr, bArr.length);
        a.q(i7 * 8);
        this.a = a.i(16);
        this.f9406b = a.i(16);
        this.f9407c = a.i(24);
        this.f9408d = a.i(24);
        int i8 = a.i(20);
        this.f9409e = i8;
        this.f9410f = d(i8);
        this.f9411g = a.i(3) + 1;
        int i9 = a.i(5) + 1;
        this.f9412h = i9;
        this.f9413i = a(i9);
        this.f9414j = a.k(36);
        this.f9415k = null;
        this.f9416l = null;
    }

    public static int a(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 20) {
            return 5;
        }
        if (i7 != 24) {
            return i7 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j7 = this.f9414j;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / this.f9409e;
    }

    public final C2393o c(byte[] bArr, y1.C c2) {
        bArr[4] = -128;
        int i7 = this.f9408d;
        if (i7 <= 0) {
            i7 = -1;
        }
        y1.C c4 = this.f9416l;
        if (c4 != null) {
            c2 = c4.b(c2);
        }
        C2392n c2392n = new C2392n();
        c2392n.f18074m = y1.D.m("audio/flac");
        c2392n.f18075n = i7;
        c2392n.f18055C = this.f9411g;
        c2392n.f18056D = this.f9409e;
        c2392n.f18057E = K.u(this.f9412h);
        c2392n.f18077p = Collections.singletonList(bArr);
        c2392n.f18072k = c2;
        return new C2393o(c2392n);
    }

    public t(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, L2.e eVar, y1.C c2) {
        this.a = i7;
        this.f9406b = i8;
        this.f9407c = i9;
        this.f9408d = i10;
        this.f9409e = i11;
        this.f9410f = d(i11);
        this.f9411g = i12;
        this.f9412h = i13;
        this.f9413i = a(i13);
        this.f9414j = j7;
        this.f9415k = eVar;
        this.f9416l = c2;
    }
}
