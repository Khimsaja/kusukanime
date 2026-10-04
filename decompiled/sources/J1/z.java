package J1;

import C2.C0034g;
import H1.H;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class z extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ B2.l a;

    public z(B2.l lVar) {
        this.a = lVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        A a;
        C0034g c0034g;
        H h7;
        if (audioTrack.equals(((A) this.a.f418n).f4135v) && (c0034g = (a = (A) this.a.f418n).f4131r) != null && a.f4101V && (h7 = ((C) c0034g.f741l).f6501P) != null) {
            h7.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((A) this.a.f418n).f4135v)) {
            ((A) this.a.f418n).f4100U = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        A a;
        C0034g c0034g;
        H h7;
        if (audioTrack.equals(((A) this.a.f418n).f4135v) && (c0034g = (a = (A) this.a.f418n).f4131r) != null && a.f4101V && (h7 = ((C) c0034g.f741l).f6501P) != null) {
            h7.a();
        }
    }
}
