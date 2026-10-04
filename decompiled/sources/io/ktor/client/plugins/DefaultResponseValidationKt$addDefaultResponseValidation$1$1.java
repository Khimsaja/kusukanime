package io.ktor.client.plugins;

import O3.C;
import U3.j;
import e4.n;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "response", "LO3/C;", "<anonymous>", "(Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", l = {42, 48}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultResponseValidationKt$addDefaultResponseValidation$1$1 extends j implements n {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    public DefaultResponseValidationKt$addDefaultResponseValidation$1$1(S3.c<? super DefaultResponseValidationKt$addDefaultResponseValidation$1$1> cVar) {
        super(2, cVar);
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        DefaultResponseValidationKt$addDefaultResponseValidation$1$1 defaultResponseValidationKt$addDefaultResponseValidation$1$1 = new DefaultResponseValidationKt$addDefaultResponseValidation$1$1(cVar);
        defaultResponseValidationKt$addDefaultResponseValidation$1$1.L$0 = obj;
        return defaultResponseValidationKt$addDefaultResponseValidation$1$1;
    }

    @Override // e4.n
    public final Object invoke(HttpResponse httpResponse, S3.c<? super C> cVar) {
        return ((DefaultResponseValidationKt$addDefaultResponseValidation$1$1) create(httpResponse, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(8:6|53|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(1:51)(3:21|(1:24)|28)))|25|55|26|(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        r0 = r1;
        r2 = r6;
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
