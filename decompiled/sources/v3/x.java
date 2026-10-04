package v3;

import H5.A;
import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.AnimeItem;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16609k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f16610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f16611m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(S3.c cVar, Context context, z zVar) {
        super(2, cVar);
        this.f16610l = context;
        this.f16611m = zVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new x(cVar, this.f16610l, this.f16611m);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16609k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f16610l);
                this.f16609k = 1;
                obj = kusuApi.listAnime(1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            Y y7 = this.f16611m.f16623k;
            Iterable iterable = (Iterable) ((ApiEnvelope) obj).getData();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (hashSet.add(((AnimeItem) obj2).getSlug())) {
                    arrayList.add(obj2);
                }
            }
            List listP0 = P3.q.P0(arrayList, 5);
            y7.getClass();
            y7.i(null, listP0);
        } catch (Exception unused) {
        }
        return C.a;
    }
}
