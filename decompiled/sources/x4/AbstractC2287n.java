package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.GzipHeaderFlags;
import u4.InterfaceC2105k;

/* renamed from: x4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2287n extends Q4.c implements InterfaceC2105k {

    /* renamed from: l, reason: collision with root package name */
    public final W4.e f17445l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2287n(v4.h hVar, W4.e eVar) {
        super(hVar);
        if (hVar == null) {
            s0(0);
            throw null;
        }
        if (eVar == null) {
            s0(1);
            throw null;
        }
        this.f17445l = eVar;
    }

    public static String L0(InterfaceC2105k interfaceC2105k) {
        try {
            String str = Y4.h.f10164e.t(interfaceC2105k) + "[" + interfaceC2105k.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC2105k)) + "]";
            if (str != null) {
                return str;
            }
            s0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC2105k.getClass().getSimpleName() + ServerSentEventKt.SPACE + interfaceC2105k.getName();
            if (str2 != null) {
                return str2;
            }
            s0(6);
            throw null;
        }
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i7 == 2) {
            objArr[1] = "getName";
        } else if (i7 == 3) {
            objArr[1] = "getOriginal";
        } else if (i7 == 5 || i7 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i7 != 2 && i7 != 3) {
            if (i7 == 4) {
                objArr[2] = "toString";
            } else if (i7 != 5 && i7 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // u4.InterfaceC2105k
    public final W4.e getName() {
        W4.e eVar = this.f17445l;
        if (eVar != null) {
            return eVar;
        }
        s0(2);
        throw null;
    }

    public String toString() {
        return L0(this);
    }

    public InterfaceC2105k a() {
        return this;
    }
}
