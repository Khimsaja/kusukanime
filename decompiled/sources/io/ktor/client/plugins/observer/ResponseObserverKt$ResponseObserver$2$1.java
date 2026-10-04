package io.ktor.client.plugins.observer;

import H5.A;
import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.k;
import e4.n;
import e4.o;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.observer.AfterReceiveHook;
import io.ktor.client.statement.HttpResponse;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;", "Lio/ktor/client/statement/HttpResponse;", "response", "LO3/C;", "<anonymous>", "(Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", l = {69, 69, 72, 82, 87}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ResponseObserverKt$ResponseObserver$2$1 extends j implements o {
    final /* synthetic */ k $filter;
    final /* synthetic */ n $responseHandler;
    final /* synthetic */ ClientPluginBuilder<ResponseObserverConfig> $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH5/A;", "LO3/o;", "LO3/C;", "<anonymous>", "(LH5/A;)LO3/o;"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ HttpResponse $response;
        final /* synthetic */ n $responseHandler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n nVar, HttpResponse httpResponse, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$responseHandler = nVar;
            this.$response = httpResponse;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$responseHandler, this.$response, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super O3.o> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objR;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    r.Y(obj);
                    n nVar = this.$responseHandler;
                    HttpResponse httpResponse = this.$response;
                    this.label = 1;
                    if (nVar.invoke(httpResponse, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.Y(obj);
                }
                objR = C.a;
            } catch (Throwable th) {
                objR = r.r(th);
            }
            return new O3.o(objR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$2", f = "ResponseObserver.kt", l = {83, 84}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ n $responseHandler;
        final /* synthetic */ HttpResponse $sideResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(n nVar, HttpResponse httpResponse, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$responseHandler = nVar;
            this.$sideResponse = httpResponse;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$responseHandler, this.$sideResponse, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            if (r0.invoke(r4, r9) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        
            if (r10 == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        
            return r1;
         */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                T3.a r1 = T3.a.f9048k
                int r0 = r9.label
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L26
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L13
                P3.r.Y(r10)     // Catch: java.lang.Throwable -> L10
                goto L56
            L10:
                r0 = move-exception
                r10 = r0
                goto L62
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                java.lang.Object r0 = r9.L$0
                H5.A r0 = (H5.A) r0
                P3.r.Y(r10)     // Catch: java.lang.Throwable -> L23
                goto L3f
            L23:
                r0 = move-exception
                r10 = r0
                goto L3c
            L26:
                P3.r.Y(r10)
                java.lang.Object r10 = r9.L$0
                H5.A r10 = (H5.A) r10
                e4.n r0 = r9.$responseHandler
                io.ktor.client.statement.HttpResponse r4 = r9.$sideResponse
                r9.L$0 = r10     // Catch: java.lang.Throwable -> L23
                r9.label = r3     // Catch: java.lang.Throwable -> L23
                java.lang.Object r10 = r0.invoke(r4, r9)     // Catch: java.lang.Throwable -> L23
                if (r10 != r1) goto L3f
                goto L55
            L3c:
                P3.r.r(r10)
            L3f:
                io.ktor.client.statement.HttpResponse r10 = r9.$sideResponse
                io.ktor.utils.io.ByteReadChannel r3 = r10.getRawContent()     // Catch: java.lang.Throwable -> L10
                r10 = 0
                r9.L$0 = r10     // Catch: java.lang.Throwable -> L10
                r9.label = r2     // Catch: java.lang.Throwable -> L10
                r7 = 1
                r8 = 0
                r4 = 0
                r6 = r9
                java.lang.Object r10 = io.ktor.utils.io.ByteReadChannelOperationsKt.discard$default(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L10
                if (r10 != r1) goto L56
            L55:
                return r1
            L56:
                java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L10
                long r0 = r10.longValue()     // Catch: java.lang.Throwable -> L10
                java.lang.Long r10 = new java.lang.Long     // Catch: java.lang.Throwable -> L10
                r10.<init>(r0)     // Catch: java.lang.Throwable -> L10
                goto L65
            L62:
                P3.r.r(r10)
            L65:
                O3.C r10 = O3.C.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseObserverKt$ResponseObserver$2$1(k kVar, ClientPluginBuilder<ResponseObserverConfig> clientPluginBuilder, n nVar, c<? super ResponseObserverKt$ResponseObserver$2$1> cVar) {
        super(3, cVar);
        this.$filter = kVar;
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$responseHandler = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel invokeSuspend$lambda$0(ByteReadChannel byteReadChannel, HttpResponse httpResponse) {
        return byteReadChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel invokeSuspend$lambda$1(ByteReadChannel byteReadChannel, HttpResponse httpResponse) {
        return byteReadChannel;
    }

    @Override // e4.o
    public final Object invoke(AfterReceiveHook.Context context, HttpResponse httpResponse, c<? super C> cVar) {
        ResponseObserverKt$ResponseObserver$2$1 responseObserverKt$ResponseObserver$2$1 = new ResponseObserverKt$ResponseObserver$2$1(this.$filter, this.$this_createClientPlugin, this.$responseHandler, cVar);
        responseObserverKt$ResponseObserver$2$1.L$0 = context;
        responseObserverKt$ResponseObserver$2$1.L$1 = httpResponse;
        return responseObserverKt$ResponseObserver$2$1.invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f A[RETURN] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
