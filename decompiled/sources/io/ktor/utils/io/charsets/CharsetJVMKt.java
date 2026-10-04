package io.ktor.utils.io.charsets;

import S5.n;
import S5.p;
import io.ktor.http.ContentDisposition;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a!\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u0013\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a7\u0010\u0018\u001a\u00020\u000f*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u0014\u001a1\u0010!\u001a\u00020\u000f*\u00060\u001bj\u0002`\u001c2\u0006\u0010\u000e\u001a\u00020\u001d2\n\u0010\u0017\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"\"\u0019\u0010\u0003\u001a\u00020\u0002*\u00060\u0004j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u001d\u0010'\u001a\u00060\u0004j\u0002`\u0005*\u00060\u000bj\u0002`\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u001d\u0010'\u001a\u00060\u0004j\u0002`\u0005*\u00060\u001bj\u0002`\u001c8F¢\u0006\u0006\u001a\u0004\b%\u0010(*\n\u0010)\"\u00020\u00042\u00020\u0004*\n\u0010*\"\u00020\u000b2\u00020\u000b*\n\u0010+\"\u00020\u001b2\u00020\u001b*\n\u0010,\"\u00020\u00002\u00020\u0000¨\u0006-"}, d2 = {"Lz5/a;", "Lio/ktor/utils/io/charsets/Charsets;", "", ContentDisposition.Parameters.Name, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "forName", "(Lz5/a;Ljava/lang/String;)Ljava/nio/charset/Charset;", "", "isSupported", "(Lz5/a;Ljava/lang/String;)Z", "Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "", "encodeToByteArray", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)[B", "encodeToByteArraySlow", "LS5/l;", "dst", "encodeImpl", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;IILS5/l;)I", "encodeToByteArrayImpl", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "LS5/n;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "max", "decode", "(Ljava/nio/charset/CharsetDecoder;LS5/n;Ljava/lang/Appendable;I)I", "getName", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "getCharset", "(Ljava/nio/charset/CharsetEncoder;)Ljava/nio/charset/Charset;", HttpAuthHeader.Parameters.Charset, "(Ljava/nio/charset/CharsetDecoder;)Ljava/nio/charset/Charset;", "Charset", "CharsetEncoder", "CharsetDecoder", "Charsets", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CharsetJVMKt {
    public static /* synthetic */ void Charset$annotations() {
    }

    public static final int decode(CharsetDecoder charsetDecoder, n nVar, Appendable appendable, int i7) {
        l.f("<this>", charsetDecoder);
        l.f("input", nVar);
        l.f("dst", appendable);
        if (l.a(getCharset(charsetDecoder), C2496a.f19036b)) {
            String strK = p.k(nVar);
            appendable.append(strK);
            return strK.length();
        }
        long remaining = ByteReadPacketKt.getRemaining(nVar);
        byte[] bArrJ = p.j(nVar, -1);
        Charset charset = getCharset(charsetDecoder);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        appendable.append(new String(bArrJ, charset));
        return (int) remaining;
    }

    public static final int encodeImpl(CharsetEncoder charsetEncoder, CharSequence charSequence, int i7, int i8, S5.l lVar) {
        l.f("<this>", charsetEncoder);
        l.f("input", charSequence);
        l.f("dst", lVar);
        byte[] bArrEncodeToByteArray = encodeToByteArray(charsetEncoder, charSequence, i7, i8);
        lVar.write(bArrEncodeToByteArray, 0, bArrEncodeToByteArray.length);
        return bArrEncodeToByteArray.length;
    }

    public static final byte[] encodeToByteArray(CharsetEncoder charsetEncoder, CharSequence charSequence, int i7, int i8) {
        l.f("<this>", charsetEncoder);
        l.f("input", charSequence);
        if (!(charSequence instanceof String)) {
            return encodeToByteArraySlow(charsetEncoder, charSequence, i7, i8);
        }
        if (i7 == 0) {
            String str = (String) charSequence;
            if (i8 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                l.e("getBytes(...)", bytes);
                return bytes;
            }
        }
        String strSubstring = ((String) charSequence).substring(i7, i8);
        l.e("substring(...)", strSubstring);
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        l.e("getBytes(...)", bytes2);
        return bytes2;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = charSequence.length();
        }
        return encodeToByteArray(charsetEncoder, charSequence, i7, i8);
    }

    public static final byte[] encodeToByteArrayImpl(CharsetEncoder charsetEncoder, CharSequence charSequence, int i7, int i8) {
        l.f("<this>", charsetEncoder);
        l.f("input", charSequence);
        throw new IllegalStateException("Not needed on jvm");
    }

    public static /* synthetic */ byte[] encodeToByteArrayImpl$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = charSequence.length();
        }
        return encodeToByteArrayImpl(charsetEncoder, charSequence, i7, i8);
    }

    private static final byte[] encodeToByteArraySlow(CharsetEncoder charsetEncoder, CharSequence charSequence, int i7, int i8) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i7, i8));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final Charset forName(C2496a c2496a, String str) {
        l.f("<this>", c2496a);
        l.f(ContentDisposition.Parameters.Name, str);
        Charset charsetForName = Charset.forName(str);
        l.e("forName(...)", charsetForName);
        return charsetForName;
    }

    public static final Charset getCharset(CharsetEncoder charsetEncoder) {
        l.f("<this>", charsetEncoder);
        Charset charset = charsetEncoder.charset();
        l.e("charset(...)", charset);
        return charset;
    }

    public static final String getName(Charset charset) {
        l.f("<this>", charset);
        String strName = charset.name();
        l.e("name(...)", strName);
        return strName;
    }

    public static final boolean isSupported(C2496a c2496a, String str) {
        l.f("<this>", c2496a);
        l.f(ContentDisposition.Parameters.Name, str);
        return Charset.isSupported(str);
    }

    public static final Charset getCharset(CharsetDecoder charsetDecoder) {
        l.f("<this>", charsetDecoder);
        Charset charset = charsetDecoder.charset();
        l.c(charset);
        return charset;
    }
}
