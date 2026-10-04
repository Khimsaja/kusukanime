package androidx.media;

import Q2.a;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) aVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.f10753b = aVar.f(audioAttributesImplApi21.f10753b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.a, 1);
        aVar.j(audioAttributesImplApi21.f10753b, 2);
    }
}
