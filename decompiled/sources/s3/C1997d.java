package s3;

import O.C0486d;
import O.C0510p;
import com.kusukanime.data.AnimeDetail;

/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1997d implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15653k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AnimeDetail f15654l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f15655m;

    public /* synthetic */ C1997d(AnimeDetail animeDetail, int i7, int i8) {
        this.f15653k = i8;
        this.f15654l = animeDetail;
        this.f15655m = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f15653k;
        C0510p c0510p = (C0510p) obj;
        ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                AbstractC1994a.k(this.f15654l, c0510p, C0486d.V(this.f15655m | 1));
                break;
            case 1:
                AbstractC1994a.n(this.f15654l, c0510p, C0486d.V(this.f15655m | 1));
                break;
            default:
                AbstractC1994a.n(this.f15654l, c0510p, C0486d.V(this.f15655m | 1));
                break;
        }
        return O3.C.a;
    }
}
