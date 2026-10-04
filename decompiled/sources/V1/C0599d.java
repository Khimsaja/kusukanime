package V1;

/* renamed from: V1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599d implements A {
    public final InterfaceC0601f a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9365b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9366c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9367d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9368e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9369f;

    public C0599d(InterfaceC0601f interfaceC0601f, long j7, long j8, long j9, long j10, long j11) {
        this.a = interfaceC0601f;
        this.f9365b = j7;
        this.f9366c = j8;
        this.f9367d = j9;
        this.f9368e = j10;
        this.f9369f = j11;
    }

    @Override // V1.A
    public final boolean g() {
        return true;
    }

    @Override // V1.A
    public final z j(long j7) {
        B b4 = new B(j7, C0600e.a(this.a.d(j7), 0L, this.f9366c, this.f9367d, this.f9368e, this.f9369f));
        return new z(b4, b4);
    }

    @Override // V1.A
    public final long l() {
        return this.f9365b;
    }
}
