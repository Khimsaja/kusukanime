package n5;

import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m5.C1523l;
import m5.InterfaceC1526o;
import u4.InterfaceC2099e;
import x4.AbstractC2299z;

/* renamed from: n5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572i extends AbstractC1565b {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2299z f13399c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13400d;

    /* renamed from: e, reason: collision with root package name */
    public final Collection f13401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572i(AbstractC2299z abstractC2299z, List list, Collection collection, C1523l c1523l) {
        super((InterfaceC1526o) c1523l);
        if (list == null) {
            l(1);
            throw null;
        }
        if (collection == null) {
            l(2);
            throw null;
        }
        if (c1523l == null) {
            l(3);
            throw null;
        }
        this.f13399c = abstractC2299z;
        this.f13400d = Collections.unmodifiableList(new ArrayList(list));
        this.f13401e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void l(int i7) {
        String str = (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getParameters";
        } else if (i7 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i7 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i7 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // n5.AbstractC1569f
    public final Collection b() {
        Collection collection = this.f13401e;
        if (collection != null) {
            return collection;
        }
        l(6);
        throw null;
    }

    @Override // n5.M
    public final boolean e() {
        return true;
    }

    @Override // n5.M
    public final List getParameters() {
        List list = this.f13400d;
        if (list != null) {
            return list;
        }
        l(4);
        throw null;
    }

    @Override // n5.AbstractC1569f
    public final u4.N h() {
        return u4.N.f16297m;
    }

    @Override // n5.AbstractC1565b
    /* renamed from: m */
    public final InterfaceC2099e f() {
        AbstractC2299z abstractC2299z = this.f13399c;
        if (abstractC2299z != null) {
            return abstractC2299z;
        }
        l(5);
        throw null;
    }

    public final String toString() {
        return Z4.e.g(this.f13399c).a;
    }
}
