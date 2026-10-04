package A3;

import O.C0502l;
import O.C0510p;
import O3.C;
import com.kusukanime.data.SearchSuggestion;
import e4.InterfaceC0821a;
import java.util.List;
import w.C2160a;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements e4.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f200m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f201n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.k f202o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List list, B b4, String str, e4.k kVar) {
        super(4);
        this.f199l = list;
        this.f200m = b4;
        this.f201n = str;
        this.f202o = kVar;
    }

    @Override // e4.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        C2160a c2160a = (C2160a) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0510p c0510p = (C0510p) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (c0510p.f(c2160a) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i7 |= c0510p.d(iIntValue) ? 32 : 16;
        }
        if ((i7 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            SearchSuggestion searchSuggestion = (SearchSuggestion) this.f199l.get(iIntValue);
            c0510p.R(554585736);
            B b4 = this.f200m;
            boolean zH = c0510p.h(b4);
            String str = this.f201n;
            boolean zF = zH | c0510p.f(str);
            e4.k kVar = this.f202o;
            boolean zF2 = zF | c0510p.f(kVar) | c0510p.f(searchSuggestion);
            Object objH = c0510p.H();
            if (zF2 || objH == C0502l.a) {
                objH = new s(b4, str, kVar, searchSuggestion);
                c0510p.b0(objH);
            }
            c.b(searchSuggestion, (InterfaceC0821a) objH, c0510p, 0);
            c0510p.p(false);
        }
        return C.a;
    }
}
