package o4;

import f.AbstractC0847h;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: o4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1682h extends AbstractC0847h {
    public final List a;

    public C1682h(Class cls) throws SecurityException {
        kotlin.jvm.internal.l.f("jClass", cls);
        Method[] declaredMethods = cls.getDeclaredMethods();
        kotlin.jvm.internal.l.e("getDeclaredMethods(...)", declaredMethods);
        this.a = P3.m.s0(declaredMethods, new C1680g(0));
    }

    @Override // f.AbstractC0847h
    public final String h() {
        return P3.q.y0(this.a, "", "<init>(", ")V", C1672c.f13686q, 24);
    }
}
