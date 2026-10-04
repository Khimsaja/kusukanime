package x3;

import H5.A;
import K5.Y;
import O3.C;
import P3.r;
import U3.j;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import e4.n;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f17320k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f17321l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f17322m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f17323n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f17324o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, String str, String str2, Context context, S3.c cVar) {
        super(2, cVar);
        this.f17321l = hVar;
        this.f17322m = str;
        this.f17323n = str2;
        this.f17324o = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new f(this.f17321l, this.f17322m, this.f17323n, this.f17324o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context = this.f17324o;
        String str = this.f17322m;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f17320k;
        h hVar = this.f17321l;
        Y y7 = hVar.f17336h;
        Y y8 = hVar.f17332d;
        try {
            if (i7 == 0) {
                r.Y(obj);
                Boolean bool = Boolean.TRUE;
                y8.getClass();
                y8.i(null, bool);
                Integer num = new Integer(0);
                Y y9 = hVar.f17334f;
                y9.getClass();
                y9.i(null, num);
                y7.h(null);
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.f17323n));
                request.setTitle("Kusukanime ".concat(str));
                request.setDescription("Download update");
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "kusukanime-" + str + ".apk");
                request.setMimeType("application/vnd.android.package-archive");
                Object systemService = context.getSystemService("download");
                l.d("null cannot be cast to non-null type android.app.DownloadManager", systemService);
                DownloadManager downloadManager = (DownloadManager) systemService;
                long jEnqueue = downloadManager.enqueue(request);
                context.getSharedPreferences("ota", 0).edit().putLong("dl_".concat(str), jEnqueue).apply();
                this.f17320k = 1;
                if (h.e(hVar, downloadManager, jEnqueue, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
        } catch (Exception e7) {
            String message = e7.getMessage();
            if (message == null) {
                message = "Download gagal";
            }
            y7.getClass();
            y7.i(null, message);
            Boolean bool2 = Boolean.FALSE;
            y8.getClass();
            y8.i(null, bool2);
        }
        return C.a;
    }
}
