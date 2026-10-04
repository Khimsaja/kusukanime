package O5;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: m, reason: collision with root package name */
    public static final e f7625m;

    static {
        int i7 = k.f7631c;
        int i8 = k.f7632d;
        long j7 = k.f7633e;
        String str = k.a;
        e eVar = new e();
        eVar.f7626l = new c(i7, i8, j7, str);
        f7625m = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // H5.AbstractC0281w
    public final String toString() {
        return "Dispatchers.Default";
    }
}
