package t2;

import B1.A;
import B1.AbstractC0015b;
import B1.AbstractC0018e;
import B1.B;
import T4.i;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2040f extends AbstractC2042h {

    /* renamed from: h, reason: collision with root package name */
    public final B f15955h = new B();

    /* renamed from: i, reason: collision with root package name */
    public final A f15956i = new A();

    /* renamed from: j, reason: collision with root package name */
    public int f15957j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final int f15958k;

    /* renamed from: l, reason: collision with root package name */
    public final C2039e[] f15959l;

    /* renamed from: m, reason: collision with root package name */
    public C2039e f15960m;

    /* renamed from: n, reason: collision with root package name */
    public List f15961n;

    /* renamed from: o, reason: collision with root package name */
    public List f15962o;

    /* renamed from: p, reason: collision with root package name */
    public A f15963p;

    /* renamed from: q, reason: collision with root package name */
    public int f15964q;

    public C2040f(int i7, List list) {
        this.f15958k = i7 == -1 ? 1 : i7;
        if (list != null) {
            byte[] bArr = AbstractC0018e.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b4 = ((byte[]) list.get(0))[0];
            }
        }
        this.f15959l = new C2039e[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f15959l[i8] = new C2039e();
        }
        this.f15960m = this.f15959l[0];
    }

    @Override // t2.AbstractC2042h, G1.c
    public final void flush() {
        super.flush();
        this.f15961n = null;
        this.f15962o = null;
        this.f15964q = 0;
        this.f15960m = this.f15959l[0];
        m();
        this.f15963p = null;
    }

    @Override // t2.AbstractC2042h
    public final i g() {
        List list = this.f15961n;
        this.f15962o = list;
        list.getClass();
        return new i(list);
    }

    @Override // t2.AbstractC2042h
    public final void h(C2041g c2041g) {
        ByteBuffer byteBuffer = c2041g.f2609o;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        B b4 = this.f15955h;
        b4.D(bArrArray, iLimit);
        while (b4.a() >= 3) {
            int iT = b4.t();
            int i7 = iT & 3;
            boolean z7 = (iT & 4) == 4;
            byte bT = (byte) b4.t();
            byte bT2 = (byte) b4.t();
            if (i7 == 2 || i7 == 3) {
                if (z7) {
                    if (i7 == 3) {
                        k();
                        int i8 = (bT & 192) >> 6;
                        int i9 = this.f15957j;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            m();
                            AbstractC0015b.v("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f15957j + " current=" + i8);
                        }
                        this.f15957j = i8;
                        int i10 = bT & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        A a = new A(i8, i10);
                        this.f15963p = a;
                        a.f284e = 1;
                        a.f281b[0] = bT2;
                    } else {
                        AbstractC0015b.c(i7 == 2);
                        A a7 = this.f15963p;
                        if (a7 == null) {
                            AbstractC0015b.m("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = a7.f281b;
                            int i11 = a7.f284e;
                            int i12 = i11 + 1;
                            a7.f284e = i12;
                            bArr[i11] = bT;
                            a7.f284e = i11 + 2;
                            bArr[i12] = bT2;
                        }
                    }
                    A a8 = this.f15963p;
                    if (a8.f284e == (a8.f283d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // t2.AbstractC2042h
    public final boolean j() {
        return this.f15961n != this.f15962o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        boolean z7;
        char c2;
        int i7;
        boolean z8;
        A a = this.f15963p;
        if (a == null) {
            return;
        }
        int i8 = 2;
        if (a.f284e != (a.f283d * 2) - 1) {
            AbstractC0015b.l("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f15963p.f283d * 2) - 1) + ", but current index is " + this.f15963p.f284e + " (sequence number " + this.f15963p.f282c + ");");
        }
        A a7 = this.f15963p;
        byte[] bArr = a7.f281b;
        int i9 = a7.f284e;
        A a8 = this.f15956i;
        a8.p(bArr, i9);
        boolean z9 = false;
        while (true) {
            if (a8.b() > 0) {
                int i10 = 3;
                int i11 = a8.i(3);
                int i12 = a8.i(5);
                if (i11 == 7) {
                    a8.t(i8);
                    i11 = a8.i(6);
                    if (i11 < 7) {
                        A6.b.n(i11, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i12 == 0) {
                    if (i11 != 0) {
                        AbstractC0015b.v("Cea708Decoder", "serviceNumber is non-zero (" + i11 + ") when blockSize is 0");
                    }
                } else if (i11 != this.f15958k) {
                    a8.u(i12);
                } else {
                    int iG = (i12 * 8) + a8.g();
                    while (a8.g() < iG) {
                        int i13 = a8.i(8);
                        if (i13 != 16) {
                            if (i13 <= 31) {
                                if (i13 != 0) {
                                    if (i13 == i10) {
                                        this.f15961n = l();
                                    } else if (i13 != 8) {
                                        switch (i13) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.f15960m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i13 < 17 || i13 > 23) {
                                                    if (i13 < 24 || i13 > 31) {
                                                        A6.b.n(i13, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        AbstractC0015b.v("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i13);
                                                        a8.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC0015b.v("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i13);
                                                    a8.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f15960m.f15935b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i7 = i8;
                            } else if (i13 <= 127) {
                                if (i13 == 127) {
                                    this.f15960m.a((char) 9835);
                                } else {
                                    this.f15960m.a((char) (i13 & 255));
                                }
                                i7 = i8;
                                z9 = true;
                            } else {
                                if (i13 <= 159) {
                                    C2039e[] c2039eArr = this.f15959l;
                                    switch (i13) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z8 = false;
                                            z7 = true;
                                            int i14 = i13 - 128;
                                            if (this.f15964q != i14) {
                                                this.f15964q = i14;
                                                this.f15960m = c2039eArr[i14];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z7 = true;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (a8.h()) {
                                                    C2039e c2039e = c2039eArr[8 - i15];
                                                    c2039e.a.clear();
                                                    c2039e.f15935b.clear();
                                                    c2039e.f15948o = -1;
                                                    c2039e.f15949p = -1;
                                                    c2039e.f15950q = -1;
                                                    c2039e.f15952s = -1;
                                                    c2039e.f15954u = 0;
                                                }
                                            }
                                            z8 = false;
                                            break;
                                        case 137:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (a8.h()) {
                                                    c2039eArr[8 - i16].f15937d = true;
                                                }
                                            }
                                            z7 = true;
                                            z8 = false;
                                            break;
                                        case 138:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (a8.h()) {
                                                    c2039eArr[8 - i17].f15937d = false;
                                                }
                                            }
                                            z8 = false;
                                            z7 = true;
                                            break;
                                        case 139:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (a8.h()) {
                                                    c2039eArr[8 - i18].f15937d = !r3.f15937d;
                                                }
                                            }
                                            z8 = false;
                                            z7 = true;
                                            break;
                                        case 140:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (a8.h()) {
                                                    c2039eArr[8 - i19].d();
                                                }
                                            }
                                            z8 = false;
                                            z7 = true;
                                            break;
                                        case 141:
                                            a8.t(8);
                                            z8 = false;
                                            z7 = true;
                                            break;
                                        case 142:
                                            z8 = false;
                                            z7 = true;
                                            break;
                                        case 143:
                                            m();
                                            z8 = false;
                                            z7 = true;
                                            break;
                                        case 144:
                                            if (!this.f15960m.f15936c) {
                                                a8.t(16);
                                                z8 = false;
                                                i10 = 3;
                                                z7 = true;
                                                break;
                                            } else {
                                                a8.i(4);
                                                a8.i(2);
                                                a8.i(2);
                                                boolean zH = a8.h();
                                                boolean zH2 = a8.h();
                                                i10 = 3;
                                                a8.i(3);
                                                a8.i(3);
                                                this.f15960m.e(zH, zH2);
                                                z8 = false;
                                                z7 = true;
                                            }
                                        case 145:
                                            if (this.f15960m.f15936c) {
                                                int iC = C2039e.c(a8.i(2), a8.i(2), a8.i(2), a8.i(2));
                                                int iC2 = C2039e.c(a8.i(2), a8.i(2), a8.i(2), a8.i(2));
                                                a8.t(2);
                                                C2039e.c(a8.i(2), a8.i(2), a8.i(2), 0);
                                                this.f15960m.f(iC, iC2);
                                            } else {
                                                a8.t(24);
                                            }
                                            z8 = false;
                                            i10 = 3;
                                            z7 = true;
                                            break;
                                        case 146:
                                            if (this.f15960m.f15936c) {
                                                a8.t(4);
                                                int i20 = a8.i(4);
                                                a8.t(2);
                                                a8.i(6);
                                                C2039e c2039e2 = this.f15960m;
                                                if (c2039e2.f15954u != i20) {
                                                    c2039e2.a('\n');
                                                }
                                                c2039e2.f15954u = i20;
                                            } else {
                                                a8.t(16);
                                            }
                                            z8 = false;
                                            i10 = 3;
                                            z7 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            A6.b.n(i13, "Invalid C1 command: ", "Cea708Decoder");
                                            z8 = false;
                                            z7 = true;
                                            break;
                                        case 151:
                                            if (this.f15960m.f15936c) {
                                                int iC3 = C2039e.c(a8.i(2), a8.i(2), a8.i(2), a8.i(2));
                                                a8.i(2);
                                                C2039e.c(a8.i(2), a8.i(2), a8.i(2), 0);
                                                a8.h();
                                                a8.h();
                                                a8.i(2);
                                                a8.i(2);
                                                int i21 = a8.i(2);
                                                a8.t(8);
                                                C2039e c2039e3 = this.f15960m;
                                                c2039e3.f15947n = iC3;
                                                c2039e3.f15944k = i21;
                                            } else {
                                                a8.t(32);
                                            }
                                            z8 = false;
                                            i10 = 3;
                                            z7 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i22 = i13 - 152;
                                            C2039e c2039e4 = c2039eArr[i22];
                                            a8.t(i8);
                                            boolean zH3 = a8.h();
                                            a8.t(i8);
                                            int i23 = a8.i(i10);
                                            boolean zH4 = a8.h();
                                            int i24 = a8.i(7);
                                            int i25 = a8.i(8);
                                            int i26 = a8.i(4);
                                            int i27 = a8.i(4);
                                            a8.t(i8);
                                            a8.t(6);
                                            a8.t(i8);
                                            int i28 = a8.i(3);
                                            int i29 = a8.i(3);
                                            c2039e4.f15936c = true;
                                            c2039e4.f15937d = zH3;
                                            c2039e4.f15938e = i23;
                                            c2039e4.f15939f = zH4;
                                            c2039e4.f15940g = i24;
                                            c2039e4.f15941h = i25;
                                            c2039e4.f15942i = i26;
                                            int i30 = i27 + 1;
                                            if (c2039e4.f15943j != i30) {
                                                c2039e4.f15943j = i30;
                                                while (true) {
                                                    ArrayList arrayList = c2039e4.a;
                                                    if (arrayList.size() >= c2039e4.f15943j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i28 != 0 && c2039e4.f15945l != i28) {
                                                c2039e4.f15945l = i28;
                                                int i31 = i28 - 1;
                                                int i32 = C2039e.f15926B[i31];
                                                boolean z10 = C2039e.f15925A[i31];
                                                int i33 = C2039e.f15933y[i31];
                                                int i34 = C2039e.f15934z[i31];
                                                int i35 = C2039e.f15932x[i31];
                                                c2039e4.f15947n = i32;
                                                c2039e4.f15944k = i35;
                                            }
                                            if (i29 != 0 && c2039e4.f15946m != i29) {
                                                c2039e4.f15946m = i29;
                                                int i36 = i29 - 1;
                                                int i37 = C2039e.f15928D[i36];
                                                int i38 = C2039e.f15927C[i36];
                                                c2039e4.e(false, false);
                                                c2039e4.f(C2039e.f15930v, C2039e.f15929E[i36]);
                                            }
                                            if (this.f15964q != i22) {
                                                this.f15964q = i22;
                                                this.f15960m = c2039eArr[i22];
                                            }
                                            z8 = false;
                                            i10 = 3;
                                            z7 = true;
                                            break;
                                    }
                                } else {
                                    z8 = false;
                                    z7 = true;
                                    if (i13 <= 255) {
                                        this.f15960m.a((char) (i13 & 255));
                                    } else {
                                        A6.b.n(i13, "Invalid base command: ", "Cea708Decoder");
                                        i7 = 2;
                                        c2 = 7;
                                    }
                                }
                                z9 = z7;
                                i7 = 2;
                                c2 = 7;
                            }
                            z7 = true;
                            c2 = 7;
                        } else {
                            z7 = true;
                            int i39 = a8.i(8);
                            if (i39 <= 31) {
                                c2 = 7;
                                if (i39 > 7) {
                                    if (i39 <= 15) {
                                        a8.t(8);
                                    } else if (i39 <= 23) {
                                        a8.t(16);
                                    } else if (i39 <= 31) {
                                        a8.t(24);
                                    }
                                }
                            } else {
                                c2 = 7;
                                if (i39 <= 127) {
                                    if (i39 == 32) {
                                        this.f15960m.a(' ');
                                    } else if (i39 == 33) {
                                        this.f15960m.a((char) 160);
                                    } else if (i39 == 37) {
                                        this.f15960m.a((char) 8230);
                                    } else if (i39 == 42) {
                                        this.f15960m.a((char) 352);
                                    } else if (i39 == 44) {
                                        this.f15960m.a((char) 338);
                                    } else if (i39 == 63) {
                                        this.f15960m.a((char) 376);
                                    } else if (i39 == 57) {
                                        this.f15960m.a((char) 8482);
                                    } else if (i39 == 58) {
                                        this.f15960m.a((char) 353);
                                    } else if (i39 == 60) {
                                        this.f15960m.a((char) 339);
                                    } else if (i39 != 61) {
                                        switch (i39) {
                                            case 48:
                                                this.f15960m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f15960m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f15960m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f15960m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f15960m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f15960m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i39) {
                                                    case 118:
                                                        this.f15960m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f15960m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f15960m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f15960m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f15960m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f15960m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f15960m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f15960m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f15960m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f15960m.a((char) 9484);
                                                        break;
                                                    default:
                                                        A6.b.n(i39, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f15960m.a((char) 8480);
                                    }
                                    z9 = true;
                                } else if (i39 > 159) {
                                    i7 = 2;
                                    if (i39 <= 255) {
                                        if (i39 == 160) {
                                            this.f15960m.a((char) 13252);
                                        } else {
                                            A6.b.n(i39, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f15960m.a('_');
                                        }
                                        z9 = true;
                                    } else {
                                        A6.b.n(i39, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i39 <= 135) {
                                    a8.t(32);
                                } else if (i39 <= 143) {
                                    a8.t(40);
                                } else if (i39 <= 159) {
                                    i7 = 2;
                                    a8.t(2);
                                    a8.t(a8.i(6) * 8);
                                }
                            }
                            i7 = 2;
                        }
                        i8 = i7;
                    }
                }
            }
        }
        if (z9) {
            this.f15961n = l();
        }
        this.f15963p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2040f.l():java.util.List");
    }

    public final void m() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f15959l[i7].d();
        }
    }
}
