package o4;

import f.AbstractC0847h;
import java.lang.reflect.Constructor;

/* renamed from: o4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1683i extends AbstractC0847h {
    public final Constructor a;

    public C1683i(Constructor constructor) {
        kotlin.jvm.internal.l.f("constructor", constructor);
        this.a = constructor;
    }

    @Override // f.AbstractC0847h
    public final String h() {
        Class<?>[] parameterTypes = this.a.getParameterTypes();
        kotlin.jvm.internal.l.e("getParameterTypes(...)", parameterTypes);
        return P3.m.n0(parameterTypes, "", "<init>(", ")V", C1672c.f13687r, 24);
    }
}
