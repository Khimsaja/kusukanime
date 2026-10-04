package v3;

import H5.A;
import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;

/* loaded from: classes.dex */
public final class v extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Y f16601k;

    /* renamed from: l, reason: collision with root package name */
    public int f16602l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f16603m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f16604n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(S3.c cVar, Context context, z zVar) {
        super(2, cVar);
        this.f16603m = zVar;
        this.f16604n = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new v(cVar, this.f16604n, this.f16603m);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16602l;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Y y8 = this.f16603m.f16627o;
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f16604n);
                this.f16601k = y8;
                this.f16602l = 1;
                Object objFeed$default = KusuApi.feed$default(kusuApi, 0.0d, 12, this, 1, null);
                if (objFeed$default == aVar) {
                    return aVar;
                }
                y7 = y8;
                obj = objFeed$default;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f16601k;
                P3.r.Y(obj);
            }
            y7.h(((ApiEnvelope) obj).getData());
        } catch (Exception unused) {
        }
        return C.a;
    }
}
