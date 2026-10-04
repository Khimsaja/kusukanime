package z1;

import B1.K;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2483a implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f18944b;

    public C2483a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f18944b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        int i7 = K.a;
        this.a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        K.I(this.a, new F.h(i7, 2, this));
    }
}
