package z3;

import H5.A;
import K5.Y;
import O3.C;
import P3.r;
import U3.j;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import e4.n;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2487c extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public Y f19019k;

    /* renamed from: l, reason: collision with root package name */
    public int f19020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2488d f19021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f19022n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2487c(C2488d c2488d, Context context, S3.c cVar) {
        super(2, cVar);
        this.f19021m = c2488d;
        this.f19022n = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2487c(this.f19021m, this.f19022n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2487c) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f19020l;
        C2488d c2488d = this.f19021m;
        try {
            if (i7 == 0) {
                r.Y(obj);
                Y y8 = c2488d.f19025d;
                Boolean bool = Boolean.TRUE;
                y8.getClass();
                y8.i(null, bool);
                c2488d.f19027f.h(null);
                Y y9 = c2488d.f19023b;
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f19022n);
                this.f19019k = y9;
                this.f19020l = 1;
                Object objSchedule = kusuApi.schedule(this);
                if (objSchedule == aVar) {
                    return aVar;
                }
                y7 = y9;
                obj = objSchedule;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f19019k;
                r.Y(obj);
            }
            y7.h(((ApiEnvelope) obj).getData());
        } catch (Exception e7) {
            c2488d.f19027f.h("Gagal muat jadwal: " + e7.getMessage());
        }
        Y y10 = c2488d.f19025d;
        Boolean bool2 = Boolean.FALSE;
        y10.getClass();
        y10.i(null, bool2);
        return C.a;
    }
}
