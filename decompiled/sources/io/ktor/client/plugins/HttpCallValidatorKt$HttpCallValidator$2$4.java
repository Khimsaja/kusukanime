package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.o;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "request", "Lio/ktor/client/request/HttpRequest;", "cause"}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4", f = "HttpCallValidator.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpCallValidatorKt$HttpCallValidator$2$4 extends j implements o {
    final /* synthetic */ List<HandlerWrapper> $callExceptionHandlers;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$4(List<? extends HandlerWrapper> list, S3.c<? super HttpCallValidatorKt$HttpCallValidator$2$4> cVar) {
        super(3, cVar);
        this.$callExceptionHandlers = list;
    }

    @Override // e4.o
    public final Object invoke(HttpRequest httpRequest, Throwable th, S3.c<? super Throwable> cVar) {
        HttpCallValidatorKt$HttpCallValidator$2$4 httpCallValidatorKt$HttpCallValidator$2$4 = new HttpCallValidatorKt$HttpCallValidator$2$4(this.$callExceptionHandlers, cVar);
        httpCallValidatorKt$HttpCallValidator$2$4.L$0 = httpRequest;
        httpCallValidatorKt$HttpCallValidator$2$4.L$1 = th;
        return httpCallValidatorKt$HttpCallValidator$2$4.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th = (Throwable) this.L$0;
            r.Y(obj);
            return th;
        }
        r.Y(obj);
        HttpRequest httpRequest = (HttpRequest) this.L$0;
        Throwable thUnwrapCancellationException = ExceptionUtilsJvmKt.unwrapCancellationException((Throwable) this.L$1);
        List<HandlerWrapper> list = this.$callExceptionHandlers;
        this.L$0 = thUnwrapCancellationException;
        this.label = 1;
        return HttpCallValidatorKt.HttpCallValidator$lambda$2$processException(list, thUnwrapCancellationException, httpRequest, this) == aVar ? aVar : thUnwrapCancellationException;
    }
}
