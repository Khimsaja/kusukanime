package B6;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final z6.a f550b;

    public c(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.f550b = new f();
                new ConcurrentHashMap();
                new ThreadLocal();
                new a();
                break;
            default:
                this.f550b = new A.e(4);
                new ConcurrentHashMap();
                break;
        }
    }
}
