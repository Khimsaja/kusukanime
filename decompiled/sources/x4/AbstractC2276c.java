package x4;

import io.ktor.http.ContentDisposition;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.GzipHeaderFlags;
import m5.C1523l;
import n5.b0;
import u4.InterfaceC2105k;

/* renamed from: x4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2276c extends AbstractC2282i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2276c(C1523l c1523l, InterfaceC2105k interfaceC2105k, v4.h hVar, W4.e eVar, b0 b0Var, boolean z7, int i7, u4.N n7) {
        super(c1523l, interfaceC2105k, hVar, eVar, b0Var, z7, i7, n7);
        if (c1523l == null) {
            s0(0);
            throw null;
        }
        if (interfaceC2105k == null) {
            s0(1);
            throw null;
        }
        if (n7 != null) {
        } else {
            s0(6);
            throw null;
        }
    }

    public static /* synthetic */ void s0(int i7) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // x4.AbstractC2287n
    public final String toString() {
        String str = "";
        String str2 = this.f17430p ? "reified " : "";
        if (R() != b0.f13390m) {
            str = R() + ServerSentEventKt.SPACE;
        }
        return str2 + str + getName();
    }
}
