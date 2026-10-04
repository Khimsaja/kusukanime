package g3;

import O3.C;
import S2.m;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import b3.C0713e;
import b3.InterfaceC0712d;
import java.lang.ref.WeakReference;

/* renamed from: g3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0951j implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f11716k;

    /* renamed from: l, reason: collision with root package name */
    public Context f11717l;

    /* renamed from: m, reason: collision with root package name */
    public c3.e f11718m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11719n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11720o = true;

    public ComponentCallbacks2C0951j(m mVar) {
        this.f11716k = new WeakReference(mVar);
    }

    public final synchronized void a() {
        C c2;
        try {
            m mVar = (m) this.f11716k.get();
            if (mVar != null) {
                if (this.f11718m == null) {
                    c3.e eVarE = mVar.f8760e.f11711b ? n6.m.e(mVar.a, this) : new R1.i(16);
                    this.f11718m = eVarE;
                    this.f11720o = eVarE.h();
                }
                c2 = C.a;
            } else {
                c2 = null;
            }
            if (c2 == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f11719n) {
                return;
            }
            this.f11719n = true;
            Context context = this.f11717l;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            c3.e eVar = this.f11718m;
            if (eVar != null) {
                eVar.a();
            }
            this.f11716k.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        try {
            if ((((m) this.f11716k.get()) != null ? C.a : null) == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i7) {
        C c2;
        try {
            m mVar = (m) this.f11716k.get();
            if (mVar != null) {
                InterfaceC0712d interfaceC0712d = (InterfaceC0712d) mVar.f8758c.getValue();
                if (interfaceC0712d != null) {
                    C0713e c0713e = (C0713e) interfaceC0712d;
                    c0713e.a.f(i7);
                    c0713e.f10939b.f(i7);
                }
                c2 = C.a;
            } else {
                c2 = null;
            }
            if (c2 == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
