package j6;

import f6.InterfaceC0909g;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import n6.o;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0909g f12504k;

    /* renamed from: l, reason: collision with root package name */
    public volatile AtomicInteger f12505l = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f12506m;

    public f(i iVar, InterfaceC0909g interfaceC0909g) {
        this.f12506m = iVar;
        this.f12504k = interfaceC0909g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A2.b bVar;
        String strConcat = "OkHttp ".concat(this.f12506m.f12510l.a.g());
        i iVar = this.f12506m;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            iVar.f12513o.i();
            boolean z7 = false;
            try {
                try {
                } catch (Throwable th) {
                    iVar.f12509k.f11447k.s(this);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f12504k.onResponse(iVar, iVar.g());
                bVar = iVar.f12509k.f11447k;
            } catch (IOException e8) {
                e = e8;
                z7 = true;
                if (z7) {
                    o oVar = o.a;
                    o oVar2 = o.a;
                    String str = "Callback failure for " + i.a(iVar);
                    oVar2.getClass();
                    o.i(str, 4, e);
                } else {
                    this.f12504k.onFailure(iVar, e);
                }
                bVar = iVar.f12509k.f11447k;
                bVar.s(this);
            } catch (Throwable th3) {
                th = th3;
                z7 = true;
                iVar.cancel();
                if (!z7) {
                    IOException iOException = new IOException("canceled due to " + th);
                    q0.c.j(iOException, th);
                    this.f12504k.onFailure(iVar, iOException);
                }
                throw th;
            }
            bVar.s(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
