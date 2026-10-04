package S1;

import I1.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f8725k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f8726l;

    public a(ExecutorService executorService, e eVar) {
        this.f8725k = executorService;
        this.f8726l = eVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8725k.execute(runnable);
    }
}
