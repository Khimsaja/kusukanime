package G2;

import java.util.ArrayList;
import java.util.Iterator;
import m.C1478H;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class C extends z {

    /* renamed from: f, reason: collision with root package name */
    public final P f2625f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2626g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2627h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p7) {
        super(p7.b(AbstractC0170g.d(D.class)), null);
        kotlin.jvm.internal.l.f("provider", p7);
        this.f2627h = new ArrayList();
        this.f2625f = p7;
        this.f2626g = "home";
    }

    public final B c() {
        int iHashCode;
        B b4 = (B) super.a();
        ArrayList arrayList = this.f2627h;
        kotlin.jvm.internal.l.f("nodes", arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar != null) {
                int i7 = yVar.f2762p;
                String str = yVar.f2763q;
                if (i7 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = b4.f2763q;
                if (str2 != null && kotlin.jvm.internal.l.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + yVar + " cannot have the same route as graph " + b4).toString());
                }
                if (i7 == b4.f2762p) {
                    throw new IllegalArgumentException(("Destination " + yVar + " cannot have the same id as graph " + b4).toString());
                }
                C1478H c1478h = b4.f2621s;
                y yVar2 = (y) c1478h.b(i7);
                if (yVar2 == yVar) {
                    continue;
                } else {
                    if (yVar.f2758l != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (yVar2 != null) {
                        yVar2.f2758l = null;
                    }
                    yVar.f2758l = b4;
                    c1478h.d(yVar.f2762p, yVar);
                }
            }
        }
        String str3 = this.f2626g;
        if (str3 == null) {
            if (this.f2764b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str3 == null) {
            iHashCode = 0;
        } else {
            if (str3.equals(b4.f2763q)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + b4).toString());
            }
            if (AbstractC2510o.g0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        b4.f2622t = iHashCode;
        b4.f2624v = str3;
        return b4;
    }
}
