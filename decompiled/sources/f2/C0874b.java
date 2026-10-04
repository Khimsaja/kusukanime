package f2;

import B1.A;
import B1.B;
import e2.C0818a;
import g2.C0941a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import y1.C;
import z1.c;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0874b extends c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11431r;

    @Override // z1.c
    public final C l(C0818a c0818a, ByteBuffer byteBuffer) {
        boolean z7 = true;
        switch (this.f11431r) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                A a = new A(byteBuffer.array(), byteBuffer.limit());
                int i7 = 12;
                a.t(12);
                int iF = (a.f() + a.i(12)) - 4;
                a.t(44);
                a.u(a.i(12));
                a.t(16);
                ArrayList arrayList = new ArrayList();
                while (a.f() < iF) {
                    a.t(48);
                    int i8 = a.i(8);
                    a.t(4);
                    int iF2 = a.f() + a.i(i7);
                    String str = null;
                    String str2 = null;
                    while (a.f() < iF2) {
                        int i9 = a.i(8);
                        int i10 = a.i(8);
                        boolean z8 = z7;
                        int iF3 = a.f() + i10;
                        if (i9 == 2) {
                            int i11 = a.i(16);
                            a.t(8);
                            if (i11 == 3) {
                                while (a.f() < iF3) {
                                    int i12 = a.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i12];
                                    a.l(bArr, i12);
                                    String str3 = new String(bArr, charset);
                                    int i13 = a.i(8);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        a.u(a.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i9 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i10];
                            a.l(bArr2, i10);
                            str2 = new String(bArr2, charset2);
                        }
                        a.q(iF3 * 8);
                        z7 = z8;
                    }
                    boolean z9 = z7;
                    a.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C0873a(i8, str.concat(str2)));
                    }
                    z7 = z9;
                    i7 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C(arrayList);
            default:
                B b4 = new B(byteBuffer.array(), byteBuffer.limit());
                String strO = b4.o();
                strO.getClass();
                String strO2 = b4.o();
                strO2.getClass();
                return new C(new C0941a(strO, strO2, b4.n(), b4.n(), Arrays.copyOfRange(b4.a, b4.f288b, b4.f289c)));
        }
    }
}
