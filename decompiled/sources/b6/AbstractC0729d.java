package b6;

import z5.AbstractC2517v;

/* renamed from: b6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0729d {
    public static final int a;

    static {
        Object objR;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objR = property != null ? AbstractC2517v.U(property) : null;
        } catch (Throwable th) {
            objR = P3.r.r(th);
        }
        Integer num = (Integer) (objR instanceof O3.n ? null : objR);
        a = num != null ? num.intValue() : 2097152;
    }
}
