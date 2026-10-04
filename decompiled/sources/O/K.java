package O;

import f4.InterfaceC0881a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class K implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7002k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final B0 f7003l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7004m;

    /* renamed from: n, reason: collision with root package name */
    public int f7005n;

    /* renamed from: o, reason: collision with root package name */
    public int f7006o;

    public K(B0 b02, int i7, int i8) {
        this.f7003l = b02;
        this.f7004m = i8;
        this.f7005n = i7;
        this.f7006o = b02.f6952q;
        if (b02.f6951p) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7002k) {
            case 0:
                return this.f7005n < this.f7004m;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7002k) {
            case 0:
                B0 b02 = this.f7003l;
                int i7 = b02.f6952q;
                int i8 = this.f7006o;
                if (i7 != i8) {
                    throw new ConcurrentModificationException();
                }
                int i9 = this.f7005n;
                this.f7005n = C0486d.j(b02.f6946k, i9) + i9;
                return new C0(b02, i9, i8);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7002k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public K(B0 b02, int i7, L l7, C0486d c0486d) {
        this.f7003l = b02;
        this.f7004m = i7;
        this.f7005n = b02.f6952q;
    }
}
