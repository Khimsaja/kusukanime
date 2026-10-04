package io.ktor.util.pipeline;

import S3.h;
import U3.c;
import U3.e;
import e4.o;
import io.ktor.utils.io.KtorDsl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@KtorDsl
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bk\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012J\u0010\u000b\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u0006\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u0018\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0019\u0010\u0016RX\u0010\u000b\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/util/pipeline/DebugPipelineContext;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "context", "", "Lkotlin/Function3;", "LS3/c;", "LO3/C;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "interceptors", "subject", "LS3/h;", "coroutineContext", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;LS3/h;)V", "proceedLoop", "(LS3/c;)Ljava/lang/Object;", "finish", "()V", "proceedWith", "(Ljava/lang/Object;LS3/c;)Ljava/lang/Object;", "proceed", "initial", "execute$ktor_utils", "execute", "Ljava/util/List;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "Ljava/lang/Object;", "getSubject", "()Ljava/lang/Object;", "setSubject", "(Ljava/lang/Object;)V", "", "index", "I", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DebugPipelineContext<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    private final h coroutineContext;
    private int index;
    private final List<o> interceptors;
    private TSubject subject;

    @e(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {79}, m = "proceedLoop")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DebugPipelineContext<TSubject, TContext> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DebugPipelineContext<TSubject, TContext> debugPipelineContext, S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = debugPipelineContext;
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.proceedLoop(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPipelineContext(TContext tcontext, List<? extends o> list, TSubject tsubject, h hVar) {
        super(tcontext);
        l.f("context", tcontext);
        l.f("interceptors", list);
        l.f("subject", tsubject);
        l.f("coroutineContext", hVar);
        this.interceptors = list;
        this.coroutineContext = hVar;
        this.subject = tsubject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object proceedLoop(S3.c<? super TSubject> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = (io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = new io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            goto L2c
        L24:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2c:
            P3.r.Y(r6)
        L2f:
            int r6 = r5.index
            r2 = -1
            if (r6 != r2) goto L35
            goto L40
        L35:
            java.util.List<e4.o> r2 = r5.interceptors
            int r4 = r2.size()
            if (r6 < r4) goto L45
            r5.finish()
        L40:
            java.lang.Object r6 = r5.getSubject()
            return r6
        L45:
            java.lang.Object r2 = r2.get(r6)
            e4.o r2 = (e4.o) r2
            int r6 = r6 + 1
            r5.index = r6
            java.lang.Object r6 = r5.getSubject()
            r0.label = r3
            java.lang.Object r6 = r2.invoke(r5, r6, r0)
            if (r6 != r1) goto L2f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.DebugPipelineContext.proceedLoop(S3.c):java.lang.Object");
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object execute$ktor_utils(TSubject tsubject, S3.c<? super TSubject> cVar) {
        this.index = 0;
        setSubject(tsubject);
        return proceed(cVar);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void finish() {
        this.index = -1;
    }

    @Override // io.ktor.util.pipeline.PipelineContext, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public TSubject getSubject() {
        return this.subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceed(S3.c<? super TSubject> cVar) {
        int i7 = this.index;
        if (i7 < 0) {
            return getSubject();
        }
        if (i7 < this.interceptors.size()) {
            return proceedLoop(cVar);
        }
        finish();
        return getSubject();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceedWith(TSubject tsubject, S3.c<? super TSubject> cVar) {
        setSubject(tsubject);
        return proceed(cVar);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void setSubject(TSubject tsubject) {
        l.f("<set-?>", tsubject);
        this.subject = tsubject;
    }
}
