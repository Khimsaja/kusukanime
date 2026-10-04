package M1;

import B1.C0020g;
import B1.K;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f6435g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f6436h = new Object();
    public final MediaCodec a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f6437b;

    /* renamed from: c, reason: collision with root package name */
    public e f6438c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f6439d;

    /* renamed from: e, reason: collision with root package name */
    public final C0020g f6440e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6441f;

    public g(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C0020g c0020g = new C0020g();
        this.a = mediaCodec;
        this.f6437b = handlerThread;
        this.f6440e = c0020g;
        this.f6439d = new AtomicReference();
    }

    public static f f() {
        ArrayDeque arrayDeque = f6435g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new f();
                }
                return (f) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M1.n
    public final void a() {
        if (this.f6441f) {
            flush();
            this.f6437b.quit();
        }
        this.f6441f = false;
    }

    @Override // M1.n
    public final void b(int i7, int i8, int i9, long j7) {
        d();
        f fVarF = f();
        fVarF.a = i7;
        fVarF.f6431b = i8;
        fVarF.f6433d = j7;
        fVarF.f6434e = i9;
        e eVar = this.f6438c;
        int i10 = K.a;
        eVar.obtainMessage(1, fVarF).sendToTarget();
    }

    @Override // M1.n
    public final void c(int i7, G1.b bVar, long j7, int i8) {
        d();
        f fVarF = f();
        fVarF.a = i7;
        fVarF.f6431b = 0;
        fVarF.f6433d = j7;
        fVarF.f6434e = i8;
        int i9 = bVar.f2602f;
        MediaCodec.CryptoInfo cryptoInfo = fVarF.f6432c;
        cryptoInfo.numSubSamples = i9;
        int[] iArr = bVar.f2600d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = bVar.f2601e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = bVar.f2598b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = bVar.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = bVar.f2599c;
        if (K.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f2603g, bVar.f2604h));
        }
        this.f6438c.obtainMessage(2, fVarF).sendToTarget();
    }

    @Override // M1.n
    public final void d() {
        RuntimeException runtimeException = (RuntimeException) this.f6439d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // M1.n
    public final void e(Bundle bundle) {
        d();
        e eVar = this.f6438c;
        int i7 = K.a;
        eVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // M1.n
    public final void flush() {
        if (this.f6441f) {
            try {
                e eVar = this.f6438c;
                eVar.getClass();
                eVar.removeCallbacksAndMessages(null);
                C0020g c0020g = this.f6440e;
                synchronized (c0020g) {
                    c0020g.f328b = false;
                }
                e eVar2 = this.f6438c;
                eVar2.getClass();
                eVar2.obtainMessage(3).sendToTarget();
                synchronized (c0020g) {
                    while (!c0020g.f328b) {
                        c0020g.wait();
                    }
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // M1.n
    public final void start() {
        if (this.f6441f) {
            return;
        }
        HandlerThread handlerThread = this.f6437b;
        handlerThread.start();
        this.f6438c = new e(this, handlerThread.getLooper());
        this.f6441f = true;
    }
}
