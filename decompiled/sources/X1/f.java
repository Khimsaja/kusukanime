package X1;

import B1.AbstractC0015b;
import B1.B;
import B1.K;
import j3.AbstractC1314A;
import j3.AbstractC1331q;
import j3.E;
import j3.G;
import j3.X;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import y1.C2392n;
import y1.C2393o;
import y1.D;

/* loaded from: classes.dex */
public final class f implements a {
    public final X a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9802b;

    public f(int i7, X x7) {
        this.f9802b = i7;
        this.a = x7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i7, B b4) {
        a gVar;
        String str;
        int i8 = 4;
        AbstractC1331q.b(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i9 = b4.f289c;
        int iA = -2;
        int i10 = 0;
        while (b4.a() > 8) {
            int i11 = b4.i();
            int i12 = b4.f288b + b4.i();
            b4.E(i12);
            if (i11 != 1414744396) {
                d dVar = null;
                switch (i11) {
                    case 1718776947:
                        if (iA == 2) {
                            b4.G(i8);
                            int i13 = b4.i();
                            int i14 = b4.i();
                            b4.G(i8);
                            int i15 = b4.i();
                            switch (i15) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                C2392n c2392n = new C2392n();
                                c2392n.f18081t = i13;
                                c2392n.f18082u = i14;
                                c2392n.f18074m = D.m(str);
                                gVar = new g(new C2393o(c2392n));
                                break;
                            } else {
                                A6.b.n(i15, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (iA == 1) {
                                int iM = b4.m();
                                String str2 = iM != 1 ? iM != 85 ? iM != 255 ? iM != 8192 ? iM != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iM2 = b4.m();
                                    int i16 = b4.i();
                                    b4.G(6);
                                    int iU = K.u(b4.m());
                                    int iM3 = b4.a() > 0 ? b4.m() : 0;
                                    C2392n c2392n2 = new C2392n();
                                    c2392n2.f18074m = D.m(str2);
                                    c2392n2.f18055C = iM2;
                                    c2392n2.f18056D = i16;
                                    if (str2.equals("audio/raw") && iU != 0) {
                                        c2392n2.f18057E = iU;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iM3 > 0) {
                                        byte[] bArr = new byte[iM3];
                                        b4.e(bArr, 0, iM3);
                                        c2392n2.f18077p = G.w(bArr);
                                    }
                                    gVar = new g(new C2393o(c2392n2));
                                    break;
                                } else {
                                    A6.b.n(iM, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                AbstractC0015b.v("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + K.x(iA));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int i17 = b4.i();
                        b4.G(8);
                        int i18 = b4.i();
                        int i19 = b4.i();
                        b4.G(i8);
                        b4.i();
                        b4.G(12);
                        gVar = new c(i17, i18, i19);
                        break;
                    case 1752331379:
                        int i20 = b4.i();
                        b4.G(12);
                        b4.i();
                        int i21 = b4.i();
                        int i22 = b4.i();
                        b4.G(i8);
                        int i23 = b4.i();
                        int i24 = b4.i();
                        b4.G(i8);
                        dVar = new d(i20, i21, i22, i23, i24, b4.i());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(b4.r(b4.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(b4.i(), b4);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    iA = ((d) gVar).a();
                }
                int i25 = i10 + 1;
                int iE = AbstractC1314A.e(objArrCopyOf.length, i25);
                if (iE > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
                }
                objArrCopyOf[i10] = gVar;
                i10 = i25;
            }
            b4.F(i12);
            b4.E(i9);
            i8 = 4;
        }
        return new f(i7, G.q(i10, objArrCopyOf));
    }

    public final a a(Class cls) {
        E eListIterator = this.a.listIterator(0);
        while (eListIterator.hasNext()) {
            a aVar = (a) eListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // X1.a
    public final int getType() {
        return this.f9802b;
    }
}
