package r3;

import H5.A;
import O3.C;
import P3.r;
import com.kusukanime.data.UserRepo;

/* loaded from: classes.dex */
public final class i extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14887k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f14888l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f14889m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f14890n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, String str, boolean z7, S3.c cVar) {
        super(2, cVar);
        this.f14888l = mVar;
        this.f14889m = str;
        this.f14890n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new i(this.f14888l, this.f14889m, this.f14890n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14887k;
        try {
            if (i7 == 0) {
                r.Y(obj);
                UserRepo userRepo = this.f14888l.f14919r;
                String str = this.f14889m;
                boolean z7 = this.f14890n;
                this.f14887k = 1;
                if (userRepo.toggleLike("comment", str, z7, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
        } catch (Throwable unused) {
        }
        return C.a;
    }
}
