package B3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.PlaybackPrefs;
import com.kusukanime.data.SocialPrefs;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f516k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f517l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f518m;

    public /* synthetic */ p(Context context, Z z7, int i7) {
        this.f516k = i7;
        this.f517l = context;
        this.f518m = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f516k) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                this.f518m.setValue(bool);
                SocialPrefs.INSTANCE.setPromoEnabled(this.f517l, zBooleanValue);
                break;
            case 1:
                boolean zBooleanValue2 = bool.booleanValue();
                this.f518m.setValue(bool);
                PlaybackPrefs.INSTANCE.saveShowInfoOverlay(this.f517l, zBooleanValue2);
                break;
            case 2:
                boolean zBooleanValue3 = bool.booleanValue();
                this.f518m.setValue(bool);
                PlaybackPrefs.INSTANCE.saveAutoplay(this.f517l, zBooleanValue3);
                break;
            case 3:
                boolean zBooleanValue4 = bool.booleanValue();
                this.f518m.setValue(bool);
                this.f517l.getSharedPreferences("kusu_settings", 0).edit().putBoolean("notif_update", zBooleanValue4).apply();
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                boolean zBooleanValue5 = bool.booleanValue();
                this.f518m.setValue(bool);
                this.f517l.getSharedPreferences("kusu_settings", 0).edit().putBoolean("dark", zBooleanValue5).apply();
                D3.w.a.setValue(bool);
                break;
            case 5:
                boolean zBooleanValue6 = bool.booleanValue();
                this.f518m.setValue(bool);
                this.f517l.getSharedPreferences("kusu_settings", 0).edit().putBoolean("dark", zBooleanValue6).apply();
                D3.w.a.setValue(bool);
                break;
            case 6:
                boolean zBooleanValue7 = bool.booleanValue();
                this.f518m.setValue(bool);
                PlaybackPrefs.INSTANCE.saveAutoplay(this.f517l, zBooleanValue7);
                break;
            default:
                boolean zBooleanValue8 = bool.booleanValue();
                this.f518m.setValue(bool);
                this.f517l.getSharedPreferences("kusu_settings", 0).edit().putBoolean("notif_update", zBooleanValue8).apply();
                break;
        }
        return O3.C.a;
    }
}
