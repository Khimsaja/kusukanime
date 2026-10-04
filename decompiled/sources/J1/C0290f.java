package J1;

/* renamed from: J1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290f {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4198b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4199c;

    public C0291g a() {
        if (this.a || !(this.f4198b || this.f4199c)) {
            return new C0291g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
