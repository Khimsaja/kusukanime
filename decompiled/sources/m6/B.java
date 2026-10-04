package m6;

import b1.AbstractC0703b;
import io.ktor.util.GzipHeaderFlags;
import java.io.IOException;

/* loaded from: classes.dex */
public final class B extends IOException {

    /* renamed from: k, reason: collision with root package name */
    public final int f12995k;

    /* JADX WARN: Illegal instructions before constructor call */
    public B(int i7) {
        String str;
        AbstractC0703b.w(i7, "errorCode");
        switch (i7) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "SETTINGS_TIMEOUT";
                break;
            case 6:
                str = "STREAM_CLOSED";
                break;
            case 7:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case 9:
                str = "CANCEL";
                break;
            case 10:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case 12:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 13:
                str = "INADEQUATE_SECURITY";
                break;
            case 14:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        super("stream was reset: ".concat(str));
        this.f12995k = i7;
    }
}
