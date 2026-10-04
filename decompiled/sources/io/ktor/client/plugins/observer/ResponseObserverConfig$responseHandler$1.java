package io.ktor.client.plugins.observer;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1", f = "ResponseObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ResponseObserverConfig$responseHandler$1 extends j implements n {
    int label;

    public ResponseObserverConfig$responseHandler$1(c<? super ResponseObserverConfig$responseHandler$1> cVar) {
        super(2, cVar);
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new ResponseObserverConfig$responseHandler$1(cVar);
    }

    @Override // e4.n
    public final Object invoke(HttpResponse httpResponse, c<? super C> cVar) {
        return ((ResponseObserverConfig$responseHandler$1) create(httpResponse, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        return C.a;
    }
}
