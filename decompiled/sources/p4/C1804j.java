package p4;

import java.lang.reflect.Field;

/* renamed from: p4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1804j extends AbstractC1807m implements InterfaceC1800f {

    /* renamed from: e, reason: collision with root package name */
    public final Object f14386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804j(Field field, Object obj) {
        super(field, false);
        kotlin.jvm.internal.l.f("field", field);
        this.f14386e = obj;
    }

    @Override // p4.AbstractC1807m, p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        return ((Field) this.a).get(this.f14386e);
    }
}
