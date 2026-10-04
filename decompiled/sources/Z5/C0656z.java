package Z5;

import e4.InterfaceC0821a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.AbstractC1420H;

/* renamed from: Z5.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656z extends C0636g0 {

    /* renamed from: l, reason: collision with root package name */
    public final X5.i f10374l;

    /* renamed from: m, reason: collision with root package name */
    public final O3.q f10375m;

    public C0656z(final String str, final int i7) {
        super(str, null, i7);
        this.f10374l = X5.i.f9950h;
        this.f10375m = z1.c.C(new InterfaceC0821a() { // from class: Z5.y
            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                int i8 = i7;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    serialDescriptorArr[i9] = AbstractC1420H.k(str + '.' + this.f10330e[i9], X5.j.f9954k, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            }
        });
    }

    @Override // Z5.C0636g0, kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return this.f10374l;
    }

    @Override // Z5.C0636g0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.c() != X5.i.f9950h) {
            return false;
        }
        return this.a.equals(serialDescriptor.e()) && kotlin.jvm.internal.l.a(AbstractC0632e0.b(this), AbstractC0632e0.b(serialDescriptor));
    }

    @Override // Z5.C0636g0
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        O3.t tVar = new O3.t(this);
        int iHashCode2 = 1;
        while (tVar.hasNext()) {
            int i7 = iHashCode2 * 31;
            String str = (String) tVar.next();
            iHashCode2 = i7 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // Z5.C0636g0, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return ((SerialDescriptor[]) this.f10375m.getValue())[i7];
    }

    @Override // Z5.C0636g0
    public final String toString() {
        return P3.q.y0(new P3.o(2, this), ", ", this.a.concat("("), ")", null, 56);
    }
}
