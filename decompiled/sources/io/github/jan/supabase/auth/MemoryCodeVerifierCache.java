package io.github.jan.supabase.auth;

import O3.C;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0096@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\fR\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000e"}, d2 = {"Lio/github/jan/supabase/auth/MemoryCodeVerifierCache;", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "codeVerifier", "", "<init>", "(Ljava/lang/String;)V", "Lkotlin/concurrent/atomics/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "saveCodeVerifier", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCodeVerifier", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCodeVerifier", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MemoryCodeVerifierCache implements CodeVerifierCache {
    private final AtomicReference<String> codeVerifier;

    /* JADX WARN: Multi-variable type inference failed */
    public MemoryCodeVerifierCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.github.jan.supabase.auth.CodeVerifierCache
    public Object deleteCodeVerifier(S3.c<? super C> cVar) {
        this.codeVerifier.set(null);
        return C.a;
    }

    @Override // io.github.jan.supabase.auth.CodeVerifierCache
    public Object loadCodeVerifier(S3.c<? super String> cVar) {
        return this.codeVerifier.get();
    }

    @Override // io.github.jan.supabase.auth.CodeVerifierCache
    public Object saveCodeVerifier(String str, S3.c<? super C> cVar) {
        this.codeVerifier.set(str);
        return C.a;
    }

    public MemoryCodeVerifierCache(String str) {
        this.codeVerifier = new AtomicReference<>(str);
    }

    public /* synthetic */ MemoryCodeVerifierCache(String str, int i7, f fVar) {
        this((i7 & 1) != 0 ? null : str);
    }
}
