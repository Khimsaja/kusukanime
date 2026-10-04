package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.List;
import m5.C1523l;
import m5.InterfaceC1526o;
import n5.AbstractC1566c;
import n5.b0;
import u4.InterfaceC2105k;
import v4.C2158f;
import v4.C2159g;

/* renamed from: x4.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2270P extends AbstractC2282i {

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f17405u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17406v;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2270P(InterfaceC2105k interfaceC2105k, v4.h hVar, boolean z7, b0 b0Var, W4.e eVar, int i7, InterfaceC1526o interfaceC1526o) {
        u4.N n7 = u4.N.f16297m;
        if (interfaceC2105k == null) {
            s0(19);
            throw null;
        }
        if (hVar == null) {
            s0(20);
            throw null;
        }
        if (b0Var == null) {
            s0(21);
            throw null;
        }
        if (eVar == null) {
            s0(22);
            throw null;
        }
        if (interfaceC1526o == null) {
            s0(25);
            throw null;
        }
        super(interfaceC1526o, interfaceC2105k, hVar, eVar, b0Var, z7, i7, n7);
        this.f17405u = new ArrayList(1);
        this.f17406v = false;
    }

    public static C2270P P0(InterfaceC2105k interfaceC2105k, v4.h hVar, boolean z7, b0 b0Var, W4.e eVar, int i7, InterfaceC1526o interfaceC1526o) {
        if (interfaceC2105k == null) {
            s0(6);
            throw null;
        }
        if (hVar == null) {
            s0(7);
            throw null;
        }
        if (b0Var == null) {
            s0(8);
            throw null;
        }
        if (eVar == null) {
            s0(9);
            throw null;
        }
        if (interfaceC1526o != null) {
            return new C2270P(interfaceC2105k, hVar, z7, b0Var, eVar, i7, interfaceC1526o);
        }
        s0(11);
        throw null;
    }

    public static C2270P Q0(AbstractC2275b abstractC2275b, b0 b0Var, W4.e eVar, int i7, C1523l c1523l) {
        C2158f c2158f = C2159g.a;
        if (abstractC2275b == null) {
            s0(0);
            throw null;
        }
        if (c1523l == null) {
            s0(4);
            throw null;
        }
        C2270P c2270pP0 = P0(abstractC2275b, c2158f, false, b0Var, eVar, i7, c1523l);
        n5.B bO = d5.e.e(abstractC2275b).o();
        if (c2270pP0.f17406v) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + c2270pP0.R0());
        }
        if (!AbstractC1566c.k(bO)) {
            c2270pP0.f17405u.add(bO);
        }
        if (!c2270pP0.f17406v) {
            c2270pP0.f17406v = true;
            return c2270pP0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + c2270pP0.R0());
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 5 || i7 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 5 || i7 == 28) ? 2 : 3];
        switch (i7) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = LinkHeader.Parameters.Type;
                break;
        }
        if (i7 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i7 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i7) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 5 && i7 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // x4.AbstractC2282i
    public final List O0() {
        if (!this.f17406v) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + R0());
        }
        ArrayList arrayList = this.f17405u;
        if (arrayList != null) {
            return arrayList;
        }
        s0(28);
        throw null;
    }

    public final String R0() {
        return getName() + " declared in " + Z4.e.g(k());
    }
}
