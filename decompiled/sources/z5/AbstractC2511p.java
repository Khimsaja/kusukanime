package z5;

import P3.y;
import e5.AbstractC0832b;
import f6.AbstractC0915m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: z5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2511p extends AbstractC0832b {
    public static String E(String str) throws IOException {
        List listH;
        int length;
        Comparable comparable;
        kotlin.jvm.internal.l.f("<this>", str);
        C2503h c2503h = new C2503h(str);
        if (c2503h.hasNext()) {
            Object next = c2503h.next();
            if (c2503h.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c2503h.hasNext()) {
                    arrayList.add(c2503h.next());
                }
                listH = arrayList;
            } else {
                listH = P3.r.H(next);
            }
        } else {
            listH = y.f7779k;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listH) {
            if (!AbstractC2510o.g0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(P3.r.p(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!AbstractC0915m.B(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listH.size();
        int iY = P3.r.y(listH);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listH) {
            int i7 = length + 1;
            if (length < 0) {
                P3.r.X();
                throw null;
            }
            String str3 = (String) obj2;
            String strY = ((length == 0 || length == iY) && AbstractC2510o.g0(str3)) ? null : AbstractC2510o.Y(iIntValue, str3);
            if (strY != null) {
                arrayList4.add(strY);
            }
            length = i7;
        }
        StringBuilder sb = new StringBuilder(length3);
        P3.q.x0(arrayList4, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String F(String str) throws IOException {
        List listH;
        kotlin.jvm.internal.l.f("<this>", str);
        if (AbstractC2510o.g0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        C2503h c2503h = new C2503h(str);
        if (c2503h.hasNext()) {
            Object next = c2503h.next();
            if (c2503h.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c2503h.hasNext()) {
                    arrayList.add(c2503h.next());
                }
                listH = arrayList;
            } else {
                listH = P3.r.H(next);
            }
        } else {
            listH = y.f7779k;
        }
        int length = str.length();
        listH.size();
        int iY = P3.r.y(listH);
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        for (Object obj : listH) {
            int i8 = i7 + 1;
            String strSubstring = null;
            if (i7 < 0) {
                P3.r.X();
                throw null;
            }
            String str2 = (String) obj;
            if ((i7 != 0 && i7 != iY) || !AbstractC2510o.g0(str2)) {
                int length2 = str2.length();
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        i9 = -1;
                        break;
                    }
                    if (!AbstractC0915m.B(str2.charAt(i9))) {
                        break;
                    }
                    i9++;
                }
                if (i9 != -1 && AbstractC2517v.S(i9, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i9);
                    kotlin.jvm.internal.l.e("substring(...)", strSubstring);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i7 = i8;
        }
        StringBuilder sb = new StringBuilder(length);
        P3.q.x0(arrayList2, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}
