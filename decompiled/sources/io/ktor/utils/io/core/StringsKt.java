package io.ktor.utils.io.core;

import D6.r;
import O3.InterfaceC0554c;
import S5.a;
import S5.n;
import S5.p;
import io.ktor.http.ContentType;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.charsets.EncodingKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q0.c;
import v.c0;
import z5.AbstractC2517v;
import z5.C2496a;

@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u000e\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u0011\u001a)\u0010\u0013\u001a\u00020\u0000*\u00020\r2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0016\u001a\u00020\u0000*\u00020\r2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b \u0010!\u001a;\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\"2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b \u0010#\u001a\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "", "toByteArray", "(Ljava/lang/String;Ljava/nio/charset/Charset;)[B", "bytes", "", "offset", "length", "String", "([BIILjava/nio/charset/Charset;)Ljava/lang/String;", "LS5/n;", "readBytes", "(LS5/n;)[B", "count", "(LS5/n;I)[B", "max", "readText", "(LS5/n;Ljava/nio/charset/Charset;I)Ljava/lang/String;", "n", "readTextExact", "charactersCount", "readTextExactCharacters", "(LS5/n;ILjava/nio/charset/Charset;)Ljava/lang/String;", "LS5/l;", "", ContentType.Text.TYPE, "fromIndex", "toIndex", "LO3/C;", "writeText", "(LS5/l;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;)V", "", "(LS5/l;[CIILjava/nio/charset/Charset;)V", "", "prematureEndOfStreamToReadChars", "(I)Ljava/lang/Void;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringsKt {
    @InterfaceC0554c
    public static final String String(byte[] bArr, int i7, int i8, Charset charset) {
        l.f("bytes", bArr);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        if (charset.equals(C2496a.f19036b)) {
            return AbstractC2517v.J(bArr, i7, i8 + i7);
        }
        a aVar = new a();
        BytePacketBuilderKt.writeFully(aVar, bArr, i7, i8);
        return readText$default(aVar, charset, 0, 2, null);
    }

    public static /* synthetic */ String String$default(byte[] bArr, int i7, int i8, Charset charset, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        if ((i9 & 8) != 0) {
            charset = C2496a.f19036b;
        }
        return String(bArr, i7, i8, charset);
    }

    private static final Void prematureEndOfStreamToReadChars(int i7) throws EOFException {
        throw new EOFException(c0.a(i7, "Not enough input bytes to read ", " characters."));
    }

    @InterfaceC0554c
    public static final byte[] readBytes(n nVar, int i7) {
        l.f("<this>", nVar);
        return p.i(nVar, i7);
    }

    public static final String readText(n nVar, Charset charset, int i7) {
        l.f("<this>", nVar);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        if (!charset.equals(C2496a.f19036b)) {
            return EncodingKt.decode(charset.newDecoder(), nVar, i7);
        }
        if (i7 == Integer.MAX_VALUE) {
            return p.k(nVar);
        }
        long jMin = Math.min(nVar.a().f8784m, i7);
        nVar.Q(jMin);
        return p.c(nVar.a(), jMin);
    }

    public static /* synthetic */ String readText$default(n nVar, Charset charset, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = C2496a.f19036b;
        }
        if ((i8 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return readText(nVar, charset, i7);
    }

    @InterfaceC0554c
    public static final String readTextExact(n nVar, Charset charset, int i7) {
        l.f("<this>", nVar);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        return readTextExactCharacters(nVar, i7, charset);
    }

    public static /* synthetic */ String readTextExact$default(n nVar, Charset charset, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = C2496a.f19036b;
        }
        return readTextExact(nVar, charset, i7);
    }

    public static final String readTextExactCharacters(n nVar, int i7, Charset charset) throws EOFException {
        l.f("<this>", nVar);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        String text = readText(nVar, charset, i7);
        if (text.length() >= i7) {
            return text;
        }
        prematureEndOfStreamToReadChars(i7);
        throw new r();
    }

    public static /* synthetic */ String readTextExactCharacters$default(n nVar, int i7, Charset charset, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            charset = C2496a.f19036b;
        }
        return readTextExactCharacters(nVar, i7, charset);
    }

    public static final byte[] toByteArray(String str, Charset charset) throws CharacterCodingException {
        l.f("<this>", str);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        Charset charset2 = C2496a.f19036b;
        if (!charset.equals(charset2)) {
            return CharsetJVMKt.encodeToByteArray(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        c.l(0, length, str.length());
        CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            l.c(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                l.c(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = C2496a.f19036b;
        }
        return toByteArray(str, charset);
    }

    public static final void writeText(S5.l lVar, CharSequence charSequence, int i7, int i8, Charset charset) {
        l.f("<this>", lVar);
        l.f(ContentType.Text.TYPE, charSequence);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        if (charset == C2496a.f19036b) {
            p.p(lVar, charSequence.toString(), i7, i8);
        } else {
            EncodingKt.encodeToImpl(charset.newEncoder(), lVar, charSequence, i7, i8);
        }
    }

    public static /* synthetic */ void writeText$default(S5.l lVar, CharSequence charSequence, int i7, int i8, Charset charset, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = charSequence.length();
        }
        if ((i9 & 8) != 0) {
            charset = C2496a.f19036b;
        }
        writeText(lVar, charSequence, i7, i8, charset);
    }

    @InterfaceC0554c
    public static final byte[] readBytes(n nVar) {
        l.f("<this>", nVar);
        return p.j(nVar, -1);
    }

    public static final void writeText(S5.l lVar, char[] cArr, int i7, int i8, Charset charset) {
        l.f("<this>", lVar);
        l.f(ContentType.Text.TYPE, cArr);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        if (charset == C2496a.f19036b) {
            p.p(lVar, AbstractC2517v.H(cArr, i7, i7 + i8), 0, i8 - i7);
        } else {
            EncodingKt.encode(charset.newEncoder(), cArr, i7, i8, lVar);
        }
    }

    public static /* synthetic */ void writeText$default(S5.l lVar, char[] cArr, int i7, int i8, Charset charset, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = cArr.length;
        }
        if ((i9 & 8) != 0) {
            charset = C2496a.f19036b;
        }
        writeText(lVar, cArr, i7, i8, charset);
    }
}
