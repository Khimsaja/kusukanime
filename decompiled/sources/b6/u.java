package b6;

import f4.InterfaceC0881a;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class u implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final a6.d f11037k;

    /* renamed from: l, reason: collision with root package name */
    public final G f11038l;

    /* renamed from: m, reason: collision with root package name */
    public final KSerializer f11039m;

    public u(a6.d dVar, G g4, KSerializer kSerializer) {
        kotlin.jvm.internal.l.f("json", dVar);
        this.f11037k = dVar;
        this.f11038l = g4;
        this.f11039m = kSerializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11038l.x() != 10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        M m7 = M.f11002m;
        KSerializer kSerializer = this.f11039m;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        return new H(this.f11037k, m7, this.f11038l, descriptor, null).f(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
