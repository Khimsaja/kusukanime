package t3;

import H5.A;
import K5.Y;
import O3.C;
import P3.q;
import P3.r;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.GenreItem;
import com.kusukanime.data.KusuApi;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Y f16014k;

    /* renamed from: l, reason: collision with root package name */
    public int f16015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f16016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f16017n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Context context, S3.c cVar) {
        super(2, cVar);
        this.f16016m = pVar;
        this.f16017n = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new n(this.f16016m, this.f16017n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16015l;
        p pVar = this.f16016m;
        try {
            if (i7 == 0) {
                r.Y(obj);
                Y y8 = pVar.f16022b;
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f16017n);
                this.f16014k = y8;
                this.f16015l = 1;
                Object objGenres = kusuApi.genres(this);
                if (objGenres == aVar) {
                    return aVar;
                }
                y7 = y8;
                obj = objGenres;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f16014k;
                r.Y(obj);
            }
            y7.h(((ApiEnvelope) obj).getData());
            GenreItem genreItem = (GenreItem) q.t0((List) pVar.f16022b.getValue());
            String slug = genreItem != null ? genreItem.getSlug() : null;
            if (slug != null && pVar.f16033m == null) {
                pVar.f(slug);
            }
        } catch (Exception unused) {
        }
        Y y9 = pVar.f16026f;
        Boolean bool = Boolean.FALSE;
        y9.getClass();
        y9.i(null, bool);
        return C.a;
    }
}
