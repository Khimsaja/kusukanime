package z1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface g {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    boolean b();

    void c();

    boolean d();

    void e(ByteBuffer byteBuffer);

    e f(e eVar);

    void flush();

    void reset();
}
