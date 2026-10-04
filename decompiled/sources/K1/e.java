package K1;

import B1.InterfaceC0021h;
import B1.K;
import B1.RunnableC0016c;
import O1.B;
import O1.G;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class e {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final B f4459b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f4460c;

    public /* synthetic */ e(CopyOnWriteArrayList copyOnWriteArrayList, int i7, B b4) {
        this.f4460c = copyOnWriteArrayList;
        this.a = i7;
        this.f4459b = b4;
    }

    public void a(InterfaceC0021h interfaceC0021h) {
        Iterator it = this.f4460c.iterator();
        while (it.hasNext()) {
            G g4 = (G) it.next();
            K.I(g4.a, new RunnableC0016c(14, interfaceC0021h, g4.f7269b));
        }
    }
}
