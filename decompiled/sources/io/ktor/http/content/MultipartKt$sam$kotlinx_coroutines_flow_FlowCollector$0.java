package io.ktor.http.content;

import K5.InterfaceC0330i;
import e4.n;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0 implements InterfaceC0330i, g {
    private final /* synthetic */ n function;

    public MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0(n nVar) {
        l.f("function", nVar);
        this.function = nVar;
    }

    @Override // K5.InterfaceC0330i
    public final /* synthetic */ Object emit(Object obj, S3.c cVar) {
        return this.function.invoke(obj, cVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0330i) && (obj instanceof g)) {
            return l.a(getFunctionDelegate(), ((g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public final O3.e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
