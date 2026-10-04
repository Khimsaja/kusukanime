package J1;

import B1.K;
import C2.C0034g;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* renamed from: J1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287c extends AudioDeviceCallback {
    public final /* synthetic */ C0289e a;

    public C0287c(C0289e c0289e) {
        this.a = c0289e;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0289e c0289e = this.a;
        c0289e.a(C0286b.c(c0289e.a, c0289e.f4196i, c0289e.f4195h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0289e c0289e = this.a;
        C0034g c0034g = c0289e.f4195h;
        int i7 = K.a;
        int length = audioDeviceInfoArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i8], c0034g)) {
                c0289e.f4195h = null;
                break;
            }
            i8++;
        }
        c0289e.a(C0286b.c(c0289e.a, c0289e.f4196i, c0289e.f4195h));
    }
}
