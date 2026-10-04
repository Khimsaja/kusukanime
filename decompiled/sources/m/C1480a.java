package m;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1480a implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public int f12877k;

    /* renamed from: l, reason: collision with root package name */
    public int f12878l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12879m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f12880n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f12881o;

    public C1480a(int i7) {
        this.f12877k = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12878l < this.f12877k;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f12878l;
        switch (this.f12880n) {
            case 0:
                objE = ((C1484e) this.f12881o).e(i7);
                break;
            case 1:
                objE = ((C1484e) this.f12881o).h(i7);
                break;
            default:
                objE = ((C1485f) this.f12881o).f12892l[i7];
                break;
        }
        this.f12878l++;
        this.f12879m = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12879m) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f12878l - 1;
        this.f12878l = i7;
        switch (this.f12880n) {
            case 0:
                ((C1484e) this.f12881o).f(i7);
                break;
            case 1:
                ((C1484e) this.f12881o).f(i7);
                break;
            default:
                ((C1485f) this.f12881o).a(i7);
                break;
        }
        this.f12877k--;
        this.f12879m = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1480a(C1485f c1485f) {
        this(c1485f.f12893m);
        this.f12880n = 2;
        this.f12881o = c1485f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1480a(C1484e c1484e, int i7) {
        this(c1484e.f12870m);
        this.f12880n = i7;
        switch (i7) {
            case 1:
                this.f12881o = c1484e;
                this(c1484e.f12870m);
                break;
            default:
                this.f12881o = c1484e;
                break;
        }
    }
}
