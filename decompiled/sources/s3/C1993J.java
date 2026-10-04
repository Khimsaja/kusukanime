package s3;

import com.kusukanime.data.SbClient;
import com.kusukanime.data.UserRepo;

/* renamed from: s3.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993J extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15575k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserRepo f15576l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15577m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f15578n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f15579o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f15580p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1993J(UserRepo userRepo, String str, String str2, long j7, long j8, S3.c cVar) {
        super(2, cVar);
        this.f15576l = userRepo;
        this.f15577m = str;
        this.f15578n = str2;
        this.f15579o = j7;
        this.f15580p = j8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1993J(this.f15576l, this.f15577m, this.f15578n, this.f15579o, this.f15580p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1993J) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15575k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                if (SbClient.INSTANCE.ready()) {
                    UserRepo userRepo = this.f15576l;
                    String str = this.f15577m;
                    String str2 = this.f15578n;
                    long j7 = this.f15579o;
                    long j8 = this.f15580p;
                    this.f15575k = 1;
                    if (userRepo.saveHistory(str, str2, j7, j8, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
        } catch (Throwable unused) {
        }
        return O3.C.a;
    }
}
