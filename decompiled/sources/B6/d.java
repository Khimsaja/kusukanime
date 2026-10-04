package B6;

import java.io.PrintStream;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public abstract class d {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f551b;

    static {
        int i7;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i8 = 2;
        if (property == null || property.isEmpty()) {
            i7 = 1;
        } else {
            for (int i9 = 0; i9 < 3; i9++) {
                if (strArr[i9].equalsIgnoreCase(property)) {
                    i7 = 2;
                    break;
                }
            }
            i7 = 1;
        }
        a = i7;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i8 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i8 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i8 = 3;
            }
        }
        f551b = i8;
    }

    public static final void a(String str, Throwable th) {
        b().println("SLF4J(E): " + str);
        b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(b());
    }

    public static PrintStream b() {
        return AbstractC1755i.b(a) != 1 ? System.err : System.out;
    }

    public static final void c(String str) {
        if (AbstractC1755i.b(3) >= AbstractC1755i.b(f551b)) {
            b().println("SLF4J(W): " + str);
        }
    }
}
