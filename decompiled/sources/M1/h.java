package M1;

import C2.C0034g;
import H1.H;
import K2.C0311o;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class h extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f6442b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f6443c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f6448h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f6449i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f6450j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f6451k;

    /* renamed from: l, reason: collision with root package name */
    public long f6452l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6453m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f6454n;

    /* renamed from: o, reason: collision with root package name */
    public C0034g f6455o;
    public final Object a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C0311o f6444d = new C0311o();

    /* renamed from: e, reason: collision with root package name */
    public final C0311o f6445e = new C0311o();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f6446f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f6447g = new ArrayDeque();

    public h(HandlerThread handlerThread) {
        this.f6442b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f6447g;
        if (!arrayDeque.isEmpty()) {
            this.f6449i = (MediaFormat) arrayDeque.getLast();
        }
        C0311o c0311o = this.f6444d;
        c0311o.f4651c = c0311o.f4650b;
        C0311o c0311o2 = this.f6445e;
        c0311o2.f4651c = c0311o2.f4650b;
        this.f6446f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.f6451k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.f6450j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        H h7;
        synchronized (this.a) {
            this.f6444d.a(i7);
            C0034g c0034g = this.f6455o;
            if (c0034g != null && (h7 = ((s) c0034g.f741l).f6501P) != null) {
                h7.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        H h7;
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.f6449i;
                if (mediaFormat != null) {
                    this.f6445e.a(-2);
                    this.f6447g.add(mediaFormat);
                    this.f6449i = null;
                }
                this.f6445e.a(i7);
                this.f6446f.add(bufferInfo);
                C0034g c0034g = this.f6455o;
                if (c0034g != null && (h7 = ((s) c0034g.f741l).f6501P) != null) {
                    h7.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.f6445e.a(-2);
            this.f6447g.add(mediaFormat);
            this.f6449i = null;
        }
    }
}
