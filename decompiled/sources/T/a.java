package T;

import F5.q;
import f4.InterfaceC0884d;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a extends F5.a implements InterfaceC0884d {

    /* renamed from: n, reason: collision with root package name */
    public final F5.i f8815n;

    /* renamed from: o, reason: collision with root package name */
    public Object f8816o;

    public a(F5.i iVar, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.f8815n = iVar;
        this.f8816o = obj2;
    }

    @Override // F5.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f8816o;
    }

    @Override // F5.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f8816o;
        this.f8816o = obj;
        c cVar = (c) this.f8815n.f2533l;
        W.c cVar2 = cVar.f8820o;
        Object obj3 = this.f2504l;
        if (!cVar2.containsKey(obj3)) {
            return obj2;
        }
        boolean z7 = cVar.f2518m;
        if (!z7) {
            cVar2.put(obj3, obj);
        } else {
            if (!z7) {
                throw new NoSuchElementException();
            }
            q qVar = ((q[]) cVar.f2519n)[cVar.f2517l];
            Object obj4 = qVar.f2548l[qVar.f2550n];
            cVar2.put(obj3, obj);
            cVar.h(obj4 != null ? obj4.hashCode() : 0, cVar2.f9506l, obj4, 0);
        }
        cVar.f8823r = cVar2.f9508n;
        return obj2;
    }
}
