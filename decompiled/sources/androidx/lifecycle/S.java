package androidx.lifecycle;

import e5.AbstractC0832b;
import l4.InterfaceC1425d;
import v1.C2149c;

/* loaded from: classes.dex */
public class S implements Q {
    public static S a;

    @Override // androidx.lifecycle.Q
    public O a(Class cls) {
        return AbstractC0832b.p(cls);
    }

    @Override // androidx.lifecycle.Q
    public O b(Class cls, C2149c c2149c) {
        return a(cls);
    }

    @Override // androidx.lifecycle.Q
    public final O c(InterfaceC1425d interfaceC1425d, C2149c c2149c) {
        kotlin.jvm.internal.l.f("modelClass", interfaceC1425d);
        return b(n6.m.F(interfaceC1425d), c2149c);
    }
}
