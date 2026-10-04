package p;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import b1.AbstractC0703b;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import s2.InterfaceC1980h;
import s2.InterfaceC1982j;
import u2.C2075h;
import w2.C2209a;
import w6.AbstractC2217b;
import w6.C2218c;
import w6.C2221f;
import w6.C2224i;
import x2.C2253a;
import y1.C2393o;
import y2.C2408e;
import z2.C2484a;
import z5.AbstractC2517v;
import z5.C2496a;

/* loaded from: classes.dex */
public class I0 implements E0, q2.h, InterfaceC1980h {

    /* renamed from: l, reason: collision with root package name */
    public static I0 f13882l;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13883k;

    public /* synthetic */ I0(int i7) {
        this.f13883k = i7;
    }

    public static final String l(byte[] bArr, byte[][] bArr2, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f13828e;
        int length = bArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = (i12 + length) / 2;
            while (i13 > i11 && bArr[i13] != 10) {
                i13 += i11;
            }
            int i14 = i13 + 1;
            int i15 = 1;
            while (true) {
                i8 = i14 + i15;
                if (bArr[i8] == 10) {
                    break;
                }
                i15++;
            }
            int i16 = i8 - i14;
            int i17 = i7;
            boolean z8 = false;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (z8) {
                    i9 = 46;
                    z7 = false;
                } else {
                    byte b4 = bArr2[i17][i18];
                    byte[] bArr4 = g6.b.a;
                    int i20 = b4 & 255;
                    z7 = z8;
                    i9 = i20;
                }
                byte b7 = bArr[i14 + i19];
                byte[] bArr5 = g6.b.a;
                i10 = i9 - (b7 & 255);
                if (i10 != 0) {
                    break;
                }
                i19++;
                i18++;
                if (i19 == i16) {
                    break;
                }
                if (bArr2[i17].length != i18) {
                    z8 = z7;
                } else {
                    if (i17 == bArr2.length - 1) {
                        break;
                    }
                    i17++;
                    z8 = true;
                    i18 = -1;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i21 = i16 - i19;
                    int length2 = bArr2[i17].length - i18;
                    int length3 = bArr2.length;
                    for (int i22 = i17 + 1; i22 < length3; i22++) {
                        length2 += bArr2[i22].length;
                    }
                    if (length2 >= i21) {
                        if (length2 <= i21) {
                            Charset charset = StandardCharsets.UTF_8;
                            kotlin.jvm.internal.l.e("UTF_8", charset);
                            return new String(bArr, i14, i16, charset);
                        }
                    }
                    length = i13;
                }
                i12 = i8 + 1;
            } else {
                length = i13;
            }
            i11 = -1;
        }
        return null;
    }

    public static final void n(C2221f c2221f, long j7, boolean z7) {
        F5.o oVar = C2221f.f17139h;
        if (C2221f.f17140i == null) {
            C2221f.f17140i = new C2221f();
            C2218c c2218c = new C2218c("Okio Watchdog");
            c2218c.setDaemon(true);
            c2218c.start();
        }
        long jNanoTime = System.nanoTime();
        if (j7 != 0 && z7) {
            c2221f.f17147g = Math.min(j7, c2221f.c() - jNanoTime) + jNanoTime;
        } else if (j7 != 0) {
            c2221f.f17147g = jNanoTime + j7;
        } else {
            if (!z7) {
                throw new AssertionError();
            }
            c2221f.f17147g = c2221f.c();
        }
        F5.o oVar2 = C2221f.f17139h;
        kotlin.jvm.internal.l.f("node", c2221f);
        int i7 = oVar2.f2541l + 1;
        oVar2.f2541l = i7;
        C2221f[] c2221fArr = (C2221f[]) oVar2.f2542m;
        if (i7 == c2221fArr.length) {
            C2221f[] c2221fArr2 = new C2221f[i7 * 2];
            P3.m.Z(0, 0, 14, c2221fArr, c2221fArr2);
            oVar2.f2542m = c2221fArr2;
        }
        oVar2.r(i7, c2221f);
        if (c2221f.f17146f == 1) {
            C2221f.f17142k.signal();
        }
    }

    public static final boolean p(w6.y yVar) {
        w6.y yVar2 = x6.e.f17530o;
        yVar.getClass();
        w6.l lVar = x6.c.a;
        w6.l lVarO = yVar.f17191k;
        int iK = w6.l.k(lVarO, lVar);
        if (iK == -1) {
            iK = w6.l.k(lVarO, x6.c.f17523b);
        }
        if (iK != -1) {
            lVarO = w6.l.o(lVarO, iK + 1, 0, 2);
        } else if (yVar.g() != null && lVarO.d() == 2) {
            lVarO = w6.l.f17157n;
        }
        return !AbstractC2517v.L(lVarO.r(), ".class", true);
    }

    public static C2221f q() throws InterruptedException {
        F5.o oVar = C2221f.f17139h;
        C2221f c2221f = ((C2221f[]) oVar.f2542m)[1];
        if (c2221f == null) {
            long jNanoTime = System.nanoTime();
            C2221f.f17142k.await(C2221f.f17143l, TimeUnit.MILLISECONDS);
            if (((C2221f[]) oVar.f2542m)[1] != null || System.nanoTime() - jNanoTime < C2221f.f17144m) {
                return null;
            }
            return C2221f.f17140i;
        }
        long jNanoTime2 = c2221f.f17147g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C2221f.f17142k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        oVar.u(c2221f);
        c2221f.f17145e = 2;
        return c2221f;
    }

    public static w6.l r(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            bArr[i7] = (byte) (x6.b.a(str.charAt(i8 + 1)) + (x6.b.a(str.charAt(i8)) << 4));
        }
        return new w6.l(bArr);
    }

    public static w6.l s(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        byte[] bytes = str.getBytes(C2496a.f19036b);
        kotlin.jvm.internal.l.e("getBytes(...)", bytes);
        w6.l lVar = new w6.l(bytes);
        lVar.f17160m = str;
        return lVar;
    }

    public static w6.y t(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        w6.l lVar = x6.c.a;
        C2224i c2224i = new C2224i();
        c2224i.k0(str);
        return x6.c.d(c2224i, false);
    }

    public static w6.y u(File file) {
        String str = w6.y.f17190l;
        String string = file.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        return t(string);
    }

    public static w6.l x(byte[] bArr, int i7) {
        kotlin.jvm.internal.l.f("<this>", bArr);
        if (i7 == -1234567890) {
            i7 = bArr.length;
        }
        AbstractC2217b.e(bArr.length, 0, i7);
        return new w6.l(P3.m.a0(bArr, 0, i7));
    }

    @Override // s2.InterfaceC1980h
    public boolean c(C2393o c2393o) {
        switch (this.f13883k) {
            case 10:
                String str = c2393o.f18112n;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    @Override // q2.h
    public long f(V1.k kVar) {
        return -1L;
    }

    @Override // q2.h
    public V1.A g() {
        return new V1.s(-9223372036854775807L);
    }

    @Override // s2.InterfaceC1980h
    public int h(C2393o c2393o) {
        switch (this.f13883k) {
            case 10:
                String str = c2393o.f18112n;
                if (str != null) {
                    switch (str) {
                        case "application/dvbsubs":
                        case "application/pgs":
                        case "application/x-mp4-vtt":
                        case "application/x-quicktime-tx3g":
                        case "application/vobsub":
                            return 2;
                        case "text/vtt":
                        case "text/x-ssa":
                        case "application/x-subrip":
                        case "application/ttml+xml":
                            return 1;
                    }
                }
                throw new IllegalArgumentException(AbstractC0703b.i("Unsupported MIME type: ", str));
            default:
                return 1;
        }
    }

    @Override // p.D0
    public AbstractC1766r i(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return j7 < ((long) 0) * 1000000 ? abstractC1766r : abstractC1766r2;
    }

    @Override // s2.InterfaceC1980h
    public InterfaceC1982j k(C2393o c2393o) {
        List list;
        InterfaceC1982j c2075h;
        switch (this.f13883k) {
            case 10:
                String str = c2393o.f18112n;
                if (str != null) {
                    list = c2393o.f18115q;
                    switch (str) {
                        case "application/dvbsubs":
                            c2075h = new C2075h(list);
                            break;
                        case "application/pgs":
                            return new A2.b(17);
                        case "application/x-mp4-vtt":
                            return new B2.a(0);
                        case "text/vtt":
                            return new F.w(3);
                        case "application/x-quicktime-tx3g":
                            c2075h = new C2484a(list);
                            break;
                        case "text/x-ssa":
                            c2075h = new C2209a(list);
                            break;
                        case "application/vobsub":
                            c2075h = new A2.b(list);
                            break;
                        case "application/x-subrip":
                            return new C2253a();
                        case "application/ttml+xml":
                            return new C2408e();
                    }
                    return c2075h;
                }
                throw new IllegalArgumentException(AbstractC0703b.i("Unsupported MIME type: ", str));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // p.E0
    public int m() {
        return 0;
    }

    @Override // p.E0
    public int o() {
        return 0;
    }

    public Signature[] v(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean w(CharSequence charSequence) {
        return false;
    }

    @Override // q2.h
    public void j(long j7) {
    }

    @Override // p.D0
    public AbstractC1766r e(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return abstractC1766r3;
    }
}
