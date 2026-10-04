package M1;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e extends Handler {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Looper looper) {
        super(looper);
        this.a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        g gVar = this.a;
        gVar.getClass();
        int i7 = message.what;
        f fVar = null;
        if (i7 == 1) {
            f fVar2 = (f) message.obj;
            try {
                gVar.a.queueInputBuffer(fVar2.a, 0, fVar2.f6431b, fVar2.f6433d, fVar2.f6434e);
            } catch (RuntimeException e7) {
                AtomicReference atomicReference = gVar.f6439d;
                while (!atomicReference.compareAndSet(null, e7) && atomicReference.get() == null) {
                }
            }
            fVar = fVar2;
        } else if (i7 == 2) {
            f fVar3 = (f) message.obj;
            int i8 = fVar3.a;
            MediaCodec.CryptoInfo cryptoInfo = fVar3.f6432c;
            long j7 = fVar3.f6433d;
            int i9 = fVar3.f6434e;
            try {
                synchronized (g.f6436h) {
                    gVar.a.queueSecureInputBuffer(i8, 0, cryptoInfo, j7, i9);
                }
            } catch (RuntimeException e8) {
                AtomicReference atomicReference2 = gVar.f6439d;
                while (!atomicReference2.compareAndSet(null, e8) && atomicReference2.get() == null) {
                }
            }
            fVar = fVar3;
        } else if (i7 == 3) {
            gVar.f6440e.d();
        } else if (i7 != 4) {
            AtomicReference atomicReference3 = gVar.f6439d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                gVar.a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e9) {
                AtomicReference atomicReference4 = gVar.f6439d;
                while (!atomicReference4.compareAndSet(null, e9) && atomicReference4.get() == null) {
                }
            }
        }
        if (fVar != null) {
            ArrayDeque arrayDeque = g.f6435g;
            synchronized (arrayDeque) {
                arrayDeque.add(fVar);
            }
        }
    }
}
