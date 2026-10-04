package T1;

import B1.K;
import H1.C0234o;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import y1.b0;

/* loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* renamed from: k, reason: collision with root package name */
    public final Handler f8877k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f8878l;

    public h(i iVar, M1.m mVar) {
        this.f8878l = iVar;
        Handler handlerL = K.l(this);
        this.f8877k = handlerL;
        mVar.n(this, handlerL);
    }

    public final void a(long j7) {
        Surface surface;
        i iVar = this.f8878l;
        if (this != iVar.f8912t1 || iVar.f6506U == null) {
            return;
        }
        if (j7 == Long.MAX_VALUE) {
            iVar.f6488F0 = true;
            return;
        }
        try {
            iVar.v0(j7);
            b0 b0Var = iVar.f8907o1;
            boolean zEquals = b0Var.equals(b0.f18027d);
            J1.j jVar = iVar.f8884O0;
            if (!zEquals && !b0Var.equals(iVar.f8908p1)) {
                iVar.f8908p1 = b0Var;
                jVar.b(b0Var);
            }
            iVar.f6492H0.f3475e++;
            s sVar = iVar.f8887R0;
            boolean z7 = sVar.f8949e != 3;
            sVar.f8949e = 3;
            sVar.f8956l.getClass();
            sVar.f8951g = K.F(SystemClock.elapsedRealtime());
            if (z7 && (surface = iVar.f8896b1) != null) {
                Handler handler = jVar.a;
                if (handler != null) {
                    handler.post(new y(jVar, surface, SystemClock.elapsedRealtime()));
                }
                iVar.f8899e1 = true;
            }
            iVar.d0(j7);
        } catch (C0234o e7) {
            iVar.f6490G0 = e7;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i8 = message.arg2;
        int i9 = K.a;
        a(((i7 & 4294967295L) << 32) | (4294967295L & i8));
        return true;
    }
}
