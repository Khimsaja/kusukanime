package s3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.EpisodeStreamDetail;
import com.kusukanime.data.KusuApi;
import z5.AbstractC2510o;

/* renamed from: s3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1987D extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15546k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f15547l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15548m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15549n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f15550o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f15551p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f15552q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1987D(Context context, String str, Z z7, Z z8, Z z9, Z z10, S3.c cVar) {
        super(2, cVar);
        this.f15547l = context;
        this.f15548m = str;
        this.f15549n = z7;
        this.f15550o = z8;
        this.f15551p = z9;
        this.f15552q = z10;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1987D(this.f15547l, this.f15548m, this.f15549n, this.f15550o, this.f15551p, this.f15552q, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1987D) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Z z7 = this.f15550o;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15546k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f15547l);
                String str = this.f15548m;
                this.f15546k = 1;
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
            this.f15549n.setValue(episodeStreamDetail.getStreams());
            if (AbstractC2510o.g0((String) z7.getValue())) {
                z7.setValue(episodeStreamDetail.getTitle());
            }
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Gagal memuat stream";
            }
            this.f15551p.setValue(message);
        }
        this.f15552q.setValue(Boolean.TRUE);
        return O3.C.a;
    }
}
