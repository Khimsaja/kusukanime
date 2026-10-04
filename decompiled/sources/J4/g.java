package J4;

import H4.o;
import H4.x;
import O3.l;
import O4.v;
import P3.y;
import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import n5.AbstractC1586x;
import n5.Y;
import o5.AbstractC1707g;
import r4.AbstractC1880i;
import r4.AbstractC1891t;
import u4.EnumC2117x;
import u4.InterfaceC2095a;
import u4.InterfaceC2105k;
import u4.K;
import u4.M;
import u4.N;
import v4.C2159g;
import v4.i;
import x4.C2263I;
import x4.C2264J;
import x4.C2265K;
import x4.C2272S;
import z4.C2495g;

/* loaded from: classes.dex */
public class g extends C2263I implements a {

    /* renamed from: K, reason: collision with root package name */
    public final boolean f4297K;

    /* renamed from: L, reason: collision with root package name */
    public final l f4298L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC2105k interfaceC2105k, v4.h hVar, EnumC2117x enumC2117x, o oVar, boolean z7, W4.e eVar, M m7, K k7, int i7, boolean z8, l lVar) {
        super(interfaceC2105k, k7, hVar, enumC2117x, oVar, z7, eVar, i7, m7, false, false, false, false, false);
        if (interfaceC2105k == null) {
            s0(0);
            throw null;
        }
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
        if (eVar == null) {
            s0(4);
            throw null;
        }
        if (m7 == null) {
            s0(5);
            throw null;
        }
        if (i7 == 0) {
            s0(6);
            throw null;
        }
        this.f4297K = z8;
        this.f4298L = lVar;
    }

    public static g V0(InterfaceC2105k interfaceC2105k, K4.c cVar, o oVar, boolean z7, W4.e eVar, C2495g c2495g, boolean z8) {
        EnumC2117x enumC2117x = EnumC2117x.f16342l;
        if (interfaceC2105k == null) {
            s0(7);
            throw null;
        }
        if (eVar != null) {
            return new g(interfaceC2105k, cVar, enumC2117x, oVar, z7, eVar, c2495g, null, 1, z8, null);
        }
        s0(11);
        throw null;
    }

    public static /* synthetic */ void s0(int i7) {
        String str = i7 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 21 ? 3 : 2];
        switch (i7) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 11:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i7 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // x4.AbstractC2273T, u4.InterfaceC2096b
    public final boolean K() {
        return false;
    }

    @Override // x4.C2263I
    public final C2263I P0(InterfaceC2105k interfaceC2105k, EnumC2117x enumC2117x, o oVar, K k7, int i7, W4.e eVar) {
        N n7 = M.f16295i;
        if (interfaceC2105k == null) {
            s0(13);
            throw null;
        }
        if (enumC2117x == null) {
            s0(14);
            throw null;
        }
        if (oVar == null) {
            s0(15);
            throw null;
        }
        if (i7 == 0) {
            s0(16);
            throw null;
        }
        if (eVar == null) {
            s0(17);
            throw null;
        }
        return new g(interfaceC2105k, getAnnotations(), enumC2117x, oVar, this.f17384p, eVar, n7, k7, i7, this.f4297K, this.f4298L);
    }

    @Override // J4.a
    public final a T(AbstractC1586x abstractC1586x, ArrayList arrayList, AbstractC1586x abstractC1586x2, l lVar) {
        AbstractC1586x abstractC1586x3;
        C2264J c2264j;
        C2265K c2265k;
        K kA = a() == this ? null : a();
        g gVar = new g(k(), getAnnotations(), e(), getVisibility(), this.f17384p, getName(), l(), kA, c(), this.f4297K, lVar);
        C2264J c2264j2 = this.f17382G;
        if (c2264j2 != null) {
            C2264J c2264j3 = new C2264J(gVar, c2264j2.getAnnotations(), c2264j2.e(), c2264j2.getVisibility(), c2264j2.f17358o, c2264j2.f17359p, c2264j2.f17362s, c(), kA == null ? null : kA.getGetter(), c2264j2.l());
            c2264j3.f17365v = c2264j2.f17365v;
            abstractC1586x3 = abstractC1586x2;
            c2264j3.f17395w = abstractC1586x3;
            c2264j = c2264j3;
        } else {
            abstractC1586x3 = abstractC1586x2;
            c2264j = null;
        }
        C2265K c2265k2 = this.f17383H;
        if (c2265k2 != null) {
            c2265k = new C2265K(gVar, c2265k2.getAnnotations(), c2265k2.e(), c2265k2.getVisibility(), c2265k2.f17358o, c2265k2.f17359p, c2265k2.f17362s, c(), kA == null ? null : kA.getSetter(), c2265k2.l());
            c2265k.f17365v = c2265k.f17365v;
            C2272S c2272s = (C2272S) c2265k2.m0().get(0);
            if (c2272s == null) {
                C2265K.s0(6);
                throw null;
            }
            c2265k.f17397w = c2272s;
        } else {
            c2265k = null;
        }
        gVar.R0(c2264j, c2265k, this.I, this.J);
        InterfaceC0821a interfaceC0821a = this.f17386r;
        if (interfaceC0821a != null) {
            gVar.S0(this.f17385q, interfaceC0821a);
        }
        gVar.W(m());
        gVar.U0(abstractC1586x3, getTypeParameters(), this.f17379D, abstractC1586x != null ? Z4.l.k(this, abstractC1586x, C2159g.a) : null, y.f7779k);
        return gVar;
    }

    @Override // x4.C2263I, u4.InterfaceC2096b
    public final Object a0(InterfaceC2095a interfaceC2095a) {
        l lVar = this.f4298L;
        if (lVar == null || !((InterfaceC2095a) lVar.f7528k).equals(interfaceC2095a)) {
            return null;
        }
        return lVar.f7529l;
    }

    @Override // x4.C2263I, u4.U
    public final boolean isConst() {
        AbstractC1586x type = getType();
        if (!this.f4297K) {
            return false;
        }
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, type);
        if (((!AbstractC1880i.F(type) && !AbstractC1891t.a(type)) || Y.e(type)) && !AbstractC1880i.G(type)) {
            return false;
        }
        i iVar = v.a;
        W4.c cVar = x.f3769p;
        kotlin.jvm.internal.l.e("ENHANCED_NULLABILITY_ANNOTATION", cVar);
        return !AbstractC1707g.x(type, cVar) || AbstractC1880i.G(type);
    }

    @Override // x4.C2263I
    public final void T0(AbstractC1586x abstractC1586x) {
    }
}
