package y3;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;
import java.util.Map;
import n0.C1538e;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18315k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f18316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f18317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f18318n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a0.q f18319o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f18320p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f18321q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18322r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18323s;

    public /* synthetic */ m(String str, InterfaceC0821a interfaceC0821a, Map map, a0.q qVar, e4.k kVar, InterfaceC0821a interfaceC0821a2, int i7, int i8, int i9) {
        this.f18315k = i9;
        this.f18316l = str;
        this.f18317m = interfaceC0821a;
        this.f18318n = map;
        this.f18319o = qVar;
        this.f18320p = kVar;
        this.f18321q = interfaceC0821a2;
        this.f18322r = i7;
        this.f18323s = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18315k) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = C0486d.V(this.f18322r | 1);
                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) this.f18321q;
                C.b(this.f18316l, this.f18317m, (Map) this.f18318n, this.f18319o, (e4.k) this.f18320p, interfaceC0821a, (C0510p) obj, iV, this.f18323s);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iV2 = C0486d.V(this.f18322r | 1);
                InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) this.f18321q;
                C.b(this.f18316l, this.f18317m, (Map) this.f18318n, this.f18319o, (e4.k) this.f18320p, interfaceC0821a2, (C0510p) obj, iV2, this.f18323s);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV3 = C0486d.V(this.f18322r | 1);
                C1538e c1538e = (C1538e) this.f18321q;
                String str = this.f18316l;
                InterfaceC0821a interfaceC0821a3 = this.f18317m;
                D3.f.c(c1538e, str, (String) this.f18318n, this.f18319o, (String) this.f18320p, interfaceC0821a3, (C0510p) obj, iV3, this.f18323s);
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ m(C1538e c1538e, String str, String str2, a0.q qVar, String str3, InterfaceC0821a interfaceC0821a, int i7, int i8) {
        this.f18315k = 2;
        this.f18321q = c1538e;
        this.f18316l = str;
        this.f18318n = str2;
        this.f18319o = qVar;
        this.f18320p = str3;
        this.f18317m = interfaceC0821a;
        this.f18322r = i7;
        this.f18323s = i8;
    }
}
