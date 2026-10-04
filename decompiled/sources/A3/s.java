package A3;

import O3.C;
import android.content.Context;
import com.kusukanime.data.SearchHistory;
import com.kusukanime.data.SearchSuggestion;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class s implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B f183k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f184l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f185m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SearchSuggestion f186n;

    public s(B b4, String str, e4.k kVar, SearchSuggestion searchSuggestion) {
        this.f183k = b4;
        this.f184l = str;
        this.f185m = kVar;
        this.f186n = searchSuggestion;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        B b4 = this.f183k;
        String str = this.f184l;
        Context context = b4.f130n;
        if (context != null) {
            SearchHistory searchHistory = SearchHistory.INSTANCE;
            searchHistory.add(context, str);
            b4.f124h.h(searchHistory.list(context));
        }
        this.f185m.invoke(this.f186n.getSlug());
        return C.a;
    }
}
