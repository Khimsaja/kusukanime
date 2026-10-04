package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m5.C1520i;
import m5.C1523l;
import n5.C1572i;
import o5.C1706f;
import u4.AbstractC2108n;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2099e;

/* renamed from: x4.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2291r extends AbstractC2284k {

    /* renamed from: q, reason: collision with root package name */
    public final C1572i f17454q;

    /* renamed from: r, reason: collision with root package name */
    public final C2290q f17455r;

    /* renamed from: s, reason: collision with root package name */
    public final C1520i f17456s;

    /* renamed from: t, reason: collision with root package name */
    public final v4.h f17457t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2291r(C1523l c1523l, InterfaceC2099e interfaceC2099e, n5.B b4, W4.e eVar, C1520i c1520i, v4.h hVar, u4.M m7) {
        super(c1523l, interfaceC2099e, eVar, m7);
        if (c1523l == null) {
            S(6);
            throw null;
        }
        if (interfaceC2099e == null) {
            S(7);
            throw null;
        }
        if (b4 == null) {
            S(8);
            throw null;
        }
        if (eVar == null) {
            S(9);
            throw null;
        }
        if (c1520i == null) {
            S(10);
            throw null;
        }
        this.f17457t = hVar;
        this.f17454q = new C1572i(this, Collections.EMPTY_LIST, Collections.singleton(b4), c1523l);
        this.f17455r = new C2290q(this, c1523l);
        this.f17456s = c1520i;
    }

    public static /* synthetic */ void S(int i7) {
        String str;
        int i8;
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i7) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i7) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C2291r q0(C1523l c1523l, InterfaceC2099e interfaceC2099e, W4.e eVar, C1520i c1520i, v4.h hVar, u4.M m7) {
        if (c1523l == null) {
            S(0);
            throw null;
        }
        if (interfaceC2099e == null) {
            S(1);
            throw null;
        }
        if (eVar == null) {
            S(2);
            throw null;
        }
        if (c1520i != null) {
            return new C2291r(c1523l, interfaceC2099e, interfaceC2099e.g(), eVar, c1520i, hVar, m7);
        }
        S(3);
        throw null;
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
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final EnumC2100f c() {
        return EnumC2100f.f16314n;
    }

    @Override // u4.InterfaceC2099e
    public final g5.o c0() {
        return g5.n.f11759b;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w
    public final EnumC2117x e() {
        return EnumC2117x.f16342l;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        v4.h hVar = this.f17457t;
        if (hVar != null) {
            return hVar;
        }
        S(21);
        throw null;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = AbstractC2108n.f16322e;
        if (oVar != null) {
            return oVar;
        }
        S(20);
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
        S(22);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean p0() {
        return false;
    }

    @Override // x4.AbstractC2299z
    public final g5.o q(C1706f c1706f) {
        C2290q c2290q = this.f17455r;
        if (c2290q != null) {
            return c2290q;
        }
        S(14);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        C1572i c1572i = this.f17454q;
        if (c1572i != null) {
            return c1572i;
        }
        S(17);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean x() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final Collection y() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        S(16);
        throw null;
    }
}
