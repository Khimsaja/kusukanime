package M1;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class j implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ B2.l a;

    public j(B2.l lVar) {
        this.a = lVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((k) this.a.f417m).getClass();
        return bundle;
    }
}
