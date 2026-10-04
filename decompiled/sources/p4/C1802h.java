package p4;

import D4.S;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: p4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1802h extends x implements InterfaceC1800f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14383e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14384f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1802h(Constructor constructor, Object obj, int i7) {
        this.f14383e = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f("constructor", constructor);
                Class declaringClass = constructor.getDeclaringClass();
                kotlin.jvm.internal.l.e("getDeclaringClass(...)", declaringClass);
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                kotlin.jvm.internal.l.e("getGenericParameterTypes(...)", genericParameterTypes);
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f14384f = obj;
                break;
            default:
                kotlin.jvm.internal.l.f("constructor", constructor);
                Class declaringClass2 = constructor.getDeclaringClass();
                kotlin.jvm.internal.l.e("getDeclaringClass(...)", declaringClass2);
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                kotlin.jvm.internal.l.e("getGenericParameterTypes(...)", genericParameterTypes2);
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : P3.m.b0(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f14384f = obj;
                break;
        }
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        switch (this.f14383e) {
            case 0:
                kotlin.jvm.internal.l.f("args", objArr);
                d(objArr);
                Constructor constructor = (Constructor) this.a;
                S s7 = new S(3);
                s7.g(this.f14384f);
                s7.j(objArr);
                s7.g(null);
                ArrayList arrayList = s7.f1530k;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                kotlin.jvm.internal.l.f("args", objArr);
                d(objArr);
                Constructor constructor2 = (Constructor) this.a;
                S s8 = new S(2);
                s8.g(this.f14384f);
                s8.j(objArr);
                ArrayList arrayList2 = s8.f1530k;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
