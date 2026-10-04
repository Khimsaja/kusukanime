package io.ktor.util;

import S5.n;
import S5.p;
import io.ktor.utils.io.core.InputKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0001\u0010\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0005¢\u0006\u0004\b\u0001\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\b\u001a\u00060\u0005j\u0002`\n*\u00020\u0005¢\u0006\u0004\b\b\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\fH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "encodeBase64", "(Ljava/lang/String;)Ljava/lang/String;", "", "([B)Ljava/lang/String;", "LS5/n;", "(LS5/n;)Ljava/lang/String;", "decodeBase64String", "decodeBase64Bytes", "(Ljava/lang/String;)[B", "Lio/ktor/utils/io/core/Input;", "(LS5/n;)LS5/n;", "", "", "toBase64", "(I)C", "", "fromBase64", "(B)B", "BASE64_ALPHABET", "Ljava/lang/String;", "BASE64_MASK", "B", "BASE64_MASK_INT", "I", "BASE64_PAD", "C", "", "BASE64_INVERSE_ALPHABET", "[I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Base64Kt {
    private static final String BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static final int[] BASE64_INVERSE_ALPHABET;
    private static final byte BASE64_MASK = 63;
    private static final int BASE64_MASK_INT = 63;
    private static final char BASE64_PAD = '=';

    static {
        int[] iArr = new int[256];
        for (int i7 = 0; i7 < 256; i7++) {
            iArr[i7] = AbstractC2510o.d0(BASE64_ALPHABET, (char) i7, 0, 6);
        }
        iArr[45] = iArr[43];
        iArr[95] = iArr[47];
        BASE64_INVERSE_ALPHABET = iArr;
    }

    public static final byte[] decodeBase64Bytes(String str) {
        String strSubstring;
        l.f("<this>", str);
        S5.a aVar = new S5.a();
        int iB0 = AbstractC2510o.b0(str);
        while (true) {
            if (-1 >= iB0) {
                strSubstring = "";
                break;
            }
            if (str.charAt(iB0) != '=') {
                strSubstring = str.substring(0, iB0 + 1);
                l.e("substring(...)", strSubstring);
                break;
            }
            iB0--;
        }
        StringsKt.writeText$default(aVar, strSubstring, 0, 0, (Charset) null, 14, (Object) null);
        return p.h(decodeBase64Bytes(aVar));
    }

    public static final String decodeBase64String(String str) {
        l.f("<this>", str);
        byte[] bArrDecodeBase64Bytes = decodeBase64Bytes(str);
        return AbstractC2517v.J(bArrDecodeBase64Bytes, 0, bArrDecodeBase64Bytes.length);
    }

    public static final String encodeBase64(byte[] bArr) {
        int i7;
        int i8;
        l.f("<this>", bArr);
        int i9 = 3;
        char[] cArr = new char[((bArr.length * 8) / 6) + 3];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 3;
            if (i12 > bArr.length) {
                break;
            }
            int i13 = (bArr[i10 + 2] & 255) | ((bArr[i10] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
            int i14 = 3;
            while (-1 < i14) {
                cArr[i11] = BASE64_ALPHABET.charAt((i13 >> (i14 * 6)) & BASE64_MASK_INT);
                i14--;
                i11++;
            }
            i10 = i12;
        }
        int length = bArr.length - i10;
        if (length == 0) {
            return AbstractC2517v.H(cArr, 0, i11);
        }
        if (length == 1) {
            i7 = (bArr[i10] & 255) << 16;
        } else {
            i7 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
        }
        int i15 = ((3 - length) * 8) / 6;
        if (i15 <= 3) {
            while (true) {
                i8 = i11 + 1;
                cArr[i11] = BASE64_ALPHABET.charAt((i7 >> (i9 * 6)) & BASE64_MASK_INT);
                if (i9 == i15) {
                    break;
                }
                i9--;
                i11 = i8;
            }
            i11 = i8;
        }
        int i16 = 0;
        while (i16 < i15) {
            cArr[i11] = BASE64_PAD;
            i16++;
            i11++;
        }
        return AbstractC2517v.H(cArr, 0, i11);
    }

    public static final byte fromBase64(byte b4) {
        return (byte) (((byte) BASE64_INVERSE_ALPHABET[b4 & 255]) & BASE64_MASK);
    }

    public static final char toBase64(int i7) {
        return BASE64_ALPHABET.charAt(i7);
    }

    public static final n decodeBase64Bytes(n nVar) {
        int i7;
        l.f("<this>", nVar);
        S5.a aVar = new S5.a();
        byte[] bArr = new byte[4];
        while (!nVar.z()) {
            int i8 = 0;
            n nVar2 = nVar;
            int available$default = InputKt.readAvailable$default(nVar2, bArr, 0, 0, 6, null);
            int i9 = 0;
            int i10 = 0;
            while (i8 < 4) {
                i9 |= ((byte) (((byte) BASE64_INVERSE_ALPHABET[bArr[i8] & 255]) & BASE64_MASK)) << ((3 - i10) * 6);
                i8++;
                i10++;
            }
            int i11 = 4 - available$default;
            if (i11 <= 2) {
                while (true) {
                    aVar.D((byte) ((i9 >> (i7 * 8)) & 255));
                    i7 = i7 != i11 ? i7 - 1 : 2;
                }
            }
            nVar = nVar2;
        }
        return aVar;
    }

    public static final String encodeBase64(String str) {
        l.f("<this>", str);
        S5.a aVar = new S5.a();
        StringsKt.writeText$default(aVar, str, 0, 0, (Charset) null, 14, (Object) null);
        return encodeBase64(aVar);
    }

    public static final String encodeBase64(n nVar) {
        l.f("<this>", nVar);
        return encodeBase64(p.j(nVar, -1));
    }
}
