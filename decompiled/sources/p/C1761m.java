package p;

import O.C0486d;
import O.C0493g0;
import O.R0;

/* renamed from: p.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1761m implements R0 {

    /* renamed from: k, reason: collision with root package name */
    public final B0 f14047k;

    /* renamed from: l, reason: collision with root package name */
    public final C0493g0 f14048l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC1766r f14049m;

    /* renamed from: n, reason: collision with root package name */
    public long f14050n;

    /* renamed from: o, reason: collision with root package name */
    public long f14051o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14052p;

    public /* synthetic */ C1761m(B0 b02, Object obj, AbstractC1766r abstractC1766r, int i7) {
        this(b02, obj, (i7 & 4) != 0 ? null : abstractC1766r, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object a() {
        return this.f14047k.f13838b.invoke(this.f14049m);
    }

    @Override // O.R0
    public final Object getValue() {
        return this.f14048l.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f14048l.getValue() + ", velocity=" + a() + ", isRunning=" + this.f14052p + ", lastFrameTimeNanos=" + this.f14050n + ", finishedTimeNanos=" + this.f14051o + ')';
    }

    public C1761m(B0 b02, Object obj, AbstractC1766r abstractC1766r, long j7, long j8, boolean z7) {
        AbstractC1766r abstractC1766rK;
        this.f14047k = b02;
        this.f14048l = C0486d.K(obj, O.T.f7049p);
        if (abstractC1766r != null) {
            abstractC1766rK = AbstractC1745d.k(abstractC1766r);
        } else {
            abstractC1766rK = (AbstractC1766r) b02.a.invoke(obj);
            abstractC1766rK.d();
        }
        this.f14049m = abstractC1766rK;
        this.f14050n = j7;
        this.f14051o = j8;
        this.f14052p = z7;
    }
}
