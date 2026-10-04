package M1;

import B1.K;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public class o extends G1.d {

    /* renamed from: k, reason: collision with root package name */
    public final int f6461k;

    public o(IllegalStateException illegalStateException, p pVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(pVar == null ? null : pVar.a);
        super(sb.toString(), illegalStateException);
        boolean z7 = illegalStateException instanceof MediaCodec.CodecException;
        this.f6461k = K.a >= 23 ? z7 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : K.s(z7 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
