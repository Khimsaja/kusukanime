package F;

import K5.InterfaceC0330i;
import android.os.Build;
import android.view.View;
import z0.C2480y0;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139b implements InterfaceC0330i {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2007k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2008l;

    public /* synthetic */ C0139b(int i7, Object obj) {
        this.f2007k = i7;
        this.f2008l = obj;
    }

    @Override // K5.InterfaceC0330i
    public final Object emit(Object obj, S3.c cVar) {
        switch (this.f2007k) {
            case 0:
                w wVar = (w) this.f2008l;
                if (Build.VERSION.SDK_INT >= 34) {
                    k.a.a(wVar.x(), (View) wVar.f2037l);
                }
                return O3.C.a;
            case 1:
                ((kotlin.jvm.internal.x) this.f2008l).f12720k = obj;
                throw new L5.a(this);
            default:
                ((C2480y0) this.f2008l).f18943k.g(((Number) obj).floatValue());
                return O3.C.a;
        }
    }
}
