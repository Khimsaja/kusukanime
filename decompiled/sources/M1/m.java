package M1;

import C2.C0034g;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface m {
    ByteBuffer B0(int i7);

    void I(int i7);

    void K0(int i7, long j7);

    int L0();

    void a();

    MediaFormat a0();

    void b(int i7, int i8, int i9, long j7);

    void c(int i7, G1.b bVar, long j7, int i8);

    void e(Bundle bundle);

    void flush();

    int h(MediaCodec.BufferInfo bufferInfo);

    void n(T1.h hVar, Handler handler);

    void n0();

    void o(int i7);

    ByteBuffer o0(int i7);

    void r0(Surface surface);

    default boolean s(C0034g c0034g) {
        return false;
    }
}
