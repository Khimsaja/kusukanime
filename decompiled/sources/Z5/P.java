package Z5;

import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class P implements SerialDescriptor {
    public final SerialDescriptor a;

    public P(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return X5.j.f9952i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        Integer numU = AbstractC2517v.U(str);
        if (numU != null) {
            return numU.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p7 = (P) obj;
        return kotlin.jvm.internal.l.a(this.a, p7.a) && kotlin.jvm.internal.l.a(e(), p7.e());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 1;
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
        return e().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        if (i7 >= 0) {
            return P3.y.f7779k;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Illegal index ", ", ");
        sbP.append(e());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        if (i7 >= 0) {
            return this.a;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Illegal index ", ", ");
        sbP.append(e());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        if (i7 >= 0) {
            return false;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Illegal index ", ", ");
        sbP.append(e());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public final String toString() {
        return e() + '(' + this.a + ')';
    }
}
