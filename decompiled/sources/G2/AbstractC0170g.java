package G2;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l4.InterfaceC1425d;
import v1.C2147a;

/* renamed from: G2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0170g {
    public static String a(Context context, int i7) {
        String strValueOf;
        kotlin.jvm.internal.l.f("context", context);
        if (i7 <= 16777215) {
            return String.valueOf(i7);
        }
        try {
            strValueOf = context.getResources().getResourceName(i7);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i7);
        }
        kotlin.jvm.internal.l.e("try {\n                  …tring()\n                }", strValueOf);
        return strValueOf;
    }

    public static y5.h b(y yVar) {
        kotlin.jvm.internal.l.f("<this>", yVar);
        return y5.k.S(C0165b.f2690s, yVar);
    }

    public static s c(V v5) {
        r rVar = s.f2731c;
        C2147a c2147a = C2147a.f16519b;
        kotlin.jvm.internal.l.f("defaultCreationExtras", c2147a);
        A2.b bVar = new A2.b(v5, rVar, c2147a);
        InterfaceC1425d interfaceC1425dI = n6.m.I(s.class);
        String strK = interfaceC1425dI.k();
        if (strK != null) {
            return (s) bVar.w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK), interfaceC1425dI);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static String d(Class cls) {
        LinkedHashMap linkedHashMap = P.f2682b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            N n7 = (N) cls.getAnnotation(N.class);
            strValue = n7 != null ? n7.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        kotlin.jvm.internal.l.c(strValue);
        return strValue;
    }

    public static final ArrayList e(LinkedHashMap linkedHashMap, e4.k kVar) {
        kotlin.jvm.internal.l.f("<this>", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C0169f c0169f = (C0169f) entry.getValue();
            Boolean bool = c0169f != null ? Boolean.FALSE : null;
            kotlin.jvm.internal.l.c(bool);
            if (!bool.booleanValue() && !c0169f.f2697b) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) kVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final H f(e4.k kVar) {
        I i7 = new I();
        kVar.invoke(i7);
        boolean z7 = i7.f2670b;
        G g4 = i7.a;
        boolean z8 = i7.f2671c;
        String str = i7.f2673e;
        if (str != null) {
            boolean z9 = i7.f2674f;
            boolean z10 = i7.f2675g;
            g4.f2658b = str;
            g4.a = -1;
            g4.f2659c = z9;
            g4.f2660d = z10;
        } else {
            int i8 = i7.f2672d;
            boolean z11 = i7.f2674f;
            boolean z12 = i7.f2675g;
            g4.a = i8;
            g4.f2658b = null;
            g4.f2659c = z11;
            g4.f2660d = z12;
        }
        String str2 = g4.f2658b;
        if (str2 == null) {
            return new H(z7, z8, g4.a, g4.f2659c, g4.f2660d, g4.f2661e, g4.f2662f);
        }
        boolean z13 = g4.f2659c;
        boolean z14 = g4.f2660d;
        int i9 = g4.f2661e;
        int i10 = g4.f2662f;
        int i11 = y.f2756r;
        H h7 = new H(z7, z8, "android-app://androidx.navigation/".concat(str2).hashCode(), z13, z14, i9, i10);
        h7.f2669h = str2;
        return h7;
    }
}
