package t5;

import f4.InterfaceC0881a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n5.I;

/* loaded from: classes.dex */
public abstract class d implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public AbstractC2061a f16095k;

    public static String a(AbstractC2061a abstractC2061a, int i7, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i7 + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(abstractC2061a.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) I.f13362l.f6045l;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(P3.r.p(abstractC2061a, 10));
        int i8 = 0;
        for (Object obj : abstractC2061a) {
            int i9 = i8 + 1;
            Object obj2 = null;
            if (i8 < 0) {
                P3.r.X();
                throw null;
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((Number) ((Map.Entry) next).getValue()).intValue() == i8) {
                        obj2 = next;
                        break;
                    }
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i8 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i8 = i9;
        }
        sb.append("Content: " + A6.b.j(sb3, "]", '\n'));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.f16095k.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f16095k.iterator();
    }
}
