package z0;

import H1.C0221b;
import H5.C0270k;
import H5.InterfaceC0269j;
import O.C0497i0;
import O.C0522v0;
import android.view.View;
import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.InterfaceC0692t;
import androidx.lifecycle.InterfaceC0694v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h1 implements InterfaceC0692t {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M5.c f18763k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0497i0 f18764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0522v0 f18765m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18766n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f18767o;

    public h1(M5.c cVar, C0497i0 c0497i0, C0522v0 c0522v0, kotlin.jvm.internal.x xVar, View view) {
        this.f18763k = cVar;
        this.f18764l = c0497i0;
        this.f18765m = c0522v0;
        this.f18766n = xVar;
        this.f18767o = view;
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
        boolean z7;
        int i7 = e1.a[enumC0688o.ordinal()];
        InterfaceC0269j interfaceC0269jT = null;
        if (i7 == 1) {
            M5.c cVar = this.f18763k;
            H5.B b4 = H5.B.f3790k;
            H5.D.x(cVar, null, new g1(this.f18766n, this.f18765m, interfaceC0694v, this, this.f18767o, null), 1);
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    return;
                }
                this.f18765m.s();
                return;
            } else {
                C0522v0 c0522v0 = this.f18765m;
                synchronized (c0522v0.f7221b) {
                    c0522v0.f7236q = true;
                }
                return;
            }
        }
        C0497i0 c0497i0 = this.f18764l;
        if (c0497i0 != null) {
            C0221b c0221b = (C0221b) c0497i0.f7087m;
            synchronized (c0221b.f3405l) {
                try {
                    synchronized (c0221b.f3405l) {
                        z7 = c0221b.f3404k;
                    }
                    if (!z7) {
                        ArrayList arrayList = (ArrayList) c0221b.f3406m;
                        c0221b.f3406m = (ArrayList) c0221b.f3407n;
                        c0221b.f3407n = arrayList;
                        c0221b.f3404k = true;
                        int size = arrayList.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            ((S3.c) arrayList.get(i8)).resumeWith(O3.C.a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0522v0 c0522v02 = this.f18765m;
        synchronized (c0522v02.f7221b) {
            if (c0522v02.f7236q) {
                c0522v02.f7236q = false;
                interfaceC0269jT = c0522v02.t();
            }
        }
        if (interfaceC0269jT != null) {
            ((C0270k) interfaceC0269jT).resumeWith(O3.C.a);
        }
    }
}
