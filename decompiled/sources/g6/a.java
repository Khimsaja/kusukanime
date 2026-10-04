package g6;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11771b;

    public /* synthetic */ a(String str, boolean z7) {
        this.a = str;
        this.f11771b = z7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a;
        l.f("$name", str);
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f11771b);
        return thread;
    }
}
