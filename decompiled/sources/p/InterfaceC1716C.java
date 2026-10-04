package p;

/* renamed from: p.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1716C extends InterfaceC1760l {
    @Override // p.InterfaceC1760l
    default D0 a(B0 b02) {
        return new A2.b(this);
    }

    float b(long j7, float f5, float f7, float f8);

    float c(long j7, float f5, float f7, float f8);

    long d(float f5, float f7, float f8);

    default float e(float f5, float f7, float f8) {
        return c(d(f5, f7, f8), f5, f7, f8);
    }
}
