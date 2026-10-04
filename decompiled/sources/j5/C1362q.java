package j5;

import X4.AbstractC0615l;
import e4.InterfaceC0821a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import o4.v0;
import o4.z0;

/* renamed from: j5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362q implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12456k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f12457l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f12458m;

    /* renamed from: n, reason: collision with root package name */
    public final int f12459n;

    public /* synthetic */ C1362q(C1365t c1365t, AbstractC0615l abstractC0615l, int i7, int i8) {
        this.f12456k = i8;
        this.f12457l = c1365t;
        this.f12458m = abstractC0615l;
        this.f12459n = i7;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [O3.i, java.lang.Object] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        Type type;
        switch (this.f12456k) {
            case 0:
                C1365t c1365t = (C1365t) this.f12457l;
                AbstractC1368w abstractC1368wA = c1365t.a(c1365t.a.f12440c);
                List listS0 = abstractC1368wA != null ? P3.q.S0(c1365t.a.a.f12417e.Y0(abstractC1368wA, (AbstractC0615l) this.f12458m, this.f12459n)) : null;
                return listS0 == null ? P3.y.f7779k : listS0;
            case 1:
                C1365t c1365t2 = (C1365t) this.f12457l;
                AbstractC1368w abstractC1368wA2 = c1365t2.a(c1365t2.a.f12440c);
                List listW = abstractC1368wA2 != null ? c1365t2.a.a.f12417e.W(abstractC1368wA2, (AbstractC0615l) this.f12458m, this.f12459n) : null;
                return listW == null ? P3.y.f7779k : listW;
            default:
                v0 v0Var = (v0) this.f12457l;
                z0 z0Var = v0Var.f13768m;
                Type type2 = z0Var != null ? (Type) z0Var.invoke() : null;
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    kotlin.jvm.internal.l.c(componentType);
                    return componentType;
                }
                boolean z7 = type2 instanceof GenericArrayType;
                int i7 = this.f12459n;
                if (z7) {
                    if (i7 == 0) {
                        Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                        kotlin.jvm.internal.l.c(genericComponentType);
                        return genericComponentType;
                    }
                    throw new H5.C("Array type has been queried for a non-0th argument: " + v0Var);
                }
                if (!(type2 instanceof ParameterizedType)) {
                    throw new H5.C("Non-generic type has been queried for arguments: " + v0Var);
                }
                Type type3 = (Type) ((List) this.f12458m.getValue()).get(i7);
                if (!(type3 instanceof WildcardType)) {
                    return type3;
                }
                WildcardType wildcardType = (WildcardType) type3;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                kotlin.jvm.internal.l.e("getLowerBounds(...)", lowerBounds);
                Type type4 = (Type) P3.m.i0(lowerBounds);
                if (type4 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
                    type = (Type) P3.m.h0(upperBounds);
                } else {
                    type = type4;
                }
                kotlin.jvm.internal.l.c(type);
                return type;
        }
    }

    public C1362q(v0 v0Var, int i7, O3.i iVar) {
        this.f12456k = 2;
        this.f12457l = v0Var;
        this.f12459n = i7;
        this.f12458m = iVar;
    }
}
