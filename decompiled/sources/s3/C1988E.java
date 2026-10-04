package s3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.EpisodeStreamDetail;
import com.kusukanime.data.KusuApi;

/* renamed from: s3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1988E extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15553k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f15554l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15556n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f15557o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f15558p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f15559q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1988E(Context context, String str, Z z7, Z z8, Z z9, Z z10, S3.c cVar) {
        super(2, cVar);
        this.f15554l = context;
        this.f15555m = str;
        this.f15556n = z7;
        this.f15557o = z8;
        this.f15558p = z9;
        this.f15559q = z10;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1988E(this.f15554l, this.f15555m, this.f15556n, this.f15557o, this.f15558p, this.f15559q, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1988E) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15553k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f15554l);
                String str = this.f15555m;
                this.f15553k = 1;
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
            this.f15556n.setValue(episodeStreamDetail.getStreams());
            this.f15557o.setValue(episodeStreamDetail.getTitle());
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Gagal memuat stream";
            }
            this.f15558p.setValue(message);
        }
        this.f15559q.setValue(Boolean.TRUE);
        return O3.C.a;
    }
}
