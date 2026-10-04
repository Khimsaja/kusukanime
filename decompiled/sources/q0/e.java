package q0;

import a0.p;
import android.view.KeyEvent;
import e4.k;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class e extends p implements d {

    /* renamed from: x, reason: collision with root package name */
    public k f14676x;

    /* renamed from: y, reason: collision with root package name */
    public m f14677y;

    @Override // q0.d
    public final boolean S(KeyEvent keyEvent) {
        k kVar = this.f14676x;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // q0.d
    public final boolean l(KeyEvent keyEvent) {
        ?? r02 = this.f14677y;
        if (r02 != 0) {
            return ((Boolean) r02.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
