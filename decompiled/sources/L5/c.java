package L5;

import F2.G;
import kotlin.jvm.internal.B;

/* loaded from: classes.dex */
public abstract class c {
    public static final S3.c[] a = new S3.c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final G f6161b = new G("NULL", 1);

    public static final Object a(S3.h hVar, Object obj, Object obj2, e4.n nVar, S3.c cVar) {
        Object objInvoke;
        Object objN = M5.a.n(hVar, obj2);
        try {
            x xVar = new x(cVar, hVar);
            if (nVar == null) {
                objInvoke = P3.r.c0(nVar, obj, xVar);
            } else {
                B.e(2, nVar);
                objInvoke = nVar.invoke(obj, xVar);
            }
            M5.a.g(hVar, objN);
            if (objInvoke == T3.a.f9048k) {
                kotlin.jvm.internal.l.f("frame", cVar);
            }
            return objInvoke;
        } catch (Throwable th) {
            M5.a.g(hVar, objN);
            throw th;
        }
    }
}
