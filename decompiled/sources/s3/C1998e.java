package s3;

import O.C0502l;
import O.C0510p;
import O.Z;
import com.kusukanime.data.AnimeDetail;
import com.kusukanime.data.ProfileRow;
import e4.InterfaceC0821a;
import v.AbstractC2123b;
import w.C2160a;
import w3.AbstractC2210a;

/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1998e implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15656k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f15657l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f15658m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f15659n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f15660o;

    public /* synthetic */ C1998e(AnimeDetail animeDetail, String str, InterfaceC0821a interfaceC0821a, Z z7) {
        this.f15659n = animeDetail;
        this.f15660o = str;
        this.f15657l = interfaceC0821a;
        this.f15658m = z7;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i7 = this.f15656k;
        C2160a c2160a = (C2160a) obj;
        C0510p c0510p = (C0510p) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i7) {
            case 0:
                kotlin.jvm.internal.l.f("$this$item", c2160a);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    Z z7 = this.f15658m;
                    boolean zF = c0510p.f(z7);
                    Object objH = c0510p.H();
                    if (zF || objH == C0502l.a) {
                        objH = new B3.i(20, z7);
                        c0510p.b0(objH);
                    }
                    AbstractC1994a.l((AnimeDetail) this.f15659n, (String) this.f15660o, this.f15657l, (InterfaceC0821a) objH, c0510p, AnimeDetail.$stable);
                }
                break;
            default:
                kotlin.jvm.internal.l.f("$this$item", c2160a);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    AbstractC2210a.d(((Boolean) this.f15658m.getValue()).booleanValue(), (ProfileRow) ((Z) this.f15660o).getValue(), this.f15657l, (InterfaceC0821a) this.f15659n, c0510p, 0);
                    AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.e(a0.n.a, 16));
                }
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ C1998e(InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, Z z7, Z z8) {
        this.f15657l = interfaceC0821a;
        this.f15659n = interfaceC0821a2;
        this.f15658m = z7;
        this.f15660o = z8;
    }
}
