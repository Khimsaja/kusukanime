package r3;

import O.C0486d;
import O.C0510p;
import O3.C;
import com.kusukanime.data.AnimeDetail;
import com.kusukanime.data.ProfileRow;
import e4.InterfaceC0821a;
import s3.AbstractC1994a;
import w3.AbstractC2210a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14878k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f14879l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f14880m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f14881n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f14882o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f14883p;

    public /* synthetic */ g(AnimeDetail animeDetail, String str, InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, int i7) {
        this.f14882o = animeDetail;
        this.f14879l = str;
        this.f14880m = interfaceC0821a;
        this.f14883p = interfaceC0821a2;
        this.f14881n = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14878k) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = C0486d.V(1);
                m mVar = (m) this.f14883p;
                n.c((String) this.f14879l, (String) this.f14882o, this.f14880m, mVar, (C0510p) obj, iV, this.f14881n);
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC1994a.l((AnimeDetail) this.f14882o, (String) this.f14879l, this.f14880m, (InterfaceC0821a) this.f14883p, (C0510p) obj, C0486d.V(this.f14881n | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iV2 = C0486d.V(this.f14881n | 1);
                e4.k kVar = (e4.k) this.f14882o;
                w3.j jVar = (w3.j) this.f14883p;
                AbstractC2210a.b((ProfileRow) this.f14879l, this.f14880m, kVar, jVar, (C0510p) obj, iV2);
                break;
        }
        return C.a;
    }

    public /* synthetic */ g(ProfileRow profileRow, InterfaceC0821a interfaceC0821a, e4.k kVar, w3.j jVar, int i7) {
        this.f14879l = profileRow;
        this.f14880m = interfaceC0821a;
        this.f14882o = kVar;
        this.f14883p = jVar;
        this.f14881n = i7;
    }

    public /* synthetic */ g(String str, String str2, InterfaceC0821a interfaceC0821a, m mVar, int i7, int i8) {
        this.f14879l = str;
        this.f14882o = str2;
        this.f14880m = interfaceC0821a;
        this.f14883p = mVar;
        this.f14881n = i8;
    }
}
