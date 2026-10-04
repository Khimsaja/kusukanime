package p4;

import f6.AbstractC0915m;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: p4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1791A implements InterfaceC1801g {
    public final Method a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14355b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f14356c;

    public AbstractC1791A(Method method, List list) {
        this.a = method;
        this.f14355b = list;
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.l.e("getReturnType(...)", returnType);
        this.f14356c = returnType;
    }

    @Override // p4.InterfaceC1801g
    public final List a() {
        return this.f14355b;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ boolean c() {
        return false;
    }

    public final void d(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        if (AbstractC0915m.r(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + AbstractC0915m.r(this) + " arguments, but " + objArr.length + " were provided.");
    }

    @Override // p4.InterfaceC1801g
    public final Type getReturnType() {
        return this.f14356c;
    }
}
