package androidx.media;

import b1.AbstractC0703b;
import io.ktor.util.GzipHeaderFlags;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f10754b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f10755c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f10756d = -1;

    public final boolean equals(Object obj) {
        int i7;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f10754b == audioAttributesImplBase.f10754b) {
            int i8 = this.f10755c;
            int i9 = audioAttributesImplBase.f10755c;
            int i10 = audioAttributesImplBase.f10756d;
            if (i10 == -1) {
                int i11 = audioAttributesImplBase.a;
                int i12 = AudioAttributesCompat.f10752b;
                if ((i9 & 1) != 1) {
                    if ((i9 & 4) != 4) {
                        switch (i11) {
                            case 2:
                                i7 = 0;
                                break;
                            case 3:
                                i7 = 8;
                                break;
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                i7 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i7 = 5;
                                break;
                            case 6:
                                i7 = 2;
                                break;
                            case 11:
                                i7 = 10;
                                break;
                            case 12:
                            default:
                                i7 = 3;
                                break;
                            case 13:
                                i7 = 1;
                                break;
                        }
                    } else {
                        i7 = 6;
                    }
                } else {
                    i7 = 7;
                }
            } else {
                i7 = i10;
            }
            if (i7 == 6) {
                i9 |= 4;
            } else if (i7 == 7) {
                i9 |= 1;
            }
            if (i8 == (i9 & 273) && this.a == audioAttributesImplBase.a && this.f10756d == i10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10754b), Integer.valueOf(this.f10755c), Integer.valueOf(this.a), Integer.valueOf(this.f10756d)});
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f10756d != -1) {
            sb.append(" stream=");
            sb.append(this.f10756d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i7 = this.a;
        int i8 = AudioAttributesCompat.f10752b;
        switch (i7) {
            case 0:
                strG = "USAGE_UNKNOWN";
                break;
            case 1:
                strG = "USAGE_MEDIA";
                break;
            case 2:
                strG = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strG = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                strG = "USAGE_ALARM";
                break;
            case 5:
                strG = "USAGE_NOTIFICATION";
                break;
            case 6:
                strG = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strG = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strG = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strG = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strG = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strG = "USAGE_GAME";
                break;
            case 15:
            default:
                strG = AbstractC0703b.g(i7, "unknown usage ");
                break;
            case 16:
                strG = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strG);
        sb.append(" content=");
        sb.append(this.f10754b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f10755c).toUpperCase());
        return sb.toString();
    }
}
