package z6;

/* loaded from: classes.dex */
public interface b {
    boolean a();

    boolean b();

    void c(String str, Throwable th);

    void d(String str);

    void e(String str);

    boolean f();

    default boolean g(int i7) {
        char c2;
        if (i7 == 1) {
            c2 = '(';
        } else if (i7 == 2) {
            c2 = 30;
        } else if (i7 == 3) {
            c2 = 20;
        } else if (i7 == 4) {
            c2 = '\n';
        } else {
            if (i7 != 5) {
                throw null;
            }
            c2 = 0;
        }
        if (c2 == 0) {
            return j();
        }
        if (c2 == '\n') {
            return b();
        }
        if (c2 == 20) {
            return h();
        }
        if (c2 == 30) {
            return a();
        }
        if (c2 == '(') {
            return f();
        }
        StringBuilder sb = new StringBuilder("Level [");
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR");
        sb.append("] not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    boolean h();

    void i(String str);

    boolean j();

    void k(Throwable th);
}
