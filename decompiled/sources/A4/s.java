package A4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s extends x implements N4.e {
    public final Constructor a;

    public s(Constructor constructor) {
        kotlin.jvm.internal.l.f("member", constructor);
        this.a = constructor;
    }

    @Override // A4.x
    public final Member b() {
        return this.a;
    }

    @Override // N4.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        kotlin.jvm.internal.l.e("getTypeParameters(...)", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new D(typeVariable));
        }
        return arrayList;
    }
}
