package s3;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.Z;
import androidx.media3.exoplayer.ExoPlayer;
import com.kusukanime.data.StreamItem;
import e4.InterfaceC0821a;
import h0.C0998u;
import java.util.List;
import n0.C1538e;
import r3.C1871a;

/* renamed from: s3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2000g implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15668k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f15669l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f15670m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f15671n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f15672o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f15673p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15674q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15675r;

    public /* synthetic */ C2000g(ExoPlayer exoPlayer, StreamItem streamItem, String str, boolean z7, Z z8, List list, Z z9) {
        this.f15671n = exoPlayer;
        this.f15672o = streamItem;
        this.f15669l = str;
        this.f15670m = z7;
        this.f15673p = z8;
        this.f15675r = list;
        this.f15674q = z9;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15668k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    String url = ((StreamItem) this.f15672o).getUrl();
                    Z z7 = (Z) this.f15673p;
                    boolean zF = c0510p.f(z7);
                    Object objH = c0510p.H();
                    Object obj3 = C0502l.a;
                    if (zF || objH == obj3) {
                        objH = new B3.i(18, z7);
                        c0510p.b0(objH);
                    }
                    InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
                    Z z8 = (Z) this.f15674q;
                    boolean zF2 = c0510p.f(z8);
                    Object objH2 = c0510p.H();
                    if (zF2 || objH2 == obj3) {
                        objH2 = new C1871a(1, z8);
                        c0510p.b0(objH2);
                    }
                    List list = (List) this.f15675r;
                    y3.C.f((ExoPlayer) this.f15671n, url, this.f15669l, this.f15670m, true, interfaceC0821a, list, (e4.k) objH2, null, c0510p, 27648, 256);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int iV = C0486d.V(1);
                C1538e c1538e = (C1538e) this.f15671n;
                C0998u c0998u = (C0998u) this.f15674q;
                C0998u c0998u2 = (C0998u) this.f15675r;
                AbstractC1994a.a(c1538e, this.f15669l, this.f15670m, (InterfaceC0821a) this.f15672o, (a0.q) this.f15673p, c0998u, c0998u2, (C0510p) obj, iV);
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ C2000g(C1538e c1538e, String str, boolean z7, InterfaceC0821a interfaceC0821a, a0.q qVar, C0998u c0998u, C0998u c0998u2, int i7) {
        this.f15671n = c1538e;
        this.f15669l = str;
        this.f15670m = z7;
        this.f15672o = interfaceC0821a;
        this.f15673p = qVar;
        this.f15674q = c0998u;
        this.f15675r = c0998u2;
    }
}
