package T1;

import B1.AbstractC0015b;
import B1.D;
import B1.K;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class s {
    public final i a;

    /* renamed from: b, reason: collision with root package name */
    public final v f8946b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8947c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8948d;

    /* renamed from: g, reason: collision with root package name */
    public long f8951g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8954j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8957m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8958n;

    /* renamed from: e, reason: collision with root package name */
    public int f8949e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f8950f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f8952h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f8953i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f8955k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public D f8956l = D.a;

    public s(Context context, i iVar, long j7) {
        this.a = iVar;
        this.f8947c = j7;
        this.f8946b = new v(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, boolean r36, T1.r r37) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.s.a(long, long, long, long, boolean, boolean, T1.r):int");
    }

    public final boolean b(boolean z7) {
        if (z7 && (this.f8949e == 3 || (!this.f8957m && this.f8958n))) {
            this.f8953i = -9223372036854775807L;
            return true;
        }
        if (this.f8953i == -9223372036854775807L) {
            return false;
        }
        this.f8956l.getClass();
        if (SystemClock.elapsedRealtime() < this.f8953i) {
            return true;
        }
        this.f8953i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z7) {
        long jElapsedRealtime;
        this.f8954j = z7;
        long j7 = this.f8947c;
        if (j7 > 0) {
            this.f8956l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j7;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.f8953i = jElapsedRealtime;
    }

    public final void d(int i7) {
        this.f8949e = Math.min(this.f8949e, i7);
    }

    public final void e() {
        this.f8948d = true;
        this.f8956l.getClass();
        this.f8951g = K.F(SystemClock.elapsedRealtime());
        v vVar = this.f8946b;
        vVar.f8967d = true;
        vVar.f8976m = 0L;
        vVar.f8979p = -1L;
        vVar.f8977n = -1L;
        t tVar = vVar.f8965b;
        if (tVar != null) {
            u uVar = vVar.f8966c;
            uVar.getClass();
            uVar.f8962l.sendEmptyMessage(2);
            Handler handlerL = K.l(null);
            DisplayManager displayManager = tVar.a;
            displayManager.registerDisplayListener(tVar, handlerL);
            v.a(tVar.f8959b, displayManager.getDisplay(0));
        }
        vVar.d(false);
    }

    public final void f() {
        this.f8948d = false;
        this.f8953i = -9223372036854775807L;
        v vVar = this.f8946b;
        vVar.f8967d = false;
        t tVar = vVar.f8965b;
        if (tVar != null) {
            tVar.a.unregisterDisplayListener(tVar);
            u uVar = vVar.f8966c;
            uVar.getClass();
            uVar.f8962l.sendEmptyMessage(3);
        }
        vVar.b();
    }

    public final void g(float f5) {
        AbstractC0015b.c(f5 > 0.0f);
        if (f5 == this.f8955k) {
            return;
        }
        this.f8955k = f5;
        v vVar = this.f8946b;
        vVar.f8972i = f5;
        vVar.f8976m = 0L;
        vVar.f8979p = -1L;
        vVar.f8977n = -1L;
        vVar.d(false);
    }
}
