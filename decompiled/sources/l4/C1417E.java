package l4;

import b1.AbstractC0703b;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: l4.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417E implements TypeVariable, Type {
    public final InterfaceC1445x a;

    public C1417E(InterfaceC1445x interfaceC1445x) {
        kotlin.jvm.internal.l.f("typeParameter", interfaceC1445x);
        this.a = interfaceC1445x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !kotlin.jvm.internal.l.a(this.a.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.a.getUpperBounds();
        ArrayList arrayList = new ArrayList(P3.r.p(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1420H.p((InterfaceC1444w) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new O3.k(AbstractC0703b.i("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.a));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.a.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.a.getName();
    }

    public final int hashCode() {
        this.a.getName().getClass();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.a.getName();
    }
}
