package H;

import L.AbstractC0430x0;
import L.C0370f2;
import L.M2;
import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import io.ktor.util.GzipHeaderFlags;
import y.C2315O;

/* renamed from: H.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184a extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2945l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2946m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2947n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2948o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2949p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184a(W.a aVar, Object obj, Object obj2, int i7) {
        super(2);
        this.f2945l = 2;
        this.f2949p = aVar;
        this.f2947n = obj;
        this.f2948o = obj2;
        this.f2946m = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2945l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f2946m | 1);
                a0.d dVar = (a0.d) this.f2948o;
                W.a aVar = (W.a) this.f2949p;
                android.support.v4.media.session.b.b((InterfaceC0196m) this.f2947n, dVar, aVar, (C0510p) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f2946m | 1);
                AbstractC0430x0.a((L.N) this.f2947n, (C0370f2) this.f2948o, (M2) this.f2949p, (C0510p) obj, iV2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f2946m) | 1;
                Object obj3 = this.f2947n;
                Object obj4 = this.f2948o;
                ((W.a) this.f2949p).b(obj3, obj4, (C0510p) obj, iV3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iV4 = C0486d.V(this.f2946m | 1);
                androidx.compose.ui.viewinterop.a.a((e4.k) this.f2947n, (a0.q) this.f2948o, (e4.k) this.f2949p, (C0510p) obj, iV4);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((Number) obj2).intValue();
                int iV5 = C0486d.V(this.f2946m | 1);
                W.a aVar2 = (W.a) this.f2949p;
                ((X.g) this.f2947n).a(this.f2948o, aVar2, (C0510p) obj, iV5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iV6 = C0486d.V(this.f2946m | 1);
                W.a aVar3 = (W.a) this.f2949p;
                android.support.v4.media.session.b.a((InterfaceC0821a) this.f2947n, (X0.q) this.f2948o, aVar3, (C0510p) obj, iV6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iV7 = C0486d.V(this.f2946m | 1);
                a0.n nVar = a0.n.a;
                A3.t tVar = (A3.t) this.f2949p;
                AbstractC0832b.a((r.l) this.f2947n, (InterfaceC0821a) this.f2948o, nVar, tVar, (C0510p) obj, iV7);
                break;
            case 7:
                ((Number) obj2).intValue();
                int iV8 = C0486d.V(this.f2946m | 1);
                A3.t tVar2 = (A3.t) this.f2949p;
                r.n.c((r.f) this.f2947n, (InterfaceC0821a) this.f2948o, tVar2, (C0510p) obj, iV8);
                break;
            case 8:
                ((Number) obj2).intValue();
                int iV9 = C0486d.V(this.f2946m | 1);
                e4.n nVar2 = (e4.n) this.f2949p;
                w0.X.c((w0.a0) this.f2947n, (a0.q) this.f2948o, nVar2, (C0510p) obj, iV9);
                break;
            default:
                ((Number) obj2).intValue();
                int iV10 = C0486d.V(this.f2946m | 1);
                W.a aVar4 = (W.a) this.f2949p;
                ((C2315O) this.f2947n).a(this.f2948o, aVar4, (C0510p) obj, iV10);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0184a(Object obj, Object obj2, Object obj3, int i7, int i8) {
        super(2);
        this.f2945l = i8;
        this.f2947n = obj;
        this.f2948o = obj2;
        this.f2949p = obj3;
        this.f2946m = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184a(r.f fVar, InterfaceC0821a interfaceC0821a, A3.t tVar, int i7) {
        super(2);
        this.f2945l = 7;
        this.f2947n = fVar;
        this.f2948o = interfaceC0821a;
        this.f2949p = tVar;
        this.f2946m = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184a(r.l lVar, InterfaceC0821a interfaceC0821a, A3.t tVar, int i7) {
        super(2);
        this.f2945l = 6;
        this.f2947n = lVar;
        this.f2948o = interfaceC0821a;
        this.f2949p = tVar;
        this.f2946m = i7;
    }
}
