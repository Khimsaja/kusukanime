package H1;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import y1.C2381c;

/* renamed from: H1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224e {
    public final i3.h a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3445b;

    /* renamed from: c, reason: collision with root package name */
    public L f3446c;

    /* renamed from: d, reason: collision with root package name */
    public C2381c f3447d;

    /* renamed from: e, reason: collision with root package name */
    public int f3448e;

    /* renamed from: f, reason: collision with root package name */
    public int f3449f;

    /* renamed from: g, reason: collision with root package name */
    public float f3450g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public z1.b f3451h;

    public C0224e(Context context, Looper looper, L l7) {
        C0223d c0223d = new C0223d(context, 0);
        this.a = c0223d instanceof Serializable ? new i3.i(c0223d) : new i3.j(c0223d);
        this.f3446c = l7;
        this.f3445b = new Handler(looper);
        this.f3448e = 0;
    }

    public final void a() {
        int i7 = this.f3448e;
        if (i7 == 1 || i7 == 0 || this.f3451h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.get();
        z1.b bVar = this.f3451h;
        if (B1.K.a < 26) {
            audioManager.abandonAudioFocus(bVar.f18945b);
            return;
        }
        Object obj = bVar.f18948e;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(z0.M.g(obj));
    }

    public final void b(int i7) {
        L l7 = this.f3446c;
        if (l7 != null) {
            B1.F f5 = l7.f3328r;
            f5.getClass();
            B1.E eB = B1.F.b();
            eB.a = f5.a.obtainMessage(33, i7, 0);
            eB.b();
        }
    }

    public final void c(int i7) {
        if (this.f3448e == i7) {
            return;
        }
        this.f3448e = i7;
        float f5 = i7 == 4 ? 0.2f : 1.0f;
        if (this.f3450g == f5) {
            return;
        }
        this.f3450g = f5;
        L l7 = this.f3446c;
        if (l7 != null) {
            l7.f3328r.e(34);
        }
    }

    public final int d(int i7, boolean z7) {
        int i8;
        int iRequestAudioFocus;
        F5.o oVar;
        if (i7 == 1 || (i8 = this.f3449f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z7) {
            int i9 = this.f3448e;
            if (i9 == 1) {
                return -1;
            }
            if (i9 == 3) {
                return 0;
            }
        } else if (this.f3448e != 2) {
            z1.b bVar = this.f3451h;
            if (bVar == null) {
                if (bVar == null) {
                    oVar = new F5.o((char) 0, 13);
                    oVar.f2542m = C2381c.f18030b;
                    oVar.f2541l = i8;
                } else {
                    F5.o oVar2 = new F5.o((char) 0, 13);
                    oVar2.f2541l = bVar.a;
                    oVar2.f2542m = bVar.f18947d;
                    oVar = oVar2;
                }
                C2381c c2381c = this.f3447d;
                c2381c.getClass();
                oVar.f2542m = c2381c;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: H1.c
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i10) {
                        C0224e c0224e = this.a;
                        c0224e.getClass();
                        if (i10 == -3 || i10 == -2) {
                            if (i10 != -2) {
                                c0224e.c(4);
                                return;
                            } else {
                                c0224e.b(0);
                                c0224e.c(3);
                                return;
                            }
                        }
                        if (i10 == -1) {
                            c0224e.b(-1);
                            c0224e.a();
                            c0224e.c(1);
                        } else if (i10 != 1) {
                            A6.b.n(i10, "Unknown focus change type: ", "AudioFocusManager");
                        } else {
                            c0224e.c(2);
                            c0224e.b(1);
                        }
                    }
                };
                Handler handler = this.f3445b;
                handler.getClass();
                this.f3451h = new z1.b(oVar.f2541l, onAudioFocusChangeListener, handler, (C2381c) oVar.f2542m);
            }
            AudioManager audioManager = (AudioManager) this.a.get();
            z1.b bVar2 = this.f3451h;
            if (B1.K.a >= 26) {
                Object obj = bVar2.f18948e;
                obj.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(z0.M.g(obj));
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = bVar2.f18945b;
                bVar2.f18947d.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener2, 3, bVar2.a);
            }
            if (iRequestAudioFocus == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
