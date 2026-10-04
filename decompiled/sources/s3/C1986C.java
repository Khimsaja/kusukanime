package s3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.EpisodeStreamDetail;
import com.kusukanime.data.KusuApi;
import z5.AbstractC2510o;

/* renamed from: s3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1986C extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15540k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f15541l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15543n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f15544o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f15545p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1986C(Context context, String str, Z z7, Z z8, Z z9, S3.c cVar) {
        super(2, cVar);
        this.f15541l = context;
        this.f15542m = str;
        this.f15543n = z7;
        this.f15544o = z8;
        this.f15545p = z9;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1986C(this.f15541l, this.f15542m, this.f15543n, this.f15544o, this.f15545p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1986C) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Z z7 = this.f15544o;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15540k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f15541l);
                String str = this.f15542m;
                this.f15540k = 1;
                obj = kusuApi.episodeDetail(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            EpisodeStreamDetail episodeStreamDetail = (EpisodeStreamDetail) ((ApiEnvelope) obj).getData();
            this.f15543n.setValue(episodeStreamDetail.getStreams());
            if (AbstractC2510o.g0((String) z7.getValue())) {
                z7.setValue(episodeStreamDetail.getTitle());
            }
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Gagal memuat stream";
            }
            this.f15545p.setValue(message);
        }
        return O3.C.a;
    }
}
