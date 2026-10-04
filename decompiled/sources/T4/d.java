package T4;

/* loaded from: classes.dex */
public abstract class d {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9067b;

    public d(int i7, int i8) {
        this.a = i7;
        this.f9067b = i8;
    }

    public static b a(d dVar) {
        return new b(dVar.a + dVar.f9067b, 1);
    }

    public static b b() {
        return new b(0, 1);
    }
}
