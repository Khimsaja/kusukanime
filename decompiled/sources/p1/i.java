package p1;

import f.AbstractC0847h;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class i extends AbstractC0847h {
    public final /* synthetic */ AbstractC0847h a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f14179b;

    public i(AbstractC0847h abstractC0847h, ThreadPoolExecutor threadPoolExecutor) {
        this.a = abstractC0847h;
        this.f14179b = threadPoolExecutor;
    }

    @Override // f.AbstractC0847h
    public final void t(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f14179b;
        try {
            this.a.t(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // f.AbstractC0847h
    public final void u(A2.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f14179b;
        try {
            this.a.u(bVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
