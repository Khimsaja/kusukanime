package w6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import z5.AbstractC2517v;

/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2217b {
    public static final C2223h a = new C2223h();

    public static final boolean a(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.l.f("a", bArr);
        kotlin.jvm.internal.l.f("b", bArr2);
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i7] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final A b(G g4) {
        kotlin.jvm.internal.l.f("<this>", g4);
        return new A(g4);
    }

    public static final C c(H h7) {
        kotlin.jvm.internal.l.f("<this>", h7);
        return new C(h7);
    }

    public static void d(long j7, C2224i c2224i, int i7, ArrayList arrayList, int i8, int i9, ArrayList arrayList2) {
        int i10;
        int i11;
        ArrayList arrayList3;
        long j8;
        int i12;
        int i13 = i7;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i8 >= i9) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i14 = i8; i14 < i9; i14++) {
            if (((l) arrayList4.get(i14)).d() < i13) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        l lVar = (l) arrayList.get(i8);
        l lVar2 = (l) arrayList4.get(i9 - 1);
        if (i13 == lVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i8)).intValue();
            int i15 = i8 + 1;
            l lVar3 = (l) arrayList4.get(i15);
            i10 = i15;
            i11 = iIntValue;
            lVar = lVar3;
        } else {
            i10 = i8;
            i11 = -1;
        }
        if (lVar.i(i13) == lVar2.i(i13)) {
            int iMin = Math.min(lVar.d(), lVar2.d());
            int i16 = 0;
            for (int i17 = i13; i17 < iMin && lVar.i(i17) == lVar2.i(i17); i17++) {
                i16++;
            }
            long j9 = 4;
            long j10 = (c2224i.f17156l / j9) + j7 + 2 + i16 + 1;
            c2224i.r(-i16);
            c2224i.r(i11);
            int i18 = i13 + i16;
            while (i13 < i18) {
                c2224i.r(lVar.i(i13) & 255);
                i13++;
            }
            if (i10 + 1 == i9) {
                if (i18 != ((l) arrayList4.get(i10)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c2224i.r(((Number) arrayList5.get(i10)).intValue());
                return;
            } else {
                C2224i c2224i2 = new C2224i();
                c2224i.r(((int) ((c2224i2.f17156l / j9) + j10)) * (-1));
                d(j10, c2224i2, i18, arrayList4, i10, i9, arrayList5);
                c2224i.l(c2224i2);
                return;
            }
        }
        int i19 = 1;
        for (int i20 = i10 + 1; i20 < i9; i20++) {
            if (((l) arrayList4.get(i20 - 1)).i(i13) != ((l) arrayList4.get(i20)).i(i13)) {
                i19++;
            }
        }
        long j11 = 4;
        long j12 = (c2224i.f17156l / j11) + j7 + 2 + (i19 * 2);
        c2224i.r(i19);
        c2224i.r(i11);
        for (int i21 = i10; i21 < i9; i21++) {
            int i22 = ((l) arrayList4.get(i21)).i(i13);
            if (i21 == i10 || i22 != ((l) arrayList4.get(i21 - 1)).i(i13)) {
                c2224i.r(i22 & 255);
            }
        }
        C2224i c2224i3 = new C2224i();
        int i23 = i10;
        while (i23 < i9) {
            byte bI = ((l) arrayList4.get(i23)).i(i13);
            int i24 = i23 + 1;
            int i25 = i24;
            while (true) {
                if (i25 >= i9) {
                    i25 = i9;
                    break;
                } else if (bI != ((l) arrayList4.get(i25)).i(i13)) {
                    break;
                } else {
                    i25++;
                }
            }
            if (i24 == i25 && i13 + 1 == ((l) arrayList4.get(i23)).d()) {
                c2224i.r(((Number) arrayList5.get(i23)).intValue());
                arrayList3 = arrayList5;
                j8 = j12;
                i12 = i25;
            } else {
                c2224i.r(((int) ((c2224i3.f17156l / j11) + j12)) * (-1));
                arrayList3 = arrayList5;
                j8 = j12;
                i12 = i25;
                d(j8, c2224i3, i13 + 1, arrayList, i23, i12, arrayList3);
                arrayList4 = arrayList;
            }
            j12 = j8;
            i23 = i12;
            arrayList5 = arrayList3;
        }
        c2224i.l(c2224i3);
    }

    public static final void e(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            StringBuilder sbK = A6.b.k("size=", j7, " offset=");
            sbK.append(j8);
            sbK.append(" byteCount=");
            sbK.append(j9);
            throw new ArrayIndexOutOfBoundsException(sbK.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static w6.x f(w6.l... r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.AbstractC2217b.f(w6.l[]):w6.x");
    }

    public static final C2219d g(Socket socket) throws IOException {
        x6.f fVar = new x6.f(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.l.e("getOutputStream(...)", outputStream);
        return new C2219d(0, fVar, new C2219d(1, outputStream, fVar));
    }

    public static final C2220e h(InputStream inputStream) {
        kotlin.jvm.internal.l.f("<this>", inputStream);
        return new C2220e(inputStream, new J());
    }

    public static final C2220e i(Socket socket) throws IOException {
        x6.f fVar = new x6.f(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.l.e("getInputStream(...)", inputStream);
        return new C2220e(fVar, new C2220e(inputStream, fVar));
    }

    public static final String j(int i7) {
        int i8 = 0;
        if (i7 == 0) {
            return "0";
        }
        char[] cArr = x6.b.a;
        char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
        while (i8 < 8 && cArr2[i8] == '0') {
            i8++;
        }
        return AbstractC2517v.H(cArr2, i8, 8);
    }
}
