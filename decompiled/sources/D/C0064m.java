package D;

import L.H2;
import O.C0486d;
import O.C0507n0;
import O.C0510p;
import io.ktor.util.GzipHeaderFlags;
import java.util.Arrays;
import x.C2234h;
import y.InterfaceC2339t;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064m extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1220l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1221m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1222n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1223o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0064m(int i7, int i8, Object obj, Object obj2) {
        super(2);
        this.f1220l = i8;
        this.f1223o = obj;
        this.f1221m = obj2;
        this.f1222n = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1220l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f1222n | 1);
                AbstractC0047d0.b((H.S) this.f1223o, (W.a) this.f1221m, (C0510p) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f1222n | 1);
                W.a aVar = (W.a) this.f1221m;
                q0.c.e((X.g) this.f1223o, aVar, (C0510p) obj, iV2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f1222n | 1);
                W.a aVar2 = (W.a) this.f1221m;
                H2.a((H0.I) this.f1223o, aVar2, (C0510p) obj, iV3);
                break;
            case 3:
                ((Number) obj2).intValue();
                C0507n0[] c0507n0Arr = (C0507n0[]) this.f1223o;
                C0507n0[] c0507n0Arr2 = (C0507n0[]) Arrays.copyOf(c0507n0Arr, c0507n0Arr.length);
                int iV4 = C0486d.V(this.f1222n | 1);
                C0486d.b(c0507n0Arr2, (e4.n) this.f1221m, (C0510p) obj, iV4);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((Number) obj2).intValue();
                int iV5 = C0486d.V(this.f1222n | 1);
                C0486d.a((C0507n0) this.f1223o, (e4.n) this.f1221m, (C0510p) obj, iV5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iV6 = C0486d.V(this.f1222n) | 1;
                ((W.a) this.f1221m).a(this.f1223o, (C0510p) obj, iV6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iV7 = C0486d.V(this.f1222n | 1);
                W.a aVar3 = (W.a) this.f1221m;
                android.support.v4.media.session.b.i((a0.q) this.f1223o, aVar3, (C0510p) obj, iV7);
                break;
            case 7:
                ((Number) obj2).intValue();
                int iV8 = C0486d.V(this.f1222n | 1);
                ((p.u0) this.f1223o).a(this.f1221m, (C0510p) obj, iV8);
                break;
            case 8:
                ((Number) obj2).intValue();
                int iV9 = C0486d.V(1);
                Object obj3 = this.f1221m;
                ((w.g) this.f1223o).e(this.f1222n, obj3, (C0510p) obj, iV9);
                break;
            case 9:
                ((Number) obj2).intValue();
                int iV10 = C0486d.V(1);
                Object obj4 = this.f1221m;
                ((C2234h) this.f1223o).e(this.f1222n, obj4, (C0510p) obj, iV10);
                break;
            case 10:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    ((InterfaceC2339t) this.f1223o).e(this.f1222n, this.f1221m, c0510p, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iV11 = C0486d.V(1);
                Object obj5 = this.f1221m;
                ((z.t) this.f1223o).e(this.f1222n, obj5, (C0510p) obj, iV11);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064m(int i7, Object obj, InterfaceC2339t interfaceC2339t) {
        super(2);
        this.f1220l = 10;
        this.f1223o = interfaceC2339t;
        this.f1222n = i7;
        this.f1221m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064m(W.a aVar, Object obj, int i7) {
        super(2);
        this.f1220l = 5;
        this.f1221m = aVar;
        this.f1223o = obj;
        this.f1222n = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0064m(InterfaceC2339t interfaceC2339t, int i7, Object obj, int i8, int i9) {
        super(2);
        this.f1220l = i9;
        this.f1223o = interfaceC2339t;
        this.f1222n = i7;
        this.f1221m = obj;
    }
}
