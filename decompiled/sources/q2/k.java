package q2;

import B1.A;
import B1.AbstractC0015b;
import B1.B;
import B1.C0020g;
import B1.C0023j;
import C2.C0034g;
import V1.AbstractC0597b;
import V1.y;
import j3.G;
import java.util.ArrayList;
import java.util.Arrays;
import n5.P;
import y1.C;
import y1.C2392n;
import y1.C2393o;
import y1.D;
import y1.E;

/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: n, reason: collision with root package name */
    public C0023j f14720n;

    /* renamed from: o, reason: collision with root package name */
    public int f14721o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14722p;

    /* renamed from: q, reason: collision with root package name */
    public y f14723q;

    /* renamed from: r, reason: collision with root package name */
    public C0034g f14724r;

    @Override // q2.j
    public final void a(long j7) {
        this.f14713g = j7;
        this.f14722p = j7 != 0;
        y yVar = this.f14723q;
        this.f14721o = yVar != null ? yVar.f9436e : 0;
    }

    @Override // q2.j
    public final long b(B b4) {
        byte b7 = b4.a[0];
        if ((b7 & 1) == 1) {
            return -1L;
        }
        C0023j c0023j = this.f14720n;
        AbstractC0015b.i(c0023j);
        boolean z7 = ((C0020g[]) c0023j.f340o)[(b7 >> 1) & (255 >>> (8 - c0023j.f336k))].f328b;
        y yVar = (y) c0023j.f337l;
        int i7 = !z7 ? yVar.f9436e : yVar.f9437f;
        long j7 = this.f14722p ? (this.f14721o + i7) / 4 : 0;
        byte[] bArr = b4.a;
        int length = bArr.length;
        int i8 = b4.f289c + 4;
        if (length < i8) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
            b4.D(bArrCopyOf, bArrCopyOf.length);
        } else {
            b4.E(i8);
        }
        byte[] bArr2 = b4.a;
        int i9 = b4.f289c;
        bArr2[i9 - 4] = (byte) (j7 & 255);
        bArr2[i9 - 3] = (byte) ((j7 >>> 8) & 255);
        bArr2[i9 - 2] = (byte) ((j7 >>> 16) & 255);
        bArr2[i9 - 1] = (byte) ((j7 >>> 24) & 255);
        this.f14722p = true;
        this.f14721o = i7;
        return j7;
    }

    /* JADX WARN: Type inference failed for: r1v45, types: [byte[], java.io.Serializable] */
    @Override // q2.j
    public final boolean c(B b4, long j7, P p7) throws E {
        C0023j c0023j;
        y yVar;
        int i7;
        y yVar2;
        long jFloor;
        if (this.f14720n != null) {
            ((C2393o) p7.f13378l).getClass();
            return false;
        }
        y yVar3 = this.f14723q;
        int i8 = 1;
        int i9 = 4;
        if (yVar3 == null) {
            AbstractC0597b.w(1, b4, false);
            b4.l();
            int iT = b4.t();
            int iL = b4.l();
            int i10 = b4.i();
            if (i10 <= 0) {
                i10 = -1;
            }
            int i11 = b4.i();
            int i12 = i11 > 0 ? i11 : -1;
            b4.i();
            int iT2 = b4.t();
            int iPow = (int) Math.pow(2.0d, iT2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iT2 & 240) >> 4);
            b4.t();
            ?? CopyOf = Arrays.copyOf(b4.a, b4.f289c);
            y yVar4 = new y();
            yVar4.a = iT;
            yVar4.f9433b = iL;
            yVar4.f9434c = i10;
            yVar4.f9435d = i12;
            yVar4.f9436e = iPow;
            yVar4.f9437f = iPow2;
            yVar4.f9438g = CopyOf;
            this.f14723q = yVar4;
        } else {
            C0034g c0034g = this.f14724r;
            if (c0034g == null) {
                this.f14724r = AbstractC0597b.u(b4, true, true);
            } else {
                int i13 = b4.f289c;
                byte[] bArr = new byte[i13];
                System.arraycopy(b4.a, 0, bArr, 0, i13);
                int i14 = 5;
                AbstractC0597b.w(5, b4, false);
                int iT3 = b4.t() + 1;
                A a = new A(b4.a);
                int i15 = 8;
                a.t(b4.f288b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 < iT3) {
                        int i19 = i15;
                        if (a.i(24) != 5653314) {
                            throw E.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((a.f283d * 8) + a.f284e));
                        }
                        int i20 = a.i(16);
                        int i21 = a.i(24);
                        if (a.h()) {
                            a.t(i14);
                            for (int i22 = 0; i22 < i21; i22 += a.i(AbstractC0597b.l(i21 - i22))) {
                            }
                        } else {
                            boolean zH = a.h();
                            for (int i23 = 0; i23 < i21; i23++) {
                                if (!zH) {
                                    a.t(i14);
                                } else if (a.h()) {
                                    a.t(i14);
                                }
                            }
                        }
                        int i24 = a.i(i9);
                        if (i24 > 2) {
                            throw E.a(null, "lookup type greater than 2 not decodable: " + i24);
                        }
                        if (i24 == 1 || i24 == 2) {
                            a.t(32);
                            a.t(32);
                            int i25 = a.i(i9) + 1;
                            a.t(1);
                            if (i24 != 1) {
                                yVar2 = yVar3;
                                jFloor = i21 * i20;
                            } else if (i20 != 0) {
                                yVar2 = yVar3;
                                jFloor = (long) Math.floor(Math.pow(i21, 1.0d / i20));
                            } else {
                                yVar2 = yVar3;
                                jFloor = 0;
                            }
                            a.t((int) (jFloor * i25));
                        } else {
                            yVar2 = yVar3;
                        }
                        i16++;
                        i15 = i19;
                        yVar3 = yVar2;
                        i9 = 4;
                        i14 = 5;
                    } else {
                        y yVar5 = yVar3;
                        int i26 = i15;
                        int i27 = 6;
                        int i28 = a.i(6) + 1;
                        for (int i29 = 0; i29 < i28; i29++) {
                            if (a.i(16) != 0) {
                                throw E.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i30 = a.i(6) + 1;
                        int i31 = 0;
                        while (true) {
                            int i32 = 3;
                            if (i31 < i30) {
                                int i33 = a.i(i18);
                                if (i33 == 0) {
                                    int i34 = i26;
                                    i7 = i8;
                                    a.t(i34);
                                    a.t(16);
                                    a.t(16);
                                    a.t(6);
                                    a.t(i34);
                                    int i35 = a.i(4) + 1;
                                    int i36 = 0;
                                    while (i36 < i35) {
                                        a.t(i34);
                                        i36++;
                                        i34 = 8;
                                    }
                                } else {
                                    if (i33 != i8) {
                                        throw E.a(null, "floor type greater than 1 not decodable: " + i33);
                                    }
                                    int i37 = a.i(5);
                                    int[] iArr = new int[i37];
                                    i7 = i8;
                                    int i38 = -1;
                                    for (int i39 = 0; i39 < i37; i39++) {
                                        int i40 = a.i(4);
                                        iArr[i39] = i40;
                                        if (i40 > i38) {
                                            i38 = i40;
                                        }
                                    }
                                    int i41 = i38 + 1;
                                    int[] iArr2 = new int[i41];
                                    int i42 = 0;
                                    while (i42 < i41) {
                                        iArr2[i42] = a.i(i32) + 1;
                                        int i43 = a.i(i17);
                                        int i44 = i26;
                                        if (i43 > 0) {
                                            a.t(i44);
                                        }
                                        int i45 = 0;
                                        while (i45 < (i7 << i43)) {
                                            a.t(i44);
                                            i45++;
                                            i44 = 8;
                                        }
                                        i42++;
                                        i26 = 8;
                                        i32 = 3;
                                        i17 = 2;
                                    }
                                    a.t(i17);
                                    int i46 = a.i(4);
                                    int i47 = 0;
                                    int i48 = 0;
                                    for (int i49 = 0; i49 < i37; i49++) {
                                        i47 += iArr2[iArr[i49]];
                                        while (i48 < i47) {
                                            a.t(i46);
                                            i48++;
                                        }
                                    }
                                }
                                i31++;
                                i8 = i7;
                                i26 = 8;
                                i27 = 6;
                                i18 = 16;
                                i17 = 2;
                            } else {
                                int i50 = i8;
                                int i51 = a.i(i27) + 1;
                                int i52 = 0;
                                while (i52 < i51) {
                                    if (a.i(16) > 2) {
                                        throw E.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    a.t(24);
                                    a.t(24);
                                    a.t(24);
                                    int i53 = a.i(i27) + 1;
                                    int i54 = 8;
                                    a.t(8);
                                    int[] iArr3 = new int[i53];
                                    for (int i55 = 0; i55 < i53; i55++) {
                                        iArr3[i55] = ((a.h() ? a.i(5) : 0) * 8) + a.i(3);
                                    }
                                    int i56 = 0;
                                    while (i56 < i53) {
                                        int i57 = 0;
                                        while (i57 < i54) {
                                            if ((iArr3[i56] & (i50 << i57)) != 0) {
                                                a.t(i54);
                                            }
                                            i57++;
                                            i54 = 8;
                                        }
                                        i56++;
                                        i54 = 8;
                                    }
                                    i52++;
                                    i27 = 6;
                                }
                                int i58 = a.i(i27) + 1;
                                int i59 = 0;
                                while (i59 < i58) {
                                    int i60 = a.i(16);
                                    if (i60 != 0) {
                                        AbstractC0015b.m("VorbisUtil", "mapping type other than 0 not supported: " + i60);
                                        yVar = yVar5;
                                    } else {
                                        int i61 = a.h() ? a.i(4) + 1 : i50;
                                        boolean zH2 = a.h();
                                        yVar = yVar5;
                                        int i62 = yVar.a;
                                        if (zH2) {
                                            int i63 = a.i(8) + 1;
                                            for (int i64 = 0; i64 < i63; i64++) {
                                                int i65 = i62 - 1;
                                                a.t(AbstractC0597b.l(i65));
                                                a.t(AbstractC0597b.l(i65));
                                            }
                                        }
                                        if (a.i(2) != 0) {
                                            throw E.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i61 > i50) {
                                            for (int i66 = 0; i66 < i62; i66++) {
                                                a.t(4);
                                            }
                                        }
                                        for (int i67 = 0; i67 < i61; i67++) {
                                            a.t(8);
                                            a.t(8);
                                            a.t(8);
                                        }
                                    }
                                    i59++;
                                    yVar5 = yVar;
                                    i50 = 1;
                                }
                                y yVar6 = yVar5;
                                int i68 = a.i(6);
                                int i69 = i68 + 1;
                                C0020g[] c0020gArr = new C0020g[i69];
                                for (int i70 = 0; i70 < i69; i70++) {
                                    boolean zH3 = a.h();
                                    a.i(16);
                                    a.i(16);
                                    a.i(8);
                                    c0020gArr[i70] = new C0020g(zH3, 4);
                                }
                                if (!a.h()) {
                                    throw E.a(null, "framing bit after modes not set as expected");
                                }
                                c0023j = new C0023j(yVar6, c0034g, bArr, c0020gArr, AbstractC0597b.l(i68));
                            }
                        }
                    }
                }
            }
        }
        c0023j = null;
        this.f14720n = c0023j;
        if (c0023j == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        y yVar7 = (y) c0023j.f337l;
        arrayList.add((byte[]) yVar7.f9438g);
        arrayList.add((byte[]) c0023j.f339n);
        C cR = AbstractC0597b.r(G.t((String[]) ((C0034g) c0023j.f338m).f741l));
        C2392n c2392n = new C2392n();
        c2392n.f18073l = D.m("audio/ogg");
        c2392n.f18074m = D.m("audio/vorbis");
        c2392n.f18069h = yVar7.f9435d;
        c2392n.f18070i = yVar7.f9434c;
        c2392n.f18055C = yVar7.a;
        c2392n.f18056D = yVar7.f9433b;
        c2392n.f18077p = arrayList;
        c2392n.f18072k = cR;
        p7.f13378l = new C2393o(c2392n);
        return true;
    }

    @Override // q2.j
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.f14720n = null;
            this.f14723q = null;
            this.f14724r = null;
        }
        this.f14721o = 0;
        this.f14722p = false;
    }
}
