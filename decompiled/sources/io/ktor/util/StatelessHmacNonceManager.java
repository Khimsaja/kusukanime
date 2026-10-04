package io.ktor.util;

import e4.InterfaceC0821a;
import f6.AbstractC0915m;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.C2496a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/ktor/util/StatelessHmacNonceManager;", "Lio/ktor/util/NonceManager;", "Ljavax/crypto/spec/SecretKeySpec;", "keySpec", "", "algorithm", "", "timeoutMillis", "Lkotlin/Function0;", "nonceGenerator", "<init>", "(Ljavax/crypto/spec/SecretKeySpec;Ljava/lang/String;JLe4/a;)V", "", "key", "([BLjava/lang/String;JLe4/a;)V", "newNonce", "(LS3/c;)Ljava/lang/Object;", "nonce", "", "verifyNonce", "(Ljava/lang/String;LS3/c;)Ljava/lang/Object;", "Ljavax/crypto/spec/SecretKeySpec;", "getKeySpec", "()Ljavax/crypto/spec/SecretKeySpec;", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "J", "getTimeoutMillis", "()J", "Le4/a;", "getNonceGenerator", "()Le4/a;", "", "macLength", "I", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatelessHmacNonceManager implements NonceManager {
    private final String algorithm;
    private final SecretKeySpec keySpec;
    private final int macLength;
    private final InterfaceC0821a nonceGenerator;
    private final long timeoutMillis;

    public StatelessHmacNonceManager(SecretKeySpec secretKeySpec, String str, long j7, InterfaceC0821a interfaceC0821a) throws NoSuchAlgorithmException, InvalidKeyException {
        l.f("keySpec", secretKeySpec);
        l.f("algorithm", str);
        l.f("nonceGenerator", interfaceC0821a);
        this.keySpec = secretKeySpec;
        this.algorithm = str;
        this.timeoutMillis = j7;
        this.nonceGenerator = interfaceC0821a;
        Mac mac = Mac.getInstance(str);
        mac.init(secretKeySpec);
        this.macLength = mac.getMacLength();
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final SecretKeySpec getKeySpec() {
        return this.keySpec;
    }

    public final InterfaceC0821a getNonceGenerator() {
        return this.nonceGenerator;
    }

    public final long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    @Override // io.ktor.util.NonceManager
    public Object newNonce(S3.c<? super String> cVar) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        String str = (String) this.nonceGenerator.invoke();
        long jNanoTime = System.nanoTime();
        AbstractC0915m.k(16);
        String string = Long.toString(jNanoTime, 16);
        l.e("toString(...)", string);
        String strL0 = AbstractC2510o.l0(16, string);
        Mac mac = Mac.getInstance(this.algorithm);
        mac.init(this.keySpec);
        byte[] bytes = (str + ':' + strL0).getBytes(C2496a.f19037c);
        l.e("getBytes(...)", bytes);
        mac.update(bytes);
        byte[] bArrDoFinal = mac.doFinal();
        l.e("doFinal(...)", bArrDoFinal);
        return str + '+' + strL0 + '+' + CryptoKt.hex(bArrDoFinal);
    }

    @Override // io.ktor.util.NonceManager
    public Object verifyNonce(String str, S3.c<? super Boolean> cVar) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        List listV0 = AbstractC2510o.v0(str, new char[]{'+'});
        if (listV0.size() != 3) {
            return Boolean.FALSE;
        }
        String str2 = (String) listV0.get(0);
        String str3 = (String) listV0.get(1);
        String str4 = (String) listV0.get(2);
        if (str2.length() < 8) {
            return Boolean.FALSE;
        }
        if (str4.length() != this.macLength * 2) {
            return Boolean.FALSE;
        }
        if (str3.length() != 16) {
            return Boolean.FALSE;
        }
        AbstractC0915m.k(16);
        if (TimeUnit.MILLISECONDS.toNanos(this.timeoutMillis) + Long.parseLong(str3, 16) < System.nanoTime()) {
            return Boolean.FALSE;
        }
        Mac mac = Mac.getInstance(this.algorithm);
        mac.init(this.keySpec);
        byte[] bytes = (str2 + ':' + str3).getBytes(C2496a.f19037c);
        l.e("getBytes(...)", bytes);
        mac.update(bytes);
        byte[] bArrDoFinal = mac.doFinal();
        l.e("doFinal(...)", bArrDoFinal);
        String strHex = CryptoKt.hex(bArrDoFinal);
        int iMin = Math.min(strHex.length(), str4.length());
        int i7 = 0;
        for (int i8 = 0; i8 < iMin; i8++) {
            if (strHex.charAt(i8) == str4.charAt(i8)) {
                i7++;
            }
        }
        return Boolean.valueOf(i7 == this.macLength * 2);
    }

    public /* synthetic */ StatelessHmacNonceManager(SecretKeySpec secretKeySpec, String str, long j7, InterfaceC0821a interfaceC0821a, int i7, f fVar) {
        this(secretKeySpec, (i7 & 2) != 0 ? "HmacSHA256" : str, (i7 & 4) != 0 ? 60000L : j7, (i7 & 8) != 0 ? new io.ktor.http.c(14) : interfaceC0821a);
    }

    public /* synthetic */ StatelessHmacNonceManager(byte[] bArr, String str, long j7, InterfaceC0821a interfaceC0821a, int i7, f fVar) {
        this(bArr, (i7 & 2) != 0 ? "HmacSHA256" : str, (i7 & 4) != 0 ? 60000L : j7, (i7 & 8) != 0 ? new io.ktor.http.c(13) : interfaceC0821a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatelessHmacNonceManager(byte[] bArr, String str, long j7, InterfaceC0821a interfaceC0821a) {
        this(new SecretKeySpec(bArr, str), str, j7, interfaceC0821a);
        l.f("key", bArr);
        l.f("algorithm", str);
        l.f("nonceGenerator", interfaceC0821a);
    }
}
