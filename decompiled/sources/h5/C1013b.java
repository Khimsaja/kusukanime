package h5;

import n5.AbstractC1586x;
import u4.InterfaceC2096b;
import x4.AbstractC2288o;

/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013b extends Q4.c {

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC2288o f11855l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1013b(InterfaceC2096b interfaceC2096b, AbstractC1586x abstractC1586x) {
        super(abstractC1586x);
        if (abstractC1586x == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f11855l = (AbstractC2288o) interfaceC2096b;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f11855l + "}";
    }
}
