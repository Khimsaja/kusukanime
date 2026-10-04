package x3;

import O.Z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.kusukanime.data.OtaInfo;
import java.io.File;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {
    public final /* synthetic */ OtaInfo a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f17316b;

    public d(OtaInfo otaInfo, Z z7) {
        this.a = otaInfo;
        this.f17316b = z7;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l.f("c", context);
        l.f("intent", intent);
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "kusukanime-" + this.a.getVersion_name() + ".apk");
            if (file.exists()) {
                this.f17316b.setValue(file);
            }
        } catch (Exception unused) {
        }
    }
}
