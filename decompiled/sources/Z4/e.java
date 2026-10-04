package Z4;

import com.kusukanime.BuildConfig;
import io.github.jan.supabase.auth.PKCEConstants;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.collections.ConcurrentMapKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n5.AbstractC1586x;
import n5.M;
import u4.AbstractC2108n;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2088D;
import u4.InterfaceC2092H;
import u4.InterfaceC2096b;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;
import u4.InterfaceC2107m;
import u4.InterfaceC2118y;
import u4.N;
import x4.AbstractC2257C;
import x4.C2265K;
import x4.C2297x;

/* loaded from: classes.dex */
public abstract class e {
    public static final /* synthetic */ int a = 0;

    static {
        new W4.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i7) {
        String str;
        int i8;
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case PKCEConstants.VERIFIER_LENGTH /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case PKCEConstants.VERIFIER_LENGTH /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case PKCEConstants.VERIFIER_LENGTH /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case BuildConfig.VERSION_CODE /* 30 */:
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 45:
            case 66:
                objArr[0] = LinkHeader.Parameters.Type;
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case PKCEConstants.VERIFIER_LENGTH /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i7) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case PKCEConstants.VERIFIER_LENGTH /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case BuildConfig.VERSION_CODE /* 30 */:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case PKCEConstants.VERIFIER_LENGTH /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(InterfaceC2096b interfaceC2096b, LinkedHashSet linkedHashSet) {
        if (interfaceC2096b == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC2096b)) {
            return;
        }
        Iterator it = interfaceC2096b.a().m().iterator();
        while (it.hasNext()) {
            InterfaceC2096b interfaceC2096bA = ((InterfaceC2096b) it.next()).a();
            b(interfaceC2096bA, linkedHashSet);
            linkedHashSet.add(interfaceC2096bA);
        }
    }

    public static InterfaceC2099e c(AbstractC1586x abstractC1586x) {
        if (abstractC1586x == null) {
            a(45);
            throw null;
        }
        M mT0 = abstractC1586x.t0();
        if (mT0 == null) {
            a(46);
            throw null;
        }
        InterfaceC2099e interfaceC2099e = (InterfaceC2099e) mT0.f();
        if (interfaceC2099e != null) {
            return interfaceC2099e;
        }
        a(47);
        throw null;
    }

    public static InterfaceC2118y d(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k == null) {
            a(21);
            throw null;
        }
        InterfaceC2118y interfaceC2118yE = e(interfaceC2105k);
        if (interfaceC2118yE != null) {
            return interfaceC2118yE;
        }
        a(22);
        throw null;
    }

    public static InterfaceC2118y e(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k == null) {
            a(23);
            throw null;
        }
        while (interfaceC2105k != null) {
            if (interfaceC2105k instanceof InterfaceC2118y) {
                return (InterfaceC2118y) interfaceC2105k;
            }
            if (interfaceC2105k instanceof InterfaceC2092H) {
                return ((C2297x) ((InterfaceC2092H) interfaceC2105k)).f17510m;
            }
            interfaceC2105k = interfaceC2105k.k();
        }
        return null;
    }

    public static N f(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k == null) {
            a(81);
            throw null;
        }
        if (interfaceC2105k instanceof C2265K) {
            interfaceC2105k = ((C2265K) interfaceC2105k).N0();
        }
        boolean z7 = interfaceC2105k instanceof InterfaceC2106l;
        N n7 = N.f16296l;
        if (z7) {
            ((InterfaceC2106l) interfaceC2105k).l().getClass();
        }
        return n7;
    }

    public static W4.d g(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k != null) {
            W4.c cVarH = h(interfaceC2105k);
            return cVarH != null ? cVarH.a : g(interfaceC2105k.k()).a(interfaceC2105k.getName());
        }
        a(2);
        throw null;
    }

    public static W4.c h(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k == null) {
            a(5);
            throw null;
        }
        if ((interfaceC2105k instanceof InterfaceC2118y) || p5.l.f(interfaceC2105k)) {
            return W4.c.f9618c;
        }
        if (interfaceC2105k instanceof InterfaceC2092H) {
            return ((C2297x) ((InterfaceC2092H) interfaceC2105k)).f17511n;
        }
        if (interfaceC2105k instanceof InterfaceC2088D) {
            return ((AbstractC2257C) ((InterfaceC2088D) interfaceC2105k)).f17354o;
        }
        return null;
    }

    public static InterfaceC2105k i(InterfaceC2105k interfaceC2105k, Class cls, boolean z7) {
        if (interfaceC2105k == null) {
            return null;
        }
        if (z7) {
            interfaceC2105k = interfaceC2105k.k();
        }
        while (interfaceC2105k != null) {
            if (cls.isInstance(interfaceC2105k)) {
                return interfaceC2105k;
            }
            interfaceC2105k = interfaceC2105k.k();
        }
        return null;
    }

    public static InterfaceC2099e j(InterfaceC2099e interfaceC2099e) {
        if (interfaceC2099e == null) {
            a(44);
            throw null;
        }
        Iterator it = interfaceC2099e.v().g().iterator();
        while (it.hasNext()) {
            InterfaceC2099e interfaceC2099eC = c((AbstractC1586x) it.next());
            if (interfaceC2099eC.c() != EnumC2100f.f16312l) {
                return interfaceC2099eC;
            }
        }
        return null;
    }

    public static boolean k(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k != null) {
            return m(interfaceC2105k, EnumC2100f.f16311k) && interfaceC2105k.getName().equals(W4.g.a);
        }
        a(34);
        throw null;
    }

    public static boolean l(InterfaceC2105k interfaceC2105k) {
        return m(interfaceC2105k, EnumC2100f.f16316p) && ((InterfaceC2099e) interfaceC2105k).x();
    }

    public static boolean m(InterfaceC2105k interfaceC2105k, EnumC2100f enumC2100f) {
        return (interfaceC2105k instanceof InterfaceC2099e) && ((InterfaceC2099e) interfaceC2105k).c() == enumC2100f;
    }

    public static boolean n(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k == null) {
            a(1);
            throw null;
        }
        while (interfaceC2105k != null) {
            if (k(interfaceC2105k) || ((interfaceC2105k instanceof InterfaceC2107m) && ((InterfaceC2107m) interfaceC2105k).getVisibility() == AbstractC2108n.f16323f)) {
                return true;
            }
            interfaceC2105k = interfaceC2105k.k();
        }
        return false;
    }

    public static boolean o(AbstractC1586x abstractC1586x, InterfaceC2099e interfaceC2099e) {
        if (abstractC1586x == null) {
            a(30);
            throw null;
        }
        if (interfaceC2099e == null) {
            a(31);
            throw null;
        }
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        if (interfaceC2102hF == null) {
            return false;
        }
        InterfaceC2105k interfaceC2105kA = interfaceC2102hF.a();
        return (interfaceC2105kA instanceof InterfaceC2102h) && interfaceC2099e.v().equals(((InterfaceC2102h) interfaceC2105kA).v());
    }

    public static boolean p(InterfaceC2105k interfaceC2105k) {
        return (m(interfaceC2105k, EnumC2100f.f16311k) || m(interfaceC2105k, EnumC2100f.f16312l)) && ((InterfaceC2099e) interfaceC2105k).e() == EnumC2117x.f16343m;
    }

    public static boolean q(AbstractC1586x abstractC1586x, InterfaceC2099e interfaceC2099e) {
        if (abstractC1586x == null) {
            a(32);
            throw null;
        }
        if (interfaceC2099e == null) {
            a(33);
            throw null;
        }
        if (o(abstractC1586x, interfaceC2099e)) {
            return true;
        }
        Iterator it = abstractC1586x.t0().g().iterator();
        while (it.hasNext()) {
            if (q((AbstractC1586x) it.next(), interfaceC2099e)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(InterfaceC2105k interfaceC2105k) {
        return interfaceC2105k != null && (interfaceC2105k.k() instanceof InterfaceC2088D);
    }

    public static InterfaceC2097c s(InterfaceC2097c interfaceC2097c) {
        if (interfaceC2097c == null) {
            a(58);
            throw null;
        }
        while (interfaceC2097c.c() == 2) {
            Collection collectionM = interfaceC2097c.m();
            if (collectionM.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC2097c);
            }
            interfaceC2097c = (InterfaceC2097c) collectionM.iterator().next();
        }
        return interfaceC2097c;
    }
}
