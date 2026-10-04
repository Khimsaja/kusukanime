package kotlin.jvm.internal;

import java.util.Collections;
import l4.C1447z;
import l4.InterfaceC1444w;
import o4.B0;

/* loaded from: classes.dex */
public abstract class y {
    public static final z a;

    static {
        z zVar = null;
        try {
            zVar = (z) B0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (zVar == null) {
            zVar = new z();
        }
        a = zVar;
    }

    public static InterfaceC1444w a(Class cls) {
        z zVar = a;
        return zVar.l(zVar.b(cls), Collections.EMPTY_LIST, false);
    }

    public static InterfaceC1444w b(Class cls, C1447z c1447z) {
        z zVar = a;
        return zVar.l(zVar.b(cls), Collections.singletonList(c1447z), false);
    }

    public static InterfaceC1444w c(Class cls, C1447z... c1447zArr) {
        z zVar = a;
        return zVar.l(zVar.b(cls), P3.m.u0(c1447zArr), false);
    }
}
