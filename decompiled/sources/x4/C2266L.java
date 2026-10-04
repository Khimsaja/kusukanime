package x4;

import com.kusukanime.BuildConfig;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import n5.AbstractC1586x;
import n5.V;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import v4.C2158f;
import v4.C2159g;

/* renamed from: x4.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2266L extends AbstractC2294u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2266L(InterfaceC2105k interfaceC2105k, C2266L c2266l, v4.h hVar, W4.e eVar, int i7, u4.M m7) {
        super(i7, eVar, interfaceC2105k, c2266l, m7, hVar);
        if (interfaceC2105k == null) {
            s0(0);
            throw null;
        }
        if (hVar == null) {
            s0(1);
            throw null;
        }
        if (eVar == null) {
            s0(2);
            throw null;
        }
        if (i7 == 0) {
            s0(3);
            throw null;
        }
        if (m7 != null) {
        } else {
            s0(4);
            throw null;
        }
    }

    public static C2266L Y0(InterfaceC2099e interfaceC2099e, W4.e eVar, int i7, u4.M m7) {
        C2158f c2158f = C2159g.a;
        if (interfaceC2099e == null) {
            s0(5);
            throw null;
        }
        if (eVar == null) {
            s0(7);
            throw null;
        }
        if (i7 == 0) {
            s0(8);
            throw null;
        }
        if (m7 != null) {
            return new C2266L(interfaceC2099e, null, c2158f, eVar, i7, m7);
        }
        s0(9);
        throw null;
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 13 || i7 == 18 || i7 == 23 || i7 == 24 || i7 == 29 || i7 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 13 || i7 == 18 || i7 == 23 || i7 == 24 || i7 == 29 || i7 == 30) ? 2 : 3];
        switch (i7) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case BuildConfig.VERSION_CODE /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i7 == 13 || i7 == 18 || i7 == 23) {
            objArr[1] = "initialize";
        } else if (i7 == 24) {
            objArr[1] = "getOriginal";
        } else if (i7 == 29) {
            objArr[1] = "copy";
        } else if (i7 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i7) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case BuildConfig.VERSION_CODE /* 30 */:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 13 && i7 != 18 && i7 != 23 && i7 != 24 && i7 != 29 && i7 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // x4.AbstractC2294u
    public AbstractC2294u P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, u4.M m7, v4.h hVar) {
        if (interfaceC2105k == null) {
            s0(25);
            throw null;
        }
        if (i7 == 0) {
            s0(26);
            throw null;
        }
        if (hVar == null) {
            s0(27);
            throw null;
        }
        C2266L c2266l = (C2266L) interfaceC2112s;
        if (eVar == null) {
            eVar = getName();
        }
        return new C2266L(interfaceC2105k, c2266l, hVar, eVar, i7, m7);
    }

    @Override // x4.AbstractC2294u, x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final C2266L a() {
        C2266L c2266l = (C2266L) super.a();
        if (c2266l != null) {
            return c2266l;
        }
        s0(24);
        throw null;
    }

    @Override // x4.AbstractC2294u
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final C2266L S0(C2295v c2295v, C2295v c2295v2, List list, List list2, List list3, AbstractC1586x abstractC1586x, EnumC2117x enumC2117x, H4.o oVar) {
        if (list == null) {
            s0(14);
            throw null;
        }
        if (list2 == null) {
            s0(15);
            throw null;
        }
        if (list3 == null) {
            s0(16);
            throw null;
        }
        if (oVar != null) {
            return b1(c2295v, c2295v2, list, list2, list3, abstractC1586x, enumC2117x, oVar, null);
        }
        s0(17);
        throw null;
    }

    public C2266L b1(C2295v c2295v, C2295v c2295v2, List list, List list2, List list3, AbstractC1586x abstractC1586x, EnumC2117x enumC2117x, H4.o oVar, P3.z zVar) {
        if (list == null) {
            s0(19);
            throw null;
        }
        if (list2 == null) {
            s0(20);
            throw null;
        }
        if (list3 == null) {
            s0(21);
            throw null;
        }
        if (oVar != null) {
            super.S0(c2295v, c2295v2, list, list2, list3, abstractC1586x, enumC2117x, oVar);
            return this;
        }
        s0(22);
        throw null;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2112s
    public u4.r f0() {
        return T0(V.f13380b);
    }
}
