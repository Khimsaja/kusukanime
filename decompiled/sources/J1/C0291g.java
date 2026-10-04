package J1;

/* renamed from: J1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291g {

    /* renamed from: d, reason: collision with root package name */
    public static final C0291g f4200d = new C0290f().a();
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4201b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4202c;

    public C0291g(C0290f c0290f) {
        this.a = c0290f.a;
        this.f4201b = c0290f.f4198b;
        this.f4202c = c0290f.f4199c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0291g.class != obj.getClass()) {
            return false;
        }
        C0291g c0291g = (C0291g) obj;
        return this.a == c0291g.a && this.f4201b == c0291g.f4201b && this.f4202c == c0291g.f4202c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.f4201b ? 1 : 0) << 1) + (this.f4202c ? 1 : 0);
    }
}
