package B1;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x {
    public final WeakReference a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f365c;

    public x(z zVar, R1.g gVar, Executor executor) {
        this.f365c = zVar;
        this.a = new WeakReference(gVar);
        this.f364b = executor;
    }
}
