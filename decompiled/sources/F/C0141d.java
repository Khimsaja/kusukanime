package F;

import h0.C0962G;

/* renamed from: F.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0141d extends kotlin.jvm.internal.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y f2012k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0141d(y yVar) {
        super(1, kotlin.jvm.internal.k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f2012k = yVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        float[] fArr = ((C0962G) obj).a;
        w0.r rVar = (w0.r) this.f2012k.f2042A.getValue();
        if (rVar != null) {
            if (!rVar.B()) {
                rVar = null;
            }
            if (rVar != null) {
                rVar.C(fArr);
            }
        }
        return O3.C.a;
    }
}
