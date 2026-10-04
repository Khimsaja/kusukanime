package Z5;

import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class Z implements SerialDescriptor {
    public static final Z a = new Z();

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return X5.j.f9954k;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return "kotlin.Nothing";
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return (X5.j.f9954k.hashCode() * 31) - 1818355776;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
