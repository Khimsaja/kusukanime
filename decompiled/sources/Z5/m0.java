package Z5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1425d;

/* loaded from: classes.dex */
public final class m0 extends r {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1425d f10343b;

    /* renamed from: c, reason: collision with root package name */
    public final C0627c f10344c;

    public m0(InterfaceC1425d interfaceC1425d, KSerializer kSerializer) {
        super(kSerializer);
        this.f10343b = interfaceC1425d;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        kotlin.jvm.internal.l.f("elementDesc", descriptor);
        this.f10344c = new C0627c(descriptor, 0);
    }

    @Override // Z5.AbstractC0623a
    public final Object a() {
        return new ArrayList();
    }

    @Override // Z5.AbstractC0623a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.l.f("<this>", arrayList);
        return arrayList.size();
    }

    @Override // Z5.AbstractC0623a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.l.f("<this>", objArr);
        return kotlin.jvm.internal.l.i(objArr);
    }

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.l.f("<this>", objArr);
        return objArr.length;
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        kotlin.jvm.internal.l.f("<this>", null);
        P3.m.P(null);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f10344c;
    }

    @Override // Z5.AbstractC0623a
    public final Object h(Object obj) throws NegativeArraySizeException {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.l.f("<this>", arrayList);
        InterfaceC1425d interfaceC1425d = this.f10343b;
        kotlin.jvm.internal.l.f("eClass", interfaceC1425d);
        Object objNewInstance = Array.newInstance((Class<?>) n6.m.F(interfaceC1425d), arrayList.size());
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>", objNewInstance);
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.l.e("toArray(...)", array);
        return array;
    }

    @Override // Z5.r
    public final void i(int i7, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.l.f("<this>", arrayList);
        arrayList.add(i7, obj2);
    }
}
