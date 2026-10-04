package S3;

import A3.C0006a;
import e4.n;
import java.io.Serializable;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final h f8764k;

    /* renamed from: l, reason: collision with root package name */
    public final f f8765l;

    public b(f fVar, h hVar) {
        l.f("left", hVar);
        l.f("element", fVar);
        this.f8764k = hVar;
        this.f8765l = fVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            bVar.getClass();
            int i7 = 2;
            b bVar2 = bVar;
            int i8 = 2;
            while (true) {
                h hVar = bVar2.f8764k;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i8++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f8764k;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i8 == i7) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f8765l;
                    if (!l.a(bVar.get(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f8764k;
                    if (!(hVar3 instanceof b)) {
                        l.d("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", hVar3);
                        f fVar2 = (f) hVar3;
                        zA = l.a(bVar.get(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // S3.h
    public final Object fold(Object obj, n nVar) {
        return nVar.invoke(this.f8764k.fold(obj, nVar), this.f8765l);
    }

    @Override // S3.h
    public final f get(g gVar) {
        l.f("key", gVar);
        b bVar = this;
        while (true) {
            f fVar = bVar.f8765l.get(gVar);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f8764k;
            if (!(hVar instanceof b)) {
                return hVar.get(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final int hashCode() {
        return this.f8765l.hashCode() + this.f8764k.hashCode();
    }

    @Override // S3.h
    public final h minusKey(g gVar) {
        l.f("key", gVar);
        f fVar = this.f8765l;
        f fVar2 = fVar.get(gVar);
        h hVar = this.f8764k;
        if (fVar2 != null) {
            return hVar;
        }
        h hVarMinusKey = hVar.minusKey(gVar);
        return hVarMinusKey == hVar ? this : hVarMinusKey == i.f8767k ? fVar : new b(fVar, hVarMinusKey);
    }

    @Override // S3.h
    public final h plus(h hVar) {
        l.f("context", hVar);
        return hVar == i.f8767k ? this : (h) hVar.fold(this, new C0006a(22));
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("["), (String) fold("", new C0006a(21)), ']');
    }
}
