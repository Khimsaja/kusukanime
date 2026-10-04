package i1;

import d1.C0782a;
import f.AbstractC0847h;

/* renamed from: i1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1044I {
    public final S a;

    /* renamed from: b, reason: collision with root package name */
    public C0782a[] f11947b;

    public AbstractC1044I() {
        this(new S());
    }

    public final void a() {
        C0782a[] c0782aArr = this.f11947b;
        if (c0782aArr != null) {
            C0782a c0782aF = c0782aArr[0];
            C0782a c0782aF2 = c0782aArr[1];
            S s7 = this.a;
            if (c0782aF2 == null) {
                c0782aF2 = s7.a.f(2);
            }
            if (c0782aF == null) {
                c0782aF = s7.a.f(1);
            }
            f(C0782a.a(c0782aF, c0782aF2));
            C0782a c0782a = this.f11947b[AbstractC0847h.o(16)];
            if (c0782a != null) {
                e(c0782a);
            }
            C0782a c0782a2 = this.f11947b[AbstractC0847h.o(32)];
            if (c0782a2 != null) {
                d(c0782a2);
            }
            C0782a c0782a3 = this.f11947b[AbstractC0847h.o(64)];
            if (c0782a3 != null) {
                g(c0782a3);
            }
        }
    }

    public abstract S b();

    public void c(int i7, C0782a c0782a) {
        if (this.f11947b == null) {
            this.f11947b = new C0782a[9];
        }
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                this.f11947b[AbstractC0847h.o(i8)] = c0782a;
            }
        }
    }

    public abstract void f(C0782a c0782a);

    public AbstractC1044I(S s7) {
        this.a = s7;
    }

    public void d(C0782a c0782a) {
    }

    public void e(C0782a c0782a) {
    }

    public void g(C0782a c0782a) {
    }
}
