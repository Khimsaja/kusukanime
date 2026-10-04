package B3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.CrashLog;
import com.kusukanime.data.PlaybackPrefs;
import e4.InterfaceC0821a;
import java.io.File;
import java.util.List;
import s3.T;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f512k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f513l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f514m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f515n;

    public /* synthetic */ o(Context context, Z z7, Z z8, int i7) {
        this.f512k = i7;
        this.f513l = context;
        this.f514m = z7;
        this.f515n = z8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f512k) {
            case 0:
                Z z7 = this.f514m;
                int iIntValue = ((Number) z7.getValue()).intValue() + 5;
                if (iIntValue > 300) {
                    iIntValue = 300;
                }
                z7.setValue(Integer.valueOf(iIntValue));
                this.f515n.setValue("custom");
                PlaybackPrefs playbackPrefs = PlaybackPrefs.INSTANCE;
                int iIntValue2 = ((Number) z7.getValue()).intValue();
                Context context = this.f513l;
                playbackPrefs.saveIntroSec(context, iIntValue2);
                playbackPrefs.saveIntroPreset(context, "custom");
                break;
            case 1:
                Z z8 = this.f514m;
                int iIntValue3 = ((Number) z8.getValue()).intValue() + 5;
                if (iIntValue3 > 300) {
                    iIntValue3 = 300;
                }
                z8.setValue(Integer.valueOf(iIntValue3));
                this.f515n.setValue("custom");
                PlaybackPrefs playbackPrefs2 = PlaybackPrefs.INSTANCE;
                int iIntValue4 = ((Number) z8.getValue()).intValue();
                Context context2 = this.f513l;
                playbackPrefs2.saveOutroSec(context2, iIntValue4);
                playbackPrefs2.saveIntroPreset(context2, "custom");
                break;
            default:
                List<File> list = CrashLog.INSTANCE.list(this.f513l);
                this.f514m.setValue(list.isEmpty() ? "(belum ada crash tercatat)" : P3.q.y0(P3.q.P0(list, 3), "\n\n---\n\n", null, null, new T(11), 30));
                this.f515n.setValue(Boolean.TRUE);
                break;
        }
        return O3.C.a;
    }
}
