package Z5;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class I extends C0636g0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10297l;

    public I(String str, J j7) {
        super(str, j7, 1);
        this.f10297l = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [O3.i, java.lang.Object] */
    @Override // Z5.C0636g0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.e())) {
                I i7 = (I) obj;
                if (i7.f10297l && Arrays.equals((SerialDescriptor[]) this.f10335j.getValue(), (SerialDescriptor[]) i7.f10335j.getValue())) {
                    int iF = serialDescriptor.f();
                    int i8 = this.f10328c;
                    if (i8 == iF) {
                        for (int i9 = 0; i9 < i8; i9++) {
                            if (kotlin.jvm.internal.l.a(j(i9).e(), serialDescriptor.j(i9).e()) && kotlin.jvm.internal.l.a(j(i9).c(), serialDescriptor.j(i9).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // Z5.C0636g0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // Z5.C0636g0, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f10297l;
    }
}
