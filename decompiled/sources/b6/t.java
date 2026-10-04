package b6;

import f4.InterfaceC0881a;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class t implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final a6.d f11032k;

    /* renamed from: l, reason: collision with root package name */
    public final G f11033l;

    /* renamed from: m, reason: collision with root package name */
    public final KSerializer f11034m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11035n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11036o;

    public t(a6.d dVar, G g4, KSerializer kSerializer) {
        kotlin.jvm.internal.l.f("json", dVar);
        this.f11032k = dVar;
        this.f11033l = g4;
        this.f11034m = kSerializer;
        this.f11035n = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11036o) {
            return false;
        }
        G g4 = this.f11033l;
        if (g4.x() == 9) {
            this.f11036o = true;
            g4.g((byte) 9);
            if (g4.x() == 10) {
                return false;
            }
            if (g4.x() != 8) {
                g4.p();
                return false;
            }
            V1.i.r(g4, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
            throw null;
        }
        if (g4.x() != 10 || this.f11036o) {
            return true;
        }
        String strU = v.u((byte) 9);
        int i7 = g4.f9380b;
        int i8 = i7 - 1;
        C0728c c0728c = g4.f10984i;
        V1.i.r(g4, "Expected " + strU + ", but had '" + ((i7 == c0728c.f11017b || i8 < 0) ? "EOF" : String.valueOf(c0728c.a[i8])) + "' instead", i8, null, 4);
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        boolean z7 = this.f11035n;
        G g4 = this.f11033l;
        if (z7) {
            this.f11035n = false;
        } else {
            g4.h(',');
        }
        M m7 = M.f11002m;
        KSerializer kSerializer = this.f11034m;
        return new H(this.f11032k, m7, g4, kSerializer.getDescriptor(), null).f(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
