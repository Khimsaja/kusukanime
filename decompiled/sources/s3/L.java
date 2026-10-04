package s3;

import K5.Y;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;

/* loaded from: classes.dex */
public final class L extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Y f15592k;

    /* renamed from: l, reason: collision with root package name */
    public int f15593l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f15594m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f15595n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f15596o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n7, Context context, String str, S3.c cVar) {
        super(2, cVar);
        this.f15594m = n7;
        this.f15595n = context;
        this.f15596o = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new L(this.f15594m, this.f15595n, this.f15596o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15593l;
        N n7 = this.f15594m;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Y y8 = n7.f15602d;
                Boolean bool = Boolean.TRUE;
                y8.getClass();
                y8.i(null, bool);
                n7.f15604f.h(null);
                Y y9 = n7.f15600b;
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f15595n);
                String str = this.f15596o;
                this.f15592k = y9;
                this.f15593l = 1;
                Object objAnimeDetail = kusuApi.animeDetail(str, this);
                if (objAnimeDetail == aVar) {
                    return aVar;
                }
                y7 = y9;
                obj = objAnimeDetail;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f15592k;
                P3.r.Y(obj);
            }
            y7.h(((ApiEnvelope) obj).getData());
        } catch (Exception e7) {
            n7.f15604f.h("Gagal muat detail: " + e7.getMessage());
        }
        Y y10 = n7.f15602d;
        Boolean bool2 = Boolean.FALSE;
        y10.getClass();
        y10.i(null, bool2);
        return O3.C.a;
    }
}
