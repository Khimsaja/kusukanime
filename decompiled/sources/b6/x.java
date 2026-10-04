package b6;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class x extends AbstractC0726a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.b f11040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a6.d dVar, kotlinx.serialization.json.b bVar, String str) {
        super(dVar, str);
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.f("value", bVar);
        this.f11040f = bVar;
        this.a.add("primitive");
    }

    @Override // b6.AbstractC0726a
    public final kotlinx.serialization.json.b E(String str) {
        kotlin.jvm.internal.l.f("tag", str);
        if (str == "primitive") {
            return this.f11040f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // b6.AbstractC0726a
    public final kotlinx.serialization.json.b S() {
        return this.f11040f;
    }

    @Override // Y5.a
    public final int m(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return 0;
    }
}
