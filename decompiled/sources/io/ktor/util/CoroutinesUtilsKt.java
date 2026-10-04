package io.ktor.util;

import H5.C0282x;
import H5.InterfaceC0265f0;
import H5.v0;
import P3.F;
import S3.h;
import io.ktor.sse.ServerSentEventKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LH5/f0;", "", "offset", "LO3/C;", "printDebugTree", "(LH5/f0;I)V", "parent", "LS3/h;", "SilentSupervisor", "(LH5/f0;)LS3/h;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoroutinesUtilsKt {
    public static final h SilentSupervisor(InterfaceC0265f0 interfaceC0265f0) {
        return F.M(new v0(interfaceC0265f0), new CoroutinesUtilsKt$SilentSupervisor$$inlined$CoroutineExceptionHandler$1(C0282x.f3887k));
    }

    public static /* synthetic */ h SilentSupervisor$default(InterfaceC0265f0 interfaceC0265f0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC0265f0 = null;
        }
        return SilentSupervisor(interfaceC0265f0);
    }

    public static final void printDebugTree(InterfaceC0265f0 interfaceC0265f0, int i7) {
        l.f("<this>", interfaceC0265f0);
        System.out.println((Object) (AbstractC2517v.P(i7, ServerSentEventKt.SPACE) + interfaceC0265f0));
        Iterator it = interfaceC0265f0.s().iterator();
        while (it.hasNext()) {
            printDebugTree((InterfaceC0265f0) it.next(), i7 + 2);
        }
        if (i7 == 0) {
            System.out.println();
        }
    }

    public static /* synthetic */ void printDebugTree$default(InterfaceC0265f0 interfaceC0265f0, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        printDebugTree(interfaceC0265f0, i7);
    }
}
