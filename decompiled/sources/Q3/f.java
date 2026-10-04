package Q3;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import p.I0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: k, reason: collision with root package name */
    public int f7972k;

    /* renamed from: l, reason: collision with root package name */
    public int f7973l;

    /* renamed from: m, reason: collision with root package name */
    public int f7974m;

    /* renamed from: n, reason: collision with root package name */
    public Object f7975n;

    public f() {
        if (I0.f13882l == null) {
            I0.f13882l = new I0(5);
        }
    }

    public int a(int i7) {
        if (i7 < this.f7974m) {
            return ((ByteBuffer) this.f7975n).getShort(this.f7973l + i7);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f7975n).f7984r != this.f7974m) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i7 = this.f7972k;
            g gVar = (g) this.f7975n;
            if (i7 >= gVar.f7982p || gVar.f7979m[i7] >= 0) {
                return;
            } else {
                this.f7972k = i7 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f7972k < ((g) this.f7975n).f7982p;
    }

    public void remove() {
        b();
        if (this.f7973l == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        g gVar = (g) this.f7975n;
        gVar.c();
        gVar.q(this.f7973l);
        this.f7973l = -1;
        this.f7974m = gVar.f7984r;
    }
}
