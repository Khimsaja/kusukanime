package B3;

import O.Z;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.kusukanime.data.SocialPrefs;
import com.kusukanime.data.VideoCache;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f496k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f498m;

    public /* synthetic */ k(Context context, Z z7, int i7) {
        this.f496k = i7;
        this.f497l = context;
        this.f498m = z7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f496k) {
            case 0:
                VideoCache.INSTANCE.clearWatchCache(this.f497l);
                this.f498m.setValue("Cache tontonan dibersihkan.");
                break;
            case 1:
                Context context = this.f497l;
                C3.a.b(context);
                SocialPrefs.INSTANCE.markJoined(context);
                this.f498m.setValue("Channel dibuka di Telegram.");
                break;
            case 2:
                long jCurrentTimeMillis = System.currentTimeMillis();
                Z z7 = this.f498m;
                long jLongValue = jCurrentTimeMillis - ((Number) z7.getValue()).longValue();
                Context context2 = this.f497l;
                if (jLongValue < 2000) {
                    Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    z7.setValue(Long.valueOf(jCurrentTimeMillis));
                    Toast.makeText(context2, "Tekan sekali lagi untuk keluar", 0).show();
                }
                break;
            case 3:
                SocialPrefs.INSTANCE.snooze(this.f497l, 60);
                this.f498m.setValue(Boolean.FALSE);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                Context context3 = this.f497l;
                C3.a.b(context3);
                SocialPrefs.INSTANCE.markJoined(context3);
                this.f498m.setValue(Boolean.FALSE);
                break;
            default:
                SocialPrefs.INSTANCE.snooze(this.f497l, 360);
                this.f498m.setValue(Boolean.FALSE);
                break;
        }
        return O3.C.a;
    }
}
