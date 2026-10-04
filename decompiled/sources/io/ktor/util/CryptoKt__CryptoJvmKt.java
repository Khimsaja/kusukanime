package io.ktor.util;

import H5.D;
import J5.m;
import S3.i;
import e4.k;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.auth.AuthScheme;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"", "algorithm", "Lkotlin/Function1;", "salt", "", "getDigestFunction", "(Ljava/lang/String;Le4/k;)Le4/k;", ContentType.Text.TYPE, "getDigest$CryptoKt__CryptoJvmKt", "(Ljava/lang/String;Ljava/lang/String;Le4/k;)[B", "getDigest", "bytes", "sha1", "([B)[B", ContentDisposition.Parameters.Name, "Lio/ktor/util/Digest;", AuthScheme.Digest, "(Ljava/lang/String;)Lio/ktor/util/Digest;", "generateNonce", "()Ljava/lang/String;", "generateNonceBlocking$CryptoKt__CryptoJvmKt", "generateNonceBlocking", "ktor-utils"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "io/ktor/util/CryptoKt")
/* loaded from: classes.dex */
final /* synthetic */ class CryptoKt__CryptoJvmKt {
    public static final Digest Digest(String str) throws NoSuchAlgorithmException {
        l.f(ContentDisposition.Parameters.Name, str);
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        l.e("getInstance(...)", messageDigest);
        return DigestImpl.m179boximpl(DigestImpl.m181constructorimpl(messageDigest));
    }

    public static final String generateNonce() {
        String str = (String) m.a(NonceKt.getSeedChannel().a());
        return str != null ? str : generateNonceBlocking$CryptoKt__CryptoJvmKt();
    }

    private static final String generateNonceBlocking$CryptoKt__CryptoJvmKt() {
        NonceKt.ensureNonceGeneratorRunning();
        return (String) D.B(i.f8767k, new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(null));
    }

    private static final byte[] getDigest$CryptoKt__CryptoJvmKt(String str, String str2, k kVar) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        String str3 = (String) kVar.invoke(str);
        Charset charset = C2496a.f19036b;
        byte[] bytes = str3.getBytes(charset);
        l.e("getBytes(...)", bytes);
        messageDigest.update(bytes);
        byte[] bytes2 = str.getBytes(charset);
        l.e("getBytes(...)", bytes2);
        byte[] bArrDigest = messageDigest.digest(bytes2);
        l.e("with(...)", bArrDigest);
        return bArrDigest;
    }

    public static final k getDigestFunction(String str, k kVar) {
        l.f("algorithm", str);
        l.f("salt", kVar);
        return new a(0, str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getDigestFunction$lambda$0$CryptoKt__CryptoJvmKt(String str, k kVar, String str2) {
        l.f("e", str2);
        return getDigest$CryptoKt__CryptoJvmKt(str2, str, kVar);
    }

    public static final byte[] sha1(byte[] bArr) {
        l.f("bytes", bArr);
        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
        l.e("digest(...)", bArrDigest);
        return bArrDigest;
    }
}
