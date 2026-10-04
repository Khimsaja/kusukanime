package Z5;

import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class k0 implements SerialDescriptor {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final X5.f f10342b;

    public k0(String str, X5.f fVar) {
        kotlin.jvm.internal.l.f("kind", fVar);
        this.a = str;
        this.f10342b = fVar;
    }

    public final void a() {
        throw new IllegalStateException(AbstractC0703b.m(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return this.f10342b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.l.a(this.a, k0Var.a)) {
            if (kotlin.jvm.internal.l.a(this.f10342b, k0Var.f10342b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        a();
        throw null;
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
        return (this.f10342b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        a();
        throw null;
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
