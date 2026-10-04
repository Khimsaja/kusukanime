package Z1;

import V1.C;
import V1.n;
import V1.o;
import V1.p;
import V1.r;
import d2.C0785a;

/* loaded from: classes.dex */
public final class a implements n {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final n f10247b;

    public a(int i7, byte b4) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.f10247b = new C("image/png", 35152, 2);
                break;
            default:
                this.f10247b = new C("image/bmp", 16973, 2);
                break;
        }
    }

    @Override // V1.n
    public final void a() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                this.f10247b.a();
                break;
        }
    }

    @Override // V1.n
    public final boolean b(o oVar) {
        switch (this.a) {
            case 0:
                return ((C) this.f10247b).b(oVar);
            case 1:
                return ((C) this.f10247b).b(oVar);
            default:
                return this.f10247b.b(oVar);
        }
    }

    @Override // V1.n
    public final void d(p pVar) {
        switch (this.a) {
            case 0:
                ((C) this.f10247b).d(pVar);
                break;
            case 1:
                ((C) this.f10247b).d(pVar);
                break;
            default:
                this.f10247b.d(pVar);
                break;
        }
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        switch (this.a) {
            case 0:
                ((C) this.f10247b).e(j7, j8);
                break;
            case 1:
                ((C) this.f10247b).e(j7, j8);
                break;
            default:
                this.f10247b.e(j7, j8);
                break;
        }
    }

    @Override // V1.n
    public final int i(o oVar, r rVar) {
        switch (this.a) {
            case 0:
                return ((C) this.f10247b).i(oVar, rVar);
            case 1:
                return ((C) this.f10247b).i(oVar, rVar);
            default:
                return this.f10247b.i(oVar, rVar);
        }
    }

    public a(int i7) {
        this.a = 2;
        if ((i7 & 1) != 0) {
            this.f10247b = new C("image/jpeg", 65496, 2);
        } else {
            this.f10247b = new C0785a();
        }
    }

    private final void c() {
    }

    private final void g() {
    }
}
