package B3;

import K5.Y;
import com.kusukanime.data.SbClient;
import com.kusukanime.data.SessionGate;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.auth.AuthKt;

/* loaded from: classes.dex */
public final class A extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f419k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f420l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f421m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C c2, u uVar, S3.c cVar) {
        super(2, cVar);
        this.f420l = c2;
        this.f421m = uVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new A(this.f420l, this.f421m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Auth auth;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f419k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                SupabaseClient orNull = SbClient.INSTANCE.getOrNull();
                if (orNull != null && (auth = AuthKt.getAuth(orNull)) != null) {
                    this.f419k = 1;
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
        C c2 = this.f420l;
        Boolean bool = Boolean.FALSE;
        Y y7 = c2.f431h;
        y7.getClass();
        y7.i(null, bool);
        this.f421m.invoke();
        return O3.C.a;
    }
}
