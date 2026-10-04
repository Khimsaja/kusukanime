package io.ktor.util;

import e4.k;
import io.ktor.utils.io.InternalAPI;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(d1 = {"io/ktor/util/CryptoKt__CryptoJvmKt", "io/ktor/util/CryptoKt__CryptoKt"}, k = GzipHeaderFlags.EXTRA, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CryptoKt {
    public static final int NONCE_SIZE_IN_BYTES = 16;

    public static final Digest Digest(String str) {
        return CryptoKt__CryptoJvmKt.Digest(str);
    }

    @InternalAPI
    public static final Object build(Digest digest, String str, Charset charset, S3.c<? super byte[]> cVar) {
        return CryptoKt__CryptoKt.build(digest, str, charset, cVar);
    }

    public static final String generateNonce() {
        return CryptoKt__CryptoJvmKt.generateNonce();
    }

    public static final k getDigestFunction(String str, k kVar) {
        return CryptoKt__CryptoJvmKt.getDigestFunction(str, kVar);
    }

    public static final String hex(byte[] bArr) {
        return CryptoKt__CryptoKt.hex(bArr);
    }

    public static final byte[] sha1(byte[] bArr) {
        return CryptoKt__CryptoJvmKt.sha1(bArr);
    }

    @InternalAPI
    public static final Object build(Digest digest, byte[] bArr, S3.c<? super byte[]> cVar) {
        return CryptoKt__CryptoKt.build(digest, bArr, cVar);
    }

    public static final byte[] generateNonce(int i7) {
        return CryptoKt__CryptoKt.generateNonce(i7);
    }

    public static final byte[] hex(String str) {
        return CryptoKt__CryptoKt.hex(str);
    }
}
