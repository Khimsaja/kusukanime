package H5;

/* loaded from: classes.dex */
public abstract class F {
    public static final I a;

    static {
        String property;
        I i7;
        int i8 = M5.s.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            O5.e eVar = M.a;
            I5.e eVar2 = M5.m.a;
            I5.e eVar3 = eVar2.f4075o;
            i7 = eVar2;
            if (eVar2 == null) {
                i7 = E.f3807s;
            }
        } else {
            i7 = E.f3807s;
        }
        a = i7;
    }
}
