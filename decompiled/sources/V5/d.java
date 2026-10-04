package V5;

import B3.q;
import Z5.AbstractC0625b;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1425d;

/* loaded from: classes.dex */
public final class d extends AbstractC0625b {
    public final InterfaceC1425d a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9490b;

    public d(InterfaceC1425d interfaceC1425d) {
        kotlin.jvm.internal.l.f("baseClass", interfaceC1425d);
        this.a = interfaceC1425d;
        this.f9490b = z1.c.B(O3.j.f7525k, new q(4, this));
    }

    @Override // Z5.AbstractC0625b
    public final InterfaceC1425d c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f9490b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
