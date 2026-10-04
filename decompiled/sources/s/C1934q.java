package s;

/* renamed from: s.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1934q implements InterfaceC1911e0 {
    public final /* synthetic */ r a;

    public C1934q(r rVar) {
        this.a = rVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // s.InterfaceC1911e0
    public final float a(float f5) {
        if (Float.isNaN(f5)) {
            return 0.0f;
        }
        r rVar = this.a;
        float fFloatValue = ((Number) rVar.a.invoke(Float.valueOf(f5))).floatValue();
        rVar.f15374e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        rVar.f15375f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
