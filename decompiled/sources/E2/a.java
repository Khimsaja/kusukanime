package E2;

import B1.B;
import V1.C;
import V1.k;
import V1.n;
import V1.o;
import V1.p;
import V1.r;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class a implements n {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final B f1929b;

    /* renamed from: c, reason: collision with root package name */
    public final C f1930c;

    public a(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.f1929b = new B(4);
                this.f1930c = new C("image/avif", -1, -1);
                break;
            case 2:
                this.f1929b = new B(4);
                this.f1930c = new C("image/heif", -1, -1);
                break;
            default:
                this.f1929b = new B(4);
                this.f1930c = new C("image/webp", -1, -1);
                break;
        }
    }

    @Override // V1.n
    public final void a() {
        int i7 = this.a;
    }

    @Override // V1.n
    public final boolean b(o oVar) throws EOFException, InterruptedIOException {
        switch (this.a) {
            case 0:
                B b4 = this.f1929b;
                b4.C(4);
                k kVar = (k) oVar;
                kVar.h(b4.a, 0, 4, false);
                if (b4.v() == 1380533830) {
                    kVar.b(4, false);
                    b4.C(4);
                    kVar.h(b4.a, 0, 4, false);
                    if (b4.v() == 1464156752) {
                    }
                }
                break;
            case 1:
                k kVar2 = (k) oVar;
                kVar2.b(4, false);
                B b7 = this.f1929b;
                b7.C(4);
                kVar2.h(b7.a, 0, 4, false);
                if (b7.v() == 1718909296) {
                    b7.C(4);
                    kVar2.h(b7.a, 0, 4, false);
                    if (b7.v() == 1635150182) {
                    }
                }
                break;
            default:
                k kVar3 = (k) oVar;
                kVar3.b(4, false);
                B b8 = this.f1929b;
                b8.C(4);
                kVar3.h(b8.a, 0, 4, false);
                if (b8.v() == 1718909296) {
                    b8.C(4);
                    kVar3.h(b8.a, 0, 4, false);
                    if (b8.v() == 1751476579) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // V1.n
    public final void d(p pVar) {
        switch (this.a) {
            case 0:
                this.f1930c.d(pVar);
                break;
            case 1:
                this.f1930c.d(pVar);
                break;
            default:
                this.f1930c.d(pVar);
                break;
        }
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        switch (this.a) {
            case 0:
                this.f1930c.e(j7, j8);
                break;
            case 1:
                this.f1930c.e(j7, j8);
                break;
            default:
                this.f1930c.e(j7, j8);
                break;
        }
    }

    @Override // V1.n
    public final int i(o oVar, r rVar) {
        switch (this.a) {
        }
        return this.f1930c.i(oVar, rVar);
    }

    private final void c() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
