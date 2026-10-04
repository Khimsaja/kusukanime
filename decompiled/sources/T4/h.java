package T4;

import O3.r;
import P3.q;
import R4.L;
import R4.M;
import R4.N;
import R4.O;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h implements g {
    public final O a;

    /* renamed from: b, reason: collision with root package name */
    public final N f9110b;

    public h(O o7, N n7) {
        l.f("strings", o7);
        l.f("qualifiedNames", n7);
        this.a = o7;
        this.f9110b = n7;
    }

    @Override // T4.g
    public final String a(int i7) {
        String str = (String) this.a.f8253l.get(i7);
        l.e("getString(...)", str);
        return str;
    }

    @Override // T4.g
    public final boolean b(int i7) {
        return ((Boolean) d(i7).f7540m).booleanValue();
    }

    @Override // T4.g
    public final String c(int i7) throws IOException {
        r rVarD = d(i7);
        List list = (List) rVarD.f7538k;
        String strY0 = q.y0((List) rVarD.f7539l, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strY0;
        }
        return q.y0(list, "/", null, null, null, 62) + '/' + strY0;
    }

    public final r d(int i7) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z7 = false;
        while (i7 != -1) {
            M m7 = (M) this.f9110b.f8247l.get(i7);
            String str = (String) this.a.f8253l.get(m7.f8240n);
            L l7 = m7.f8241o;
            l.c(l7);
            int iOrdinal = l7.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    throw new D6.r();
                }
                linkedList2.addFirst(str);
                z7 = true;
            }
            i7 = m7.f8239m;
        }
        return new r(linkedList, linkedList2, Boolean.valueOf(z7));
    }
}
