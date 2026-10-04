package M1;

import B1.AbstractC0015b;
import B1.K;
import C2.C0034g;
import K2.C0311o;
import O.C0517t;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.HashSet;
import y0.U;
import y0.V;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: k, reason: collision with root package name */
    public int f6425k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6426l;

    /* renamed from: m, reason: collision with root package name */
    public Object f6427m;

    /* renamed from: n, reason: collision with root package name */
    public Object f6428n;

    /* renamed from: o, reason: collision with root package name */
    public Object f6429o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f6430p;

    public d(MediaCodec mediaCodec, HandlerThread handlerThread, n nVar, B2.l lVar) {
        this.f6427m = mediaCodec;
        this.f6428n = new h(handlerThread);
        this.f6429o = nVar;
        this.f6430p = lVar;
        this.f6425k = 0;
    }

    public static void d(d dVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        B2.l lVar;
        LoudnessCodecController loudnessCodecController;
        h hVar = (h) dVar.f6428n;
        AbstractC0015b.h(hVar.f6443c == null);
        HandlerThread handlerThread = hVar.f6442b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) dVar.f6427m;
        mediaCodec.setCallback(hVar, handler);
        hVar.f6443c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        ((n) dVar.f6429o).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (K.a >= 35 && (lVar = (B2.l) dVar.f6430p) != null && ((loudnessCodecController = (LoudnessCodecController) lVar.f418n) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            AbstractC0015b.h(((HashSet) lVar.f416l).add(mediaCodec));
        }
        dVar.f6425k = 1;
    }

    public static String g(int i7, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            sb.append("Audio");
        } else if (i7 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // M1.m
    public ByteBuffer B0(int i7) {
        return ((MediaCodec) this.f6427m).getOutputBuffer(i7);
    }

    @Override // M1.m
    public void I(int i7) {
        ((MediaCodec) this.f6427m).setVideoScalingMode(i7);
    }

    @Override // M1.m
    public void K0(int i7, long j7) {
        ((MediaCodec) this.f6427m).releaseOutputBuffer(i7, j7);
    }

    @Override // M1.m
    public int L0() {
        ((n) this.f6429o).d();
        h hVar = (h) this.f6428n;
        synchronized (hVar.a) {
            try {
                IllegalStateException illegalStateException = hVar.f6454n;
                if (illegalStateException != null) {
                    hVar.f6454n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = hVar.f6450j;
                if (codecException != null) {
                    hVar.f6450j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = hVar.f6451k;
                if (cryptoException != null) {
                    hVar.f6451k = null;
                    throw cryptoException;
                }
                int i7 = -1;
                if (hVar.f6452l > 0 || hVar.f6453m) {
                    return -1;
                }
                C0311o c0311o = hVar.f6444d;
                int i8 = c0311o.f4650b;
                int i9 = c0311o.f4651c;
                if (!(i8 == i9)) {
                    if (i8 == i9) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i7 = c0311o.a[i8];
                    c0311o.f4650b = (i8 + 1) & c0311o.f4652d;
                }
                return i7;
            } finally {
            }
        }
    }

    @Override // M1.m
    public void a() {
        B2.l lVar;
        B2.l lVar2;
        try {
            if (this.f6425k == 1) {
                ((n) this.f6429o).a();
                h hVar = (h) this.f6428n;
                synchronized (hVar.a) {
                    hVar.f6453m = true;
                    hVar.f6442b.quit();
                    hVar.a();
                }
            }
            this.f6425k = 2;
            if (this.f6426l) {
                return;
            }
            try {
                int i7 = K.a;
                if (i7 >= 30 && i7 < 33) {
                    ((MediaCodec) this.f6427m).stop();
                }
                if (i7 >= 35 && (lVar2 = (B2.l) this.f6430p) != null) {
                    lVar2.K((MediaCodec) this.f6427m);
                }
                ((MediaCodec) this.f6427m).release();
                this.f6426l = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f6426l) {
                try {
                    int i8 = K.a;
                    if (i8 >= 30 && i8 < 33) {
                        ((MediaCodec) this.f6427m).stop();
                    }
                    if (i8 >= 35 && (lVar = (B2.l) this.f6430p) != null) {
                        lVar.K((MediaCodec) this.f6427m);
                    }
                    ((MediaCodec) this.f6427m).release();
                    this.f6426l = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // M1.m
    public MediaFormat a0() {
        MediaFormat mediaFormat;
        h hVar = (h) this.f6428n;
        synchronized (hVar.a) {
            try {
                mediaFormat = hVar.f6448h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // M1.m
    public void b(int i7, int i8, int i9, long j7) {
        ((n) this.f6429o).b(i7, i8, i9, j7);
    }

    @Override // M1.m
    public void c(int i7, G1.b bVar, long j7, int i8) {
        ((n) this.f6429o).c(i7, bVar, j7, i8);
    }

    @Override // M1.m
    public void e(Bundle bundle) {
        ((n) this.f6429o).e(bundle);
    }

    public boolean f(int i7, int i8) {
        Q.d dVar = (Q.d) this.f6428n;
        int i9 = this.f6425k;
        a0.o oVar = (a0.o) dVar.f7827k[i7 + i9];
        a0.o oVar2 = (a0.o) ((Q.d) this.f6429o).f7827k[i9 + i8];
        U u5 = V.a;
        return kotlin.jvm.internal.l.a(oVar, oVar2) || oVar.getClass() == oVar2.getClass();
    }

    @Override // M1.m
    public void flush() {
        ((n) this.f6429o).flush();
        ((MediaCodec) this.f6427m).flush();
        h hVar = (h) this.f6428n;
        synchronized (hVar.a) {
            hVar.f6452l++;
            Handler handler = hVar.f6443c;
            int i7 = K.a;
            handler.post(new B1.w(10, hVar));
        }
        ((MediaCodec) this.f6427m).start();
    }

    @Override // M1.m
    public int h(MediaCodec.BufferInfo bufferInfo) {
        ((n) this.f6429o).d();
        h hVar = (h) this.f6428n;
        synchronized (hVar.a) {
            try {
                IllegalStateException illegalStateException = hVar.f6454n;
                if (illegalStateException != null) {
                    hVar.f6454n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = hVar.f6450j;
                if (codecException != null) {
                    hVar.f6450j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = hVar.f6451k;
                if (cryptoException != null) {
                    hVar.f6451k = null;
                    throw cryptoException;
                }
                if (hVar.f6452l > 0 || hVar.f6453m) {
                    return -1;
                }
                C0311o c0311o = hVar.f6445e;
                int i7 = c0311o.f4650b;
                int i8 = c0311o.f4651c;
                if (i7 == i8) {
                    return -1;
                }
                if (i7 == i8) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i9 = c0311o.a[i7];
                c0311o.f4650b = c0311o.f4652d & (i7 + 1);
                if (i9 >= 0) {
                    AbstractC0015b.i(hVar.f6448h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) hVar.f6446f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i9 == -2) {
                    hVar.f6448h = (MediaFormat) hVar.f6447g.remove();
                }
                return i9;
            } finally {
            }
        }
    }

    @Override // M1.m
    public void n(T1.h hVar, Handler handler) {
        ((MediaCodec) this.f6427m).setOnFrameRenderedListener(new b(this, hVar, 0), handler);
    }

    @Override // M1.m
    public void n0() {
        ((MediaCodec) this.f6427m).detachOutputSurface();
    }

    @Override // M1.m
    public void o(int i7) {
        ((MediaCodec) this.f6427m).releaseOutputBuffer(i7, false);
    }

    @Override // M1.m
    public ByteBuffer o0(int i7) {
        return ((MediaCodec) this.f6427m).getInputBuffer(i7);
    }

    @Override // M1.m
    public void r0(Surface surface) {
        ((MediaCodec) this.f6427m).setOutputSurface(surface);
    }

    @Override // M1.m
    public boolean s(C0034g c0034g) {
        h hVar = (h) this.f6428n;
        synchronized (hVar.a) {
            hVar.f6455o = c0034g;
        }
        return true;
    }

    public d(C0517t c0517t, a0.p pVar, int i7, Q.d dVar, Q.d dVar2, boolean z7) {
        this.f6430p = c0517t;
        this.f6427m = pVar;
        this.f6425k = i7;
        this.f6428n = dVar;
        this.f6429o = dVar2;
        this.f6426l = z7;
    }
}
