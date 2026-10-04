package B1;

/* loaded from: classes.dex */
public final class p {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public E3.b f346b = new E3.b();

    /* renamed from: c, reason: collision with root package name */
    public boolean f347c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f348d;

    public p(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
