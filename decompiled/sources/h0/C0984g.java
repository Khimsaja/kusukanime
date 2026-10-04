package h0;

import android.os.Build;
import com.kusukanime.R;
import j0.C1296b;
import k0.C1375b;
import k0.C1378e;
import k0.C1379f;
import k0.C1381h;
import k0.InterfaceC1377d;
import l0.AbstractC1407a;
import l0.C1408b;
import z0.C2471u;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984g implements InterfaceC0958C {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f11819d = true;
    public final C2471u a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11820b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C1408b f11821c;

    public C0984g(C2471u c2471u) {
        this.a = c2471u;
    }

    @Override // h0.InterfaceC0958C
    public final void a(C1375b c1375b) {
        synchronized (this.f11820b) {
            if (!c1375b.f12580r) {
                c1375b.f12580r = true;
                c1375b.b();
            }
        }
    }

    @Override // h0.InterfaceC0958C
    public final C1375b b() {
        InterfaceC1377d c1381h;
        C1375b c1375b;
        synchronized (this.f11820b) {
            try {
                C2471u c2471u = this.a;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29) {
                    AbstractC0983f.a(c2471u);
                }
                if (i7 >= 29) {
                    c1381h = new C1379f();
                } else if (f11819d) {
                    try {
                        c1381h = new C1378e(this.a, new C0996s(), new C1296b());
                    } catch (Throwable unused) {
                        f11819d = false;
                        c1381h = new C1381h(c(this.a));
                    }
                } else {
                    c1381h = new C1381h(c(this.a));
                }
                c1375b = new C1375b(c1381h);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1375b;
    }

    public final AbstractC1407a c(C2471u c2471u) {
        C1408b c1408b = this.f11821c;
        if (c1408b != null) {
            return c1408b;
        }
        C1408b c1408b2 = new C1408b(c2471u.getContext());
        c1408b2.setClipChildren(false);
        c1408b2.setClipToPadding(false);
        c1408b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        c2471u.addView(c1408b2, -1);
        this.f11821c = c1408b2;
        return c1408b2;
    }
}
