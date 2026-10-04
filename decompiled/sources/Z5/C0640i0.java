package Z5;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Z5.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640i0 extends P {

    /* renamed from: b, reason: collision with root package name */
    public final String f10339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640i0(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        kotlin.jvm.internal.l.f("primitive", serialDescriptor);
        this.f10339b = serialDescriptor.e() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f10339b;
    }
}
