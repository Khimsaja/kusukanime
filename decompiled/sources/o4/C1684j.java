package o4;

import e5.AbstractC0832b;
import f.AbstractC0847h;
import java.lang.reflect.Method;

/* renamed from: o4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1684j extends AbstractC0847h {
    public final Method a;

    public C1684j(Method method) {
        kotlin.jvm.internal.l.f("method", method);
        this.a = method;
    }

    @Override // f.AbstractC0847h
    public final String h() {
        return AbstractC0832b.f(this.a);
    }
}
