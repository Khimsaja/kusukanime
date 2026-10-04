package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.Collections;
import java.util.List;
import m5.C1520i;
import m5.C1523l;
import n5.V;
import o5.C1706f;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;

/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2275b extends AbstractC2299z {

    /* renamed from: k, reason: collision with root package name */
    public final W4.e f17417k;

    /* renamed from: l, reason: collision with root package name */
    public final C1520i f17418l;

    /* renamed from: m, reason: collision with root package name */
    public final C1520i f17419m;

    /* renamed from: n, reason: collision with root package name */
    public final C1520i f17420n;

    public AbstractC2275b(C1523l c1523l, W4.e eVar) {
        if (c1523l == null) {
            S(0);
            throw null;
        }
        if (eVar == null) {
            S(1);
            throw null;
        }
        this.f17417k = eVar;
        this.f17418l = new C1520i(c1523l, new C2274a(this, 0));
        this.f17419m = new C1520i(c1523l, new C2274a(this, 1));
        this.f17420n = new C1520i(c1523l, new C2274a(this, 2));
    }

    public static /* synthetic */ void S(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16 || i7 == 17 || i7 == 19 || i7 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16 || i7 == 17 || i7 == 19 || i7 == 20) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 2:
            case 3:
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 2) {
            objArr[1] = "getName";
        } else if (i7 == 3) {
            objArr[1] = "getOriginal";
        } else if (i7 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i7 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i7 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i7 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i7 == 19) {
            objArr[1] = "substitute";
        } else if (i7 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i7) {
            case 2:
            case 3:
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 9 && i7 != 12 && i7 != 14 && i7 != 16 && i7 != 17 && i7 != 19 && i7 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // u4.InterfaceC2099e
    public final g5.o N(n5.T t7) {
        d5.e.i(Z4.e.d(this));
        g5.o oVarF = f(t7, C1706f.a);
        if (oVarF != null) {
            return oVarF;
        }
        S(16);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public g5.o Y() {
        g5.o oVar = (g5.o) this.f17419m.invoke();
        if (oVar != null) {
            return oVar;
        }
        S(4);
        throw null;
    }

    @Override // x4.AbstractC2299z, u4.InterfaceC2099e, u4.InterfaceC2105k
    public final InterfaceC2102h a() {
        return this;
    }

    @Override // x4.AbstractC2299z
    public g5.o f(n5.T t7, C1706f c1706f) {
        if (!t7.e()) {
            return new g5.t(q(c1706f), new V(t7));
        }
        g5.o oVarQ = q(c1706f);
        if (oVarQ != null) {
            return oVarQ;
        }
        S(12);
        throw null;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2102h
    public final n5.B g() {
        n5.B b4 = (n5.B) this.f17418l.invoke();
        if (b4 != null) {
            return b4;
        }
        S(20);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public g5.o g0() {
        d5.e.i(Z4.e.d(this));
        g5.o oVarQ = q(C1706f.a);
        if (oVarQ != null) {
            return oVarQ;
        }
        S(17);
        throw null;
    }

    @Override // u4.InterfaceC2105k
    public final W4.e getName() {
        W4.e eVar = this.f17417k;
        if (eVar != null) {
            return eVar;
        }
        S(2);
        throw null;
    }

    @Override // u4.O
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public InterfaceC2099e b(V v5) {
        if (v5 != null) {
            return v5.a.e() ? this : new C2298y(this, v5);
        }
        S(18);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public List l0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        S(6);
        throw null;
    }

    @Override // u4.InterfaceC2099e
    public final C2295v r0() {
        C2295v c2295v = (C2295v) this.f17420n.invoke();
        if (c2295v != null) {
            return c2295v;
        }
        S(5);
        throw null;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        return yVar.H(this, obj);
    }

    @Override // x4.AbstractC2299z, u4.InterfaceC2105k
    public final InterfaceC2105k a() {
        return this;
    }

    @Override // x4.AbstractC2299z, u4.InterfaceC2099e, u4.InterfaceC2105k
    public final InterfaceC2099e a() {
        return this;
    }
}
