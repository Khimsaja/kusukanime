package p;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC1753h {
    public final D0 a;

    /* renamed from: b, reason: collision with root package name */
    public final B0 f14075b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14076c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14077d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1766r f14078e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1766r f14079f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1766r f14080g;

    /* renamed from: h, reason: collision with root package name */
    public long f14081h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1766r f14082i;

    public n0(InterfaceC1760l interfaceC1760l, B0 b02, Object obj, Object obj2, AbstractC1766r abstractC1766r) {
        this.a = interfaceC1760l.a(b02);
        this.f14075b = b02;
        this.f14076c = obj2;
        this.f14077d = obj;
        this.f14078e = (AbstractC1766r) b02.a.invoke(obj);
        e4.k kVar = b02.a;
        this.f14079f = (AbstractC1766r) kVar.invoke(obj2);
        this.f14080g = abstractC1766r != null ? AbstractC1745d.k(abstractC1766r) : ((AbstractC1766r) kVar.invoke(obj)).c();
        this.f14081h = -1L;
    }

    @Override // p.InterfaceC1753h
    public final boolean a() {
        return this.a.a();
    }

    @Override // p.InterfaceC1753h
    public final Object b(long j7) {
        if (g(j7)) {
            return this.f14076c;
        }
        AbstractC1766r abstractC1766rI = this.a.i(j7, this.f14078e, this.f14079f, this.f14080g);
        int iB = abstractC1766rI.b();
        for (int i7 = 0; i7 < iB; i7++) {
            if (Float.isNaN(abstractC1766rI.a(i7))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + abstractC1766rI + ". Animation: " + this + ", playTimeNanos: " + j7);
            }
        }
        return this.f14075b.f13838b.invoke(abstractC1766rI);
    }

    @Override // p.InterfaceC1753h
    public final long c() {
        if (this.f14081h < 0) {
            this.f14081h = this.a.b(this.f14078e, this.f14079f, this.f14080g);
        }
        return this.f14081h;
    }

    @Override // p.InterfaceC1753h
    public final B0 d() {
        return this.f14075b;
    }

    @Override // p.InterfaceC1753h
    public final Object e() {
        return this.f14076c;
    }

    @Override // p.InterfaceC1753h
    public final AbstractC1766r f(long j7) {
        if (!g(j7)) {
            return this.a.e(j7, this.f14078e, this.f14079f, this.f14080g);
        }
        AbstractC1766r abstractC1766r = this.f14082i;
        if (abstractC1766r != null) {
            return abstractC1766r;
        }
        AbstractC1766r abstractC1766rD = this.a.d(this.f14078e, this.f14079f, this.f14080g);
        this.f14082i = abstractC1766rD;
        return abstractC1766rD;
    }

    public final void h(Object obj) {
        if (kotlin.jvm.internal.l.a(obj, this.f14077d)) {
            return;
        }
        this.f14077d = obj;
        this.f14078e = (AbstractC1766r) this.f14075b.a.invoke(obj);
        this.f14082i = null;
        this.f14081h = -1L;
    }

    public final void i(Object obj) {
        if (kotlin.jvm.internal.l.a(this.f14076c, obj)) {
            return;
        }
        this.f14076c = obj;
        this.f14079f = (AbstractC1766r) this.f14075b.a.invoke(obj);
        this.f14082i = null;
        this.f14081h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f14077d + " -> " + this.f14076c + ",initial velocity: " + this.f14080g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
