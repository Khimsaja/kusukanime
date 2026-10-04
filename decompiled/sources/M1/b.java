package M1;

import B1.K;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T1.h f6421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f6422c;

    public /* synthetic */ b(m mVar, T1.h hVar, int i7) {
        this.a = i7;
        this.f6422c = mVar;
        this.f6421b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
        switch (this.a) {
            case 0:
                ((d) this.f6422c).getClass();
                T1.h hVar = this.f6421b;
                hVar.getClass();
                if (K.a >= 30) {
                    hVar.a(j7);
                    break;
                } else {
                    Handler handler = hVar.f8877k;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j7 >> 32), (int) j7));
                    break;
                }
            default:
                ((L2.e) this.f6422c).getClass();
                T1.h hVar2 = this.f6421b;
                hVar2.getClass();
                if (K.a >= 30) {
                    hVar2.a(j7);
                    break;
                } else {
                    Handler handler2 = hVar2.f8877k;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j7 >> 32), (int) j7));
                    break;
                }
        }
    }
}
