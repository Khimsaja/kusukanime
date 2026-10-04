package kotlinx.serialization.descriptors;

import P3.y;
import java.util.List;
import n6.d;

/* loaded from: classes.dex */
public interface SerialDescriptor {
    d c();

    int d(String str);

    String e();

    int f();

    String g(int i7);

    default List getAnnotations() {
        return y.f7779k;
    }

    default boolean h() {
        return false;
    }

    List i(int i7);

    default boolean isInline() {
        return false;
    }

    SerialDescriptor j(int i7);

    boolean k(int i7);
}
