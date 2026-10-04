package z1;

import B1.K;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;
import y1.C2381c;
import z0.M;

/* loaded from: classes.dex */
public final class b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f18945b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f18946c;

    /* renamed from: d, reason: collision with root package name */
    public final C2381c f18947d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18948e;

    public b(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C2381c c2381c) {
        this.a = i7;
        this.f18946c = handler;
        this.f18947d = c2381c;
        int i8 = K.a;
        if (i8 < 26) {
            this.f18945b = new C2483a(onAudioFocusChangeListener, handler);
        } else {
            this.f18945b = onAudioFocusChangeListener;
        }
        if (i8 >= 26) {
            this.f18948e = M.b(i7).setAudioAttributes((AudioAttributes) c2381c.a().f14298b).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f18948e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Objects.equals(this.f18945b, bVar.f18945b) && Objects.equals(this.f18946c, bVar.f18946c) && Objects.equals(this.f18947d, bVar.f18947d);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, this.f18945b, this.f18946c, this.f18947d, bool);
    }
}
