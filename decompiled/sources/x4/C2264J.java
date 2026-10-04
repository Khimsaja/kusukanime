package x4;

import io.ktor.util.GzipHeaderFlags;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1586x;
import u4.EnumC2117x;
import u4.InterfaceC2094J;

/* renamed from: x4.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2264J extends AbstractC2261G implements InterfaceC2094J {

    /* renamed from: w, reason: collision with root package name */
    public AbstractC1586x f17395w;

    /* renamed from: x, reason: collision with root package name */
    public final C2264J f17396x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2264J(u4.K k7, v4.h hVar, EnumC2117x enumC2117x, H4.o oVar, boolean z7, boolean z8, boolean z9, int i7, C2264J c2264j, u4.M m7) {
        super(enumC2117x, oVar, k7, hVar, W4.e.g("<get-" + k7.getName() + ">"), z7, z8, z9, i7, m7);
        if (hVar == null) {
            s0(1);
            throw null;
        }
        if (enumC2117x == null) {
            s0(2);
            throw null;
        }
        if (oVar == null) {
            s0(3);
            throw null;
        }
        if (i7 == 0) {
            s0(4);
            throw null;
        }
        if (m7 == null) {
            s0(5);
            throw null;
        }
        this.f17396x = c2264j != null ? c2264j : this;
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 6 || i7 == 7 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 6 || i7 == 7 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i7 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i7 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final C2264J a() {
        C2264J c2264j = this.f17396x;
        if (c2264j != null) {
            return c2264j;
        }
        s0(8);
        throw null;
    }

    public final void Q0(AbstractC1586x abstractC1586x) {
        if (abstractC1586x == null) {
            abstractC1586x = N0().getType();
        }
        this.f17395w = abstractC1586x;
    }

    @Override // u4.InterfaceC2096b
    public final AbstractC1586x getReturnType() {
        return this.f17395w;
    }

    @Override // u4.InterfaceC2097c, u4.InterfaceC2096b
    public final Collection m() {
        return O0(true);
    }

    @Override // u4.InterfaceC2096b
    public final List m0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(7);
        throw null;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                yVar.L(this, (StringBuilder) obj, "getter");
                return O3.C.a;
            default:
                return yVar.J(this, obj);
        }
    }
}
