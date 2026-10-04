package a6;

import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class n implements SerialDescriptor {
    public final O3.q a;

    public n(InterfaceC0821a interfaceC0821a) {
        this.a = z1.c.C(interfaceC0821a);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return a().c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        return a().d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return a().e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return a().f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        return a().g(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return P3.y.f7779k;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return a().i(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return a().j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return a().k(i7);
    }
}
