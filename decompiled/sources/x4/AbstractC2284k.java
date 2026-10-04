package x4;

import io.ktor.http.ContentDisposition;
import m5.C1523l;
import u4.InterfaceC2105k;

/* renamed from: x4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2284k extends AbstractC2275b {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2105k f17436o;

    /* renamed from: p, reason: collision with root package name */
    public final u4.M f17437p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2284k(C1523l c1523l, InterfaceC2105k interfaceC2105k, W4.e eVar, u4.M m7) {
        super(c1523l, eVar);
        if (c1523l == null) {
            S(0);
            throw null;
        }
        if (interfaceC2105k == null) {
            S(1);
            throw null;
        }
        if (eVar == null) {
            S(2);
            throw null;
        }
        this.f17436o = interfaceC2105k;
        this.f17437p = m7;
    }

    public static /* synthetic */ void S(int i7) {
        String str = (i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i7 == 2) {
            objArr[0] = ContentDisposition.Parameters.Name;
        } else if (i7 == 3) {
            objArr[0] = "source";
        } else if (i7 == 4 || i7 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 4 && i7 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean isExternal() {
        return false;
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        InterfaceC2105k interfaceC2105k = this.f17436o;
        if (interfaceC2105k != null) {
            return interfaceC2105k;
        }
        S(4);
        throw null;
    }

    @Override // u4.InterfaceC2106l
    public final u4.M l() {
        u4.M m7 = this.f17437p;
        if (m7 != null) {
            return m7;
        }
        S(5);
        throw null;
    }
}
