package x4;

import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m5.InterfaceC1526o;
import n5.AbstractC1569f;
import n5.AbstractC1586x;
import r4.AbstractC1880i;
import u4.InterfaceC2102h;

/* renamed from: x4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2281h extends AbstractC1569f {

    /* renamed from: c, reason: collision with root package name */
    public final u4.N f17427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2282i f17428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2281h(AbstractC2282i abstractC2282i, InterfaceC1526o interfaceC1526o, u4.N n7) {
        super(interfaceC1526o);
        if (interfaceC1526o == null) {
            l(0);
            throw null;
        }
        this.f17428d = abstractC2282i;
        this.f17427c = n7;
    }

    public static /* synthetic */ void l(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = LinkHeader.Parameters.Type;
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i7 == 2) {
            objArr[1] = "getParameters";
        } else if (i7 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i7 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i7 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // n5.AbstractC1569f
    public final Collection b() {
        List listO0 = this.f17428d.O0();
        if (listO0 != null) {
            return listO0;
        }
        l(1);
        throw null;
    }

    @Override // n5.AbstractC1569f
    public final AbstractC1586x c() {
        return p5.l.c(p5.k.f14443q, new String[0]);
    }

    @Override // n5.M
    public final AbstractC1880i d() {
        AbstractC1880i abstractC1880iE = d5.e.e(this.f17428d);
        if (abstractC1880iE != null) {
            return abstractC1880iE;
        }
        l(4);
        throw null;
    }

    @Override // n5.M
    public final boolean e() {
        return true;
    }

    @Override // n5.M
    public final InterfaceC2102h f() {
        AbstractC2282i abstractC2282i = this.f17428d;
        if (abstractC2282i != null) {
            return abstractC2282i;
        }
        l(3);
        throw null;
    }

    @Override // n5.M
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l(2);
        throw null;
    }

    @Override // n5.AbstractC1569f
    public final u4.N h() {
        u4.N n7 = this.f17427c;
        if (n7 != null) {
            return n7;
        }
        l(5);
        throw null;
    }

    @Override // n5.AbstractC1569f
    public final boolean j(InterfaceC2102h interfaceC2102h) {
        if (!(interfaceC2102h instanceof u4.Q)) {
            return false;
        }
        AbstractC2282i abstractC2282i = this.f17428d;
        kotlin.jvm.internal.l.f("a", abstractC2282i);
        return Z4.c.a.d(abstractC2282i, (u4.Q) interfaceC2102h, true, Z4.a.f10265k);
    }

    @Override // n5.AbstractC1569f
    public final List k(List list) {
        List listN0 = this.f17428d.N0(list);
        if (listN0 != null) {
            return listN0;
        }
        l(8);
        throw null;
    }

    public final String toString() {
        return this.f17428d.getName().f9624k;
    }
}
