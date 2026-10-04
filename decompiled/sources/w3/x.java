package w3;

import H5.A;
import K5.Y;
import O3.C;
import com.kusukanime.data.SbClient;
import com.kusukanime.data.SessionGate;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.auth.AuthKt;

/* loaded from: classes.dex */
public final class x extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f17071k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f17072l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B3.u f17073m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, B3.u uVar, S3.c cVar) {
        super(2, cVar);
        this.f17072l = yVar;
        this.f17073m = uVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new x(this.f17072l, this.f17073m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Auth auth;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f17071k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                SupabaseClient orNull = SbClient.INSTANCE.getOrNull();
                if (orNull != null && (auth = AuthKt.getAuth(orNull)) != null) {
                    this.f17071k = 1;
                    if (Auth.signOut$default(auth, null, this, 1, null) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
        } catch (Exception unused) {
        }
        SessionGate.INSTANCE.markLoggedOut();
        y yVar = this.f17072l;
        Boolean bool = Boolean.FALSE;
        Y y7 = yVar.f17076d;
        y7.getClass();
        y7.i(null, bool);
        yVar.f17074b.h(null);
        P3.y yVar2 = P3.y.f7779k;
        Y y8 = yVar.f17078f;
        y8.getClass();
        y8.i(null, yVar2);
        this.f17073m.invoke();
        return C.a;
    }
}
