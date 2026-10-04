package io.ktor.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/util/NonceManager;", "", "", "newNonce", "(LS3/c;)Ljava/lang/Object;", "nonce", "", "verifyNonce", "(Ljava/lang/String;LS3/c;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NonceManager {
    Object newNonce(S3.c<? super String> cVar);

    Object verifyNonce(String str, S3.c<? super Boolean> cVar);
}
