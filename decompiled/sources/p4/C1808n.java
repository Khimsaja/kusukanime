package p4;

import java.lang.reflect.Field;

/* renamed from: p4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1808n extends AbstractC1811q implements InterfaceC1800f {

    /* renamed from: f, reason: collision with root package name */
    public final Object f14388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808n(Field field, boolean z7, Object obj) {
        super(field, z7, false);
        kotlin.jvm.internal.l.f("field", field);
        this.f14388f = obj;
    }

    @Override // p4.AbstractC1811q, p4.InterfaceC1801g
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        ((Field) this.a).set(this.f14388f, P3.m.h0(objArr));
        return O3.C.a;
    }
}
