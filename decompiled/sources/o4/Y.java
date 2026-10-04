package o4;

import e4.InterfaceC0821a;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p4.C1793C;
import p4.C1794D;
import p4.InterfaceC1801g;
import u4.InterfaceC2093I;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import x4.C2295v;

/* loaded from: classes.dex */
public final class Y implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13670k;

    /* renamed from: l, reason: collision with root package name */
    public final C1669a0 f13671l;

    public /* synthetic */ Y(C1669a0 c1669a0, int i7) {
        this.f13670k = i7;
        this.f13671l = c1669a0;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        Z z7;
        List listN0;
        C2295v c2295vR0;
        C1669a0 c1669a0 = this.f13671l;
        switch (this.f13670k) {
            case 0:
                return F0.d(c1669a0.d());
            default:
                InterfaceC2093I interfaceC2093ID = c1669a0.d();
                boolean z8 = interfaceC2093ID instanceof C2295v;
                AbstractC1694t abstractC1694t = c1669a0.f13674k;
                if (z8) {
                    InterfaceC2097c interfaceC2097cP = abstractC1694t.p();
                    W4.c cVar = F0.a;
                    if (interfaceC2097cP.t() != null) {
                        InterfaceC2105k interfaceC2105kK = interfaceC2097cP.k();
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC2105kK);
                        c2295vR0 = ((InterfaceC2099e) interfaceC2105kK).r0();
                    } else {
                        c2295vR0 = null;
                    }
                    if (kotlin.jvm.internal.l.a(c2295vR0, interfaceC2093ID) && abstractC1694t.p().c() == 2) {
                        InterfaceC2105k interfaceC2105kK2 = abstractC1694t.p().k();
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC2105kK2);
                        Class clsJ = F0.j((InterfaceC2099e) interfaceC2105kK2);
                        if (clsJ != null) {
                            return clsJ;
                        }
                        throw new H5.C("Cannot determine receiver Java type of inherited declaration: " + interfaceC2093ID);
                    }
                }
                InterfaceC1801g interfaceC1801gF = abstractC1694t.f();
                boolean z9 = interfaceC1801gF instanceof C1794D;
                int i7 = c1669a0.f13675l;
                if (z9) {
                    if (abstractC1694t.s()) {
                        C1794D c1794d = (C1794D) interfaceC1801gF;
                        k4.g gVarD = c1794d.d(i7 + 1);
                        int i8 = c1794d.d(0).f12673l + 1;
                        listN0 = P3.q.N0(c1794d.f14361b.a(), new k4.g(gVarD.f12672k - i8, gVarD.f12673l - i8, 1));
                    } else {
                        C1794D c1794d2 = (C1794D) interfaceC1801gF;
                        listN0 = P3.q.N0(c1794d2.f14361b.a(), c1794d2.d(i7));
                    }
                    Type[] typeArr = (Type[]) listN0.toArray(new Type[0]);
                    Type[] typeArr2 = (Type[]) Arrays.copyOf(typeArr, typeArr.length);
                    int length = typeArr2.length;
                    if (length == 0) {
                        throw new H5.C("Expected at least 1 type for compound type");
                    }
                    if (length == 1) {
                        return (Type) P3.m.r0(typeArr2);
                    }
                    z7 = new Z(typeArr2);
                } else {
                    if (!(interfaceC1801gF instanceof C1793C)) {
                        return (Type) interfaceC1801gF.a().get(i7);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((C1793C) interfaceC1801gF).f14359d.get(i7)).toArray(new Class[0]);
                    Type[] typeArr3 = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length2 = typeArr3.length;
                    if (length2 == 0) {
                        throw new H5.C("Expected at least 1 type for compound type");
                    }
                    if (length2 == 1) {
                        return (Type) P3.m.r0(typeArr3);
                    }
                    z7 = new Z(typeArr3);
                }
                return z7;
        }
    }
}
