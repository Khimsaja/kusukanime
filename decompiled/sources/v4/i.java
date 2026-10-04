package v4;

import P3.q;
import P3.x;
import f6.AbstractC0915m;
import java.util.Iterator;
import java.util.List;
import u4.C2089E;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16654k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f16655l;

    public /* synthetic */ i(int i7, List list) {
        this.f16654k = i7;
        this.f16655l = list;
    }

    @Override // v4.h
    public final boolean d(W4.c cVar) {
        switch (this.f16654k) {
            case 1:
                kotlin.jvm.internal.l.f("fqName", cVar);
                Iterator it = ((Iterable) q.l0((List) this.f16655l).f7771b).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).d(cVar)) {
                        break;
                    }
                }
                break;
        }
        return AbstractC0915m.x(this, cVar);
    }

    @Override // v4.h
    public final boolean isEmpty() {
        switch (this.f16654k) {
            case 0:
                return ((List) this.f16655l).isEmpty();
            case 1:
                List list = (List) this.f16655l;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f16654k) {
            case 0:
                return ((List) this.f16655l).iterator();
            case 1:
                return new y5.e(new y5.g(q.l0((List) this.f16655l), k.f16659k, y5.m.f18389k));
            default:
                return x.f7778k;
        }
    }

    @Override // v4.h
    public final InterfaceC2154b l(W4.c cVar) {
        switch (this.f16654k) {
            case 0:
                return AbstractC0915m.p(this, cVar);
            case 1:
                kotlin.jvm.internal.l.f("fqName", cVar);
                y5.e eVar = (y5.e) y5.k.V(q.l0((List) this.f16655l), new C2089E(cVar, 1)).iterator();
                return (InterfaceC2154b) (!eVar.hasNext() ? null : eVar.next());
            default:
                kotlin.jvm.internal.l.f("fqName", cVar);
                if (cVar.equals((W4.c) this.f16655l)) {
                    return O4.b.a;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f16654k) {
            case 0:
                return ((List) this.f16655l).toString();
            default:
                return super.toString();
        }
    }

    public i(h[] hVarArr) {
        this.f16654k = 1;
        this.f16655l = P3.m.u0(hVarArr);
    }

    public i(W4.c cVar) {
        this.f16654k = 2;
        kotlin.jvm.internal.l.f("fqNameToMatch", cVar);
        this.f16655l = cVar;
    }
}
