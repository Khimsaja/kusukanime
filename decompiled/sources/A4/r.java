package A4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* loaded from: classes.dex */
public final class r extends C implements N4.d {
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final t f234b;

    public r(Type type) {
        t pVar;
        kotlin.jvm.internal.l.f("reflectType", type);
        this.a = type;
        if (type instanceof Class) {
            pVar = new p((Class) type);
        } else if (type instanceof TypeVariable) {
            pVar = new D((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.Class<*>", rawType);
            pVar = new p((Class) rawType);
        }
        this.f234b = pVar;
    }

    @Override // A4.C, N4.b
    public final C0012e a(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        return null;
    }

    @Override // A4.C
    public final Type b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c() {
        /*
            r6 = this;
            java.lang.reflect.Type r0 = r6.a
            java.util.List r0 = A4.AbstractC0011d.c(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = P3.r.p(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.String r3 = "type"
            kotlin.jvm.internal.l.f(r3, r2)
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L39
            r4 = r2
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r5 = r4.isPrimitive()
            if (r5 == 0) goto L39
            A4.A r2 = new A4.A
            r2.<init>(r4)
            goto L62
        L39:
            boolean r4 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r4 != 0) goto L5c
            if (r3 == 0) goto L49
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L49
            goto L5c
        L49:
            boolean r3 = r2 instanceof java.lang.reflect.WildcardType
            if (r3 == 0) goto L56
            A4.F r3 = new A4.F
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            r3.<init>(r2)
        L54:
            r2 = r3
            goto L62
        L56:
            A4.r r3 = new A4.r
            r3.<init>(r2)
            goto L54
        L5c:
            A4.i r3 = new A4.i
            r3.<init>(r2)
            goto L54
        L62:
            r1.add(r2)
            goto L15
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.r.c():java.util.ArrayList");
    }

    public final boolean d() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            kotlin.jvm.internal.l.e("getTypeParameters(...)", typeParameters);
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // N4.b
    public final Collection getAnnotations() {
        return P3.y.f7779k;
    }
}
