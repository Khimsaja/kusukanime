package a0;

import H5.A;
import H5.C0263e0;
import H5.D;
import H5.InterfaceC0265f0;
import H5.h0;
import f6.AbstractC0905c;
import q.C1816D;
import y0.AbstractC2359f;
import y0.InterfaceC2366m;
import y0.Y;
import y0.b0;
import z0.C2471u;

/* loaded from: classes.dex */
public abstract class p implements InterfaceC2366m {

    /* renamed from: l, reason: collision with root package name */
    public M5.c f10403l;

    /* renamed from: m, reason: collision with root package name */
    public int f10404m;

    /* renamed from: o, reason: collision with root package name */
    public p f10406o;

    /* renamed from: p, reason: collision with root package name */
    public p f10407p;

    /* renamed from: q, reason: collision with root package name */
    public b0 f10408q;

    /* renamed from: r, reason: collision with root package name */
    public Y f10409r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10410s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10411t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10412u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10413v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10414w;

    /* renamed from: k, reason: collision with root package name */
    public p f10402k = this;

    /* renamed from: n, reason: collision with root package name */
    public int f10405n = -1;

    public void B0() {
        if (this.f10414w) {
            A0();
        } else {
            AbstractC0905c.C("reset() called on an unattached node");
            throw null;
        }
    }

    public void C0() {
        if (!this.f10414w) {
            AbstractC0905c.C("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f10412u) {
            AbstractC0905c.C("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f10412u = false;
        y0();
        this.f10413v = true;
    }

    public void D0() {
        if (!this.f10414w) {
            AbstractC0905c.C("node detached multiple times");
            throw null;
        }
        if (this.f10409r == null) {
            AbstractC0905c.C("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f10413v) {
            AbstractC0905c.C("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f10413v = false;
        z0();
    }

    public void E0(p pVar) {
        this.f10402k = pVar;
    }

    public void F0(Y y7) {
        this.f10409r = y7;
    }

    public final A u0() {
        M5.c cVar = this.f10403l;
        if (cVar != null) {
            return cVar;
        }
        M5.c cVarC = D.c(((C2471u) AbstractC2359f.w(this)).getCoroutineContext().plus(new h0((InterfaceC0265f0) ((C2471u) AbstractC2359f.w(this)).getCoroutineContext().get(C0263e0.f3843k))));
        this.f10403l = cVarC;
        return cVarC;
    }

    public boolean v0() {
        return !(this instanceof C1816D);
    }

    public void w0() {
        if (this.f10414w) {
            AbstractC0905c.C("node attached multiple times");
            throw null;
        }
        if (this.f10409r == null) {
            AbstractC0905c.C("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f10414w = true;
        this.f10412u = true;
    }

    public void x0() {
        if (!this.f10414w) {
            AbstractC0905c.C("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.f10412u) {
            AbstractC0905c.C("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.f10413v) {
            AbstractC0905c.C("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f10414w = false;
        M5.c cVar = this.f10403l;
        if (cVar != null) {
            D.h(cVar, new L5.o("The Modifier.Node was detached", 2));
            this.f10403l = null;
        }
    }

    public void A0() {
    }

    public void y0() {
    }

    public void z0() {
    }
}
