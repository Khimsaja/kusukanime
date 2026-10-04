package androidx.lifecycle;

import l4.InterfaceC1425d;
import v1.C2149c;

/* loaded from: classes.dex */
public interface Q {
    default O a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default O b(Class cls, C2149c c2149c) {
        return a(cls);
    }

    default O c(InterfaceC1425d interfaceC1425d, C2149c c2149c) {
        kotlin.jvm.internal.l.f("modelClass", interfaceC1425d);
        return b(n6.m.F(interfaceC1425d), c2149c);
    }
}
