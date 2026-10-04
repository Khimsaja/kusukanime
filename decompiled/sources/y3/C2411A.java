package y3;

import B1.K;
import H1.G;
import O.Z;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import androidx.media3.exoplayer.ExoPlayer;
import s0.C1955C;
import z5.C2508m;

/* renamed from: y3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2411A implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1955C f18228k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f18229l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Activity f18230m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f18231n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f18232o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f18233p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f18234q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z f18235r;

    public /* synthetic */ C2411A(C1955C c1955c, kotlin.jvm.internal.u uVar, Activity activity, kotlin.jvm.internal.u uVar2, ExoPlayer exoPlayer, Z z7, Z z8, Z z9) {
        this.f18228k = c1955c;
        this.f18229l = uVar;
        this.f18230m = activity;
        this.f18231n = uVar2;
        this.f18232o = exoPlayer;
        this.f18233p = z7;
        this.f18234q = z8;
        this.f18235r = z9;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        Window window;
        s0.r rVar = (s0.r) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        C1955C c1955c = this.f18228k;
        float f5 = (int) (c1955c.f15436F & 4294967295L);
        if (f5 > 0.0f) {
            float fJ = e3.c.j((-fFloatValue) / f5, -1.0f, 1.0f) * 1.5f;
            float f7 = (int) (c1955c.f15436F >> 32);
            float fD = g0.c.d(rVar.f15470c);
            float f8 = f7 / 2.0f;
            Z z7 = this.f18233p;
            if (fD < f8) {
                kotlin.jvm.internal.u uVar = this.f18229l;
                if (uVar.f12717k >= 0.0f) {
                    Activity activity = this.f18230m;
                    WindowManager.LayoutParams attributes = (activity == null || (window = activity.getWindow()) == null) ? null : window.getAttributes();
                    if (attributes != null) {
                        float fJ2 = e3.c.j(uVar.f12717k + fJ, 0.01f, 1.0f);
                        attributes.screenBrightness = fJ2;
                        activity.getWindow().setAttributes(attributes);
                        C2508m c2508m = C.a;
                        z7.setValue(null);
                        this.f18234q.setValue(Float.valueOf(fJ2));
                    }
                }
            } else {
                float f9 = this.f18231n.f12717k;
                if (f9 >= 0.0f) {
                    float fJ3 = e3.c.j(f9 + fJ, 0.0f, 1.0f);
                    G g4 = (G) this.f18232o;
                    g4.u1();
                    final float fG = K.g(fJ3, 0.0f, 1.0f);
                    if (g4.f3250i0 != fG) {
                        g4.f3250i0 = fG;
                        g4.f3271v.f3328r.a(32, Float.valueOf(fG)).b();
                        g4.f3272w.e(22, new B1.n() { // from class: H1.z
                            @Override // B1.n
                            public final void invoke(Object obj3) {
                                ((y1.J) obj3).s(fG);
                            }
                        });
                    }
                    C2508m c2508m2 = C.a;
                    z7.setValue(null);
                    this.f18235r.setValue(Float.valueOf(fJ3));
                }
            }
        }
        return O3.C.a;
    }
}
