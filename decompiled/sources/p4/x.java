package p4;

import D4.S;
import f6.AbstractC0915m;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x implements InterfaceC1801g {
    public final Member a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f14397b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f14398c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14399d;

    public x(Member member, Type type, Class cls, Type[] typeArr) {
        List listU0;
        this.a = member;
        this.f14397b = type;
        this.f14398c = cls;
        if (cls != null) {
            S s7 = new S(2);
            s7.g(cls);
            s7.j(typeArr);
            ArrayList arrayList = s7.f1530k;
            listU0 = P3.r.I(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listU0 = P3.m.u0(typeArr);
        }
        this.f14399d = listU0;
    }

    @Override // p4.InterfaceC1801g
    public final List a() {
        return this.f14399d;
    }

    @Override // p4.InterfaceC1801g
    public final Member b() {
        return this.a;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ boolean c() {
        return false;
    }

    public void d(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        if (AbstractC0915m.r(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + AbstractC0915m.r(this) + " arguments, but " + objArr.length + " were provided.");
    }

    public final void e(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // p4.InterfaceC1801g
    public final Type getReturnType() {
        return this.f14397b;
    }
}
