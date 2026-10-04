package G2;

import android.os.Bundle;
import b1.AbstractC0703b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@N("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LG2/D;", "LG2/O;", "LG2/B;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class D extends O {

    /* renamed from: c, reason: collision with root package name */
    public final P f2628c;

    public D(P p7) {
        kotlin.jvm.internal.l.f("navigatorProvider", p7);
        this.f2628c = p7;
    }

    @Override // G2.O
    public final void d(List list, H h7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0174k c0174k = (C0174k) it.next();
            y yVar = c0174k.f2703l;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavGraph", yVar);
            B b4 = (B) yVar;
            Bundle bundleG = c0174k.g();
            int i7 = b4.f2622t;
            String str = b4.f2624v;
            if (i7 == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i8 = b4.f2762p;
                sb.append(i8 != 0 ? String.valueOf(i8) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            y yVarO = str != null ? b4.o(str, false) : (y) b4.f2621s.b(i7);
            if (yVarO == null) {
                if (b4.f2623u == null) {
                    String strValueOf = b4.f2624v;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(b4.f2622t);
                    }
                    b4.f2623u = strValueOf;
                }
                String str2 = b4.f2623u;
                kotlin.jvm.internal.l.c(str2);
                throw new IllegalArgumentException(AbstractC0703b.j("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            if (str != null && !str.equals(yVarO.f2763q)) {
                x xVarM = yVarO.m(str);
                Bundle bundle = xVarM != null ? xVarM.f2752l : null;
                if (bundle != null && !bundle.isEmpty()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putAll(bundle);
                    if (bundleG != null) {
                        bundle2.putAll(bundleG);
                    }
                    bundleG = bundle2;
                }
            }
            O oB = this.f2628c.b(yVarO.f2757k);
            C0178o c0178oB = b();
            Bundle bundleH = yVarO.h(bundleG);
            E e7 = c0178oB.f2726h;
            oB.d(P3.r.H(A.e.m(e7.a, yVarO, bundleH, e7.h(), e7.f2647p)), h7);
        }
    }

    @Override // G2.O
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public B a() {
        return new B(this);
    }
}
