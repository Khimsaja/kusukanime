package t3;

import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0510p;
import O3.C;
import com.kusukanime.data.GenreItem;

/* loaded from: classes.dex */
public final class j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16003k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GenreItem f16004l;

    public /* synthetic */ j(GenreItem genreItem, int i7) {
        this.f16003k = i7;
        this.f16004l = genreItem;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16003k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    GenreItem genreItem = this.f16004l;
                    H2.b(genreItem.getName() + " (" + genreItem.getCount() + ")", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p, 0, 0, 131070);
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    GenreItem genreItem2 = this.f16004l;
                    H2.b(genreItem2.getName() + " (" + genreItem2.getCount() + ")", androidx.compose.foundation.layout.a.i(a0.n.a, 12, 8), ((N) c0510p2.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5222n, c0510p2, 48, 0, 65528);
                }
                break;
        }
        return C.a;
    }
}
