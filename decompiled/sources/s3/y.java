package s3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.AnimeDetail;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;

/* loaded from: classes.dex */
public final class y extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Z f15811k;

    /* renamed from: l, reason: collision with root package name */
    public int f15812l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f15813m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f15814n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f15815o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, String str, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f15813m = context;
        this.f15814n = str;
        this.f15815o = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new y(this.f15813m, this.f15814n, this.f15815o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Z z7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15812l;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Z z8 = this.f15815o;
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f15813m);
                String str = this.f15814n;
                this.f15811k = z8;
                this.f15812l = 1;
                Object objAnimeDetail = kusuApi.animeDetail(str, this);
                if (objAnimeDetail == aVar) {
                    return aVar;
                }
                z7 = z8;
                obj = objAnimeDetail;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z7 = this.f15811k;
                P3.r.Y(obj);
            }
            z7.setValue((AnimeDetail) ((ApiEnvelope) obj).getData());
        } catch (Throwable unused) {
        }
        return O3.C.a;
    }
}
