package w6;

import java.util.concurrent.locks.ReentrantLock;
import p.I0;

/* renamed from: w6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2218c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C2221f c2221fQ;
        while (true) {
            try {
                F5.o oVar = C2221f.f17139h;
                reentrantLock = C2221f.f17141j;
                reentrantLock.lock();
                try {
                    c2221fQ = I0.q();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c2221fQ == C2221f.f17140i) {
                C2221f.f17140i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c2221fQ != null) {
                    c2221fQ.k();
                }
            }
        }
    }
}
