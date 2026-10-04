package B1;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements ThreadFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f300b;

    public /* synthetic */ I(String str, int i7) {
        this.a = i7;
        this.f300b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, this.f300b);
            default:
                Thread thread = new Thread(runnable, this.f300b);
                thread.setPriority(10);
                return thread;
        }
    }
}
