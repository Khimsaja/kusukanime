package Z5;

import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class G implements SerialDescriptor {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f10290b;

    /* renamed from: c, reason: collision with root package name */
    public final SerialDescriptor f10291c;

    public G(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.a = str;
        this.f10290b = serialDescriptor;
        this.f10291c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return X5.j.f9953j;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        Integer numU = AbstractC2517v.U(str);
        if (numU != null) {
            return numU.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g4 = (G) obj;
        return kotlin.jvm.internal.l.a(this.a, g4.a) && kotlin.jvm.internal.l.a(this.f10290b, g4.f10290b) && kotlin.jvm.internal.l.a(this.f10291c, g4.f10291c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return P3.y.f7779k;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f10291c.hashCode() + ((this.f10290b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        if (i7 >= 0) {
            return P3.y.f7779k;
        }
        throw new IllegalArgumentException(AbstractC0703b.m(AbstractC0703b.p(i7, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.m(AbstractC0703b.p(i7, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
        }
        int i8 = i7 % 2;
        if (i8 == 0) {
            return this.f10290b;
        }
        if (i8 == 1) {
            return this.f10291c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC0703b.m(AbstractC0703b.p(i7, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.a + '(' + this.f10290b + ", " + this.f10291c + ')';
    }
}
