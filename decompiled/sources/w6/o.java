package w6;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.List;
import p.I0;

/* loaded from: classes.dex */
public abstract class o implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final v f17171k;

    static {
        v vVar;
        try {
            Class.forName("java.nio.file.Files");
            vVar = new w();
        } catch (ClassNotFoundException unused) {
            vVar = new v();
        }
        f17171k = vVar;
        String str = y.f17190l;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.l.e("getProperty(...)", property);
        I0.t(property);
        ClassLoader classLoader = x6.e.class.getClassLoader();
        kotlin.jvm.internal.l.e("getClassLoader(...)", classLoader);
        new x6.e(classLoader);
    }

    public abstract void b(y yVar);

    public final void e(y yVar) {
        kotlin.jvm.internal.l.f("path", yVar);
        b(yVar);
    }

    public final boolean g(y yVar) {
        kotlin.jvm.internal.l.f("path", yVar);
        return m(yVar) != null;
    }

    public abstract List i(y yVar);

    public final n j(y yVar) throws FileNotFoundException {
        kotlin.jvm.internal.l.f("path", yVar);
        n nVarM = m(yVar);
        if (nVarM != null) {
            return nVarM;
        }
        throw new FileNotFoundException("no such file: " + yVar);
    }

    public abstract n m(y yVar);

    public abstract u s(y yVar);

    public abstract G v(y yVar);

    public abstract H x(y yVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
