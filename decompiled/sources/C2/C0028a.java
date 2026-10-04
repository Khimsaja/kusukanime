package C2;

import H1.C0234o;
import io.ktor.util.GzipHeaderFlags;
import j3.X;
import p.I0;
import s2.InterfaceC1980h;
import y1.C2391m;

/* renamed from: C2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0028a implements V1.q, i3.d, B1.n, B1.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f690k;

    public /* synthetic */ C0028a(int i7) {
        this.f690k = i7;
    }

    @Override // V1.q
    public V1.n[] a() {
        int i7 = 0;
        switch (this.f690k) {
            case 0:
                return new V1.n[]{new C0029b()};
            case 1:
                return new V1.n[]{new C0031d()};
            case 2:
                return new V1.n[]{new C0032e()};
            case 3:
                return new V1.n[]{new D()};
            case GzipHeaderFlags.EXTRA /* 4 */:
                I0 i02 = InterfaceC1980h.f15519h;
                B1.H h7 = new B1.H(0L);
                j3.E e7 = j3.G.f12277l;
                return new V1.n[]{new I(1, i02, h7, new C0034g(i7, X.f12304o))};
            default:
                return new V1.n[]{new D2.d()};
        }
    }

    @Override // i3.d
    public Object apply(Object obj) {
        return new I1.f((B1.D) obj);
    }

    @Override // B1.o
    public void b(Object obj, C2391m c2391m) {
    }

    @Override // B1.n
    public void invoke(Object obj) {
        switch (this.f690k) {
            case 13:
                ((y1.J) obj).B(new C0234o(2, new D6.r("Player release timed out."), 1003));
                break;
            case 14:
                ((y1.J) obj).l();
                break;
            case 15:
                ((I1.k) obj).getClass();
                break;
            case 16:
                ((I1.k) obj).getClass();
                break;
            case 17:
                ((I1.k) obj).getClass();
                break;
            case 18:
                ((I1.k) obj).getClass();
                break;
            case 19:
                ((I1.k) obj).getClass();
                break;
            case 20:
                ((I1.k) obj).getClass();
                break;
            case 21:
                ((I1.k) obj).getClass();
                break;
            case 22:
                ((I1.k) obj).getClass();
                break;
            case 23:
                ((I1.k) obj).getClass();
                break;
            case 24:
                ((I1.k) obj).getClass();
                break;
            case 25:
                ((I1.k) obj).getClass();
                break;
            case 26:
                ((I1.k) obj).getClass();
                break;
            case 27:
            default:
                ((I1.k) obj).getClass();
                break;
            case 28:
                ((I1.k) obj).getClass();
                break;
        }
    }
}
