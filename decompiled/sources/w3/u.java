package w3;

import H5.A;
import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import com.kusukanime.data.OtaCheck;
import com.kusukanime.data.OtaInfo;

/* loaded from: classes.dex */
public final class u extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f17060k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f17061l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f17062m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, Context context, S3.c cVar) {
        super(2, cVar);
        this.f17061l = yVar;
        this.f17062m = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new u(this.f17061l, this.f17062m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f17060k;
        y yVar = this.f17061l;
        Y y7 = yVar.f17084l;
        Y y8 = yVar.f17086n;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Boolean bool = Boolean.TRUE;
                y7.getClass();
                y7.i(null, bool);
                y8.h(null);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f17062m);
                this.f17060k = 1;
                obj = kusuApi.otaCheck(30, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            ApiEnvelope apiEnvelope = (ApiEnvelope) obj;
            yVar.f17082j.h(apiEnvelope.getData());
            if (((OtaCheck) apiEnvelope.getData()).getUpdate()) {
                OtaInfo latest = ((OtaCheck) apiEnvelope.getData()).getLatest();
                str = "Versi " + (latest != null ? latest.getVersion_name() : null) + " tersedia!";
            } else {
                str = "Sudah versi terbaru (0.0.27).";
            }
            y8.h(str);
        } catch (Exception e7) {
            y8.h("Cek gagal: " + e7.getMessage());
        }
        Boolean bool2 = Boolean.FALSE;
        y7.getClass();
        y7.i(null, bool2);
        return C.a;
    }
}
