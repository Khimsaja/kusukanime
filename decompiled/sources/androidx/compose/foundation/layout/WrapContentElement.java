package androidx.compose.foundation.layout;

import a0.p;
import b1.AbstractC0703b;
import e4.n;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p.AbstractC1755i;
import v.r0;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Ly0/S;", "Lv/r0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends S {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final m f10588b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10589c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i7, n nVar, Object obj) {
        this.a = i7;
        this.f10588b = (m) nVar;
        this.f10589c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.a == wrapContentElement.a && this.f10589c.equals(wrapContentElement.f10589c);
    }

    @Override // y0.S
    public final p h() {
        r0 r0Var = new r0();
        r0Var.f16506x = this.a;
        r0Var.f16507y = this.f10588b;
        return r0Var;
    }

    public final int hashCode() {
        return this.f10589c.hashCode() + AbstractC0703b.d(AbstractC1755i.b(this.a) * 31, 31, false);
    }

    @Override // y0.S
    public final void m(p pVar) {
        r0 r0Var = (r0) pVar;
        r0Var.f16506x = this.a;
        r0Var.f16507y = this.f10588b;
    }
}
