package X4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class u implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public int f9910k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final int f9911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f9912m;

    public u(v vVar) {
        this.f9912m = vVar;
        this.f9911l = vVar.f9913l.length;
    }

    public final byte a() {
        try {
            byte[] bArr = this.f9912m.f9913l;
            int i7 = this.f9910k;
            this.f9910k = i7 + 1;
            return bArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9910k < this.f9911l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
