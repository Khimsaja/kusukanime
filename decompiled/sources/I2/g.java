package I2;

import android.content.Context;
import android.content.pm.PackageManager;
import com.kusukanime.data.CrashLog;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4031k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f4032l;

    public /* synthetic */ g(Context context, int i7) {
        this.f4031k = i7;
        this.f4032l = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException, IOException {
        switch (this.f4031k) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f4032l, 1));
                break;
            case 1:
                e.t(this.f4032l, new c(0), e.a, false);
                break;
            default:
                CrashLog.uploadPending$lambda$0(this.f4032l);
                break;
        }
    }
}
