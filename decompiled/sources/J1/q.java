package J1;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class q {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public int f4225b;

    /* renamed from: c, reason: collision with root package name */
    public long f4226c;

    /* renamed from: d, reason: collision with root package name */
    public long f4227d;

    /* renamed from: e, reason: collision with root package name */
    public long f4228e;

    /* renamed from: f, reason: collision with root package name */
    public long f4229f;

    public q(AudioTrack audioTrack) {
        this.a = new p(audioTrack);
        a();
    }

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i7) {
        this.f4225b = i7;
        if (i7 == 0) {
            this.f4228e = 0L;
            this.f4229f = -1L;
            this.f4226c = System.nanoTime() / 1000;
            this.f4227d = 10000L;
            return;
        }
        if (i7 == 1) {
            this.f4227d = 10000L;
            return;
        }
        if (i7 == 2 || i7 == 3) {
            this.f4227d = 10000000L;
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            this.f4227d = 500000L;
        }
    }
}
