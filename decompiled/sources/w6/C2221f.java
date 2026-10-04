package w6;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p.I0;

/* renamed from: w6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2221f extends J {

    /* renamed from: h, reason: collision with root package name */
    public static final F5.o f17139h;

    /* renamed from: i, reason: collision with root package name */
    public static C2221f f17140i;

    /* renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f17141j;

    /* renamed from: k, reason: collision with root package name */
    public static final Condition f17142k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f17143l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f17144m;

    /* renamed from: e, reason: collision with root package name */
    public int f17145e;

    /* renamed from: f, reason: collision with root package name */
    public int f17146f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f17147g;

    static {
        F5.o oVar = new F5.o((char) 0, 11);
        oVar.f2542m = new C2221f[8];
        f17139h = oVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f17141j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.l.e("newCondition(...)", conditionNewCondition);
        f17142k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f17143l = millis;
        f17144m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j7 = this.f17128c;
        boolean z7 = this.a;
        if (j7 != 0 || z7) {
            ReentrantLock reentrantLock = f17141j;
            reentrantLock.lock();
            try {
                if (this.f17145e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f17145e = 1;
                I0.n(this, j7, z7);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = f17141j;
        reentrantLock.lock();
        try {
            int i7 = this.f17145e;
            this.f17145e = 0;
            if (i7 != 1) {
                return i7 == 2;
            }
            f17139h.u(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}
