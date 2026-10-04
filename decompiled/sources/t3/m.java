package t3;

import O3.C;
import com.kusukanime.data.AnimeItem;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class m implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16011k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f16012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AnimeItem f16013m;

    public /* synthetic */ m(e4.k kVar, AnimeItem animeItem, int i7) {
        this.f16011k = i7;
        this.f16012l = kVar;
        this.f16013m = animeItem;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f16011k) {
            case 0:
                this.f16012l.invoke(this.f16013m.getDetailSlug());
                break;
            default:
                this.f16012l.invoke(this.f16013m.getDetailSlug());
                break;
        }
        return C.a;
    }
}
