package s3;

import O.Z;
import com.kusukanime.data.BookmarkRow;
import com.kusukanime.data.SbClient;
import com.kusukanime.data.UserRepo;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.AuthKt;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: s3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014v extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Z f15797k;

    /* renamed from: l, reason: collision with root package name */
    public int f15798l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UserRepo f15799m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15800n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f15801o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f15802p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2014v(UserRepo userRepo, Z z7, String str, Z z8, S3.c cVar) {
        super(2, cVar);
        this.f15799m = userRepo;
        this.f15800n = z7;
        this.f15801o = str;
        this.f15802p = z8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2014v(this.f15799m, this.f15800n, this.f15801o, this.f15802p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2014v) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Z z7;
        Z z8 = this.f15800n;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15798l;
        O3.C c2 = O3.C.a;
        boolean z9 = false;
        if (i7 == 0) {
            P3.r.Y(obj);
            SbClient sbClient = SbClient.INSTANCE;
            if (sbClient.ready()) {
                SupabaseClient orNull = sbClient.getOrNull();
                z8.setValue(Boolean.valueOf((orNull == null || AuthKt.getAuth(orNull).currentSessionOrNull() == null) ? false : true));
                if (((Boolean) z8.getValue()).booleanValue()) {
                    z7 = this.f15802p;
                    UserRepo userRepo = this.f15799m;
                    this.f15797k = z7;
                    this.f15798l = 1;
                    obj = userRepo.bookmarks(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return c2;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z7 = this.f15797k;
        P3.r.Y(obj);
        Iterable iterable = (Iterable) obj;
        String str = this.f15801o;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.l.a(((BookmarkRow) it.next()).getAnime_slug(), str)) {
                    z9 = true;
                    break;
                }
            }
        }
        z7.setValue(Boolean.valueOf(z9));
        return c2;
    }
}
