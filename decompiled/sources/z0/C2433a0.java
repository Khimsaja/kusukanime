package z0;

import H5.AbstractC0281w;
import O.C0497i0;
import android.os.Handler;
import android.view.Choreographer;
import i4.C1076b;
import java.util.ArrayList;

/* renamed from: z0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2433a0 extends AbstractC0281w {

    /* renamed from: v, reason: collision with root package name */
    public static final O3.q f18722v = z1.c.C(P.f18664s);

    /* renamed from: w, reason: collision with root package name */
    public static final C1076b f18723w = new C1076b(2);

    /* renamed from: l, reason: collision with root package name */
    public final Choreographer f18724l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f18725m;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18730r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18731s;

    /* renamed from: u, reason: collision with root package name */
    public final C0497i0 f18733u;

    /* renamed from: n, reason: collision with root package name */
    public final Object f18726n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final P3.l f18727o = new P3.l();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f18728p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f18729q = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final Z f18732t = new Z(this);

    public C2433a0(Choreographer choreographer, Handler handler) {
        this.f18724l = choreographer;
        this.f18725m = handler;
        this.f18733u = new C0497i0(choreographer, this);
    }

    public static final void a0(C2433a0 c2433a0) {
        Runnable runnable;
        boolean z7;
        do {
            synchronized (c2433a0.f18726n) {
                P3.l lVar = c2433a0.f18727o;
                runnable = (Runnable) (lVar.isEmpty() ? null : lVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c2433a0.f18726n) {
                    P3.l lVar2 = c2433a0.f18727o;
                    runnable = (Runnable) (lVar2.isEmpty() ? null : lVar2.removeFirst());
                }
            }
            synchronized (c2433a0.f18726n) {
                if (c2433a0.f18727o.isEmpty()) {
                    z7 = false;
                    c2433a0.f18730r = false;
                } else {
                    z7 = true;
                }
            }
        } while (z7);
    }

    @Override // H5.AbstractC0281w
    public final void W(S3.h hVar, Runnable runnable) {
        synchronized (this.f18726n) {
            this.f18727o.addLast(runnable);
            if (!this.f18730r) {
                this.f18730r = true;
                this.f18725m.post(this.f18732t);
                if (!this.f18731s) {
                    this.f18731s = true;
                    this.f18724l.postFrameCallback(this.f18732t);
                }
            }
        }
    }
}
