package Z5;

import io.ktor.http.ContentDisposition;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class n0 implements SerialDescriptor, InterfaceC0643l {
    public final SerialDescriptor a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10346b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f10347c;

    public n0(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("original", serialDescriptor);
        this.a = serialDescriptor;
        this.f10346b = serialDescriptor.e() + '?';
        this.f10347c = AbstractC0632e0.b(serialDescriptor);
    }

    @Override // Z5.InterfaceC0643l
    public final Set a() {
        return this.f10347c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return this.a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f10346b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return kotlin.jvm.internal.l.a(this.a, ((n0) obj).a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.a.f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        return this.a.g(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.a.i(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.a.j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.a.k(i7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
