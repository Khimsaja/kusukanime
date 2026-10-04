package M1;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements i3.h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6423k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6424l;

    public /* synthetic */ c(int i7, int i8) {
        this.f6423k = i8;
        this.f6424l = i7;
    }

    @Override // i3.h
    public final Object get() {
        switch (this.f6423k) {
            case 0:
                return new HandlerThread(d.g(this.f6424l, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(d.g(this.f6424l, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
