package N2;

import D6.r;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.kusukanime.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n6.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f6925d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f6926e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f6928c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f6927b = new HashSet();
    public final HashMap a = new HashMap();

    public a(Context context) {
        this.f6928c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f6925d == null) {
            synchronized (f6926e) {
                try {
                    if (f6925d == null) {
                        f6925d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f6925d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f6928c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f6927b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new r(e7);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (m.R()) {
            try {
                m.m(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f6928c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new r(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
