package H5;

/* loaded from: classes.dex */
public abstract class w0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static W a() {
        ThreadLocal threadLocal = a;
        W w7 = (W) threadLocal.get();
        if (w7 != null) {
            return w7;
        }
        C0266g c0266g = new C0266g(Thread.currentThread());
        threadLocal.set(c0266g);
        return c0266g;
    }
}
