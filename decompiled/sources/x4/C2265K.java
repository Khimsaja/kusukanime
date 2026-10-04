package x4;

import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1586x;
import u4.EnumC2117x;
import u4.InterfaceC2094J;

/* renamed from: x4.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2265K extends AbstractC2261G implements InterfaceC2094J {

    /* renamed from: w, reason: collision with root package name */
    public C2272S f17397w;

    /* renamed from: x, reason: collision with root package name */
    public final C2265K f17398x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265K(u4.K k7, v4.h hVar, EnumC2117x enumC2117x, H4.o oVar, boolean z7, boolean z8, boolean z9, int i7, C2265K c2265k, u4.M m7) {
        super(enumC2117x, oVar, k7, hVar, W4.e.g("<set-" + k7.getName() + ">"), z7, z8, z9, i7, m7);
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
        this.f17398x = c2265k != null ? c2265k : this;
    }

    public static C2272S P0(C2265K c2265k, AbstractC1586x abstractC1586x, v4.h hVar) {
        if (abstractC1586x == null) {
            s0(8);
            throw null;
        }
        if (hVar != null) {
            return new C2272S(c2265k, null, 0, hVar, W4.g.f9632g, abstractC1586x, false, false, false, null, u4.M.f16295i);
        }
        s0(9);
        throw null;
    }

    public static /* synthetic */ void s0(int i7) {
        String str;
        int i8;
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = LinkHeader.Parameters.Type;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i7) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i7) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final C2265K a() {
        C2265K c2265k = this.f17398x;
        if (c2265k != null) {
            return c2265k;
        }
        s0(13);
        throw null;
    }

    @Override // u4.InterfaceC2096b
    public final AbstractC1586x getReturnType() {
        return d5.e.e(this).w();
    }

    @Override // u4.InterfaceC2097c, u4.InterfaceC2096b
    public final Collection m() {
        return O0(false);
    }

    @Override // u4.InterfaceC2096b
    public final List m0() {
        C2272S c2272s = this.f17397w;
        if (c2272s == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(c2272s);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        s0(11);
        throw null;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                yVar.L(this, (StringBuilder) obj, "setter");
                return O3.C.a;
            default:
                return yVar.J(this, obj);
        }
    }
}
