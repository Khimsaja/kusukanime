package s3;

import O.Z;
import com.kusukanime.data.EpisodeVoteStats;
import com.kusukanime.data.UserRepo;

/* loaded from: classes.dex */
public final class K extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15581k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserRepo f15582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15583m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f15584n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15585o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15586p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15587q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e4.k f15588r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z f15589s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z f15590t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z f15591u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(UserRepo userRepo, String str, int i7, int i8, int i9, int i10, e4.k kVar, Z z7, Z z8, Z z9, S3.c cVar) {
        super(2, cVar);
        this.f15582l = userRepo;
        this.f15583m = str;
        this.f15584n = i7;
        this.f15585o = i8;
        this.f15586p = i9;
        this.f15587q = i10;
        this.f15588r = kVar;
        this.f15589s = z7;
        this.f15590t = z8;
        this.f15591u = z9;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new K(this.f15582l, this.f15583m, this.f15584n, this.f15585o, this.f15586p, this.f15587q, this.f15588r, this.f15589s, this.f15590t, this.f15591u, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15581k;
        Z z7 = this.f15591u;
        Z z8 = this.f15590t;
        Z z9 = this.f15589s;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                UserRepo userRepo = this.f15582l;
                String str = this.f15583m;
                int i8 = this.f15584n;
                this.f15581k = 1;
                obj = userRepo.voteEpisode(str, i8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            EpisodeVoteStats episodeVoteStats = (EpisodeVoteStats) obj;
            z9.setValue(Integer.valueOf(episodeVoteStats.getLikes()));
            z8.setValue(Integer.valueOf(episodeVoteStats.getDislikes()));
            z7.setValue(Integer.valueOf(episodeVoteStats.getMy_vote()));
        } catch (Throwable unused) {
            z7.setValue(Integer.valueOf(this.f15585o));
            z9.setValue(Integer.valueOf(this.f15586p));
            z8.setValue(Integer.valueOf(this.f15587q));
            this.f15588r.invoke(Boolean.TRUE);
        }
        return O3.C.a;
    }
}
