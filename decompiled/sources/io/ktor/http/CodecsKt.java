package io.ktor.http;

import O3.C;
import P3.J;
import P3.m;
import P3.q;
import P3.r;
import S5.n;
import e4.k;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.util.date.GMTDateParser;
import io.ktor.utils.io.charsets.EncodingKt;
import io.ktor.utils.io.core.BufferKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k4.C1394c;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;
import z5.C2496a;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\n\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a=\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001e\u0010\u001f\u001a7\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b \u0010\u001d\u001a?\u0010#\u001a\u00020\u0000*\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010\u0015\u001a\u00020\u0000*\u00020%H\u0002¢\u0006\u0004\b\u0015\u0010&\u001a\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,\u001a'\u00101\u001a\u00020/*\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020/0.H\u0002¢\u0006\u0004\b1\u00102\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020%078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104\" \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u0010=\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020%078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109¨\u0006?"}, d2 = {"", "", "encodeFull", "spaceToPlus", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "encodeURLQueryComponent", "(Ljava/lang/String;ZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encodeURLPathPart", "(Ljava/lang/String;)Ljava/lang/String;", "encodeSlash", "encodeEncoded", "encodeURLPath", "(Ljava/lang/String;ZZ)Ljava/lang/String;", "encodeOAuth", "encodeURLParameter", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "", "allowedSet", "percentEncode", "(Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;", "encodeURLParameterValue", "", "start", "end", "plusIsSpace", "decodeURLQueryComponent", "(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;", "decodeURLPart", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Ljava/lang/String;", "decodeScan", "", "prefixEnd", "decodeImpl", "(Ljava/lang/CharSequence;IIIZLjava/nio/charset/Charset;)Ljava/lang/String;", "", "(B)Ljava/lang/String;", "c2", "charToHexDigit", "(C)I", "digit", "hexDigitToChar", "(I)C", "LS5/n;", "Lkotlin/Function1;", "LO3/C;", "block", "forEach", "(LS5/n;Le4/k;)V", "URL_ALPHABET", "Ljava/util/Set;", "URL_ALPHABET_CHARS", "HEX_ALPHABET", "", "URL_PROTOCOL_PART", "Ljava/util/List;", "VALID_PATH_PART", "ATTRIBUTE_CHARACTERS", "getATTRIBUTE_CHARACTERS", "()Ljava/util/Set;", "SPECIAL_SYMBOLS", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CodecsKt {
    private static final Set<Character> ATTRIBUTE_CHARACTERS;
    private static final Set<Character> HEX_ALPHABET;
    private static final List<Byte> SPECIAL_SYMBOLS;
    private static final Set<Byte> URL_ALPHABET;
    private static final Set<Character> URL_ALPHABET_CHARS;
    private static final List<Byte> URL_PROTOCOL_PART;
    private static final Set<Character> VALID_PATH_PART;

    static {
        ArrayList arrayListG0 = q.G0(q.E0(new C1394c('a', GMTDateParser.ZONE), new C1394c('A', 'Z')), new C1394c('0', '9'));
        ArrayList arrayList = new ArrayList(r.p(arrayListG0, 10));
        Iterator it = arrayListG0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        URL_ALPHABET = q.X0(arrayList);
        URL_ALPHABET_CHARS = q.X0(q.G0(q.E0(new C1394c('a', GMTDateParser.ZONE), new C1394c('A', 'Z')), new C1394c('0', '9')));
        HEX_ALPHABET = q.X0(q.G0(q.E0(new C1394c('a', 'f'), new C1394c('A', 'F')), new C1394c('0', '9')));
        Set setV0 = m.v0(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', Character.valueOf(GMTDateParser.ANY), ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(r.p(setV0, 10));
        Iterator it2 = setV0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        URL_PROTOCOL_PART = arrayList2;
        VALID_PATH_PART = m.v0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', Character.valueOf(GMTDateParser.ANY), '+', ',', ';', '=', '-', '.', '_', '~'});
        ATTRIBUTE_CHARACTERS = J.T(URL_ALPHABET_CHARS, m.v0(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listI = r.I('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(r.p(listI, 10));
        Iterator it3 = listI.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        SPECIAL_SYMBOLS = arrayList3;
    }

    private static final int charToHexDigit(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' > c2 || c2 >= 'g') {
            return -1;
        }
        return c2 - 'W';
    }

    private static final String decodeImpl(CharSequence charSequence, int i7, int i8, int i9, boolean z7, Charset charset) throws URLDecodeException {
        int i10 = i8 - i7;
        if (i10 > 255) {
            i10 /= 3;
        }
        StringBuilder sb = new StringBuilder(i10);
        if (i9 > i7) {
            sb.append(charSequence, i7, i9);
        }
        byte[] bArr = null;
        while (i9 < i8) {
            char cCharAt = charSequence.charAt(i9);
            if (z7 && cCharAt == '+') {
                sb.append(' ');
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i8 - i9) / 3];
                }
                int i11 = 0;
                while (i9 < i8 && charSequence.charAt(i9) == '%') {
                    int i12 = i9 + 2;
                    if (i12 >= i8) {
                        throw new URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i9, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i9);
                    }
                    int i13 = i9 + 1;
                    int iCharToHexDigit = charToHexDigit(charSequence.charAt(i13));
                    int iCharToHexDigit2 = charToHexDigit(charSequence.charAt(i12));
                    if (iCharToHexDigit == -1 || iCharToHexDigit2 == -1) {
                        throw new URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i13) + charSequence.charAt(i12) + ", in " + ((Object) charSequence) + ", at " + i9);
                    }
                    bArr[i11] = (byte) ((iCharToHexDigit * 16) + iCharToHexDigit2);
                    i9 += 3;
                    i11++;
                }
                sb.append(AbstractC2517v.J(bArr, 0, i11));
            } else {
                sb.append(cCharAt);
            }
            i9++;
        }
        String string = sb.toString();
        l.e("toString(...)", string);
        return string;
    }

    private static final String decodeScan(String str, int i7, int i8, boolean z7, Charset charset) {
        for (int i9 = i7; i9 < i8; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '%' || (z7 && cCharAt == '+')) {
                return decodeImpl(str, i7, i8, i9, z7, charset);
            }
        }
        if (i7 == 0 && i8 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i7, i8);
        l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static final String decodeURLPart(String str, int i7, int i8, Charset charset) {
        l.f("<this>", str);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        return decodeScan(str, i7, i8, false, charset);
    }

    public static /* synthetic */ String decodeURLPart$default(String str, int i7, int i8, Charset charset, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        if ((i9 & 4) != 0) {
            charset = C2496a.f19036b;
        }
        return decodeURLPart(str, i7, i8, charset);
    }

    public static final String decodeURLQueryComponent(String str, int i7, int i8, boolean z7, Charset charset) {
        l.f("<this>", str);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        return decodeScan(str, i7, i8, z7, charset);
    }

    public static /* synthetic */ String decodeURLQueryComponent$default(String str, int i7, int i8, boolean z7, Charset charset, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        if ((i9 & 8) != 0) {
            charset = C2496a.f19036b;
        }
        return decodeURLQueryComponent(str, i7, i8, z7, charset);
    }

    public static final String encodeOAuth(String str) {
        l.f("<this>", str);
        return encodeURLParameter$default(str, false, 1, null);
    }

    public static final String encodeURLParameter(String str, final boolean z7) {
        l.f("<this>", str);
        final StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = C2496a.f19036b.newEncoder();
        l.e("newEncoder(...)", charsetEncoderNewEncoder);
        forEach(EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new k() { // from class: io.ktor.http.a
            @Override // e4.k
            public final Object invoke(Object obj) {
                return CodecsKt.encodeURLParameter$lambda$8$lambda$7(sb, z7, ((Byte) obj).byteValue());
            }
        });
        return sb.toString();
    }

    public static /* synthetic */ String encodeURLParameter$default(String str, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return encodeURLParameter(str, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C encodeURLParameter$lambda$8$lambda$7(StringBuilder sb, boolean z7, byte b4) {
        if (URL_ALPHABET.contains(Byte.valueOf(b4)) || SPECIAL_SYMBOLS.contains(Byte.valueOf(b4))) {
            sb.append((char) b4);
        } else if (z7 && b4 == 32) {
            sb.append('+');
        } else {
            sb.append(percentEncode(b4));
        }
        return C.a;
    }

    public static final String encodeURLParameterValue(String str) {
        l.f("<this>", str);
        return encodeURLParameter(str, true);
    }

    public static final String encodeURLPath(String str, boolean z7, boolean z8) {
        int i7;
        l.f("<this>", str);
        StringBuilder sb = new StringBuilder();
        Charset charset = C2496a.f19036b;
        int i8 = 0;
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            if ((!z7 && cCharAt == '/') || URL_ALPHABET_CHARS.contains(Character.valueOf(cCharAt)) || VALID_PATH_PART.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
                i8++;
            } else {
                if (!z8 && cCharAt == '%' && (i7 = i8 + 2) < str.length()) {
                    Set<Character> set = HEX_ALPHABET;
                    int i9 = i8 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i9))) && set.contains(Character.valueOf(str.charAt(i7)))) {
                        sb.append(cCharAt);
                        sb.append(str.charAt(i9));
                        sb.append(str.charAt(i7));
                        i8 += 3;
                    }
                }
                int i10 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                l.e("newEncoder(...)", charsetEncoderNewEncoder);
                int i11 = i10 + i8;
                forEach(EncodingKt.encode(charsetEncoderNewEncoder, str, i8, i11), new A3.d(17, sb));
                i8 = i11;
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ String encodeURLPath$default(String str, boolean z7, boolean z8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            z8 = true;
        }
        return encodeURLPath(str, z7, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C encodeURLPath$lambda$6$lambda$5(StringBuilder sb, byte b4) {
        sb.append(percentEncode(b4));
        return C.a;
    }

    public static final String encodeURLPathPart(String str) {
        l.f("<this>", str);
        return encodeURLPath$default(str, true, false, 2, null);
    }

    public static final String encodeURLQueryComponent(String str, final boolean z7, final boolean z8, Charset charset) {
        l.f("<this>", str);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        final StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        l.e("newEncoder(...)", charsetEncoderNewEncoder);
        forEach(EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new k() { // from class: io.ktor.http.b
            @Override // e4.k
            public final Object invoke(Object obj) {
                byte bByteValue = ((Byte) obj).byteValue();
                return CodecsKt.encodeURLQueryComponent$lambda$4$lambda$3(z8, sb, z7, bByteValue);
            }
        });
        return sb.toString();
    }

    public static /* synthetic */ String encodeURLQueryComponent$default(String str, boolean z7, boolean z8, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        if ((i7 & 4) != 0) {
            charset = C2496a.f19036b;
        }
        return encodeURLQueryComponent(str, z7, z8, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C encodeURLQueryComponent$lambda$4$lambda$3(boolean z7, StringBuilder sb, boolean z8, byte b4) {
        if (b4 == 32) {
            if (z7) {
                sb.append('+');
            } else {
                sb.append("%20");
            }
        } else if (URL_ALPHABET.contains(Byte.valueOf(b4)) || (!z8 && URL_PROTOCOL_PART.contains(Byte.valueOf(b4)))) {
            sb.append((char) b4);
        } else {
            sb.append(percentEncode(b4));
        }
        return C.a;
    }

    private static final void forEach(n nVar, k kVar) {
        ByteReadPacketKt.takeWhile(nVar, new io.github.jan.supabase.auth.a(5, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean forEach$lambda$11(k kVar, S5.a aVar) {
        l.f("buffer", aVar);
        while (BufferKt.canRead(aVar)) {
            kVar.invoke(Byte.valueOf(aVar.readByte()));
        }
        return true;
    }

    public static final Set<Character> getATTRIBUTE_CHARACTERS() {
        return ATTRIBUTE_CHARACTERS;
    }

    private static final char hexDigitToChar(int i7) {
        return (char) ((i7 < 0 || i7 >= 10) ? ((char) (i7 + 65)) - '\n' : i7 + 48);
    }

    private static final String percentEncode(byte b4) {
        return new String(new char[]{'%', hexDigitToChar((b4 & 255) >> 4), hexDigitToChar(b4 & 15)});
    }

    public static final String percentEncode(String str, Set<Character> set) throws CharacterCodingException {
        l.f("<this>", str);
        l.f("allowedSet", set);
        int i7 = 0;
        for (int i8 = 0; i8 < str.length(); i8++) {
            if (!set.contains(Character.valueOf(str.charAt(i8)))) {
                i7++;
            }
        }
        if (i7 == 0) {
            return str;
        }
        byte[] byteArray = StringsKt.toByteArray(str, C2496a.f19036b);
        int length = str.length() - i7;
        char[] cArr = new char[((byteArray.length - length) * 3) + length];
        int i9 = 0;
        for (byte b4 : byteArray) {
            char c2 = (char) b4;
            if (set.contains(Character.valueOf(c2))) {
                cArr[i9] = c2;
                i9++;
            } else {
                cArr[i9] = '%';
                int i10 = i9 + 2;
                cArr[i9 + 1] = hexDigitToChar((b4 & 255) >> 4);
                i9 += 3;
                cArr[i10] = hexDigitToChar(b4 & 15);
            }
        }
        return new String(cArr);
    }
}
