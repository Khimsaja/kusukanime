package w6;

import b1.AbstractC0703b;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class m implements H {

    /* renamed from: k, reason: collision with root package name */
    public final u f17161k;

    /* renamed from: l, reason: collision with root package name */
    public long f17162l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17163m;

    public m(u uVar, long j7) {
        kotlin.jvm.internal.l.f("fileHandle", uVar);
        this.f17161k = uVar;
        this.f17162l = j7;
    }

    @Override // w6.H
    public final long F(C2224i c2224i, long j7) {
        long j8;
        long j9;
        int i7;
        kotlin.jvm.internal.l.f("sink", c2224i);
        if (this.f17163m) {
            throw new IllegalStateException("closed");
        }
        u uVar = this.f17161k;
        long j10 = this.f17162l;
        uVar.getClass();
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
        }
        long j11 = j7 + j10;
        long j12 = j10;
        while (true) {
            if (j12 >= j11) {
                j8 = -1;
                break;
            }
            D dD0 = c2224i.d0(1);
            byte[] bArr = dD0.a;
            int i8 = dD0.f17117c;
            j8 = -1;
            int iMin = (int) Math.min(j11 - j12, 8192 - i8);
            synchronized (uVar) {
                kotlin.jvm.internal.l.f("array", bArr);
                uVar.f17187n.seek(j12);
                i7 = 0;
                while (true) {
                    if (i7 >= iMin) {
                        break;
                    }
                    int i9 = uVar.f17187n.read(bArr, i8, iMin - i7);
                    if (i9 != -1) {
                        i7 += i9;
                    } else if (i7 == 0) {
                        i7 = -1;
                    }
                }
            }
            if (i7 == -1) {
                if (dD0.f17116b == dD0.f17117c) {
                    c2224i.f17155k = dD0.a();
                    E.a(dD0);
                }
                if (j10 == j12) {
                    j9 = -1;
                }
            } else {
                dD0.f17117c += i7;
                long j13 = i7;
                j12 += j13;
                c2224i.f17156l += j13;
            }
        }
        j9 = j12 - j10;
        if (j9 != j8) {
            this.f17162l += j9;
        }
        return j9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17163m) {
            return;
        }
        this.f17163m = true;
        u uVar = this.f17161k;
        ReentrantLock reentrantLock = uVar.f17186m;
        reentrantLock.lock();
        try {
            int i7 = uVar.f17185l - 1;
            uVar.f17185l = i7;
            if (i7 == 0) {
                if (uVar.f17184k) {
                    synchronized (uVar) {
                        uVar.f17187n.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // w6.H
    public final J d() {
        return J.f17126d;
    }
}
