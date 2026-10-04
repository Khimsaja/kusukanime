package io.ktor.util.pipeline;

import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.k;
import e4.o;
import io.ktor.util.debug.ContextUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0005\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0086H¢\u0006\u0004\b\u0005\u0010\u0006\u001aw\u0010\u000e\u001a\u00020\u0003\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00020\u0000*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\t\u001a\u00020\b26\b\b\u0010\r\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f*p\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0007\u001a\u0004\b\u0001\u0010\u0001\".\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n2.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n*r\u0010\u0011\u001a\u0004\b\u0000\u0010\u0007\u001a\u0004\b\u0001\u0010\u0001\"0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n20\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"", "TContext", "Lio/ktor/util/pipeline/Pipeline;", "LO3/C;", "context", "execute", "(Lio/ktor/util/pipeline/Pipeline;Ljava/lang/Object;LS3/c;)Ljava/lang/Object;", "TSubject", "Lio/ktor/util/pipeline/PipelinePhase;", "phase", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "LS3/c;", "block", "intercept", "(Lio/ktor/util/pipeline/Pipeline;Lio/ktor/util/pipeline/PipelinePhase;Le4/o;)V", "PipelineInterceptorCoroutine", "PipelineInterceptor", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PipelineKt {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO3/C;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.pipeline.PipelineKt$execute$2", f = "Pipeline.kt", l = {510}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.pipeline.PipelineKt$execute$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements k {
        final /* synthetic */ TContext $context;
        final /* synthetic */ Pipeline<C, TContext> $this_execute;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Pipeline<C, TContext> pipeline, TContext tcontext, c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.$this_execute = pipeline;
            this.$context = tcontext;
        }

        @Override // U3.a
        public final c<C> create(c<?> cVar) {
            return new AnonymousClass2(this.$this_execute, this.$context, cVar);
        }

        @Override // e4.k
        public final Object invoke(c<? super C> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            C c2 = C.a;
            if (i7 == 0) {
                r.Y(obj);
                Pipeline<C, TContext> pipeline = this.$this_execute;
                TContext tcontext = this.$context;
                this.label = 1;
                if (pipeline.execute(tcontext, c2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return c2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "subject", "LO3/C;", "<anonymous>", "(Ljava/lang/Void;Ljava/lang/Void;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.pipeline.PipelineKt$intercept$1", f = "Pipeline.kt", l = {528}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.pipeline.PipelineKt$intercept$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ o $block;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$block = oVar;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<? extends Object, TContext> pipelineContext, Object obj, c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, cVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return C.a;
            }
            r.Y(obj);
            l.k();
            throw null;
        }
    }

    public static final <TContext> Object execute(Pipeline<C, TContext> pipeline, TContext tcontext, c<? super C> cVar) {
        Object objInitContextInDebugMode = ContextUtilsKt.initContextInDebugMode(new AnonymousClass2(pipeline, tcontext, null), cVar);
        return objInitContextInDebugMode == a.f9048k ? objInitContextInDebugMode : C.a;
    }

    private static final <TContext> Object execute$$forInline(Pipeline<C, TContext> pipeline, TContext tcontext, c<? super C> cVar) {
        ContextUtilsKt.initContextInDebugMode(new AnonymousClass2(pipeline, tcontext, null), cVar);
        return C.a;
    }

    public static final <TSubject, TContext> void intercept(Pipeline<?, TContext> pipeline, PipelinePhase pipelinePhase, o oVar) {
        l.f("<this>", pipeline);
        l.f("phase", pipelinePhase);
        l.f("block", oVar);
        l.k();
        throw null;
    }
}
