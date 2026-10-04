package s2;

import C2.G;
import java.util.List;
import t2.AbstractC2042h;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1975c extends G1.g implements InterfaceC1976d {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1976d f15514o;

    /* renamed from: p, reason: collision with root package name */
    public long f15515p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15516q = 1;

    /* renamed from: r, reason: collision with root package name */
    public Object f15517r;

    public /* synthetic */ C1975c() {
    }

    @Override // s2.InterfaceC1976d
    public final int d(long j7) {
        InterfaceC1976d interfaceC1976d = this.f15514o;
        interfaceC1976d.getClass();
        return interfaceC1976d.d(j7 - this.f15515p);
    }

    @Override // s2.InterfaceC1976d
    public final long e(int i7) {
        InterfaceC1976d interfaceC1976d = this.f15514o;
        interfaceC1976d.getClass();
        return interfaceC1976d.e(i7) + this.f15515p;
    }

    @Override // G1.g
    public final void f() {
        this.f575l = 0;
        this.f2614m = 0L;
        this.f2615n = false;
        this.f15514o = null;
    }

    @Override // G1.g
    public final void g() {
        switch (this.f15516q) {
            case 0:
                ((L1.b) this.f15517r).l(this);
                break;
            default:
                G g4 = (G) this.f15517r;
                g4.getClass();
                AbstractC2042h abstractC2042h = (AbstractC2042h) g4.f664l;
                abstractC2042h.getClass();
                f();
                abstractC2042h.f15966b.add(this);
                break;
        }
    }

    @Override // s2.InterfaceC1976d
    public final List i(long j7) {
        InterfaceC1976d interfaceC1976d = this.f15514o;
        interfaceC1976d.getClass();
        return interfaceC1976d.i(j7 - this.f15515p);
    }

    @Override // s2.InterfaceC1976d
    public final int m() {
        InterfaceC1976d interfaceC1976d = this.f15514o;
        interfaceC1976d.getClass();
        return interfaceC1976d.m();
    }

    public C1975c(L1.b bVar) {
        this.f15517r = bVar;
    }
}
