package io.ktor.util.pipeline;

import O3.C;
import O3.n;
import O3.o;
import P3.r;
import S3.c;
import S3.h;
import U3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0015\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"io/ktor/util/pipeline/SuspendFunctionGun$continuation$1", "LS3/c;", "LO3/C;", "LU3/d;", "Lio/ktor/util/CoroutineStackFrame;", "peekContinuation", "()LS3/c;", "Ljava/lang/StackTraceElement;", "Lio/ktor/util/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "LO3/o;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "currentIndex", "I", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "getCallerFrame", "()LU3/d;", "callerFrame", "LS3/h;", "getContext", "()LS3/h;", "context", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendFunctionGun$continuation$1 implements c<C>, d {
    private int currentIndex = Integer.MIN_VALUE;
    final /* synthetic */ SuspendFunctionGun<TSubject, TContext> this$0;

    public SuspendFunctionGun$continuation$1(SuspendFunctionGun<TSubject, TContext> suspendFunctionGun) {
        this.this$0 = suspendFunctionGun;
    }

    private final c<?> peekContinuation() {
        if (this.currentIndex == Integer.MIN_VALUE) {
            this.currentIndex = ((SuspendFunctionGun) this.this$0).lastSuspensionIndex;
        }
        if (this.currentIndex < 0) {
            this.currentIndex = Integer.MIN_VALUE;
            return null;
        }
        try {
            c<?>[] cVarArr = ((SuspendFunctionGun) this.this$0).suspensions;
            int i7 = this.currentIndex;
            c<?> cVar = cVarArr[i7];
            if (cVar == null) {
                return StackWalkingFailedFrame.INSTANCE;
            }
            this.currentIndex = i7 - 1;
            return cVar;
        } catch (Throwable unused) {
            return StackWalkingFailedFrame.INSTANCE;
        }
    }

    @Override // U3.d
    public d getCallerFrame() {
        c<?> cVarPeekContinuation = peekContinuation();
        if (cVarPeekContinuation instanceof d) {
            return (d) cVarPeekContinuation;
        }
        return null;
    }

    @Override // S3.c
    public h getContext() {
        c cVar = ((SuspendFunctionGun) this.this$0).suspensions[((SuspendFunctionGun) this.this$0).lastSuspensionIndex];
        if (cVar != this && cVar != null) {
            return cVar.getContext();
        }
        int i7 = ((SuspendFunctionGun) this.this$0).lastSuspensionIndex - 1;
        while (i7 >= 0) {
            int i8 = i7 - 1;
            c cVar2 = ((SuspendFunctionGun) this.this$0).suspensions[i7];
            if (cVar2 != this && cVar2 != null) {
                return cVar2.getContext();
            }
            i7 = i8;
        }
        throw new IllegalStateException("Not started");
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // S3.c
    public void resumeWith(Object result) {
        if (!(result instanceof n)) {
            this.this$0.loop(false);
            return;
        }
        SuspendFunctionGun<TSubject, TContext> suspendFunctionGun = this.this$0;
        Throwable thA = o.a(result);
        l.c(thA);
        suspendFunctionGun.resumeRootWith(r.r(thA));
    }

    public final void setCurrentIndex(int i7) {
        this.currentIndex = i7;
    }
}
