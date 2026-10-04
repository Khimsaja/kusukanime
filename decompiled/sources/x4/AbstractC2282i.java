package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import m5.C1520i;
import m5.C1523l;
import m5.InterfaceC1526o;
import n5.b0;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;

/* renamed from: x4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2282i extends AbstractC2288o implements u4.Q {

    /* renamed from: o, reason: collision with root package name */
    public final b0 f17429o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17430p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17431q;

    /* renamed from: r, reason: collision with root package name */
    public final C1520i f17432r;

    /* renamed from: s, reason: collision with root package name */
    public final C1520i f17433s;

    /* renamed from: t, reason: collision with root package name */
    public final C1523l f17434t;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC2282i(InterfaceC1526o interfaceC1526o, InterfaceC2105k interfaceC2105k, v4.h hVar, W4.e eVar, b0 b0Var, boolean z7, int i7, u4.N n7) {
        u4.N n8 = u4.M.f16295i;
        if (interfaceC1526o == null) {
            s0(0);
            throw null;
        }
        if (interfaceC2105k == null) {
            s0(1);
            throw null;
        }
        if (hVar == null) {
            s0(2);
            throw null;
        }
        if (eVar == null) {
            s0(3);
            throw null;
        }
        if (b0Var == null) {
            s0(4);
            throw null;
        }
        if (n7 == null) {
            s0(6);
            throw null;
        }
        super(interfaceC2105k, hVar, eVar, n8);
        this.f17429o = b0Var;
        this.f17430p = z7;
        this.f17431q = i7;
        A3.p pVar = new A3.p(this, interfaceC1526o, n7);
        C1523l c1523l = (C1523l) interfaceC1526o;
        this.f17432r = new C1520i(c1523l, pVar);
        this.f17433s = new C1520i(c1523l, new A3.q(27, this, eVar, false));
        this.f17434t = c1523l;
    }

    public static /* synthetic */ void s0(int i7) {
        String str;
        int i8;
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i7) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // u4.Q
    public final boolean I() {
        return false;
    }

    @Override // u4.Q
    public final boolean J() {
        return this.f17430p;
    }

    public abstract List O0();

    @Override // u4.Q
    public final b0 R() {
        b0 b0Var = this.f17429o;
        if (b0Var != null) {
            return b0Var;
        }
        s0(7);
        throw null;
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    public final InterfaceC2102h a() {
        return this;
    }

    @Override // u4.InterfaceC2102h
    public final n5.B g() {
        n5.B b4 = (n5.B) this.f17433s.invoke();
        if (b4 != null) {
            return b4;
        }
        s0(10);
        throw null;
    }

    @Override // u4.Q
    public final int getIndex() {
        return this.f17431q;
    }

    @Override // u4.Q
    public final List getUpperBounds() {
        List listG = ((C2281h) v()).g();
        if (listG != null) {
            return listG;
        }
        s0(8);
        throw null;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                ((Y4.h) yVar.f9916l).X(this, (StringBuilder) obj, true);
                return O3.C.a;
            default:
                return null;
        }
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        n5.M m7 = (n5.M) this.f17432r.invoke();
        if (m7 != null) {
            return m7;
        }
        s0(9);
        throw null;
    }

    @Override // u4.Q
    public final InterfaceC1526o w() {
        C1523l c1523l = this.f17434t;
        if (c1523l != null) {
            return c1523l;
        }
        s0(14);
        throw null;
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    public final InterfaceC2105k a() {
        return this;
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    public final u4.Q a() {
        return this;
    }

    @Override // x4.AbstractC2288o
    /* renamed from: M0 */
    public final InterfaceC2106l a() {
        return this;
    }

    public List N0(List list) {
        return list;
    }
}
