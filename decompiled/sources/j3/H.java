package j3;

/* loaded from: classes.dex */
public final class H {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12278b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12279c;

    public H(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.f12278b = obj2;
        this.f12279c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f12278b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f12279c);
        return new IllegalArgumentException(sb.toString());
    }
}
