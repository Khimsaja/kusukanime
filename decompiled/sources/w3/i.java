package w3;

import H5.A;
import K5.Y;
import O3.C;
import com.kusukanime.data.ProfileRow;
import com.kusukanime.data.UserRepo;
import com.kusukanime.data.UsernameException;
import r3.C1871a;

/* loaded from: classes.dex */
public final class i extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16976k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f16977l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f16978m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1871a f16979n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, C1871a c1871a, S3.c cVar) {
        super(2, cVar);
        this.f16977l = jVar;
        this.f16978m = str;
        this.f16979n = c1871a;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new i(this.f16977l, this.f16978m, this.f16979n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16976k;
        j jVar = this.f16977l;
        Y y7 = jVar.f16990l;
        Y y8 = jVar.f16988j;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Boolean bool = Boolean.TRUE;
                y7.getClass();
                y7.i(null, bool);
                y8.h(null);
                UserRepo userRepo = jVar.f16980b;
                String str = this.f16978m;
                this.f16976k = 1;
                obj = userRepo.setUsername(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            this.f16979n.invoke((ProfileRow) obj);
        } catch (UsernameException e7) {
            y8.h(e7.getMessage());
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Gagal menyimpan username";
            }
            y8.getClass();
            y8.i(null, message);
        }
        Boolean bool2 = Boolean.FALSE;
        y7.getClass();
        y7.i(null, bool2);
        return C.a;
    }
}
