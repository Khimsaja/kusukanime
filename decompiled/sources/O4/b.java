package O4;

import java.util.Map;
import n5.AbstractC1586x;
import u4.InterfaceC2099e;
import u4.M;
import v4.InterfaceC2154b;

/* loaded from: classes.dex */
public final class b implements InterfaceC2154b {
    public static final b a = new b();

    @Override // v4.InterfaceC2154b
    public final W4.c a() {
        InterfaceC2099e interfaceC2099eD = d5.e.d(this);
        if (interfaceC2099eD != null) {
            if (p5.l.f(interfaceC2099eD)) {
                interfaceC2099eD = null;
            }
            if (interfaceC2099eD != null) {
                return d5.e.c(interfaceC2099eD);
            }
        }
        return null;
    }

    @Override // v4.InterfaceC2154b
    public final Map b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // v4.InterfaceC2154b
    public final AbstractC1586x getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // v4.InterfaceC2154b
    public final M l() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
