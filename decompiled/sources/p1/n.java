package p1;

import B1.I;
import B1.w;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import f.AbstractC0847h;
import g1.AbstractC0935c;
import g1.C0936d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.I0;
import v.c0;

/* loaded from: classes.dex */
public final class n implements f {

    /* renamed from: k, reason: collision with root package name */
    public final Context f14183k;

    /* renamed from: l, reason: collision with root package name */
    public final C0936d f14184l;

    /* renamed from: m, reason: collision with root package name */
    public final I0 f14185m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f14186n;

    /* renamed from: o, reason: collision with root package name */
    public Handler f14187o;

    /* renamed from: p, reason: collision with root package name */
    public ThreadPoolExecutor f14188p;

    /* renamed from: q, reason: collision with root package name */
    public ThreadPoolExecutor f14189q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0847h f14190r;

    public n(Context context, C0936d c0936d) {
        I0 i02 = o.f14191d;
        this.f14186n = new Object();
        e3.c.g("Context cannot be null", context);
        this.f14183k = context.getApplicationContext();
        this.f14184l = c0936d;
        this.f14185m = i02;
    }

    @Override // p1.f
    public final void a(AbstractC0847h abstractC0847h) {
        synchronized (this.f14186n) {
            this.f14190r = abstractC0847h;
        }
        synchronized (this.f14186n) {
            try {
                if (this.f14190r == null) {
                    return;
                }
                if (this.f14188p == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new I("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f14189q = threadPoolExecutor;
                    this.f14188p = threadPoolExecutor;
                }
                this.f14188p.execute(new w(22, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f14186n) {
            try {
                this.f14190r = null;
                Handler handler = this.f14187o;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f14187o = null;
                ThreadPoolExecutor threadPoolExecutor = this.f14189q;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f14188p = null;
                this.f14189q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g1.i c() {
        try {
            I0 i02 = this.f14185m;
            Context context = this.f14183k;
            C0936d c0936d = this.f14184l;
            i02.getClass();
            Object[] objArr = {c0936d};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            F5.o oVarA = AbstractC0935c.a(context, Collections.unmodifiableList(arrayList));
            int i7 = oVarA.f2541l;
            if (i7 != 0) {
                throw new RuntimeException(c0.a(i7, "fetchFonts failed (", ")"));
            }
            g1.i[] iVarArr = (g1.i[]) ((List) oVarA.f2542m).get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
