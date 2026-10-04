package J1;

import B1.K;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import y1.C2381c;

/* loaded from: classes.dex */
public final class B {
    public static final B a = new B();

    /* renamed from: b, reason: collision with root package name */
    public static final B f4140b = new B();

    public static AudioAttributes b(C2381c c2381c, boolean z7) {
        return z7 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c2381c.a().f14298b;
    }

    public static int c(int i7) {
        if (i7 == 20) {
            return 63750;
        }
        if (i7 == 30) {
            return 2250000;
        }
        switch (i7) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i7) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public AudioTrack a(k kVar, C2381c c2381c, int i7) {
        int i8 = K.a;
        boolean z7 = kVar.a;
        int i9 = kVar.f4208b;
        int i10 = kVar.f4211e;
        int i11 = kVar.f4209c;
        if (i8 < 23) {
            return new AudioTrack(b(c2381c, z7), K.o(i11, i10, i9), kVar.f4212f, 1, i7);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(c2381c, z7)).setAudioFormat(K.o(i11, i10, i9)).setTransferMode(1).setBufferSizeInBytes(kVar.f4212f).setSessionId(i7);
        if (i8 >= 29) {
            sessionId.setOffloadedPlayback(kVar.f4210d);
        }
        return sessionId.build();
    }
}
