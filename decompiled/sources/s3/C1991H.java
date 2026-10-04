package s3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.AnimeDetail;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.EpisodeRef;
import com.kusukanime.data.KusuApi;
import java.util.Iterator;
import java.util.List;

/* renamed from: s3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1991H extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Z f15567k;

    /* renamed from: l, reason: collision with root package name */
    public Z f15568l;

    /* renamed from: m, reason: collision with root package name */
    public int f15569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f15570n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f15571o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f15572p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f15573q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1991H(Context context, String str, String str2, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f15570n = context;
        this.f15571o = str;
        this.f15572p = str2;
        this.f15573q = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1991H(this.f15570n, this.f15571o, this.f15572p, this.f15573q, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1991H) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Z z7;
        Z z8;
        int i7;
        T3.a aVar = T3.a.f9048k;
        int i8 = this.f15569m;
        String slug = null;
        if (i8 == 0) {
            P3.r.Y(obj);
            Z z9 = this.f15573q;
            try {
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f15570n);
                String str = this.f15571o;
                this.f15567k = z9;
                this.f15568l = z9;
                this.f15569m = 1;
                Object objAnimeDetail = kusuApi.animeDetail(str, this);
                if (objAnimeDetail == aVar) {
                    return aVar;
                }
                z8 = z9;
                obj = objAnimeDetail;
                z7 = z8;
            } catch (Throwable unused) {
                z7 = z9;
                z8 = z7;
                z8.setValue(slug);
                return O3.C.a;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z8 = this.f15568l;
            z7 = this.f15567k;
            try {
                P3.r.Y(obj);
            } catch (Throwable unused2) {
                z8 = z7;
                z8.setValue(slug);
                return O3.C.a;
            }
        }
        List<EpisodeRef> episodes = ((AnimeDetail) ((ApiEnvelope) obj).getData()).getEpisodes();
        String str2 = this.f15572p;
        Iterator<EpisodeRef> it = episodes.iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                i9 = -1;
                break;
            }
            if (kotlin.jvm.internal.l.a(it.next().getSlug(), str2)) {
                break;
            }
            i9++;
        }
        if (i9 >= 0 && (i7 = i9 + 1) < episodes.size()) {
            slug = episodes.get(i7).getSlug();
        }
        z8.setValue(slug);
        return O3.C.a;
    }
}
