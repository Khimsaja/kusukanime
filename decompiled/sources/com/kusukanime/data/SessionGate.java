package com.kusukanime.data;

import K5.G;
import K5.N;
import K5.W;
import K5.Y;
import U3.c;
import U3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/kusukanime/data/SessionGate;", "", "<init>", "()V", "_loggedIn", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "loggedIn", "Lkotlinx/coroutines/flow/StateFlow;", "getLoggedIn", "()Lkotlinx/coroutines/flow/StateFlow;", "_uid", "", "uid", "getUid", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "initialized", "ensure", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "markLoggedOut", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionGate {
    public static final int $stable;
    public static final SessionGate INSTANCE = new SessionGate();
    private static final G _loggedIn;
    private static final G _uid;
    private static volatile boolean initialized;
    private static final W loggedIn;
    private static final R5.a mutex;
    private static final W uid;

    @e(c = "com.kusukanime.data.SessionGate", f = "SessionGate.kt", l = {82, 43, 58}, m = "ensure", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.SessionGate$ensure$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionGate.this.ensure(this);
        }
    }

    static {
        Y yB = N.b(null);
        _loggedIn = yB;
        loggedIn = yB;
        Y yB2 = N.b(null);
        _uid = yB2;
        uid = yB2;
        mutex = new R5.c();
        $stable = 8;
    }

    private SessionGate() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r8.awaitInitialization(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f3, code lost:
    
        if (H5.D.k(250, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f3 -> B:84:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ensure(S3.c<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.SessionGate.ensure(S3.c):java.lang.Object");
    }

    public final W getLoggedIn() {
        return loggedIn;
    }

    public final W getUid() {
        return uid;
    }

    public final void markLoggedOut() {
        G g4 = _loggedIn;
        Boolean bool = Boolean.FALSE;
        Y y7 = (Y) g4;
        y7.getClass();
        y7.i(null, bool);
        ((Y) _uid).h(null);
    }

    public final Object refresh(S3.c<? super Boolean> cVar) {
        return ensure(cVar);
    }
}
