package F5;

import f4.InterfaceC0881a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2547k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f2548l;

    /* renamed from: m, reason: collision with root package name */
    public int f2549m;

    /* renamed from: n, reason: collision with root package name */
    public int f2550n;

    public q(int i7) {
        p pVar = p.f2543e;
        this.f2547k = i7;
        switch (i7) {
            case 1:
                this.f2548l = T.h.f8828e.f8831d;
                break;
            default:
                this.f2548l = pVar.f2546d;
                break;
        }
    }

    public void a(Object[] objArr, int i7, int i8) {
        this.f2548l = objArr;
        this.f2549m = i7;
        this.f2550n = i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2547k) {
            case 0:
                if (this.f2550n < this.f2549m) {
                }
                break;
            default:
                if (this.f2550n < this.f2549m) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2547k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
