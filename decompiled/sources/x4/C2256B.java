package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import m5.C1513b;
import n5.C1572i;
import o5.C1706f;
import u4.EnumC2100f;
import u4.EnumC2117x;
import v4.C2159g;

/* renamed from: x4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2256B extends AbstractC2284k {

    /* renamed from: q, reason: collision with root package name */
    public final EnumC2100f f17347q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC2117x f17348r;

    /* renamed from: s, reason: collision with root package name */
    public H4.o f17349s;

    /* renamed from: t, reason: collision with root package name */
    public C1572i f17350t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f17351u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f17352v;

    /* renamed from: w, reason: collision with root package name */
    public final C1513b f17353w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2256B(t4.n nVar, W4.e eVar, C1513b c1513b) {
        EnumC2100f enumC2100f = EnumC2100f.f16312l;
        u4.N n7 = u4.M.f16295i;
        if (c1513b == null) {
            S(4);
            throw null;
        }
        super(c1513b, nVar, eVar, n7);
        this.f17352v = new ArrayList();
        this.f17353w = c1513b;
        this.f17347q = enumC2100f;
    }

    public static /* synthetic */ void S(int i7) {
        String str;
        int i8;
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i8 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final EnumC2100f c() {
        EnumC2100f enumC2100f = this.f17347q;
        if (enumC2100f != null) {
            return enumC2100f;
        }
        S(8);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final g5.o c0() {
        return g5.n.f11759b;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w
    public final EnumC2117x e() {
        EnumC2117x enumC2117x = this.f17348r;
        if (enumC2117x != null) {
            return enumC2117x;
        }
        S(7);
        throw null;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return C2159g.a;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = this.f17349s;
        if (oVar != null) {
            return oVar;
        }
        S(10);
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
        ArrayList arrayList = this.f17351u;
        if (arrayList != null) {
            return arrayList;
        }
        S(15);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean p0() {
        return false;
    }

    @Override // x4.AbstractC2299z
    public final g5.o q(C1706f c1706f) {
        return g5.n.f11759b;
    }

    public final String toString() {
        return AbstractC2287n.L0(this);
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        C1572i c1572i = this.f17350t;
        if (c1572i != null) {
            return c1572i;
        }
        S(11);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final boolean x() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final Collection y() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        S(13);
        throw null;
    }
}
