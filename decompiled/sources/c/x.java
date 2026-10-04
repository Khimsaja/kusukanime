package c;

import L.F0;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.EnumC0689p;
import androidx.lifecycle.InterfaceC0694v;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x {
    public final Runnable a;

    /* renamed from: b, reason: collision with root package name */
    public final P3.l f11109b = new P3.l();

    /* renamed from: c, reason: collision with root package name */
    public q f11110c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f11111d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f11112e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11113f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11114g;

    public x(Runnable runnable) {
        this.a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f11111d = i7 >= 34 ? new t(new r(this, 0), new r(this, 1), new s(this, 0), new s(this, 1)) : new F0(new s(this, 2), 2);
        }
    }

    public final void a(InterfaceC0694v interfaceC0694v, q qVar) {
        kotlin.jvm.internal.l.f("owner", interfaceC0694v);
        kotlin.jvm.internal.l.f("onBackPressedCallback", qVar);
        AbstractC0690q abstractC0690qF = interfaceC0694v.f();
        if (abstractC0690qF.b() == EnumC0689p.f10736k) {
            return;
        }
        qVar.f11093b.add(new u(this, abstractC0690qF, qVar));
        e();
        qVar.f11094c = new w(0, this, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        q qVarPrevious;
        q qVar = this.f11110c;
        if (qVar == null) {
            P3.l lVar = this.f11109b;
            ListIterator listIterator = lVar.listIterator(lVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qVarPrevious = 0;
                    break;
                } else {
                    qVarPrevious = listIterator.previous();
                    if (((q) qVarPrevious).a) {
                        break;
                    }
                }
            }
            qVar = qVarPrevious;
        }
        this.f11110c = null;
        if (qVar != null) {
            qVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        q qVarPrevious;
        q qVar = this.f11110c;
        if (qVar == null) {
            P3.l lVar = this.f11109b;
            ListIterator listIterator = lVar.listIterator(lVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qVarPrevious = 0;
                    break;
                } else {
                    qVarPrevious = listIterator.previous();
                    if (((q) qVarPrevious).a) {
                        break;
                    }
                }
            }
            qVar = qVarPrevious;
        }
        this.f11110c = null;
        if (qVar != null) {
            qVar.b();
        } else {
            this.a.run();
        }
    }

    public final void d(boolean z7) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f11112e;
        OnBackInvokedCallback onBackInvokedCallback = this.f11111d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z7 && !this.f11113f) {
            h.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f11113f = true;
        } else {
            if (z7 || !this.f11113f) {
                return;
            }
            h.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f11113f = false;
        }
    }

    public final void e() {
        boolean z7 = this.f11114g;
        boolean z8 = false;
        P3.l lVar = this.f11109b;
        if (lVar == null || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((q) it.next()).a) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f11114g = z8;
        if (z8 == z7 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z8);
    }
}
