package G2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public abstract class z {
    public final O a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2764b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2765c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2766d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f2767e = new LinkedHashMap();

    public z(O o7, String str) {
        this.a = o7;
        this.f2764b = str;
    }

    public y a() {
        y yVarB = b();
        yVarB.getClass();
        for (Map.Entry entry : this.f2765c.entrySet()) {
            String str = (String) entry.getKey();
            C0169f c0169f = (C0169f) entry.getValue();
            kotlin.jvm.internal.l.f("argumentName", str);
            kotlin.jvm.internal.l.f("argument", c0169f);
            yVarB.f2761o.put(str, c0169f);
        }
        Iterator it = this.f2766d.iterator();
        while (it.hasNext()) {
            yVarB.a((w) it.next());
        }
        Iterator it2 = this.f2767e.entrySet().iterator();
        Object obj = null;
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            kotlin.jvm.internal.l.f("action", null);
            throw null;
        }
        String str2 = this.f2764b;
        if (str2 != null) {
            if (AbstractC2510o.g0(str2)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            yVarB.f2762p = strConcat.hashCode();
            yVarB.a(new w(strConcat));
            ArrayList arrayList = yVarB.f2759m;
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                String str3 = ((w) next).a;
                int i7 = y.f2756r;
                String str4 = yVarB.f2763q;
                if (str3.equals(str4 != null ? "android-app://androidx.navigation/".concat(str4) : "")) {
                    obj = next;
                    break;
                }
            }
            kotlin.jvm.internal.B.a(arrayList);
            arrayList.remove(obj);
            yVarB.f2763q = str2;
        }
        return yVarB;
    }

    public y b() {
        return this.a.a();
    }
}
