package c;

import a1.AbstractActivityC0658b;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.EnumC0689p;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.InterfaceC0692t;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.kusukanime.R;
import e.C0808a;
import e4.InterfaceC0821a;
import f.InterfaceC0845f;
import g1.C0937e;
import io.ktor.http.ContentType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import v1.C2149c;

/* loaded from: classes.dex */
public abstract class n extends AbstractActivityC0658b implements W, InterfaceC0684k, L2.f, y, InterfaceC0845f {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f11070C = 0;
    private static final i Companion = new i();

    /* renamed from: A, reason: collision with root package name */
    public final O3.q f11071A;

    /* renamed from: B, reason: collision with root package name */
    public final O3.q f11072B;

    /* renamed from: l, reason: collision with root package name */
    public final C0808a f11073l;

    /* renamed from: m, reason: collision with root package name */
    public final R1.d f11074m;

    /* renamed from: n, reason: collision with root package name */
    public final L2.e f11075n;

    /* renamed from: o, reason: collision with root package name */
    public V f11076o;

    /* renamed from: p, reason: collision with root package name */
    public final k f11077p;

    /* renamed from: q, reason: collision with root package name */
    public final O3.q f11078q;

    /* renamed from: r, reason: collision with root package name */
    public final l f11079r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f11080s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f11081t;

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f11082u;

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f11083v;

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f11084w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f11085x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11086y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11087z;

