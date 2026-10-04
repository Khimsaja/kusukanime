package x3;

import H5.A;
import O3.C;
import P3.r;
import U3.j;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import com.kusukanime.data.OtaCheck;
import com.kusukanime.data.OtaInfo;
import e4.n;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class e extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f17317k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f17318l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f17319m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(S3.c cVar, Context context, h hVar) {
        super(2, cVar);
        this.f17318l = context;
        this.f17319m = hVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new e(cVar, this.f17318l, this.f17319m);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        OtaInfo latest;
        String download_url;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f17317k;
        C c2 = C.a;
        Context context = this.f17318l;
        try {
            if (i7 == 0) {
                r.Y(obj);
                KusuApi kusuApi = ApiClient.INSTANCE.get(context);
                this.f17317k = 1;
                obj = kusuApi.otaCheck(30, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            ApiEnvelope apiEnvelope = (ApiEnvelope) obj;
            if (((OtaCheck) apiEnvelope.getData()).getUpdate() && (latest = ((OtaCheck) apiEnvelope.getData()).getLatest()) != null && (download_url = latest.getDownload_url()) != null && (!AbstractC2510o.g0(download_url))) {
                int i8 = context.getSharedPreferences("ota", 0).getInt("skipped_code", -1);
                OtaInfo latest2 = ((OtaCheck) apiEnvelope.getData()).getLatest();
                if (latest2 == null || i8 != latest2.getVersion_code()) {
                    this.f17319m.f17330b.h(apiEnvelope.getData());
                }
            }
        } catch (Exception unused) {
        }
        return c2;
    }
}
