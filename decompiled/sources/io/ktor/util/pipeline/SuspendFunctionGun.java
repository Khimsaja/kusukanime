package io.ktor.util.pipeline;

import O3.C;
import O3.n;
import P3.r;
import S3.c;
import S3.h;
import T3.a;
import e4.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bc\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012J\u0010\f\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010$\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\"\u0010#RX\u0010\f\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R \u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u001c\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0016R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lio/ktor/util/pipeline/SuspendFunctionGun;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "initial", "context", "", "Lkotlin/Function3;", "LS3/c;", "LO3/C;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "blocks", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "", "direct", "loop", "(Z)Z", "LO3/o;", "result", "resumeRootWith", "(Ljava/lang/Object;)V", "discardLastRootContinuation", "()V", "finish", "proceed", "(LS3/c;)Ljava/lang/Object;", "subject", "proceedWith", "(Ljava/lang/Object;LS3/c;)Ljava/lang/Object;", "execute$ktor_utils", "execute", "continuation", "addContinuation$ktor_utils", "(LS3/c;)V", "addContinuation", "Ljava/util/List;", "LS3/c;", "getContinuation$ktor_utils", "()LS3/c;", "Ljava/lang/Object;", "getSubject", "()Ljava/lang/Object;", "setSubject", "", "suspensions", "[LS3/c;", "", "lastSuspensionIndex", "I", "index", "LS3/h;", "getCoroutineContext", "()LS3/h;", "coroutineContext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendFunctionGun<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    private final List<o> blocks;
    private final c<C> continuation;
    private int index;
    private int lastSuspensionIndex;
    private TSubject subject;
    private final c<TSubject>[] suspensions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendFunctionGun(TSubject tsubject, TContext tcontext, List<? extends o> list) {
        super(tcontext);
        l.f("initial", tsubject);
        l.f("context", tcontext);
        l.f("blocks", list);
        this.blocks = list;
        this.continuation = new SuspendFunctionGun$continuation$1(this);
        this.subject = tsubject;
        this.suspensions = new c[list.size()];
        this.lastSuspensionIndex = -1;
    }

    private final void discardLastRootContinuation() {
        int i7 = this.lastSuspensionIndex;
        if (i7 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        c<TSubject>[] cVarArr = this.suspensions;
        this.lastSuspensionIndex = i7 - 1;
        cVarArr[i7] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean loop(boolean direct) {
        int i7;
        do {
            i7 = this.index;
            if (i7 == this.blocks.size()) {
                if (direct) {
                    return true;
                }
                resumeRootWith(getSubject());
                return false;
            }
            this.index = i7 + 1;
            try {
            } catch (Throwable th) {
                resumeRootWith(r.r(th));
                return false;
            }
        } while (PipelineJvmKt.pipelineStartCoroutineUninterceptedOrReturn(this.blocks.get(i7), this, getSubject(), this.continuation) != a.f9048k);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeRootWith(Object result) {
        int i7 = this.lastSuspensionIndex;
        if (i7 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        c<TSubject> cVar = this.suspensions[i7];
        l.c(cVar);
        c<TSubject>[] cVarArr = this.suspensions;
        int i8 = this.lastSuspensionIndex;
        this.lastSuspensionIndex = i8 - 1;
        cVarArr[i8] = null;
        if (!(result instanceof n)) {
            cVar.resumeWith(result);
            return;
        }
        Throwable thA = O3.o.a(result);
        l.c(thA);
        cVar.resumeWith(r.r(StackTraceRecoverKt.recoverStackTraceBridge(thA, cVar)));
    }

    public final void addContinuation$ktor_utils(c<? super TSubject> continuation) {
        l.f("continuation", continuation);
        c<TSubject>[] cVarArr = this.suspensions;
        int i7 = this.lastSuspensionIndex + 1;
        this.lastSuspensionIndex = i7;
        cVarArr[i7] = continuation;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object execute$ktor_utils(TSubject tsubject, c<? super TSubject> cVar) {
        this.index = 0;
        if (this.blocks.size() == 0) {
            return tsubject;
        }
        setSubject(tsubject);
        if (this.lastSuspensionIndex < 0) {
            return proceed(cVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void finish() {
        this.index = this.blocks.size();
    }

    public final c<C> getContinuation$ktor_utils() {
        return this.continuation;
    }

    @Override // io.ktor.util.pipeline.PipelineContext, H5.A
    public h getCoroutineContext() {
        return this.continuation.getContext();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public TSubject getSubject() {
        return this.subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceed(c<? super TSubject> cVar) {
        Object subject;
        if (this.index == this.blocks.size()) {
            subject = getSubject();
        } else {
            addContinuation$ktor_utils(r.E(cVar));
            if (loop(true)) {
                discardLastRootContinuation();
                subject = getSubject();
            } else {
                subject = a.f9048k;
            }
        }
        if (subject == a.f9048k) {
            l.f("frame", cVar);
        }
        return subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceedWith(TSubject tsubject, c<? super TSubject> cVar) {
        setSubject(tsubject);
        return proceed(cVar);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void setSubject(TSubject tsubject) {
        l.f("<set-?>", tsubject);
        this.subject = tsubject;
    }
}
