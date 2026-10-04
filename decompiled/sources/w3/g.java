package w3;

import H5.A;
import K5.Y;
import O3.C;
import com.kusukanime.data.UserRepo;

/* loaded from: classes.dex */
public final class g extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16967k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f16968l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, S3.c cVar) {
        super(2, cVar);
        this.f16968l = jVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new g(this.f16968l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16967k;
        j jVar = this.f16968l;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Y y7 = jVar.f16981c;
                Boolean bool = Boolean.TRUE;
                y7.getClass();
                y7.i(null, bool);
                jVar.f16984f.h(null);
                UserRepo userRepo = jVar.f16980b;
                this.f16967k = 1;
                if (userRepo.profile(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
        } catch (Throwable unused) {
        }
        Y y8 = jVar.f16981c;
        Boolean bool2 = Boolean.FALSE;
        y8.getClass();
        y8.i(null, bool2);
        return C.a;
    }
}
