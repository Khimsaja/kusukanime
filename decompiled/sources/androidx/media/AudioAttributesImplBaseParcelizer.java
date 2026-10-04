package androidx.media;

import Q2.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = aVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.f10754b = aVar.f(audioAttributesImplBase.f10754b, 2);
        audioAttributesImplBase.f10755c = aVar.f(audioAttributesImplBase.f10755c, 3);
        audioAttributesImplBase.f10756d = aVar.f(audioAttributesImplBase.f10756d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.a, 1);
        aVar.j(audioAttributesImplBase.f10754b, 2);
        aVar.j(audioAttributesImplBase.f10755c, 3);
        aVar.j(audioAttributesImplBase.f10756d, 4);
    }
}
