package x4;

import h5.C1014c;
import h5.C1016e;
import h5.InterfaceC1015d;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n5.AbstractC1586x;
import n5.V;
import n5.b0;
import u4.AbstractC2108n;
import u4.InterfaceC2093I;
import u4.InterfaceC2096b;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import v4.C2159g;

/* renamed from: x4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2295v extends AbstractC2287n implements InterfaceC2093I {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f17504m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2105k f17505n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1015d f17506o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2295v(InterfaceC2099e interfaceC2099e) {
        super(C2159g.a, W4.g.f9629d);
        if (interfaceC2099e == null) {
            s0(0);
            throw null;
        }
        this.f17505n = interfaceC2099e;
        this.f17506o = new C1014c(interfaceC2099e);
    }

    public static /* synthetic */ void M0(int i7) {
        String str;
        int i8;
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 2:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i7) {
            case 3:
                objArr[2] = "substitute";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 1 || i7 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2) ? 2 : 3];
        if (i7 == 1 || i7 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i7 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i7 == 1) {
            objArr[1] = "getValue";
        } else if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void t0(int i7) {
        String str = (i7 == 7 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 7 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i7 == 7) {
            objArr[1] = "getValue";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i7) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 7 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // u4.InterfaceC2096b
    public final C2295v D() {
        return null;
    }

    @Override // u4.InterfaceC2096b
    public final boolean K() {
        return false;
    }

    public final InterfaceC1015d N0() {
        switch (this.f17504m) {
            case 0:
                C1014c c1014c = (C1014c) this.f17506o;
                if (c1014c != null) {
                    return c1014c;
                }
                s0(1);
                throw null;
            default:
                Q4.c cVar = (Q4.c) this.f17506o;
                if (cVar != null) {
                    return cVar;
                }
                t0(7);
                throw null;
        }
    }

    @Override // u4.O
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final C2295v b(V v5) {
        if (v5 == null) {
            M0(3);
            throw null;
        }
        if (!v5.a.e()) {
            AbstractC1586x abstractC1586xI = k() instanceof InterfaceC2099e ? v5.i(getType(), b0.f13392o) : v5.i(getType(), b0.f13390m);
            if (abstractC1586xI == null) {
                return null;
            }
            if (abstractC1586xI != getType()) {
                return new C2295v(k(), new C1016e(abstractC1586xI), getAnnotations());
            }
        }
        return this;
    }

    @Override // x4.AbstractC2287n, u4.InterfaceC2105k
    public final InterfaceC2096b a() {
        return this;
    }

    @Override // u4.InterfaceC2096b
    public final AbstractC1586x getReturnType() {
        return getType();
    }

    @Override // Q4.c, h5.InterfaceC1015d
    public final AbstractC1586x getType() {
        AbstractC1586x type = N0().getType();
        if (type != null) {
            return type;
        }
        M0(6);
        throw null;
    }

    @Override // u4.InterfaceC2096b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        M0(5);
        throw null;
    }

    @Override // u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = AbstractC2108n.f16323f;
        if (oVar != null) {
            return oVar;
        }
        M0(9);
        throw null;
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        switch (this.f17504m) {
            case 0:
                InterfaceC2099e interfaceC2099e = (InterfaceC2099e) this.f17505n;
                if (interfaceC2099e != null) {
                    return interfaceC2099e;
                }
                s0(2);
                throw null;
            default:
                InterfaceC2105k interfaceC2105k = this.f17505n;
                if (interfaceC2105k != null) {
                    return interfaceC2105k;
                }
                t0(8);
                throw null;
        }
    }

    @Override // u4.InterfaceC2106l
    public final u4.M l() {
        return u4.M.f16295i;
    }

    @Override // u4.InterfaceC2096b
    public final Collection m() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        M0(8);
        throw null;
    }

    @Override // u4.InterfaceC2096b
    public final List m0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        M0(7);
        throw null;
    }

    @Override // u4.InterfaceC2096b
    public final C2295v t() {
        return null;
    }

    @Override // x4.AbstractC2287n
    public String toString() {
        switch (this.f17504m) {
            case 0:
                return "class " + ((InterfaceC2099e) this.f17505n).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                kotlin.jvm.internal.l.f("descriptor", this);
                ((StringBuilder) obj).append(getName());
                return O3.C.a;
            default:
                return null;
        }
    }

    @Override // x4.AbstractC2287n, u4.InterfaceC2105k
    public final InterfaceC2105k a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2295v(InterfaceC2105k interfaceC2105k, Q4.c cVar, v4.h hVar) {
        this(interfaceC2105k, cVar, hVar, W4.g.f9629d);
        if (interfaceC2105k == null) {
            t0(0);
            throw null;
        }
        if (hVar != null) {
        } else {
            t0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2295v(InterfaceC2105k interfaceC2105k, Q4.c cVar, v4.h hVar, W4.e eVar) {
        super(hVar, eVar);
        if (interfaceC2105k == null) {
            t0(3);
            throw null;
        }
        if (hVar == null) {
            t0(5);
            throw null;
        }
        if (eVar != null) {
            this.f17505n = interfaceC2105k;
            this.f17506o = cVar;
            return;
        }
        t0(6);
        throw null;
    }
}
