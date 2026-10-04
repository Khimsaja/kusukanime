package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import m5.C1523l;
import n5.C1572i;
import o5.C1706f;
import u4.AbstractC2108n;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2105k;
import v4.C2159g;

/* renamed from: x4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2285l extends AbstractC2284k {

    /* renamed from: q, reason: collision with root package name */
    public final EnumC2117x f17438q;

    /* renamed from: r, reason: collision with root package name */
    public final EnumC2100f f17439r;

    /* renamed from: s, reason: collision with root package name */
    public final C1572i f17440s;

    /* renamed from: t, reason: collision with root package name */
    public g5.o f17441t;

    /* renamed from: u, reason: collision with root package name */
    public Set f17442u;

    /* renamed from: v, reason: collision with root package name */
    public C2283j f17443v;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2285l(InterfaceC2105k interfaceC2105k, W4.e eVar, EnumC2117x enumC2117x, EnumC2100f enumC2100f, List list, C1523l c1523l) {
        u4.N n7 = u4.M.f16295i;
        if (interfaceC2105k == null) {
            S(0);
            throw null;
        }
        if (eVar == null) {
            S(1);
            throw null;
        }
        if (c1523l == null) {
            S(6);
            throw null;
        }
        super(c1523l, interfaceC2105k, eVar, n7);
        this.f17438q = enumC2117x;
        this.f17439r = enumC2100f;
        this.f17440s = new C1572i(this, Collections.EMPTY_LIST, list, c1523l);
    }

    public static /* synthetic */ void S(int i7) {
        String str;
        int i8;
        switch (i7) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i8 = 2;
                break;
            case 12:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 1:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i7) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // u4.InterfaceC2099e
    public final boolean E() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final u4.S Z() {
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final C2283j b0() {
        return this.f17443v;
    }

    @Override // u4.InterfaceC2099e
    public final EnumC2100f c() {
        EnumC2100f enumC2100f = this.f17439r;
        if (enumC2100f != null) {
            return enumC2100f;
        }
        S(15);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final g5.o c0() {
        return g5.n.f11759b;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w
    public final EnumC2117x e() {
        EnumC2117x enumC2117x = this.f17438q;
        if (enumC2117x != null) {
            return enumC2117x;
        }
        S(16);
        throw null;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return C2159g.a;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = AbstractC2108n.f16322e;
        if (oVar != null) {
            return oVar;
        }
        S(17);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean i() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final boolean isInline() {
        return false;
    }

    @Override // u4.InterfaceC2103i
    public final boolean j() {
        return false;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2103i
    public final List n() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        S(18);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean p0() {
        return false;
    }

    @Override // x4.AbstractC2299z
    public final g5.o q(C1706f c1706f) {
        g5.o oVar = this.f17441t;
        if (oVar != null) {
            return oVar;
        }
        S(13);
        throw null;
    }

    public final void q0(g5.o oVar, Set set, C2283j c2283j) {
        this.f17441t = oVar;
        this.f17442u = set;
        this.f17443v = c2283j;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        C1572i c1572i = this.f17440s;
        if (c1572i != null) {
            return c1572i;
        }
        S(10);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean x() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final Collection y() {
        Set set = this.f17442u;
        if (set != null) {
            return set;
        }
        S(11);
        throw null;
    }
}
