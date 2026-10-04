package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1586x;
import u4.InterfaceC2105k;
import u4.U;

/* renamed from: x4.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2273T extends AbstractC2288o implements U {

    /* renamed from: o, reason: collision with root package name */
    public AbstractC1586x f17414o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2273T(InterfaceC2105k interfaceC2105k, v4.h hVar, W4.e eVar, AbstractC1586x abstractC1586x, u4.M m7) {
        super(interfaceC2105k, hVar, eVar, m7);
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
        this.f17414o = abstractC1586x;
    }

    public static /* synthetic */ void s0(int i7) {
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
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public C2295v D() {
        return null;
    }

    public boolean K() {
        return false;
    }

    public AbstractC1586x getReturnType() {
        AbstractC1586x type = getType();
        if (type != null) {
            return type;
        }
        s0(10);
        throw null;
    }

    @Override // Q4.c, h5.InterfaceC1015d
    public final AbstractC1586x getType() {
        AbstractC1586x abstractC1586x = this.f17414o;
        if (abstractC1586x != null) {
            return abstractC1586x;
        }
        s0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(8);
        throw null;
    }

    @Override // u4.InterfaceC2096b
    public final List m0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(6);
        throw null;
    }

    public C2295v t() {
        return null;
    }
}
