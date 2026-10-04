package t3;

import H5.A;
import K5.Y;
import O3.C;
import P3.q;
import P3.r;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import java.util.List;

/* renamed from: t3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2046d extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Y f15980k;

    /* renamed from: l, reason: collision with root package name */
    public int f15981l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2047e f15982m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f15983n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2046d(C2047e c2047e, Context context, S3.c cVar) {
        super(2, cVar);
        this.f15982m = c2047e;
        this.f15983n = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2046d(this.f15982m, this.f15983n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2046d) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15981l;
        C2047e c2047e = this.f15982m;
        try {
            if (i7 == 0) {
                r.Y(obj);
                Y y8 = c2047e.f15986d;
                Boolean bool = Boolean.TRUE;
                y8.getClass();
                y8.i(null, bool);
                c2047e.f15988f.h(null);
                Y y9 = c2047e.f15984b;
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f15983n);
                this.f15980k = y9;
                this.f15981l = 1;
                Object objAzIndex = kusuApi.azIndex(this);
                if (objAzIndex == aVar) {
                    return aVar;
                }
                y7 = y9;
                obj = objAzIndex;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f15980k;
                r.Y(obj);
            }
            List listO0 = q.O0((Iterable) ((ApiEnvelope) obj).getData(), new G3.q(4));
            y7.getClass();
            y7.i(null, listO0);
        } catch (Throwable th) {
            Y y10 = c2047e.f15988f;
            String message = th.getMessage();
            if (message == null) {
                message = "Gagal memuat katalog";
            }
            y10.getClass();
            y10.i(null, message);
        }
        Y y11 = c2047e.f15986d;
        Boolean bool2 = Boolean.FALSE;
        y11.getClass();
        y11.i(null, bool2);
        return C.a;
    }
}
