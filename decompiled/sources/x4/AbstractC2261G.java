package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n5.V;
import u4.EnumC2117x;
import u4.InterfaceC2094J;
import u4.InterfaceC2095a;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2106l;
import u4.InterfaceC2112s;

/* renamed from: x4.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2261G extends AbstractC2288o implements InterfaceC2094J {

    /* renamed from: o, reason: collision with root package name */
    public boolean f17358o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17359p;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC2117x f17360q;

    /* renamed from: r, reason: collision with root package name */
    public final u4.K f17361r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17362s;

    /* renamed from: t, reason: collision with root package name */
    public final int f17363t;

    /* renamed from: u, reason: collision with root package name */
    public H4.o f17364u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC2112s f17365v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2261G(EnumC2117x enumC2117x, H4.o oVar, u4.K k7, v4.h hVar, W4.e eVar, boolean z7, boolean z8, boolean z9, int i7, u4.M m7) {
        super(k7.k(), hVar, eVar, m7);
        if (enumC2117x == null) {
            s0(0);
            throw null;
        }
        if (oVar == null) {
            s0(1);
            throw null;
        }
        if (hVar == null) {
            s0(3);
            throw null;
        }
        if (m7 == null) {
            s0(5);
            throw null;
        }
        this.f17365v = null;
        this.f17360q = enumC2117x;
        this.f17364u = oVar;
        this.f17361r = k7;
        this.f17358o = z7;
        this.f17359p = z8;
        this.f17362s = z9;
        this.f17363t = i7;
    }

    public static /* synthetic */ void s0(int i7) {
        String str;
        int i8;
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i8 = 2;
                break;
            case 7:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i7) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // u4.InterfaceC2096b
    public final C2295v D() {
        return N0().D();
    }

    @Override // u4.InterfaceC2096b
    public final boolean K() {
        return false;
    }

    @Override // u4.InterfaceC2096b
    public final List M() {
        List listM = N0().M();
        if (listM != null) {
            return listM;
        }
        s0(14);
        throw null;
    }

    public final u4.K N0() {
        u4.K k7 = this.f17361r;
        if (k7 != null) {
            return k7;
        }
        s0(13);
        throw null;
    }

    public final ArrayList O0(boolean z7) {
        ArrayList arrayList = new ArrayList(0);
        for (u4.K k7 : N0().m()) {
            y1.L getter = z7 ? k7.getGetter() : k7.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return false;
    }

    @Override // u4.InterfaceC2112s
    public final boolean V() {
        return false;
    }

    @Override // u4.InterfaceC2097c
    public final void W(Collection collection) {
        if (collection != null) {
            return;
        }
        s0(16);
        throw null;
    }

    @Override // u4.InterfaceC2112s
    public final boolean X() {
        return false;
    }

    @Override // u4.InterfaceC2096b
    public final Object a0(InterfaceC2095a interfaceC2095a) {
        return null;
    }

    @Override // u4.InterfaceC2112s, u4.O
    public final InterfaceC2112s b(V v5) {
        if (v5 != null) {
            return this;
        }
        s0(7);
        throw null;
    }

    @Override // u4.InterfaceC2097c
    public final int c() {
        int i7 = this.f17363t;
        if (i7 != 0) {
            return i7;
        }
        s0(6);
        throw null;
    }

    @Override // u4.InterfaceC2116w
    public final EnumC2117x e() {
        EnumC2117x enumC2117x = this.f17360q;
        if (enumC2117x != null) {
            return enumC2117x;
        }
        s0(10);
        throw null;
    }

    @Override // u4.InterfaceC2112s
    public final boolean e0() {
        return false;
    }

    @Override // u4.InterfaceC2096b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(9);
        throw null;
    }

    @Override // u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = this.f17364u;
        if (oVar != null) {
            return oVar;
        }
        s0(11);
        throw null;
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean isExternal() {
        return this.f17359p;
    }

    @Override // u4.InterfaceC2112s
    public final boolean isInfix() {
        return false;
    }

    @Override // u4.InterfaceC2112s
    public final boolean isInline() {
        return this.f17362s;
    }

    @Override // u4.InterfaceC2112s
    public final boolean isOperator() {
        return false;
    }

    @Override // u4.InterfaceC2112s
    public final boolean isSuspend() {
        return false;
    }

    @Override // u4.InterfaceC2112s
    public final InterfaceC2112s s() {
        return this.f17365v;
    }

    @Override // u4.InterfaceC2096b
    public final C2295v t() {
        return N0().t();
    }

    @Override // u4.InterfaceC2097c
    public final InterfaceC2097c z(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, H4.o oVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // u4.O
    public final /* bridge */ /* synthetic */ InterfaceC2106l b(V v5) {
        b(v5);
        return this;
    }
}
