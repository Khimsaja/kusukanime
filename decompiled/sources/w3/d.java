package w3;

import H5.A;
import O.Z;
import O3.C;
import com.kusukanime.data.ProfileRow;
import com.kusukanime.data.SessionGate;
import com.kusukanime.data.UserRepo;

/* loaded from: classes.dex */
public final class d extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Z f16960k;

    /* renamed from: l, reason: collision with root package name */
    public int f16961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f16962m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f16963n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Z z7, Z z8, S3.c cVar) {
        super(2, cVar);
        this.f16962m = z7;
        this.f16963n = z8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new d(this.f16962m, this.f16963n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Z z7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16961l;
        if (i7 == 0) {
            P3.r.Y(obj);
            SessionGate sessionGate = SessionGate.INSTANCE;
            this.f16961l = 1;
            if (sessionGate.ensure(this) == aVar) {
            }
            return aVar;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z7 = this.f16960k;
            P3.r.Y(obj);
            z7.setValue((ProfileRow) obj);
            this.f16963n.setValue(Boolean.FALSE);
            return C.a;
        }
        P3.r.Y(obj);
        Z z8 = this.f16962m;
        UserRepo userRepo = new UserRepo();
        this.f16960k = z8;
        this.f16961l = 2;
        Object objProfile = userRepo.profile(this);
        if (objProfile != aVar) {
            z7 = z8;
            obj = objProfile;
            z7.setValue((ProfileRow) obj);
            this.f16963n.setValue(Boolean.FALSE);
            return C.a;
        }
        return aVar;
    }
}
