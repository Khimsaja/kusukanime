package J4;

import O3.l;
import P3.y;
import b1.AbstractC0703b;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import n5.AbstractC1586x;
import u4.InterfaceC2095a;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.M;
import v4.C2159g;
import x4.AbstractC2294u;
import x4.C2283j;
import z4.C2495g;

/* loaded from: classes.dex */
public final class b extends C2283j implements a {

    /* renamed from: O, reason: collision with root package name */
    public Boolean f4291O;

    /* renamed from: P, reason: collision with root package name */
    public Boolean f4292P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC2099e interfaceC2099e, b bVar, v4.h hVar, boolean z7, int i7, M m7) {
        super(interfaceC2099e, bVar, hVar, z7, i7, m7);
        if (interfaceC2099e == null) {
            s0(0);
            throw null;
        }
        if (hVar == null) {
            s0(1);
            throw null;
        }
        if (i7 == 0) {
            s0(2);
            throw null;
        }
        if (m7 == null) {
            s0(3);
            throw null;
        }
        this.f4291O = null;
        this.f4292P = null;
    }

    public static b e1(InterfaceC2099e interfaceC2099e, v4.h hVar, boolean z7, C2495g c2495g) {
        if (interfaceC2099e != null) {
            return new b(interfaceC2099e, null, hVar, z7, 1, c2495g);
        }
        s0(4);
        throw null;
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 11 || i7 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 11 || i7 == 18) ? 2 : 3];
        switch (i7) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i7 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i7 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 11 && i7 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2096b
    public final boolean K() {
        return this.f4292P.booleanValue();
    }

    @Override // x4.C2283j, x4.AbstractC2294u
    public final /* bridge */ /* synthetic */ AbstractC2294u P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, M m7, v4.h hVar) {
        return f1(interfaceC2105k, interfaceC2112s, i7, hVar, m7);
    }

    @Override // J4.a
    public final a T(AbstractC1586x abstractC1586x, ArrayList arrayList, AbstractC1586x abstractC1586x2, l lVar) {
        b bVarF1 = f1(k(), null, c(), getAnnotations(), l());
        bVarF1.S0(abstractC1586x == null ? null : Z4.l.k(bVarF1, abstractC1586x, C2159g.a), this.f17497t, y.f7779k, getTypeParameters(), android.support.v4.media.session.b.k(arrayList, m0(), bVarF1), abstractC1586x2, e(), getVisibility());
        if (lVar != null) {
            bVarF1.U0((InterfaceC2095a) lVar.f7528k, lVar.f7529l);
        }
        return bVarF1;
    }

    @Override // x4.AbstractC2294u
    public final void V0(boolean z7) {
        this.f4291O = Boolean.valueOf(z7);
    }

    @Override // x4.AbstractC2294u
    public final void W0(boolean z7) {
        this.f4292P = Boolean.valueOf(z7);
    }

    @Override // x4.C2283j
    /* renamed from: Y0 */
    public final /* bridge */ /* synthetic */ C2283j P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, M m7, v4.h hVar) {
        return f1(interfaceC2105k, interfaceC2112s, i7, hVar, m7);
    }

    public final b f1(InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, int i7, v4.h hVar, M m7) {
        if (interfaceC2105k == null) {
            s0(7);
            throw null;
        }
        if (i7 == 0) {
            s0(8);
            throw null;
        }
        if (hVar == null) {
            s0(9);
            throw null;
        }
        if (m7 == null) {
            s0(10);
            throw null;
        }
        if (i7 != 1 && i7 != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC2105k + "\nkind: " + AbstractC0703b.B(i7));
        }
        InterfaceC2099e interfaceC2099e = (InterfaceC2099e) interfaceC2105k;
        b bVar = (b) interfaceC2112s;
        if (i7 == 0) {
            s0(13);
            throw null;
        }
        b bVar2 = new b(interfaceC2099e, bVar, hVar, this.f17435N, i7, m7);
        Boolean bool = this.f4291O;
        bool.getClass();
        bVar2.f4291O = bool;
        Boolean bool2 = this.f4292P;
        bool2.getClass();
        bVar2.f4292P = bool2;
        return bVar2;
    }
}
