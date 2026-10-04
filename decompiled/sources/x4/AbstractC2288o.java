package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;

/* renamed from: x4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2288o extends AbstractC2287n implements InterfaceC2106l {

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC2105k f17446m;

    /* renamed from: n, reason: collision with root package name */
    public final u4.M f17447n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2288o(InterfaceC2105k interfaceC2105k, v4.h hVar, W4.e eVar, u4.M m7) {
        super(hVar, eVar);
        if (interfaceC2105k == null) {
            s0(0);
            throw null;
        }
        if (hVar == null) {
            s0(1);
            throw null;
        }
        if (eVar == null) {
            s0(2);
            throw null;
        }
        if (m7 == null) {
            s0(3);
            throw null;
        }
        this.f17446m = interfaceC2105k;
        this.f17447n = m7;
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 4 || i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5 || i7 == 6) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getOriginal";
        } else if (i7 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i7 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 4 && i7 != 5 && i7 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public InterfaceC2105k k() {
        InterfaceC2105k interfaceC2105k = this.f17446m;
        if (interfaceC2105k != null) {
            return interfaceC2105k;
        }
        s0(5);
        throw null;
    }

    public u4.M l() {
        u4.M m7 = this.f17447n;
        if (m7 != null) {
            return m7;
        }
        s0(6);
        throw null;
    }

    @Override // x4.AbstractC2287n, u4.InterfaceC2105k
    /* renamed from: M0 */
    public InterfaceC2106l a() {
        return this;
    }
}
