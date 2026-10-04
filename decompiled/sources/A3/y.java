package A3;

import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.GenreItem;
import com.kusukanime.data.KusuApi;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Y f203k;

    /* renamed from: l, reason: collision with root package name */
    public int f204l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f205m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B b4, S3.c cVar) {
        super(2, cVar);
        this.f205m = b4;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new y(this.f205m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f204l;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                B b4 = this.f205m;
                Y y8 = b4.f128l;
                ApiClient apiClient = ApiClient.INSTANCE;
                Context context = b4.f130n;
                kotlin.jvm.internal.l.c(context);
                KusuApi kusuApi = apiClient.get(context);
                this.f203k = y8;
                this.f204l = 1;
                obj = kusuApi.genres(this);
                if (obj == aVar) {
                    return aVar;
                }
                y7 = y8;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f203k;
                P3.r.Y(obj);
            }
            List<GenreItem> listP0 = P3.q.P0((Iterable) ((ApiEnvelope) obj).getData(), 14);
            ArrayList arrayList = new ArrayList(P3.r.p(listP0, 10));
            for (GenreItem genreItem : listP0) {
                arrayList.add(new O3.l(genreItem.getSlug(), genreItem.getName()));
            }
            y7.getClass();
            y7.i(null, arrayList);
        } catch (Exception unused) {
        }
        return C.a;
    }
}
