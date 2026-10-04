package s3;

import O.Z;
import com.kusukanime.data.SbClient;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.AuthKt;

/* loaded from: classes.dex */
public final class z extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z f15816k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Z z7, S3.c cVar) {
        super(2, cVar);
        this.f15816k = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new z(this.f15816k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z zVar = (z) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        zVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        try {
            SupabaseClient orNull = SbClient.INSTANCE.getOrNull();
            this.f15816k.setValue(Boolean.valueOf((orNull == null || AuthKt.getAuth(orNull).currentSessionOrNull() == null) ? false : true));
        } catch (Throwable unused) {
        }
        return O3.C.a;
    }
}
