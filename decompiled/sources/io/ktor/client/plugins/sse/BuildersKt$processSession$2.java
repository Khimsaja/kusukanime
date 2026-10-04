package io.ktor.client.plugins.sse;

import H5.A;
import H5.InterfaceC0275p;
import O3.C;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.client.statement.HttpStatement;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", l = {1121, 1124, 1136, 1136}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BuildersKt$processSession$2 extends j implements n {
    final /* synthetic */ InterfaceC0275p $sessionDeferred;
    final /* synthetic */ HttpStatement $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$processSession$2(HttpStatement httpStatement, InterfaceC0275p interfaceC0275p, S3.c<? super BuildersKt$processSession$2> cVar) {
        super(2, cVar);
        this.$statement = httpStatement;
        this.$sessionDeferred = interfaceC0275p;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        return new BuildersKt$processSession$2(this.$statement, this.$sessionDeferred, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, S3.c<? super C> cVar) {
        return ((BuildersKt$processSession$2) create(a, cVar)).invokeSuspend(C.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // U3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r2 = 0
            r3 = 4
            r4 = 1
            if (r1 == 0) goto L52
            if (r1 == r4) goto L45
            r4 = 2
            if (r1 == r4) goto L30
            r0 = 3
            if (r1 == r0) goto L27
            if (r1 == r3) goto L1b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            java.lang.Object r0 = r5.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            P3.r.Y(r6)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            goto L82
        L23:
            r6 = move-exception
            goto L8a
        L25:
            r6 = move-exception
            goto L83
        L27:
            java.lang.Object r0 = r5.L$0
            O3.C r0 = (O3.C) r0
            P3.r.Y(r6)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            goto L9d
        L30:
            java.lang.Object r1 = r5.L$2
            io.ktor.client.statement.HttpResponse r1 = (io.ktor.client.statement.HttpResponse) r1
            java.lang.Object r4 = r5.L$1
            H5.p r4 = (H5.InterfaceC0275p) r4
            java.lang.Object r4 = r5.L$0
            io.ktor.client.statement.HttpStatement r4 = (io.ktor.client.statement.HttpStatement) r4
            P3.r.Y(r6)     // Catch: java.lang.Throwable -> L43
            kotlin.jvm.internal.l.k()     // Catch: java.lang.Throwable -> L43
            throw r2     // Catch: java.lang.Throwable -> L43
        L43:
            r6 = move-exception
            goto L72
        L45:
            java.lang.Object r1 = r5.L$1
            H5.p r1 = (H5.InterfaceC0275p) r1
            java.lang.Object r1 = r5.L$0
            io.ktor.client.statement.HttpStatement r1 = (io.ktor.client.statement.HttpStatement) r1
            P3.r.Y(r6)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            r4 = r1
            goto L68
        L52:
            P3.r.Y(r6)
            io.ktor.client.statement.HttpStatement r6 = r5.$statement     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L88
            H5.p r1 = r5.$sessionDeferred     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L88
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            r5.L$1 = r1     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            r5.label = r4     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            java.lang.Object r1 = r6.fetchStreamingResponse(r5)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            if (r1 != r0) goto L66
            goto L80
        L66:
            r4 = r6
            r6 = r1
        L68:
            r1 = r6
            io.ktor.client.statement.HttpResponse r1 = (io.ktor.client.statement.HttpResponse) r1     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            r1.getCall()     // Catch: java.lang.Throwable -> L43
            kotlin.jvm.internal.l.k()     // Catch: java.lang.Throwable -> L43
            throw r2     // Catch: java.lang.Throwable -> L43
        L72:
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            r5.L$1 = r2     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            r5.L$2 = r2     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            r5.label = r3     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            java.lang.Object r1 = r4.cleanup(r1, r5)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
            if (r1 != r0) goto L81
        L80:
            return r0
        L81:
            r0 = r6
        L82:
            throw r0     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L25
        L83:
            java.lang.Throwable r6 = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(r6)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L88
            throw r6     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L88
        L88:
            r6 = move-exception
            goto L96
        L8a:
            H5.p r0 = r5.$sessionDeferred
            java.lang.Throwable r6 = io.ktor.client.plugins.sse.BuildersKt.access$mapToSSEException(r2, r6)
            H5.q r0 = (H5.C0276q) r0
            r0.Z(r6)
            goto L9d
        L96:
            H5.p r0 = r5.$sessionDeferred
            H5.n0 r0 = (H5.n0) r0
            r0.n(r6)
        L9d:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt$processSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
