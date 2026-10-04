package D6;

/* loaded from: classes.dex */
public abstract class O {
    public static final ExecutorC0107a a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0108b f1682b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0108b f1683c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            f1682b = new C0108b(7);
            f1683c = new C0108b(6);
        } else if (property.equals("Dalvik")) {
            a = new ExecutorC0107a();
            f1682b = new P(0);
            f1683c = new C0110d(6);
        } else {
            a = null;
            f1682b = new P(1);
            f1683c = new C0110d(6);
        }
    }
}
