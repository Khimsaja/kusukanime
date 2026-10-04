package Z5;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Z5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627c extends P {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0627c(SerialDescriptor serialDescriptor, int i7) {
        super(serialDescriptor);
        this.f10317b = i7;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        switch (this.f10317b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
