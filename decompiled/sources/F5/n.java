package F5;

import P3.AbstractC0560a;
import i1.C1058k;
import java.util.Iterator;
import java.util.regex.Matcher;
import z5.C2504i;
import z5.C2506k;

/* loaded from: classes.dex */
public final class n extends AbstractC0560a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2538k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2539l;

    public /* synthetic */ n(int i7, Object obj) {
        this.f2538k = i7;
        this.f2539l = obj;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        switch (this.f2538k) {
            case 0:
                return ((d) this.f2539l).c();
            case 1:
                return ((T.b) this.f2539l).c();
            default:
                return ((C2506k) this.f2539l).a.groupCount() + 1;
        }
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f2538k) {
            case 0:
                return ((d) this.f2539l).containsValue(obj);
            case 1:
                return ((T.b) this.f2539l).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof C2504i) {
                    return super.contains((C2504i) obj);
                }
                return false;
        }
    }

    public C2504i h(int i7) {
        C2506k c2506k = (C2506k) this.f2539l;
        Matcher matcher = c2506k.a;
        k4.g gVarL = e3.c.L(matcher.start(i7), matcher.end(i7));
        if (gVarL.f12672k < 0) {
            return null;
        }
        String strGroup = c2506k.a.group(i7);
        kotlin.jvm.internal.l.e("group(...)", strGroup);
        return new C2504i(strGroup, gVarL);
    }

    @Override // P3.AbstractC0560a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f2538k) {
            case 2:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2538k) {
            case 0:
                p pVar = ((d) this.f2539l).f2514k;
                kotlin.jvm.internal.l.f("node", pVar);
                q[] qVarArr = new q[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    qVarArr[i7] = new r(2);
                }
                return new m(pVar, qVarArr);
            case 1:
                T.h hVar = ((T.b) this.f2539l).f8818k;
                q[] qVarArr2 = new q[8];
                for (int i8 = 0; i8 < 8; i8++) {
                    qVarArr2[i8] = new T.i(2);
                }
                return new T.g(hVar, qVarArr2);
            default:
                return new C1058k(y5.k.U(P3.q.l0(new k4.g(0, size() - 1, 1)), new A3.d(27, this)));
        }
    }

    public n(d dVar) {
        this.f2538k = 0;
        kotlin.jvm.internal.l.f("map", dVar);
        this.f2539l = dVar;
    }
}
