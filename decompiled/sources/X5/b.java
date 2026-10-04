package X5;

import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1425d;

/* loaded from: classes.dex */
public final class b implements SerialDescriptor {
    public final g a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1425d f9925b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9926c;

    public b(g gVar, InterfaceC1425d interfaceC1425d) {
        l.f("kClass", interfaceC1425d);
        this.a = gVar;
        this.f9925b = interfaceC1425d;
        this.f9926c = gVar.a + '<' + interfaceC1425d.n() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return this.a.f9938b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        l.f(ContentDisposition.Parameters.Name, str);
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f9926c;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.a.equals(bVar.a) && l.a(bVar.f9925b, this.f9925b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.a.f9939c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        return this.a.f9942f[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.a.f9940d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f9926c.hashCode() + (this.f9925b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.a.f9944h[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.a.f9943g[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.a.f9945i[i7];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f9925b + ", original: " + this.a + ')';
    }
}
