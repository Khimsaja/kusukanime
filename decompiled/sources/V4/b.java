package V4;

import P3.q;
import P3.r;
import b1.AbstractC0703b;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class b {
    public static final String a = q.y0(r.I('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f9481b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listI = r.I("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iB = r.B(0, listI.size() - 1, 2);
        if (iB >= 0) {
            int i7 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listI.get(i7));
                int i8 = i7 + 1;
                linkedHashMap.put(sb.toString(), listI.get(i8));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(AbstractC0703b.m(sb2, (String) listI.get(i7), "Array"), "[" + ((String) listI.get(i8)));
                if (i7 == iB) {
                    break;
                } else {
                    i7 += 2;
                }
            }
        }
        linkedHashMap.put(a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : r.I("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : r.I("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, AbstractC0703b.i("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i9 = 0; i9 < 23; i9++) {
            String strG = AbstractC0703b.g(i9, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i9);
            a(linkedHashMap, strG, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i9, str4 + "/reflect/KFunction");
        }
        for (String str5 : r.I("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, A6.b.h(str5, ".Companion"), a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f9481b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        l.f("classId", str);
        String str2 = (String) f9481b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + AbstractC2517v.Q(str, '.', '$') + ';';
    }
}
