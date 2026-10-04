package Z5;

import b1.AbstractC0703b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1425d;
import l4.InterfaceC1426e;
import l4.InterfaceC1444w;
import l4.InterfaceC1445x;

/* renamed from: Z5.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0632e0 {
    public static final SerialDescriptor[] a = new SerialDescriptor[0];

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f10321b = new KSerializer[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10322c = new Object();

    public static final I a(String str, KSerializer kSerializer) {
        return new I(str, new J(kSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        if (serialDescriptor instanceof InterfaceC0643l) {
            return ((InterfaceC0643l) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.f());
        int iF = serialDescriptor.f();
        for (int i7 = 0; i7 < iF; i7++) {
            hashSet.add(serialDescriptor.g(i7));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? a : serialDescriptorArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer d(l4.InterfaceC1425d r16, kotlinx.serialization.KSerializer... r17) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.AbstractC0632e0.d(l4.d, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static final int e(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        kotlin.jvm.internal.l.f("typeParams", serialDescriptorArr);
        int iHashCode = (serialDescriptor.e().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int iF = serialDescriptor.f();
        int i7 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i8 = iF - 1;
            int i9 = i7 * 31;
            String strE = serialDescriptor.j(serialDescriptor.f() - iF).e();
            if (strE != null) {
                iHashCode2 = strE.hashCode();
            }
            i7 = i9 + iHashCode2;
            iF = i8;
        }
        int iF2 = serialDescriptor.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i7) * 31) + iHashCode3;
            }
            int i10 = iF2 - 1;
            int i11 = iHashCode3 * 31;
            n6.d dVarC = serialDescriptor.j(serialDescriptor.f() - iF2).c();
            iHashCode3 = i11 + (dVarC != null ? dVarC.hashCode() : 0);
            iF2 = i10;
        }
    }

    public static final KSerializer f(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i7 = 0; i7 < length; i7++) {
                    clsArr2[i7] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                throw e7;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e7.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean g(InterfaceC1425d interfaceC1425d) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1425d);
        return n6.m.F(interfaceC1425d).isInterface();
    }

    public static final InterfaceC1425d h(InterfaceC1444w interfaceC1444w) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1444w);
        InterfaceC1426e interfaceC1426eC = interfaceC1444w.c();
        if (interfaceC1426eC instanceof InterfaceC1425d) {
            return (InterfaceC1425d) interfaceC1426eC;
        }
        if (!(interfaceC1426eC instanceof InterfaceC1445x)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + interfaceC1426eC);
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC1426eC + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC1426eC + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC1426eC + '.');
    }

    public static final void i(InterfaceC1425d interfaceC1425d) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1425d);
        String strN = interfaceC1425d.n();
        if (strN == null) {
            strN = "<local class name not available>";
        }
        throw new V5.j(AbstractC0703b.j("Serializer for class '", strN, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void j(int i7, int i8, SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        ArrayList arrayList = new ArrayList();
        int i9 = (~i7) & i8;
        for (int i10 = 0; i10 < 32; i10++) {
            if ((i9 & 1) != 0) {
                arrayList.add(serialDescriptor.g(i10));
            }
            i9 >>>= 1;
        }
        String strE = serialDescriptor.e();
        kotlin.jvm.internal.l.f("serialName", strE);
        throw new V5.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strE + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strE + "', but they were missing", null);
    }

    public static final void k(String str, InterfaceC1425d interfaceC1425d) {
        String string;
        kotlin.jvm.internal.l.f("baseClass", interfaceC1425d);
        String str2 = "in the polymorphic scope of '" + interfaceC1425d.n() + '\'';
        if (str == null) {
            string = A6.b.d('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbC = v.c0.c("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            sbC.append(str);
            sbC.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sbC.append(str);
            sbC.append("' has to be '@Serializable', and the base class '");
            sbC.append(interfaceC1425d.n());
            sbC.append("' has to be sealed and '@Serializable'.");
            string = sbC.toString();
        }
        throw new V5.j(string);
    }

    public static final String l(SerialDescriptor serialDescriptor) {
        return P3.q.y0(e3.c.L(0, serialDescriptor.f()), ", ", serialDescriptor.e() + '(', ")", new K3.a(2, serialDescriptor), 24);
    }
}
