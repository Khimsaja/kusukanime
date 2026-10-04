package o4;

import e5.AbstractC0832b;
import f1.AbstractC0870c;
import java.lang.reflect.Method;

/* renamed from: o4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1688n extends AbstractC0870c {
    public final Method a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f13719b;

    public C1688n(Method method, Method method2) {
        kotlin.jvm.internal.l.f("getterMethod", method);
        this.a = method;
        this.f13719b = method2;
    }

    @Override // f1.AbstractC0870c
    public final String G() {
        return AbstractC0832b.f(this.a);
    }
}
