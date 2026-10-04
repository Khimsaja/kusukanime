package androidx.compose.ui.input.key;

import a0.p;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import q0.e;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Ly0/S;", "Lq0/e;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class KeyInputElement extends S {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public final m f10665b;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(k kVar, k kVar2) {
        this.a = kVar;
        this.f10665b = (m) kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return l.a(this.a, keyInputElement.a) && l.a(this.f10665b, keyInputElement.f10665b);
    }

    @Override // y0.S
    public final p h() {
        e eVar = new e();
        eVar.f14676x = this.a;
        eVar.f14677y = this.f10665b;
        return eVar;
    }

    public final int hashCode() {
        k kVar = this.a;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        m mVar = this.f10665b;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    @Override // y0.S
    public final void m(p pVar) {
        e eVar = (e) pVar;
        eVar.f14676x = this.a;
        eVar.f14677y = this.f10665b;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.a + ", onPreKeyEvent=" + this.f10665b + ')';
    }
}
