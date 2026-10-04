package io.github.jan.supabase.auth;

import O3.C;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/CodeVerifierCache;", "", "saveCodeVerifier", "", "codeVerifier", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCodeVerifier", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCodeVerifier", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CodeVerifierCache {
    Object deleteCodeVerifier(S3.c<? super C> cVar);

    Object loadCodeVerifier(S3.c<? super String> cVar);

    Object saveCodeVerifier(String str, S3.c<? super C> cVar);
}
