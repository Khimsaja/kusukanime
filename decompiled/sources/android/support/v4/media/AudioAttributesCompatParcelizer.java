package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(Q2.a aVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(aVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, Q2.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, aVar);
    }
}
