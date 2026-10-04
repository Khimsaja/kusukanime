package B3;

import K5.Y;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import com.kusukanime.data.OtaCheck;
import com.kusukanime.data.OtaInfo;

/* loaded from: classes.dex */
public final class z extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f546k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f547l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f548m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C c2, Context context, S3.c cVar) {
        super(2, cVar);
        this.f547l = c2;
        this.f548m = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new z(this.f547l, this.f548m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f546k;
        C c2 = this.f547l;
        Y y7 = c2.f427d;
        Y y8 = c2.f429f;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Boolean bool = Boolean.TRUE;
                y7.getClass();
                y7.i(null, bool);
                y8.h(null);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f548m);
                this.f546k = 1;
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
            c2.f425b.h(apiEnvelope.getData());
            if (((OtaCheck) apiEnvelope.getData()).getUpdate()) {
                OtaInfo latest = ((OtaCheck) apiEnvelope.getData()).getLatest();
                str = "Versi " + (latest != null ? latest.getVersion_name() : null) + " tersedia!";
            } else {
                str = "Kamu sudah pakai versi terbaru (0.0.27).";
            }
            y8.h(str);
        } catch (Exception e7) {
            y8.h("Cek gagal: " + e7.getMessage());
        }
        Boolean bool2 = Boolean.FALSE;
        y7.getClass();
        y7.i(null, bool2);
        return O3.C.a;
    }
}
