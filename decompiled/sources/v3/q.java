package v3;

import H5.A;
import H5.D;
import O.Z;
import O3.C;
import android.content.Context;
import com.kusukanime.data.SocialPrefs;

/* loaded from: classes.dex */
public final class q extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16583k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f16584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f16585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f16584l = context;
        this.f16585m = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new q(this.f16584l, this.f16585m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16583k;
        Context context = this.f16584l;
        if (i7 == 0) {
            P3.r.Y(obj);
            SocialPrefs.INSTANCE.countLaunch(context);
            this.f16583k = 1;
            if (D.k(1200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        if (SocialPrefs.INSTANCE.shouldShow(context)) {
            this.f16585m.setValue(Boolean.TRUE);
        }
        return C.a;
    }
}
