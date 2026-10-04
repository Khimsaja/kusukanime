package io.ktor.util;

import S5.p;
import f6.AbstractC0915m;
import io.ktor.http.ContentDisposition;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.InternalAPI;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0087@¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\f\b\u0002\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0087@¢\u0006\u0004\b\f\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "bytes", "", "hex", "([B)Ljava/lang/String;", "s", "(Ljava/lang/String;)[B", "", ContentDisposition.Parameters.Size, "generateNonce", "(I)[B", "Lio/ktor/util/Digest;", "build", "(Lio/ktor/util/Digest;[BLS3/c;)Ljava/lang/Object;", "string", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "(Lio/ktor/util/Digest;Ljava/lang/String;Ljava/nio/charset/Charset;LS3/c;)Ljava/lang/Object;", "", "digits", "[C", "NONCE_SIZE_IN_BYTES", "I", "ktor-utils"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "io/ktor/util/CryptoKt")
/* loaded from: classes.dex */
final /* synthetic */ class CryptoKt__CryptoKt {
    private static final char[] digits = CharsetKt.toCharArray("0123456789abcdef");

    @InternalAPI
    public static final Object build(Digest digest, byte[] bArr, S3.c<? super byte[]> cVar) {
        digest.plusAssign(bArr);
        return digest.build(cVar);
    }

    public static /* synthetic */ Object build$default(Digest digest, String str, Charset charset, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            charset = C2496a.f19036b;
        }
        return CryptoKt.build(digest, str, charset, cVar);
    }

    public static final byte[] generateNonce(int i7) {
        S5.a aVar = new S5.a();
        while (BytePacketBuilderKt.getSize(aVar) < i7) {
            StringsKt.writeText$default(aVar, CryptoKt.generateNonce(), 0, 0, (Charset) null, 14, (Object) null);
        }
        return p.i(aVar, i7);
    }

    public static final String hex(byte[] bArr) {
        l.f("bytes", bArr);
        char[] cArr = new char[bArr.length * 2];
        char[] cArr2 = digits;
        int i7 = 0;
        for (byte b4 : bArr) {
            int i8 = i7 + 1;
            cArr[i7] = cArr2[(b4 & 255) >> 4];
            i7 += 2;
            cArr[i8] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    @InternalAPI
    public static final Object build(Digest digest, String str, Charset charset, S3.c<? super byte[]> cVar) {
        digest.plusAssign(StringsKt.toByteArray(str, charset));
        return digest.build(cVar);
    }

    public static final byte[] hex(String str) {
        l.f("s", str);
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            String strValueOf = String.valueOf(str.charAt(i8));
            AbstractC0915m.k(16);
            int i9 = Integer.parseInt(strValueOf, 16) << 4;
            String strValueOf2 = String.valueOf(str.charAt(i8 + 1));
            AbstractC0915m.k(16);
            bArr[i7] = (byte) (Integer.parseInt(strValueOf2, 16) | i9);
        }
        return bArr;
    }
}
