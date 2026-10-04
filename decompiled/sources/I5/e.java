package I5;

import B1.RunnableC0016c;
import H5.AbstractC0281w;
import H5.C0263e0;
import H5.C0270k;
import H5.I;
import H5.InterfaceC0265f0;
import H5.M;
import H5.N;
import H5.r0;
import H5.z0;
import M5.m;
import S3.h;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends AbstractC0281w implements I {

    /* renamed from: l, reason: collision with root package name */
    public final Handler f4072l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4073m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4074n;

    /* renamed from: o, reason: collision with root package name */
    public final e f4075o;

    public e(Handler handler, String str, boolean z7) {
        this.f4072l = handler;
        this.f4073m = str;
        this.f4074n = z7;
        this.f4075o = z7 ? this : new e(handler, str, true);
    }

    @Override // H5.AbstractC0281w
    public final void W(h hVar, Runnable runnable) {
        if (this.f4072l.post(runnable)) {
            return;
        }
        a0(hVar, runnable);
    }

    @Override // H5.AbstractC0281w
    public final boolean Y(h hVar) {
        return (this.f4074n && l.a(Looper.myLooper(), this.f4072l.getLooper())) ? false : true;
    }

    public final void a0(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) hVar.get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            interfaceC0265f0.e(cancellationException);
        }
        O5.e eVar = M.a;
        O5.d.f7623l.W(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f4072l == this.f4072l && eVar.f4074n == this.f4074n;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4072l) ^ (this.f4074n ? 1231 : 1237);
    }

    @Override // H5.I
    public final void i(long j7, C0270k c0270k) {
        RunnableC0016c runnableC0016c = new RunnableC0016c(11, c0270k, this);
        if (j7 > 4611686018427387903L) {
            j7 = 4611686018427387903L;
        }
        if (this.f4072l.postDelayed(runnableC0016c, j7)) {
            c0270k.t(new d(0, this, runnableC0016c));
        } else {
            a0(c0270k.f3856o, runnableC0016c);
        }
    }

    @Override // H5.AbstractC0281w
    public final String toString() {
        e eVar;
        String str;
        O5.e eVar2 = M.a;
        e eVar3 = m.a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f4075o;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f4073m;
        if (string == null) {
            string = this.f4072l.toString();
        }
        return this.f4074n ? A6.b.h(string, ".immediate") : string;
    }

    @Override // H5.I
    public final N v(long j7, final z0 z0Var, h hVar) {
        if (j7 > 4611686018427387903L) {
            j7 = 4611686018427387903L;
        }
        if (this.f4072l.postDelayed(z0Var, j7)) {
            return new N() { // from class: I5.c
                @Override // H5.N
                public final void dispose() {
                    this.f4067k.f4072l.removeCallbacks(z0Var);
                }
            };
        }
        a0(hVar, z0Var);
        return r0.f3878k;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
