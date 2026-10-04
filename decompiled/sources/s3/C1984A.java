package s3;

import O.Z;
import com.kusukanime.data.EpisodeVoteStats;
import com.kusukanime.data.UserRepo;

/* renamed from: s3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1984A extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15530k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserRepo f15531l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15532m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15533n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f15534o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f15535p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1984A(UserRepo userRepo, String str, Z z7, Z z8, Z z9, S3.c cVar) {
        super(2, cVar);
        this.f15531l = userRepo;
        this.f15532m = str;
        this.f15533n = z7;
        this.f15534o = z8;
        this.f15535p = z9;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1984A(this.f15531l, this.f15532m, this.f15533n, this.f15534o, this.f15535p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1984A) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15530k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                UserRepo userRepo = this.f15531l;
                String str = this.f15532m;
                this.f15530k = 1;
                obj = userRepo.episodeVoteStats(str, this);
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
            this.f15533n.setValue(Integer.valueOf(episodeVoteStats.getLikes()));
            this.f15534o.setValue(Integer.valueOf(episodeVoteStats.getDislikes()));
            this.f15535p.setValue(Integer.valueOf(episodeVoteStats.getMy_vote()));
        } catch (Throwable unused) {
        }
        return O3.C.a;
    }
}
