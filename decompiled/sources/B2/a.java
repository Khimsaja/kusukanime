package B2;

import B1.AbstractC0015b;
import B1.B;
import B1.InterfaceC0021h;
import B1.K;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import s2.C1973a;
import s2.C1981i;
import s2.InterfaceC1982j;
import y1.C;

/* loaded from: classes.dex */
public final class a implements InterfaceC1982j {

    /* renamed from: k, reason: collision with root package name */
    public final B f372k;

    public a(int i7) {
        switch (i7) {
            case 1:
                this.f372k = new B(10);
                break;
            default:
                this.f372k = new B();
                break;
        }
    }

    public C a(V1.k kVar, I1.e eVar) {
        B b4 = this.f372k;
        C cO = null;
        int i7 = 0;
        while (true) {
            try {
                kVar.h(b4.a, 0, 10, false);
                b4.F(0);
                if (b4.w() != 4801587) {
                    break;
                }
                b4.G(3);
                int iS = b4.s();
                int i8 = iS + 10;
                if (cO == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(b4.a, 0, bArr, 0, 10);
                    kVar.h(bArr, 10, iS, false);
                    cO = new j2.h(eVar).O(bArr, i8);
                } else {
                    kVar.b(iS, false);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        kVar.f9394p = 0;
        kVar.b(i7, false);
        return cO;
    }

    @Override // s2.InterfaceC1982j
    public void p(byte[] bArr, int i7, int i8, C1981i c1981i, InterfaceC0021h interfaceC0021h) {
        A1.b bVarA;
        B b4 = this.f372k;
        b4.D(bArr, i7 + i8);
        b4.F(i7);
        ArrayList arrayList = new ArrayList();
        while (b4.a() > 0) {
            AbstractC0015b.b("Incomplete Mp4Webvtt Top Level box header found.", b4.a() >= 8);
            int iG = b4.g();
            if (b4.g() == 1987343459) {
                int i9 = iG - 8;
                CharSequence charSequenceF = null;
                A1.a aVarA = null;
                while (i9 > 0) {
                    AbstractC0015b.b("Incomplete vtt cue box header found.", i9 >= 8);
                    int iG2 = b4.g();
                    int iG3 = b4.g();
                    int i10 = iG2 - 8;
                    byte[] bArr2 = b4.a;
                    int i11 = b4.f288b;
                    int i12 = K.a;
                    String str = new String(bArr2, i11, i10, StandardCharsets.UTF_8);
                    b4.G(i10);
                    i9 = (i9 - 8) - i10;
                    if (iG3 == 1937011815) {
                        i iVar = new i();
                        j.e(str, iVar);
                        aVarA = iVar.a();
                    } else if (iG3 == 1885436268) {
                        charSequenceF = j.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.a = charSequenceF;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = j.a;
                    i iVar2 = new i();
                    iVar2.f403c = charSequenceF;
                    bVarA = iVar2.a().a();
                }
                arrayList.add(bVarA);
            } else {
                b4.G(iG - 8);
            }
        }
        interfaceC0021h.c(new C1973a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
