package w6;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public boolean f17184k;

    /* renamed from: l, reason: collision with root package name */
    public int f17185l;

    /* renamed from: m, reason: collision with root package name */
    public final ReentrantLock f17186m = new ReentrantLock();

    /* renamed from: n, reason: collision with root package name */
    public final RandomAccessFile f17187n;

    public u(RandomAccessFile randomAccessFile) {
        this.f17187n = randomAccessFile;
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f17186m;
        reentrantLock.lock();
        try {
            if (this.f17184k) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f17187n.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f17186m;
        reentrantLock.lock();
        try {
            if (this.f17184k) {
                return;
            }
            this.f17184k = true;
            if (this.f17185l != 0) {
                return;
            }
            synchronized (this) {
                this.f17187n.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final m e(long j7) {
        ReentrantLock reentrantLock = this.f17186m;
        reentrantLock.lock();
        try {
            if (this.f17184k) {
                throw new IllegalStateException("closed");
            }
            this.f17185l++;
            reentrantLock.unlock();
            return new m(this, j7);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
