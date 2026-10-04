package J1;

import B1.K;
import C2.C0034g;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.Objects;
import y1.C2381c;

/* renamed from: J1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289e {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.G f4189b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4190c;

    /* renamed from: d, reason: collision with root package name */
    public final C0287c f4191d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.y f4192e;

    /* renamed from: f, reason: collision with root package name */
    public final C0288d f4193f;

    /* renamed from: g, reason: collision with root package name */
    public C0286b f4194g;

    /* renamed from: h, reason: collision with root package name */
    public C0034g f4195h;

    /* renamed from: i, reason: collision with root package name */
    public C2381c f4196i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4197j;

    public C0289e(Context context, C2.G g4, C2381c c2381c, C0034g c0034g) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f4189b = g4;
        this.f4196i = c2381c;
        this.f4195h = c0034g;
        int i7 = K.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f4190c = handler;
        this.f4191d = K.a >= 23 ? new C0287c(this) : null;
        this.f4192e = new B1.y(1, this);
        C0286b c0286b = C0286b.f4183c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f4193f = uriFor != null ? new C0288d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(C0286b c0286b) {
        Q1.q qVar;
        if (!this.f4197j || c0286b.equals(this.f4194g)) {
            return;
        }
        this.f4194g = c0286b;
        A a = (A) this.f4189b.f664l;
        a.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = a.f4116f0;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper == null ? "null" : looperMyLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        C0286b c0286b2 = a.f4136w;
        if (c0286b2 == null || c0286b.equals(c0286b2)) {
            return;
        }
        a.f4136w = c0286b;
        C0034g c0034g = a.f4131r;
        if (c0034g != null) {
            C c2 = (C) c0034g.f741l;
            synchronized (c2.f3456k) {
                qVar = c2.f3455A;
            }
            if (qVar != null) {
                synchronized (qVar.f7932c) {
                    qVar.f7935f.getClass();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        C0034g c0034g = this.f4195h;
        if (Objects.equals(audioDeviceInfo, c0034g == null ? null : (AudioDeviceInfo) c0034g.f741l)) {
            return;
        }
        C0034g c0034g2 = audioDeviceInfo != null ? new C0034g(11, audioDeviceInfo) : null;
        this.f4195h = c0034g2;
        a(C0286b.c(this.a, this.f4196i, c0034g2));
    }
}
