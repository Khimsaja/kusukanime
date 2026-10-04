package w5;

import P3.q;
import P3.r;
import P3.y;
import io.ktor.util.GzipHeaderFlags;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class k {
    public static final i a = new i();

    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List d(ArrayList arrayList) {
        l.f("<this>", arrayList);
        int size = arrayList.size();
        if (size == 0) {
            return y.f7779k;
        }
        if (size == 1) {
            return r.H(q.r0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static Object e(List list, a aVar, k kVar) {
        p2.l lVar = new p2.l(7);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f(it.next(), aVar, lVar, kVar);
        }
        return kVar.i();
    }

    public static void f(Object obj, a aVar, p2.l lVar, k kVar) {
        if (obj != null) {
            if (((HashSet) lVar.f14298b).add(obj) && kVar.c(obj)) {
                Iterator it = aVar.c(obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), aVar, lVar, kVar);
                }
                kVar.b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean g(List list, a aVar, e4.k kVar) {
        return (Boolean) e(list, aVar, new d5.d(kVar, new boolean[1], 2));
    }

    public static final boolean h(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!l.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void j(Object obj) throws Throwable {
        if (obj instanceof j) {
            throw ((j) obj).a;
        }
    }

    public abstract boolean c(Object obj);

    public abstract Object i();

    public void b(Object obj) {
    }
}
