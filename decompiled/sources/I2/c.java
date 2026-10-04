package I2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4019k;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4019k) {
            case 0:
                runnable.run();
                break;
        }
    }
}
