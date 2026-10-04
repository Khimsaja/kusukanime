package v3;

import H5.A;
import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Y f16605k;

    /* renamed from: l, reason: collision with root package name */
    public int f16606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f16607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f16608n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(S3.c cVar, Context context, z zVar) {
        super(2, cVar);
        this.f16607m = zVar;
        this.f16608n = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new w(cVar, this.f16608n, this.f16607m);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16606l;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Y y8 = this.f16607m.f16629q;
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f16608n);
                this.f16605k = y8;
                this.f16606l = 1;
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
                y7 = this.f16605k;
                P3.r.Y(obj);
            }
            List listP0 = P3.q.P0((Iterable) ((ApiEnvelope) obj).getData(), 12);
            y7.getClass();
            y7.i(null, listP0);
        } catch (Exception unused) {
        }
        return C.a;
    }
}
