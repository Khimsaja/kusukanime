package L5;

import O3.C;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: k, reason: collision with root package name */
    public d[] f6157k;

    /* renamed from: l, reason: collision with root package name */
    public int f6158l;

    /* renamed from: m, reason: collision with root package name */
    public int f6159m;

    /* renamed from: n, reason: collision with root package name */
    public y f6160n;

    public final d c() {
        d dVarD;
        y yVar;
        synchronized (this) {
            try {
                d[] dVarArrE = this.f6157k;
                if (dVarArrE == null) {
                    dVarArrE = e();
                    this.f6157k = dVarArrE;
                } else if (this.f6158l >= dVarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrE, dVarArrE.length * 2);
                    kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
                    this.f6157k = (d[]) objArrCopyOf;
                    dVarArrE = (d[]) objArrCopyOf;
                }
                int i7 = this.f6159m;
                do {
                    dVarD = dVarArrE[i7];
                    if (dVarD == null) {
                        dVarD = d();
                        dVarArrE[i7] = dVarD;
                    }
                    i7++;
                    if (i7 >= dVarArrE.length) {
                        i7 = 0;
                    }
                } while (!dVarD.a(this));
                this.f6159m = i7;
                this.f6158l++;
                yVar = this.f6160n;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.u(1);
        }
        return dVarD;
    }

    public abstract d d();

    public abstract d[] e();

    public final void f(d dVar) {
        y yVar;
        int i7;
        S3.c[] cVarArrB;
        synchronized (this) {
            try {
                int i8 = this.f6158l - 1;
                this.f6158l = i8;
                yVar = this.f6160n;
                if (i8 == 0) {
                    this.f6159m = 0;
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>", dVar);
                cVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (S3.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(C.a);
            }
        }
        if (yVar != null) {
            yVar.u(-1);
        }
    }

    public final y g() {
        y yVar;
        synchronized (this) {
            yVar = this.f6160n;
            if (yVar == null) {
                int i7 = this.f6158l;
                yVar = new y(1, Integer.MAX_VALUE, J5.c.f4300l);
                yVar.a(Integer.valueOf(i7));
                this.f6160n = yVar;
            }
        }
        return yVar;
    }
}