    public n() {
        C0808a c0808a = new C0808a();
        this.f11073l = c0808a;
        this.f11074m = new R1.d(1);
        M2.a aVar = new M2.a(this, new B3.q(1, this));
        L2.e eVar = new L2.e(aVar);
        this.f11075n = eVar;
        this.f11077p = new k(this);
        this.f11078q = z1.c.C(new m(this, 2));
        new AtomicInteger();
        this.f11079r = new l(this);
        this.f11080s = new CopyOnWriteArrayList();
        this.f11081t = new CopyOnWriteArrayList();
        this.f11082u = new CopyOnWriteArrayList();
        this.f11083v = new CopyOnWriteArrayList();
        this.f11084w = new CopyOnWriteArrayList();
        this.f11085x = new CopyOnWriteArrayList();
        androidx.lifecycle.x xVar = this.f10421k;
        if (xVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i7 = 0;
        xVar.a(new InterfaceC0692t(this) { // from class: c.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ n f11053l;

            {
                this.f11053l = this;
            }

            @Override // androidx.lifecycle.InterfaceC0692t
            public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
                Window window;
                View viewPeekDecorView;
                switch (i7) {
                    case 0:
                        if (enumC0688o == EnumC0688o.ON_STOP && (window = this.f11053l.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n nVar = this.f11053l;
                        if (enumC0688o == EnumC0688o.ON_DESTROY) {
                            nVar.f11073l.f11331b = null;
                            if (!nVar.isChangingConfigurations()) {
                                nVar.e().a();
                            }
                            k kVar = nVar.f11077p;
                            n nVar2 = kVar.f11060n;
                            nVar2.getWindow().getDecorView().removeCallbacks(kVar);
                            nVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i8 = 1;
        this.f10421k.a(new InterfaceC0692t(this) { // from class: c.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ n f11053l;

            {
                this.f11053l = this;
            }

            @Override // androidx.lifecycle.InterfaceC0692t
            public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
                Window window;
                View viewPeekDecorView;
                switch (i8) {
                    case 0:
                        if (enumC0688o == EnumC0688o.ON_STOP && (window = this.f11053l.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n nVar = this.f11053l;
                        if (enumC0688o == EnumC0688o.ON_DESTROY) {
                            nVar.f11073l.f11331b = null;
                            if (!nVar.isChangingConfigurations()) {
                                nVar.e().a();
                            }
                            k kVar = nVar.f11077p;
                            n nVar2 = kVar.f11060n;
                            nVar2.getWindow().getDecorView().removeCallbacks(kVar);
                            nVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.f10421k.a(new L2.b(this, 1));
        aVar.d();
        J.d(this);
        ((F.w) eVar.f6046m).J("android:support:activity-result", new C0743e(0, this));
        f fVar = new f(this);
        n nVar = c0808a.f11331b;
        if (nVar != null) {
            fVar.a(nVar);
        }
        c0808a.a.add(fVar);
        this.f11071A = z1.c.C(new m(this, 0));
        this.f11072B = z1.c.C(new m(this, 3));
    }

    @Override // c.y
    public final x a() {
        return (x) this.f11072B.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView);
        this.f11077p.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // L2.f
    public final F.w b() {
        return (F.w) this.f11075n.f6046m;
    }

    @Override // androidx.lifecycle.InterfaceC0684k
    public final Q c() {
        return (Q) this.f11071A.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0684k
    public final C2149c d() {
        C2149c c2149c = new C2149c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c2149c.a;
        if (application != null) {
            R1.i iVar = P.f10724d;
            Application application2 = getApplication();
            kotlin.jvm.internal.l.e(ContentType.Application.TYPE, application2);
            linkedHashMap.put(iVar, application2);
        }
        linkedHashMap.put(J.a, this);
        linkedHashMap.put(J.f10711b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(J.f10712c, extras);
        }
        return c2149c;
    }

    @Override // androidx.lifecycle.W
    public final V e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f11076o == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.f11076o = jVar.a;
            }
            if (this.f11076o == null) {
                this.f11076o = new V();
            }
        }
        V v5 = this.f11076o;
        kotlin.jvm.internal.l.c(v5);
        return v5;
    }

    @Override // androidx.lifecycle.InterfaceC0694v
    public final AbstractC0690q f() {
        return this.f10421k;
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView);
        J.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f11079r.a(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.l.f("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it = this.f11080s.iterator();
        while (it.hasNext()) {
            ((C0937e) it.next()).a(configuration);
        }
    }

    @Override // a1.AbstractActivityC0658b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f11075n.p1(bundle);
        C0808a c0808a = this.f11073l;
        c0808a.getClass();
        c0808a.f11331b = this;
        Iterator it = c0808a.a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i7 = F.f10705l;
        D.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        kotlin.jvm.internal.l.f("menu", menu);
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        getMenuInflater();
        Iterator it = this.f11074m.a.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        kotlin.jvm.internal.l.f("item", menuItem);
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 != 0) {
            return false;
        }
        Iterator it = this.f11074m.a.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7) {
        if (this.f11086y) {
            return;
        }
        Iterator it = this.f11083v.iterator();
        while (it.hasNext()) {
            ((C0937e) it.next()).a(new R1.i(7));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.l.f("intent", intent);
        super.onNewIntent(intent);
        Iterator it = this.f11082u.iterator();
        while (it.hasNext()) {
            ((C0937e) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        kotlin.jvm.internal.l.f("menu", menu);
        Iterator it = this.f11074m.a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7) {
        if (this.f11087z) {
            return;
        }
        Iterator it = this.f11084w.iterator();
        while (it.hasNext()) {
            ((C0937e) it.next()).a(new R1.i(8));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        kotlin.jvm.internal.l.f("menu", menu);
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = this.f11074m.a.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.l.f("permissions", strArr);
        kotlin.jvm.internal.l.f("grantResults", iArr);
        if (this.f11079r.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        V v5 = this.f11076o;
        if (v5 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            v5 = jVar.a;
        }
        if (v5 == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.a = v5;
        return jVar2;
    }

    @Override // a1.AbstractActivityC0658b, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.l.f("outState", bundle);
        androidx.lifecycle.x xVar = this.f10421k;
        if (xVar != null) {
            xVar.h(EnumC0689p.f10738m);
        }
        super.onSaveInstanceState(bundle);
        this.f11075n.q1(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f11081t.iterator();
        while (it.hasNext()) {
            ((C0937e) it.next()).a(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f11085x.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (n6.m.R()) {
                n6.m.m("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p pVar = (p) this.f11078q.getValue();
            synchronized (pVar.a) {
                try {
                    pVar.f11091b = true;
                    Iterator it = pVar.f11092c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0821a) it.next()).invoke();
                    }
                    pVar.f11092c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        h();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView);
        this.f11077p.a(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7) {
        kotlin.jvm.internal.l.f("intent", intent);
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.l.f("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        kotlin.jvm.internal.l.f("intent", intent);
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        kotlin.jvm.internal.l.f("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView);
        this.f11077p.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7, Configuration configuration) {
        kotlin.jvm.internal.l.f("newConfig", configuration);
        this.f11086y = true;
        try {
            super.onMultiWindowModeChanged(z7, configuration);
            this.f11086y = false;
            Iterator it = this.f11083v.iterator();
            while (it.hasNext()) {
                ((C0937e) it.next()).a(new R1.i(7));
            }
        } catch (Throwable th) {
            this.f11086y = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7, Configuration configuration) {
        kotlin.jvm.internal.l.f("newConfig", configuration);
        this.f11087z = true;
        try {
            super.onPictureInPictureModeChanged(z7, configuration);
            this.f11087z = false;
            Iterator it = this.f11084w.iterator();
            while (it.hasNext()) {
                ((C0937e) it.next()).a(new R1.i(8));
            }
        } catch (Throwable th) {
            this.f11087z = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("window.decorView", decorView);
        this.f11077p.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
